#!/usr/bin/env bash
# Development server for the reconstructed shell.
#
#   ./bin/serve.sh [port]
#
# Starts PHP's built-in server on 0.0.0.0:<port> with router.php (API + static files) and writes
# its output to var/php-server.log. Stop it with:  kill "$(cat var/php-server.pid)"
set -euo pipefail

cd "$(dirname "$0")/.."
PORT="${1:-8099}"
PHP_BIN="${PHP_BIN:-php}"
mkdir -p var

if [ -f var/php-server.pid ] && kill -0 "$(cat var/php-server.pid)" 2>/dev/null; then
  echo "server already running on port ${PORT} (pid $(cat var/php-server.pid))"
  exit 0
fi

nohup "$PHP_BIN" -S "0.0.0.0:${PORT}" router.php > var/php-server.log 2>&1 &
echo $! > var/php-server.pid
echo "started php -S 0.0.0.0:${PORT} (pid $(cat var/php-server.pid)), log: var/php-server.log"

for _ in $(seq 1 50); do
  if curl -fsS "http://127.0.0.1:${PORT}/api/health" >/dev/null 2>&1; then
    echo "ready: http://127.0.0.1:${PORT}/"
    exit 0
  fi
  sleep 0.2
done

echo "server did not become ready; last log lines:" >&2
tail -20 var/php-server.log >&2
exit 1
