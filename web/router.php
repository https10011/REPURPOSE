<?php
/**
 * Development router for `php -S`.
 *
 * Usage:
 *   php -S 0.0.0.0:8099 router.php      (from the `web/` directory)
 *
 * Responsibilities:
 *   • send /api/* and /wps/* to the PHP front controller
 *   • block direct access to app internals (config, api/src, sql, bin, tests)
 *   • otherwise let the built-in server deliver the static files
 */

declare(strict_types=1);

$path = parse_url($_SERVER['REQUEST_URI'] ?? '/', PHP_URL_PATH) ?: '/';
$path = '/' . ltrim($path, '/');

// API + original merchant contract.
if (str_starts_with($path, '/api/') || str_starts_with($path, '/wps/')) {
    require __DIR__ . '/api/index.php';
    return true;
}

// Never expose server-side sources or configuration files.
$blocked = ['/config/', '/api/src/', '/sql/', '/bin/', '/tests/'];
foreach ($blocked as $prefix) {
    if (str_starts_with($path, $prefix)) {
        http_response_code(404);
        header('Content-Type: text/plain; charset=utf-8');
        echo "Not found\n";
        return true;
    }
}
if (preg_match('/\.(php|sql|md|json|log|sh)$/i', $path) && !is_file(__DIR__ . $path)) {
    http_response_code(404);
    header('Content-Type: text/plain; charset=utf-8');
    echo "Not found\n";
    return true;
}

// Existing static file -> let the server handle it.
if ($path !== '/' && is_file(__DIR__ . $path)) {
    return false;
}

// Directory index fallbacks.
if ($path === '/' || is_dir(__DIR__ . $path)) {
    $index = rtrim($path, '/') . '/index.html';
    if (is_file(__DIR__ . $index)) {
        header('Content-Type: text/html; charset=utf-8');
        readfile(__DIR__ . $index);
        return true;
    }
}

http_response_code(404);
header('Content-Type: text/plain; charset=utf-8');
echo "Not found\n";
return true;
