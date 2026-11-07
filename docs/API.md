# Backend API

All responses are JSON with `Cache-Control: no-store`. Success uses `{"success":true,"value":…}`;
failures use `{"success":false,"error":{"code":"…","message":"…"}}` with a 4xx/5xx status. Write
endpoints accept a JSON object body (`Content-Type: application/json`), are limited to 32 kB and
validate every field.

## GET /wps/system/domainRoute

The original merchant contract (`defpackage/wv1.java`, response `bu0<r20>`).

| Query | Type | Meaning |
|---|---|---|
| `device` | int | `AndroidManifest` meta-data `device` (1 = Android) |
| `agentName` | string | meta-data `AGENT_NAME` (empty in this build) |
| `merchant` | string (optional) | select another `app_meta` row |

Headers sent by the client: `ModuleId: COMM3`, `Accept: application/json`.

```json
{
  "success": true,
  "value": {
    "domainList": [{ "domainName": "https://www.example.com" }],
    "splash": "https://cdn.example.com/splash.png"
  }
}
```

The handler also stores a `domain_checks` row for the host that served the request, because in the
native system every candidate domain answers this call itself — that is what the client's speed
test measures.

## GET /api/app/config

Manifest `<meta-data>` equivalent consumed at boot.

```json
{"success":true,"value":{
  "merchant":"sige7tlbf5","appName":"Sige77","version":"2.4.87",
  "packageName":"prod.app_sige7tlbf5.com","backupDomain":"https://www.112121313.com",
  "merchantUrls":["https://…"],"device":1,"isSingleLine":0,
  "affiliateCode":"_","fbPixelId":"_","tid":"_0","snowBallAppId":"_","agentName":"",
  "splashUrl":null,
  "resolver":{"maxCandidates":20,"lastUrlTtlMs":86400000,"requestTimeoutMs":5000}
}}
```

## GET /api/app/latest?os=android

Parity endpoint for `AppTestApp.W` (`https://<merchant>.www.gfbwff.com/api/app/latest?os=android`).
The APK builds the URL but never calls it, so the shell does not either. `os` must be `android`.

## POST /api/device/register

| Field | Required | Notes |
|---|---|---|
| `device_id` | yes | UUID-shaped, `[0-9a-fA-F-]{8,64}` |
| `gaid` | no | advertising id substitute |
| `user_agent` | no | ≤ 500 chars |
| `version` | no | app version |
| `merchant` | no | defaults to the active merchant |

Upserts one row per `device_id` (`first_seen` kept, `last_seen` refreshed).

## POST /api/session

`device_id`, `resolved_host` (required), `resolution_ms` (clamped 0…600 000),
`resolver_path` ∈ `cache|route|backup|direct`, `forced` (bool).

## POST /api/collect/event

`name` (`[A-Za-z0-9_.:-]{1,64}`), `params` (object, ≤ 8 kB), `channels` (subset of
`firebase|appsflyer|openinstall|snowball`), `device_id` (optional).

## POST /api/log

Batch form: `{"device_id":…,"entries":[{"level":"info","message":"…","context":{…}}, …]}`
(max 50 entries, message ≤ 2 000 chars). Single form: `{"level":…,"message":…}`.
Levels: `verbose|debug|info|warn|error`.

## POST /api/domain/report

`host` (absolute origin), `ok` (bool), `latency_ms`, `http_status` (0…599), `error`, `device_id`.
Writes `domain_checks` and updates `domains.status`, `last_checked_at`, `last_latency_ms`,
`fail_count`.

## POST /api/blacklist

`url` (≤ 512), `reason`, `device_id`. Unique per URL; re-reporting updates the reason.

## POST /api/push/subscribe

`endpoint` (absolute URL), `keys.p256dh`, `keys.auth`, `device_id`. Unique per endpoint.

## GET /api/health

`{"success":true,"value":{"db":true,"tables":[…],"missing":[],"merchant":…,"version":…,"time":…}}`

## Addendum A routes (the reconstructed product layer)

These routes back the owner-specified screens under `web/m/` (directive §17). They are labelled
`OWNER` in the directive: they are reconstructed equivalents, not recovered merchant endpoints.
All writes require a same-origin `Origin`/`Referer` and are rate-limited; sessions are a 32-byte
token in an `HttpOnly`, `SameSite=Lax`, `Path=/` cookie whose SHA-256 is stored in `auth_sessions`.

| Method | Path | Purpose |
|---|---|---|
| `POST` | `/api/auth/register` | name + phone + password → creates the account and issues an OTP |
| `POST` | `/api/auth/login` | phone + password → session cookie |
| `POST` | `/api/auth/logout` | revokes the current session |
| `GET` | `/api/auth/session` | current user + wallet, or `401` |
| `POST` | `/api/auth/otp/request` | issues/reissues a 6-digit code (delivered as an in-app notification) |
| `POST` | `/api/auth/otp/verify` | completes sign-up and starts the session |
| `GET` | `/api/account` | profile, wallet, stats, recent rounds and `dailyCredits { amount, claimedToday, nextClaimAt }` |
| `POST` | `/api/wallet/claim` | grants `settings.wallet_daily_credits` once per UTC day; idempotent within the day |
| `GET` | `/api/notifications` | in-app notifications (OTP codes, account notices, credit grants) |
| `POST` | `/api/notifications` | marks notifications read |
| `GET` | `/api/games` | catalog with categories and playable/blocked status |
| `POST` | `/api/games/play` | server-authoritative round: debits stake, credits payout, records the round |
| `GET` | `/api/games/history` | the signed-in user's recent rounds |

`POST /api/wallet/claim` returns the resulting balance and `claimedToday`; a same-day repeat is a
no-op that returns the current balance rather than an error, so a double-tap cannot fail a user.
The grant is a normal `wallet_ledger` row and does not alter `stats.rounds` or `stats.wagered`.

## Error codes

| Status | Code | When |
|---|---|---|
| 400 | `invalid_json` | body is not a JSON object |
| 404 | `not_found` | unknown path |
| 404 | `merchant_not_found` | no `app_meta` row |
| 405 | `method_not_allowed` | wrong HTTP verb (`Allow` header set) |
| 413 | `payload_too_large` | body above `app.max_body_bytes` |
| 422 | `invalid_field`, `invalid_*` | validation failure (message names the field) |
| 500 | `internal_error` | unexpected exception (logged server-side, no stack trace exposed) |

## Database

See `web/sql/schema.sql`. Tables: `app_meta`, `domains`, `domain_checks`, `devices`, `sessions`,
`events`, `client_logs`, `blacklisted_urls`, `push_subscriptions`, `settings`.
Foreign keys use `ON DELETE SET NULL` (telemetry must survive device deletion) and `ON DELETE
CASCADE` for `domains → app_meta`.

The Addendum A product layer adds `users`, `auth_sessions`, `otp_codes`, `app_notifications`,
`wallets`, `wallet_ledger`, `games`, `game_rounds`, `rate_limits`. Money is an integer credit unit
(no floats); every balance change writes a `wallet_ledger` row in the same transaction as the round.

Resolution tuning lives in `settings`:

| Key | Default | Used by |
|---|---|---|
| `resolver_max_candidates` | 20 | `/api/app/config` |
| `resolver_ttl_seconds` | 86400 | `/api/app/config` |
| `resolver_timeout_ms` | 5000 | `/api/app/config` |
| `min_loading_ms` | 1000 | documented `mz0.j` default |
| `app_latest_url`, `app_latest_note` | empty | `/api/app/latest` |
| `wallet_start_balance` | 1000 | wallet creation |
| `wallet_daily_credits` | 500 | `POST /api/wallet/claim` |
| `auth_session_days` | 30 | session expiry |
| `otp_ttl_seconds` | 600 | OTP expiry |
