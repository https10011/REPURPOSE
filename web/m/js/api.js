/**
 * api.js — typed client for this application's own backend (directive §17.5/§17.6).
 *
 * Every call is same-origin and carries the session cookie (`credentials: same-origin`), which is
 * what `Auth::requireSameOrigin()` and the `sige77_session` HttpOnly cookie expect. Failures are
 * normalised into an ApiError carrying the backend's error code so screens can react precisely
 * (invalid credentials vs. rate limit vs. insufficient balance).
 */

export class ApiError extends Error {
  constructor(message, { code = 'error', status = 0 } = {}) {
    super(message);
    this.name = 'ApiError';
    this.code = code;
    this.status = status;
  }
}

const BASE = '..'; // /m/index.html -> /api/...

async function call(path, { method = 'GET', body, timeoutMs = 12000 } = {}) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(new Error('timeout')), timeoutMs);
  let res;
  try {
    res = await fetch(`${BASE}${path}`, {
      method,
      credentials: 'same-origin',
      cache: 'no-store',
      headers: body ? { 'Content-Type': 'application/json', Accept: 'application/json' } : { Accept: 'application/json' },
      body: body ? JSON.stringify(body) : undefined,
      signal: controller.signal,
    });
  } catch (err) {
    clearTimeout(timer);
    throw new ApiError(
      err && err.message === 'timeout' ? 'The server took too long to answer.' : 'No connection to the server.',
      { code: 'network' },
    );
  }
  clearTimeout(timer);

  let payload = null;
  try {
    payload = await res.json();
  } catch (_) {
    payload = null;
  }

  if (!res.ok || !payload || payload.success !== true) {
    const error = payload && payload.error ? payload.error : {};
    throw new ApiError(error.message || `Request failed (${res.status}).`, {
      code: error.code || 'http_error',
      status: res.status,
    });
  }
  return payload.value ?? {};
}

export const api = {
  /* ------------------------------------------------------------------ session -- */
  session: () => call('/api/auth/session'),
  register: (body) => call('/api/auth/register', { method: 'POST', body }),
  login: (body) => call('/api/auth/login', { method: 'POST', body }),
  logout: () => call('/api/auth/logout', { method: 'POST' }),
  requestOtp: (body) => call('/api/auth/otp/request', { method: 'POST', body }),
  verifyOtp: (body) => call('/api/auth/otp/verify', { method: 'POST', body }),

  /* ------------------------------------------------------------------ account -- */
  account: () => call('/api/account'),

  /* ----------------------------------------------------------------- games --- */
  games: ({ category = 'all', q = '' } = {}) => {
    const params = new URLSearchParams();
    if (category && category !== 'all') params.set('category', category);
    if (q) params.set('q', q);
    const suffix = params.toString() ? `?${params}` : '';
    return call(`/api/games${suffix}`);
  },
  play: (body) => call('/api/games/play', { method: 'POST', body }),
  history: (slug) => call(`/api/games/history${slug ? `?slug=${encodeURIComponent(slug)}` : ''}`),
  claimDailyCredits: () => call('/api/wallet/claim', { method: 'POST', body: {} }),

  /* ---------------------------------------------------------- notifications -- */
  notifications: () => call('/api/notifications'),
  markNotificationsRead: () => call('/api/notifications', { method: 'POST', body: { all: true } }),

  /* ---------------------------------------------------------------- telemetry -- */
  /** Fire-and-forget telemetry, routed through the shell's existing event endpoint. */
  track(name, params) {
    call('/api/collect/event', { method: 'POST', body: { name, params: params || {} } }).catch(() => {});
  },
};
