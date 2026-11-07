/**
 * harness.js — behaviour of the embedded-content harness (see harness/index.html).
 *
 * This script is the counterpart of the proprietary page that the real APK loads: it consumes
 * exactly the contract the shell exposes — the attribution query parameters and the
 * `window.Android` / `window.JSInterface` / `Launch*` / `Color` / `Log*` interfaces.
 *
 * When the harness runs same-origin the shell injects the interfaces directly. When it is opened
 * elsewhere (cross-origin), a small postMessage relay keeps the calls working, mirroring the
 * documented web limitation of @JavascriptInterface.
 */

const ATTRIBUTION_KEYS = ['affiliateCode', 'fbPixelId', 'tid', 'gaid', 'snowBallAppId'];
const SURFACES = ['Android', 'JSInterface', 'LaunchOpen', 'LaunchClose', 'Color', 'LogOpen', 'LogClose', 'LogTest'];

const params = new URLSearchParams(location.search);
const resultEl = document.getElementById('result');

// The shell injects the interfaces on the iframe's `load` event, which fires *after* this
// module has executed, so availability must be read lazily on every use.
const directBridge = () => typeof window.Android !== 'undefined';

function showResult(text) {
  const stamp = new Date().toISOString().substring(11, 19);
  resultEl.textContent = `${stamp} ${text}`;
}

/* ------------------------------------------------------------------ relay ------ */

let relaySeq = 0;
const relayPending = new Map();

window.addEventListener('message', (event) => {
  const data = event.data;
  if (!data || data.type !== 'sige77:result' || event.source !== window.parent) return;
  const entry = relayPending.get(data.id);
  if (!entry) return;
  relayPending.delete(data.id);
  if (data.error) entry.reject(new Error(data.error));
  else entry.resolve(data.value);
});

function relayCall(target, method, args) {
  return new Promise((resolve, reject) => {
    const id = `relay-${++relaySeq}`;
    relayPending.set(id, { resolve, reject });
    window.parent.postMessage({ type: 'sige77:call', id, target, method, args }, '*');
    setTimeout(() => {
      if (relayPending.delete(id)) reject(new Error('relay timeout'));
    }, 3000);
  });
}

async function call(target, method, ...args) {
  if (window[target] && typeof window[target][method] === 'function') {
    const value = window[target][method](...args);
    return value && typeof value.then === 'function' ? await value : value;
  }
  return relayCall(target, method, args);
}

/* --------------------------------------------------------- attribution table --- */

function renderParams() {
  const table = document.getElementById('params');
  const rows = [];
  const push = (label, value, note = '') => {
    const missing = value === null || value === undefined || value === '';
    rows.push(
      `<tr><th>${label}${note ? `<br /><span class="hint">${note}</span>` : ''}</th>` +
        `<td class="${missing ? 'empty' : ''}">${missing ? 'not present' : escapeHtml(value)}</td></tr>`,
    );
  };
  ATTRIBUTION_KEYS.forEach((key) => push(key, params.get(key), 'X5_Activity.E'));
  push('document URL', location.origin + location.pathname);
  push('query string', location.search.replace(/^\?/, ''));
  push('is /m/index.html path', location.pathname.endsWith('/m/index.html') ? 'yes' : 'no', 'appended when isSingleLine = 0');
  table.innerHTML = rows.join('');
}

function escapeHtml(value) {
  return String(value).replace(/[&<>"']/g, (c) => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));
}

/* ----------------------------------------------------------------- bridge UI --- */

function renderBridgeState() {
  const list = document.getElementById('bridgeList');
  const state = document.getElementById('bridgeState');
  list.innerHTML = SURFACES.map((name) => {
    const present = typeof window[name] !== 'undefined';
    return `<span class="${present ? 'ok' : 'missing'}">${name}${present ? '' : ' — relay'}</span>`;
  }).join('');

  const androidMethods = directBridge() ? Object.keys(window.Android).length : 0;
  state.textContent = directBridge()
    ? `Direct injection available — ${androidMethods} methods on window.Android.`
    : 'Direct injection unavailable (cross-origin); calls are relayed with postMessage.';
}

/* ------------------------------------------------------------- action buttons --- */

let callbackSeq = 0;

function callbackInvoker(name, method, ...args) {
  const cbName = `__bridge_cb_${++callbackSeq}`;
  window[cbName] = (value) => {
    showResult(`${name} -> callback(${JSON.stringify(value)})`);
    delete window[cbName];
  };
  Promise.resolve(call('Android', method, ...args, cbName)).catch((err) => showResult(`${name} failed: ${err.message}`));
  showResult(`${name} invoked, waiting for ${cbName}…`);
}

const ACTIONS = [
  ['Android.getVersion()', async () => showResult(`getVersion() = ${await call('Android', 'getVersion')}`)],
  [
    'Android.storageSetItem()',
    async () => {
      await call('Android', 'storageSetItem', 'demo', `value-${Date.now()}`);
      showResult('storageSetItem("demo", …) ok');
    },
  ],
  [
    'Android.storageGetItem()',
    async () => showResult(`storageGetItem("demo") = ${await call('Android', 'storageGetItem', 'demo')}`),
  ],
  [
    'Android.storageRemoveItem()',
    async () => {
      await call('Android', 'storageRemoveItem', 'demo');
      showResult('storageRemoveItem("demo") ok');
    },
  ],
  [
    'Android.copyToClipboard()',
    async () => {
      await call('Android', 'copyToClipboard', 'Sige77 clipboard demo');
      showResult('copyToClipboard(text) ok');
    },
  ],
  ['Android.pasteFromClipboard()', async () => showResult(`pasteFromClipboard() = ${await call('Android', 'pasteFromClipboard')}`)],
  [
    'Android.nativeShare()',
    async () => {
      await call('Android', 'nativeShare', 'Sige77', 'Shared from the reconstructed shell');
      showResult('nativeShare(title, text) ok');
    },
  ],
  ['Android.canSendPushNotifications()', async () => showResult(`canSendPushNotifications() = ${await call('Android', 'canSendPushNotifications')}`)],
  ['Android.supportFCM()', async () => showResult(`supportFCM() = ${await call('Android', 'supportFCM')}`)],
  [
    'Android.requestPushPermission()',
    async () => {
      await call('Android', 'requestPushPermission');
      showResult(`requestPushPermission() -> ${await call('Android', 'canSendPushNotifications')}`);
    },
  ],
  [
    "Android.eventTracker('register')",
    async () => {
      await call('Android', 'eventTracker', 'register', JSON.stringify({ value: 10, currency: 'PHP', source: 'harness' }));
      showResult('eventTracker("register", {...}) ok');
    },
  ],
  [
    "Android.appFlyerLogEvent()",
    async () => {
      await call('Android', 'appFlyerLogEvent', 'af_demo', JSON.stringify({ a: 1 }));
      showResult('appFlyerLogEvent("af_demo", {...}) ok');
    },
  ],
  ['Android.getFcmToken(cb)', () => callbackInvoker('getFcmToken', 'getFcmToken')],
  ['Android.generateFcmToken(cb)', () => callbackInvoker('generateFcmToken', 'generateFcmToken')],
  ['Android.googleLogin(cb)', () => callbackInvoker('googleLogin', 'googleLogin')],
  ['Android.facebookLogin(cb)', () => callbackInvoker('facebookLogin', 'facebookLogin')],
  ["Android.lineSdkLogin(cb)", () => callbackInvoker('lineSdkLogin', 'lineSdkLogin', 'channel-id')],
  ["Android.oauthLogin('google.com')", () => callbackInvoker('oauthLogin', 'oauthLogin', 'google.com')],
  [
    'Android.openAndroid()',
    async () => {
      await call('Android', 'openAndroid', 'https://example.com/');
      showResult('openAndroid(uri) ok');
    },
  ],
  [
    'Android.openWebView()',
    async () => {
      await call('Android', 'openWebView', location.href);
      showResult('openWebView(url) ok');
    },
  ],
  [
    'Android.receiveBase64FromBlob(image)',
    async () => {
      const canvas = document.createElement('canvas');
      canvas.width = 64;
      canvas.height = 64;
      const ctx = canvas.getContext('2d');
      ctx.fillStyle = '#0b62d6';
      ctx.fillRect(0, 0, 64, 64);
      ctx.fillStyle = '#fff';
      ctx.font = 'bold 24px sans-serif';
      ctx.fillText('77', 16, 42);
      await call('Android', 'receiveBase64FromBlob', canvas.toDataURL('image/png'));
      showResult('receiveBase64FromBlob(image/png) ok — image saved');
    },
  ],
  [
    'JSInterface.clearCache()',
    async () => {
      await call('JSInterface', 'clearCache');
      showResult('clearCache() ok');
    },
  ],
  ['LaunchOpen.Open()', async () => { await call('LaunchOpen', 'Open'); showResult('LaunchOpen.Open() ok'); }],
  [
    "Color.setColors('{\"colorbar\":\"#112233\"}')",
    async () => {
      await call('Color', 'setColors', JSON.stringify({ colorbar: '#112233' }));
      showResult('Color.setColors({colorbar:"#112233"}) ok');
    },
  ],
  ['LogOpen.Open()', async () => { await call('LogOpen', 'Open'); showResult('LogOpen.Open() ok'); }],
  [
    "LogTest.setText('hello from site')",
    async () => {
      await call('LogTest', 'setText', 'hello from site');
      showResult('LogTest.setText(text) ok');
    },
  ],
  ['LogClose.Close()', async () => { await call('LogClose', 'Close'); showResult('LogClose.Close() ok'); }],
  ['Android.closeWebView()', async () => { await call('Android', 'closeWebView'); }],
  ['Android.closeApp()', async () => { await call('Android', 'closeApp'); }],
];

function renderActions() {
  const host = document.getElementById('actions');
  host.innerHTML = '';
  ACTIONS.forEach(([label, handler]) => {
    const btn = document.createElement('button');
    btn.type = 'button';
    btn.textContent = label;
    btn.addEventListener('click', () => {
      Promise.resolve(handler()).catch((err) => showResult(`${label} failed: ${err.message}`));
    });
    host.appendChild(btn);
  });
}

/* ------------------------------------------------------------------ downloads -- */

function wireDownloads() {
  document.getElementById('blobDownload')?.addEventListener('click', () => {
    const blob = new Blob([`Sige77 harness export\n${new Date().toISOString()}\n${location.href}\n`], {
      type: 'text/plain',
    });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = 'harness-export.txt';
    document.body.appendChild(a);
    a.click();
    a.remove();
    setTimeout(() => URL.revokeObjectURL(url), 10000);
    showResult('blob export triggered');
  });

  const uploadInput = document.getElementById('uploadInput');
  uploadInput?.addEventListener('change', () => {
    const files = Array.from(uploadInput.files || []);
    document.getElementById('uploadResult').textContent = files.length
      ? `selected: ${files.map((f) => `${f.name} (${f.size} B)`).join(', ')}`
      : 'no file selected';
    showResult(`file input change: ${files.length} file(s)`);
  });

  document.getElementById('textDownload')?.addEventListener('click', async () => {
    const payload = `U2lnZTc3IGhhcm5lc3MgdGV4dCBwYXlsb2Fk\n${btoa(`Sige77 harness\n${Date.now()}`)}`;
    await call('Android', 'receiveBase64FromBlob', payload);
    showResult('receiveBase64FromBlob(text) ok — text file downloaded');
  });
}

/* ---------------------------------------------------------------------- init -- */

renderParams();
renderActions();
renderBridgeState();
wireDownloads();
showResult(directBridge() ? 'bridge ready (direct)' : 'bridge ready (relay)');
window.addEventListener('sige77:bridge-ready', renderBridgeState);
