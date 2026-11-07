<?php
/**
 * POST /api/wallet/claim — the daily demo-credit top-up.
 *
 * The catalog is played for credits, and a player who loses them all would otherwise be locked out
 * of the games with no way back. This endpoint grants the configured allowance once per UTC day
 * (`wallet_daily_credits`, default 500). It is intentionally not a win: it is an equivalent of the
 * "daily demo credits" the home screen advertises, and the ledger records it as `daily_credits` so
 * the arithmetic in the profile statistics stays honest.
 *
 * Body: none. Response: { balance, granted, nextClaimAt, claimedToday }
 */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

$user = Auth::requireUser();
$userId = (int) $user['id'];

if (!Auth::allow('claim:user:' . $userId, 10, 3600)) {
    Auth::tooMany(600);
}

$allowance = max(0, (int) (Db::setting('wallet_daily_credits', '500') ?? 500));
$wallet = Wallet::forUser($userId);

$last = Db::fetch(
    "SELECT created_at FROM wallet_ledger
      WHERE user_id = ? AND reason = 'daily_credits'
      ORDER BY id DESC LIMIT 1",
    [$userId]
);

$claimedToday = $last !== null
    && substr((string) $last['created_at'], 0, 10) === gmdate('Y-m-d');

if ($claimedToday) {
    Http::ok([
        'balance'      => (int) $wallet['balance'],
        'granted'      => 0,
        'nextClaimAt'  => gmdate('Y-m-d\TH:i:s\Z', strtotime('tomorrow 00:00:00 UTC')),
        'claimedToday' => true,
    ]);
}

$result = Wallet::apply($userId, $allowance, 'daily_credits');

Db::execute(
    'INSERT INTO app_notifications (user_id, phone, kind, title, body) VALUES (?, ?, ?, ?, ?)',
    [
        $userId,
        (string) $user['phone'],
        'account',
        'Demo credits added',
        sprintf('%s demo credits were added to your balance. Come back tomorrow for more.', number_format($allowance)),
    ]
);

Http::ok([
    'balance'      => (int) $result['balance'],
    'granted'      => $allowance,
    'nextClaimAt'  => gmdate('Y-m-d\TH:i:s\Z', strtotime('tomorrow 00:00:00 UTC')),
    'claimedToday' => false,
]);
