import test from 'node:test';
import assert from 'node:assert/strict';

import { normaliseHost, normaliseUrl, withQueryParam, decorateUrl, routeEndpoint } from '../../assets/js/app-url.js';

test('normaliseHost reproduces ak1.a(str, true)', () => {
  assert.equal(normaliseHost('https://www.77sige.club/'), 'https://www.77sige.club');
  assert.equal(normaliseHost('http://example.com:8080/path?x=1'), 'http://example.com:8080');
  assert.equal(normaliseHost('example.com/path'), 'https://example.com');
  assert.equal(normaliseHost('  https://a.b/c  '), 'https://a.b');
});

test('normaliseUrl keeps the path but normalises the scheme', () => {
  assert.equal(normaliseUrl('http://a.b/c?d=1'), 'http://a.b/c?d=1');
  assert.equal(normaliseUrl('a.b/c'), 'https://a.b/c');
});

test('withQueryParam replaces in place and appends new params', () => {
  assert.equal(
    withQueryParam('https://x.test/m/index.html?a=1&b=2', 'b', '9'),
    'https://x.test/m/index.html?a=1&b=9',
  );
  assert.equal(
    withQueryParam('https://x.test/m/index.html?a=1', 'z', 'z v'),
    'https://x.test/m/index.html?a=1&z=z+v',
  );
});

test('decorateUrl appends /m/index.html when isSingleLine is false', () => {
  const url = decorateUrl('https://x.test', { isSingleLine: false });
  assert.equal(url, 'https://x.test/m/index.html');
});

test('decorateUrl keeps the URL untouched when isSingleLine is true', () => {
  assert.equal(decorateUrl('https://x.test', { isSingleLine: true }), 'https://x.test');
});

test('decorateUrl adds every configured attribution parameter (X5_Activity.E)', () => {
  const url = decorateUrl('https://x.test', {
    isSingleLine: false,
    affiliateCode: '_',
    fbPixelId: '_',
    tid: '_0',
    gaid: 'abc-123',
    snowBallAppId: '_',
  });
  const parsed = new URL(url);
  assert.equal(parsed.pathname, '/m/index.html');
  assert.equal(parsed.searchParams.get('affiliateCode'), '_');
  assert.equal(parsed.searchParams.get('fbPixelId'), '_');
  assert.equal(parsed.searchParams.get('tid'), '_0');
  assert.equal(parsed.searchParams.get('gaid'), 'abc-123');
  assert.equal(parsed.searchParams.get('snowBallAppId'), '_');
});

test('decorateUrl skips blank and "0" values the way ea.q()/E() do', () => {
  const url = decorateUrl('https://x.test', {
    isSingleLine: false,
    affiliateCode: '   ',
    fbPixelId: '0',
    tid: '',
    gaid: '0',
    snowBallAppId: '0',
  });
  const parsed = new URL(url);
  assert.equal(parsed.search, '');
});

test('decorateUrl overrides an existing parameter instead of duplicating it', () => {
  const url = decorateUrl('https://x.test/page?tid=old&keep=1', {
    isSingleLine: true,
    tid: 'new',
  });
  const parsed = new URL(url);
  assert.equal(parsed.searchParams.get('tid'), 'new');
  assert.equal(parsed.searchParams.get('keep'), '1');
  assert.equal(parsed.searchParams.getAll('tid').length, 1);
});

test('routeEndpoint builds the original /wps/system/domainRoute request', () => {
  assert.equal(
    routeEndpoint('https://x.test/path', { device: 1, agentName: '' }),
    'https://x.test/wps/system/domainRoute?device=1&agentName=',
  );
});
