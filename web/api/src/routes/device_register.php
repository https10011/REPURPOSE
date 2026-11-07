<?php
/**
 * POST /api/device/register — install identity.
 *
 * Equivalent of the APK's first-run identity work: the device UUID (j10), the advertising id
 * reported by AdvertisingIdClient (kf.b) and the SDK install callbacks (Adjust/AppsFlyer/
 * OpenInstall). Persisted once per device UUID.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$deviceId = Http::inputString('device_id', 64);
if ($deviceId === null || !preg_match('/^[0-9a-fA-F-]{8,64}$/', $deviceId)) {
    Http::fail('invalid_device_id', 'A UUID-shaped device_id is required.', 422);
}

$gaid = Http::inputString('gaid', 64);
$userAgent = Http::inputString('user_agent', 500);
$version = Http::inputString('version', 32);
$meta = Support::merchant();
$merchant = Http::inputString('merchant', 64) ?? (string) ($meta['merchant'] ?? '');

Db::execute(
    'INSERT INTO devices (device_id, gaid, user_agent, platform, app_version, merchant, first_seen, last_seen)
     VALUES (?, ?, ?, ?, ?, ?, UTC_TIMESTAMP(), UTC_TIMESTAMP())
     ON DUPLICATE KEY UPDATE
        gaid = VALUES(gaid),
        user_agent = VALUES(user_agent),
        app_version = VALUES(app_version),
        merchant = VALUES(merchant),
        last_seen = UTC_TIMESTAMP()',
    [$deviceId, $gaid, $userAgent, 'web', $version, $merchant]
);

Http::ok(['device_id' => $deviceId]);
