# Verification

Reproduce everything below from the repository root with the bundled toolchain (no root required):

```bash
.tools/start-db.sh                 # MariaDB 10.11 on .tools/mysql.sock
cd web && PHP_BIN=$PWD/../.tools/php ./bin/serve.sh 3000
```

`php`/`mysql` are not on `PATH` in this environment; use `.tools/php` (the static PHP 8.4.8 CLI
binary itself) and `.tools/mariadb-10.11.8-linux-systemd-x86_64/bin/*`. The MariaDB CLI client cannot start here
(`libncurses.so.5` missing), so database inspection uses `php bin/db-info.php`.

## 1. Static checks

| Command | Result |
|---|---|
| `for f in $(find web -name '*.php'); do ./.tools/php -l $f; done` | every file: `No syntax errors detected` |
| `for f in $(find web -name '*.js' -o -name '*.mjs'); do node --check $f; done` | no output (all parse) |
| `bash -n web/bin/serve.sh web/tests/api_test.sh` | no output |

## 2. Schema + seed

```bash
cd web && ../.tools/php bin/migrate.php --origin=http://127.0.0.1:8099
```

Output: ten tables created, merchant `sige7tlbf5` seeded with the eleven `merchant_url` hosts,
`backupDomain https://www.112121313.com`, version `2.4.87`, and the eleven `settings` defaults.
Exit status 0. Re-running is idempotent (`CREATE TABLE IF NOT EXISTS` + `ON DUPLICATE KEY UPDATE`).

## 3. API contract tests

```bash
./tests/api_test.sh            # from web/
```

`passed: 35, failed: 0`. Covered: envelope shape of every route, required-field validation and
status codes (400/404/405/413/422), `domainList` containing the requesting host, `domain_checks`
row written per call, device upsert keeping `first_seen`, session/event/log/report/blacklist/
subscribe persistence, `/api/app/config` metadata (version, eleven URLs, placeholder attribution),
`/api/app/latest` `os` validation, and `/api/health` reporting all ten tables.

## 4. Client logic tests

```bash
cd web && node --test tests/js/
```

`25 pass, 0 fail`. Suites: `core.test.mjs`, `route.test.mjs`, `url.test.mjs`, `storage.test.mjs`,
`track-id.test.mjs`, `bridge.test.mjs` — URL normalisation and decoration, route endpoint building,
candidate validity, race ordering, cache TTL and re-validation, backup-domain recursion and loop
protection, blacklist, `Prefs` key names/round-trip, track-id format and bounds, and bridge method
surface.

## 5. Browser end-to-end (Cloud browser, Chromium)

Served on port 3000 through the preview proxy. Verified by driving the real page with the browser
tools and reading the resulting database rows:

| Step | Observed |
|---|---|
| First load | splash (`splash_bg.jpg`) → resolver request → loading ring → `find_fastest_route` toast → iframe on `/m/index.html?affiliateCode=_&fbPixelId=_&tid=_0&gaid=…&snowBallAppId=_` |
| Reload inside 24 h | cache fast path, no `/wps/system/domainRoute` request |
| Bridge | `window.Android.getVersion()` → `2.4.87`; 23 methods present |
| Storage | `setValue/getValue` round-trip, `clearCache` toast (`cleanCache`) |
| Events | `eventTracker('page_view', …)` persisted in `events` |
| Image long-press | menu (save/copy), copy writes to clipboard and toasts `copy` |
| Upload | file input intercepted → Camera/Album/Cancel dialog |
| Back / Escape | exit dialog (`Reminder`, `Ok to leave the game`, Cancel/OK) |
| Unreachable domain | route-failure dialog with track id `6932-8021-8f8d` (format `random(100…10000)-uuid4-uuid-4`) |
| Downloads | text blob and `download` attribute both land in the download list (payload 55 bytes) |
| Toast | `11-toast.png`, captured with the shell's own `showToast("We've got the fastest line for you!")` |
| Database after the session | rows in `devices`, `sessions`, `client_logs`, `domain_checks` |

Console was clean (no errors, no failed requests) at every step.

## 6. Visual audit

`docs/verification/`:

| File | Content |
|---|---|
| `01-embedded-site.png` | harness page inside the shell after a successful resolution |
| `02-splash.png` | splash overlay from the bundled original asset |
| `03-loading-ring.png` | bottom loading card, `#444444`, white arc |
| `04-loading-success.png` | success mark before dismissal |
| `05-loading-fail.png` | failure mark + retry affordance |
| `06-dialog-exit.png` | non-cancelable exit dialog |
| `07-dialog-image-menu.png` | long-press image menu |
| `08-dialog-upload.png` | Camera/Album/Cancel chooser |
| `09-dialog-route-failure.png` | support dialog with track id |
| `10-toast-and-debug-console.png` | toast plus the debug console panel |
| `11-toast.png` | standalone toast (`find_fastest_route`) over the harness, captured live |
| `download-text-payload.bin` | 55-byte payload proving the blob download path |

`10` shows a toast together with the debug console; `11` isolates it.

## 7. Not verified / not verifiable here

- Native-only paths: X5 kernel switching, hardware back key, WebView `onShowFileChooser` in a real
  WebView, `shouldInterceptRequest` on cross-origin documents.
- Provider SDK behaviour (Firebase/AppsFlyer/Adjust/OpenInstall/Snowball) and FCM delivery.
- Real merchant page rendering and the production `domainRoute` endpoints on the eleven hosts.
- Playwright-driven automated tests: the `preview_playwright` tool in this environment fails with
  `The property 'options.mode' must be one of: 'strip'. Received 'transform'`, so the browser
  checks above were performed with the snapshot/click/type tools instead.

## 8. Repeat before deployment

1. `bin/migrate.php` against the target database, with the real origin.
2. `tests/api_test.sh` and `node --test tests/js/`.
3. One browser pass on the deployed origin, because cookie/`localStorage` behaviour and mixed
   content rules differ from `127.0.0.1`.
