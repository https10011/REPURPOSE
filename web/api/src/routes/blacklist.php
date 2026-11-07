<?php
/**
 * POST /api/blacklist — anti-hijack blacklist.
 *
 * `AppTestApp.a(String url)` in the APK adds a URL to an in-memory set (AppTestApp.n0) used by
 * rm.c() to skip a domain during the next speed test, after jg.shouldInterceptRequest() decided
 * the document did not contain the merchant markers. The web shell does the same in memory and
 * additionally reports the hit here so operators can see hijacked lines.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$url = Http::inputString('url', 512);
if ($url === null) {
    Http::fail('invalid_url', 'url is required.', 422);
}
$reason = Http::inputString('reason', 255) ?? 'unspecified';
$deviceId = Http::inputString('device_id', 64);

Db::execute(
    'INSERT INTO blacklisted_urls (url, reason, device_id, created_at)
     VALUES (?, ?, ?, UTC_TIMESTAMP())
     ON DUPLICATE KEY UPDATE reason = VALUES(reason), device_id = VALUES(device_id), created_at = UTC_TIMESTAMP()',
    [$url, $reason, Support::devicePk($deviceId)]
);

Http::ok(['stored' => true]);
