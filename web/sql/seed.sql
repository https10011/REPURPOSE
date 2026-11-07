-- ---------------------------------------------------------------------------
-- Seed data — every value below comes from the decompiled APK.
--
-- {{ORIGIN}} is replaced by bin/migrate.php with the deployment/development origin
-- (default: http://localhost:8099) because the shell performs a live speed test against the
-- domains it receives; a dead marketing domain cannot answer it.
--
-- The original merchant_url list is kept in app_meta.merchant_urls for fidelity and as the
-- fallback seed when the `domains` table is empty.
-- ---------------------------------------------------------------------------

SET NAMES utf8mb4;
SET time_zone = '+00:00';

INSERT INTO app_meta
  (merchant, app_name, version, package_name, backup_domain, merchant_urls, device,
   is_single_line, affiliate_code, fb_pixel_id, tid, snow_ball_app_id, agent_name, splash_url)
VALUES
  ('sige7tlbf5',
   'Sige77',
   '2.4.87',
   'prod.app_sige7tlbf5.com',
   'https://www.112121313.com',
   JSON_ARRAY(
     'https://www.77sige.club',
     'https://www.77sige.net',
     'https://www.sige77.app',
     'https://www.sige777.net',
     'https://www.sige777.club',
     'https://www.sige777.vip',
     'https://www.sige77a.com',
     'https://www.sige77a.org',
     'https://www.sige77a.app',
     'https://www.sige77a.net',
     'https://www.49704794.com'
   ),
   1, 0, '_', '_', '_0', '_', '', NULL)
ON DUPLICATE KEY UPDATE
  app_name = VALUES(app_name),
  version = VALUES(version),
  package_name = VALUES(package_name),
  backup_domain = VALUES(backup_domain),
  merchant_urls = VALUES(merchant_urls),
  device = VALUES(device),
  is_single_line = VALUES(is_single_line),
  affiliate_code = VALUES(affiliate_code),
  fb_pixel_id = VALUES(fb_pixel_id),
  tid = VALUES(tid),
  snow_ball_app_id = VALUES(snow_ball_app_id),
  agent_name = VALUES(agent_name);

INSERT INTO domains (merchant, host, enabled, priority, region, status)
VALUES
  ('sige7tlbf5', '{{ORIGIN}}', 1, 10, 'local', 'unknown')
ON DUPLICATE KEY UPDATE merchant = VALUES(merchant), enabled = VALUES(enabled), priority = VALUES(priority), region = VALUES(region);

INSERT INTO settings (k, v) VALUES
  ('resolver_max_candidates', '20'),
  ('resolver_ttl_seconds', '86400'),
  ('resolver_timeout_ms', '5000'),
  ('min_loading_ms', '1000'),
  ('app_latest_url', ''),
  ('app_latest_note', 'Parity endpoint: the APK builds this URL but never calls it (AppTestApp.W).')
ON DUPLICATE KEY UPDATE v = VALUES(v);
