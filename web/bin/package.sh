#!/usr/bin/env bash
# Builds the shared-hosting upload package.
#
#   ./bin/package.sh [--origin=https://your-domain.example]
#
# Produces, under web/dist/:
#   sige77-web-<date>.tar.gz   uploadable tree (extracts to sige77/)
#   database.sql               schema + seed for phpMyAdmin import
#   DEPLOY.txt                 step-by-step deployment notes
#
# The package deliberately excludes everything that must not be reachable from the web root:
# tests, CLI helpers, the local harness, the machine-specific config and the runtime logs.
set -euo pipefail

cd "$(dirname "$0")/.."
WEB_DIR="$(pwd)"
DIST="$WEB_DIR/dist"
STAMP="$(date +%Y%m%d)"
ORIGIN="https://your-domain.example"

for arg in "$@"; do
  case "$arg" in
    --origin=*) ORIGIN="${arg#--origin=}" ;;
    -h|--help) echo "usage: $0 [--origin=https://host]"; exit 0 ;;
    *) echo "unknown option: $arg" >&2; exit 1 ;;
  esac
done

if [[ ! "$ORIGIN" =~ ^https?://[^/]+$ ]]; then
  echo "invalid --origin (expected scheme://host, no trailing slash): $ORIGIN" >&2
  exit 1
fi

rm -rf "$DIST"
mkdir -p "$DIST"

# ---------------------------------------------------------------- file tree ---
STAGE="$(mktemp -d)"
trap 'rm -rf "$STAGE"' EXIT
ROOT="$STAGE/sige77"
mkdir -p "$ROOT"

# Files and directories that ship to the hosting account.
cp -R index.html open-web.html sw.js router.php .htaccess m assets api sql "$ROOT/"

# Ship the example config only; config.php/config.local.php stay behind (they hold the local DB
# credentials and would overwrite the operator's own values).
mkdir -p "$ROOT/config"
cp config/config.example.php "$ROOT/config/"

# Belt and braces: the .htaccess denies these paths, but they must not be uploaded at all.
rm -rf "$ROOT/tests" "$ROOT/harness" "$ROOT/bin" "$ROOT/var" "$ROOT/node_modules" 2>/dev/null || true
find "$ROOT" -name '*.log' -delete 2>/dev/null || true

# ---------------------------------------------------------------- database ---
{
  echo "-- Sige77 reconstruction — full database import for phpMyAdmin."
  echo "-- Generated $(date -u +%Y-%m-%dT%H:%MZ) by bin/package.sh."
  echo "--"
  echo "-- 1. Create the database in the control panel (MySQL Databases)."
  echo "-- 2. Import this file into that database."
  echo "-- 3. The schema is idempotent; importing twice is safe."
  echo "--"
  echo "-- The seeded domain row points at the deployment origin below. Change it if the site is"
  echo "-- served from a different host, otherwise the in-app domain resolver has nothing to reach."
  echo "--"
  echo "-- Deployment origin baked into this file: ${ORIGIN}"
  echo
  echo "SET NAMES utf8mb4;"
  echo "SET FOREIGN_KEY_CHECKS = 0;"
  echo
  cat sql/schema.sql
  echo
  sed "s#{{ORIGIN}}#${ORIGIN}#g" sql/seed.sql
  echo
  echo "SET FOREIGN_KEY_CHECKS = 1;"
} > "$DIST/database.sql"

# ---------------------------------------------------------------- deploy notes ---
cat > "$DIST/DEPLOY.txt" <<EOF
Sige77 web reconstruction — shared-hosting deployment
=====================================================
Built: $(date -u +%Y-%m-%dT%H:%MZ)
Target origin: ${ORIGIN}

Requirements
------------
* PHP 8.1 or newer with the pdo_mysql, json, mbstring, session and filter extensions.
  (No Composer, no npm, no external services are required at runtime.)
* MySQL 5.7+/MariaDB 10.4+ (MySQL 8 and MariaDB 10.11 tested).
* Apache with mod_rewrite and .htaccess support.

Steps
-----
1. Upload the contents of sige77-web-${STAMP}.tar.gz so that index.html lands directly in the
   web root (on InfinityFree: htdocs). Extract the archive and move the contents of sige77/ up
   one level if your host does not let you choose the extraction target.

2. In the control panel, create a MySQL database and note the four values shown there:
   host, database name, username, password. The host is NOT "localhost" on InfinityFree;
   copy the exact value from the panel.

3. Open config/config.example.php and save it as config/config.php. Fill in the four values.
   Alternatively set the DB_HOST, DB_NAME, DB_USER and DB_PASS environment variables.

4. In phpMyAdmin, select your database and import database.sql.

5. Visit https://<your-domain>/api/health — it must report {"success":true,...,"db":true}.
   If db is false, the credentials in step 3 are wrong or the import in step 4 did not run.

6. Open https://<your-domain>/m/index.html and register an account. The one-time code is shown
   in the app's own notification list, not sent by SMS.

Changing the domain later
-------------------------
The seeded row in the domains table is what the in-app resolver dials. To point the site at a
different host, update it in phpMyAdmin:

    UPDATE domains SET host = 'https://new-domain.example' WHERE merchant = 'sige7tlbf5';

Notes
-----
* .htaccess already denies direct access to config/, api/src/, sql/, bin/ and tests/.
* No cron jobs, background tasks, outbound SMTP or SSH access are used, so none are required.
EOF

# ---------------------------------------------------------------- archive ---
tar -C "$STAGE" -czf "$DIST/sige77-web-${STAMP}.tar.gz" sige77

echo "built:"
echo "  $DIST/sige77-web-${STAMP}.tar.gz  ($(du -h "$DIST/sige77-web-${STAMP}.tar.gz" | cut -f1))"
echo "  $DIST/database.sql                ($(du -h "$DIST/database.sql" | cut -f1))"
echo "  $DIST/DEPLOY.txt"
echo
echo "package contents:"
tar -tzf "$DIST/sige77-web-${STAMP}.tar.gz" | sed 's#^sige77/#  #' | sort | head -40
echo "  ... ($(tar -tzf "$DIST/sige77-web-${STAMP}.tar.gz" | wc -l) entries total)"
