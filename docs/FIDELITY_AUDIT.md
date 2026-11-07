# Source-to-web fidelity audit

Session 004 (OpenHands, autonomous). This document answers the final directive's central question —
*is the reconstruction a faithful reproduction of what the APK actually contains?* — with a
re-runnable method and a per-claim verdict. Every verdict cites the artefact it was checked against.

Re-run everything here with:

```bash
bash docs/verification/run_fidelity_audit.sh     # (see §7 for the individual commands)
```

---

## 1. Ground truth

| Fact | Value | How it was read |
|---|---|---|
| Package | `prod.app_sige7tlbf5.com` | `AndroidManifest.xml` |
| Display name | `Sige77` | `<meta-data android:name="merchant">` = `sige7tlbf5`; `AppTestApp` |
| Version | `2.4.87` | `app_meta` seed, `AndroidManifest` `versionName` |
| Decompiler | jadx | evidence tree header |
| Evidence tree | `Sige77_20261106_2144_[jadx]/` | read-only, never modified |
| App-owned Java | **20 files** (`src/java/prod/apptest/**`) | `find src/java/prod -name '*.java'` |
| Total Java (incl. libraries) | 4,966 files | `find src/java -name '*.java' \| wc -l` |
| App-owned layouts | **4** (`activity_open_web`, `activity_webs`, `activtiy_vassonic`, `custom_dialog`) | `res/layout/` |
| Total layouts (incl. libraries) | 109 | `res/layout/` |

### 1.1 The decisive artefact

```xml
<meta-data android:name="merchant"     android:value="sige7tlbf5" />
<meta-data android:name="merchant_url" android:value="https://www.77sige.club,https://www.77sige.net,
  https://www.sige77.app,https://www.sige777.net,https://www.sige777.club,https://www.sige777.vip,
  https://www.sige77a.com,https://www.sige77a.org,https://www.sige77a.app,https://www.sige77a.net,
  https://www.49704794.com" />
```

Eleven remote domains. The APK is a **WebView shell**: it picks the fastest of these hosts and
frames the merchant site. The product (games, wallet, login) lives on those servers, which are
unavailable. This is the finding that shapes the whole reconstruction and is confirmed four
independent ways in §4.

---

## 2. What the APK contains (screen inventory)

Only two activities are declared for the app; the rest are library activities (Facebook, LINE).

| # | Screen | Source | Layout | Kind | Reconstructed? |
|---|---|---|---|---|---|
| S1 | Launcher (main) | `activity/X5_Activity.java` (343 L) | `activity_webs.xml`, `activtiy_vassonic.xml` | WebView + splash + debug console | yes — `index.html` |
| S2 | Secondary web view | `activity/OpenWebActivity.java` (142 L) | `activity_open_web.xml` | WebView + floating close button | yes — `open-web.html` |
| S3 | Splash / loading overlay | `activity/activtiy_vassonic.xml` (`@id/loading`, `icon_bg`) | — | full-screen image | yes — `#splash` |
| S4 | App-update dialog | `strings.xml` `apk_install_failed`; `X5_Activity` | — | alert | yes — `dialogs.js` |
| S5 | Route-failure dialog | `strings.xml` `domain_route_not_found` | — | alert + track id | yes — `app.js showRouteFailure` |
| S6 | Exit dialog | `strings.xml` `alertDialog1`–`4` | — | non-cancelable confirm | yes — `dialogs.js` |
| S7 | Image-source chooser | `strings.xml` `camera`/`album`/`cancel` | — | bottom sheet | yes — `dialogs.js` |
| S8 | Debug console | `strings.xml` `logText`, `cleanLog`, `cleanCache` | `activity_webs.xml` | log list + clear | yes — `debug-log.js` |
| S9 | Permission prompts | `strings.xml` `PERMISSION1`–`4` | — | alerts | yes — `dialogs.js` |
| S10 | Toast | `copy_toast_msg` etc. | — | transient | yes — `toast.js` |

All ten are **evidenced** screens and all ten are reconstructed. There is no eleventh screen in the
APK, because there is no product UI in the APK.

### 2.1 The product layer is a separate, labelled deliverable

The APK frames a remote product; it does not contain one. The reconstruction therefore ships two
layers, and the documentation never blurs them:

* **Evidenced layer** — S1–S10 above, reproduced 1:1 from the APK.
* **Owner layer** — `/m/` (login, register, OTP, home, games, notifications, profile). The owner's
  addendum explicitly commissioned these as *equivalents*; the APK holds no evidence for them.
  Every one is labelled `OWNER` in the directive and the README states plainly that the merchant
  site behind the WebView was the source of that behaviour and is unavailable.

---

## 3. Method

Three independent checks, so that a single mistake cannot produce a false pass:

1. **Static count** — enumerate app-owned sources and resources in the evidence tree (§1).
2. **Symbol-level diff** — extract the bridge surface from the Java and from the JS and diff them
   (`diff` output must be empty modulo trailing newline).
3. **Byte-level diff** — `md5sum` each reused binary asset against its original.

Plus a **runtime** pass: migrate a brand-new database, serve the *packaged* deployment, and run the
whole test suite against it (§6).

---

## 4. The "WebView shell, no game logic" claim — four independent confirmations

The directive's central claim is that the APK contains no game logic and no product screen. Checked
four ways; all agree.

| Check | Command | Result |
|---|---|---|
| Class-name scan | `find src/java -name '*.java' \| grep -Ei 'game\|slot\|crash\|dice\|roulette\|bet\|wager\|jackpot\|casino\|lottery\|poker\|baccarat\|spin'` (excluding Google Play Games/Firebase) | **0 app classes** |
| Auth-class scan | same for `login\|register\|signup\|otp\|verify` | only the **LINE SDK** (`com.linecorp.linesdk`) |
| String resources | app `strings.xml` filtered of library names | only shell strings: `alertDialog1–4`, `cleanCache`, `cleanLog`, `logText`, `domain_route_not_found`, `apk_install_failed`, `PERMISSION1–4`, `camera`/`album`/`cancel`/`copy` |
| Local database | `grep -rlE 'androidx\.room\|RoomDatabase\|SQLiteOpenHelper' src/java/prod` | **0** app files |

### 4.1 The one SQLite mention in an app-reachable class, examined

`defpackage/ab.java` is referenced by `AppTestApp` and imports `SQLiteDatabase`. On inspection it is
a **synthetic listener** (`public final /* synthetic */ class ab implements OnSessionTrackingSucceededListener, …`)
and its single SQLite use is inside a Firebase Analytics internal:

```java
sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET metrics_upload_ms=…").execute();
```

`log_event_dropped` / `global_log_event_state` are Firebase Analytics' own tables. This is not app
data, so the "no app-owned database" verdict stands. The APK's only persistence is
`SharedPreferences` (`AppTestApp`, `MyFirebaseMessagingService`, `X5_Activity`).

---

## 5. Claim-by-claim verdicts

| Claim (README / directive) | Verdict | Evidence |
|---|---|---|
| "23-method JavaScript bridge" | **VERIFIED** | Java (`gs0` 22 + `ig` 1) and JS (`bridge.js` `Android` object) both yield exactly 23 names; `diff` clean |
| "8 `@JavascriptInterface` interfaces" | **VERIFIED** | `addJavascriptInterface` × 8 in `yg.java:303–310` (+ `ig` at `345`) → `Android, JSInterface, LaunchOpen, LaunchClose, Color, LogOpen, LogClose, LogTest` |
| "original assets reused" | **VERIFIED** | `md5sum` identical for `splash_bg.jpg`, `splash_logo.jpg`, `icon_bg.jpg`, `close_floating_window.png`, `ic_launcher.png` (xxhdpi) and root `icon.png` |
| "no local database in the APK" | **VERIFIED** | §4 + §4.1 |
| "3 surfaces only: WebView, splash, debug console" | **VERIFIED** | the 4 app layouts each declare only `WebView`/`loading`/`webviewtext`/`webviewbutton`/`dialog_button` |
| "no product screens in the APK" | **VERIFIED** | §2, §4 |
| "23 PHP files lint-clean" | **VERIFIED** | `php -l` clean (session 004 re-run) |
| "schema is idempotent" | **VERIFIED** | migrated into a fresh DB, then imported the packaged SQL twice |
| "PHP 8 + PDO, prepared statements" | **VERIFIED** | `Db.php` sets `ATTR_EMULATE_PREPARES => false`; every query is parameterised |
| "reconstruction does not depend on the original infrastructure" | **VERIFIED** | zero outbound calls; frontend uses relative URLs (`api.js` `BASE = '..'`) |

---

## 6. Runtime audit on a clean install

Performed on a **brand-new database** (`sige77_fresh`) and again on the **packaged deployment**
(`sige77_deploy`, imported from `dist/database.sql` exactly as phpMyAdmin would):

| Stage | Result |
|---|---|
| `php bin/migrate.php` on empty DB | 21 schema + 7 seed statements, 19 tables, no errors |
| `GET /api/health` | `db: true`, `missing: []`, merchant `sige7tlbf5`, version `2.4.87` |
| `GET /wps/system/domainRoute` | returns the deployment origin as the resolver list |
| `tests/api_test.sh` | **90 / 90** (both instances) |
| `node --test tests/js/*.test.mjs` | **25 / 25** |
| `php tests/game_engine_test.php` | **33 / 33** |
| `node tests/app_browser_check.mjs` | **16 / 16** |
| `node tests/shell_browser_check.mjs` | **15 / 15** |
| Internals blocked (`/config/`, `/api/src/`, `/sql/`, `/bin/`, `/tests/`) | all `404` |

Full user journey on the clean instance: register → OTP issue → verify → session → 4 game rounds →
logout → re-login, with the balance (`937`) and ledger rows matching between the API and MySQL.

### 6.1 Two audit findings that are *intended* behaviour, not bugs

Both were checked against the directive before being judged, precisely because the source is the
authority:

1. **Any six digits pass OTP verification.** `otp_verify.php` carries an explicit owner instruction
   (directive §17.5). The honesty problem the master directive §6.3 warns about was already fixed in
   session 003: the screen now states the build has no SMS gateway and that the number is not
   confirmed, so the flow does not *claim* a verification it did not perform.
2. **Mutations require an `Origin` header.** A `POST /api/games/play` without `Origin` returns
   `csrf_origin_missing`. That is the CSRF guard working; the browser always sends `Origin`.

---

## 7. Reproducing the audit

```bash
# 1. ground truth
cd "Sige77_20261106_2144_[jadx]"
find src/java/prod -name '*.java' | wc -l                       # 20
grep -oE '<activity[^>]*android:name="prod[^"]*"' AndroidManifest.xml   # 2

# 2. bridge diff (must be identical)
cd src/java/defpackage
grep -A1 '@JavascriptInterface' gs0.java ig.java \
  | grep -oE '(void|boolean|String|int|long|double)\s+[a-zA-Z_][a-zA-Z0-9_]*\(' \
  | grep -oE '[a-zA-Z_][a-zA-Z0-9_]*\($' | tr -d '(' | sort > /tmp/src.txt

# 3. assets
cd /workspace/project/REPURPOSE
for f in splash_bg.jpg splash_logo.jpg icon_bg.jpg; do
  md5sum "Sige77_20261106_2144_[jadx]/src/resources/package_1/res/drawable/$f" \
         "web/assets/img/$f"
done   # pairs must match

# 4. runtime
cd web
sudo mysql -e "DROP DATABASE IF EXISTS audit; CREATE DATABASE audit CHARACTER SET utf8mb4;"
DB_NAME=audit php bin/migrate.php --origin=http://127.0.0.1:12003
DB_NAME=audit php -S 0.0.0.0:12003 router.php &
bash tests/api_test.sh http://127.0.0.1:12003
```

---

## 8. Gaps and limitations (unchanged, honest)

* The **merchant product** framed by the WebView (the real games, wallet and login) is not in the
  APK and is not reachable; the `/m/` layer is a labelled equivalent, not a recovered original.
* **Provider SDK behaviour** (AppsFlyer, Adjust, OpenInstall, FCM delivery, Facebook/Google/LINE
  OAuth) cannot exist in a browser; the bridge methods are present and return honest failures.
* **Cross-origin bridge injection** is impossible in a browser (same-origin policy); a
  `postMessage` relay is offered instead.
* **Native-only paths** (clipboard write on some browsers, install-package, biometric) degrade to
  documented no-ops.

None of these is faked. Full list: `docs/RECONSTRUCTION_NOTES.md`, directive §13.
