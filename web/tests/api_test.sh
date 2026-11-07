#!/usr/bin/env bash
# Endpoint contract tests for the reconstructed shell backend.
#
#   ./tests/api_test.sh [base-url]
#
# Requires: curl, python3. Expects a running server (bin/serve.sh) and a migrated database.
set -uo pipefail

BASE="${1:-http://127.0.0.1:3000}"
PASS=0
FAIL=0
DEVICE_ID="11111111-2222-4333-8444-555555555555"

jqget() { # jqget <json> <python-expression over `d`>
  python3 -c "import json,sys; d=json.loads(sys.argv[1]); print(eval(sys.argv[2]))" "$1" "$2" 2>/dev/null
}

check() { # check <label> <expected> <actual>
  if [ "$2" = "$3" ]; then
    PASS=$((PASS + 1))
    printf '  ok   %-58s %s\n' "$1" "$3"
  else
    FAIL=$((FAIL + 1))
    printf '  FAIL %-58s expected=%s actual=%s\n' "$1" "$2" "$3"
  fi
}

request() { # request <method> <path> [body] -> prints "status|body"
  local method="$1" path="$2" body="${3:-}"
  if [ -n "$body" ]; then
    curl -s -o /tmp/sige77_body.$$ -w '%{http_code}' -X "$method" -H 'Content-Type: application/json' \
      --data "$body" "${BASE}${path}"
  else
    curl -s -o /tmp/sige77_body.$$ -w '%{http_code}' -X "$method" "${BASE}${path}"
  fi
  echo -n '|'
  cat /tmp/sige77_body.$$
  rm -f /tmp/sige77_body.$$
}

status_of() { echo "${1%%|*}"; }
body_of() { echo "${1#*|}"; }

echo "API contract tests against ${BASE}"

# --- health -----------------------------------------------------------------
R=$(request GET /api/health)
check "GET /api/health status" 200 "$(status_of "$R")"
check "GET /api/health db=true" True "$(jqget "$(body_of "$R")" "d['value']['db']")"
check "GET /api/health has app_meta" True "$(jqget "$(body_of "$R")" "'app_meta' in d['value']['tables']")"

# --- original merchant contract ---------------------------------------------
R=$(request GET '/wps/system/domainRoute?device=1&agentName=')
check "GET /wps/system/domainRoute status" 200 "$(status_of "$R")"
check "domainRoute success envelope" True "$(jqget "$(body_of "$R")" "d['success']")"
check "domainRoute has domainList" True "$(jqget "$(body_of "$R")" "isinstance(d['value']['domainList'], list)")"
check "domainRoute item shape" True "$(jqget "$(body_of "$R")" "'domainName' in d['value']['domainList'][0]")"
check "domainRoute has splash key" True "$(jqget "$(body_of "$R")" "'splash' in d['value']")"

# --- app config -------------------------------------------------------------
R=$(request GET /api/app/config)
check "GET /api/app/config status" 200 "$(status_of "$R")"
check "config version" "2.4.87" "$(jqget "$(body_of "$R")" "d['value']['version']")"
check "config merchant" "sige7tlbf5" "$(jqget "$(body_of "$R")" "d['value']['merchant']")"
check "config fallback list non-empty" True "$(jqget "$(body_of "$R")" "len(d['value']['merchantUrls']) > 0")"

R=$(request GET '/api/app/latest?os=android')
check "GET /api/app/latest status" 200 "$(status_of "$R")"
R=$(request GET '/api/app/latest?os=ios')
check "GET /api/app/latest rejects ios" 422 "$(status_of "$R")"

# --- device registration ----------------------------------------------------
R=$(request POST /api/device/register "{\"device_id\":\"${DEVICE_ID}\",\"gaid\":\"gaid-test\",\"user_agent\":\"api-test\",\"version\":\"2.4.87\",\"merchant\":\"sige7tlbf5\"}")
check "POST /api/device/register status" 200 "$(status_of "$R")"
check "device register echoes id" "$DEVICE_ID" "$(jqget "$(body_of "$R")" "d['value']['device_id']")"
R=$(request POST /api/device/register '{"device_id":"not-a-uuid!"}')
check "device register rejects bad id" 422 "$(status_of "$R")"

# --- session ----------------------------------------------------------------
R=$(request POST /api/session "{\"device_id\":\"${DEVICE_ID}\",\"resolved_host\":\"https://example.test\",\"resolution_ms\":42,\"resolver_path\":\"route\"}")
check "POST /api/session status" 200 "$(status_of "$R")"
R=$(request POST /api/session "{\"device_id\":\"${DEVICE_ID}\",\"resolved_host\":\"https://example.test\",\"resolver_path\":\"teleport\"}")
check "session rejects unknown resolver_path" 422 "$(status_of "$R")"
R=$(request POST /api/session "{\"device_id\":\"${DEVICE_ID}\",\"resolver_path\":\"route\"}")
check "session requires resolved_host" 422 "$(status_of "$R")"

# --- events -----------------------------------------------------------------
R=$(request POST /api/collect/event "{\"device_id\":\"${DEVICE_ID}\",\"name\":\"register\",\"params\":{\"value\":10},\"channels\":[\"firebase\",\"appsflyer\",\"openinstall\",\"bogus\"]}")
check "POST /api/collect/event status" 200 "$(status_of "$R")"
R=$(request POST /api/collect/event '{"name":"bad name!"}')
check "event rejects invalid name" 422 "$(status_of "$R")"
R=$(request POST /api/collect/event '{"name":"ok","params":"not-an-object"}')
check "event rejects non-object params" 422 "$(status_of "$R")"

# --- logs -------------------------------------------------------------------
R=$(request POST /api/log "{\"device_id\":\"${DEVICE_ID}\",\"entries\":[{\"level\":\"info\",\"message\":\"api test entry\"},{\"level\":\"warn\",\"message\":\"second\"}]}")
check "POST /api/log batch status" 200 "$(status_of "$R")"
check "log batch stored count" 2 "$(jqget "$(body_of "$R")" "d['value']['stored']")"
R=$(request POST /api/log '{"level":"apocalyptic","message":"x"}')
check "log rejects invalid level" 422 "$(status_of "$R")"
R=$(request POST /api/log '{"entries":[]}')
check "log rejects empty batch" 422 "$(status_of "$R")"

# --- domain report ----------------------------------------------------------
R=$(request POST /api/domain/report '{"host":"https://example.test","ok":true,"latency_ms":120,"http_status":200}')
check "POST /api/domain/report status" 200 "$(status_of "$R")"
R=$(request POST /api/domain/report '{"host":"nonsense","ok":true}')
check "domain report rejects bad host" 422 "$(status_of "$R")"

# --- blacklist --------------------------------------------------------------
R=$(request POST /api/blacklist "{\"device_id\":\"${DEVICE_ID}\",\"url\":\"https://hijacked.test\",\"reason\":\"hijack:keywords\"}")
check "POST /api/blacklist status" 200 "$(status_of "$R")"

# --- push -------------------------------------------------------------------
R=$(request POST /api/push/subscribe "{\"device_id\":\"${DEVICE_ID}\",\"endpoint\":\"https://push.test/abc\",\"keys\":{\"p256dh\":\"k\",\"auth\":\"a\"}}")
check "POST /api/push/subscribe status" 200 "$(status_of "$R")"
R=$(request POST /api/push/subscribe "{\"device_id\":\"${DEVICE_ID}\",\"endpoint\":\"https://push.test/abc\"}")
check "push requires keys" 422 "$(status_of "$R")"

# --- addendum A: local accounts, OTP, catalog, games ------------------------
JAR=$(mktemp)
PHONE="0917$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
SO=( -H "Origin: ${BASE}" )

arequest() { # arequest <method> <path> [body] -> status|body (cookie jar + same-origin header)
  local method="$1" path="$2" body="${3:-}"
  if [ -n "$body" ]; then
    curl -s -o /tmp/sige77_auth.$$ -w '%{http_code}' -b "$JAR" -c "$JAR" "${SO[@]}" \
      -H 'Content-Type: application/json' -X "$method" --data "$body" "${BASE}${path}"
  else
    curl -s -o /tmp/sige77_auth.$$ -w '%{http_code}' -b "$JAR" -c "$JAR" "${SO[@]}" -X "$method" "${BASE}${path}"
  fi
  echo -n '|'
  cat /tmp/sige77_auth.$$
  rm -f /tmp/sige77_auth.$$
}

R=$(arequest GET /api/auth/session)
check "auth: anonymous session" False "$(jqget "$(body_of "$R")" "d['value']['authenticated']")"

R=$(arequest POST /api/auth/register "{\"name\":\"Test Player\",\"phone\":\"${PHONE}\",\"password\":\"secret123\",\"passwordConfirm\":\"secret123\"}")
check "auth: register status" 200 "$(status_of "$R")"
check "auth: register normalises phone" "+63${PHONE#0}" "$(jqget "$(body_of "$R")" "d['value']['phone']")"
check "auth: register requires otp" True "$(jqget "$(body_of "$R")" "d['value']['otpRequired']")"
check "auth: register returns 6-digit otp" 6 "$(jqget "$(body_of "$R")" "len(d['value']['otp']['code'])")"

R=$(arequest POST /api/auth/register "{\"name\":\"Test Player\",\"phone\":\"${PHONE}\",\"password\":\"secret123\"}")
check "auth: duplicate phone -> 409" 409 "$(status_of "$R")"
R=$(arequest POST /api/auth/register "{\"name\":\"X\",\"phone\":\"${PHONE}9\",\"password\":\"secret123\"}")
check "auth: name too short -> 422" 422 "$(status_of "$R")"
R=$(arequest POST /api/auth/register "{\"name\":\"Short Pass\",\"phone\":\"${PHONE}8\",\"password\":\"short\"}")
check "auth: weak password -> 422" 422 "$(status_of "$R")"
R=$(arequest POST /api/auth/register "{\"name\":\"Mismatch\",\"phone\":\"${PHONE}7\",\"password\":\"secret123\",\"passwordConfirm\":\"secret124\"}")
check "auth: password mismatch -> 422" 422 "$(status_of "$R")"

R=$(arequest POST /api/auth/otp/request "{\"phone\":\"${PHONE}\"}")
check "otp: request status" 200 "$(status_of "$R")"
check "otp: request returns code" 6 "$(jqget "$(body_of "$R")" "len(d['value']['code'])")"
R=$(arequest POST /api/auth/otp/verify "{\"phone\":\"${PHONE}\",\"code\":\"12\"}")
check "otp: malformed code -> 422" 422 "$(status_of "$R")"
R=$(arequest POST /api/auth/otp/verify "{\"phone\":\"${PHONE}\",\"code\":\"000000\"}")
check "otp: any six digits accepted" 200 "$(status_of "$R")"
check "otp: account verified" True "$(jqget "$(body_of "$R")" "d['value']['user']['verified']")"
check "otp: opening balance" 1000 "$(jqget "$(body_of "$R")" "d['value']['user']['wallet']['balance']")"

R=$(arequest GET /api/auth/session)
check "auth: session after verify" True "$(jqget "$(body_of "$R")" "d['value']['authenticated']")"

R=$(request GET /api/games)
check "games: catalog status" 200 "$(status_of "$R")"
check "games: catalog slugs" "['crash', 'dice', 'slots', 'live-casino']" "$(jqget "$(body_of "$R")" "[g['slug'] for g in d['value']['games']]")"
check "games: blocked entry present" True "$(jqget "$(body_of "$R")" "'blocked' in [g['status'] for g in d['value']['games']]")"
R=$(request GET '/api/games?category=originals')
check "games: category filter" 3 "$(jqget "$(body_of "$R")" "len(d['value']['games'])")"
R=$(request GET '/api/games?q=reels')
check "games: search filter" "['slots']" "$(jqget "$(body_of "$R")" "[g['slug'] for g in d['value']['games']]")"

R=$(arequest GET /api/account)
check "account: requires session" 200 "$(status_of "$R")"
check "account: wallet balance" 1000 "$(jqget "$(body_of "$R")" "d['value']['user']['wallet']['balance']")"
check "account: daily credits advertised" 500 "$(jqget "$(body_of "$R")" "d['value']['dailyCredits']['amount']")"
check "account: not yet claimed today" False "$(jqget "$(body_of "$R")" "d['value']['dailyCredits']['claimedToday']")"

R=$(arequest POST /api/wallet/claim '{}')
check "claim: first claim status" 200 "$(status_of "$R")"
check "claim: grants the allowance" 500 "$(jqget "$(body_of "$R")" "d['value']['granted']")"
check "claim: balance credited" 1500 "$(jqget "$(body_of "$R")" "d['value']['balance']")"
R=$(arequest POST /api/wallet/claim '{}')
check "claim: second claim is a no-op" 0 "$(jqget "$(body_of "$R")" "d['value']['granted']")"
check "claim: balance unchanged" 1500 "$(jqget "$(body_of "$R")" "d['value']['balance']")"
check "claim: reported as claimed" True "$(jqget "$(body_of "$R")" "d['value']['claimedToday']")"
R=$(arequest GET /api/account)
check "claim: account reflects claim" True "$(jqget "$(body_of "$R")" "d['value']['dailyCredits']['claimedToday']")"
check "claim: ledger did not change stats" 0 "$(jqget "$(body_of "$R")" "d['value']['stats']['rounds']")"
# Claiming must not be a cross-site write.
R=$(curl -s -b "$JAR" -H 'Content-Type: application/json' -X POST --data '{}' -w '|%{http_code}' "${BASE}/api/wallet/claim")
check "claim: cross-site refused -> 403" 403 "$(echo "$R" | sed 's/.*|//')"

R=$(arequest POST /api/games/play '{"slug":"dice","stake":100,"target":50,"direction":"under"}')
check "play: dice status" 200 "$(status_of "$R")"
check "play: balance arithmetic" True "$(jqget "$(body_of "$R")" "d['value']['balance'] == 1500 - 100 + d['value']['payout']")"
R=$(arequest POST /api/games/play '{"slug":"slots","stake":50}')
check "play: slots status" 200 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"crash","stake":25,"autoCashout":1.5}')
check "play: crash status" 200 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"dice","stake":5,"target":50}')
check "play: stake below minimum -> 422" 422 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"dice","stake":100,"target":99}')
check "play: target out of range -> 422" 422 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"live-casino","stake":50}')
check "play: blocked game -> 409" 409 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"dice","stake":10000,"target":50}')
check "play: insufficient balance -> 402" 402 "$(status_of "$R")"
R=$(arequest POST /api/games/play '{"slug":"nope","stake":50}')
check "play: unknown game -> 404" 404 "$(status_of "$R")"

R=$(arequest GET /api/games/history)
check "history: rounds recorded" 3 "$(jqget "$(body_of "$R")" "len(d['value']['rounds'])")"

R=$(arequest GET /api/notifications)
check "notifications: welcome stored" True "$(jqget "$(body_of "$R")" "'Account verified' in [n['title'] for n in d['value']['notifications']]")"
check "notifications: claim recorded" True "$(jqget "$(body_of "$R")" "'Demo credits added' in [n['title'] for n in d['value']['notifications']]")"
R=$(arequest POST /api/notifications '{"all":true}')
check "notifications: mark read" True "$(jqget "$(body_of "$R")" "d['value']['markedRead']")"

# Cross-site write with a live cookie must be refused (no Origin header at all).
R=$(curl -s -b "$JAR" -H 'Content-Type: application/json' -X POST --data '{"slug":"dice","stake":50,"target":50}' -w '|%{http_code}' "${BASE}/api/games/play")
check "security: write without origin -> 403" 403 "$(echo "$R" | sed 's/.*|//')"
# Foreign origin is refused as well.
R=$(curl -s -b "$JAR" -H 'Origin: https://evil.test' -H 'Content-Type: application/json' -X POST --data '{"slug":"dice","stake":50,"target":50}' -w '|%{http_code}' "${BASE}/api/games/play")
check "security: foreign origin -> 403" 403 "$(echo "$R" | sed 's/.*|//')"

R=$(arequest GET /api/account)
BALANCE_BEFORE_LOGOUT=$(jqget "$(body_of "$R")" "d['value']['user']['wallet']['balance']")
R=$(arequest POST /api/auth/logout)
check "auth: logout status" 200 "$(status_of "$R")"
R=$(arequest GET /api/auth/session)
check "auth: session revoked" False "$(jqget "$(body_of "$R")" "d['value']['authenticated']")"
R=$(arequest POST /api/auth/login "{\"phone\":\"${PHONE}\",\"password\":\"wrong-pass\"}")
check "auth: wrong password -> 401" 401 "$(status_of "$R")"
R=$(arequest POST /api/auth/login "{\"phone\":\"${PHONE}\",\"password\":\"secret123\"}")
check "auth: login status" 200 "$(status_of "$R")"
R=$(arequest GET /api/account)
check "auth: session after login" 200 "$(status_of "$R")"
check "auth: balance survives login" "$BALANCE_BEFORE_LOGOUT" "$(jqget "$(body_of "$R")" "d['value']['user']['wallet']['balance']")"
rm -f "$JAR"

# --- routing errors ---------------------------------------------------------
R=$(request POST /api/app/config '{}')
check "POST on GET route -> 405" 405 "$(status_of "$R")"
R=$(request GET /api/does-not-exist)
check "unknown path -> 404" 404 "$(status_of "$R")"
R=$(request GET /api/health)
check "error envelope shape" False "$(jqget "$(body_of "$(request GET /api/does-not-exist)")" "d['success']")"

echo
echo "passed: ${PASS}, failed: ${FAIL}"
[ "$FAIL" -eq 0 ]
