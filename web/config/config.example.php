<?php
/**
 * Copy this file to `config/config.php` (or `config/config.local.php`) and adjust the values.
 * Nothing in this file is committed with real credentials; deployment credentials should come
 * from environment variables (DB_HOST, DB_PORT, DB_NAME, DB_USER, DB_PASS, DB_SOCKET).
 */
return [
    'db' => [
        'host'   => getenv('DB_HOST') ?: '127.0.0.1',
        'port'   => (int) (getenv('DB_PORT') ?: 3306),
        'name'   => getenv('DB_NAME') ?: 'sige77_shell',
        // Optional: connect through a UNIX socket (local installations).
        'socket' => getenv('DB_SOCKET') ?: null,
        'user'   => getenv('DB_USER') ?: 'root',
        'pass'   => getenv('DB_PASS') ?: '',
        'charset' => 'utf8mb4',
    ],

    'app' => [
        // Timezone used for every stored timestamp.
        'timezone' => 'UTC',
        // Default splash image returned by /wps/system/domainRoute when app_meta.splash_url is empty.
        'default_splash' => '',
        // Maximum accepted JSON body (bytes) for the write endpoints.
        'max_body_bytes' => 32768,
        // Development helper: replace the seeded domain host with the request host so a local
        // instance resolves itself. Must stay false in production.
        'seed_from_request' => false,
    ],
];
