<?php
/**
 * POST /api/push/subscribe — Web Push subscription storage.
 *
 * The APK registers an FCM token (gs0.generateFcmToken -> FirebaseMessaging) and receives
 * messages through MyFirebaseMessagingService. Browsers use the Push API instead; the
 * subscription endpoint is stored here so a dispatcher can deliver the same notifications.
 * Without VAPID keys the shell cannot create a subscription, so this endpoint is only reached
 * when the deployment configures one (documented limitation).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$endpoint = Http::inputString('endpoint', 500);
if ($endpoint === null || !preg_match('#^https?://#i', $endpoint)) {
    Http::fail('invalid_endpoint', 'endpoint must be an absolute URL.', 422);
}

$keys = Http::input('keys', []);
$p256dh = is_array($keys) ? (string) ($keys['p256dh'] ?? '') : '';
$auth = is_array($keys) ? (string) ($keys['auth'] ?? '') : '';
if ($p256dh === '' || $auth === '') {
    Http::fail('invalid_keys', 'keys.p256dh and keys.auth are required.', 422);
}

$deviceId = Http::inputString('device_id', 64);

Db::execute(
    'INSERT INTO push_subscriptions (device_id, endpoint, p256dh, auth, created_at)
     VALUES (?, ?, ?, ?, UTC_TIMESTAMP())
     ON DUPLICATE KEY UPDATE device_id = VALUES(device_id), p256dh = VALUES(p256dh), auth = VALUES(auth)',
    [Support::devicePk($deviceId), $endpoint, Support::clip($p256dh, 255), Support::clip($auth, 255)]
);

Http::ok(['stored' => true]);
