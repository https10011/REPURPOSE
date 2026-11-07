<?php
/**
 * POST /api/session — one row per successful route resolution.
 *
 * There is no session concept in the APK (no login, no cookies), so this endpoint stores the
 * shell's observable resolution telemetry: which line was chosen, how long it took and through
 * which resolver path (cache / route / backup / direct).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$deviceId = Http::inputString('device_id', 64);
$host = Http::inputString('resolved_host', 255);
$resolutionMs = Http::inputInt('resolution_ms', 0) ?? 0;
$path = Http::inputString('resolver_path', 16) ?? 'route';
$forced = Http::inputBool('forced', false);

$allowed = ['cache', 'route', 'backup', 'direct'];
if (!in_array($path, $allowed, true)) {
    Http::fail('invalid_path', 'resolver_path must be one of: ' . implode(', ', $allowed), 422);
}
if ($host === null) {
    Http::fail('invalid_host', 'resolved_host is required.', 422);
}
$resolutionMs = max(0, min($resolutionMs, 600000));

Db::execute(
    'INSERT INTO sessions (device_id, resolved_host, resolution_ms, resolver_path, forced, created_at)
     VALUES (?, ?, ?, ?, ?, UTC_TIMESTAMP())',
    [Support::devicePk($deviceId), $host, $resolutionMs, $path, $forced ? 1 : 0]
);

Http::ok(['stored' => true]);
