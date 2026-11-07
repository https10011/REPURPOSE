-- ---------------------------------------------------------------------------
-- Sige77 shell — MySQL schema (MySQL 8 / MariaDB 10.11, utf8mb4)
--
-- The decompiled client contains no SQLite/Room database; its only persistence is
-- SharedPreferences (see docs/ARCHITECTURE.md). This schema backs the pieces the shell needs
-- from a server, derived from the observable client contracts:
--   app_meta            <- AndroidManifest <meta-data> block (AppTestApp.onCreate)
--   domains             <- merchant_url list served by /wps/system/domainRoute
--   domain_checks       <- per-line speed test results (rm.c + jg health signals)
--   devices             <- device UUID (j10) + advertising id (kf.b)
--   sessions            <- each successful route resolution (X5_Activity)
--   events              <- gs0.eventTracker / appFlyerLogEvent
--   client_logs         <- qt.q() / kv.* telemetry
--   blacklisted_urls    <- AppTestApp.a() / jg anti-hijack check
--   push_subscriptions  <- FCM token equivalent (gs0.generateFcmToken)
--   settings            <- runtime tuning (cache TTLs, resolver limits)
--
-- The file is idempotent: safe to run on every deployment.
-- ---------------------------------------------------------------------------

SET NAMES utf8mb4;
SET time_zone = '+00:00';

CREATE TABLE IF NOT EXISTS app_meta (
  merchant           VARCHAR(64)  NOT NULL,
  app_name           VARCHAR(64)  NOT NULL,
  version            VARCHAR(32)  NOT NULL,
  package_name       VARCHAR(128) NOT NULL,
  backup_domain      VARCHAR(255)          DEFAULT NULL,
  merchant_urls      JSON                  DEFAULT NULL,
  device             SMALLINT UNSIGNED NOT NULL DEFAULT 1,
  is_single_line     TINYINT(1)   NOT NULL DEFAULT 0,
  affiliate_code     VARCHAR(64)           DEFAULT NULL,
  fb_pixel_id        VARCHAR(64)           DEFAULT NULL,
  tid                VARCHAR(64)           DEFAULT NULL,
  snow_ball_app_id   VARCHAR(64)           DEFAULT NULL,
  agent_name         VARCHAR(64)           DEFAULT NULL,
  splash_url         VARCHAR(512)          DEFAULT NULL,
  created_at         DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at         DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (merchant)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS domains (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  merchant          VARCHAR(64)  NOT NULL,
  host              VARCHAR(255) NOT NULL,
  enabled           TINYINT(1)   NOT NULL DEFAULT 1,
  priority          INT          NOT NULL DEFAULT 100,
  region            VARCHAR(32)           DEFAULT NULL,
  status            ENUM('up','down','unknown') NOT NULL DEFAULT 'unknown',
  last_checked_at   DATETIME              DEFAULT NULL,
  last_latency_ms   INT                   DEFAULT NULL,
  fail_count        INT          NOT NULL DEFAULT 0,
  created_at        DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at        DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_domains_host (host),
  KEY idx_domains_lookup (merchant, enabled, priority),
  CONSTRAINT fk_domains_merchant FOREIGN KEY (merchant) REFERENCES app_meta (merchant)
    ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS devices (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  device_id         CHAR(36)      NOT NULL,
  gaid              VARCHAR(64)            DEFAULT NULL,
  user_agent        VARCHAR(512)           DEFAULT NULL,
  platform          VARCHAR(16)   NOT NULL DEFAULT 'web',
  app_version       VARCHAR(32)            DEFAULT NULL,
  merchant          VARCHAR(64)            DEFAULT NULL,
  first_seen        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  last_seen         DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_devices_device_id (device_id),
  KEY idx_devices_last_seen (last_seen)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS domain_checks (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  domain_id         BIGINT UNSIGNED        DEFAULT NULL,
  host              VARCHAR(255)  NOT NULL,
  ok                TINYINT(1)    NOT NULL DEFAULT 0,
  latency_ms        INT                    DEFAULT NULL,
  http_status       SMALLINT               DEFAULT NULL,
  error             VARCHAR(255)           DEFAULT NULL,
  agent_name        VARCHAR(64)            DEFAULT NULL,
  device            SMALLINT UNSIGNED      DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_checks_host (host, created_at),
  KEY idx_checks_domain (domain_id, created_at),
  CONSTRAINT fk_checks_domain FOREIGN KEY (domain_id) REFERENCES domains (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS sessions (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  device_id         BIGINT UNSIGNED        DEFAULT NULL,
  resolved_host     VARCHAR(255)  NOT NULL,
  resolution_ms     INT           NOT NULL DEFAULT 0,
  resolver_path     ENUM('cache','route','backup','direct') NOT NULL DEFAULT 'route',
  forced            TINYINT(1)    NOT NULL DEFAULT 0,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_sessions_device (device_id, created_at),
  KEY idx_sessions_host (resolved_host),
  CONSTRAINT fk_sessions_device FOREIGN KEY (device_id) REFERENCES devices (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS events (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  device_id         BIGINT UNSIGNED        DEFAULT NULL,
  name              VARCHAR(64)   NOT NULL,
  params            JSON                   DEFAULT NULL,
  channels          VARCHAR(128)           DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_events_name (name, created_at),
  KEY idx_events_device (device_id, created_at),
  CONSTRAINT fk_events_device FOREIGN KEY (device_id) REFERENCES devices (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS client_logs (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  device_id         BIGINT UNSIGNED        DEFAULT NULL,
  level             ENUM('verbose','debug','info','warn','error') NOT NULL DEFAULT 'info',
  message           TEXT          NOT NULL,
  context           JSON                   DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_logs_level (level, created_at),
  KEY idx_logs_device (device_id, created_at),
  CONSTRAINT fk_logs_device FOREIGN KEY (device_id) REFERENCES devices (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS blacklisted_urls (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  url               VARCHAR(512)  NOT NULL,
  reason            VARCHAR(255)  NOT NULL DEFAULT 'unspecified',
  device_id         BIGINT UNSIGNED        DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_blacklist_url (url),
  CONSTRAINT fk_blacklist_device FOREIGN KEY (device_id) REFERENCES devices (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS push_subscriptions (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  device_id         BIGINT UNSIGNED        DEFAULT NULL,
  endpoint          VARCHAR(500)  NOT NULL,
  p256dh            VARCHAR(255)           DEFAULT NULL,
  auth              VARCHAR(255)           DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_push_endpoint (endpoint),
  CONSTRAINT fk_push_device FOREIGN KEY (device_id) REFERENCES devices (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS settings (
  k                 VARCHAR(64)   NOT NULL,
  v                 VARCHAR(512)  NOT NULL,
  updated_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (k)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ---------------------------------------------------------------------------
-- Addendum A (owner scope): self-contained account, wallet and game tables.
--
-- The APK contains no local database (no Room/SQLite dependency, no DAO, no
-- .db asset), so this half of the schema is authored rather than recovered: it
-- backs the login/registration/OTP/game flows the owner addendum specifies.
-- See WEB_RECONSTRUCTION_DIRECTIVE.md §17.6.
-- ---------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS users (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  name              VARCHAR(64)   NOT NULL,
  phone             VARCHAR(20)   NOT NULL,           -- E.164 normalised (+63…)
  password_hash     VARCHAR(255)  NOT NULL,           -- password_hash(PASSWORD_DEFAULT)
  phone_verified    TINYINT(1)    NOT NULL DEFAULT 0,
  status            ENUM('active','blocked') NOT NULL DEFAULT 'active',
  last_login_at     DATETIME               DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_users_phone (phone)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS auth_sessions (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id           BIGINT UNSIGNED NOT NULL,
  token_hash        CHAR(64)      NOT NULL,           -- sha256 of the cookie value
  ip                VARCHAR(45)            DEFAULT NULL,
  user_agent        VARCHAR(255)           DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  last_seen_at      DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  expires_at        DATETIME      NOT NULL,
  revoked_at        DATETIME               DEFAULT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY uq_auth_token (token_hash),
  KEY idx_auth_user (user_id, expires_at),
  CONSTRAINT fk_auth_user FOREIGN KEY (user_id) REFERENCES users (id)
    ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS otp_codes (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  phone             VARCHAR(20)   NOT NULL,
  code              CHAR(6)       NOT NULL,
  purpose           ENUM('register','login','reset') NOT NULL DEFAULT 'register',
  attempts          SMALLINT UNSIGNED NOT NULL DEFAULT 0,
  expires_at        DATETIME      NOT NULL,
  consumed_at       DATETIME               DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_otp_lookup (phone, purpose, created_at),
  KEY idx_otp_expiry (expires_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS app_notifications (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id           BIGINT UNSIGNED        DEFAULT NULL,
  phone             VARCHAR(20)            DEFAULT NULL,
  kind              VARCHAR(32)   NOT NULL DEFAULT 'account',
  title             VARCHAR(120)  NOT NULL,
  body              VARCHAR(500)  NOT NULL,
  payload           JSON                   DEFAULT NULL,
  read_at           DATETIME               DEFAULT NULL,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_notif_user (user_id, created_at),
  CONSTRAINT fk_notif_user FOREIGN KEY (user_id) REFERENCES users (id)
    ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS wallets (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id           BIGINT UNSIGNED NOT NULL,
  balance           BIGINT      NOT NULL DEFAULT 0,   -- minor unit, never a float
  currency          CHAR(3)     NOT NULL DEFAULT 'PHP',
  created_at        DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at        DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_wallets_user (user_id),
  CONSTRAINT fk_wallets_user FOREIGN KEY (user_id) REFERENCES users (id)
    ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS games (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  slug              VARCHAR(32)   NOT NULL,
  name              VARCHAR(64)   NOT NULL,
  category          VARCHAR(32)   NOT NULL DEFAULT 'originals',
  tagline           VARCHAR(160)           DEFAULT NULL,
  status            ENUM('playable','blocked') NOT NULL DEFAULT 'playable',
  min_stake         INT UNSIGNED  NOT NULL DEFAULT 10,
  max_stake         INT UNSIGNED  NOT NULL DEFAULT 10000,
  rtp_bps           INT UNSIGNED           DEFAULT NULL, -- basis points, null when unknown
  sort_order        INT           NOT NULL DEFAULT 100,
  created_at        DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY uq_games_slug (slug),
  KEY idx_games_order (sort_order)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS game_rounds (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id           BIGINT UNSIGNED NOT NULL,
  game_id           BIGINT UNSIGNED NOT NULL,
  stake             BIGINT      NOT NULL,
  payout            BIGINT      NOT NULL DEFAULT 0,
  multiplier_bps    INT         NOT NULL DEFAULT 0,   -- 10000 = 1.00x
  outcome           JSON        NOT NULL,
  balance_after     BIGINT      NOT NULL,
  created_at        DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_rounds_user (user_id, created_at),
  KEY idx_rounds_game (game_id, created_at),
  CONSTRAINT fk_rounds_user FOREIGN KEY (user_id) REFERENCES users (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_rounds_game FOREIGN KEY (game_id) REFERENCES games (id)
    ON UPDATE CASCADE ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS wallet_ledger (
  id                BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  wallet_id         BIGINT UNSIGNED NOT NULL,
  user_id           BIGINT UNSIGNED NOT NULL,
  round_id          BIGINT UNSIGNED        DEFAULT NULL,
  delta             BIGINT      NOT NULL,
  balance_after     BIGINT      NOT NULL,
  reason            VARCHAR(32) NOT NULL,
  created_at        DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  KEY idx_ledger_user (user_id, created_at),
  CONSTRAINT fk_ledger_wallet FOREIGN KEY (wallet_id) REFERENCES wallets (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_ledger_user FOREIGN KEY (user_id) REFERENCES users (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_ledger_round FOREIGN KEY (round_id) REFERENCES game_rounds (id)
    ON UPDATE CASCADE ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS rate_limits (
  bucket            VARCHAR(80)   NOT NULL,
  hits              INT UNSIGNED  NOT NULL DEFAULT 0,
  window_start      DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (bucket)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
