<?php
/**
 * Diagnostics: prints table counts plus the most recent rows written by the shell.
 *
 *   php bin/db-info.php [--limit=5]
 */

declare(strict_types=1);

require dirname(__DIR__) . '/api/src/Db.php';

$options = getopt('', ['limit::']);
$limit = max(1, min(50, (int) ($options['limit'] ?? 5)));

$out = [
    'database' => Db::dbName(),
    'counts'   => Db::fetch(
        'SELECT
            (SELECT COUNT(*) FROM app_meta) AS app_meta,
            (SELECT COUNT(*) FROM domains) AS domains,
            (SELECT COUNT(*) FROM domain_checks) AS domain_checks,
            (SELECT COUNT(*) FROM devices) AS devices,
            (SELECT COUNT(*) FROM sessions) AS sessions,
            (SELECT COUNT(*) FROM events) AS events,
            (SELECT COUNT(*) FROM client_logs) AS client_logs,
            (SELECT COUNT(*) FROM blacklisted_urls) AS blacklisted_urls,
            (SELECT COUNT(*) FROM push_subscriptions) AS push_subscriptions'
    ),
    'app_meta' => Db::fetchAll('SELECT merchant, app_name, version, backup_domain FROM app_meta'),
    'domains'  => Db::fetchAll('SELECT host, enabled, priority, status, last_checked_at, fail_count FROM domains ORDER BY priority'),
    'sessions' => Db::fetchAll("SELECT s.resolved_host, s.resolver_path, s.resolution_ms, s.forced, s.created_at, d.device_id
                                FROM sessions s LEFT JOIN devices d ON d.id = s.device_id
                                ORDER BY s.id DESC LIMIT {$limit}"),
    'events'   => Db::fetchAll("SELECT name, params, channels, created_at FROM events ORDER BY id DESC LIMIT {$limit}"),
    'logs'     => Db::fetchAll("SELECT level, message, created_at FROM client_logs ORDER BY id DESC LIMIT {$limit}"),
    'checks'   => Db::fetchAll("SELECT host, ok, latency_ms, http_status, error, created_at FROM domain_checks ORDER BY id DESC LIMIT {$limit}"),
    'devices'  => Db::fetchAll("SELECT device_id, gaid, app_version, first_seen, last_seen FROM devices ORDER BY id DESC LIMIT {$limit}"),
    'blacklist' => Db::fetchAll('SELECT url, reason, created_at FROM blacklisted_urls ORDER BY id DESC'),
];

echo json_encode($out, JSON_PRETTY_PRINT | JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE), "\n";
