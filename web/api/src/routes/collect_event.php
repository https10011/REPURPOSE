<?php
/**
 * POST /api/collect/event — telemetry sink.
 *
 * Android side: gs0.eventTracker(name, json) fans out to Firebase Analytics,
 * AppsFlyer, OpenInstall (on `register`) and the Snowball SDK (`register`, `deposit`,
 * `startTrial`). None of those SDKs exist in a browser, so the same calls are persisted here
 * with the channel list the shell reports. This keeps the event names/params contract intact
 * and gives the operator an equivalent data source.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$name = Http::inputString('name', 64);
if ($name === null || !preg_match('/^[A-Za-z0-9_.:-]{1,64}$/', $name)) {
    Http::fail('invalid_name', 'event name must match [A-Za-z0-9_.:-]{1,64}.', 422);
}

$params = Http::input('params', []);
if (!is_array($params)) {
    Http::fail('invalid_params', 'params must be a JSON object.', 422);
}
$encoded = json_encode($params, JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE);
if ($encoded === false || strlen($encoded) > 8000) {
    Http::fail('invalid_params', 'params must be JSON-serialisable and under 8 kB.', 422);
}

$channelsInput = Http::input('channels', []);
if (!is_array($channelsInput)) {
    Http::fail('invalid_channels', 'channels must be an array of strings.', 422);
}
$allowedChannels = ['firebase', 'appsflyer', 'openinstall', 'snowball'];
$channels = array_values(array_intersect($allowedChannels, array_map('strval', $channelsInput)));

$deviceId = Http::inputString('device_id', 64);

Db::execute(
    'INSERT INTO events (device_id, name, params, channels, created_at) VALUES (?, ?, ?, ?, UTC_TIMESTAMP())',
    [Support::devicePk($deviceId), $name, $encoded, implode(',', $channels)]
);

Http::ok(['stored' => true]);
