<?php
/**
 * POST /api/log — client log ingestion.
 *
 * Mirrors the `qt.q()` / `kv.*` calls the APK makes around domain resolution, page loads and
 * the anti-hijack check. Accepts a batch (`entries[]`, as produced by debug-log.js) or a single
 * `level`/`message` pair.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');

$levels = ['verbose', 'debug', 'info', 'warn', 'error'];
$deviceId = Http::inputString('device_id', 64);
$devicePk = Support::devicePk($deviceId);

$entries = Http::input('entries', null);
if ($entries !== null) {
    if (!is_array($entries) || count($entries) > 50) {
        Http::fail('invalid_entries', 'entries must be an array with at most 50 items.', 422);
    }
    $rows = [];
    foreach ($entries as $entry) {
        if (!is_array($entry)) {
            continue;
        }
        $level = strtolower((string) ($entry['level'] ?? 'info'));
        $message = trim((string) ($entry['message'] ?? ''));
        if ($message === '') {
            continue;
        }
        $rows[] = [
            in_array($level, $levels, true) ? $level : 'info',
            mb_substr($message, 0, 2000),
            isset($entry['context']) ? json_encode($entry['context'], JSON_UNESCAPED_SLASHES) : null,
        ];
        if (count($rows) >= 50) {
            break;
        }
    }
    if ($rows === []) {
        Http::fail('invalid_entries', 'No valid log entry provided.', 422);
    }
    $pdo = Db::pdo();
    $pdo->beginTransaction();
    try {
        $stmt = $pdo->prepare(
            'INSERT INTO client_logs (device_id, level, message, context, created_at)
             VALUES (?, ?, ?, ?, UTC_TIMESTAMP())'
        );
        foreach ($rows as [$level, $message, $context]) {
            $stmt->execute([$devicePk, $level, $message, $context]);
        }
        $pdo->commit();
    } catch (Throwable $e) {
        $pdo->rollBack();
        throw $e;
    }
    Http::ok(['stored' => count($rows)]);
}

$level = strtolower(Http::inputString('level', 16) ?? 'info');
if (!in_array($level, $levels, true)) {
    Http::fail('invalid_level', 'level must be one of: ' . implode(', ', $levels), 422);
}
$message = Http::inputString('message', 2000);
if ($message === null) {
    Http::fail('invalid_message', 'message is required.', 422);
}

Db::execute(
    'INSERT INTO client_logs (device_id, level, message, context, created_at) VALUES (?, ?, ?, NULL, UTC_TIMESTAMP())',
    [$devicePk, $level, $message]
);

Http::ok(['stored' => 1]);
