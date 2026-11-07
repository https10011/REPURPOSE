<?php
/**
 * GET /wps/system/domainRoute — the only server contract observable in the APK.
 *
 * Request (from defpackage/wv1.java):
 *   @GET("/wps/system/domainRoute")
 *   @Headers({"ModuleId: COMM3", "Accept: application/json"})
 *   b(@Query("device") Integer, @Query("agentName") String)
 *
 * Response envelope (defpackage/bu0.java + r20.java + p20.java):
 *   {"success":true,"value":{"domainList":[{"domainName":"https://…"}],"splash":"https://…"}}
 *
 * The handler also persists a health sample for the host the client used, because in the APK
 * every candidate domain answers this call itself (that is how the speed test measures lines).
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$merchant = (string) (Http::query('merchant') ?? '');
$meta = Support::merchant($merchant === '' ? null : $merchant);
if ($meta === null) {
    Http::fail('merchant_not_found', 'No merchant configuration available.', 404);
}

$device = Http::queryInt('device', 1) ?? 1;
$agentName = Http::query('agentName', '') ?? '';

$hosts = Support::withRequestOrigin(
    Support::domainHosts((string) $meta['merchant'], $meta['merchant_urls'] ?? null)
);
$splash = (string) ($meta['splash_url'] ?? '');
if ($splash === '') {
    $splash = (string) (Db::config()['app']['default_splash'] ?? '');
}

// Health sample for the domain that served this request (equivalent of the client-side probe).
$requestHost = (string) ($_SERVER['HTTP_HOST'] ?? '');
if ($requestHost !== '') {
    $origin = Support::requestOrigin();
    $domainRow = Db::fetch('SELECT id FROM domains WHERE host = ? OR host = ? LIMIT 1', [$origin, 'https://' . $requestHost]);
    Db::execute(
        'INSERT INTO domain_checks (domain_id, host, ok, latency_ms, http_status, error, agent_name, device, created_at)
         VALUES (?, ?, 1, 0, 200, NULL, ?, ?, UTC_TIMESTAMP())',
        [
            $domainRow['id'] ?? null,
            Support::clip($origin, 255),
            Support::clip($agentName, 64),
            $device,
        ]
    );
    if ($domainRow !== null) {
        Db::execute(
            'UPDATE domains SET status = ?, last_checked_at = UTC_TIMESTAMP(), last_latency_ms = 0, fail_count = 0
             WHERE id = ?',
            ['up', $domainRow['id']]
        );
    }
}

Http::ok([
    'domainList' => array_map(static fn (string $host): array => ['domainName' => $host], $hosts),
    'splash'     => $splash,
]);
