<?php
/**
 * Http — request parsing, validation helpers and JSON responses.
 */

declare(strict_types=1);

final class Http
{
    private static ?array $json = null;

    public static function method(): string
    {
        return strtoupper($_SERVER['REQUEST_METHOD'] ?? 'GET');
    }

    public static function path(): string
    {
        $uri = $_SERVER['REQUEST_URI'] ?? '/';
        $path = parse_url($uri, PHP_URL_PATH) ?: '/';
        // Normalise: strip trailing slash (except root) and duplicate slashes.
        $path = '/' . trim(preg_replace('#/+#', '/', $path), '/');
        return $path;
    }

    public static function query(string $key, ?string $default = null): ?string
    {
        $value = $_GET[$key] ?? null;
        if ($value === null) {
            return $default;
        }
        return is_string($value) ? trim($value) : $default;
    }

    public static function queryInt(string $key, ?int $default = null): ?int
    {
        $value = self::query($key);
        if ($value === null || $value === '') {
            return $default;
        }
        return preg_match('/^-?\d+$/', $value) === 1 ? (int) $value : $default;
    }

    /** Decoded JSON body (object shape only); empty body yields []. */
    public static function body(): array
    {
        if (self::$json !== null) {
            return self::$json;
        }
        $max = (int) (Db::config()['app']['max_body_bytes'] ?? 32768);
        $raw = file_get_contents('php://input');
        if ($raw === false) {
            $raw = '';
        }
        if (strlen($raw) > $max) {
            self::fail('payload_too_large', 'Request body exceeds the allowed size.', 413);
        }
        if (trim($raw) === '') {
            self::$json = [];
            return self::$json;
        }
        $decoded = json_decode($raw, true);
        if (!is_array($decoded)) {
            self::fail('invalid_json', 'Request body must be a JSON object.', 400);
        }
        self::$json = $decoded;
        return self::$json;
    }

    public static function input(string $key, mixed $default = null): mixed
    {
        $body = self::body();
        return array_key_exists($key, $body) ? $body[$key] : $default;
    }

    public static function inputString(string $key, int $maxLength = 255, ?string $default = null): ?string
    {
        $value = self::input($key, $default);
        if ($value === null) {
            return null;
        }
        if (!is_scalar($value)) {
            self::fail('invalid_field', "Field '$key' must be a string.", 422);
        }
        $value = trim((string) $value);
        return $value === '' ? null : mb_substr($value, 0, $maxLength);
    }

    public static function inputInt(string $key, ?int $default = null): ?int
    {
        $value = self::input($key, $default);
        if ($value === null || $value === '') {
            return $default;
        }
        if (is_int($value)) {
            return $value;
        }
        if (is_string($value) && preg_match('/^-?\d+$/', $value) === 1) {
            return (int) $value;
        }
        if (is_float($value)) {
            return (int) $value;
        }
        self::fail('invalid_field', "Field '$key' must be an integer.", 422);
    }

    public static function inputBool(string $key, bool $default = false): bool
    {
        $value = self::input($key, null);
        if ($value === null) {
            return $default;
        }
        if (is_bool($value)) {
            return $value;
        }
        return in_array($value, [1, '1', 'true', 'yes'], true);
    }

    public static function requireMethod(string ...$allowed): void
    {
        if (!in_array(self::method(), $allowed, true)) {
            header('Allow: ' . implode(', ', $allowed));
            self::fail('method_not_allowed', 'Method not allowed for this endpoint.', 405);
        }
    }

    public static function clientIp(): string
    {
        return substr((string) ($_SERVER['REMOTE_ADDR'] ?? ''), 0, 45);
    }

    public static function ok(array $value = [], array $extra = []): never
    {
        self::json(array_merge(['success' => true, 'value' => $value], $extra), 200);
    }

    public static function fail(string $code, string $message, int $status = 400): never
    {
        self::json(['success' => false, 'error' => ['code' => $code, 'message' => $message]], $status);
    }

    public static function json(array $payload, int $status = 200): never
    {
        if (!headers_sent()) {
            http_response_code($status);
            header('Content-Type: application/json; charset=utf-8');
            header('Cache-Control: no-store, no-cache, must-revalidate');
            header('X-Content-Type-Options: nosniff');
        }
        echo json_encode($payload, JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE);
        exit;
    }

    /** CORS for the shell's own API (same-origin by default; harmless when set). */
    public static function cors(): void
    {
        if (headers_sent()) {
            return;
        }
        $origin = $_SERVER['HTTP_ORIGIN'] ?? '';
        if ($origin !== '') {
            header('Access-Control-Allow-Origin: ' . $origin);
            header('Vary: Origin');
            header('Access-Control-Allow-Methods: GET, POST, OPTIONS');
            header('Access-Control-Allow-Headers: Content-Type, ModuleId, Accept');
            header('Access-Control-Allow-Credentials: true');
        }
        if (self::method() === 'OPTIONS') {
            http_response_code(204);
            exit;
        }
    }
}
