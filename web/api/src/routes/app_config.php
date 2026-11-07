<?php
/**
 * GET /api/app/config — server-side counterpart of the AndroidManifest <meta-data> block.
 *
 * The APK compiles merchant metadata into the binary (AppTestApp.onCreate reads
 * `ApplicationInfo.metaData`). A web deployment cannot do that, so the same values are served
 * from `app_meta` and merged over the compiled defaults in assets/js/app-config.js.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$meta = Support::merchant(Http::query('merchant'));
if ($meta === null) {
    Http::fail('merchant_not_found', 'No merchant configuration available.', 404);
}

$merchantUrls = Support::withRequestOrigin(
    Support::domainHosts((string) $meta['merchant'], $meta['merchant_urls'] ?? null)
);

Http::ok([
    'merchant'       => $meta['merchant'],
    'appName'        => $meta['app_name'],
    'version'        => $meta['version'],
    'packageName'    => $meta['package_name'],
    'backupDomain'   => $meta['backup_domain'],
    'merchantUrls'   => $merchantUrls,
    'device'         => (int) $meta['device'],
    'isSingleLine'   => (int) $meta['is_single_line'],
    'affiliateCode'  => $meta['affiliate_code'],
    'fbPixelId'      => $meta['fb_pixel_id'],
    'tid'            => $meta['tid'],
    'snowBallAppId'  => $meta['snow_ball_app_id'],
    'agentName'      => $meta['agent_name'],
    'splashUrl'      => $meta['splash_url'],
    'resolver'       => [
        'maxCandidates' => (int) (Db::setting('resolver_max_candidates', '20')),
        'lastUrlTtlMs'  => (int) (Db::setting('resolver_ttl_seconds', '86400')) * 1000,
        'requestTimeoutMs' => (int) (Db::setting('resolver_timeout_ms', '5000')),
    ],
]);
