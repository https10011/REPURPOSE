<?php
/**
 * Router — minimal exact-match router.
 *
 * The shell contract has a fixed set of paths (the reconstructed `/wps/system/domainRoute`
 * plus the `/api/*` endpoints), so pattern matching would be unnecessary complexity.
 */

declare(strict_types=1);

final class Router
{
    /** @var array<string, array<string, callable>> */
    private array $routes = [];

    public function add(string $method, string $path, callable $handler): void
    {
        $this->routes[strtoupper($method)][$path] = $handler;
    }

    public function get(string $path, callable $handler): void
    {
        $this->add('GET', $path, $handler);
    }

    public function post(string $path, callable $handler): void
    {
        $this->add('POST', $path, $handler);
    }

    public function dispatch(): void
    {
        $method = Http::method();
        $path = Http::path();

        if ($method === 'OPTIONS') {
            Http::cors();
            http_response_code(204);
            return;
        }

        $handler = $this->routes[$method][$path] ?? null;
        if ($handler === null) {
            // Distinguish "wrong method" from "unknown path" for clear diagnostics.
            foreach ($this->routes as $allowedMethod => $paths) {
                if (isset($paths[$path])) {
                    header('Allow: ' . $allowedMethod);
                    Http::fail('method_not_allowed', 'Method not allowed for this endpoint.', 405);
                }
            }
            Http::fail('not_found', 'Unknown endpoint.', 404);
        }

        $handler();
        // Handlers always terminate through Http::ok()/Http::fail(); reaching this point means
        // the handler returned without producing a response.
        Http::fail('empty_response', 'Endpoint produced no response.', 500);
    }
}
