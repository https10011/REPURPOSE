<?php
/**
 * GET /api/games — the reconstructed catalog (directive §17.7).
 *
 * Optional query: ?category=originals|live, ?q=text
 * Public: the catalog is browsable without a session.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$category = Http::query('category');
$search = Http::query('q');

$sql = 'SELECT slug, name, category, tagline, status, min_stake, max_stake, rtp_bps FROM games WHERE 1 = 1';
$params = [];
if ($category !== null && $category !== '' && $category !== 'all') {
    $sql .= ' AND category = ?';
    $params[] = $category;
}
if ($search !== null && $search !== '') {
    $sql .= ' AND (name LIKE ? OR tagline LIKE ?)';
    $like = '%' . str_replace(['%', '_'], ['\%', '\_'], $search) . '%';
    $params[] = $like;
    $params[] = $like;
}
$sql .= ' ORDER BY sort_order ASC, id ASC';

$rows = Db::fetchAll($sql, $params);
$categories = Db::fetchAll('SELECT DISTINCT category FROM games ORDER BY category');

Http::ok([
    'games'      => array_map(static fn (array $row): array => GameEngine::publicGame($row), $rows),
    'categories' => array_map(static fn (array $row): string => (string) $row['category'], $categories),
]);
