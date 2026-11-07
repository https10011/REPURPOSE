/**
 * app_browser_check.mjs — end-to-end check of the reconstructed app (directive §17).
 *
 * OPTIONAL. The rest of the suite has no dependencies; this one drives a real browser, so it is
 * skipped unless its prerequisites are present. It is not part of `node --test tests/js/*.test.mjs`.
 *
 *   npm i --no-save playwright-core        # or point PLAYWRIGHT to an existing install
 *   CHROMIUM=/usr/bin/chromium BASE=http://127.0.0.1:12000 \
 *   PHONE=<account phone> PASS=<account password> node tests/app_browser_check.mjs
 *
 * `PHONE`/`PASS` are required and must be an account that already exists (see `bin/` and the seed
 * data); the script signs in rather than registering, so it never leaves accounts behind. They are
 * read from the environment on purpose: no credential is stored in this file. It stakes a small
 * amount and therefore moves real balances in the target database — point `BASE` at a scratch
 * instance.
 *
 * The last two assertions are honesty guards, not feature tests: they fail if a screen starts
 * claiming something the build cannot do (an SMS that was never sent, a game that is not there).
 */
import fs from 'node:fs';

const BASE = process.env.BASE || 'http://127.0.0.1:12000';
const CHROMIUM = process.env.CHROMIUM || '/usr/bin/chromium';
const PHONE = process.env.PHONE;
const PASS = process.env.PASS;

if (!PHONE || !PASS) {
  console.error('PHONE and PASS must be set to an existing account; refusing to guess credentials.');
  process.exit(2);
}

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
const ctx = await browser.newContext({ viewport: { width: 412, height: 915 } });
const page = await ctx.newPage();

const pageErrors = [];
page.on('pageerror', (e) => pageErrors.push(String(e)));

const results = [];
const check = (name, ok, detail = '') => results.push({ ok, name, detail });

// Hash-only navigations are same-document: `networkidle` resolves against the *previous* DOM, so
// the router needs a beat before the new screen is readable.
const visit = async (hash) => {
  await page.goto(`${BASE}/m/index.html#${hash}`, { waitUntil: 'load' });
  await page.waitForTimeout(700);
};

async function signIn() {
  await visit('/login');
  const inputs = await page.$$('input');
  await inputs[0].fill(PHONE);
  await page.fill('input[type="password"]', PASS);
  await page.click('button[type="submit"], button:has-text("Sign in")');
  await page.waitForTimeout(2500);
}

// --- signed-out screens -----------------------------------------------------
await visit('/register');
const register = await page.innerText('body');
check('registration form is complete', /name/i.test(register) && /phone/i.test(register) && /password/i.test(register));

await visit('/otp?phone=%2B639171234567&purpose=register');
await page.waitForTimeout(1200);
const otp = await page.innerText('body');
check('OTP screen discloses the local code', /no SMS|not sent|generated/i.test(otp));
check('OTP screen does not claim delivery', !/\bsent to\b|\bwe (have )?sent\b|\btexted\b/i.test(otp), otp.match(/[^\n]*sent[^\n]*/i)?.[0] || '');

// --- signed-in screens ------------------------------------------------------
await signIn();
const home = await page.innerText('body');
check('sign-in reaches home', /available balance/i.test(home));
check('home names the account', /signed in as/i.test(home));

const claim = page.locator('button:has-text("Claim")');
if (await claim.count()) {
  const label = (await claim.first().innerText()).trim();
  const disabled = await claim.first().isDisabled();
  check('claim control matches its state', disabled === /claimed/i.test(label), `"${label}" disabled=${disabled}`);
}

await visit('/games');
const catalog = await page.innerText('body');
check('catalog lists playable titles', /crash/i.test(catalog) && /dice/i.test(catalog) && /slots/i.test(catalog));

for (const slug of ['crash', 'dice', 'slots']) {
  await visit(`/game/${slug}`);
  await page.waitForTimeout(700);
  const text = await page.innerText('body');
  check(`${slug} renders controls`, (await page.$$('input')).length > 0 && /play/i.test(text));
}

await visit('/game/live-casino');
await page.waitForTimeout(800);
const blocked = await page.innerText('body');
check('blocked title is labelled, not faked', /not available|placeholder|no game code/i.test(blocked));

// --- a real round moves the ledger -----------------------------------------
await visit('/home');
const balanceBefore = Number((await page.innerText('body')).match(/([\d,]+)PHP/)?.[1].replace(/,/g, '') || 0);
await visit('/game/crash');
await page.fill('input[aria-label="Stake"]', '50');
await page.click('button:has-text("Play")');
await page.waitForTimeout(2500);
await visit('/home');
const after = await page.innerText('body');
const balanceAfter = Number(after.match(/([\d,]+)PHP/)?.[1].replace(/,/g, '') || 0);
check('a round changes the balance', balanceAfter !== balanceBefore, `${balanceBefore} -> ${balanceAfter}`);
check('stats count the round', /[1-9]\d*\s*rounds played/i.test(after));
check('history is no longer empty', !/no rounds yet/i.test(after));

await visit('/notifications');
check('notifications render', /notification|alert|no notifications/i.test(await page.innerText('body')));

await visit('/profile');
check('profile renders', /sign out|log out/i.test(await page.innerText('body')));

await browser.close();

for (const r of results) console.log(`${r.ok ? 'PASS' : 'FAIL'}  ${r.name}${r.detail ? ' — ' + r.detail : ''}`);
if (pageErrors.length) console.log('page errors:', pageErrors);
const failed = results.filter((r) => !r.ok).length;
console.log(`\npassed: ${results.length - failed}, failed: ${failed}`);
process.exit(failed || pageErrors.length ? 1 : 0);
