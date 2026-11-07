<?php
/** Support — small shared helpers for the route handlers. */

declare(strict_types=1);

final class Support
{
    /** Resolves the internal device PK from the public UUID (null when unknown). */
    public static function devicePk(?string $deviceId): ?int
    {
        if ($deviceId === null || $deviceId === '') {
            return null;
        }
        $row = Db::fetch('SELECT id FROM devices WHERE device_id = ?', [$deviceId]);
        return $row === null ? null : (int) $row['id'];
    }

    /** The merchant configured in the database (first row is the active one). */
    public static function merchant(?string $requested = null): ?array
    {
        if ($requested !== null && $requested !== '') {
            $row = Db::meta($requested);
            if ($row !== null) {
                return $row;
            }
        }
        return Db::fetch('SELECT * FROM app_meta ORDER BY merchant LIMIT 1');
    }

    /** Enabled domain hosts for a merchant, ordered by priority (domainRoute payload). */
    public static function domainHosts(string $merchant, ?string $fallbackJson = null): array
    {
        $rows = Db::fetchAll(
            'SELECT host FROM domains WHERE merchant = ? AND enabled = 1 ORDER BY priority ASC, id ASC',
            [$merchant]
        );
        $hosts = array_map(static fn (array $row): string => (string) $row['host'], $rows);
        if ($hosts !== []) {
            return $hosts;
        }
        // Fall back to the manifest copy stored in app_meta when no domains are configured.
        $decoded = $fallbackJson !== null ? json_decode($fallbackJson, true) : null;
        return is_array($decoded) ? array_values(array_filter($decoded, 'is_string')) : [];
    }

    /** The scheme+host the current request arrived on (used by the development flag below). */
    public static function requestOrigin(): string
    {
        $host = (string) ($_SERVER['HTTP_HOST'] ?? '');
        if ($host === '') {
            return '';
        }
        $https = (!empty($_SERVER['HTTPS']) && $_SERVER['HTTPS'] !== 'off')
            || (($_SERVER['HTTP_X_FORWARDED_PROTO'] ?? '') === 'https');
        return ($https ? 'https' : 'http') . '://' . $host;
    }

    /**
     * Development helper (app.seed_from_request in config): makes a local/preview deployment
     * resolve itself even though the seeded domains point at the canonical host. Disabled by
     * default — production behaviour must return exactly the configured domain list.
     */
    public static function withRequestOrigin(array $hosts): array
    {
        $enabled = (bool) (Db::config()['app']['seed_from_request'] ?? false);
        $origin = self::requestOrigin();
        if (!$enabled || $origin === '') {
            return $hosts;
        }
        // In development the deployment resolves itself; stale seeded hosts would only add
        // failing candidates to every speed test.
        return [$origin];
    }

    /** Truncates to the column length so a malformed client cannot break an insert. */
    public static function clip(?string $value, int $length): ?string
    {
        if ($value === null) {
            return null;
        }
        return mb_substr($value, 0, $length);
    }
}
