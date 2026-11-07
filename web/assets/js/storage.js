/**
 * storage.js — SharedPreferences equivalent.
 *
 * The Android app stores everything in one preferences file
 *   `getString(2131886122)` = "prod.apptest.com.userinfo"
 * plus a second file `device_stats.xml` for the device UUID (j10.java).
 *
 * Key names are reproduced exactly (see AppTestApp.onCreate, X5_Activity.onCreate,
 * gs0.storageGetItem/SetItem/RemoveItem) because the embedded web page addresses them by
 * name through window.Android.storageGetItem("...") and because the 24h cache / version-reset
 * behaviour depends on them.
 *
 * Web Storage is used as the storage engine: like SharedPreferences it survives reloads and
 * is scoped to the install (origin). A memory fallback keeps the shell usable when the
 * browser blocks storage (private mode / disabled cookies).
 */

export const PREFS_FILE = 'prod.apptest.com.userinfo';
export const DEVICE_STATS_FILE = 'device_stats.xml';

export function cacheKeys(merchant) {
  return {
    // AppTestApp.e / f / i / v
    domainRoute: `cache_${merchant}_domainRoute`,
    domainRouteAccess: `access_${merchant}_domainRoute`,
    lastUrl: `cache_${merchant}_lastUrl`,
    lastUrlAccess: `access_${merchant}_lastUrl`,
    gaid: `gaid_${merchant}`,
  };
}

/**
 * In-memory Storage implementation. Every call gets its own backing map so independent Prefs
 * instances (tests, private-mode fallback) never share state.
 */
function memoryStorage() {
  const map = new Map();
  return {
    getItem: (k) => (map.has(k) ? map.get(k) : null),
    setItem: (k, v) => map.set(k, String(v)),
    removeItem: (k) => map.delete(k),
    key: (i) => Array.from(map.keys())[i] ?? null,
    get length() {
      return map.size;
    },
    clear: () => map.clear(),
  };
}

/** The single fallback instance used when the browser blocks localStorage. */
let fallbackStorage = null;
function getFallbackStorage() {
  if (!fallbackStorage) fallbackStorage = memoryStorage();
  return fallbackStorage;
}

function detectStorage() {
  try {
    const probe = '__sige77_probe__';
    window.localStorage.setItem(probe, '1');
    window.localStorage.removeItem(probe);
    return window.localStorage;
  } catch (_) {
    // SharedPreferences cannot fail this way on Android; keep the shell functional instead of
    // throwing. Documented in docs/RECONSTRUCTION_NOTES.md.
    return getFallbackStorage();
  }
}

export class Prefs {
  constructor(storage, namespace = 'sige77:') {
    this.storage = storage;
    this.namespace = namespace;
  }

  _key(key) {
    return this.namespace + key;
  }

  getString(key, fallback = '') {
    const raw = this.storage.getItem(this._key(key));
    return raw === null || raw === undefined ? fallback : String(raw);
  }

  putString(key, value) {
    this.storage.setItem(this._key(key), value === null || value === undefined ? '' : String(value));
  }

  getLong(key, fallback = -1) {
    const raw = this.storage.getItem(this._key(key));
    if (raw === null || raw === undefined || raw === '') return fallback;
    const n = Number(raw);
    return Number.isFinite(n) ? n : fallback;
  }

  putLong(key, value) {
    this.storage.setItem(this._key(key), String(Math.trunc(Number(value))));
  }

  remove(key) {
    this.storage.removeItem(this._key(key));
  }

  /** Removes every preference written by the shell (used by JSInterface.clearCache). */
  clearAll() {
    const doomed = [];
    for (let i = 0; i < this.storage.length; i += 1) {
      const k = this.storage.key(i);
      if (k && k.startsWith(this.namespace)) doomed.push(k);
    }
    doomed.forEach((k) => this.storage.removeItem(k));
  }

  // --- typed helpers used by the shell ------------------------------------------------

  getJson(key, fallback) {
    const raw = this.getString(key, '');
    if (!raw) return fallback;
    try {
      const parsed = JSON.parse(raw);
      return parsed === null || parsed === undefined ? fallback : parsed;
    } catch (_) {
      return fallback;
    }
  }

  putJson(key, value) {
    this.putString(key, JSON.stringify(value));
  }
}

let defaultPrefs = null;

export function getPrefs() {
  if (!defaultPrefs) defaultPrefs = new Prefs(detectStorage());
  return defaultPrefs;
}

/** Test seam: allows node/jsdom-style tests to inject a deterministic storage. */
export function setPrefsForTests(prefs) {
  defaultPrefs = prefs;
}

export function createMemoryPrefs(namespace = 'sige77:') {
  return new Prefs(memoryStorage(), namespace);
}
