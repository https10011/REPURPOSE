import test from 'node:test';
import assert from 'node:assert/strict';

import { createMemoryPrefs } from '../../assets/js/storage.js';
import { makeTrackId, isTrackId } from '../../assets/js/track-id.js';
import { mergeRemoteConfig, MANIFEST, normaliseFlag, isConfigured } from '../../assets/js/app-config.js';
import { guessFileName } from '../../assets/js/downloads.js';

test('Prefs behaves like SharedPreferences (strings, longs, JSON, removal)', () => {
  const prefs = createMemoryPrefs();
  prefs.putString('VERSION', '2.4.87');
  assert.equal(prefs.getString('VERSION'), '2.4.87');
  prefs.putLong('access_x', 1234);
  assert.equal(prefs.getLong('access_x', -1), 1234);
  assert.equal(prefs.getLong('missing', -1), -1);
  prefs.putJson('cache_x', [{ domainName: 'https://a.test' }]);
  assert.deepEqual(prefs.getJson('cache_x', []), [{ domainName: 'https://a.test' }]);
  prefs.remove('VERSION');
  assert.equal(prefs.getString('VERSION', ''), '');
});

test('Prefs.clearAll only touches its own namespace', () => {
  const prefs = createMemoryPrefs();
  prefs.putString('a', '1');
  prefs.storage.setItem('foreign', 'x');
  prefs.clearAll();
  assert.equal(prefs.getString('a', ''), '');
  assert.equal(prefs.storage.getItem('foreign'), 'x');
});

test('track id follows X5_Activity.F(): random(100..10000)-first4-last4', () => {
  const uuid = '25bde67d-0321-4f09-9723-dba4593c3567';
  assert.equal(makeTrackId(uuid, () => 0), `100-${uuid.substring(0, 4)}-${uuid.substring(uuid.length - 4)}`);
  assert.equal(makeTrackId(uuid, () => 0.999999), `10000-25bd-3567`);
  const id = makeTrackId(uuid);
  assert.ok(isTrackId(id), `unexpected track id ${id}`);
  const [n] = id.split('-');
  assert.ok(Number(n) >= 100 && Number(n) <= 10000);
});

test('normaliseFlag / isConfigured mirror d.h() and ea.q()', () => {
  assert.equal(normaliseFlag('  ABC '), 'abc');
  assert.equal(normaliseFlag('0'), '');
  assert.equal(isConfigured('   '), false);
  assert.equal(isConfigured('_'), true); // the manifest placeholder counts as configured
  assert.equal(isConfigured(null), false);
});

test('mergeRemoteConfig overrides only the fields the backend sends', () => {
  const merged = mergeRemoteConfig(MANIFEST, {
    version: '9.9.9',
    merchantUrls: ['https://x.test'],
    isSingleLine: 1,
    resolver: { maxCandidates: 5 },
  });
  assert.equal(merged.version, '9.9.9');
  assert.deepEqual(merged.merchantUrls, ['https://x.test']);
  assert.equal(merged.isSingleLine, true);
  assert.equal(merged.resolver.maxCandidates, 5);
  assert.equal(merged.resolver.requestTimeoutMs, MANIFEST.resolver.requestTimeoutMs);
  assert.equal(merged.merchant, MANIFEST.merchant);
});

test('guessFileName prefers content-disposition, then the URL path', () => {
  assert.equal(guessFileName('https://x.test/app.apk'), 'app.apk');
  assert.equal(
    guessFileName('https://x.test/download?id=1', 'attachment; filename="report final.pdf"', 'application/pdf'),
    'report final.pdf',
  );
  assert.match(guessFileName('https://x.test/download', '', 'image/png'), /^download_\d+\.png$/);
});
