<?php
/**
 * Schema/seed runner.
 *
 *   php bin/migrate.php                      # create database + apply schema + seed
 *   php bin/migrate.php --origin=http://x:8099
 *   php bin/migrate.php --fresh              # DROP the tables first (development only)
 *
 * The SQL is idempotent, so running it repeatedly is safe.
 */

declare(strict_types=1);

require dirname(__DIR__) . '/api/src/Db.php';

$options = getopt('', ['origin::', 'fresh', 'help']);

if (isset($options['help'])) {
    fwrite(STDOUT, "Usage: php bin/migrate.php [--origin=http://host:port] [--fresh]\n");
    exit(0);
}

$origin = $options['origin'] ?? ('http://localhost:' . (getenv('PORT') ?: '8099'));
if (!preg_match('#^https?://[^\s/]+$#', $origin)) {
    fwrite(STDERR, "Invalid --origin value: {$origin}\n");
    exit(1);
}

$config = Db::config();
$dbName = Db::dbName();

/** Splits a .sql file into statements (no stored procedures are used in this schema). */
function sqlStatements(string $sql): array
{
    $sql = str_replace("\r\n", "\n", $sql);
    $parts = preg_split('/;\s*\n/', $sql) ?: [];
    $statements = [];
    foreach ($parts as $part) {
        $trimmed = trim($part);
        if ($trimmed === '' || str_starts_with($trimmed, '--')) {
            // Keep statements that start with a comment block followed by SQL.
            $lines = preg_split('/\n/', $trimmed) ?: [];
            $code = [];
            foreach ($lines as $line) {
                if (!str_starts_with(trim($line), '--')) {
                    $code[] = $line;
                }
            }
            $trimmed = trim(implode("\n", $code));
            if ($trimmed === '') {
                continue;
            }
        }
        $statements[] = $trimmed;
    }
    return $statements;
}

function run(string $label, array $statements): void
{
    $pdo = Db::pdo();
    foreach ($statements as $statement) {
        $pdo->exec($statement);
    }
    fwrite(STDOUT, sprintf("  %-8s %d statement(s)\n", $label, count($statements)));
}

try {
    // 1) Database
    $server = Db::server();
    $server->exec(sprintf(
        'CREATE DATABASE IF NOT EXISTS `%s` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci',
        str_replace('`', '', $dbName)
    ));
    fwrite(STDOUT, "database '{$dbName}' ready\n");

    // 2) Optional destructive reset (explicitly requested only)
    if (isset($options['fresh'])) {
        $pdo = Db::pdo();
        $pdo->exec('SET FOREIGN_KEY_CHECKS = 0');
        foreach (['push_subscriptions', 'blacklisted_urls', 'client_logs', 'events', 'sessions', 'domain_checks', 'domains', 'devices', 'settings', 'app_meta'] as $table) {
            $pdo->exec("DROP TABLE IF EXISTS `{$table}`");
        }
        $pdo->exec('SET FOREIGN_KEY_CHECKS = 1');
        fwrite(STDOUT, "--fresh: tables dropped\n");
    }

    // 3) Schema + seed
    $schemaFile = dirname(__DIR__) . '/sql/schema.sql';
    $seedFile = dirname(__DIR__) . '/sql/seed.sql';
    run('schema', sqlStatements((string) file_get_contents($schemaFile)));

    $seed = str_replace('{{ORIGIN}}', $origin, (string) file_get_contents($seedFile));
    run('seed', sqlStatements($seed));

    // 4) Verification summary
    $domains = Db::fetchAll('SELECT host, enabled, priority FROM domains ORDER BY priority');
    $meta = Db::fetch('SELECT merchant, version, app_name FROM app_meta LIMIT 1');
    fwrite(STDOUT, sprintf(
        "\nmerchant: %s (%s, v%s)\ndomains: %s\n",
        $meta['merchant'] ?? '-',
        $meta['app_name'] ?? '-',
        $meta['version'] ?? '-',
        $domains === [] ? '(none)' : implode(', ', array_column($domains, 'host'))
    ));
    fwrite(STDOUT, "migration complete\n");
    exit(0);
} catch (Throwable $e) {
    fwrite(STDERR, 'migration failed: ' . $e->getMessage() . "\n");
    exit(1);
}
