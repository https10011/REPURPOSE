<?php
/**
 * GET /api/health — deployment smoke check (DB connectivity + schema presence).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$tables = [
    // shell tables (evidenced contract)
    'app_meta', 'domains', 'domain_checks', 'devices', 'sessions', 'events', 'client_logs',
    'blacklisted_urls', 'push_subscriptions', 'settings',
    // Addendum A tables (owner scope, directive §17.6)
    'users', 'auth_sessions', 'otp_codes', 'app_notifications', 'wallets', 'wallet_ledger',
    'games', 'game_rounds', 'rate_limits',
];
$present = [];
$missing = [];
foreach ($tables as $table) {
    $row = Db::fetch(
        'SELECT COUNT(*) AS c FROM information_schema.tables WHERE table_schema = ? AND table_name = ?',
        [Db::dbName(), $table]
    );
    if ($row !== null && (int) $row['c'] > 0) {
        $present[] = $table;
    } else {
        $missing[] = $table;
    }
}

$meta = Support::merchant();

Http::ok(
    [
        'db'      => $missing === [],
        'tables'  => $present,
        'missing' => $missing,
        'merchant' => $meta['merchant'] ?? null,
        'version'  => $meta['version'] ?? null,
        'time'     => gmdate('c'),
    ]
);
