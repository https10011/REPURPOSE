<?php
/**
 * Front controller for the reconstructed shell backend.
 *
 * Routes:
 *   GET  /wps/system/domainRoute   original merchant contract (defpackage/wv1.java)
 *   GET  /api/app/config           manifest <meta-data> equivalent
 *   GET  /api/app/latest           parity endpoint (unused by the APK, see route file)
 *   POST /api/device/register      install identity
 *   POST /api/session              resolution telemetry
 *   POST /api/collect/event        eventTracker / appFlyerLogEvent sink
 *   POST /api/log                  client log batch
 *   POST /api/domain/report        speed-test feedback
 *   POST /api/blacklist            anti-hijack blacklist
 *   POST /api/push/subscribe       Web Push subscription storage
 *   GET  /api/health               smoke check
 *
 * Addendum A (owner scope, directive §17):
 *   POST /api/auth/register        local account creation
 *   POST /api/auth/login           phone + password
 *   POST /api/auth/logout          revoke session
 *   GET  /api/auth/session         current account
 *   POST /api/auth/otp/request     issue a locally generated code
 *   POST /api/auth/otp/verify      complete sign-up + start session
 *   GET  /api/account              profile, wallet, stats
 *   GET|POST /api/notifications    account notices
 *   GET  /api/games                catalog
 *   POST /api/games/play           one round
 *   GET  /api/games/history        recent rounds
 */

declare(strict_types=1);

require __DIR__ . '/src/Db.php';
require __DIR__ . '/src/Http.php';
require __DIR__ . '/src/Support.php';
require __DIR__ . '/src/Auth.php';
require __DIR__ . '/src/Wallet.php';
require __DIR__ . '/src/GameEngine.php';
require __DIR__ . '/src/Router.php';

$config = Db::config();
date_default_timezone_set((string) ($config['app']['timezone'] ?? 'UTC'));

// Errors are logged server-side and returned as a generic JSON envelope; stack traces must never
// reach the browser.
set_exception_handler(static function (Throwable $e): void {
    error_log(sprintf('[sige77] %s: %s in %s:%d', get_class($e), $e->getMessage(), $e->getFile(), $e->getLine()));
    if (!headers_sent()) {
        http_response_code(500);
        header('Content-Type: application/json; charset=utf-8');
    }
    echo json_encode([
        'success' => false,
        'error'   => ['code' => 'internal_error', 'message' => 'Unexpected server error.'],
    ]);
});

$router = new Router();

$router->get('/wps/system/domainRoute', static fn () => require __DIR__ . '/src/routes/domain_route.php');
$router->get('/api/app/config', static fn () => require __DIR__ . '/src/routes/app_config.php');
$router->get('/api/app/latest', static fn () => require __DIR__ . '/src/routes/app_latest.php');
$router->get('/api/health', static fn () => require __DIR__ . '/src/routes/health.php');
$router->post('/api/device/register', static fn () => require __DIR__ . '/src/routes/device_register.php');
$router->post('/api/session', static fn () => require __DIR__ . '/src/routes/session.php');
$router->post('/api/collect/event', static fn () => require __DIR__ . '/src/routes/collect_event.php');
$router->post('/api/log', static fn () => require __DIR__ . '/src/routes/log.php');
$router->post('/api/domain/report', static fn () => require __DIR__ . '/src/routes/domain_report.php');
$router->post('/api/blacklist', static fn () => require __DIR__ . '/src/routes/blacklist.php');
$router->post('/api/push/subscribe', static fn () => require __DIR__ . '/src/routes/push_subscribe.php');

// Addendum A (owner scope): local accounts, notifications and the reconstructed games.
$router->post('/api/auth/register', static fn () => require __DIR__ . '/src/routes/auth_register.php');
$router->post('/api/auth/login', static fn () => require __DIR__ . '/src/routes/auth_login.php');
$router->post('/api/auth/logout', static fn () => require __DIR__ . '/src/routes/auth_logout.php');
$router->get('/api/auth/session', static fn () => require __DIR__ . '/src/routes/auth_session.php');
$router->post('/api/auth/otp/request', static fn () => require __DIR__ . '/src/routes/otp_request.php');
$router->post('/api/auth/otp/verify', static fn () => require __DIR__ . '/src/routes/otp_verify.php');
$router->get('/api/account', static fn () => require __DIR__ . '/src/routes/account.php');
$router->get('/api/notifications', static fn () => require __DIR__ . '/src/routes/notifications.php');
$router->post('/api/notifications', static fn () => require __DIR__ . '/src/routes/notifications.php');
$router->get('/api/games', static fn () => require __DIR__ . '/src/routes/games_index.php');
$router->post('/api/games/play', static fn () => require __DIR__ . '/src/routes/game_play.php');
$router->get('/api/games/history', static fn () => require __DIR__ . '/src/routes/game_history.php');

$router->dispatch();
