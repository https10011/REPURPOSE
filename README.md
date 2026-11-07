# Sige77 — Web reconstruction

A functional reconstruction of the Android app `prod.app_sige7tlbf5.com` (display name *Sige77*,
version 2.4.87), rebuilt as a plain web application with the fixed target stack: HTML5, CSS3,
vanilla JavaScript, PHP 8 + PDO, MySQL/MariaDB.

The decompiled original lives untouched in `Sige77_20261106_2144_[jadx]/`. The reconstruction is
in `web/`. Everything that was observable in the artefact — the resolution algorithm, the WebView
host behaviour, the 23-method JavaScript bridge, the storage keys, the dialogs, the loading/toast
timing, the server contract — is reproduced and tested; the parts that cannot exist in a browser
are documented as limitations instead of being faked.

- Master directive, investigation report and roadmap: [`WEB_RECONSTRUCTION_DIRECTIVE.md`](WEB_RECONSTRUCTION_DIRECTIVE.md)
- Architecture: [`docs/ARCHITECTURE.md`](docs/ARCHITECTURE.md)
- Backend API: [`docs/API.md`](docs/API.md)
- Evidence → decision table and limitations: [`docs/RECONSTRUCTION_NOTES.md`](docs/RECONSTRUCTION_NOTES.md)
- Checks and screenshots: [`docs/VERIFICATION.md`](docs/VERIFICATION.md), [`docs/verification/`](docs/verification)

### Two layers, deliberately kept apart

The APK contains a WebView shell and nothing else: no product screen, no game, no database. So the
deliverable is built in two layers, and the documentation never blurs them.

* **Evidenced layer** — the shell itself. Launcher, splash, domain resolution, WebView host, the
  23-method bridge, dialogs, toasts, downloads, offline cache. Reconstructed 1:1 from the APK and
  unchanged by later work.
* **Owner layer** — the product the shell frames, at `/m/index.html`. Login, registration, local
  OTP, home, game catalog, three playable games, notifications, profile. The APK holds no evidence
  for any of this (the merchant site behind the WebView did, and it is unavailable), so these are
  reconstructed equivalents built to the owner's contract and labelled `OWNER` throughout.

Read the directive's §17 before changing anything in `web/m/`; it records what is evidenced and what
is an equivalent.

## Requirements

- PHP 8.1+ with `pdo_mysql`, `json`, `mbstring`
- MySQL 5.7+ / MariaDB 10.3+
- Node 18+ only for the JavaScript unit tests

## Setup

```bash
cd web
cp config/config.example.php config/config.local.php   # then edit: DSN, user, password, base URL
php bin/migrate.php --origin=https://your-origin.example
php bin/db-info.php                                     # sanity check
php -S 0.0.0.0:8080 router.php                          # or point an Apache/nginx docroot here
```

Open `https://your-origin.example/`. `config.local.php` is git-ignored; `config.php` holds the
defaults and is safe to commit.

### Configuration

| Key | Meaning |
|---|---|
| `db.dsn`, `db.user`, `db.pass` | PDO connection |
| `app.base_url` | absolute origin used for URLs the server hands out |
| `app.max_body_bytes` | request body cap (default 32 kB) |
| `app.seed_from_request` | **development only** — resolve every client to the origin that served the request, so a local copy works without the eleven merchant domains |
| `app.log_errors` | write PHP errors to `var/log/` |

## Layout

```
web/
  index.html            shell markup (splash, frame host, dialogs, debug console)
  open-web.html         OpenWebActivity equivalent
  sw.js                 service worker: offline assets, push rendering
  router.php            PHP built-in-server router
  assets/css/shell.css  all shell styling
  assets/img/           original drawables from the APK
  assets/js/            app, resolver, bridge, webview, dialogs, storage, i18n, …
  api/index.php         single entry point for the PHP backend
  api/src/              Db, Http, Router, Support + one file per route
  m/                    the reconstructed application (directive §17): index.html, js/, css/
  harness/              labelled embedded-content harness that exercises the bridge contract
  config/               config.php (defaults), config.example.php, config.local.php (ignored)
  sql/                  schema.sql, seed.sql
  bin/                  migrate.php, serve.sh, db-info.php
  tests/                api_test.sh, js/*.test.mjs
```

## How it works

1. Boot reads the manifest metadata equivalent (`/api/app/config`), the device id and the
   `localStorage` prefs that mirror the original `SharedPreferences` keys.
2. If a resolved URL newer than 24 h is cached, it is loaded directly (the `X5_Activity` fast path).
3. Otherwise the resolver posts `GET /wps/system/domainRoute?device=1&agentName=` to the seeded
   candidates with `ModuleId: COMM3`, races them, keeps the first valid answer, applies the
   blacklist, and falls back to `https://www.112121313.com` exactly once.
4. The result is decorated with `affiliateCode`, `fbPixelId`, `tid`, `gaid`, `snowBallAppId` and
   `isSingleLine=0` appends `/m/index.html`, then loaded into an `<iframe>` that stands in for the
   WebView. That path serves the reconstructed application, so the shell frames a real product
   instead of a remote merchant page.
5. `window.Android` (plus `JSInterface`, `LaunchOpen`, `LaunchClose`, `Color`, `Log*`) is injected
   for same-origin documents; cross-origin documents get a `postMessage` relay.
6. Back/Escape go through the same `canGoBack` → exit-dialog logic as `yg.onKeyDown`.

## Tests

```bash
cd web
bash tests/api_test.sh http://127.0.0.1:12000   # HTTP contract, needs a running server + migrated DB
node --test tests/js/*.test.mjs                 # client logic, no server needed
php tests/game_engine_test.php                  # game maths, no server needed

# Optional end-to-end check of the app screens (needs a browser + a scratch instance):
npm i --no-save playwright-core
BASE=http://127.0.0.1:12000 PHONE=<existing account> PASS=<its password> \
  CHROMIUM=/usr/bin/chromium node tests/app_browser_check.mjs
```

The JS suite must be invoked with the glob: `node --test tests/js/` resolves the directory as a
single (non-existent) test file and fails.

`tests/app_browser_check.mjs` signs in as an existing account, walks every screen, plays one round
and asserts the balance and stats moved. It also carries two honesty guards: they fail if the OTP
screen starts claiming the code was delivered, or if a blocked title stops explaining itself. Point
it at a scratch database — it stakes real credits.

## Deployment notes

- Serve `web/` as the document root; `router.php` exists for `php -S`, and `.htaccess` covers Apache.
- The eleven merchant hosts must answer `/wps/system/domainRoute` themselves in production; this
  repository only implements the contract.
- `web/var/` and `web/config/config.local.php` must not be deployed or committed.
- `app.seed_from_request` must be `false` in production.
