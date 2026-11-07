/**
 * shell_browser_check.mjs — drives the shell's failure branches in a real browser (directive §17).
 *
 * OPTIONAL, like `app_browser_check.mjs`, and for the same reason: it needs a browser. Unlike that
 * file it needs no account, because it never gets as far as the framed app — it forces the three
 * ways a load can fail and checks the shell responds the way `X5_Activity` does.
 *
 *   npm i --no-save playwright-core
 *   CHROMIUM=/usr/bin/chromium BASE=http://127.0.0.1:12000 node tests/shell_browser_check.mjs
 *
 * The branches are forced by intercepting requests, so the real error paths run — nothing is
 * stubbed inside the application code:
 *   1. every `domainRoute` candidate aborts   -> resolver finds no route
 *   2. the framed document answers 500        -> onReceivedHttpError
 *   3. the framed document has no keywords    -> shouldInterceptRequest rejects it (anti-hijack)
 *   4. the framed document aborts             -> onReceivedError
 *
 * Each must land on the non-cancelable route-failure dialog with a fresh track id, which is what
 * `X5_Activity.F()` shows, and the page must raise no uncaught errors while doing it.
 */
import fs from 'node:fs';

const BASE = process.env.BASE || 'http://127.0.0.1:12000';
const CHROMIUM = process.env.CHROMIUM || '/usr/bin/chromium';

let chromium;
try {
  ({ chromium } = await import('playwright-core'));
} catch {
  console.log('SKIP  playwright-core is not installed (this check is optional)');
  process.exit(0);
}
if (!fs.existsSync(CHROMIUM)) {
  console.log(`SKIP  no browser at ${CHROMIUM}`);
  process.exit(0);
}

const browser = await chromium.launch({ executablePath: CHROMIUM, args: ['--no-sandbox', '--disable-dev-shm-usage'] });
const results = [];
const check = (name, ok, detail = '') => results.push({ ok, name, detail });

async function branch(name, intercept) {
  const ctx = await browser.newContext({ viewport: { width: 412, height: 915 } });
  const page = await ctx.newPage();
  const pageErrors = [];
  page.on('pageerror', (e) => pageErrors.push(String(e)));
  await intercept(page);
  await page.goto(`${BASE}/index.html`, { waitUntil: 'load' });
  await page.waitForTimeout(6000);
  const text = (await page.innerText('body')).replace(/\s+/g, ' ').trim();
  const trackId = text.match(/\(([0-9a-f-]{8,})\)/i)?.[1];
  check(`${name}: shows the route-failure dialog`, /can not find the fast route|try again later/i.test(text), text.slice(0, 70));
  check(`${name}: carries a track id`, Boolean(trackId), trackId || 'none');
  check(`${name}: no uncaught page errors`, pageErrors.length === 0, pageErrors.join('; '));
  await ctx.close();
  return trackId;
}

const ids = [];
ids.push(await branch('resolver fails', (p) => p.route('**/wps/system/domainRoute*', (r) => r.abort())));
ids.push(await branch('framed page 500', (p) => p.route('**/m/index.html*', (r) => r.fulfill({ status: 500, body: 'boom' }))));
ids.push(
  await branch('framed page lacks keywords', (p) =>
    p.route('**/m/index.html*', (r) =>
      r.fulfill({ status: 200, contentType: 'text/html', body: '<html><body>nothing here</body></html>' }),
    ),
  ),
);
ids.push(await branch('framed page aborts', (p) => p.route('**/m/index.html*', (r) => r.abort())));

check('track ids are per-failure, not a constant', new Set(ids).size === ids.length, ids.join(', '));

// A healthy load must still succeed, or the branches above prove nothing about the happy path.
// The app renders inside the WebView iframe, so its text is not part of the top document's body.
const ctx = await browser.newContext({ viewport: { width: 412, height: 915 } });
const page = await ctx.newPage();
await page.goto(`${BASE}/index.html`, { waitUntil: 'load' });
await page.waitForTimeout(7000);
const framed = page.frames().find((f) => f.url().includes('/m/index.html'));
let ok = '';
if (framed) ok = (await framed.innerText('body')).replace(/\s+/g, ' ');
check('a healthy load frames the app', Boolean(framed), framed ? framed.url().slice(-60) : 'no /m/ frame');
check('the framed app rendered', /available balance|sign in|phone|register/i.test(ok), ok.slice(0, 60));
await ctx.close();

await browser.close();

for (const r of results) console.log(`${r.ok ? 'PASS' : 'FAIL'}  ${r.name}${r.detail ? ' — ' + r.detail : ''}`);
const failed = results.filter((r) => !r.ok).length;
console.log(`\npassed: ${results.length - failed}, failed: ${failed}`);
process.exit(failed ? 1 : 0);
