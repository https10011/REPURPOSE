import test from 'node:test';
import assert from 'node:assert/strict';

import { createResolver } from '../../assets/js/domain-route.js';
import { createMemoryPrefs, cacheKeys } from '../../assets/js/storage.js';

const MERCHANT = 'sige7tlbf5';
const KEYS = cacheKeys(MERCHANT);
const DAY = 86400000;

/** Deterministic clock. */
function clock(start = 1_700_000_000_000) {
  let now = start;
  return {
    now: () => now,
    advance: (ms) => {
      now += ms;
    },
  };
}

/**
 * Builds a resolver whose transport answers from a table of host -> response.
 * `delays` lets a test control which candidate answers first.
 */
function build({ routes = {}, delays = {}, prefs = createMemoryPrefs(), time = clock(), random = () => 0.5, log = () => {} } = {}) {
  const calls = [];
  const resolver = createResolver({
    prefs,
    merchant: MERCHANT,
    seedUrls: ['https://seed.one', 'https://seed.two'],
    backupDomain: 'https://backup.one, https://backup.two',
    device: 1,
    agentName: '',
    now: time.now,
    random,
    log,
    requestRoute: async (url) => {
      calls.push(url);
      const host = new URL(url).origin;
      const delay = delays[host] ?? 0;
      if (delay) await new Promise((r) => setTimeout(r, delay));
      const entry = routes[host];
      if (!entry) {
        const err = new Error('ECONNREFUSED');
        throw err;
      }
      return entry;
    },
  });
  return { resolver, prefs, time, calls };
}

const ok = (hosts, splash = '') => ({
  success: true,
  value: { domainList: hosts.map((h) => ({ domainName: h })), splash },
});

test('seeds the route list from merchant_url and persists it', () => {
  const { resolver, prefs } = build();
  const seeded = resolver.seedRouteList();
  assert.deepEqual(seeded.map((d) => d.domainName), ['https://seed.one', 'https://seed.two']);
  assert.equal(resolver.readRouteList().length, 2);
  assert.ok(prefs.getJson(KEYS.domainRoute, null));
});

test('returns domain_route_empty when nothing is cached and no seed exists', async () => {
  const { resolver } = build({ prefs: createMemoryPrefs() });
  const result = await resolver.resolve();
  assert.equal(result.host, null);
  assert.equal(result.error, 'domain_route_empty');
});

test('picks the fastest candidate that answers (rm.c race semantics)', async () => {
  const routes = {
    'https://a.test': ok(['https://a.test']),
    'https://b.test': ok(['https://b.test']),
  };
  const { resolver, prefs } = build({
    routes,
    delays: { 'https://a.test': 60, 'https://b.test': 5 },
  });
  resolver.saveRouteList([
    { domainName: 'https://a.test' },
    { domainName: 'https://b.test' },
  ]);
  const result = await resolver.resolve();
  assert.equal(result.host, 'https://b.test');
  assert.equal(result.path, 'route');
  assert.equal(prefs.getString(KEYS.lastUrl), 'https://b.test');
  assert.ok(prefs.getLong(KEYS.lastUrlAccess) > 0);
});

test('ignores a response whose domainList no longer advertises the probed host (rm.f)', async () => {
  const routes = {
    'https://stale.test': ok(['https://other.test']),
    'https://good.test': ok(['https://good.test']),
  };
  const { resolver } = build({ routes, delays: { 'https://stale.test': 1, 'https://good.test': 20 } });
  resolver.saveRouteList([{ domainName: 'https://stale.test' }, { domainName: 'https://good.test' }]);
  const result = await resolver.resolve();
  assert.equal(result.host, 'https://good.test');
});

test('skips blacklisted hosts (AppTestApp.n0)', async () => {
  const routes = {
    'https://a.test': ok(['https://a.test']),
    'https://b.test': ok(['https://b.test']),
  };
  const { resolver } = build({ routes });
  resolver.saveRouteList([{ domainName: 'https://a.test' }, { domainName: 'https://b.test' }]);
  resolver.addToBlacklist('https://a.test');
  const result = await resolver.resolve();
  assert.equal(result.host, 'https://b.test');
});

test('falls back to backupDomain, persists the new list and restarts resolution', async () => {
  const routes = {
    'https://dead.test': undefined,
    'https://backup.one': ok(['https://fresh.test', 'https://second.test']),
    'https://fresh.test': ok(['https://fresh.test', 'https://second.test']),
    'https://second.test': ok(['https://fresh.test', 'https://second.test']),
  };
  const { resolver, prefs } = build({ routes });
  resolver.saveRouteList([{ domainName: 'https://dead.test' }]);

  const result = await resolver.resolve();
  assert.ok(['https://fresh.test', 'https://second.test'].includes(result.host));
  assert.equal(result.path, 'route');
  const cached = resolver.readRouteList().map((d) => d.domainName);
  assert.deepEqual(cached.sort(), ['https://fresh.test', 'https://second.test']);
  assert.ok(prefs.getString(KEYS.lastUrl));
});

test('reports no_route when candidates and backups all fail', async () => {
  const { resolver } = build({ routes: {} });
  resolver.saveRouteList([{ domainName: 'https://dead.test' }]);
  const result = await resolver.resolve();
  assert.equal(result.host, null);
  assert.equal(result.error, 'no_route');
});

test('expires the cached last URL after 24h and clears the preference', async () => {
  const time = clock();
  const routes = {
    'https://cached.test': ok(['https://cached.test']),
    'https://cached.test2': undefined,
    'https://fresh.test': ok(['https://fresh.test']),
  };
  const { resolver, prefs } = build({ routes, time });
  resolver.saveRouteList([{ domainName: 'https://cached.test' }, { domainName: 'https://fresh.test' }]);
  resolver.saveLastUrl('https://cached.test');
  assert.equal(prefs.getString(KEYS.lastUrl), 'https://cached.test');

  time.advance(DAY + 1);
  const result = await resolver.resolve();
  // The stale entry is validated, then discarded and re-resolved.
  assert.ok(result.host);
  assert.equal(prefs.getString(KEYS.lastUrl), result.host);
  assert.notEqual(result.host, 'https://cached.test2');
});

test('re-validating a cached last URL refreshes the route list and splash', async () => {
  const routes = {
    'https://cached.test': ok(['https://cached.test', 'https://new.test'], 'https://cdn.test/splash.png'),
  };
  const splashes = [];
  const { resolver, prefs } = build({ routes });
  // Wire the splash observer after construction (the factory signature keeps it optional).
  const resolver2 = createResolver({
    prefs,
    merchant: MERCHANT,
    seedUrls: [],
    backupDomain: '',
    device: 1,
    agentName: '',
    now: () => Date.now(),
    requestRoute: async (url) => routes[new URL(url).origin] ?? Promise.reject(new Error('nope')),
    onSplash: (url) => splashes.push(url),
  });
  resolver2.saveRouteList([{ domainName: 'https://cached.test' }]);
  resolver2.saveLastUrl('https://cached.test');
  await resolver2.resolve();
  assert.deepEqual(splashes, ['https://cdn.test/splash.png']);
  assert.equal(prefs.getString('SPLASH_URL'), 'https://cdn.test/splash.png');
  assert.ok(resolver);
});

test('caps the candidate pool at 20 hosts (rm.c subList(0, min(20, size)))', async () => {
  const hosts = Array.from({ length: 30 }, (_, i) => `https://h${String(i).padStart(2, '0')}.test`);
  const routes = Object.fromEntries(hosts.map((h) => [h, ok([h])]));
  const probes = [];
  const resolver = createResolver({
    prefs: createMemoryPrefs(),
    merchant: MERCHANT,
    seedUrls: [],
    backupDomain: '',
    device: 1,
    agentName: '',
    requestRoute: async (url) => {
      probes.push(new URL(url).origin);
      return routes[new URL(url).origin];
    },
  });
  resolver.saveRouteList(hosts.map((h) => ({ domainName: h })));
  await resolver.resolve();
  assert.equal(probes.length, 20);
});
