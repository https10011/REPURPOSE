/**
 * store.js — session and local-preferences state for the application layer.
 *
 * Two kinds of state exist here and they must not be confused:
 *   • the session — authoritative, server-side, carried by the HttpOnly cookie and read through
 *     `api.session()`. Nothing sensitive is cached in the browser.
 *   • local preferences — UI conveniences that live only in this browser (last phone number typed,
 *     notification toggle, last stake per game). They use the shell's `Prefs` so the storage
 *     namespace and the `JS_` bridge contract stay consistent.
 */

import { getPrefs } from '../../assets/js/storage.js';

const APP_NS = 'sige77:app:';

function prefs() {
  return getPrefs();
}

export const store = {
  get(key, fallback = '') {
    return prefs().getString(APP_NS + key, fallback);
  },
  set(key, value) {
    prefs().putString(APP_NS + key, value);
  },
  getNumber(key, fallback = 0) {
    const raw = prefs().getString(APP_NS + key, '');
    const n = Number(raw);
    return raw === '' || !Number.isFinite(n) ? fallback : n;
  },
  setNumber(key, value) {
    prefs().putString(APP_NS + key, String(value));
  },
  getBool(key, fallback = false) {
    const raw = prefs().getString(APP_NS + key, '');
    if (raw === '') return fallback;
    return raw === '1' || raw === 'true';
  },
  setBool(key, value) {
    prefs().putString(APP_NS + key, value ? '1' : '0');
  },
  remove(key) {
    prefs().remove(APP_NS + key);
  },
};

/**
 * Mutable view of the signed-in account, shared by every screen. `user` is null while signed out.
 * Screens read `session.user`; the router reads `session.authenticated` to guard routes.
 */
export const session = {
  user: null,
  authenticated: false,

  set(value) {
    this.authenticated = !!(value && value.authenticated);
    this.user = this.authenticated ? value.user || null : null;
    return this.user;
  },

  clear() {
    this.user = null;
    this.authenticated = false;
  },

  get balance() {
    return this.user && this.user.wallet ? Number(this.user.wallet.balance) || 0 : 0;
  },

  /** Applies a balance returned by a round, keeping the header in sync without a refetch. */
  applyBalance(balance) {
    if (this.user && this.user.wallet) this.user.wallet.balance = Number(balance) || 0;
  },
};
