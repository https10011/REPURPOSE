<?php
/** GET /api/games/history — the signed-in user's last rounds (optional ?slug=). */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$user = Auth::requireUser();
$slug = Http::query('slug');

$sql = 'SELECT r.id, r.stake, r.payout, r.multiplier_bps, r.outcome, r.balance_after, r.created_at, g.slug, g.name
          FROM game_rounds r JOIN games g ON g.id = r.game_id
         WHERE r.user_id = ?';
$params = [(int) $user['id']];
if ($slug !== null && $slug !== '') {
    $sql .= ' AND g.slug = ?';
    $params[] = $slug;
}
$sql .= ' ORDER BY r.id DESC LIMIT 30';

$rows = Db::fetchAll($sql, $params);

Http::ok([
    'rounds' => array_map(static fn (array $r): array => [
        'id'         => (int) $r['id'],
        'game'       => (string) $r['slug'],
        'gameName'   => (string) $r['name'],
        'stake'      => (int) $r['stake'],
        'payout'     => (int) $r['payout'],
        'multiplier' => round(((int) $r['multiplier_bps']) / 10000, 4),
        'outcome'    => json_decode((string) $r['outcome'], true),
        'balanceAfter' => (int) $r['balance_after'],
        'createdAt'  => (string) $r['created_at'],
    ], $rows),
]);
