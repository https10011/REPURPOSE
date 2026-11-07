<?php
/**
 * GET /api/app/latest — parity endpoint.
 *
 * The APK builds this URL in AppTestApp.onCreate (W) but never issues the request, so the shell
 * does not call it either. It is kept so the reconstructed backend exposes the same surface a
 * merchant-side deployment is expected to answer on (https://<merchant>.www.gfbwff.com/api/app/latest?os=android).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$os = Http::query('os', 'android');
if ($os !== 'android') {
    Http::fail('unsupported_os', 'Only the android channel is defined for this application.', 422);
}

$meta = Support::merchant();
Http::ok([
    'version' => $meta['version'] ?? null,
    'url'     => Db::setting('app_latest_url', ''),
    'note'    => Db::setting('app_latest_note', ''),
]);
