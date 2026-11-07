/**
 * device.js — device identity equivalents.
 *
 * Original sources:
 *   defpackage/j10.java : persistent device UUID.
 *                         Real APK: Settings.Secure.ANDROID_ID -> UUID.nameUUIDFromBytes(),
 *                         cached in SharedPreferences "device_stats.xml" under "device_id".
 *                         Web: a random UUID v4 persisted under the same key.
 *   defpackage/kf.java  : sx0 {domain, gaid}. gaid comes from AdvertisingIdClient and is
 *                         cached in prefs as "gaid_<merchant>". Browsers expose no advertising
 *                         id, so a persisted random id is used instead (documented limitation,
 *                         see docs/RECONSTRUCTION_NOTES.md).
 *   AppTestApp.onCreate: user-agent string
 *                         "<escaped default UA>/<BRAND> AppShellVer:<version> UUID/<uuid>"
 */

import { cacheKeys } from './storage.js';

const DEVICE_ID_KEY = 'device_id';

export function uuidV4() {
  const c = globalThis.crypto;
  if (c && typeof c.randomUUID === 'function') return c.randomUUID();
  // Fallback for environments without crypto.randomUUID (older browsers, node < 19).
  const bytes = new Uint8Array(16);
  if (c && c.getRandomValues) c.getRandomValues(bytes);
  else for (let i = 0; i < 16; i += 1) bytes[i] = Math.floor(Math.random() * 256);
  bytes[6] = (bytes[6] & 0x0f) | 0x40;
  bytes[8] = (bytes[8] & 0x3f) | 0x80;
  const hex = Array.from(bytes, (b) => b.toString(16).padStart(2, '0')).join('');
  return `${hex.slice(0, 8)}-${hex.slice(8, 12)}-${hex.slice(12, 16)}-${hex.slice(16, 20)}-${hex.slice(20)}`;
}

/** j10: returns the persisted device UUID, creating it on first run. */
export function getDeviceId(prefs) {
  const existing = prefs.getString(DEVICE_ID_KEY, '');
  if (existing) return existing;
  const id = uuidV4();
  prefs.putString(DEVICE_ID_KEY, id);
  return id;
}

function randomAdId() {
  const digits = '0123456789abcdef';
  const block = (n) => Array.from({ length: n }, () => digits[Math.floor(Math.random() * 16)]).join('');
  return `${block(8)}-${block(4)}-${block(4)}-${block(4)}-${block(12)}`;
}

/**
 * kf.b(): the "advertising id" handed to the decorated URL (`gaid` query parameter).
 * `AppTestApp.b()` reads prefs `gaid_<merchant>`; "0" means "not available".
 */
export function getAdvertisingId(prefs, merchant) {
  const key = cacheKeys(merchant).gaid;
  const existing = prefs.getString(key, '');
  if (existing) return existing;
  const id = randomAdId();
  prefs.putString(key, id);
  return id;
}

/**
 * AppTestApp.onCreate(): default UA + "/" + BRAND + " AppShellVer:" + version + " UUID/" + uuid
 * The APK additionally replaces "; wv" with "; xx-xx" so servers do not treat the request as an
 * Android WebView. The same transformation is applied for consistency.
 */
export function buildUserAgent(version, deviceId, brand = 'Web') {
  const base = String(globalThis.navigator?.userAgent || 'Mozilla/5.0').replace(/; wv/g, '; xx-xx');
  return `${base}/${brand} AppShellVer:${version} UUID/${deviceId}`;
}
