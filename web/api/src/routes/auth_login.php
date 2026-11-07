<?php
/**
 * POST /api/auth/login — phone + password sign-in.
 *
 * Unknown phone, wrong password and blocked account all return the same 401 so the endpoint does
 * not reveal which phone numbers are registered.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$phone = Auth::normalizePhone(Http::inputString('phone', 32));
$password = (string) (Http::input('password', '') ?? '');

if ($phone === null || $password === '') {
    Http::fail('invalid_credentials', 'Enter your phone number and password.', 422);
}

if (!Auth::allow('login:phone:' . $phone, 10, 900) || !Auth::allow('login:ip:' . Http::clientIp(), 30, 900)) {
    Auth::tooMany(900);
}

$user = Db::fetch('SELECT id, name, phone, password_hash, status FROM users WHERE phone = ?', [$phone]);
if ($user === null || !password_verify($password, (string) $user['password_hash']) || $user['status'] !== 'active') {
    Http::fail('invalid_credentials', 'Phone number or password is incorrect.', 401);
}

if (password_needs_rehash((string) $user['password_hash'], PASSWORD_DEFAULT)) {
    Db::execute('UPDATE users SET password_hash = ? WHERE id = ?', [password_hash($password, PASSWORD_DEFAULT), (int) $user['id']]);
}

Db::execute('UPDATE users SET last_login_at = UTC_TIMESTAMP() WHERE id = ?', [(int) $user['id']]);
Auth::startSession((int) $user['id']);

$full = Db::fetch(
    'SELECT id, name, phone, phone_verified, status, created_at, last_login_at FROM users WHERE id = ?',
    [(int) $user['id']]
);
$full['wallet'] = Wallet::forUser((int) $user['id']);

Http::ok(['user' => Auth::publicUser($full)]);
