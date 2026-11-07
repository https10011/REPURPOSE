<?php
/**
 * GET  /api/notifications          list the signed-in user's notifications
 * POST /api/notifications          mark every notification read (body: { all: true })
 *
 * OTP codes themselves are delivered by the client that requested them (the addendum's in-app
 * replacement for SMS); this table holds account notices.
 */

declare(strict_types=1);

Http::cors();

$user = Auth::requireUser();

if (Http::method() === 'POST') {
    Auth::requireSameOrigin();
    Db::execute(
        'UPDATE app_notifications SET read_at = UTC_TIMESTAMP() WHERE user_id = ? AND read_at IS NULL',
        [(int) $user['id']]
    );
    Http::ok(['markedRead' => true]);
}

Http::requireMethod('GET');

$rows = Db::fetchAll(
    'SELECT id, kind, title, body, read_at, created_at
       FROM app_notifications WHERE user_id = ? ORDER BY id DESC LIMIT 50',
    [(int) $user['id']]
);

Http::ok([
    'notifications' => array_map(static fn (array $n): array => [
        'id'        => (int) $n['id'],
        'kind'      => (string) $n['kind'],
        'title'     => (string) $n['title'],
        'body'      => (string) $n['body'],
        'read'      => $n['read_at'] !== null,
        'createdAt' => (string) $n['created_at'],
    ], $rows),
]);
