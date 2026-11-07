/**
 * domain-route.js — 1:1 port of the domain resolution engine.
 *
 * Original sources:
 *   defpackage/rm.java   : c(boolean allowBackupFallback)  — multi-line flavour (isSingleLine=0)
 *   defpackage/zq1.java  : c()                             — single-line flavour
 *   defpackage/kf.java   : b(String domain)                — {domain, gaid} result envelope
 *   defpackage/ak1.java  : a/b                                  — host normalisation + route URL
 *   defpackage/wv1.java  : b(device, agentName)             — GET /wps/system/domainRoute
 *
 * Behaviour reproduced verbatim:
 *   • 24h validity of the cached last URL (AppTestApp.v), route list TTL (AppTestApp.f)
 *   • the cached last URL is ALWAYS re-validated before being reused, and the local cache of
 *     that key is cleared when it expires (AppTestApp.f("", false))
 *   • route list is shuffled, capped to 20 candidates, blacklisted hosts are skipped
 *   • all candidates race; the lowest-indexed candidate that already answered wins
 *     (the original spins over the futures in declaration order)
 *   • backupDomain is only consulted when every candidate failed and the caller allows it
 *   • a backup response that brings new hosts is persisted and resolution restarts once
 *
 * Everything external (fetch, storage, clock, randomness, logging) is injected so the module
 * is testable in node without a DOM — see tests/js/domain-route.test.mjs.
 */

import { cacheKeys } from './storage.js';
import { normaliseHost, routeEndpoint } from './app-url.js';

export const RESOLVER_PATHS = Object.freeze({
  CACHE: 'cache',
  ROUTE: 'route',
  BACKUP: 'backup',
  DIRECT: 'direct',
});

export class AbortedError extends Error {
  constructor(message = 'aborted') {
    super(message);
    this.name = 'AbortedError';
  }
}

/**
 * @param {object} deps
 * @param {object} deps.prefs          Prefs instance (storage.js)
 * @param {(url:string, opts:object)=>Promise<any>} deps.requestRoute
 * @param {string} deps.merchant
 * @param {string[]} deps.seedUrls     AndroidManifest meta-data merchant_url
 * @param {string} deps.backupDomain   AndroidManifest meta-data backupDomain
 * @param {number} deps.device         meta-data device
 * @param {string} deps.agentName      meta-data AGENT_NAME
 * @param {()=>number} [deps.now]
 * @param {()=>number} [deps.random]
 * @param {(level:string,message:string)=>void} [deps.log]
 * @param {(url:string)=>void} [deps.onSplash]
 * @param {(host:string)=>void} [deps.onDomainList]
 * @param {number} [deps.maxCandidates]
 * @param {number} [deps.ttlMs]
 */
export function createResolver(deps) {
  const {
    prefs,
    requestRoute,
    merchant,
    seedUrls = [],
    backupDomain = '',
    device = 1,
    agentName = '',
    now = () => Date.now(),
    random = () => Math.random(),
    log = () => {},
    onSplash = () => {},
    onDomainList = () => {},
    maxCandidates = 20,
    ttlMs = 86400000,
  } = deps;

  const keys = cacheKeys(merchant);
  /** AppTestApp.n0 — in-memory blacklist, lives for the process/page lifetime. */
  const blacklist = new Set();

  function addToBlacklist(host) {
    blacklist.add(normaliseHost(host));
  }

  function isBlacklisted(host) {
    return blacklist.has(normaliseHost(host));
  }

  function readRouteList() {
    const list = prefs.getJson(keys.domainRoute, []);
    return Array.isArray(list) ? list.filter((d) => d && d.domainName) : [];
  }

  function saveRouteList(list) {
    prefs.putJson(keys.domainRoute, list);
    prefs.putLong(keys.domainRouteAccess, now());
    onDomainList(list);
  }

  function saveLastUrl(host) {
    prefs.putLong(keys.lastUrlAccess, now());
    prefs.putString(keys.lastUrl, host);
  }

  function clearLastUrl() {
    prefs.putLong(keys.lastUrlAccess, -1);
    prefs.putString(keys.lastUrl, '');
  }

  function containsHost(list, host) {
    const target = normaliseHost(host).toLowerCase();
    return list.some((d) => normaliseHost(d.domainName).toLowerCase() === target);
  }

  /** rm.f(String, List<p20>) */
  function routeStillContains(host, list) {
    return containsHost(list, host);
  }

  function applyValue(value) {
    if (!value || typeof value !== 'object') return null;
    const list = Array.isArray(value.domainList)
      ? value.domainList.filter((d) => d && typeof d.domainName === 'string' && d.domainName.trim())
      : [];
    if (list.length) saveRouteList(list);
    const splash = typeof value.splash === 'string' ? value.splash : '';
    if (splash && splash !== prefs.getString('SPLASH_URL', '')) {
      prefs.putString('SPLASH_URL', splash);
      onSplash(splash);
      log('info', 'Splash url saved to local and preload to disk cache');
    }
    return list;
  }

  /**
   * Fetches `/wps/system/domainRoute` for a host and normalises the response.
   * Mirrors `gj1` handling in rm.e()/rm.c(): transport errors are swallowed and reported as
   * `{ ok:false }`, non-2xx is a failure, and a `success:false` body is a failure.
   */
  async function probe(host, signal) {
    const started = now();
    try {
      const body = await requestRoute(routeEndpoint(host, { device, agentName }), { signal });
      const ms = now() - started;
      const ok = !!body && body.success === true;
      return { host, ok, ms, body, status: 200 };
    } catch (err) {
      return { host, ok: false, ms: now() - started, body: null, error: err, status: err?.status || 0 };
    }
  }

  function shuffle(list) {
    const out = list.slice();
    for (let i = out.length - 1; i > 0; i -= 1) {
      const j = Math.floor(random() * (i + 1));
      [out[i], out[j]] = [out[j], out[i]];
    }
    return out;
  }

  /**
   * Races candidates the way rm.c() does: launch them all, then return the first (lowest
   * index) candidate that already produced a usable answer. Remaining requests are aborted.
   *
   * @param {string[]} hosts
   * @param {(probe:object)=>boolean} accept
   */
  async function raceFirstAcceptable(hosts, accept) {
    const controller = new AbortController();
    const results = new Array(hosts.length);
    const settled = new Set();
    const pending = new Map();

    hosts.forEach((host, idx) => {
      const p = probe(host, controller.signal).then((r) => {
        results[idx] = r;
        settled.add(idx);
        pending.delete(idx);
        return r;
      });
      pending.set(idx, p);
    });

    while (pending.size > 0) {
      await Promise.race(Array.from(pending.values()));
      for (let i = 0; i < hosts.length; i += 1) {
        if (settled.has(i) && results[i] && accept(results[i])) {
          controller.abort();
          return results[i];
        }
      }
    }
    return null;
  }

  function candidatesFrom(list) {
    const pool = list.filter((d) => !isBlacklisted(d.domainName));
    return shuffle(pool)
      .slice(0, Math.min(maxCandidates, pool.length))
      .map((d) => normaliseHost(d.domainName));
  }

  /**
   * rm.c(boolean z) — the full resolution pass.
   * @param {{allowBackupFallback?:boolean}} [options]
   */
  async function resolve(options = {}) {
    const { allowBackupFallback = true } = options;
    const started = now();
    const result = (host, path) => ({
      host,
      gaid: deps.gaid ? deps.gaid() : '',
      path,
      durationMs: now() - started,
    });

    // ---------------------------------------------------------------- cached last URL
    let lastUrl = prefs.getString(keys.lastUrl, '');
    if (lastUrl) {
      const accessed = prefs.getLong(keys.lastUrlAccess, -1);
      const expired = accessed === -1 || now() - accessed >= ttlMs;
      if (expired) {
        lastUrl = '';
      } else {
        log('info', `Ready speed test last url: ${lastUrl}`);
        const res = await probe(lastUrl);
        if (!res.ok) {
          log('warn', `Last URL test failed: ${lastUrl}, will get new domainRoute`);
        } else {
          const list = applyValue(res.body?.value) || [];
          if (!routeStillContains(lastUrl, list)) {
            log('warn', `Last URL test failed: ${lastUrl} already be removed from domainRoute`);
          }
        }
        // The original always discards the cached URL after re-validation (rm.c sets the
        // local to null on every path, so the "return cached" branch below is unreachable in
        // the APK as well). The real cache fast-path lives in X5_Activity.onCreate and is
        // implemented in app.js, which is why RESOLVER_PATHS.CACHE is produced there.
        lastUrl = '';
        clearLastUrl();
      }
    }

    if (lastUrl) {
      // Kept for parity with the decompiled control flow; unreachable by construction.
      saveLastUrl(lastUrl);
      return result(lastUrl, RESOLVER_PATHS.CACHE);
    }

    // ---------------------------------------------------------------- cached route list
    let list = readRouteList();
    const hosts = candidatesFrom(list);
    if (!hosts.length) {
      log('warn', 'Domain route empty');
      return { ...result(null, RESOLVER_PATHS.ROUTE), error: 'domain_route_empty' };
    }

    const winner = await raceFirstAcceptable(hosts, (probeRes) => {
      if (!probeRes.ok) return false;
      const returned = probeRes.body?.value?.domainList;
      if (!Array.isArray(returned)) return false;
      // rm.f(): the returned list must still advertise this host.
      return routeStillContains(probeRes.host, returned);
    });

    if (winner) {
      // Persist the (possibly updated) list + splash from the winning response.
      applyValue(winner.body?.value);
      const host = normaliseHost(winner.host);
      saveLastUrl(host);
      log('info', `Fast domain: ${host}`);
      return result(host, RESOLVER_PATHS.ROUTE);
    }

    // ---------------------------------------------------------------- backup domains
    if (!allowBackupFallback) return { ...result(null, RESOLVER_PATHS.ROUTE), error: 'no_route' };

    const backups = String(backupDomain || '')
      .split(/[,\s]+/)
      .map((s) => s.trim())
      .filter(Boolean)
      .map((s) => normaliseHost(s));
    if (!backups.length) return { ...result(null, RESOLVER_PATHS.BACKUP), error: 'no_route' };

    let backupList = null;
    const backupWinner = await raceFirstAcceptable(backups, (probeRes) => {
      const returned = probeRes.body?.value?.domainList;
      if (!probeRes.ok || !Array.isArray(returned) || returned.length === 0) return false;
      backupList = returned;
      return true;
    });

    if (!backupWinner || !backupList || backupList.length === 0) {
      log('warn', 'backup domain get domain route is empty');
      return { ...result(null, RESOLVER_PATHS.BACKUP), error: 'no_route' };
    }

    const fresh = backupList.filter((d) => d && d.domainName);
    // rm.c(): the backup list is persisted (and resolution restarted once) only when it brings
    // hosts that were not already cached; otherwise the pass just fails.
    const changed = fresh.some((d) => !containsHost(list, d.domainName));
    if (changed) {
      saveRouteList(fresh);
      log('info', 'Save new domain route');
      return resolve({ allowBackupFallback: false });
    }
    return { ...result(null, RESOLVER_PATHS.BACKUP), error: 'no_route' };
  }

  /** rm.d(): seeds the route list from `merchant_url` when nothing is cached. */
  function seedRouteList() {
    const seeds = seedUrls
      .map((s) => String(s || '').trim())
      .filter(Boolean)
      .map((host) => ({ domainName: normaliseHost(host) }));
    if (seeds.length) saveRouteList(seeds);
    return seeds;
  }

  return {
    resolve,
    seedRouteList,
    addToBlacklist,
    isBlacklisted,
    readRouteList,
    saveRouteList,
    saveLastUrl,
    clearLastUrl,
    keys,
  };
}

/**
 * Default JSON transport for `requestRoute`.
 * Mirrors the OkHttp configuration of rm.c(): 3s connect / 5s read timeouts.
 */
export async function fetchRouteJson(url, { signal, timeoutMs = 5000, headers = {} } = {}) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(new AbortedError('timeout')), timeoutMs);
  const outerAbort = () => controller.abort(new AbortedError('aborted'));
  if (signal) signal.addEventListener('abort', outerAbort, { once: true });
  try {
    const res = await fetch(url, {
      method: 'GET',
      cache: 'no-store',
      signal: controller.signal,
      headers: {
        // @tl0({"ModuleId: COMM3", "Accept: application/json"}) on wv1.b()
        ModuleId: 'COMM3',
        Accept: 'application/json',
        ...headers,
      },
    });
    if (!res.ok) {
      const err = new Error(`HTTP ${res.status}`);
      err.status = res.status;
      throw err;
    }
    return await res.json();
  } finally {
    clearTimeout(timer);
    if (signal) signal.removeEventListener('abort', outerAbort);
  }
}
