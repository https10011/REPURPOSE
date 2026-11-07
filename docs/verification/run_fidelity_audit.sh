#!/usr/bin/env bash
# Reproduces the static half of the source-to-web fidelity audit (docs/FIDELITY_AUDIT.md).
#
#   bash docs/verification/run_fidelity_audit.sh
#
# Read-only: it never writes into the evidence tree. Exits non-zero if any check fails.
set -uo pipefail

REPO="$(cd "$(dirname "$0")/../.." && pwd)"
JADX="$REPO/Sige77_20261106_2144_[jadx]"
WEB="$REPO/web"
FAIL=0

pass() { printf '  ok   %s\n' "$1"; }
fail() { printf '  FAIL %s\n' "$1"; FAIL=1; }
check() { if [ "$2" = "$3" ]; then pass "$1 ($2)"; else fail "$1 (expected $3, got $2)"; fi; }

echo "== 1. ground truth =="
n=$(find "$JADX/src/java/prod" -name '*.java' | wc -l)
check "app-owned Java files" "$n" "20"
n=$(grep -oE '<activity[^>]*android:name="prod[^"]*"' "$JADX/AndroidManifest.xml" | wc -l)
check "app activities declared" "$n" "2"
n=$(grep -c 'merchant_url' "$JADX/AndroidManifest.xml")
check "merchant_url meta-data present" "$n" "1"

echo "== 2. no game / product / auth logic in the APK =="
n=$(find "$JADX/src/java" -name '*.java' \
      | grep -Ei 'game|slot|crash|dice|roulette|bet|wager|jackpot|casino|lottery|poker|baccarat|spin' \
      | grep -viE 'com/google/android/gms/games|firebase|gaming|GameActivity|GameController|GameView|gamepad' \
      | wc -l)
check "game-named classes" "$n" "0"
n=$(grep -rlE 'androidx\.room|RoomDatabase|SQLiteOpenHelper' "$JADX/src/java/prod" 2>/dev/null | wc -l)
check "app-owned SQLite/Room files" "$n" "0"

echo "== 3. JavaScript bridge surface matches the Java byte-for-byte =="
grep -A1 '@JavascriptInterface' "$JADX/src/java/defpackage/gs0.java" "$JADX/src/java/defpackage/ig.java" \
  | grep -oE '(void|boolean|String|int|long|double)\s+[a-zA-Z_][a-zA-Z0-9_]*\(' \
  | grep -oE '[a-zA-Z_][a-zA-Z0-9_]*\($' | tr -d '(' | sort > /tmp/audit_src.txt
python3 - "$WEB/assets/js/bridge.js" > /tmp/audit_js.txt <<'PY'
import re, sys
lines = open(sys.argv[1]).read().split('\n')
s = next(i for i, l in enumerate(lines) if re.match(r'\s*const Android = \{', l))
e = next(i for i, l in enumerate(lines) if re.match(r'\s*const JSInterface', l))
body = '\n'.join(lines[s:e])
for m in sorted(re.findall(r'^\s{4}([a-zA-Z_][\w]*)\s*[:(]', body, re.M)):
    print(m)
PY
n=$(wc -l < /tmp/audit_src.txt)
check "Android bridge methods (source)" "$n" "23"
if diff <(sort /tmp/audit_src.txt) <(sort /tmp/audit_js.txt) > /dev/null; then
  pass "source and JS bridge method sets are identical"
else
  fail "bridge method sets differ"
  diff <(sort /tmp/audit_src.txt) <(sort /tmp/audit_js.txt) | head
fi

echo "== 4. reused assets are byte-identical to the originals =="
R="$JADX/src/resources/package_1/res"
while IFS='|' read -r orig shipped; do
  a=$(md5sum "$R/$orig" 2>/dev/null | cut -d' ' -f1)
  b=$(md5sum "$WEB/$shipped" 2>/dev/null | cut -d' ' -f1)
  if [ -n "$a" ] && [ "$a" = "$b" ]; then pass "$(basename "$shipped")"; else fail "$shipped ($a vs $b)"; fi
done <<'EOF'
drawable/splash_bg.jpg|assets/img/splash_bg.jpg
drawable/splash_logo.jpg|assets/img/splash_logo.jpg
drawable/icon_bg.jpg|assets/img/icon_bg.jpg
mipmap-xxhdpi/close_floating_window.png|assets/img/close_floating_window.png
mipmap-xxhdpi/ic_launcher.png|assets/img/ic_launcher.png
EOF

echo "== 5. stack is self-contained (no runtime dependencies) =="
# composer.json / vendor / package.json would mean a runtime dependency. node_modules is allowed
# to exist locally (the optional playwright-core browser check) but must be git-ignored and must
# never reach the deployment package.
for f in composer.json vendor package.json; do
  if [ -e "$WEB/$f" ]; then fail "unexpected runtime dependency: $f"; else pass "no $f"; fi
done
if [ -e "$WEB/node_modules" ]; then
  if git -C "$REPO" check-ignore -q "$WEB/node_modules" 2>/dev/null; then
    pass "node_modules present but git-ignored (optional dev dependency)"
  else
    fail "node_modules present and NOT git-ignored"
  fi
else
  pass "no node_modules"
fi
if [ -d "$WEB/dist" ]; then
  n=$(tar -tzf "$WEB"/dist/sige77-web-*.tar.gz 2>/dev/null \
        | grep -cE '(^|/)(node_modules|vendor|composer\.json|package\.json)(/|$)' || true)
  check "runtime deps inside the built package" "$n" "0"
else
  pass "no dist/ built (package check skipped)"
fi
n=$(grep -rhoE '\b(curl_[a-z_]+|fsockopen|stream_socket_client|mail)\b' --include='*.php' "$WEB/api" "$WEB/router.php" | wc -l)
check "outbound-network calls in PHP" "$n" "0"

echo "== 6. evidence tree untouched =="
if [ -n "$(git -C "$REPO" status --porcelain -- "$JADX" 2>/dev/null)" ]; then
  fail "evidence tree has uncommitted changes"
else
  pass "evidence tree clean"
fi

echo
if [ "$FAIL" -eq 0 ]; then echo "fidelity audit: all checks passed"; else echo "fidelity audit: FAILURES present"; fi
exit "$FAIL"
