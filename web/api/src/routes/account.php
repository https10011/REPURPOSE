<?php
/**
 * GET /api/account — profile, wallet and play statistics for the signed-in user.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$user = Auth::requireUser();

$stats = Db::fetch(
    'SELECT COUNT(*) AS rounds, COALESCE(SUM(stake), 0) AS wagered, COALESCE(SUM(payout), 0) AS returned
       FROM game_rounds WHERE user_id = ?',
    [(int) $user['id']]
) ?? ['rounds' => 0, 'wagered' => 0, 'returned' => 0];

$recent = Db::fetchAll(
    'SELECT r.id, r.stake, r.payout, r.multiplier_bps, r.outcome, r.balance_after, r.created_at, g.slug, g.name
       FROM game_rounds r JOIN games g ON g.id = r.game_id
      WHERE r.user_id = ? ORDER BY r.id DESC LIMIT 10',
    [(int) $user['id']]
);

$unread = Db::fetch(
    'SELECT COUNT(*) AS c FROM app_notifications WHERE user_id = ? AND read_at IS NULL',
    [(int) $user['id']]
);

$allowance = max(0, (int) (Db::setting('wallet_daily_credits', '500') ?? 500));
$lastClaim = Db::fetch(
    "SELECT created_at FROM wallet_ledger
      WHERE user_id = ? AND reason = 'daily_credits' ORDER BY id DESC LIMIT 1",
    [(int) $user['id']]
);
$claimedToday = $lastClaim !== null
    && substr((string) $lastClaim['created_at'], 0, 10) === gmdate('Y-m-d');

Http::ok([
    'user'   => Auth::publicUser($user),
    'stats'  => [
        'rounds'   => (int) $stats['rounds'],
        'wagered'  => (int) $stats['wagered'],
        'returned' => (int) $stats['returned'],
        'net'      => (int) $stats['returned'] - (int) $stats['wagered'],
    ],
    'dailyCredits' => [
        'amount'       => $allowance,
        'claimedToday' => $claimedToday,
        'nextClaimAt'  => gmdate('Y-m-d\TH:i:s\Z', strtotime('tomorrow 00:00:00 UTC')),
    ],
    'unreadNotifications' => (int) ($unread['c'] ?? 0),
    'recentRounds' => array_map(static fn (array $r): array => [
        'id'           => (int) $r['id'],
        'game'         => (string) $r['slug'],
        'gameName'     => (string) $r['name'],
        'stake'        => (int) $r['stake'],
        'payout'       => (int) $r['payout'],
        'multiplier'   => round(((int) $r['multiplier_bps']) / 10000, 4),
        'balanceAfter' => (int) $r['balance_after'],
        'createdAt'    => (string) $r['created_at'],
    ], $recent),
]);
