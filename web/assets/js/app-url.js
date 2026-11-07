/**
 * app-url.js — URL normalisation and attribution decoration.
 *
 * 1:1 port of:
 *   ak1.a(String str, boolean z)      -> normaliseHost() / normaliseUrl()  (@link defpackage/ak1.java)
 *   X5_Activity.C(Uri, name, value)   -> withQueryParam()                  (@link X5_Activity.java)
 *   X5_Activity.E(String, gaid)       -> decorateUrl()                     (@link X5_Activity.java)
 *
 * The shims replicate the original oddities on purpose (e.g. "/m/index.html" is appended by
 * plain string concatenation, and placeholder flags like "_" or "_0" are kept because
 * `ea.q()` only rejects blank values).
 */

import { isConfigured, normaliseFlag } from './app-config.js';

/**
 * ak1.a(str, true): reduce any URL-ish string to a bare host
 * (scheme + host, no path, no query, no whitespace).
 */
export function normaliseHost(input) {
  const raw = String(input ?? '');
  const scheme = raw.includes('https') ? 'https' : raw.includes('http') ? 'http' : 'https';
  let s = raw.replace(/(https|http):/g, '');
  // ak1.a: replaceAll("(//|/.*|\s)", "") — Java regex, applied globally.
  s = s.replace(/\/\/|\/.*|\s/g, '');
  return `${scheme}://${s}`.replace(/\/{4}/g, '//');
}

/** ak1.a(str, false): normalise the scheme but keep path/query. */
export function normaliseUrl(input) {
  const raw = String(input ?? '');
  const scheme = raw.includes('https') ? 'https' : raw.includes('http') ? 'http' : 'https';
  const s = raw.replace(/(https|http):/g, '');
  return `${scheme}://${s}`.replace(/\/{4}/g, '//');
}

/**
 * X5_Activity.C(Uri, param, value): rebuild the query string with `param` replaced in place or
 * appended at the end. Existing parameter order is preserved (Uri.Builder.clearQuery()).
 */
export function withQueryParam(rawUrl, param, value) {
  if (value === null || value === undefined) return rawUrl;
  let url;
  try {
    url = new URL(rawUrl);
  } catch (_) {
    return rawUrl;
  }
  // URLSearchParams.set() keeps the position of an existing key and appends otherwise,
  // which matches appendQueryParameter() over a cleared-then-replayed query.
  url.searchParams.set(param, String(value));
  return url.toString();
}

/**
 * X5_Activity.E(String url, String gaid).
 *
 * @param {string} baseUrl   resolved domain (already scheme+host, no trailing slash needed)
 * @param {object} options   { isSingleLine, affiliateCode, fbPixelId, tid, gaid, snowBallAppId }
 */
export function decorateUrl(baseUrl, options = {}) {
  const {
    isSingleLine = false,
    affiliateCode = '',
    fbPixelId = '',
    tid = '',
    gaid = '',
    snowBallAppId = '',
  } = options;

  let url = String(baseUrl ?? '');
  // if (!AppTestApp.c0) str = str + "/m/index.html"
  if (!isSingleLine) url = `${url}/m/index.html`;

  const code = normaliseFlag(affiliateCode);
  const pixel = normaliseFlag(fbPixelId);
  const trackId = normaliseFlag(tid);
  const snow = normaliseFlag(snowBallAppId);

  let out = url;
  if (isConfigured(code)) out = withQueryParam(out, 'affiliateCode', code);
  if (isConfigured(pixel)) out = withQueryParam(out, 'fbPixelId', pixel);
  if (isConfigured(trackId)) out = withQueryParam(out, 'tid', trackId);
  if (isConfigured(gaid) && normaliseFlag(gaid) !== '') {
    out = withQueryParam(out, 'gaid', String(gaid));
  }
  if (isConfigured(snow) && snow !== '0') out = withQueryParam(out, 'snowBallAppId', snow);
  return out;
}

/** Convenience: the speed-test endpoint URL the resolver calls for a candidate host. */
export function routeEndpoint(host, { device = 1, agentName = '' } = {}) {
  const base = `${normaliseHost(host)}/wps/system/domainRoute`;
  const url = new URL(base);
  url.searchParams.set('device', String(device));
  url.searchParams.set('agentName', String(agentName ?? ''));
  return url.toString();
}

/** Same host, only used to display a route in the debug log. */
export function hostOf(rawUrl) {
  try {
    return new URL(rawUrl).host;
  } catch (_) {
    return String(rawUrl);
  }
}
