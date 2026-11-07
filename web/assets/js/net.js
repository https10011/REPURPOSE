/**
 * net.js — transport helpers for the shell's own backend calls.
 *
 * The original app talks to the merchant backend with OkHttp (rm.c) and to its telemetry
 * backends through the Firebase/AppsFlyer/OpenInstall SDKs. The web reconstruction routes the
 * latter through the PHP backend (see api/src/routes/*), so every call here is same-origin.
 */

const DEFAULT_TIMEOUT = 8000;

export async function getJson(url, { timeoutMs = DEFAULT_TIMEOUT, signal, headers } = {}) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(new Error('timeout')), timeoutMs);
  const forward = () => controller.abort(new Error('aborted'));
  if (signal) signal.addEventListener('abort', forward, { once: true });
  try {
    const res = await fetch(url, {
      method: 'GET',
      cache: 'no-store',
      credentials: 'same-origin',
      signal: controller.signal,
      headers: { Accept: 'application/json', ...(headers || {}) },
    });
    if (!res.ok) {
      const err = new Error(`HTTP ${res.status}`);
      err.status = res.status;
      throw err;
    }
    return await res.json();
  } finally {
    clearTimeout(timer);
    if (signal) signal.removeEventListener('abort', forward);
  }
}

export async function postJson(url, body, { timeoutMs = DEFAULT_TIMEOUT, keepalive = false } = {}) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(new Error('timeout')), timeoutMs);
  try {
    const res = await fetch(url, {
      method: 'POST',
      cache: 'no-store',
      credentials: 'same-origin',
      keepalive,
      signal: controller.signal,
      headers: { 'Content-Type': 'application/json', Accept: 'application/json' },
      body: JSON.stringify(body ?? {}),
    });
    if (!res.ok) {
      const err = new Error(`HTTP ${res.status}`);
      err.status = res.status;
      throw err;
    }
    return await res.json();
  } finally {
    clearTimeout(timer);
  }
}

/**
 * Fire-and-forget helper: telemetry/logging must never break the UI (the Android SDK calls are
 * equally guarded by try/catch in gs0/qg).
 */
export function sendBeaconJson(url, body) {
  const payload = JSON.stringify(body ?? {});
  try {
    if (typeof navigator !== 'undefined' && typeof navigator.sendBeacon === 'function') {
      const blob = new Blob([payload], { type: 'application/json' });
      if (navigator.sendBeacon(url, blob)) return true;
    }
  } catch (_) {
    /* fall through to fetch */
  }
  postJson(url, body, { keepalive: true }).catch(() => {});
  return false;
}
