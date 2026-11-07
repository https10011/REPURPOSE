<?php
/**
 * POST /api/auth/otp/request — issue a locally generated 6-digit code.
 *
 * The addendum replaces SMS with an in-app notification: the code is returned to this client so it
 * can raise the notification itself (and is stored server-side for the verification the addendum
 * requires). No external gateway is involved.
 *
 * Body: { phone, purpose? = register }
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$phone = Auth::normalizePhone(Http::inputString('phone', 32));
$purpose = Http::inputString('purpose', 16) ?? 'register';
if ($phone === null) {
    Http::fail('invalid_phone', 'Enter a valid phone number.', 422);
}
if (!in_array($purpose, ['register', 'login', 'reset'], true)) {
    Http::fail('invalid_purpose', 'Unknown verification purpose.', 422);
}

if (!Auth::allow('otp:phone:' . $phone, 5, 600) || !Auth::allow('otp:ip:' . Http::clientIp(), 20, 600)) {
    Auth::tooMany(600);
}

$code = Auth::issueOtp($phone, $purpose);

Http::ok([
    'phone'        => $phone,
    'phonePretty'  => Auth::formatPhone($phone),
    'code'         => $code,
    'expiresInSec' => (int) (Db::setting('otp_ttl_seconds', '600') ?? 600),
    'channel'      => 'in_app_notification',
]);
