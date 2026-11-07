<?php
/**
 * Auth — local account sessions for the self-contained application (directive §17.5).
 *
 * The APK has no login of its own (the merchant site held it), so this class implements the
 * contract the owner addendum specifies: phone + password accounts stored in this application's
 * own database, bcrypt hashes, opaque session tokens in an HttpOnly cookie, SHA-256 of the token
 * at rest, same-origin enforcement for mutations and a small fixed-window rate limiter.
 */

declare(strict_types=1);

final class Auth
{
    public const COOKIE = 'sige77_session';

    private static ?array $user = null;
    private static bool $resolved = false;

    /* ------------------------------------------------------------------ phone --- */

    /**
     * Normalises a phone number to E.164-ish digits (`+63XXXXXXXXXX` for Philippine numbers).
     *
     * `09171234567`, `9171234567`, `+63 917 123 4567` and `639171234567` all map to the same
     * account, which is what users of the original app would expect from one number.
     * Returns null when the input cannot be a phone number.
     */
    public static function normalizePhone(?string $raw): ?string
    {
        $digits = preg_replace('/\D+/', '', (string) $raw) ?? '';
        if ($digits === '') {
            return null;
        }
        if (str_starts_with($digits, '0063')) {
            $digits = substr($digits, 2);
        }
        if (str_starts_with($digits, '63') && strlen($digits) === 12) {
            $digits = '0' . substr($digits, 2);
        }
        if (str_starts_with($digits, '0')) {
            $national = ltrim($digits, '0');
            if (strlen($national) >= 9 && strlen($national) <= 10) {
                return '+63' . $national;
            }
        }
        if (strlen($digits) === 10 && str_starts_with($digits, '9')) {
            return '+63' . $digits;
        }
        if (str_starts_with($digits, '63') && strlen($digits) >= 10 && strlen($digits) <= 15) {
            return '+' . $digits;
        }
        if (strlen($digits) >= 8 && strlen($digits) <= 15) {
            return '+' . $digits;
        }
        return null;
    }

    /** Display form used by the UI: `+63 917 123 4567`. */
    public static function formatPhone(string $phone): string
    {
        if (preg_match('/^\+63(\d{3})(\d{3})(\d{4})$/', $phone, $m) === 1) {
            return sprintf('+63 %s %s %s', $m[1], $m[2], $m[3]);
        }
        return $phone;
    }

    /* ---------------------------------------------------------------- session --- */

    /** Cookie attributes shared by set and clear. */
    private static function cookieOptions(int $expires): array
    {
        $https = (!empty($_SERVER['HTTPS']) && $_SERVER['HTTPS'] !== 'off')
            || (($_SERVER['HTTP_X_FORWARDED_PROTO'] ?? '') === 'https');
        return [
            'expires'  => $expires,
            'path'     => '/',
            'secure'   => $https,
            'httponly' => true,
            'samesite' => 'Lax',
        ];
    }

    /** Creates a session row and sets the cookie. Returns the raw token (never stored raw). */
    public static function startSession(int $userId): string
    {
        $token = bin2hex(random_bytes(32));
        $days = (int) (Db::setting('auth_session_days', '30') ?? 30);
        $days = max(1, min($days, 365));

        Db::execute(
            'INSERT INTO auth_sessions (user_id, token_hash, ip, user_agent, expires_at)
             VALUES (?, ?, ?, ?, DATE_ADD(UTC_TIMESTAMP(), INTERVAL ? DAY))',
            [
                $userId,
                hash('sha256', $token),
                Http::clientIp(),
                Support::clip((string) ($_SERVER['HTTP_USER_AGENT'] ?? ''), 255),
                $days,
            ]
        );

        if (!headers_sent()) {
            setcookie(self::COOKIE, $token, self::cookieOptions(time() + $days * 86400));
        }
        return $token;
    }

    /** Current user row (with wallet) or null. Resolved once per request. */
    public static function user(): ?array
    {
        if (self::$resolved) {
            return self::$user;
        }
        self::$resolved = true;

        $token = $_COOKIE[self::COOKIE] ?? '';
        if (!is_string($token) || !preg_match('/^[0-9a-f]{64}$/', $token)) {
            return self::$user = null;
        }

        $row = Db::fetch(
            'SELECT s.id AS session_id, s.expires_at, u.id, u.name, u.phone, u.phone_verified,
                    u.status, u.created_at, u.last_login_at
               FROM auth_sessions s
               JOIN users u ON u.id = s.user_id
              WHERE s.token_hash = ? AND s.revoked_at IS NULL AND s.expires_at > UTC_TIMESTAMP()
              LIMIT 1',
            [hash('sha256', $token)]
        );
        if ($row === null || $row['status'] !== 'active') {
            return self::$user = null;
        }

        // Sliding expiry: extend once per day rather than on every request.
        Db::execute(
            'UPDATE auth_sessions
                SET last_seen_at = UTC_TIMESTAMP(),
                    expires_at = GREATEST(expires_at, DATE_ADD(UTC_TIMESTAMP(), INTERVAL ? DAY))
              WHERE id = ? AND expires_at < DATE_ADD(UTC_TIMESTAMP(), INTERVAL ? DAY)',
            [
                (int) (Db::setting('auth_session_days', '30') ?? 30),
                (int) $row['session_id'],
                (int) (Db::setting('auth_session_days', '30') ?? 30),
            ]
        );

        $row['wallet'] = Wallet::forUser((int) $row['id']);
        return self::$user = $row;
    }

    /** 401 envelope unless a valid session cookie is present. */
    public static function requireUser(): array
    {
        $user = self::user();
        if ($user === null) {
            Http::fail('unauthenticated', 'Sign in to continue.', 401);
        }
        return $user;
    }

    public static function endSession(): void
    {
        $token = $_COOKIE[self::COOKIE] ?? '';
        if (is_string($token) && $token !== '') {
            Db::execute(
                'UPDATE auth_sessions SET revoked_at = UTC_TIMESTAMP() WHERE token_hash = ? AND revoked_at IS NULL',
                [hash('sha256', $token)]
            );
        }
        if (!headers_sent()) {
            setcookie(self::COOKIE, '', self::cookieOptions(time() - 3600));
        }
        self::$resolved = true;
        self::$user = null;
    }

    /* -------------------------------------------------------------- same origin --- */

    /**
     * Rejects cross-site state changes. Same-origin XHR/fetch always sends Origin (or at least a
     * Referer), and the shell's own frame is same-origin, so an absent header means a non-browser
     * client — which is allowed only when it presents no cookie.
     */
    public static function requireSameOrigin(): void
    {
        $source = (string) ($_SERVER['HTTP_ORIGIN'] ?? '');
        if ($source === '') {
            $source = (string) ($_SERVER['HTTP_REFERER'] ?? '');
        }

        if ($source === '') {
            // No browser-supplied origin: allowed only when there is no session to abuse.
            if (($_COOKIE[self::COOKIE] ?? '') === '') {
                return;
            }
            Http::fail('csrf_origin_missing', 'Request origin could not be verified.', 403);
        }

        $hostHeader = (string) ($_SERVER['HTTP_HOST'] ?? '');
        if (self::authority($hostHeader, self::requestScheme()) !== self::authority($source, null)) {
            Http::fail('csrf_origin_mismatch', 'Cross-site requests are not allowed.', 403);
        }
    }

    private static function requestScheme(): string
    {
        $https = (!empty($_SERVER['HTTPS']) && $_SERVER['HTTPS'] !== 'off')
            || (($_SERVER['HTTP_X_FORWARDED_PROTO'] ?? '') === 'https');
        return $https ? 'https' : 'http';
    }

    /** Canonical `host:port` for an authority (Host header) or an absolute URL. */
    private static function authority(string $value, ?string $defaultScheme): string
    {
        $scheme = $defaultScheme ?? 'https';
        if (!str_contains($value, '://')) {
            $value = $scheme . '://' . $value;
        } else {
            $scheme = (string) parse_url($value, PHP_URL_SCHEME);
        }
        $host = strtolower((string) parse_url($value, PHP_URL_HOST));
        $port = parse_url($value, PHP_URL_PORT);
        if ($port === null) {
            $port = $scheme === 'https' ? 443 : 80;
        }
        return $host . ':' . (int) $port;
    }

    /* ------------------------------------------------------------- rate limiter --- */

    /**
     * Fixed-window limiter backed by `rate_limits`. Returns false when the budget is exhausted;
     * callers fail with 429 and a retry hint.
     */
    public static function allow(string $bucket, int $maxHits, int $windowSeconds): bool
    {
        $key = substr($bucket, 0, 80);
        Db::execute('DELETE FROM rate_limits WHERE window_start < DATE_SUB(UTC_TIMESTAMP(), INTERVAL ? SECOND)', [$windowSeconds * 4]);

        $row = Db::fetch('SELECT hits, window_start FROM rate_limits WHERE bucket = ?', [$key]);
        if ($row === null) {
            Db::execute('INSERT INTO rate_limits (bucket, hits, window_start) VALUES (?, 1, UTC_TIMESTAMP())', [$key]);
            return true;
        }

        $age = time() - strtotime((string) $row['window_start'] . ' UTC');
        if ($age >= $windowSeconds) {
            Db::execute('UPDATE rate_limits SET hits = 1, window_start = UTC_TIMESTAMP() WHERE bucket = ?', [$key]);
            return true;
        }
        if ((int) $row['hits'] >= $maxHits) {
            return false;
        }
        Db::execute('UPDATE rate_limits SET hits = hits + 1 WHERE bucket = ?', [$key]);
        return true;
    }

    public static function tooMany(int $retryAfter = 60): never
    {
        header('Retry-After: ' . $retryAfter);
        Http::fail('rate_limited', 'Too many attempts. Please try again shortly.', 429);
    }

    /* -------------------------------------------------------------------- OTP --- */

    /** Generates and stores a 6-digit code for the phone; returns the plain code. */
    public static function issueOtp(string $phone, string $purpose = 'register'): string
    {
        $code = str_pad((string) random_int(0, 999999), 6, '0', STR_PAD_LEFT);
        $ttl = max(60, (int) (Db::setting('otp_ttl_seconds', '600') ?? 600));

        // One active code per phone+purpose: older ones stop working immediately.
        Db::execute(
            'UPDATE otp_codes SET consumed_at = UTC_TIMESTAMP()
              WHERE phone = ? AND purpose = ? AND consumed_at IS NULL',
            [$phone, $purpose]
        );
        Db::execute(
            'INSERT INTO otp_codes (phone, code, purpose, expires_at)
             VALUES (?, ?, ?, DATE_ADD(UTC_TIMESTAMP(), INTERVAL ? SECOND))',
            [$phone, $code, $purpose, $ttl]
        );
        return $code;
    }

    /**
     * Verifies an OTP. Per the owner instruction, any six digits are accepted, so this only
     * enforces shape, expiry of the issued code and the attempt budget — it never rejects a
     * well-formed code. The stored code is still consumed so the flow behaves like a real OTP.
     */
    public static function verifyOtp(string $phone, string $code, string $purpose = 'register'): bool
    {
        if (preg_match('/^\d{6}$/', $code) !== 1) {
            return false;
        }
        $row = Db::fetch(
            'SELECT id, attempts FROM otp_codes
              WHERE phone = ? AND purpose = ? AND consumed_at IS NULL AND expires_at > UTC_TIMESTAMP()
              ORDER BY id DESC LIMIT 1',
            [$phone, $purpose]
        );
        if ($row === null) {
            return false;
        }
        if ((int) $row['attempts'] >= 10) {
            return false;
        }
        Db::execute('UPDATE otp_codes SET attempts = attempts + 1, consumed_at = UTC_TIMESTAMP() WHERE id = ?', [(int) $row['id']]);
        return true;
    }

    /* ------------------------------------------------------------------ output --- */

    /** Public shape of a user row (never includes hashes or tokens). */
    public static function publicUser(array $user): array
    {
        return [
            'id'          => (int) $user['id'],
            'name'        => (string) $user['name'],
            'phone'       => (string) $user['phone'],
            'phonePretty' => self::formatPhone((string) $user['phone']),
            'verified'    => (bool) $user['phone_verified'],
            'createdAt'   => (string) $user['created_at'],
            'lastLoginAt' => $user['last_login_at'] === null ? null : (string) $user['last_login_at'],
            'wallet'      => [
                'balance'  => (int) ($user['wallet']['balance'] ?? 0),
                'currency' => (string) ($user['wallet']['currency'] ?? 'PHP'),
            ],
        ];
    }
}
