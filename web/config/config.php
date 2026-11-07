<?php
/**
 * Runtime configuration loader.
 *
 * Resolution order (later wins):
 *   1. built-in defaults (this file)
 *   2. `config/config.local.php` when present (git-ignored, machine specific)
 *   3. environment variables (DB_HOST, DB_PORT, DB_NAME, DB_USER, DB_PASS, DB_SOCKET)
 *
 * `config/config.php` is intentionally safe to commit: it contains no credentials.
 */

$config = [
    'db' => [
        'host'    => '127.0.0.1',
        'port'    => 3306,
        'name'    => 'sige77_shell',
        'socket'  => null,
        'user'    => 'root',
        'pass'    => '',
        'charset' => 'utf8mb4',
    ],
    'app' => [
        'timezone'       => 'UTC',
        'default_splash' => '',
        'max_body_bytes' => 32768,
        'seed_from_request' => false,
    ],
];

$localFile = __DIR__ . '/config.local.php';
if (is_file($localFile)) {
    $local = require $localFile;
    if (is_array($local)) {
        $config = array_replace_recursive($config, $local);
    }
}

$envMap = [
    'DB_HOST'   => ['db', 'host'],
    'DB_PORT'   => ['db', 'port'],
    'DB_NAME'   => ['db', 'name'],
    'DB_USER'   => ['db', 'user'],
    'DB_PASS'   => ['db', 'pass'],
    'DB_SOCKET' => ['db', 'socket'],
];
foreach ($envMap as $envName => $path) {
    $value = getenv($envName);
    if ($value !== false && $value !== '') {
        [$section, $key] = $path;
        $config[$section][$key] = $key === 'port' ? (int) $value : $value;
    }
}

return $config;
