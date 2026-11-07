# Architecture

The reconstruction keeps the original client's architecture instead of inventing a new one: an
**app shell** that resolves a reachable domain, decorates the URL, hosts the merchant page in a
"WebView" and exposes a **JavaScript bridge** to that page.

```
┌──────────────────────────── browser (web/index.html) ────────────────────────────┐
│                                                                                  │
│  app.js  (X5_Activity.onCreate + yg.onCreate)                                    │
│   ├─ app-config.js      manifest <meta-data> equivalent (+ /api/app/config)      │
│   ├─ device.js          device UUID (j10) + advertising id (kf.b) + UA            │
│   ├─ storage.js         SharedPreferences equivalent (exact key names)            │
│   ├─ domain-route.js    cache → speed test race → backupDomain (rm.c / zq1.c)     │
│   ├─ app-url.js         ak1.a normalisation + X5_Activity.E decoration            │
│   ├─ track-id.js        support track id for the retry dialog (X5_Activity.F)     │
│   ├─ loading-dialog.js  mz0/c6 loading dialog                                     │
│   ├─ dialogs.js         f6/b6 AlertDialog equivalents                             │
│   ├─ toast.js           ToastUtils equivalent                                     │
│   ├─ debug-log.js       LogOpen/LogClose/LogTest + POST /api/log                  │
│   ├─ webview.js         WebView + WebViewClient + WebChromeClient equivalents     │
│   ├─ bridge.js          window.Android / JSInterface / Launch* / Color / Log*     │
│   └─ downloads.js       DownloadListener equivalents                              │
│                                                                                  │
│  <iframe id="webview">  ← WebView                       sw.js ← cache interceptor│
│      └─ /m/index.html   ← the reconstructed app (the page the shell frames)        │
└──────────────────────────────────────────────────────────────────────────────────┘
                                    │ same-origin JSON
                                    ▼
┌──────────────────────────── PHP 8 backend (web/api) ────────────────────────────┐
│  index.php → Router → routes/*.php                                               │
│   GET  /wps/system/domainRoute   original contract (wv1.java)                    │
│   GET  /api/app/config           manifest meta-data                              │
│   GET  /api/app/latest           parity endpoint (unused by the APK)              │
│   POST /api/device/register      device UUID + gaid                              │
│   POST /api/session              resolution telemetry                            │
│   POST /api/collect/event        gs0.eventTracker / appFlyerLogEvent             │
│   POST /api/log                  qt.q()/kv.* telemetry                           │
│   POST /api/domain/report        speed-test feedback                             │
│   POST /api/blacklist            anti-hijack blacklist                           │
│   POST /api/push/subscribe       FCM-token equivalent                            │
│   GET  /api/health               smoke check                                     │
│                              │ PDO (prepared statements)                         │
│                              ▼                                                   │
│                     MySQL 8 / MariaDB 10.11  (web/sql/schema.sql)                │
└──────────────────────────────────────────────────────────────────────────────────┘
```

## Boot sequence (`web/assets/js/app.js`)

1. `getPrefs()`, `getDeviceId()`, `getAdvertisingId()` — install identity.
2. `GET api/app/config` (2.5 s budget) and merge over the compiled manifest copy; on failure the
   compiled values are used (the APK cannot fetch its manifest either).
3. Version check: when `VERSION` differs, the resolution caches are cleared — same as
   `AppTestApp.onCreate()` (which stores Kotlin's `EmptyList` and clears the timestamp).
4. `createResolver(...)`, `createLoadingDialog()`, `createWebView(...)`, `createBridge(...)`.
5. Seed the route list from `merchantUrls` when empty (`rm.d()`).
6. `POST api/device/register`, register the service worker, install the BACK guard, hide splash.
7. Resolution:
   * `tryCachedLastUrl()` — `cache_<merchant>_lastUrl` younger than 24 h ⇒ decorate and load it
     immediately (`X5_Activity.onCreate` cache branch).
   * otherwise `startResolution()` ⇒ `domainRoute` toast, resolver, `POST api/session`, load.
8. On page load: success path (`handleLoadSuccess`, success mark + toast) or failure path
   (`handleLoadFailure`, retry dialog with track id).

## Domain resolution (`domain-route.js`)

Documented in detail in `WEB_RECONSTRUCTION_DIRECTIVE.md` §5.2; in short:

* cached last URL is re-validated and then **always discarded** (the APK behaves the same way —
  the fast path lives in the activity, not in the resolver);
* route list is shuffled, capped at 20 candidates, blacklisted hosts removed;
* all candidates are probed in parallel (`GET {host}/wps/system/domainRoute?device=&agentName=`
  with `ModuleId: COMM3`, `Accept: application/json`), and the lowest-index candidate that has
  already answered wins (the original spins over its futures in declaration order);
* a candidate only wins if the returned `domainList` still advertises that host (`rm.f`);
* if everything fails, `backupDomain` is consulted; a response that brings new hosts is persisted
  and resolution restarts once without backup fallback.

## WebView equivalent (`webview.js`)

| Android | Web |
|---|---|
| `WebView` | `<iframe id="webview">` |
| `onPageStarted/onPageFinished` | `load` event + progress simulation |
| `onReceivedError` | load timeout / failed probe |
| `onReceivedHttpError` (main frame 404/500) | `fetch(url)` status check (same-origin only) |
| `shouldInterceptRequest` offline assets | `sw.js` (`/offline/*`, exact MIME rules) |
| HTTP cache (json only, 100 MB) | Cache Storage in `sw.js` |
| anti-hijack keyword check (`"root"`, `ucbet`, `"brand="`) | same-origin document probe |
| `setOnLongClickListener` | `contextmenu` listener inside the frame |
| `onShowFileChooser` | file-input interception + chooser dialog |
| `onJsAlert` | `window.alert` override → shell dialog |
| `canGoBack`/`goBack` | navigation counter + `history.back()` in the frame |

## Bridge (`bridge.js`)

All 23 `window.Android` methods of the APK exist with the same names, arities and semantics.
Same-origin pages receive the objects directly (the equivalent of `addJavascriptInterface`), and the
clipboard override from `jg.onPageFinished()` is installed too. Cross-origin pages cannot be
injected by any browser API, so a `postMessage` relay is provided; this is the single structural
difference between the native bridge and the web bridge.

## Frontend structure

* `web/index.html` — DOM mirror of `activtiy_vassonic.xml` + `loading_dialog_view.xml` + splash.
* `web/assets/css/shell.css` — every metric/colour annotated with its Android source.
* `web/assets/js/*.js` — ES modules, no build step, no framework, no dependencies.
* `web/open-web.html` + `open-web.js` — `OpenWebActivity` (secondary webview, floating close).
* `web/harness/index.html` + `harness.js` — the labelled embedded-content harness (see notes).
* `web/m/**` — the reconstructed application (directive §17): router, screens, api client, css.
* `web/sw.js` — cache/push equivalents.

## Backend structure

* `web/api/index.php` — front controller, error handling, route table.
* `web/api/src/{Db,Http,Router,Support}.php` — infrastructure.
* `web/api/src/routes/*.php` — one file per endpoint, each starting with the Android evidence that
  defines it.
* `web/sql/{schema,seed}.sql` — idempotent schema + manifest-derived seed.
* `web/bin/{migrate.php,serve.sh,db-info.php}` — operations helpers.
