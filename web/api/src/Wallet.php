<?php
/**
 * Wallet — integer-credit balance with an append-only ledger (directive §17.6).
 *
 * Balances are whole credits (no floats). Every change happens inside a transaction that locks the
 * wallet row, writes the ledger entry and returns the new balance, so a concurrent round can never
 * oversell a balance.
 */

declare(strict_types=1);

final class InsufficientFunds extends RuntimeException
{
}

final class Wallet
{
    /** Returns the wallet row for a user, creating it with the configured opening balance. */
    public static function forUser(int $userId): array
    {
        $row = Db::fetch('SELECT id, user_id, balance, currency FROM wallets WHERE user_id = ?', [$userId]);
        if ($row !== null) {
            return $row;
        }

        $start = max(0, (int) (Db::setting('wallet_start_balance', '1000') ?? 1000));
        Db::execute('INSERT IGNORE INTO wallets (user_id, balance, currency) VALUES (?, ?, ?)', [$userId, $start, 'PHP']);
        $row = Db::fetch('SELECT id, user_id, balance, currency FROM wallets WHERE user_id = ?', [$userId]);
        if ($row === null) {
            throw new RuntimeException('wallet could not be created');
        }
        Db::execute(
            'INSERT INTO wallet_ledger (wallet_id, user_id, delta, balance_after, reason)
             VALUES (?, ?, ?, ?, ?)',
            [(int) $row['id'], $userId, $start, $start, 'opening_balance']
        );
        return $row;
    }

    /**
     * Applies a signed delta. Negative deltas may not take the balance below zero.
     *
     * @return array{balance:int, walletId:int}
     */
    public static function apply(int $userId, int $delta, string $reason, ?int $roundId = null): array
    {
        $pdo = Db::pdo();
        $pdo->beginTransaction();
        try {
            $row = Db::fetch('SELECT id, balance FROM wallets WHERE user_id = ? FOR UPDATE', [$userId]);
            if ($row === null) {
                $pdo->rollBack();
                self::forUser($userId);
                $pdo->beginTransaction();
                $row = Db::fetch('SELECT id, balance FROM wallets WHERE user_id = ? FOR UPDATE', [$userId]);
                if ($row === null) {
                    throw new RuntimeException('wallet missing');
                }
            }

            $balance = (int) $row['balance'];
            $next = $balance + $delta;
            if ($next < 0) {
                $pdo->rollBack();
                throw new InsufficientFunds('insufficient balance');
            }

            Db::execute('UPDATE wallets SET balance = ? WHERE id = ?', [$next, (int) $row['id']]);
            Db::execute(
                'INSERT INTO wallet_ledger (wallet_id, user_id, round_id, delta, balance_after, reason)
                 VALUES (?, ?, ?, ?, ?, ?)',
                [(int) $row['id'], $userId, $roundId, $delta, $next, substr($reason, 0, 32)]
            );
            $pdo->commit();
            return ['balance' => $next, 'walletId' => (int) $row['id']];
        } catch (Throwable $e) {
            if ($pdo->inTransaction()) {
                $pdo->rollBack();
            }
            throw $e;
        }
    }
}
