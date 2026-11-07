<?php
/**
 * POST /api/auth/register — create a local account (directive §17.5).
 *
 * Body: { name, phone, password, passwordConfirm? }
 * Requires a verified OTP for the phone: the client requests one first (POST /api/auth/otp/request)
 * and then calls /api/auth/otp/verify with the code, which finishes the sign-up and starts the
 * session. Registration itself only persists the account.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$name = Http::inputString('name', 64);
$phoneRaw = Http::inputString('phone', 32);
$password = (string) (Http::input('password', '') ?? '');
$confirm = (string) (Http::input('passwordConfirm', '') ?? '');

if ($name === null || mb_strlen($name) < 2) {
    Http::fail('invalid_name', 'Enter your name (at least 2 characters).', 422);
}
$phone = Auth::normalizePhone($phoneRaw);
if ($phone === null) {
    Http::fail('invalid_phone', 'Enter a valid phone number.', 422);
}
if (strlen($password) < 8) {
    Http::fail('weak_password', 'Password must be at least 8 characters.', 422);
}
if (strlen($password) > 72) {
    Http::fail('weak_password', 'Password must be at most 72 characters.', 422);
}
if ($confirm !== '' && !hash_equals($password, $confirm)) {
    Http::fail('password_mismatch', 'The passwords do not match.', 422);
}
if (!Auth::allow('register:ip:' . Http::clientIp(), 10, 3600)) {
    Auth::tooMany(600);
}

$existing = Db::fetch('SELECT id FROM users WHERE phone = ?', [$phone]);
if ($existing !== null) {
    Http::fail('phone_taken', 'That phone number already has an account.', 409);
}

Db::execute(
    'INSERT INTO users (name, phone, password_hash) VALUES (?, ?, ?)',
    [$name, $phone, password_hash($password, PASSWORD_DEFAULT)]
);
$userId = (int) Db::pdo()->lastInsertId();

// Every account gets its wallet immediately, so the home screen never has to create one.
Wallet::forUser($userId);

$code = Auth::issueOtp($phone, 'register');

Http::ok([
    'userId'      => $userId,
    'phone'       => $phone,
    'phonePretty' => Auth::formatPhone($phone),
    'otpRequired' => true,
    'otp'         => [
        'code'         => $code,
        'expiresInSec' => (int) (Db::setting('otp_ttl_seconds', '600') ?? 600),
        'channel'      => 'in_app_notification',
    ],
]);
