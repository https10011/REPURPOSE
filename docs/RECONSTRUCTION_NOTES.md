# Reconstruction notes — evidence, decisions, limitations

Every reconstructed behaviour below is traced to the decompiled artefact. Paths are relative to
`Sige77_20261106_2144_[jadx]/`.

## 1. Nature of the artefact

`AndroidManifest.xml` declares one launcher activity (`prod.apptest.com.activity.X5_Activity`), a
secondary web activity (`OpenWebActivity`), one FCM service and library components. There is no
local database, no Room schema, no bundled HTML/JS and no native product UI: `X5_Activity` extends
`defpackage/yg` (a ~1.3 kLOC WebView host) and eventually calls `WebView.loadUrl(decoratedUrl)`.

Consequence: the *client* is fully reconstructable (this project), the *merchant website* is not
present in the repository and is out of scope (see the project directive §2.2).

## 2. Component → module map

| Android | Web | Notes |
|---|---|---|
| `AppTestApp.onCreate` | `app-config.js`, `app.js` boot | metadata, prefs keys, UA, version reset |
| `X5_Activity.onCreate/D/E/F/p` | `app.js` | cache fast path, decoration, dialogs, load result |
| `yg.onCreate/k/onKeyDown/p()` | `app.js`, `webview.js`, `bridge.js`, `dialogs.js` | shell wiring |
| `rm.c`, `zq1.c`, `kf.b`, `ak1.a`, `wv1.b` | `domain-route.js`, `app-url.js` | resolver |
| `jg` (WebViewClient) | `webview.js`, `sw.js` | errors, offline assets, hijack check, clipboard |
| `mg` (WebChromeClient) | `webview.js`, `dialogs.js` | file chooser, JS alert, fullscreen flags |
| `gs0`, `ig` | `bridge.js` | `window.Android` |
| `qg`, `tg`, `ug`, `rg`, `vg`, `wg`, `xg` | `bridge.js` | other interfaces |
| `mz0`, `c6`, `nz0` | `loading-dialog.js` | loading dialog + toast timing |
| `f6`, `b6`, `g6` | `dialogs.js` | AlertDialog look/semantics |
| `j10` | `device.js` | device UUID |
| `OpenWebActivity` | `open-web.html`, `open-web.js` | secondary webview |
| `MyFirebaseMessagingService` | `sw.js` (push handler) | notification rendering |

## 3. Behaviour-level decisions

### 3.1 Cached last URL is validated and then discarded
`rm.c()` nulls its local `string` on every path after the 24 h check, so its "return cached URL"
branch is unreachable. The real cache fast path is `X5_Activity.onCreate()`, which loads
`E(cachedUrl)` directly when the timestamp is fresh. Both are reproduced (resolver keeps the
unreachable branch for parity and is documented as such; `app.js` implements the activity path).

### 3.2 Speed-test race
`rm.c()` submits up to 20 candidates, then spins over the futures in declaration order and takes the
first one that is already done and valid. `raceFirstAcceptable()` reproduces that ordering with
`Promise.race` + an ascending scan, and aborts the losers via `AbortController`.

### 3.3 Candidate validity
A response only counts when `success === true` **and** the returned `domainList` still contains the
probed host (`rm.f()`), which is how the client drops lines removed from the merchant route.

### 3.4 Backup domain
Only consulted when every candidate failed and the caller allows it (`c(true)`); the returned list
is persisted and resolution restarts once with `c(false)`. If the backup list adds no new host, the
pass fails.

### 3.5 Placeholder attribution flags
`AndroidManifest` ships `affiliateCode="_"`, `FB_PIXEL_ID="_"`, `TID="_0"`, `SNOW_BALL_APP_ID="_"`.
`ea.q()` only rejects blank strings and `d.h()` only maps `"0"` to empty, so the APK really does
append `affiliateCode=_&fbPixelId=_&tid=_0&snowBallAppId=_`. The reconstruction keeps this (and the
harness makes it visible) instead of "cleaning" the URL.

### 3.6 `/m/index.html`
`X5_Activity.E()` concatenates the suffix when `isSingleLine` is false (manifest value `0`). The
reconstructed application is therefore served at `/m/index.html`, exactly the path the shell
requests; the labelled embedded-content harness moved to `/harness/index.html`.

### 3.7 Loading dialog
`mz0` shows a 50 dp loader inside a `#444444` 20 dp-radius card at the bottom (window gravity
bottom, y=300 px ≈ 100 dp), with a 12 sp white text 5 dp below the loader and a 1 000 ms minimum
display. On success `X5_Activity.p(true)` sets the dismiss delay to 2 ms, so the mark finishes
drawing and the dialog closes; a toast (`find_fastest_route`) is shown instead. The loader styles
(`ring` = `LVCircularRing`, `line` = `LoadCircleView`, `success`/`fail` = white check/cross) are
CSS equivalents of the library views.

### 3.8 Support track id
`X5_Activity.F()` builds `random(100…10000)-first4(uuid)-last4(uuid)`; `track-id.js` is a verbatim
port (`track-id.test.mjs` in `core.test.mjs` covers the bounds).

### 3.9 Back button
`yg.onKeyDown`: `canGoBack()` → `goBack()`, otherwise the exit dialog (`Reminder` / `Ok to leave the
game` / `Cancel` / `OK`), non-cancelable. Browsers have no hardware key, so the shell maps
`popstate` and `Escape` to the same handler, and `canGoBack` counts only navigations that happened
inside the frame after its first load (an iframe reports `history.length === 2` immediately).

### 3.10 Upload chooser
`yg.uploadPicture()` shows Camera / Album / Cancel with equal-weight buttons (`yg.x()`); the picked
mode then opens `IMAGE_CAPTURE` or the document picker. The shell intercepts clicks on
`input[type=file]`, shows the same dialog, opens a hidden picker (`capture="environment"` for the
camera) and writes the result back into the page's input through `DataTransfer`.

### 3.11 Anti-hijack check
`jg.shouldInterceptRequest()` rejects a main document that contains none of `"root"`, `ucbet`,
`"brand="`, blacklists the URL and fails the load. Only same-origin responses are readable in a
browser, so the check runs for same-origin documents (the app and the harness) and is skipped — with
a log line — for cross-origin ones. The app keeps the `"root"` marker the shell looks for.

### 3.12 Bridge failure callbacks
`yg.v/w()` evaluate `window.<callback>('Failure: <message>')` on the page. The web bridge uses the
same convention for the providers that cannot be configured here (Google/Facebook/LINE OAuth, FCM).

## 4. Inferred mappings (no direct evidence in the artefact)

`public.xml` in the decompilation is renumbered, so the numeric resource IDs used in code cannot be
resolved mechanically. The following mapping was derived from call sites, argument counts and the
app's own `strings.xml`, and is used for all user-visible text:

| Call site | String used |
|---|---|
| `X5_Activity.D()` toast | `tip_speed_test` |
| `X5_Activity.p(true)` toast | `find_fastest_route` |
| `yg.onCreate()` dialog text (2131886270) | `mloading_dialog` |
| `X5_Activity.p()` progress text (2131886271) | `mloading_dialog_succeed` |
| `X5_Activity.F()` title (2131886340) | `alertDialog1` ("Reminder") |
| `X5_Activity.F()` message prefix (2131886195) | `no_network` |
| `X5_Activity.F()` button (2131886369) | `alertDialog4` ("OK") |
| `yg.onKeyDown()` | `alertDialog1..4` |
| long-press menu (2131886371, 2131886138) | `save_image`, `copy` |
| `yg.uploadPicture()` (2131886434/137/111/208) | `uploadPicture`, `camera`, `album`, `cancel` (order uncertain, all three used) |
| `qg.clearCache()` toast (2131886142) | `cleanCache` |
| `mg.onJsAlert()` button (2131886341) | `ok` |

Loader colours are not inferred: `LVCircularRing` uses `argb(100,255,255,255)` for the track and
white for the 100° arc (`LVCircularRing.onDraw`), `RightDiaView`/`WrongDiaView` draw white
(`setColor(-1)`), `LoadCircleView` mixes `#888888` and white.

## 5. Documented limitations

1. **Merchant page** — unavailable. The path it occupied (`/m/index.html`) now serves the
   reconstructed application (directive §17), and `web/harness/index.html` keeps the clearly
   labelled harness that exercises the bridge contract; neither pretends to be the merchant product.
2. **Cross-origin bridge** — no browser API can inject objects into a cross-origin frame; such
   pages get a `postMessage` relay and lose the automatic clipboard override.
3. **Provider SDKs** — Firebase/AppsFlyer/Adjust/OpenInstall/Transsion/Snowball have no browser
   equivalent; their *call sites* are preserved and their events are persisted by the backend.
   OAuth/FCM report `Failure: …` to the page like an unconfigured native build.
4. **Push** — `sw.js` can render pushes, but creating a subscription requires VAPID keys that are
   not part of this repository; `POST /api/push/subscribe` is ready for them.
5. **Offline assets** — `assets/offline/` does not exist in the decompilation; `web/offline/` holds
   a sample bundle and `sw.js` applies the original interception rules and MIME mapping.
6. **GAID** — browsers expose no advertising id; a persisted random id is stored under the original
   `gaid_<merchant>` key.
7. **Mixed content** — an https deployment cannot frame an http merchant domain; this surfaces as a
   load error (`onReceivedError` path) exactly like an unreachable line.
8. **`/wps/system/domainRoute` on foreign hosts** — the reconstruction serves it on its own origin;
   in production each merchant domain must answer it (that is what the client's speed test needs).
9. **Firebase Web API key** — `strings.xml` ships one; it is not copied into the repository
   (`web/assets/js/app-config.js` keeps the field empty). Nothing here reads it, because every
   FCM/OAuth path is a BLOCKED contract; a real deployment supplies its own credentials.
