<?php
/**
 * GameEngine — server-authoritative mechanics for the reconstructed games (directive §17.7).
 *
 * The APK contains no game code, so these are equivalents built to the owner addendum, not
 * recovered implementations. Rules are deliberately small, deterministic under an injected RNG and
 * testable without a database:
 *
 *   crash   crash point  = floor(97 / (1 - u)) / 100        (u uniform, min 1.00x, max 1000x)
 *           the player sets a cash-out target; pays only when target <= crash point
 *           RTP = 0.97 for any fixed target
 *   dice    roll 1..100, target 2..98 under/over; chance = favourable outcomes / 100
 *           multiplier = 0.97 / chance                     RTP = 0.97
 *   slots   six symbols, three reels, uniform (1/6 each); three-of-a-kind paytable
 *           RTP = 207 / 216 = 0.9583                       (documented, not claimed exact)
 *
 * Multipliers are stored in basis points (10000 = 1.00x) so the ledger never sees a float.
 */

declare(strict_types=1);

final class GameEngine
{
    /** @var callable():float|null */
    private static $rng = null;

    /** Test hook: replaces the uniform RNG. Pass null to restore `random_int`. */
    public static function useRng(?callable $rng): void
    {
        self::$rng = $rng;
    }

    /** Uniform float in [0, 1). */
    public static function nextFloat(): float
    {
        if (self::$rng !== null) {
            $value = (self::$rng)();
            return max(0.0, min(0.999999, (float) $value));
        }
        return random_int(0, 999999) / 1000000;
    }

    /** Uniform integer in [min, max] inclusive. */
    public static function nextInt(int $min, int $max): int
    {
        if ($max <= $min) {
            return $min;
        }
        if (self::$rng !== null) {
            $u = self::nextFloat();
            return min($max, $min + (int) floor($u * ($max - $min + 1)));
        }
        return random_int($min, $max);
    }

    /** Six uniform symbols; only three-of-a-kind pays, so the paytable maths stays checkable. */
    public const SLOT_SYMBOLS = ['seven', 'bell', 'bar', 'cherry', 'lemon', 'coin'];
    public const SLOT_PAYTABLE = [
        'seven'  => 120,
        'bell'   => 50,
        'bar'    => 20,
        'cherry' => 10,
        'lemon'  => 5,
        'coin'   => 2,
    ];

    /**
     * Resolves one round.
     *
     * @param array $game    Row from `games` (slug/status/min_stake/max_stake).
     * @param array $params  Client parameters (validated per game).
     * @return array{multiplierBps:int, payout:int, outcome:array}
     */
    public static function play(array $game, int $stake, array $params): array
    {
        $slug = (string) $game['slug'];
        return match ($slug) {
            'crash' => self::crash($stake, $params),
            'dice'  => self::dice($stake, $params),
            'slots' => self::slots($stake),
            default => throw new InvalidArgumentException('unsupported_game'),
        };
    }

    /** cash-out target in 1.01..1000.00 */
    private static function crash(int $stake, array $params): array
    {
        $target = (float) ($params['autoCashout'] ?? 0);
        if ($target < 1.01 || $target > 1000) {
            throw new InvalidArgumentException('invalid_auto_cashout');
        }

        $u = self::nextFloat();
        // Clamp before the division so an RNG value of exactly 1.0 cannot produce INF.
        $crashPoint = floor(97.0 / max(1e-9, 1.0 - $u)) / 100.0;
        $crashPoint = max(1.0, min(1000.0, $crashPoint));

        $won = $target <= $crashPoint;
        $multiplier = $won ? $target : 0.0;

        return [
            'multiplierBps' => (int) round($multiplier * 10000),
            'payout'        => (int) floor($stake * $multiplier),
            'outcome'       => [
                'crashPoint'  => round($crashPoint, 2),
                'autoCashout' => round($target, 2),
                'won'         => $won,
            ],
        ];
    }

    /** roll 1..100 against a target with direction under/over */
    private static function dice(int $stake, array $params): array
    {
        $target = (int) ($params['target'] ?? 0);
        $direction = (string) ($params['direction'] ?? 'under');
        if ($target < 2 || $target > 98) {
            throw new InvalidArgumentException('invalid_target');
        }
        if (!in_array($direction, ['under', 'over'], true)) {
            throw new InvalidArgumentException('invalid_direction');
        }

        // Integer chance so the multiplier is exact: under 50 -> 49/100, over 50 -> 50/100, etc.
        $chance = $direction === 'under' ? ($target - 1) / 100 : (100 - $target) / 100;
        $multiplier = 0.97 / $chance;

        $roll = self::nextInt(1, 100);
        $won = $direction === 'under' ? $roll < $target : $roll > $target;

        return [
            'multiplierBps' => $won ? (int) round($multiplier * 10000) : 0,
            'payout'        => $won ? (int) floor($stake * $multiplier) : 0,
            'outcome'       => [
                'roll'      => $roll,
                'target'    => $target,
                'direction' => $direction,
                'chance'    => round($chance, 4),
                'multiplier' => $won ? round($multiplier, 4) : 0,
                'won'       => $won,
            ],
        ];
    }

    /** three reels, uniform symbol choice, three-of-a-kind paytable */
    private static function slots(int $stake): array
    {
        $reels = [];
        for ($i = 0; $i < 3; $i++) {
            $reels[] = self::SLOT_SYMBOLS[self::nextInt(0, count(self::SLOT_SYMBOLS) - 1)];
        }

        $won = $reels[0] === $reels[1] && $reels[1] === $reels[2];
        $multiplier = $won ? (float) self::SLOT_PAYTABLE[$reels[0]] : 0.0;

        return [
            'multiplierBps' => (int) round($multiplier * 10000),
            'payout'        => (int) floor($stake * $multiplier),
            'outcome'       => [
                'reels'      => $reels,
                'multiplier' => $multiplier,
                'won'        => $won,
            ],
        ];
    }

    /** Public catalog row (never leaks internal columns). */
    public static function publicGame(array $row): array
    {
        return [
            'slug'     => (string) $row['slug'],
            'name'     => (string) $row['name'],
            'category' => (string) $row['category'],
            'tagline'  => $row['tagline'] === null ? null : (string) $row['tagline'],
            'status'   => (string) $row['status'],
            'minStake' => (int) $row['min_stake'],
            'maxStake' => (int) $row['max_stake'],
            'rtp'      => $row['rtp_bps'] === null ? null : round(((int) $row['rtp_bps']) / 10000, 4),
        ];
    }
}
