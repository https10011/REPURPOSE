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
