<?php
/**
 * POST /api/domain/report — speed-test / health feedback from the shell.
 *
 * The APK measures each candidate by calling `/wps/system/domainRoute` on it (rm.c). On the web
 * the shell reports the measured outcome here so `domains.status`, `last_latency_ms` and
 * `fail_count` stay meaningful; three consecutive failures disable nothing automatically — the
 * operator decides (matching the APK, which only blacklists per process).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$host = Http::inputString('host', 255);
if ($host === null || !preg_match('#^https?://[^\s/]+#i', $host)) {
    Http::fail('invalid_host', 'host must be an absolute http(s) origin.', 422);
}
$ok = Http::inputBool('ok', false);
$latency = Http::inputInt('latency_ms', null);
$status = Http::inputInt('http_status', null);
$error = Http::inputString('error', 255);
$deviceId = Http::inputString('device_id', 64);

if ($latency !== null) {
    $latency = max(0, min($latency, 600000));
}
if ($status !== null && ($status < 0 || $status > 599)) {
    Http::fail('invalid_status', 'http_status must be between 0 and 599.', 422);
}

$domainRow = Db::fetch('SELECT id, fail_count FROM domains WHERE host = ?', [$host]);

Db::execute(
    'INSERT INTO domain_checks (domain_id, host, ok, latency_ms, http_status, error, agent_name, device, created_at)
     VALUES (?, ?, ?, ?, ?, ?, NULL, NULL, UTC_TIMESTAMP())',
    [$domainRow['id'] ?? null, $host, $ok ? 1 : 0, $latency, $status, $error]
);

if ($domainRow !== null) {
    if ($ok) {
        Db::execute(
            'UPDATE domains SET status = ?, last_checked_at = UTC_TIMESTAMP(), last_latency_ms = ?, fail_count = 0
             WHERE id = ?',
            ['up', $latency, $domainRow['id']]
        );
    } else {
        Db::execute(
            'UPDATE domains SET status = ?, last_checked_at = UTC_TIMESTAMP(), fail_count = fail_count + 1
             WHERE id = ?',
            ['down', $domainRow['id']]
        );
    }
}

Http::ok(['stored' => true]);
