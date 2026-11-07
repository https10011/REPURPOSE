# Shared-hosting deployment

Session 004 (OpenHands, autonomous). This document records what the reconstruction needs from a
shared host, what two named free hosts actually provide, and the exact deployment steps. Every host
limit below is quoted from the host's own published material, with the URL.

---

## 1. What the application actually requires

Measured from the code, not assumed.

| Requirement | Value | How it was determined |
|---|---|---|
| PHP | **8.1 minimum** | `Http.php` uses `never` return types (8.1+); `Auth.php` uses `str_starts_with` (8.0+) |
| PHP extensions | `pdo_mysql`, `json`, `mbstring`, `session`, `filter`, `preg` | every function used was enumerated (`grep` over `*.php`); see §1.1 |
| Database | MySQL 5.7+ / MariaDB 10.4+ | `schema.sql` uses `utf8mb4`, InnoDB, `BIGINT UNSIGNED`, no 8.0-only syntax |
| Web server | Apache + `mod_rewrite` + `.htaccess` | `web/.htaccess` routes `/api/*` and `/wps/*` to the front controller |
| Runtime dependencies | **none** | no `composer.json`, no `vendor/`, no `package.json`, no `node_modules` in the shipped tree |
| Outbound network | **not required** | no `curl_*`, no `fsockopen`, no SMTP |
| Cron / background jobs | **not required** | nothing is scheduled; expiry is checked on read |
| SSH | **not required** | migration is available as a SQL import |
| Writable filesystem | **not required** | sessions live in MySQL, not files |

### 1.1 Extension audit

Every extension-sensitive function in the project:

```
preg_match preg_replace preg_split      -> preg (always present)
password_hash password_verify           -> core (no openssl needed)
random_int random_bytes                 -> core
json_encode json_decode                 -> json
mb_substr mb_strlen                     -> mbstring
session_id / session_start              -> session
```

Deliberately **absent**: `openssl_*` (token hashing uses `hash()`/SHA-256, which is core),
`curl_*`, `imagecreate*` (GD), `gz*`, `mail()`, `fsockopen`. This matters because InfinityFree has
had publicised gaps in GD, INTL, OpenSSL and ZIP
(<https://forum.infinityfree.com/t/various-php-extensions-missing-on-php-8-1/73538>) — none of which
this project touches.

---

## 2. Host limits — published evidence

### 2.1 InfinityFree

| Limit | Published value | Source |
|---|---|---|
| PHP version | **8.3** ("all free hosting servers have been upgraded to PHP 8.3", 2025-04-30) | <https://forum.infinityfree.com/t/free-hosting-is-now-upgraded-to-php-8-3/109714> |
| PDO + MySQLi | "Both the popular PDO and MySQLi libraries are available on all accounts and PHP versions" | <https://forum.infinityfree.com/t/how-to-connect-with-mysql/49340> |
| DB hostname | "Using 'localhost' will not work, you have to use the MySQL hostname exactly as it's listed under your Current Databases" | <https://forum.infinityfree.com/t/how-to-connect-with-mysql/49340> |
| DB reachability | "it's NOT possible to connect to the free hosting databases from outside the hosting platform" | <https://forum.infinityfree.com/t/how-to-connect-with-mysql/49340> |
| `.htaccess` | "Full .htaccess Support" | <https://www.infinityfree.com/> |
| Disk | 5 GB | <https://www.infinityfree.com/> |
| Cron jobs | **disabled** (2023-08-09); "any automated background periodic requests are now prohibited" | <https://forum.infinityfree.com/t/cron-job-feature-is-now-disabled/80495> |
| SSH | not offered on free hosting | <https://forum.infinityfree.com/t/ssh-access/53390> |

**Verdict: compatible.** PHP 8.3 ≥ 8.1; PDO available; `.htaccess` supported. Cron and SSH are
disabled but this project needs neither. The two caveats are the non-`localhost` DB hostname and the
fact that the DB is reachable only from inside the hosting platform (so a local XAMPP copy cannot
point at it).

> Two recent forum threads (2026-11-02/03) report `SQLSTATE[HY000] [2002]` connecting to
> `sqlNNN.infinityfree.com`. In both cases the reported hostname/username/database matched the
> account, so these look like per-server incidents rather than a configuration rule; the articles
> above remain the authoritative contract.

### 2.2 AeonFree

| Limit | Published value | Source |
|---|---|---|
| PHP version | **contradictory**: homepage says "PHP 8.2"; the PHP/MySQL page says "PHP 7.4" | <https://aeonfree.com/> vs <https://aeonfree.com/free-php-mysql-hosting> |
| MySQL version | likewise "MySQL 8.0" vs "MySQL 5.7" | same two pages |
| `.htaccess` | "Supports full .htaccess" | both pages |
| Disk | 5 GB | <https://www.aeonfree.com/> |

**Verdict: likely compatible, must be confirmed on the account.** If the account really is PHP 7.4
the app will **not** run — `never` return types are a syntax error below 8.1. Because the two
official pages disagree, the deployment notes tell the operator to check the real version first
(§4.3). InfinityFree's PHP 8.3 statement is unambiguous, so InfinityFree is the safer default.

### 2.3 Compatibility matrix

| Need | InfinityFree | AeonFree | This project |
|---|---|---|---|
| PHP ≥ 8.1 | 8.3 ✓ | 8.2 (or 7.4 — verify) | needs 8.1 |
| `pdo_mysql` | yes ✓ | yes (assumed) | yes |
| `.htaccess` | full ✓ | full ✓ | required |
| MySQL host ≠ localhost | yes | assumed | configurable |
| Cron | disabled | — | not needed |
| SSH | no | — | not needed |
| Outbound | — | — | not needed |

---

## 3. Building the upload package

```bash
cd web
bash bin/package.sh --origin=https://your-domain.example
```

Produces `web/dist/`:

| File | Purpose |
|---|---|
| `sige77-web-<date>.tar.gz` | the uploadable tree (extracts to `sige77/`) |
| `database.sql` | schema + seed with your origin substituted, for phpMyAdmin import |
| `DEPLOY.txt` | the same steps as §4, for the operator |

The package **excludes** `tests/`, `harness/`, `bin/`, `var/`, `node_modules/` and the machine-local
`config/config.php`; it ships `config/config.example.php` instead. This was verified by extracting
the archive and checking each path is absent.

`--origin` must be the real host: it is written into the `domains` row, and the shell frames whatever
that row returns. (During this audit, baking a placeholder domain was exactly what made two shell
browser checks fail — the fix was to point the row at the serving origin.)

---

## 4. Deployment steps

### 4.1 Upload

Extract `sige77-web-<date>.tar.gz` so that `index.html` sits directly in the web root
(`htdocs/` on InfinityFree). If the host cannot extract to a chosen directory, extract elsewhere and
move the *contents* of `sige77/` up one level.

### 4.2 Create the database

In the control panel open **MySQL Databases** and create a database. Note the four values shown:

```
host      sqlNNN.example-host.com   <-- copy exactly; "localhost" will NOT work
name      if0_XXXXXXXX_dbname
user      if0_XXXXXXXX
password  (your control-panel password)
```

### 4.3 Configure

```bash
cp config/config.example.php config/config.php
# edit the four db.* values
```

Or leave `config.php` as shipped and set environment variables `DB_HOST`, `DB_NAME`, `DB_USER`,
`DB_PASS` (the loader prefers them). On AeonFree, **check the PHP version first** — create a
`phpinfo.php` containing `<?=phpinfo()?>` and confirm it reports 8.1 or newer before proceeding.

### 4.4 Import the schema

In phpMyAdmin select the database and import `database.sql`. It is idempotent; importing twice is
safe. It creates 19 tables and seeds the merchant metadata, the game catalog and the domain row.

### 4.5 Verify

```
GET https://<your-domain>/api/health
```

must return `{"success":true,"value":{"db":true,...,"missing":[]}}`. If `db` is `false`, either the
credentials in §4.3 are wrong or the import in §4.4 did not run; `missing` names the absent tables.

Then open `https://<your-domain>/m/index.html`, register an account, and confirm the one-time code
appears in the app's own notification list (there is no SMS).

### 4.6 Changing the domain later

```sql
UPDATE domains SET host = 'https://new-domain.example' WHERE merchant = 'sige7tlbf5';
```

---

## 5. Security posture on a shared host

| Control | Implementation |
|---|---|
| Internals unreachable | `.htaccess` returns `403` for `config/`, `api/src/`, `sql/`, `bin/`, `tests/`; `router.php` mirrors this with `404` for the built-in server |
| `config/` never public | only `config.example.php` (no credentials) ships; real config is git-ignored |
| Session cookie | `HttpOnly`, `SameSite=Lax`, `Secure` when HTTPS (including `X-Forwarded-Proto`), `Path=/` |
| Password storage | `password_hash` (bcrypt); tokens stored as SHA-256, never in plaintext |
| CSRF | mutations require a same-origin `Origin`/`Referer` |
| SQL injection | PDO prepared statements, `ATTR_EMULATE_PREPARES => false` |
| Rate limiting | per-phone and per-IP on login, OTP and claims |
| Error leakage | uncaught exceptions become a generic JSON envelope; details go to `error_log` only |
| Directory listing | `Options -Indexes` |
| Response headers | `X-Content-Type-Options: nosniff`, `Referrer-Policy: no-referrer` |

Verified in this audit: every blocked path returns `404`/`403` when the packaged tree is served, and
a mutation without an `Origin` header is rejected with `csrf_origin_missing`.

---

## 6. Troubleshooting

| Symptom | Cause | Fix |
|---|---|---|
| `db: false` from `/api/health` | wrong credentials, or import skipped | recheck §4.3, re-import §4.4 |
| `SQLSTATE[HY000] [2002]` | hostname set to `localhost` | copy the exact host from the panel |
| `2002 getaddrinfo … No such host` | DB hostname typo, or connecting from outside the host | use the panel's hostname; connect only from hosted PHP |
| HTTP 500 with no body | PHP older than 8.1 | check the version (§4.3); move to a PHP 8.1+ host |
| 404 on every page | `.htaccess` not applied / `mod_rewrite` off | enable `mod_rewrite`, confirm `AllowOverride` |
| 404 only on `/api/...` | rewrite rule not matching the install path | ensure `index.html` is at the web root |
| Blank page after login | cookie blocked | serve over HTTPS; check `SameSite`/third-party-cookie settings |

---

## 7. What was verified in this audit

* Packaged the tree, extracted it, imported `database.sql` into a fresh database, served it, and ran
  the **entire** suite against it: API 90/90, JS 25/25, engine 33/33, app browser 16/16, shell
  browser 15/15.
* Confirmed the five internal paths are unreachable and the static assets resolve.
* Confirmed no Composer/npm/outbound/cron/SSH dependency by scanning the code.

The remaining step — running on the owner's actual hosting account — needs the account, which is
outside this environment. §4 is written so the owner can complete it without further assistance.
