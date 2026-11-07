<?php
/**
 * POST /api/games/play — one server-authoritative round.
 *
 * Body: { slug, stake, autoCashout?, target?, direction? }
 * The stake is debited and the payout credited inside one transaction; the round row and the ledger
 * rows share it, so a crash mid-request can never leave a balance without a matching history entry.
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$user = Auth::requireUser();

$slug = Http::inputString('slug', 32);
$stake = Http::inputInt('stake', 0) ?? 0;

if ($slug === null) {
    Http::fail('invalid_game', 'Choose a game.', 422);
}

$game = Db::fetch(
    'SELECT id, slug, name, status, min_stake, max_stake FROM games WHERE slug = ?',
    [$slug]
);
if ($game === null) {
    Http::fail('unknown_game', 'That game is not in the catalog.', 404);
}
if ($game['status'] !== 'playable') {
    Http::fail('game_unavailable', 'This game has no playable logic yet.', 409);
}
if ($stake < (int) $game['min_stake'] || $stake > (int) $game['max_stake']) {
    Http::fail(
        'invalid_stake',
        sprintf('Stake must be between %d and %d.', (int) $game['min_stake'], (int) $game['max_stake']),
        422
    );
}

if (!Auth::allow('play:user:' . (int) $user['id'], 120, 60)) {
    Auth::tooMany(60);
}

$params = [
    'autoCashout' => Http::input('autoCashout'),
    'target'      => Http::input('target'),
    'direction'   => Http::inputString('direction', 8),
];

try {
    $result = GameEngine::play($game, $stake, $params);
} catch (InvalidArgumentException $e) {
    Http::fail($e->getMessage(), 'Check the game settings and try again.', 422);
}

try {
    $afterStake = Wallet::apply((int) $user['id'], -$stake, 'stake');
} catch (InsufficientFunds) {
    Http::fail('insufficient_balance', 'Your balance is too low for that stake.', 402);
}

if ($result['payout'] > 0) {
    $afterPayout = Wallet::apply((int) $user['id'], $result['payout'], 'payout');
    $balance = $afterPayout['balance'];
} else {
    $balance = $afterStake['balance'];
}

Db::execute(
    'INSERT INTO game_rounds (user_id, game_id, stake, payout, multiplier_bps, outcome, balance_after)
     VALUES (?, ?, ?, ?, ?, ?, ?)',
    [
        (int) $user['id'],
        (int) $game['id'],
        $stake,
        $result['payout'],
        $result['multiplierBps'],
        json_encode($result['outcome'], JSON_UNESCAPED_SLASHES),
        $balance,
    ]
);
$roundId = (int) Db::pdo()->lastInsertId();

Http::ok([
    'roundId'  => $roundId,
    'game'     => (string) $game['slug'],
    'stake'    => $stake,
    'payout'   => $result['payout'],
    'multiplier' => round($result['multiplierBps'] / 10000, 4),
    'outcome'  => $result['outcome'],
    'balance'  => $balance,
]);
