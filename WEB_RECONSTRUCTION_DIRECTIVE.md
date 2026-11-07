# WEB_RECONSTRUCTION_DIRECTIVE.md

**Project:** REPURPOSE — 1:1 reconstruction of the decompiled Android application `Sige77` (`prod.app_sige7tlbf5.com`) as a web application.
**Target stack:** HTML5 / CSS3 / JavaScript (frontend) + PHP 8 (backend) + MySQL 8 (database).
**Evidence source (read-only):** `Sige77_20261106_2144_[jadx]/` (jadx decompilation of the shipped APK).
**Status owner:** the autonomous agent currently working in this repository. This document is the permanent source of truth for scope, progress, decisions and handover.

> **MANDATORY FOR EVERY FUTURE AGENT**
> Read this entire document before modifying any project file. Verify the "Session log" section, verify the actual repository state against the checklists, then continue from the first unfinished stage. Never restart completed phases. Never delete or edit evidence inside `Sige77_20261106_2144_[jadx]/`.

**Current state (session 001):** phases 0–12 executed; four phases carry `DONE-U` (implemented, verification limited) — see §14 for each caveat. Reconstruction lives in `web/`, documentation in `docs/`, the decompiled evidence tree is untouched. Three test suites were green at the end of the session: 25/25 JavaScript unit tests, 35/35 API contract checks, clean `php -l`/`node --check`. Reproduce with `docs/VERIFICATION.md`. Start at §14, then §15, then the phase you intend to touch.

---

## 1. Executive summary of the investigation

The APK is **not** a natively implemented application. It is a **WebView app shell** ("AppShellVer:2.4.87") that:

1. Reads merchant metadata from `AndroidManifest.xml` `<meta-data>` (`merchant`, `merchant_url`, `backupDomain`, `appName`, `version`, `affiliateCode`, `device`, `isSingleLine`, tracking keys).
2. Resolves a **fastest reachable domain** out of a merchant domain list, using a server endpoint `/wps/system/domainRoute` plus client-side speed tests, a 24-hour "last good URL" cache, and a `backupDomain` fallback.
3. Decorates the resolved URL with attribution query parameters (`affiliateCode`, `fbPixelId`, `tid`, `gaid`, `snowBallAppId`).
4. Loads that URL into a `WebView` (`yg` base activity → `X5_Activity` launcher) with a large set of **`@JavascriptInterface` bridges** that the remote site calls (`window.Android`, `window.JSInterface`, `window.LaunchOpen`, `window.LaunchClose`, `window.Color`, `window.LogOpen`, `window.LogClose`, `window.LogTest`).
5. Provides native UX around the WebView: splash screen, loading dialog, "no network" / route-failure dialog with a support track ID, exit-confirm dialog, image long-press menu, file chooser, download handling, toasts, offline asset interception, HTTP cache interception.

**The only application-owned business logic present in the repository is this shell.** The actual merchant site (a betting/lottery web product served remotely, keyword `"ucbet"` appears in the anti-hijack check) is **not present in the repository** and cannot be recovered from the APK. Under the project directive ("We do NOT require you to recreate inaccessible original company servers"), the reconstruction target is therefore:

* the **complete app shell** (all screens, navigations, states, dialogs, routing logic, caching, downloads, bridge surface), and
* a **PHP/MySQL backend implementing the observable server contract** (`/wps/system/domainRoute`, the unused update URL, attribution/telemetry/log persistence),
* plus a clearly labelled **same-origin "site host" harness** that stands in for the unavailable remote merchant site so that the WebView-equivalent container and the whole JS bridge can be exercised end-to-end.

No betting/lottery mechanics are invented. Nothing in the repository describes them, and fabricating them would violate the evidence-driven reconstruction standard of the project directive.

---

## 2. Scope

### 2.1 In scope (reconstructed from evidence)

| # | Item | Evidence |
|---|---|---|
| 1 | Application bootstrap, merchant metadata, SharedPreferences keys | `src/java/prod/apptest/com/AppTestApp.java` |
| 2 | Splash screen (theme + drawables) | `AndroidManifest.xml` (`@style/SplashTheme`), `res/values/styles.xml`, `res/drawable/shape_splash.xml`, `splash_bg.jpg`, `splash_logo.jpg` |
| 3 | Domain-route resolution algorithm (cache, speed test, first-completed selection, fallback domains, blacklist) | `defpackage/rm.java`, `defpackage/zq1.java`, `defpackage/ak1.java`, `defpackage/kf.java`, `defpackage/ra2.java` |
| 4 | Server contract `/wps/system/domainRoute` | `defpackage/wv1.java`, `defpackage/bu0.java`, `defpackage/r20.java`, `defpackage/p20.java` |
| 5 | URL decoration (`affiliateCode`, `fbPixelId`, `tid`, `gaid`, `snowBallAppId`) | `X5_Activity.E()`, `X5_Activity.C()` |
| 6 | 24h last-URL cache + version-reset behaviour | `X5_Activity.onCreate()`, `AppTestApp.f()`, `AppTestApp.onCreate()` |
| 7 | Loading dialog (ring / success / failure / dynamic text, 1 s minimum) | `defpackage/mz0.java`, `defpackage/c6.java`, `res/layout/loading_dialog_view.xml`, `res/values/strings.xml` |
| 8 | WebView container, settings, error handling, HTTP-error detection, offline assets | `defpackage/yg.java`, `defpackage/jg.java`, `defpackage/mg.java` |
| 9 | Network-loss and route-failure dialogs + support track ID | `X5_Activity.F()`, `X5_Activity.p()`, `defpackage/f6.java`, `defpackage/b6.java` |
| 10 | Exit-confirm dialog + hardware back semantics | `yg.onKeyDown()` |
| 11 | Image long-press menu (Download Image / Copy) | `yg.k()` (`xf` long-click listener) |
| 12 | Upload-picture chooser (Camera / Album / Cancel) + cancellation | `yg.uploadPicture()`, `yg.onActivityResult()` |
| 13 | Download handling (apk / images / data: / blob: / text) | `yg.k()` download listener, `defpackage/zf.java`, `defpackage/cg.java`, `defpackage/dg.java` |
| 14 | Full JS bridge surface (`Android`, `JSInterface`, `LaunchOpen`, `LaunchClose`, `Color`, `Log*`) | `defpackage/gs0.java`, `qg.java`, `ig.java`, `tg.java`, `ug.java`, `rg.java`, `wg.java`, `vg.java`, `xg.java` |
| 15 | Clipboard shim injected after page load (`navigator.clipboard`) | `defpackage/jg.onPageFinished()` |
| 16 | Open-in-secondary-webview activity (`OpenWebActivity`) | `prod/apptest/com/activity/OpenWebActivity.java`, `res/layout/activity_open_web.xml` |
| 17 | Toast + debug log console (`LogOpen`/`LogClose`/`LogTest`) | `yg` fields `D0/q0/E0`, `res/layout/activity_webs.xml` (`webviewtext`, `webviewbutton`) |
| 18 | Status-bar / theme colour bridge (`Color.setColors`) | `defpackage/rg.java`, `X5_Activity.onConfigurationChanged()` |
| 19 | Persistence semantics (SharedPreferences ↔ web storage), `JS_`-prefixed keys | `gs0.storageGetItem/SetItem/RemoveItem`, `MyFirebaseMessagingService` (`JS_merchant`) |
| 20 | Telemetry contract (`eventTracker`, AppsFlyer/Firebase/OpenInstall/Snowball fan-out) | `gs0.eventTracker()`, `gs0.appFlyerLogEvent()` |
| 21 | WebView client side persistence of splash image URL | `SharedPreferences "SPLASH_URL"`, `rm.g()` |
| 22 | Server-side persistence for all of the above | reconstructed (no server source exists in the repo) |

### 2.2 Out of scope (documented, not fabricated)

| Item | Reason |
|---|---|
| Remote merchant site markup/logic (the actual product UI) | Not in the repository; served from remote hosts (`77sige.*`, `sige777.*`, …) that are no longer part of the artefact. |
| Firebase / AppsFlyer / Adjust / OpenInstall / Transsion Athena / Snowball SDK internals | Third-party closed services; only their *client call sites* are reconstructed. Equivalent PHP telemetry endpoints are provided. |
| Google / Facebook / LINE OAuth | Requires provider app IDs, client secrets and console configuration. The shell keeps the exact call contract and reports the native failure string (`Failure: …`) back to the page. No fake logins. |
| Real FCM push delivery / APK self-update | Requires Firebase credentials and a signed APK pipeline. The shell implements permission flow, token registration endpoint and a documented equivalent (Web Push subscription storage). |
| Re-creation of the original company's servers, databases, infra | Explicitly excluded by the project directive. |

---

## 3. Repository map (evidence inventory)

```
Sige77_20261106_2144_[jadx]/
├── AndroidManifest.xml                     # 400+ lines, full component + meta-data declaration
├── icon.png                                # 144x144 launcher icon
├── info.json                               # decompiler metadata (package, label, size)
└── src/
    ├── java/                               # 5,827 files total in the tree
    │   ├── prod/apptest/com/               # >>> THE APPLICATION (21 files) <<<
    │   │   ├── AppTestApp.java             # Application: metadata, prefs, UA, SDK init (551 lines)
    │   │   ├── activity/X5_Activity.java   # launcher activity: routing, retry dialog, loading control
    │   │   ├── activity/OpenWebActivity.java# secondary WebView activity (JS openWebView)
    │   │   ├── fcm/MyFirebaseMessagingService.java # push receive + notification channel
    │   │   └── webview/…                   # HTTP cache interceptor, offline asset loader, utils
    │   ├── defpackage/                     # 4,203 obfuscated classes; shell classes among them
    │   │   ├── yg.java                     # WebView base activity (1,279 lines) — core of the shell
    │   │   ├── jg.java                     # WebViewClient: errors, offline assets, anti-hijack check
    │   │   ├── mg.java                     # WebChromeClient: file chooser, fullscreen, JS alert
    │   │   ├── rm.java / zq1.java          # domain route resolution (speed test) — 2 flavours
    │   │   ├── ak1.java                    # URL normalisation + UA string
    │   │   ├── gs0.java / qg.java / ig.java / tg.java / ug.java / rg.java / vg.java / wg.java / xg.java
    │   │   ├── mz0.java / c6.java / nz0.java # loading dialog, toast, progress
    │   │   ├── f6.java / b6.java / g6.java   # dialog factory (Material alert dialog)
    │   │   ├── j10.java                    # device UUID (Settings.Secure ANDROID_ID → nameUUID)
    │   │   └── … (Adjust, Firebase, Facebook, LINE, Glide, OkHttp, MMKV, Athena, AVI, ToastUtils)
    │   ├── com/google/**                   # recaptcha/firebase/…
    │   ├── com/linecorp/**                 # LINE SDK
    │   ├── com/facebook/**                 # Facebook SDK
    │   ├── com/adjust/** , com/appsflyer/** , com/fm/openinstall/** , com/transsion/**
    │   └── io/prod/**, com/hjq/**, com/wang/**, com/xiasuhuei321/** …
    └── resources/package_1/res/            # 1,700+ resource files (mostly library resources)
        ├── layout/          (109)          # incl. activtiy_vassonic.xml (shell), activity_webs.xml,
        │                                   #      activity_open_web.xml, loading_dialog_view.xml
        ├── drawable/ (164) + dpi buckets   # incl. splash_bg.jpg, splash_logo.jpg, icon_bg.jpg
        ├── mipmap-*/                        # ic_launcher.png (all densities)
        ├── values/                          # strings.xml (app strings), colors.xml, styles.xml, dimens…
        └── values-*/ (100+)                 # library translations only
```

**No** HTML/CSS/JS assets, no SQLite database, no Room schema and no server source exist in the repository. Local persistence is exclusively `SharedPreferences`.

---

## 4. Platform facts (recovered)

| Fact | Value | Source |
|---|---|---|
| Package | `prod.app_sige7tlbf5.com` | `AndroidManifest.xml` |
| Label | `Sige77` | `AndroidManifest.xml`, `info.json` |
| Version | `2.4.87` (versionCode 1) | `AndroidManifest.xml` meta-data `version` |
| merchant | `sige7tlbf5` | meta-data `merchant` |
| merchant_url (seed domain list) | `https://www.77sige.club`, `…77sige.net`, `…sige77.app`, `…sige777.net`, `…sige777.club`, `…sige777.vip`, `…sige77a.com`, `…sige77a.org`, `…sige77a.app`, `…sige77a.net`, `…49704794.com` | meta-data `merchant_url` |
| backupDomain | `https://www.112121313.com` | meta-data `backupDomain` |
| appName | `Sige77` | meta-data `appName` |
| affiliateCode / FB pixel / TID / Adjust tracker / Snowball app id / agent | `_` / `_` / `_0` / `_0` / `_` / `` (all treated as "empty" by `ea.o/q` checks) | meta-data |
| device | `1` | meta-data `device` |
| isSingleLine | `0` (⇒ multi-line web layout) | meta-data `isSingleLine` |
| Launcher | `X5_Activity` (portrait, singleTop) | manifest |
| minSdk / targetSdk / compileSdk | 24 / 36 / 36 | manifest |
| App theme | `SplashTheme` → `AppTheme` (`Theme.AppCompat.Light.NoActionBar`, `colorPrimary`/`colorPrimaryDark` = `#000000`, `windowBackground` = `shape_splash`) | `styles.xml`, `colors.xml` (`colorbar` = `#000000`) |
| Splash drawable | `layer-list`: `splash_bg.jpg` (fill) + `splash_logo.jpg` (90dp × 90dp, centred) | `shape_splash.xml` |
| Loading dialog style | ring (`LVCircularRing`), text `加载中…`, 1 000 ms minimum display, bottom-gravity (y = 300 px) | `mz0.java`, `yg.onCreate()` |
| Offline assets dir | `assets/offline/` (absent from the decompiled tree; interception keyed by filename) | `yg.onCreate()`, `jg.shouldInterceptRequest()` |
| HTTP cache | 100 MB disk cache, extensions `json` only (html/htm/swf excluded), FORCE mode, 15 s timeouts | `AppTestApp.onCreate()` |
| Anti-hijack keyword check | loaded `/m/index.html` must contain one of `"root"`, `ucbet`, `"brand="` | `jg.shouldInterceptRequest()` |
| UA suffix | `<default UA>/<BRAND> AppShellVer:2.4.87 UUID/<device-uuid>` | `AppTestApp.onCreate()` |
| Update URL (built, never used) | `https://<merchant>.www.gfbwff.com/api/app/latest?os=android` | `AppTestApp.W` |

---

## 5. Architecture reconstruction

### 5.1 Component graph (Android)

```
AndroidManifest meta-data ──► AppTestApp.onCreate()
   │                             ├─ SharedPreferences "prod.apptest.com.userinfo"
   │                             ├─ UA string (ak1.a)  → WebView settings
   │                             ├─ cache_/access_<merchant>_domainRoute + _lastUrl keys
   │                             └─ SDK init (Adjust/AppsFlyer/OpenInstall/Athena/Snowball)
   ▼
X5_Activity.onCreate()
   ├─ D(latch): pick resolver flavour → zq1 (single-line) | rm (multi-line)
   │      zq1.c(): base = merchant_url[0]
   │      rm.d(): load cached route list → if empty seed from merchant_url
   │   then kf.b(domain): {domain, gaid}
   ├─ cached last URL (≤24h) → decorate → load directly (skip resolution)
   ├─ super.onCreate() → yg.onCreate()
   │      ├─ setContentView(activtiy_vassonic)  [webview, frameLayout, loading/loading_image, log views]
   │      ├─ loading dialog (B() == true)
   │      ├─ splash image (SPLASH_URL)
   │      └─ j() → Facebook login initialisation, permissions, Google credential
   ├─ onResolved(domain, gaid) → decorate → k() → configure WebView + bridges → load
   └─ p(success): hide/keep loading dialog, error handling

yg.onKeyDown(BACK): webview.canGoBack() ? goBack() : show exit dialog
yg.onProgressChanged(100): unblock images, p(!n0), delayed dismiss
jg.onReceivedError / onReceivedHttpError: n0 = true
jg.shouldInterceptRequest: offline assets → HTTP cache → anti-hijack keyword check → blacklist URL
```

### 5.2 Domain resolution algorithm (reconstructed exactly from `rm.c(boolean)`)

```
resolve(allowBackupFallback):
  lastUrl = prefs["cache_<merchant>_lastUrl"]
  if lastUrl is non-empty:
      if prefs["access_<merchant>_lastUrl"] older than 24h  -> lastUrl = null
      else:
          response = GET  normalize(lastUrl) + "/wps/system/domainRoute?device=<device>&agentName=<agent>"
          if response.success:
              domainList = response.value.domainList      (persist + access timestamp)
              splash     = response.value.splash           (persist if changed, preload image)
              if lastUrl not in domainList -> log "already be removed from domainRoute"
          else: log "Last URL test failed"
          lastUrl = null        # always re-validate
  if lastUrl non-empty: persist, return lastUrl

  clear prefs["cache_<merchant>_lastUrl"]

  routeList = prefs["cache_<merchant>_domainRoute"]      # JSON [{domainName:…}]
  if routeList empty: return null                        # "Domain route empty"

  candidates = shuffle(routeList).take(20) filtered by in-memory blacklist
  for each candidate (all launched in parallel):
        response = GET normalize(host)+"/wps/system/domainRoute?device&agentName"
        valid iff response.success && returned domainList still contains the candidate host
  pick the FIRST candidate that completes successfully (iteration order = shuffled order)
  persist that host as lastUrl + access timestamp, return it

  if none (and allowBackupFallback):
      seed = split(backupDomain, /[,\s]+/)
      for each backup host (parallel): GET …/wps/system/domainRoute
      take the first non-empty domainList
      if that list contains hosts not already cached:
            persist list, recurse resolve(false)

  return null
```

### 5.3 URL decoration (`X5_Activity.E`)

```
if !isSingleLine: url = url + "/m/index.html"
merge query params (replace if present, append otherwise):
    affiliateCode = meta.affiliateCode  (if non-empty, not "0", lowercased+trimmed)
    fbPixelId     = meta.FB_PIXEL_ID    (same rules)
    tid           = meta.TID            (same rules)
    gaid          = advertising id      (if non-empty and != "0")
    snowBallAppId = meta.SNOW_BALL_APP_ID (if non-empty and != "0")
```

---

## 6. Feature inventory

Status legend: **DONE** = implemented and verified · **DONE-U** = implemented, environment-limited verification · **PART** = partially implemented · **BLOCKED** = needs credentials/external · **N/A** = not applicable.

| ID | Feature | Original entry point | Reconstruction | Status |
|---|---|---|---|---|
| F-01 | App bootstrap & metadata | `AppTestApp.onCreate` | PHP `/api/app/config` + `assets/js/config.js` fallback | DONE |
| F-02 | Splash screen | `SplashTheme`, `yg.onCreate` | `index.html` splash layer, original drawables | DONE |
| F-03 | Domain-route resolution + 24 h cache | `rm.c`, `zq1.c`, `X5_Activity.onCreate` | `assets/js/domain-route.js` | DONE |
| F-04 | Route API `/wps/system/domainRoute` | `wv1.b` | `api/src/routes/domain_route.php` | DONE |
| F-05 | Speed test / first-response selection / blacklist | `rm.c` | `domain-route.js` | DONE |
| F-06 | Backup-domain fallback | `rm.c` (z=true branch) | `domain-route.js` | DONE |
| F-07 | URL decoration with attribution | `X5_Activity.E` | `assets/js/app-url.js` | DONE |
| F-08 | WebView container & settings | `yg.k` | `index.html` iframe + `webview.js` | DONE |
| F-09 | Loading dialog (ring/success/fail/dynamic text) | `mz0`, `c6` | `assets/js/loading-dialog.js` + CSS | DONE |
| F-10 | Progress reporting to loading UI | `mg.onProgressChanged` | `webview.js` progress events | DONE-U |
| F-11 | Network-loss dialog + retry | `X5_Activity.p`, `F` | `dialogs.js` | DONE |
| F-12 | Route-failure dialog with support track ID | `X5_Activity.F` | `dialogs.js` + `track-id.js` | DONE |
| F-13 | Exit-confirm dialog + back handling | `yg.onKeyDown` | `dialogs.js` + history guard | DONE |
| F-14 | Image long-press → Download / Copy | `yg.k` (`xf`) | `contextmenu` handler | DONE |
| F-15 | Upload picture chooser (camera/album/cancel) | `yg.uploadPicture` | `dialogs.js` + `<input type=file>` | DONE-U |
| F-16 | Download listener (apk/image/data/blob/text) | `yg.k` (`wf`) | `downloads.js` | DONE-U |
| F-17 | `window.Android` bridge (21 methods) | `gs0`, `ig` | `assets/js/bridge.js` | DONE |
| F-18 | `window.JSInterface.clearCache` | `qg` | `bridge.js` | DONE |
| F-19 | `LaunchOpen` / `LaunchClose` | `ug`, `tg` | `bridge.js` | DONE |
| F-20 | `Color.setColors` theme bridge | `rg` | `bridge.js` | DONE |
| F-21 | `LogOpen` / `LogClose` / `LogTest` debug console | `wg`, `vg`, `xg` | `bridge.js` + `debug-log.js` | DONE |
| F-22 | Clipboard override injection after load | `jg.onPageFinished` | `bridge.js` (same-origin injection) | DONE-U |
| F-23 | Preferences storage bridge (`JS_` keys) | `gs0.storage*` | `storage.js` | DONE |
| F-24 | Telemetry `eventTracker` + `appFlyerLogEvent` | `gs0` | `/api/collect/event` + `events` table | DONE |
| F-25 | Client log pipeline (`qt.q`, `kv.*`) | `qg`, `jg`, `rm` | `/api/log` + `client_logs` table | DONE |
| F-26 | Device identity (UUID, GAID equivalent) | `j10`, `kf.b` | `device.js` | DONE |
| F-27 | Push permission + FCM token contract | `gs0.requestPushPermission`, `generateFcmToken` | Notification API + `/api/push/subscribe` | PART/BLOCKED (no Firebase creds) |
| F-28 | OAuth (google/facebook/line) | `gs0.oauthLogin`, `yg.facebookLogin`, `lineSdkLogin` | Contract preserved, native-style failure callback | BLOCKED (no provider credentials) |
| F-29 | Native share / open external / open-in-webview | `gs0.nativeShare`, `openAndroid`, `openWebView` | Web Share, `window.open`, `open-web.html` | DONE |
| F-30 | Offline asset interception | `jg.shouldInterceptRequest` | Service Worker cache (`sw.js`) for `offline/` assets | DONE-U |
| F-31 | HTTP cache interception (100 MB, json only) | `WebViewCacheInterceptor` | Cache Storage + `sw.js` | DONE-U |
| F-32 | Anti-hijack keyword validation | `jg.shouldInterceptRequest` | `site_probe` check in `webview.js` (same-origin) | PART |
| F-33 | Toast replica | `ToastUtils` (custom view id 2131493004) | `toast.js` | DONE |
| F-34 | `OpenWebActivity` (secondary webview + floating close button) | `OpenWebActivity` | `open-web.html` | DONE |
| F-35 | Notification receive & channel | `MyFirebaseMessagingService` | Service-worker `push` handler (needs VAPID keys) | BLOCKED |
| F-36 | App update check (dead code in original) | `AppTestApp.W` | `/api/app/latest` exists for parity, unused by UI | DONE (parity) |

---

## 7. Persistence model

Android `SharedPreferences` file `prod.apptest.com.userinfo` (all keys must exist with identical names in web storage, per the bridge contract):

| Pref key | Type | Meaning |
|---|---|---|
| `cache_<merchant>_domainRoute` | string (JSON) | cached `domainList` |
| `access_<merchant>_domainRoute` | long (ms) | when the route list was fetched |
| `cache_<merchant>_lastUrl` | string | last working base URL |
| `access_<merchant>_lastUrl` | long (ms) | validity timestamp (24 h TTL) |
| `VERSION` | string | app version that wrote the cache (cache reset on change) |
| `SPLASH_URL` | string | remote splash image URL |
| `gaid_<merchant>` | string | advertising id |
| `JS_<key>` | string | page-controlled storage (`storageGetItem/SetItem/RemoveItem`) |
| `device_stats.xml → device_id` | string | persistent device UUID |

Web mapping: `localStorage` for all of the above, prefixed `sige77.` internally but exposed to the page under the exact original keys (`JS_<key>`). Web Storage is per-origin, which reproduces the "survives app restarts, tied to the install" semantics closely enough; this is documented in `docs/RECONSTRUCTION_NOTES.md`.

---

## 8. JS bridge contract (must be byte-compatible with page expectations)

```js
window.Android = {
  appFlyerLogEvent(eventName, jsonString) -> void
  canSendPushNotifications() -> boolean
  closeApp() -> void
  closeWebView() -> void
  copyToClipboard(text) -> void
  eventTracker(eventName, jsonString) -> void
  facebookLogin(callbackName) -> void
  generateFcmToken(callbackName) -> void
  getFcmToken(callbackName) -> void
  getVersion() -> string            // "2.4.87"
  googleLogin(callbackName) -> void
  lineSdkLogin(arg, callbackName) -> void
  nativeShare(title, text) -> void
  oauthLogin(provider, callbackName) -> void
  openAndroid(uri) -> void
  openWebView(url) -> void
  pasteFromClipboard() -> string
  receiveBase64FromBlob(dataUrl) -> void
  requestPushPermission() -> void
  storageGetItem(key) -> string
  storageRemoveItem(key) -> void
  storageSetItem(key, value) -> void
  supportFCM() -> boolean
}
window.JSInterface = { clearCache(), clearCache(jsString) }
window.LaunchOpen  = { Open() }
window.LaunchClose = { Close(), Close(ms) }
window.Color       = { setColors(jsonString) }
window.LogOpen     = { Open() }
window.LogClose    = { Close() }
window.LogTest     = { setText(text) }
```

Callback convention (from `yg.v/w`, `lineSdkLoginAction`): on failure the shell evaluates
`window.<callbackName>('Failure: <message>')` on the page.

Additionally the shell injects (from `jg.onPageFinished`) a `navigator.clipboard` override
that routes `writeText`/`readText` through the bridge.

---

## 9. UI/text reconstruction reference (inferred string mapping)

`public.xml` in the decompilation is renumbered, so numeric resource IDs in code cannot be resolved directly. The mapping below was inferred from call sites, argument shapes and the app's own `strings.xml` (each row lists the evidence).

| Evidence | Resolved string (name → value) |
|---|---|
| `X5_Activity.D` toast before resolution | `tip_speed_test` → "Trying to find the fastest line." |
| `X5_Activity.p(true)` toast | `find_fastest_route` → "We've got the fastest line for you!" |
| `yg.onCreate` initial dialog text (2131886270) | `mloading_dialog` → "Loading…" |
| `X5_Activity.p` progress text (2131886271) | `mloading_dialog_succeed` → "Loaded!" |
| `X5_Activity.F` dialog title (2131886340) | `alertDialog1` → "Reminder" |
| `X5_Activity.F` message prefix (2131886195) | `no_network` → "No Network" |
| `X5_Activity.F` confirm (2131886369) | `alertDialog4` → "OK" |
| `yg.onKeyDown` dialog | "Reminder" / "Ok to leave the game" / "Cancel" / "OK" |
| `yg.k()` long-press items (2131886371, 2131886138) | `save_image` → "Download Image", `copy` → "Copy" |
| `yg.uploadPicture` (2131886434, 2131886137, 2131886111, 2131886208) | `uploadPicture` "Please select the upload method", `cancel` "Cancel", `album` "Album", `camera` "Camera" |
| `onRequestPermissionsResult` (2131886080-83) | `PERMISSION1` "Cannot take pictures", `PERMISSION2` "You have not granted photo permission", `PERMISSION3` "cancel", `PERMISSION4` "Go to set" |
| `qg.clearCache` toast (2131886142) | `cleanCache` → "Successful Clean Log" |
| `mg.onJsAlert` button (2131886341) | `ok`/`alertDialog4` → "OK" |
| `rm.c` failure paths | `domain_route_not_found` → "Can not find the fast route, please try again later." |
| loading dialog defaults (hard-coded in `yg.onCreate`) | "加载中..." / "加载成功" |

Visual constants: `colorPrimary`/`colorPrimaryDark` `#000000`; content background `#ffffff`; loading ring colour `#5599ff` (from `progress_avld.xml`); loading dialog bottom offset 300 px; splash = white background + centred Sige77 logo.

---

## 10. Target architecture (web)

```
web/                                  # document root (PHP 8.1+ / Apache or `php -S` with router.php)
├── index.html                        # AppShell (X5_Activity + yg equivalent)
├── open-web.html                     # OpenWebActivity equivalent
├── router.php                        # dev-server router: /wps/* + /api/* → PHP, else static
├── .htaccess                         # same routing for Apache
├── assets/
│   ├── css/shell.css                 # all shell UI (splash, loading, dialogs, toast, debug console)
│   ├── js/
│   │   ├── app-config.js             # AndroidManifest meta-data equivalent (+ API override)
│   │   ├── storage.js                # SharedPreferences equivalent
│   │   ├── device.js                 # UUID + "GAID" equivalent
│   │   ├── net.js                    # fetch helpers, timing, timeouts
│   │   ├── domain-route.js           # rm/zq1 algorithms verbatim
│   │   ├── app-url.js                # eabiE – decoration + normalisation (ak1.a)
│   │   ├── track-id.js               # support track ID (random-100..10000-first4-last4)
│   │   ├── loading-dialog.js         # mz0/c6 replica
│   │   ├── dialogs.js                # f6/b6 replica: alerts, chooser, confirm
│   │   ├── toast.js                  # ToastUtils replica
│   │   ├── debug-log.js              # LogOpen/LogClose/LogTest console
│   │   ├── bridge.js                 # the whole JS interface surface
│   │   ├── downloads.js              # download listener equivalents
│   │   ├── webview.js                # iframe container, progress, error, offline cache
│   │   ├── app.js                    # boot sequence = X5_Activity.onCreate
│   │   └── open-web.js               # secondary webview page
│   ├── img/                          # ORIGINAL assets copied from res/ (splash, logo, launcher…)
│   └── js/i18n.js                    # strings.xml app strings
├── m/index.html, m/site.js, m/site.css # same-origin harness at the exact path the shell requests
├── sw.js                             # offline/HTTP cache equivalent
├── api/
│   ├── index.php                     # front controller
│   └── src/{Db,Http,Router,Support}.php, routes/*.php
├── sql/schema.sql, sql/seed.sql
├── config/{config.php,config.example.php,config.local.php}
├── offline/                          # sample offline bundle exercised by sw.js
├── bin/{serve.sh,migrate.php,db-info.php}
├── var/                              # runtime: server log, pid, error log (git-ignored)
└── tests/{api_test.sh,js/*.test.mjs}   # node tests for pure JS + php endpoint tests
```

Documentation lives at the repository root, next to the directive:
`docs/{ARCHITECTURE.md,API.md,RECONSTRUCTION_NOTES.md,VERIFICATION.md}` and `docs/verification/*.png`.

Separation from evidence: the reconstruction lives entirely under `web/` plus root-level docs; the decompiled tree is never modified.

### 10.1 Database design (MySQL 8, `utf8mb4`)

| Table | Purpose | Key columns |
|---|---|---|
| `app_meta` | manifest meta-data equivalent (single row per merchant) | merchant (PK), app_name, version, backup_domain, device, affiliate_code, fb_pixel_id, tid, agent_name, snowball_app_id, is_single_line, splash_url, merchant_urls (JSON) |
| `domains` | authoritative domain list returned by `domainRoute` | id, host (unique), merchant, enabled, priority, weight, region, status, last_checked_at, last_latency_ms, fail_count |
| `domain_checks` | speed-test results (client reports) | id, domain_id, ok, latency_ms, http_status, error, client_ip, created_at |
| `devices` | install identity | id, device_id (UUID, unique), gaid, user_agent, platform, app_version, merchant, first_seen, last_seen |
| `sessions` | one row per shell boot / resolution | id, device_id, resolved_host, resolution_ms, resolver_path (`cache`/`route`/`backup`/`direct`), created_at |
| `events` | `eventTracker` / `appFlyerLogEvent` | id, device_id, name, params (JSON), created_at |
| `client_logs` | `qt.q` / `kv.*` telemetry | id, device_id, level, message, created_at |
| `blacklisted_urls` | anti-hijack blacklist (`AppTestApp.a`) | id, url (unique), reason, created_at |
| `push_subscriptions` | push permission equivalents | id, device_id, endpoint, p256dh, auth, created_at |
| `settings` | runtime key/value (cache TTL, min loading ms, feature flags) | k (PK), v |

Foreign keys from `domain_checks`/`sessions`/`events`/`client_logs`/`push_subscriptions` → `devices.id` with `ON DELETE SET NULL`; all read paths are indexed by `created_at` and `device_id`.

### 10.2 HTTP contract

| Method | Path | Body/Query | Response |
|---|---|---|---|
| GET | `/wps/system/domainRoute` | `device` (int), `agentName` (string) | `{"success":bool,"value":{"domainList":[{"domainName":"https://…"}],"splash":"https://…"}}` — **exact original shape** |
| GET | `/api/app/config` | – | manifest meta-data JSON + `settings` |
| GET | `/api/app/latest?os=android` | – | `{"success":true,"value":{"version":"2.4.87","url":null,"note":null}}` (original URL, unused by UI) |
| POST | `/api/device/register` | `device_id, gaid, user_agent, version` | `{"success":true,"value":{"device_id":…}}` |
| POST | `/api/session` | `device_id, resolved_host, resolution_ms, resolver_path` | `{"success":true}` |
| POST | `/api/collect/event` | `device_id, name, params` | `{"success":true}` |
| POST | `/api/log` | `device_id, level, message` (or `entries[]`) | `{"success":true}` |
| POST | `/api/domain/report` | `host, ok, latency_ms, http_status, error` | `{"success":true}` |
| POST | `/api/blacklist` | `url, reason` | `{"success":true}` |
| POST | `/api/push/subscribe` | `device_id, endpoint, p256dh, auth` | `{"success":true}` |
| GET | `/api/health` | – | `{"success":true,"db":true,"version":…}` |

All write endpoints: JSON body, strict validation, prepared statements, size limits, no secrets in responses.

---

## 11. Roadmap (phases & stages)

Each stage lists objective, tasks, evidence, deliverables, dependencies, verification and acceptance criteria. Status is maintained in place.

### Phase 0 — Investigation & directive *(foundation)*
* **0.1 Repository inventory** — enumerate evidence tree, classify original vs. third-party. **DONE**
* **0.2 Manifest & metadata extraction** — package, permissions, components, meta-data. **DONE**
* **0.3 Shell source analysis** — `yg`, `X5_Activity`, `AppTestApp`, bridges, dialogs, loaders. **DONE**
* **0.4 Network contract reconstruction** — `/wps/system/domainRoute` shape, headers, params, caching. **DONE**
* **0.5 Resource/asset extraction** — layouts, strings, colours, splash/logo/launcher. **DONE**
* **0.6 Directive authoring** — this document. **DONE**
* Acceptance: every claim traceable to a file path; roadmap actionable by a new agent. **MET**

### Phase 1 — Backend foundation (PHP + MySQL)
* **1.1** Project skeleton, autoload, config, error handling, JSON responses. 
* **1.2** MySQL schema (`sql/schema.sql`) + seed (`sql/seed.sql`) reflecting §10.1.
* **1.3** `db.php` PDO factory (env-driven DSN), migrations runner `bin/migrate.php`.
* **1.4** Router + front controller + `.htaccess` + `router.php` for `php -S`.
* Verification: `php -l` on all files, migrate against a real MySQL 10.11/MariaDB instance, `curl` each endpoint, assert status/JSON shape.
* Acceptance: `/wps/system/domainRoute` returns the original envelope; all tables created with FKs; idempotent migration. **MET** — `php -l` clean on all 23 PHP files, migrated twice against MariaDB 10.11.8 (10 tables), `tests/api_test.sh` 35/35.

### Phase 2 — Shell frontend foundation
* **2.1** `index.html` structure mirroring `activtiy_vassonic.xml` (webview, frameLayout, loading, log views).
* **2.2** `shell.css` reproducing splash, loading, dialogs, toast, debug console, responsive layout.
* **2.3** Original assets copied to `web/assets/img/` with original filenames.
* **2.4** `i18n.js`, `app-config.js` (manifest equivalent + API override + static fallback).
* Verification: open page, compare splash/loading visuals against `splash_bg`/`splash_logo`/`icon_bg`; check with mobile viewport.
* Acceptance: splash renders identically (white bg, centred logo, black status bar colour), no console errors. **MET** — `02-splash.png`; layout compares against `splash_bg.jpg`/`splash_logo.jpg`/`icon_bg.jpg`.

### Phase 3 — Routing & persistence logic
* **3.1** `storage.js` (preferences semantics, TTL helpers, version reset).
* **3.2** `device.js` (persistent UUID, GAID equivalent, UA string with `AppShellVer`).
* **3.3** `app-url.js` (normalise + decoration, exact param rules).
* **3.4** `domain-route.js` (cache → speed test → first-completed → backup fallback → blacklist, 20 candidate cap, 3/5/5 s timeouts).
* **3.5** `track-id.js`.
* Verification: node unit tests for pure functions (normalisation, decoration, shuffle cap, selection ordering, TTL expiry) + live end-to-end against backend.
* Acceptance: identical decisions to §5.2/§5.3 for the same inputs; tests green. **MET** — `node --test tests/js/` 25/25 (route, cache, backup recursion, blacklist, decoration, storage keys, track id).

### Phase 4 — WebView container & lifecycle
* **4.1** iframe container with settings equivalents (JS enabled, no zoom unless `o()`), progress tracking.
* **4.2** error detection: `load` failure, HTTP status probe, anti-hijack keyword probe (same-origin only).
* **4.3** loading → success/fail state machine with 1 000 ms minimum and success auto-dismiss.
* **4.4** network-loss path, retry dialog, route-failure dialog with track ID, session logging.
* **4.5** service worker for `offline/` assets + json HTTP-cache semantics.
* Verification: simulate offline (route block), simulate 404/500, simulate missing keywords, verify dialog texts/ordering.
* Acceptance: all four paths reachable and visually correct; retries re-run resolution exactly like `X5_Activity.p()`. **DONE-U** — success, failure, route-failure (track id `6932-8021-8f8d`) and retry verified in the browser; simulated offline/HTTP-error/hijack paths implemented but exercised only by unit-level probes, not in the browser.

### Phase 5 — JS bridge
* **5.1** `bridge.js` with all 21 `Android` methods, exact names/arities, both injection (same-origin) and `postMessage` relay (cross-origin).
* **5.2** `JSInterface`, `LaunchOpen`, `LaunchClose`, `Color`, `LogOpen`, `LogClose`, `LogTest`.
* **5.3** clipboard override injection after load.
* **5.4** downloads: apk, image (`data:`, http), blob, text; save-as behaviour.
* **5.5** share/open/external/close/open-in-webview.
* **5.6** failure callbacks (`Failure: …`) for blocked providers.
* Verification: `m/index.html` harness invoking every method; assert bridge-side effects and callback payloads; node test for payload parsing. **DONE**
* Acceptance: every documented method present and functional or explicitly reported as environment-limited. **DONE — 23 `Android` methods, all callable from the harness.**

### Phase 6 — Secondary webview & peripheral UI
* **6.1** `open-web.html` (OpenWebActivity: portrait, zoom enabled, no cache interception, floating close button).
* **6.2** toasts, debug console (`webviewtext`/`webviewbutton`), long-press image menu, upload chooser.
* **6.3** exit-confirm + back-button semantics (popstate guard).
* Verification: manual + scripted interaction checks; visual diff against layout properties.
* Acceptance: navigation/back never traps the user; dialogs match strings. **MET** — `06-dialog-exit.png`, `07-dialog-image-menu.png`, `08-dialog-upload.png`; popstate + Escape both route to the `yg.onKeyDown` handler.

### Phase 7 — Site-host harness
* **7.1** `/m/index.html` — stand-in merchant page at the exact path `X5_Activity.E` appends when `isSingleLine=0`; shows received attribution params, bridge availability, and a control panel exercising the bridge. **DONE**
* **7.2** Clear labelling that it is a harness for the unavailable remote site. **DONE**
* Verification: shell → harness round trip (all params + calls). **DONE**
* Acceptance: harness proves the container + bridge work end-to-end without pretending to be the original product. **MET**

### Phase 8 — Persistence & telemetry integration
* **8.1** device registration, session rows, event + log ingestion wired to the shell.
* **8.2** domain health reporting (`/api/domain/report`), blacklist endpoint.
* **8.3** push subscription storage.
* Verification: SQL assertions after a scripted boot; table row counts and content.
* Acceptance: every write endpoint persisted exactly once per action, validated input, no SQL errors in logs. **MET** — rows asserted in `devices`, `sessions`, `events`, `client_logs`, `domain_checks` after a browser session; all writes use prepared statements.

### Phase 9 — Functional test suite
* **9.1** node tests (pure logic: URL, route selection, storage TTL, track id, param merge).
* **9.2** PHP endpoint tests (happy path + validation failures + method not allowed).
* **9.3** browser-level scripted run (Playwright via cloud browser) covering boot → resolve → load → dialogs → bridge.
* Acceptance: all suites green; failures documented instead of suppressed. **DONE-U** — 9.1 (25 tests) and 9.2 (35 checks) green; 9.3 performed manually with the browser snapshot/click/type tools because `preview_playwright` fails in this environment (see `docs/VERIFICATION.md` §7).

### Phase 10 — Visual fidelity audit
* **10.1** splash, loading (3 states), dialogs, toast, debug console screenshots.
* **10.2** compare against recovered resources/measurements (colours, radii, spacing, min sizes).
* Acceptance: documented side-by-side table; deviations listed with rationale. **MET** — eleven PNGs in `docs/verification/` (splash, three loading states, four dialogs, debug console, isolated toast) plus a download payload.

### Phase 11 — Documentation & handover
* **11.1** `docs/ARCHITECTURE.md`, `docs/API.md`, `docs/RECONSTRUCTION_NOTES.md` (evidence→decision), `docs/VERIFICATION.md` (how to re-run).
* **11.2** README with setup (PHP/MySQL), seeding, serving, tests.
* **11.3** Update this directive (checklists, session log, limitations).
* Acceptance: a new agent can reproduce the environment and continue from the doc alone. **MET** — `README.md`, `docs/ARCHITECTURE.md`, `docs/API.md`, `docs/RECONSTRUCTION_NOTES.md`, `docs/VERIFICATION.md`.

### Phase 12 — Final completeness audit
* Re-walk §6 inventory; every row either exists with evidence or is marked BLOCKED/PART with reason.
* Re-run all suites after the last code change.
* Confirm evidence tree untouched (`git status` on that path).
* Acceptance: honest, evidence-backed completion report in §14. **MET** — see §14/§15.

---

## 12. Verification protocol

1. **Static:** `php -l` for every PHP file; `node --check` for every JS file.
2. **Database:** migrate from empty DB twice (idempotency); inspect `SHOW CREATE TABLE` for FKs/indexes.
3. **API:** `tests/api_test.sh` — asserts JSON envelopes and error codes for all §10.2 rows.
4. **Logic:** `node tests/js/*.test.mjs` — deterministic unit tests for the reconstructed algorithms.
5. **End-to-end:** boot `php -S 0.0.0.0:<port> router.php`, run the shell against seeded domains, verify resolution path, dialog paths, bridge harness, DB rows.
6. **Visual:** screenshots of splash/loading/dialogs/console; compare with recovered drawables and measurements.
7. **Regression:** rerun 3–6 after any change touching shell or backend.
8. Report failures verbatim; never mark a check passed that was not executed.

---

## 13. Known limitations & documented inferences

1. **The product itself is not reconstructable.** The shell loads a remote site; its HTML/JS is not in the repository. The reconstruction therefore ships a labelled harness (`web/m/`) at the exact requested path as the WebView content. No betting mechanics were invented.
2. **Numeric resource IDs could not be resolved** (`public.xml` is renumbered). String/text mapping in §9 is inferred from call sites; each mapping is justified in `docs/RECONSTRUCTION_NOTES.md`.
3. **Cross-origin bridge limitation.** `@JavascriptInterface` has no web equivalent for a cross-origin iframe. Same-origin pages get direct bridge injection; cross-origin pages get a `postMessage` relay and a documented capability loss (no clipboard override, no automatic bridge object).
4. **Native-only capabilities** (FCM token, Adjust/AppsFlyer/OpenInstall/Snowball SDKs, OAuth providers, APK install) are preserved as **contracts** with equivalent server-side storage or explicit failure callbacks. They are not faked.
5. **`assets/offline/` was absent** from the decompilation, so the offline cache is exercised with locally generated sample assets under `web/offline/`; the interception rules (js → `application/x-javascript`, css → `text/css`, else `text/html`, `Access-Control-Allow-Origin: *`) are reproduced exactly.
6. **`device` GAID** is replaced by a persisted random advertising-style id (`gaid_<merchant>`), since browsers expose no GAID.
7. **Anti-hijack keyword check** can only run for same-origin content in a browser; cross-origin responses are opaque. Documented in `docs/RECONSTRUCTION_NOTES.md`.
8. **`isSingleLine=0`** ⇒ the `/m/index.html` suffix and multi-line layout path are active by default, matching the APK.

---

## 14. Progress tracker (single source of truth)

| Phase | Status | Evidence / caveat |
|---|---|---|
| 0 Investigation & directive | DONE | this document; every claim carries a source path |
| 1 Backend foundation | DONE | 23 PHP files lint-clean; migrated twice on MariaDB 10.11.8; 10 tables, FKs + indexes |
| 2 Shell frontend foundation | DONE | `index.html`, `shell.css`, original drawables, `02-splash.png` |
| 3 Routing & persistence | DONE | 25/25 unit tests; cache fast path + backup recursion covered |
| 4 WebView container & lifecycle | DONE-U | success/fail/route-failure/retry verified in browser; offline, HTTP-error and hijack branches implemented but not browser-exercised |
| 5 JS bridge | DONE | 23 `Android` methods + `JSInterface`/`LaunchOpen`/`LaunchClose`/`Color`/`Log*`; same-origin injection and `postMessage` relay |
| 6 Secondary webview & peripheral UI | DONE | `open-web.html`; toast, debug console, image menu, upload chooser, exit dialog screenshotted |
| 7 Site-host harness | DONE | `web/m/index.html` at the exact requested path, clearly labelled |
| 8 Persistence & telemetry integration | DONE | DB rows asserted after a live browser session |
| 9 Functional test suite | DONE-U | 9.1 25/25, 9.2 35/35; 9.3 done manually (Playwright tool unavailable here) |
| 10 Visual fidelity audit | DONE | 11 screenshots in `docs/verification/` |
| 11 Documentation & handover | DONE | `README.md` + `docs/{ARCHITECTURE,API,RECONSTRUCTION_NOTES,VERIFICATION}.md` |
| 12 Final completeness audit | DONE | §6 inventory re-walked; evidence tree untouched (`git status` shows only new reconstruction paths) |
| 13 Delivery to version control | DONE | `cd6c22a` on `main`; push verified against `origin/main` (§15) |

Legend: `TODO` / `WIP` / `DONE` / `DONE-U` (implemented, verification limited) / `BLOCKED`.

Not claimed as done, by design: the merchant product itself, provider SDK behaviour, FCM delivery,
OAuth sign-in, cross-origin bridge injection and native-only paths (§13). None of these is faked in
the codebase.

---

## 15. Session log & handover

### Session 001 — 2026-11-07 — Freebuff (autonomous)
* **Phase:** 0 → 12 (full run).
* **Investigated:** full manifest, all 21 app-owned sources, shell classes (`yg`, `jg`, `mg`, `rm`, `zq1`, `ak1`, `kf`, `sx0`, `p20`, `r20`, `bu0`, `wv1`, `j10`), bridges (`gs0`, `qg`, `ig`, `tg`, `ug`, `rg`, `wg`, `vg`, `xg`), loading/dialog classes (`mz0`, `c6`, `nz0`, `f6`, `b6`), resources (layouts, strings, styles, colours, drawables, mipmaps).
* **Key finding:** the APK is a WebView shell; no local product UI, no local DB. All reconstructed behaviour lives in the shell, the resolver, the bridge and the server contract.
* **Created:** `WEB_RECONSTRUCTION_DIRECTIVE.md`, `README.md`, `.gitignore`, `docs/{ARCHITECTURE,API,RECONSTRUCTION_NOTES,VERIFICATION}.md`, `docs/verification/*` (11 PNGs + one download payload), and `web/**`:
  * frontend: `index.html`, `open-web.html`, `sw.js`, `assets/css/shell.css`, `assets/img/*` (originals), `assets/js/{app,app-config,app-url,bridge,debug-log,device,dialogs,domain-route,downloads,i18n,loading-dialog,net,storage,toast,track-id,webview}.js`;
  * harness: `m/index.html`, `m/site.js`, `m/site.css`, `offline/`;
  * backend: `api/index.php`, `api/src/{Db,Http,Router,Support}.php`, `api/src/routes/*.php` (11 routes), `router.php`, `.htaccess`;
  * data/config/ops: `sql/{schema.sql,seed.sql}`, `config/{config.php,config.example.php,config.local.php}`, `bin/{migrate.php,serve.sh,db-info.php}`;
  * tests: `tests/api_test.sh`, `tests/js/*.test.mjs`.
* **Verification performed** (details and commands in `docs/VERIFICATION.md`):
  * `php -l` on all 23 PHP files → clean; `node --check` on all JS → clean; `bash -n` on both scripts → clean.
  * `bin/migrate.php` → 10 tables, merchant `sige7tlbf5`, version `2.4.87`, 11 merchant hosts, backup `https://www.112121313.com`; second run idempotent.
  * `tests/api_test.sh` → **passed: 35, failed: 0**.
  * `node --test tests/js/` → **25 pass, 0 fail**.
  * Browser end-to-end on the preview origin (port 3000): splash → resolve → loading → `find_fastest_route` toast → embedded `/m/index.html?affiliateCode=_&fbPixelId=_&tid=_0&gaid=…&snowBallAppId=_`; cache fast path on reload (no `domainRoute` call); bridge 23 methods and `getVersion()=2.4.87`; storage round trip; event and log rows; image menu + copy toast; upload chooser; exit dialog; duplicate route-failure dialog; text/blob downloads. Console clean throughout.
* **Final pass after a runner restart:** re-linted PHP/JS, re-ran both suites (25/25, 35/35), reloaded the preview (all assets 200, no console messages, cache fast path used so no `domainRoute` request), and re-checked the last edited behaviours in the live page: clicking the harness file input opens the Camera/Album/Cancel chooser with focus inside the dialog, Cancel closes it without opening a picker, Escape opens the non-cancelable exit dialog (`Reminder` / `Ok to leave the game`), Cancel dismisses it and OK closes the window. `11-toast.png` was re-captured as a real isolated toast.
* **Environment facts recorded for the next agent:** the toolchain is a static PHP 8.4.8 at `.tools/php` (a file, not a directory — invoke `./.tools/php`) and MariaDB 10.11.8 at `.tools/mariadb-10.11.8-linux-systemd-x86_64`, socket `.tools/mysql.sock`, started by `.tools/start-db.sh`. The MariaDB CLI client cannot load (`libncurses.so.5`), so use `web/bin/db-info.php`. Dev server: `cd web && PHP_BIN=../.tools/php ./bin/serve.sh 3000`. Preview must use port 3000. `preview_playwright` is broken here (`options.mode` must be `'strip'`), so browser checks use snapshot/click/type tools.
* **Version control:** phase-complete work is committed and pushed to the repository's established branch `main` (remote `origin`, <https://github.com/https10011/REPURPOSE>). Delivery commit `cd6c22a` ("Reconstruct the Sige77 APK as a web application (PHP/MySQL shell)") — 78 files: `web/`, `docs/`, `README.md`, `.gitignore`, this directive. Push verified: `origin/main` and local `HEAD` both resolved to `cd6c22a` after `git fetch`. `.tools/`, `web/var/` and `web/config/config.local.php` are git-ignored, so no toolchain binaries or machine credentials are in the repository. The Firebase Web API key present in `strings.xml` was removed before committing (kept as an empty field in `web/assets/js/app-config.js`, documented in `docs/RECONSTRUCTION_NOTES.md` §5.9); a scan for `AIza…`/`ghp_`/`AKIA…`/private-key headers over every committed file is clean. Nothing was force-pushed and the original history (`921ab40`, `5329b56`) is intact.
* **Known gaps:** §13, plus the browser-unexercised branches listed in §14 (offline, HTTP-error and anti-hijack paths verified only at unit level).
* **Next actions for the succeeding agent:** none required for the requested scope. Optional hardening, in priority order: (a) proxy cross-origin merchant content through the same origin so the anti-hijack check and direct bridge injection apply to it; (b) real VAPID keys + provider OAuth credentials to replace the `Failure: …` callbacks; (c) add a second browser pass for the offline/HTTP-error/hijack branches; (d) re-run §12 on the deployment origin before shipping.

> **Handover template** — every future session must append a new sub-section here with: date, agent, phases touched, files created/modified, tests run + results, blockers, exact next steps, and any instruction changes.

---

## 16. Standing instructions for future agents

1. Read this directive first; never modify the evidence tree.
2. Verify the repository state against §14 before assuming progress.
3. Keep the original contracts: DOM ids/storage keys/bridge names must remain compatible.
4. Never invent product features that are not evidenced; document assumptions in `docs/RECONSTRUCTION_NOTES.md`.
5. Any change to shell behaviour or backend contract requires re-running the matching checks from §12.
6. Record the session in §15 with honest statuses; never mark unverified work DONE.
7. Keep the app deployment-ready (config via env, `sql/schema.sql` idempotent) — but deployment itself is the owner's responsibility.
