<?php
/**
 * Db — PDO factory for the shell backend.
 *
 * All queries in the project use prepared statements; emulation is disabled so the driver
 * validates parameter binding (and therefore data types) server-side.
 */

declare(strict_types=1);

final class Db
{
    private static ?PDO $pdo = null;

    public static function config(): array
    {
        static $config = null;
        if ($config === null) {
            $config = require dirname(__DIR__, 2) . '/config/config.php';
        }
        return $config;
    }

    public static function dsn(bool $withDatabase = true): string
    {
        $db = self::config()['db'];
        $parts = [];
        if (!empty($db['socket'])) {
            $parts[] = 'unix_socket=' . $db['socket'];
        } else {
            $parts[] = 'host=' . $db['host'];
            $parts[] = 'port=' . (int) $db['port'];
        }
        if ($withDatabase) {
            $parts[] = 'dbname=' . $db['name'];
        }
        $parts[] = 'charset=' . ($db['charset'] ?? 'utf8mb4');
        return 'mysql:' . implode(';', $parts);
    }

    public static function pdo(): PDO
    {
        if (self::$pdo instanceof PDO) {
            return self::$pdo;
        }
        $db = self::config()['db'];
        self::$pdo = new PDO(self::dsn(true), $db['user'], $db['pass'], [
            PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
            PDO::ATTR_EMULATE_PREPARES   => false,
            PDO::ATTR_STRINGIFY_FETCHES  => false,
        ]);
        return self::$pdo;
    }

    /** Connection without a selected database (used by the migration runner). */
    public static function server(): PDO
    {
        $db = self::config()['db'];
        return new PDO(self::dsn(false), $db['user'], $db['pass'], [
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
        ]);
    }

    public static function dbName(): string
    {
        return (string) self::config()['db']['name'];
    }

    /** Convenience helpers ------------------------------------------------------ */

    public static function fetch(string $sql, array $params = []): ?array
    {
        $stmt = self::pdo()->prepare($sql);
        $stmt->execute($params);
        $row = $stmt->fetch();
        return $row === false ? null : $row;
    }

    public static function fetchAll(string $sql, array $params = []): array
    {
        $stmt = self::pdo()->prepare($sql);
        $stmt->execute($params);
        return $stmt->fetchAll();
    }

    public static function execute(string $sql, array $params = []): int
    {
        $stmt = self::pdo()->prepare($sql);
        $stmt->execute($params);
        return $stmt->rowCount();
    }

    public static function setting(string $key, ?string $default = null): ?string
    {
        $row = self::fetch('SELECT v FROM settings WHERE k = ?', [$key]);
        return $row === null ? $default : (string) $row['v'];
    }

    public static function meta(string $merchant): ?array
    {
        return self::fetch('SELECT * FROM app_meta WHERE merchant = ?', [$merchant]);
    }
}
