/**
 * open-web.js — `OpenWebActivity` equivalent.
 *
 * Android behaviour (OpenWebActivity.java + yg flags):
 *   • receives the target in `Intent.getStringExtra("Url")`       -> ?url= query parameter
 *   • B() = false  -> no loading dialog
 *   • l() = true   -> 10s delay before the loading state is reported
 *   • m() = false  -> no fullscreen custom view
 *   • n() = false  -> no offline asset interception
 *   • o() = true   -> zoom controls enabled
 *   • u() = true   -> keep the screen awake
 *   • y() = false  -> no request interception / hijack check
 *   • portrait orientation, floating close button (mipmap close_floating_window, 80dp at 30/190)
 *
 * The bridge (yg.k) is installed here as well, so pages opened through
 * `window.Android.openWebView(url)` keep the same JS API.
 */

import { MANIFEST, mergeRemoteConfig } from './app-config.js';
import { getPrefs } from './storage.js';
import { getAdvertisingId, getDeviceId } from './device.js';
import { createBridge } from './bridge.js';
import { createDebugLog } from './debug-log.js';
import { showToast } from './toast.js';
import { getJson, postJson } from './net.js';
import { t } from './i18n.js';

const params = new URLSearchParams(location.search);
const target = params.get('url') || '';

const prefs = getPrefs();
const deviceId = getDeviceId(prefs);
const logger = createDebugLog({ sendLog: (entries) => postJson('api/log', { device_id: deviceId, entries }).catch(() => {}) });

function closeSelf() {
  window.close();
  setTimeout(() => {
    if (!window.closed) {
      if (history.length > 1) history.back();
      else window.location.replace('about:blank');
    }
  }, 120);
}

async function boot() {
  let config = MANIFEST;
  try {
    const remote = await getJson('api/app/config', { timeoutMs: 2500 });
    if (remote?.success && remote.value) config = mergeRemoteConfig(MANIFEST, remote.value);
  } catch (_) {
    /* compiled defaults */
  }

  const gaid = getAdvertisingId(prefs, config.merchant);
  const iframe = document.getElementById('webview');

  const bridge = createBridge({
    prefs,
    config,
    deviceId,
    gaid,
    logger,
    trackEvent: (name, eventParams, channels) =>
      postJson('api/collect/event', { device_id: deviceId, name, params: eventParams, channels }).catch(() => {}),
    sendLog: (level, message) => logger.log(level, message),
    openInWebView: (url) => window.open(`open-web.html?url=${encodeURIComponent(url)}`, '_blank', 'noopener'),
    closeWebView: () => closeSelf(),
    hideLoading: () => {},
  });

  iframe.addEventListener('load', () => {
    try {
      const sameOrigin = new URL(iframe.src || 'about:blank', location.href).origin === location.origin;
      if (sameOrigin) bridge.install(iframe.contentWindow);
    } catch (err) {
      logger.log('warn', `bridge injection failed: ${err}`);
    }
  });
  window.addEventListener('message', (event) => bridge.handleMessage(event, iframe));

  document.getElementById('openWebClose')?.addEventListener('click', () => closeSelf());

  if (!/^https?:/i.test(target)) {
    logger.log('warn', `openWebView: refusing non-http url "${target}"`);
    showToast('Invalid URL');
    return;
  }

  logger.log('info', `OpenWebActivity url=${target}`);
  iframe.src = target;
}

boot().catch((err) => {
  console.error(err);
  showToast(`Startup error: ${err?.message || err}`);
});
