/**
 * app.js — shell boot sequence.
 *
 * This file is the web equivalent of `X5_Activity.onCreate()` + `yg.onCreate()`; the pieces it
 * orchestrates live in the sibling modules:
 *
 *   AppTestApp.onCreate()  -> app-config.js + device.js + storage.js + sw.js (cache)
 *   X5_Activity.onCreate() -> cache fast-path, resolver invocation, URL decoration, loading UI
 *   yg.onCreate()/k()      -> webview.js + bridge.js + loading-dialog.js
 *   yg.onProgressChanged   -> mg.java equivalent inside webview.js callbacks
 *   yg.onKeyDown(BACK)     -> history guard + confirmExit()
 *   X5_Activity.p(z)       -> handleLoadSuccess() / handleLoadFailure()
 *   X5_Activity.F()        -> showRouteFailure(trackId)
 *
 * No framework is used: the shell must stay deployable on plain PHP hosting.
 */

import { MANIFEST, mergeRemoteConfig } from './app-config.js';
import { getPrefs, cacheKeys } from './storage.js';
import { getAdvertisingId, getDeviceId, buildUserAgent } from './device.js';
import { decorateUrl, normaliseHost } from './app-url.js';
import { createResolver, fetchRouteJson } from './domain-route.js';
import { makeTrackId } from './track-id.js';
import { createLoadingDialog } from './loading-dialog.js';
import { createBridge } from './bridge.js';
import { createWebView } from './webview.js';
import { createDebugLog } from './debug-log.js';
import { showToast } from './toast.js';
import { confirmExit, showImageMenu, showRouteFailure, showJsAlert, showUploadChooser } from './dialogs.js';
import { handleDownloadStart, downloadImageFromUrl, savePictureBase64 } from './downloads.js';
import { getJson, postJson } from './net.js';
import { STRINGS, t } from './i18n.js';

const API_BASE = 'api';

const state = {
  config: MANIFEST,
  prefs: null,
  deviceId: '',
  gaid: '',
  loadingDialog: null,
  logger: null,
  bridge: null,
  webview: null,
  resolver: null,
  resolving: false,
  /** yg.n0 — true when the last page load failed (error / hijack / http error). */
  pageFailed: false,
  /** X5_Activity.V0 — guards the single success/failure transition. */
  handled: false,
  lastUrl: '',
};

/* ------------------------------------------------------------------ utilities */

function hideSplash() {
  // The element is kept in the DOM (hidden) — the Android window background is likewise still
  // present behind the content, and keeping it allows the splash to be re-shown/inspected.
  document.getElementById('splash')?.classList.add('hidden');
}

function showLoadingOverlay(visible) {
  const loading = document.getElementById('loading');
  if (!loading) return;
  loading.classList.toggle('hidden', !visible);
}

function registerServiceWorker() {
  if (!('serviceWorker' in navigator)) return;
  navigator.serviceWorker.register('sw.js').catch((err) => {
    state.logger?.log('warn', `service worker registration failed: ${err}`);
  });
}

async function loadConfig() {
  try {
    const remote = await getJson(`${API_BASE}/app/config`, { timeoutMs: 2500 });
    if (remote && remote.success && remote.value) {
      state.config = mergeRemoteConfig(MANIFEST, remote.value);
      return;
    }
  } catch (err) {
    state.logger?.log('warn', `app config unavailable, using compiled manifest copy: ${err}`);
  }
  state.config = MANIFEST;
}

function api(deviceQuery = true) {
  const suffix = deviceQuery && state.deviceId ? `?device_id=${encodeURIComponent(state.deviceId)}` : '';
  return {
    config: `${API_BASE}/app/config`,
    device: `${API_BASE}/device/register`,
    session: `${API_BASE}/session`,
    event: `${API_BASE}/collect/event`,
    log: `${API_BASE}/log`,
    domainReport: `${API_BASE}/domain/report`,
    blacklist: `${API_BASE}/blacklist`,
    push: `${API_BASE}/push/subscribe`,
    health: `${API_BASE}/health${suffix}`,
  };
}

function trackEvent(name, params, channels) {
  postJson(api().event, {
    device_id: state.deviceId,
    name,
    params: params || {},
    channels: channels || [],
  }).catch((err) => state.logger?.log('warn', `event ${name} failed: ${err}`));
}

function sendLog(entries) {
  postJson(api().log, { device_id: state.deviceId, entries }).catch(() => {});
}

function reportSession(payload) {
  postJson(api().session, { device_id: state.deviceId, ...payload }).catch(() => {});
}

/* ------------------------------------------------------------- load lifecycle */

/** `p(boolean success)` of X5_Activity, split into its two branches for readability. */
function handleLoadSuccess() {
  if (state.handled) return;
  state.handled = true;
  state.loadingDialog.setDismissDelay(2); // mz0.j = 2 in X5_Activity.p
  showLoadingOverlay(false);
  state.loadingDialog.showSuccess(STRINGS.loading_ring_succeed);
  showToast(t('find_fastest_route'));
  // AppTestApp.onConfigurationChanged-equivalent: the status bar stays black (colorbar).
  document.body.style.background = 'var(--colorbar)';
}

function handleLoadFailure(reason) {
  if (state.handled) return;
  state.handled = true;
  showLoadingOverlay(false);
  state.loadingDialog.cancel();
  const trackId = makeTrackId(state.deviceId);
  state.logger?.log('warn', `load failed (${reason || 'unknown'}), trackId ${trackId}`);
  showRouteFailure(trackId, reason || t('no_network')).then((choice) => {
    if (choice === 'retry') startResolution({ force: true });
  });
}

/* ----------------------------------------------------------------- resolution */

/** Adds `gaid` etc. exactly like X5_Activity.E(url, gaid). */
function decorate(host) {
  const cfg = state.config;
  return decorateUrl(host, {
    isSingleLine: !!cfg.isSingleLine,
    affiliateCode: cfg.affiliateCode,
    fbPixelId: cfg.fbPixelId,
    tid: cfg.tid,
    gaid: state.gaid,
    snowBallAppId: cfg.snowBallAppId,
  });
}

function loadUrl(url) {
  state.pageFailed = false;
  state.handled = false;
  state.lastUrl = url;
  state.loadingDialog.show('ring', t('mloading_dialog'));
  showLoadingOverlay(true);
  state.webview.load(url);
}

/**
 * X5_Activity.onCreate() cache fast-path:
 *   if the cached last URL exists and its access timestamp is < 24h old, load it directly.
 */
function tryCachedLastUrl() {
  const keys = cacheKeys(state.config.merchant);
  const cached = state.prefs.getString(keys.lastUrl, '');
  if (!cached) return false;
  const accessed = state.prefs.getLong(keys.lastUrlAccess, -1);
  const expired = accessed === -1 || Date.now() - accessed >= state.config.resolver.lastUrlTtlMs;
  if (expired) {
    state.logger?.log('info', 'Cached last url expired');
    return false;
  }
  state.logger?.log('info', `Load cached last url: ${cached}`);
  loadUrl(decorate(cached));
  return true;
}

async function startResolution({ force = false } = {}) {
  if (state.resolving) return;
  state.resolving = true;
  state.handled = false;
  state.pageFailed = false;
  state.loadingDialog.show('ring', t('mloading_dialog'));
  showLoadingOverlay(true);
  showToast(t('tip_speed_test')); // X5_Activity.D()
  const started = Date.now();

  try {
    const result = await state.resolver.resolve({ allowBackupFallback: true });
    state.resolving = false;

    if (!result || !result.host) {
      state.logger?.log('warn', `domain route not found (${result?.error || 'unknown'})`);
      handleLoadFailure(t('domain_route_not_found'));
      return;
    }

    const url = decorate(result.host);
    state.logger?.log('info', `Resolved ${normaliseHost(result.host)} via ${result.path}`);
    reportSession({
      resolved_host: normaliseHost(result.host),
      resolution_ms: Date.now() - started,
      resolver_path: result.path,
      forced: !!force,
    });
    loadUrl(url);
  } catch (err) {
    state.resolving = false;
    state.logger?.log('error', `resolution failed: ${err}`);
    handleLoadFailure(t('domain_route_not_found'));
  }
}

/* ----------------------------------------------------------------- bootstrap */

async function boot() {
  state.prefs = getPrefs();
  state.deviceId = getDeviceId(state.prefs);
  state.logger = createDebugLog({ sendLog });
  state.logger.log('info', `AppShellVer ${MANIFEST.version} boot, device ${state.deviceId}`);

  await loadConfig();
  const cfg = state.config;
  state.gaid = getAdvertisingId(state.prefs, cfg.merchant);

  const userAgent = buildUserAgent(cfg.version, state.deviceId);
  state.logger.log('info', `applicationId=${MANIFEST.packageName} packageName=${MANIFEST.packageName}`);
  state.logger.log('info', `merchantValue=${cfg.merchant}`);
  state.logger.log('info', `backupDomain=${cfg.backupDomain}`);
  state.logger.log('info', `affiliateCode=${cfg.affiliateCode} device=${cfg.device}`);
  state.logger.log('info', `UUID=${state.deviceId}`);
  state.logger.log('info', userAgent);

  // AppTestApp.onCreate(): cache reset when the installed version changed.
  const storedVersion = state.prefs.getString('VERSION', '');
  if (!storedVersion || storedVersion !== cfg.version) {
    state.logger.log('info', `Version changed (${storedVersion || 'none'} -> ${cfg.version}), caches cleared`);
    const keys = cacheKeys(cfg.merchant);
    state.prefs.putJson(keys.domainRoute, []);
    state.prefs.putLong(keys.domainRouteAccess, -1);
  }
  state.prefs.putString('VERSION', cfg.version);

  // Splash image override (SPLASH_URL persisted by the resolver).
  const splashUrl = state.prefs.getString('SPLASH_URL', '');
  if (splashUrl && /^https?:/i.test(splashUrl)) {
    const loading = document.getElementById('loading');
    if (loading) loading.style.backgroundImage = `url("${splashUrl}")`;
  }

  state.loadingDialog = createLoadingDialog();

  state.resolver = createResolver({
    prefs: state.prefs,
    merchant: cfg.merchant,
    seedUrls: cfg.merchantUrls,
    backupDomain: cfg.backupDomain,
    device: cfg.device,
    agentName: cfg.agentName,
    requestRoute: (url, opts) => fetchRouteJson(url, opts),
    log: (level, message) => state.logger.log(level, message),
    onSplash: (url) => {
      const loading = document.getElementById('loading');
      if (loading && /^https?:/i.test(url)) loading.style.backgroundImage = `url("${url}")`;
    },
    onDomainList: (list) => state.logger?.log('info', `domainRoute cached (${list.length})`),
    gaid: () => state.gaid,
  });

  // rm.d(): seed the in-memory/prefs route list from merchant_url when empty.
  if (!state.resolver.readRouteList().length) state.resolver.seedRouteList();

  state.webview = createWebView({
    iframe: document.getElementById('webview'),
    log: (level, message) => state.logger.log(level, message),
    onProgress: (value) => {
      if (value >= 100) return; // handled by onFinish/onError
      state.logger.log('debug', `webview onProgressChanged: ${value}`);
    },
    onFinish: () => {
      if (state.pageFailed) return;
      handleLoadSuccess();
    },
    onError: ({ description }) => {
      state.pageFailed = true;
      state.logger.log('error', `onReceivedError: ${description}`);
      handleLoadFailure(t('no_network'));
    },
    onHttpError: ({ status }) => {
      state.pageFailed = true;
      state.logger.log('error', `onReceivedHttpError: main frame status ${status}`);
      handleLoadFailure(t('no_network'));
    },
    onBlocked: ({ url, status }) => {
      state.pageFailed = true;
      state.resolver.addToBlacklist(new URL(url, location.href).origin);
      postJson(api().blacklist, {
        device_id: state.deviceId,
        url: new URL(url, location.href).origin,
        reason: `hijack:${status || 'keywords'}`,
      }).catch(() => {});
      handleLoadFailure(t('domain_route_not_found'));
    },
    onLongPressImage: async ({ url }) => {
      const choice = await showImageMenu();
      if (choice === 'save') {
        if (url.startsWith('data:')) savePictureBase64(url);
        else downloadImageFromUrl(url);
      } else if (choice === 'copy') {
        await state.bridge.copyText(url);
        showToast(t('copy_toast_msg'));
      }
    },
    onJsAlert: (message) => {
      showJsAlert(message);
    },
    // yg.uploadPicture() -> onShowFileChooser(): camera / album / cancel, equal-weight buttons.
    onFileChooser: async (input) => {
      const choice = await showUploadChooser();
      if (choice !== 'camera' && choice !== 'album') return;
      const files = await state.webview.pickFile(input, choice);
      state.webview.applyFiles(input, files);
    },
  });

  state.bridge = createBridge({
    prefs: state.prefs,
    config: cfg,
    deviceId: state.deviceId,
    gaid: state.gaid,
    logger: state.logger,
    trackEvent,
    sendLog: (level, message) => state.logger.log(level, message),
    openInWebView: (url) => {
      const target = `open-web.html?url=${encodeURIComponent(url)}`;
      const win = window.open(target, '_blank', 'noopener');
      if (!win) showToast('Popup blocked by the browser');
    },
    closeWebView: () => closeShell(),
    hideLoading: () => {
      showLoadingOverlay(false);
      state.loadingDialog.cancel();
    },
  });

  // Bridge injection: same-origin content gets the real objects on `load`;
  // cross-origin content uses the postMessage relay.
  const iframe = document.getElementById('webview');
  iframe.addEventListener('load', () => {
    try {
      const win = iframe.contentWindow;
      const sameOrigin = new URL(iframe.src || 'about:blank', location.href).origin === location.origin;
      if (sameOrigin) {
        state.bridge.install(win);
        state.logger.log('debug', 'bridge installed on page');
      } else {
        state.logger.log('warn', 'cross-origin page: bridge relay only (postMessage)');
      }
    } catch (err) {
      state.logger.log('warn', `bridge injection failed: ${err}`);
    }
  });
  window.addEventListener('message', (event) => state.bridge.handleMessage(event, iframe));

  // DownloadListener equivalent (yg.k()).
  window.addEventListener('sige77:download', (event) => {
    handleDownloadStart(event.detail || {}, { onBase64: (data) => state.bridge.surfaces.Android.receiveBase64FromBlob(data) });
  });

  registerServiceWorker();

  // Device registration (replaces the SDK install callbacks of Adjust/AppsFlyer/OpenInstall).
  postJson(api().device, {
    device_id: state.deviceId,
    gaid: state.gaid,
    user_agent: navigator.userAgent,
    version: cfg.version,
    merchant: cfg.merchant,
  }).catch((err) => state.logger.log('warn', `device registration failed: ${err}`));

  installBackGuard();

  hideSplash();

  // X5_Activity.onCreate(): cached URL first, otherwise resolve.
  // (The cache branch loads the page without the "Trying to find the fastest line" toast —
  //  only D() shows it, and D() runs only when a resolution is started.)
  if (!tryCachedLastUrl()) {
    startResolution();
  }
}

/* --------------------------------------------------------------- shell closing */

let closing = false;

/**
 * Equivalent of `finishAffinity()` + `moveTaskToBack(true)`.
 * A browser tab can only be closed when the script opened it; otherwise the shell hides its
 * content (black screen, same as an app sent to the background) instead of destroying the tab.
 */
function closeShell() {
  if (closing) return;
  closing = true;
  state.logger.log('info', 'closing shell');
  try {
    window.close();
  } catch (_) {
    /* ignored */
  }
  setTimeout(() => {
    if (window.closed || closing === false) return;
    document.body.classList.add('shell-closed');
    try {
      state.webview.stop();
    } catch (_) {
      /* ignored */
    }
  }, 150);
}

/** yg.onKeyDown(BACK): go back inside the page first, otherwise ask to leave. */
function installBackGuard() {
  let exitPending = false;

  async function handleBack() {
    if (state.webview.canGoBack()) {
      state.webview.goBack();
      return;
    }
    if (exitPending) return; // a second BACK press must not stack dialogs
    exitPending = true;
    const choice = await confirmExit();
    exitPending = false;
    if (choice === 'exit') closeShell();
  }

  history.replaceState({ sige77Shell: true }, '');
  window.addEventListener('popstate', () => {
    history.pushState({ sige77Shell: true }, '');
    handleBack();
  });

  // Desktop convenience: Escape behaves like the hardware BACK key.
  window.addEventListener('keydown', (event) => {
    if (event.key === 'Escape' && !event.defaultPrevented) {
      event.preventDefault();
      handleBack();
    }
  });
}

/* --------------------------------------------------------------- start-up guard */

document.addEventListener('DOMContentLoaded', () => {
  boot().catch((err) => {
    console.error(err);
    const loading = document.getElementById('loading');
    if (loading) loading.classList.add('hidden');
    hideSplash();
    showToast(`Startup error: ${err?.message || err}`);
  });
});

// Debug surface for developers and the automated browser checks (not used by the app itself).
window.__SIGE77_SHELL__ = {
  state,
  boot,
  dialogs: { confirmExit, showImageMenu, showRouteFailure, showUploadChooser, showJsAlert },
  showToast,
};
