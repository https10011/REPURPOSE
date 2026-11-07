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
├── harness/{index.html,harness.js,harness.css} # embedded-content harness (bridge contract demo)
├── m/                                # THE APP: index.html, css/app.css, js/{app,router,api,store,ui,notify}.js
│   └── js/screens/                   # login, register, otp, home, games, game, notifications, profile
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
| 14 Addendum A: schema + auth/OTP/notification/account API | DONE | 9 tables + catalog seed; API suite 90/90; engine 33/33; `daily_credits` claim added in session 003 |
| 15 Addendum A: app screens | DONE | 8 owner screens under `web/m/`; every route browser-walked and captured (session 003); `#/settings` is a section inside `#/profile`, not a route |
| 16 Addendum A: games + wallet | DONE | catalog + 3 playable games + 1 `BLOCKED`; stake bounds, payout maths, insufficient balance and the daily top-up covered by tests and browser runs |
| 17 Addendum A: verification & docs | DONE | 90/90 API, 33/33 engine, 25/25 JS; 16/16 browser checks via `tests/app_browser_check.mjs`; 11 owner screens captured in `docs/verification/20-…27-…` (§15 session 003) |
| 18 Source-to-web fidelity audit | DONE | `docs/FIDELITY_AUDIT.md`; re-runnable `docs/verification/run_fidelity_audit.sh` → all checks pass; bridge 23/23 identical, 5 assets md5-identical, 0 game/DB classes in the APK (session 004) |
| 19 Shared-hosting deployment readiness | DONE | `web/bin/package.sh` → `web/dist/`; `docs/DEPLOYMENT.md` with quoted host limits; packaged tree deployed to a fresh DB and the whole suite re-run green (session 004) |

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
* **Version control:** phase-complete work is committed and pushed to the repository's established branch `main` (remote `origin`, <https://github.com/https10011/REPURPOSE>). Delivery commit `cd6c22a` ("Reconstruct the Sige77 APK as a web application (PHP/MySQL shell)") — 78 files: `web/`, `docs/`, `README.md`, `.gitignore`, this directive. Push verified with `git fetch`: `origin/main` and local `HEAD` both resolved to `cd6c22a`. The follow-up commit that writes this record is `f986f1a`; `main` is fully pushed with no local-only work left behind. `.tools/`, `web/var/` and `web/config/config.local.php` are git-ignored, so no toolchain binaries or machine credentials are in the repository. The Firebase Web API key present in `strings.xml` was removed before committing (kept as an empty field in `web/assets/js/app-config.js`, documented in `docs/RECONSTRUCTION_NOTES.md` §5.9); a scan for `AIza…`/`ghp_`/`AKIA…`/private-key headers over every committed file is clean. Nothing was force-pushed and the original history (`921ab40`, `5329b56`) is intact.
* **Known gaps:** §13, plus the browser-unexercised branches listed in §14 (offline, HTTP-error and anti-hijack paths verified only at unit level).
* **Next actions for the succeeding agent:** none required for the requested scope. Optional hardening, in priority order: (a) proxy cross-origin merchant content through the same origin so the anti-hijack check and direct bridge injection apply to it; (b) real VAPID keys + provider OAuth credentials to replace the `Failure: …` callbacks; (c) add a second browser pass for the offline/HTTP-error/hijack branches; (d) re-run §12 on the deployment origin before shipping.

> **Handover template** — every future session must append a new sub-section here with: date, agent, phases touched, files created/modified, tests run + results, blockers, exact next steps, and any instruction changes.

---

## 16. Standing instructions for future agents

1. Read this directive first; never modify the evidence tree.
2. Verify the repository state against §14 before assuming progress.
3. Keep the original contracts: DOM ids/storage keys/bridge names must remain compatible.
4. Never invent product features that are not evidenced; document assumptions in `docs/RECONSTRUCTION_NOTES.md`. The one sanctioned exception is the owner's Addendum A (§17), where every non-evidenced screen is labelled `OWNER` and may not be presented as recovered.
5. Any change to shell behaviour or backend contract requires re-running the matching checks from §12.
6. Record the session in §15 with honest statuses; never mark unverified work DONE.
7. Keep the app deployment-ready (config via env, `sql/schema.sql` idempotent) — but deployment itself is the owner's responsibility.

---

## 17. Addendum A — client-side completion and the self-contained application

**Source:** owner addendum dated 2026-11-07 ("Complete client-side reconstruction, self-contained
application, and authentication/game flow"). It supersedes the earlier assumption that the shell
alone is the whole deliverable, and it relaxes §16 rule 4 for exactly the scope listed below.

### 17.1 The scope change, stated precisely

The earlier sessions reconstructed what the APK *contains*: a WebView launcher. The addendum asks
for the **whole client experience** — screens, navigation, login/registration, profile, games — and
insists that missing backend infrastructure is not a reason to omit a screen.

Both statements are true at once, and they must not be confused:

* **Evidenced scope** (APK is the reference): the launcher, splash, domain resolution, WebView,
  bridge, dialogs, toasts, loading states, downloads, secondary WebView, offline cache. Already
  reconstructed 1:1 and unchanged by this addendum.
* **Owner-specified scope** (addendum is the reference): login, registration, local OTP, home,
  game catalog, game play, profile, notifications. The APK has **no** evidence for these — the
  merchant site behind the WebView (unavailable) held them. They are built to the addendum's
  stated contract and labelled `OWNER` wherever they appear, never presented as recovered assets.

The application is delivered as the page the shell's WebView frames (`/m/index.html`), which is
exactly where the real product lived. The APK therefore keeps its true shape — launcher → splash →
domain route → WebView → site — while the site is now self-contained instead of remote.

### 17.2 Evidence verdict for the addendum's assumptions

| Assumption in the addendum | What the evidence shows | Consequence |
|---|---|---|
| Many native screens exist | `AndroidManifest.xml` declares exactly two app activities: `X5_Activity` (launcher) and `OpenWebActivity`; `res/layout/` holds one app layout, `activity_webs.xml` (WebView + hidden debug TextView/Button + loading overlay) | No native screen exists to inventory; the shell is complete |
| Login/registration screens exist | No activity, layout, fragment or string for login/register/OTP. The `login`/`game` hits in `strings.xml` belong to bundled SDKs (LINE, Facebook, Google) | Login/registration are built to the addendum contract (`OWNER`) |
| Games exist in the client | No game class, asset, layout, JSON or string; no `assets/` directory at all, no HTML/JS/DB file anywhere in the tree | Game logic is not recoverable; catalog and mechanics are `OWNER` |
| A local database exists | No Room/SQLite/Realm dependency, no `.db`/`.sqlite` asset, no DAO. Persistence is `SharedPreferences` (`Android.storage*`) and the HTTP cache | Schema is authored; the only evidenced storage contract is the bridge's key/value calls |
| Remote APIs can be replaced locally | The only evidenced remote contract is `GET /wps/system/domainRoute` (already reimplemented) plus telemetry | Telemetry endpoints already reconstructed; new endpoints are `OWNER` |

`/wps/system/domainRoute`, the bridge surface, and every reconstructed telemetry endpoint keep
working unchanged; the addendum adds a product layer on top of them.

### 17.3 Screen inventory

Legend for **Status**: `DONE` = reconstructed, `OWNER-DONE` = built to the addendum contract,
`BLOCKED` = documented placeholder (no evidence, no safe equivalent).

**A. Evidenced surfaces** (all `DONE`, unchanged by this addendum)

| # | Original | Source | Purpose | Components | Entry → exits | Data | Verification |
|---|---|---|---|---|---|---|---|
| 1 | Splash (`SplashTheme`) | `res/values/styles.xml`, `drawable/shape_splash.xml` | First frame | centred 90dp logo on `splash_bg` | process start → loading | assets | `01`/`02` screenshots |
| 2 | Loading overlay | `activity_webs.xml` `@id/loading`, `drawable/icon_bg` | Domain resolution wait | fullscreen `icon_bg` | splash → WebView | — | `02-splash.png` |
| 3 | Loading dialog | `mz0`, `drawable/dialog_bg`, `loading_dialog_view` | In-page waits | 50dp loader + 12sp text | any → dismiss | text | `03`–`05` |
| 4 | Alert dialogs | `f6`/`b6` (Material AlertDialog) | Route failure, image menu, upload chooser, exit | title/message/actions | any → dismiss | strings | `06`–`09` |
| 5 | Toast | `com.hjq.toast` + `dimens.toast_y_offset` | Transient feedback | card, bottom 36dp | any | text | `10`/`11` |
| 6 | Debug console | `activity_webs.xml` `webviewtext`/`webviewbutton` | `LogOpen`/`LogTest`/`LogClose` | 14sp TextView + button | bridge → self | log lines | browser probe |
| 7 | WebView content | `X5_Activity` | The product surface | iframe | loading → site | attribution query | end-to-end browser run |
| 8 | Secondary WebView | `OpenWebActivity` | In-app browser | iframe + floating close | bridge `openWebView` → close | URL | `open-web.html` |
| 9 | File chooser | `WebChromeClient` + camera/album dialog | Upload | chooser → picker | `input[type=file]` | files | live probe |

**B. Owner-specified screens** (addendum §2, §4; no APK evidence)

| # | Screen | Route | Purpose | Components | Navigation | Data / API | Status |
|---|---|---|---|---|---|---|---|
| 10 | Login | `#/login` | Phone + password sign-in | logo, 2 fields, primary button, "Create account" | → home; → register | `POST /api/auth/login` | OWNER-DONE |
| 11 | Register | `#/register` | Name, phone, password + confirmation | 4 fields, terms line, button | → OTP; → login | `POST /api/auth/register` | OWNER-DONE |
| 12 | OTP verification | `#/otp` | 6-digit code, locally generated and delivered as an in-app notification | 6 boxes, resend timer, "Send code" | → home | `POST /api/auth/otp/request`, `/verify` | OWNER-DONE |
| 13 | Home | `#/home` | Signed-in landing | balance card, quick actions, game grid, claimable daily-credits strip, bottom nav | → games/game/notifications/profile; → site | `GET /api/account`, `/api/games`, `POST /api/wallet/claim` | OWNER-DONE |
| 14 | Games catalog | `#/games` | Full catalog with categories | search, category chips, tiles with status | → game | `GET /api/games` | OWNER-DONE |
| 15 | Game play | `#/game/:slug` | Playable games + documented placeholders | rules sheet, stake controls, board, history | ← catalog | `POST /api/games/play` | OWNER-DONE / BLOCKED per game |
| 16 | Notifications | `#/notifications` | OTP codes, account notices and credit grants | list, unread dot, mark-read | ← any | `GET /api/notifications` | OWNER-DONE |
| 17 | Profile | `#/profile` | Account details, balance, session, logout, "Open Sige77 site" | rows, buttons | ← any; → login | `GET /api/auth/session`, `POST /api/auth/logout` | OWNER-DONE |
| 18 | Settings | inside `#/profile` | Language/notification toggles that exist in the shell only | switches | — | local storage | OWNER-DONE |
| 19 | Daily credit claim | inside `#/home` | The promo strip as a real control: grants the demo allowance once per UTC day | strip + claim button (disabled once claimed) | — | `POST /api/wallet/claim` | OWNER-DONE |

Loading, empty and error states exist on every screen (skeleton list, "no games", inline field
errors, retry button) as required by addendum §2.

### 17.4 Navigation map

```
process start
  └─ splash ─→ domain route ─→ WebView ─→ /m/index.html (app)
        ├─ no session ─→ #/login ──→ #/register ──→ #/otp ──→ #/home
        └─ session    ─────────────────────────────────────────→ #/home
#/home ─┬─ #/games ─→ #/game/:slug
        ├─ #/notifications
        ├─ #/profile ─→ #/login (after logout)
        └─ /index.html (the shell's own launcher, "Open Sige77 site")
```

The router is hash-based so the app keeps working when served from a sub-path and when the shell
reloads the frame. `#/` redirects to `#/home` or `#/login` depending on the server session.

### 17.5 Local authentication contract (addendum §4)

* **Login** — phone number + password. Phone is normalised to digits (`+63…`, `09…`, `9…` all map to
  the same account). Wrong password and unknown phone return the same generic error.
* **Registration** — name, phone, password, password confirmation. Saved to this application's own
  MySQL database; no external identity provider.
* **OTP** — registration and "resend" request a code. The code is generated **locally** on the
  server, stored with a 10-minute expiry, and delivered as an **in-app notification** (bell badge +
  `#/notifications`), which is the addendum's replacement for SMS. Verification accepts **any six
  digits** as instructed, so the flow never depends on an external gateway. The screen shows no
  "demo"/"simulated" wording.
* **Sessions** — `password_hash`/`password_verify` (bcrypt), 32-byte random token in an `HttpOnly`,
  `SameSite=Lax`, `Path=/` cookie, SHA-256 of the token stored in `auth_sessions`; 30-day sliding
  expiry, revoked on logout. Mutations require a same-origin `Origin`/`Referer`. Login and OTP
  requests are rate-limited per phone and per IP (the original APK's `SharedPreferences` key/value
  contract is untouched and still used for device identity).

### 17.6 Data model added by the addendum

`users`, `auth_sessions`, `otp_codes`, `app_notifications`, `wallets`, `wallet_ledger`, `games`,
`game_rounds` — all `CREATE TABLE IF NOT EXISTS` in `web/sql/schema.sql`, migrated by
`bin/migrate.php` with the existing idempotent runner. Money is stored as an integer minor unit
(credits) to avoid float drift; every balance change writes a `wallet_ledger` row in the same
transaction as the round.

### 17.7 Games (addendum §6)

No game logic, asset or catalog is present in the APK, so §6.1 cannot be satisfied from evidence.
§6.2 is therefore the governing clause:

* The catalog exists, is browsable, and every entry opens a real screen.
* Three games are **playable** with server-authoritative mechanics, RNG and payouts: `crash`,
  `dice`, `slots`. Their rules are stated on-screen. They are `OWNER` implementations — equivalent
  mechanics, not recovered code — and this is stated in `docs/RECONSTRUCTION_NOTES.md` and here.
* The catalog also contains at least one **BLOCKED** entry (`live-casino`) that renders the
  documented placeholder ("gameplay unavailable — original logic not recoverable"), proving the
  placeholder path the addendum requires without pretending to have recovered the original titles.
* No original game names are invented: the catalog contains only the three implemented games plus
  the explicitly blocked placeholder.

### 17.8 Phases added by this addendum

| Phase | Work | Acceptance |
|---|---|---|
| 13 | Addendum integration, evidence re-audit, screen inventory, roadmap | this section; no code |
| 14 | Schema + auth/OTP/notification/account API | migration idempotent; endpoint tests green |
| 15 | App screens (login, register, OTP, home, catalog, game, notifications, profile) | browser walk-through of every route |
| 16 | Games + wallet ledger | round tests incl. payout maths and insufficient balance |
| 17 | Verification, screenshots, docs, handover | updated `docs/VERIFICATION.md`, session log, push |

### 17.9 Honesty rules introduced here

1. Anything not evidenced by the APK carries the `OWNER` label in this directive and in
   `docs/RECONSTRUCTION_NOTES.md`. It is never described as recovered from the APK.
2. The word "reconstruction" describes the origin of the shell; the new screens are described as
   *reconstructed equivalents built to the owner's contract*.
3. No "demo"/"simulated" copy in the UI (owner instruction), while the documentation states plainly
   what is local, what is unavailable, and what is an equivalent.
4. A game with no recoverable logic never pretends to be the original title: it is `BLOCKED` and
   says so on screen.

### 17.10 The daily credit allowance (closing a dead end)

Credits are play money and the wallet refuses to go below zero (`Wallet::apply`), so a player who
staked away the whole balance reached a genuine dead end: every game button returned "Not enough
balance for that stake" and nothing in the app could restore the balance. The home screen already
advertised "Daily demo credits", which made the gap worse — the copy promised something no control
could deliver.

The fix makes the advertised allowance real rather than adding a new concept:

* `POST /api/wallet/claim` grants `settings.wallet_daily_credits` (default `500`) once per **UTC day**,
  decided by the newest `wallet_ledger` row with `reason = 'daily_credits'`. A second call in the same
  day is a no-op that returns the current balance and `claimedToday: true`.
* The grant is a ledger row like any other, so it appears in the profile arithmetic instead of
  materialising from nowhere; it is deliberately *not* a game round, so `stats.rounds` and
  `stats.wagered` stay honest (asserted by `claim: ledger did not change stats`).
* Each grant writes an `app_notifications` row ("Demo credits added"), which is why the alert badge
  increments after a claim — the same in-app delivery channel the OTP flow uses.
* `GET /api/account` now also returns `dailyCredits { amount, claimedToday, nextClaimAt }` so the
  screen can render the correct button state without a second request.
* The endpoint enforces the same same-origin rule as every other mutation (`Auth::requireSameOrigin`)
  and is rate-limited per user, so it is not a free-balance oracle for a cross-site page.

The strip states plainly that the credits are play money and that they refresh at 00:00 UTC; it does
not claim the player won anything.

**Tension with §17.9 rule 3, resolved deliberately.** That rule forbids "demo"/"simulated" wording in
the UI, but the master directive §6.3 requires the opposite for the OTP flow ("make the demonstration
nature clear in the interface"), and the home strip already shipped as "Daily demo credits" in session
002. Where the two conflict, this project follows the master directive: the credits are play money and
saying so is the honest choice, so the copy stays. Rule 3 continues to apply to the *verification*
claim — nothing in the UI implies a phone number was really verified — and that is where it is
enforced.

### Session 002 — 2026-11-07 — Freebuff (autonomous) — Addendum A

* **Instruction:** owner addendum requiring the complete client experience (all screens, navigation,
  login/registration with local OTP, profile, games) as a self-contained app, and per-phase commits.
* **Evidence re-audit (phase 13):** confirmed `AndroidManifest.xml` declares two app activities and
  `activity_webs.xml` is the only app layout; there is no `assets/` directory, no HTML/JS/SQL/DB file,
  no login/game/OTP string outside bundled SDKs, and no local database library. The addendum's
  premise of many native screens/games is therefore not supported by the APK; §17.2 records this
  per assumption, and the affected screens are built as `OWNER` equivalents under the addendum's own
  contract rather than fabricated as evidenced ones.
* **Deliverable of this phase:** §17 (scope split, evidence verdict, 18-row screen inventory,
  navigation map, auth contract, schema plan, games plan, phases 14–17, honesty rules), tracker rows
  and the §16 rule-4 exception.
* **Phase 14 (schema + API):** nine `CREATE TABLE IF NOT EXISTS` additions (users, auth_sessions,
  otp_codes, app_notifications, wallets, wallet_ledger, games, game_rounds, rate_limits), catalog
  seed, `--fresh` drop list extended. New code: `api/src/Auth.php` (phone normalisation, bcrypt,
  HttpOnly SameSite cookies with SHA-256 at rest, same-origin enforcement, fixed-window limiter, OTP
  issue/verify), `api/src/Wallet.php` (transactional integer ledger), `api/src/GameEngine.php`
  (crash/dice/slots with injectable RNG), and eleven routes under `/api/auth/*`, `/api/account`,
  `/api/notifications`, `/api/games*`. `/api/health` now covers all 19 tables.
* **Phase 14 verification:** `web/tests/api_test.sh` 78/78 (auth, OTP, catalog, four game cases,
  cross-site 403 with and without Origin, logout/login round-trip, balance arithmetic);
  `web/tests/game_engine_test.php` 33/33 (exact payouts under an injected RNG, validation errors,
  slot paytable RTP 207/216); JS suite still 25/25.
* **Next:** phase 15 (app screens).

### Session 003 — 2026-11-07 — OpenHands (autonomous) — screens, games and the credit dead end

* **Instruction:** continue the roadmap; finish the reconstructed app at `/m/`, verify it, and commit.
* **Starting point:** `278ae03` (Addendum A phase 14). Working tree held the harness move
  (`web/m/site.{css,js}`, `web/m/index.html` → `web/harness/`) and a new, untracked `web/m/` app.
  Nothing from the previous session was deleted; the move is a rename only, and `web/harness/` still
  serves the labelled demo page the shell's WebView frames.
* **What was found and fixed (the one real defect this session):** a busted player was permanently
  locked out. `Wallet::apply` correctly refuses to take a balance below zero, so after staking the
  whole balance every game answered "Not enough balance for that stake" — and the home screen's
  "Daily demo credits" strip was static copy with no control behind it, promising an allowance the
  app could not grant. Fixed by making that advertised allowance real: `POST /api/wallet/claim`
  (`api/src/routes/wallet_claim.php`) grants `settings.wallet_daily_credits` (seeded `500`) once per
  UTC day, decided by the newest `wallet_ledger` row with `reason = 'daily_credits'`; a same-day
  repeat is a no-op. It writes a normal ledger row and an `app_notifications` row, and
  `GET /api/account` now returns `dailyCredits { amount, claimedToday, nextClaimAt }`. Same-origin
  enforced and rate-limited like every other mutation. §17.10 documents the reasoning.
* **Honesty fix required by the master directive §6.3:** the OTP screen read "Enter the 6-digit code
  sent to <phone>" while `Auth::verifyOtp` accepts any six digits as long as an unexpired code row
  exists for that number. That is precisely the "secretly accept arbitrary codes while claiming the
  phone was verified" failure §6.3 forbids. The copy now reads "Enter the 6-digit code for <phone>"
  with an explicit line stating the build has no SMS gateway, the code is generated on this server,
  and the number itself is not confirmed. Behaviour is unchanged; only the claim made to the user.
  §17.10 records the deliberate tension with §17.9 rule 3 and how it is resolved.
* **Test-harness corrections (both were fragile assertions, not product bugs):** the notification
  check asserted `notifications[0].title == 'Account verified'`, which the new grant notification
  displaced; it now asserts membership of the list. The login-persistence check asserted
  `balance < 1000`, which a top-up invalidated; it now captures the balance before logout and
  asserts exact equality after login — a stricter test of the same property.
* **Verification performed this session:**
  * `php -l` on every changed PHP file and `node --check` on every changed JS file → clean;
    `bash -n tests/api_test.sh` → clean.
  * `bin/migrate.php` → idempotent; 21 schema statements, 7 seed statements.
  * `tests/api_test.sh http://127.0.0.1:12000` → **passed: 90, failed: 0** (12 new claim assertions:
    grant amount, credited balance, same-day no-op, `claimedToday` on both endpoints, stats
    untouched, cross-site 403).
  * `node --test tests/js/*.test.mjs` → **25 pass, 0 fail** (the invocation matters: the glob, not
    the `tests/js` directory path).
  * `php tests/game_engine_test.php` → **33 pass, 0 fail**.
  * Browser walk-through on the preview origin: signed-out `#/profile` → `#/login`; register with a
    duplicate phone → "That phone number already has an account."; wrong password → generic error
    with no account enumeration; registration → OTP screen showing the new honest copy → verify →
    `#/home` at 1,000 credits; claim → 1,500 credits with "Claimed today" disabled, `rounds`/`staked`
    still 0 and net still `+0`, alert badge 1 → 2, and "Demo credits added" present in
    `#/notifications`; reload → balance and claimed state persist; crash play → stake debited,
    payout credited, round in history; `Max` then play on a drained wallet → "Not enough balance for
    that stake" (402 path).
* **Files changed:** added `web/api/src/routes/wallet_claim.php`; modified `web/api/index.php`,
  `web/api/src/routes/account.php`, `web/sql/seed.sql`, `web/m/js/api.js`,
  `web/m/js/screens/home.js`, `web/m/js/screens/otp.js`, `web/m/css/app.css`,
  `web/tests/api_test.sh`; renamed `web/m/{site.css,site.js,index.html}` → `web/harness/`.
* **Known limitations:** the `#/settings` surface is a section inside `#/profile`, not its own route
  (unchanged from session 002). The merchant product, provider SDKs, FCM delivery and cross-origin
  bridge injection remain out of scope by design (§13).
* **Verification added after the first push (same session).** Phase 17 had been left `DONE-U`
  because the screenshots had not been re-captured. They now have been, and the gap that made them
  look optional is closed: `tests/app_browser_check.mjs` walks the app in a real browser, plays a
  round and asserts the balance and stats moved (16/16). It is optional and self-skipping — it needs
  `playwright-core` and a browser — and it holds two honesty guards so the §6.3 defect this session
  fixed cannot come back silently: the OTP screen must not claim delivery, and a blocked title must
  keep explaining itself. `docs/verification/20-app-…27-app-…` (11 distinct captures, 412×915 at 2×)
  were taken with the same browser, and the run reported no console errors or failed requests.
  Phases 15 and 17 are therefore `DONE`, not `DONE-U`.
* **A note on method:** the first screenshot pass looked fine but was taken with a hash-only
  navigation that resolved against the previous DOM, so several frames showed stale screens. The
  assertions caught it (4 "failures" that were test bugs, not app bugs) and both the capture script
  and the test now wait for the router. Worth remembering before trusting a screenshot again.
* **Version control:** committed as `f23a290` ("Complete the client app, fix the credit dead end and
  the OTP claim (Addendum A phases 15-17)") and pushed to the established branch `main` (remote
  `origin`, <https://github.com/https10011/REPURPOSE>). Verified with `git fetch`: `origin/main` and
  local `HEAD` both resolve to `f23a290`. The evidence tree is untouched — `git status` shows only
  reconstruction paths. Nothing was force-pushed and no history was rewritten.
* **Next actions for the succeeding agent:** (a) proxy cross-origin merchant content through the
  same origin so the anti-hijack check and direct bridge injection apply to it; (b) real VAPID keys
  and provider OAuth credentials to replace the `Failure: …` callbacks; (c) ~~add a second browser
  pass for the offline/HTTP-error/hijack branches~~ done — `tests/shell_browser_check.mjs`; (d)
  re-run §12 on the deployment origin before shipping. Nothing in phases 0–17 is outstanding.

### Session 004 — 2026-11-07 — OpenHands (autonomous) — final directive: fidelity audit + deployment

**Scope.** The final directive asked for three things: (1) establish repository/APK ground truth,
(2) audit the source-to-web fidelity, (3) make the app shared-hosting ready. Baseline at session
start: `475f0ee`, clean, in sync with `origin/main`.

* **Ground truth established (§FIDELITY_AUDIT §1).** `prod.app_sige7tlbf5.com`, label *Sige77*,
  v2.4.87, jadx. **20 app-owned Java files** under `src/java/prod/apptest/**` out of 4,966 total;
  **2 app activities** (`X5_Activity`, `OpenWebActivity`); **4 app layouts**. The decisive artefact
  is the manifest `<meta-data name="merchant_url">` listing **11 remote domains** — the APK is a
  WebView shell that frames an external merchant site.
* **Fidelity audit (`docs/FIDELITY_AUDIT.md`).** The central claim — *the APK contains no game
  logic and no product screen* — was verified **four independent ways**, all agreeing:
  (a) 0 game-named classes; (b) no app auth classes (only the LINE SDK); (c) app `strings.xml`
  holds only shell strings; (d) 0 app-owned SQLite/Room files. The single SQLite mention in an
  app-reachable class (`defpackage/ab.java`) is a synthetic Firebase Analytics listener touching
  `log_event_dropped`/`global_log_event_state` — not app data — so the verdict stands.
* **Claims re-verified against the artefacts, not the prose.** The "23-method bridge" is exact: the
  Java (`gs0` 22 + `ig` 1) and the JS (`bridge.js` `Android` object) yield identical 23-name sets
  (`diff` clean). All five reused binaries are **md5-identical** to the originals (`splash_bg.jpg`,
  `splash_logo.jpg`, `icon_bg.jpg`, `close_floating_window.png`, `ic_launcher.png`). The stack has
  **no runtime dependencies** (no Composer, npm, vendor, outbound network, cron or SSH).
* **Re-runnable audit:** `docs/verification/run_fidelity_audit.sh` performs every static check above
  and exits non-zero on any failure. It passes.
* **Two audit findings that are intended behaviour, not bugs.** A wrong OTP was accepted and a
  mutation without an `Origin` header was rejected; both were checked against the source before
  being judged. The first is an explicit owner instruction (§17.5) whose honesty problem was
  already fixed in session 003 (the screen now states there is no SMS gateway and the number is not
  confirmed). The second is the CSRF guard working. Neither was "fixed" — changing them would have
  been the actual defect.
* **Clean-install runtime audit.** Migrated a **brand-new** database (`sige77_fresh`): 21 schema +
  7 seed statements, 19 tables. Full journey — register → OTP → verify → session → 4 game rounds →
  logout → re-login — with the balance (`937`) and the `wallet_ledger` rows matching between the API
  and MySQL. Suites on the clean instance: **API 90/90, JS 25/25, engine 33/33**.
* **Shared-hosting readiness (`docs/DEPLOYMENT.md`, `web/bin/package.sh`).** Requirements measured
  from the code: **PHP ≥ 8.1** (`never` return types; `str_starts_with`), `pdo_mysql`/`json`/
  `mbstring`/`session`, Apache + `.htaccess`; nothing else. Host limits taken from the hosts' own
  pages: InfinityFree — **PHP 8.3** (<https://forum.infinityfree.com/t/free-hosting-is-now-upgraded-to-php-8-3/109714>),
  PDO/MySQLi "available on all accounts", DB hostname must be the panel value (not `localhost`), DB
  reachable only from inside the platform, **cron disabled**, no SSH. AeonFree — pages **contradict
  each other** (homepage "PHP 8.2" vs PHP/MySQL page "PHP 7.4"), so the notes tell the operator to
  check `phpinfo()` first; InfinityFree is the safer default. Neither cron nor SSH is needed.
* **Deployment package verified end-to-end.** `bin/package.sh` builds `web/dist/{sige77-web-<date>.tar.gz,
  database.sql, DEPLOY.txt}` and excludes `tests/`, `harness/`, `bin/`, `var/`, `node_modules/` and
  the local `config.php`. Extracted the archive, imported `database.sql` into a fresh DB
  (`sige77_deploy`), served it, and re-ran everything: **API 90/90, JS 25/25, engine 33/33, app
  browser 16/16, shell browser 15/15**. All five internal paths return 404/403.
* **A useful negative result.** The first shell-browser run on the package failed 2/15 because the
  audit had baked the placeholder domain `sige77.example.com` into the DB. The shell frames whatever
  the `domains` row returns, so the fix was to point it at the serving origin — which is exactly the
  caveat now written into `DEPLOY.md` §4.6.
* **Files added:** `docs/FIDELITY_AUDIT.md`, `docs/DEPLOYMENT.md`,
  `docs/verification/run_fidelity_audit.sh`, `web/bin/package.sh`. Modified: `README.md`,
  `.gitignore` (ignore `web/dist/`), this directive.
* **Files deliberately not touched:** the entire evidence tree, and every product file (no source
  change was warranted — the audit found no defect).
* **Version control:** committed as `1e62803` (delivery commit; the follow-up commit that writes this record is the tip) and pushed to `main`
  (<https://github.com/https10011/REPURPOSE>). `origin/main` and local `HEAD` both resolve to the pushed tip; verified with `git fetch`.
  Evidence tree untouched; no force-push; no history rewritten.
* **Next actions for the succeeding agent:** (a) run §4 of `docs/DEPLOYMENT.md` on the owner's real
  hosting account — the only step this environment cannot perform; (b) if a host turns out to be
  PHP < 8.1, either move host or rewrite the two 8.1-only constructs (`never` returns,
  `str_starts_with`); (c) optional hardening from §15 session 001 still stands (proxy cross-origin
  merchant content, real VAPID/OAuth credentials).
