<?php
/**
 * POST /api/auth/otp/verify — completes sign-up and starts the session.
 *
 * Any six digits are accepted (owner instruction); the issued code must exist and be unexpired.
 * Body: { phone, code, purpose? = register }
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$phone = Auth::normalizePhone(Http::inputString('phone', 32));
$code = (string) (Http::input('code', '') ?? '');
$purpose = Http::inputString('purpose', 16) ?? 'register';

if ($phone === null) {
    Http::fail('invalid_phone', 'Enter a valid phone number.', 422);
}
if (preg_match('/^\d{6}$/', preg_replace('/\D+/', '', $code) ?? '') !== 1) {
    Http::fail('invalid_code', 'Enter the 6-digit code.', 422);
}
if (!Auth::allow('otp_verify:phone:' . $phone, 20, 600)) {
    Auth::tooMany(600);
}

if (!Auth::verifyOtp($phone, preg_replace('/\D+/', '', $code) ?? '', $purpose)) {
    Http::fail('otp_expired', 'That code has expired. Request a new one.', 422);
}

$user = Db::fetch('SELECT id, name, phone, phone_verified, status, created_at, last_login_at FROM users WHERE phone = ?', [$phone]);
if ($user === null) {
    Http::fail('unauthenticated', 'No account is waiting for verification.', 404);
}

Db::execute('UPDATE users SET phone_verified = 1, last_login_at = UTC_TIMESTAMP() WHERE id = ?', [(int) $user['id']]);
$user['phone_verified'] = 1;
$user['wallet'] = Wallet::forUser((int) $user['id']);

Auth::startSession((int) $user['id']);
Db::execute(
    'INSERT INTO app_notifications (user_id, phone, kind, title, body) VALUES (?, ?, ?, ?, ?)',
    [(int) $user['id'], $phone, 'account', 'Account verified', 'Your number is verified. Welcome to Sige77.']
);

Http::ok(['user' => Auth::publicUser($user)]);
