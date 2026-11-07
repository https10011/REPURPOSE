<?php
/**
 * Deterministic tests for GameEngine (directive §17.7).
 *
 *   ./.tools/php web/tests/game_engine_test.php
 *
 * The engine takes an injected RNG, so every payout below is an exact arithmetic expectation rather
 * than a statistical claim.
 */

declare(strict_types=1);

require __DIR__ . '/../api/src/GameEngine.php';

$pass = 0;
$fail = 0;

function check(string $label, mixed $expected, mixed $actual): void
{
    global $pass, $fail;
    if ($expected === $actual) {
        $pass++;
        printf("  ok   %-52s %s\n", $label, var_export($actual, true));
        return;
    }
    $fail++;
    printf("  FAIL %-52s expected=%s actual=%s\n", $label, var_export($expected, true), var_export($actual, true));
}

function sequence(array $values): callable
{
    $i = 0;
    return static function () use ($values, &$i) {
        return $values[$i++] ?? 0.0;
    };
}

function throws(callable $fn): bool
{
    try {
        $fn();
    } catch (InvalidArgumentException) {
        return true;
    }
    return false;
}

$games = [
    'crash' => ['slug' => 'crash'],
    'dice'  => ['slug' => 'dice'],
    'slots' => ['slug' => 'slots'],
];

/* ------------------------------------------------------------------- crash --- */

GameEngine::useRng(static fn (): float => 0.0);
$r = GameEngine::play($games['crash'], 100, ['autoCashout' => 1.5]);
check('crash: u=0 -> crash point clamps to 1.00', 1.0, $r['outcome']['crashPoint']);
check('crash: target 1.50 above crash loses', false, $r['outcome']['won']);
check('crash: losing round pays nothing', 0, $r['payout']);

GameEngine::useRng(static fn (): float => 0.5);
$r = GameEngine::play($games['crash'], 100, ['autoCashout' => 1.5]);
check('crash: u=0.5 -> crash point 1.94', 1.94, $r['outcome']['crashPoint']);
check('crash: target 1.50 inside crash wins', true, $r['outcome']['won']);
check('crash: payout = stake * target', 150, $r['payout']);
check('crash: multiplier in basis points', 15000, $r['multiplierBps']);

GameEngine::useRng(static fn (): float => 0.999);
$r = GameEngine::play($games['crash'], 10, ['autoCashout' => 100]);
check('crash: high u -> crash point 969.99', 969.99, $r['outcome']['crashPoint']);
check('crash: target 100 inside 969.99x wins', true, $r['outcome']['won']);

GameEngine::useRng(static fn (): float => 0.5);
$r = GameEngine::play($games['crash'], 10, ['autoCashout' => 100]);
check('crash: target above the crash point loses', false, $r['outcome']['won']);

/* -------------------------------------------------------------------- dice --- */

GameEngine::useRng(static fn (): float => 0.0);
$r = GameEngine::play($games['dice'], 100, ['target' => 50, 'direction' => 'under']);
check('dice: roll for u=0 is 1', 1, $r['outcome']['roll']);
check('dice: 1 < 50 wins', true, $r['outcome']['won']);
check('dice: chance 49%', 0.49, $r['outcome']['chance']);
check('dice: payout floor(100 * 0.97/0.49)', 197, $r['payout']);

GameEngine::useRng(static fn (): float => 0.999999);
$r = GameEngine::play($games['dice'], 100, ['target' => 50, 'direction' => 'under']);
check('dice: roll for u~1 is 100', 100, $r['outcome']['roll']);
check('dice: under 50 loses on 100', false, $r['outcome']['won']);

GameEngine::useRng(static fn (): float => 0.99);
$r = GameEngine::play($games['dice'], 100, ['target' => 50, 'direction' => 'over']);
check('dice: 100 > 50 wins', true, $r['outcome']['won']);
check('dice: over pays floor(100 * 1.94)', 194, $r['payout']);

check(
    'dice: target out of range rejected',
    true,
    throws(static fn () => GameEngine::play($games['dice'], 10, ['target' => 1, 'direction' => 'under']))
);
check(
    'dice: unknown direction rejected',
    true,
    throws(static fn () => GameEngine::play($games['dice'], 10, ['target' => 50, 'direction' => 'sideways']))
);
check(
    'crash: target below 1.01 rejected',
    true,
    throws(static fn () => GameEngine::play($games['crash'], 10, ['autoCashout' => 1.0]))
);

/* ------------------------------------------------------------------- slots --- */

GameEngine::useRng(static fn (): float => 0.0);
$r = GameEngine::play($games['slots'], 100, []);
check('slots: u=0 -> three sevens', ['seven', 'seven', 'seven'], $r['outcome']['reels']);
check('slots: 120x pays 12000', 12000, $r['payout']);
check('slots: multiplier bps', 1200000, $r['multiplierBps']);

GameEngine::useRng(static fn (): float => 0.2);
$r = GameEngine::play($games['slots'], 10, []);
check('slots: u=0.2 -> three bells', ['bell', 'bell', 'bell'], $r['outcome']['reels']);
check('slots: 50x pays 500', 500, $r['payout']);

GameEngine::useRng(sequence([0.0, 0.0, 0.35]));
$r = GameEngine::play($games['slots'], 10, []);
check('slots: mixed reels lose', false, $r['outcome']['won']);
check('slots: losing round pays nothing', 0, $r['payout']);

$rtp = array_sum(GameEngine::SLOT_PAYTABLE) / (count(GameEngine::SLOT_SYMBOLS) ** 3);
check('slots: paytable RTP is 207/216', true, abs($rtp - (207 / 216)) < 1e-12);

/* ------------------------------------------------------------------ shared --- */

check(
    'unknown game rejected',
    true,
    throws(static fn () => GameEngine::play(['slug' => 'blackjack'], 10, []))
);

$catalog = GameEngine::publicGame([
    'slug' => 'dice', 'name' => 'Dice', 'category' => 'originals', 'tagline' => 'x',
    'status' => 'playable', 'min_stake' => '10', 'max_stake' => '10000', 'rtp_bps' => '9700',
]);
check('catalog: public shape', 0.97, $catalog['rtp']);
check('catalog: casts stake bounds', 10, $catalog['minStake']);

GameEngine::useRng(null);
$r = GameEngine::play($games['slots'], 10, []);
check('engine: real rng produces three reels', 3, count($r['outcome']['reels']));

echo "\npassed: {$pass}, failed: {$fail}\n";
exit($fail === 0 ? 0 : 1);
