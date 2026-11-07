/**
 * bridge.js — the whole `@JavascriptInterface` surface of the APK, re-implemented for the web.
 *
 * Original interfaces (all added in yg.k()):
 *   window.Android      -> defpackage/gs0.java (+ ig.java for googleLogin)
 *   window.JSInterface  -> defpackage/qg.java
 *   window.LaunchOpen   -> defpackage/ug.java
 *   window.LaunchClose  -> defpackage/tg.java
 *   window.Color        -> defpackage/rg.java
 *   window.LogOpen      -> defpackage/wg.java
 *   window.LogClose     -> defpackage/vg.java
 *   window.LogTest      -> defpackage/xg.java
 *
 * Also injected after every page load, like jg.onPageFinished() does:
 *   navigator.clipboard.writeText/readText -> window.Android.copyToClipboard/pasteFromClipboard
 *
 * Same-origin pages (the default: web/m/index.html) get these objects defined directly on their
 * window. Cross-origin pages cannot be reached from JS (browser security), so a postMessage
 * relay is offered instead — see docs/RECONSTRUCTION_NOTES.md §"bridge".
 */

import { cacheKeys } from './storage.js';
import { savePictureBase64, downloadTextFile, downloadText } from './downloads.js';
import { showToast } from './toast.js';
import { t } from './i18n.js';

const CLIPBOARD_CACHE = { text: '' };

function parseJsonObject(raw) {
  if (raw === null || raw === undefined || raw === '') return {};
  if (typeof raw === 'object') return raw;
  try {
    const parsed = JSON.parse(String(raw));
    return parsed && typeof parsed === 'object' ? parsed : {};
  } catch (_) {
    return {};
  }
}

/** gs0.a(String): JSON -> Bundle, ignoring unsupported value types. */
function jsonToParams(raw) {
  const obj = parseJsonObject(raw);
  const out = {};
  for (const [key, value] of Object.entries(obj)) {
    if (typeof value === 'string' || typeof value === 'number' || typeof value === 'boolean') {
      out[key] = value;
    }
  }
  return out;
}

function callPageCallback(win, callbackName, payload) {
  if (!callbackName || !win) return;
  const name = String(callbackName).replace(/[^A-Za-z0-9_$.]/g, '');
  if (!name) return;
  const fn = name.split('.').reduce((obj, part) => (obj == null ? obj : obj[part]), win);
  if (typeof fn === 'function') {
    try {
      fn.call(win, payload);
    } catch (err) {
      console.warn(`[bridge] callback ${name} threw`, err);
    }
  } else {
    // The APK would evaluate `window.<callback>(...)`; a missing function is silently ignored.
    console.warn(`[bridge] callback ${name} is not defined`);
  }
}

async function copyText(text) {
  const value = String(text ?? '');
  CLIPBOARD_CACHE.text = value;
  try {
    if (navigator.clipboard?.writeText) {
      await navigator.clipboard.writeText(value);
      return true;
    }
  } catch (_) {
    /* fall through to execCommand */
  }
  try {
    const ta = document.createElement('textarea');
    ta.value = value;
    ta.setAttribute('readonly', 'readonly');
    ta.style.position = 'fixed';
    ta.style.opacity = '0';
    document.body.appendChild(ta);
    ta.select();
    const ok = document.execCommand('copy');
    ta.remove();
    return ok;
  } catch (_) {
    return false;
  }
}

async function readClipboardIntoCache() {
  try {
    if (navigator.clipboard?.readText) {
      CLIPBOARD_CACHE.text = await navigator.clipboard.readText();
    }
  } catch (_) {
    /* permission denied — keep the cached value */
  }
  return CLIPBOARD_CACHE.text;
}

function fcmUnavailableMessage() {
  return 'FCM is not available in the web build (no Firebase credentials)';
}

/**
 * @param {object} ctx
 * @param {object} ctx.prefs
 * @param {object} ctx.config              merged manifest config
 * @param {string} ctx.deviceId
 * @param {string} ctx.gaid
 * @param {object} ctx.logger              debug-log instance
 * @param {(name:string, params:object, channels:string[])=>void} ctx.trackEvent
 * @param {(level:string,message:string)=>void} ctx.sendLog
 * @param {(url:string)=>void} ctx.openInWebView
 * @param {()=>void} ctx.closeWebView
 * @param {()=>void} ctx.hideLoading
 * @param {(dataUrl:string)=>void} [ctx.onBase64]
 */
export function createBridge(ctx) {
  const {
    prefs,
    config,
    deviceId,
    gaid,
    logger,
    trackEvent = () => {},
    sendLog = () => {},
    openInWebView = () => {},
    closeWebView = () => {},
    hideLoading = () => {},
  } = ctx;

  const jsKeys = cacheKeys(config.merchant);

  /** window.Android */
  const Android = {
    appFlyerLogEvent(eventName, jsonString) {
      trackEvent(String(eventName ?? ''), jsonToParams(jsonString), ['appsflyer']);
    },
    canSendPushNotifications() {
      return typeof Notification !== 'undefined' && Notification.permission === 'granted';
    },
    closeApp() {
      // finishAffinity() + moveTaskToBack(true)
      try {
        window.close();
      } catch (_) {
        /* ignored */
      }
      setTimeout(() => {
        if (!window.closed) history.length > 1 ? history.back() : window.location.reload();
      }, 120);
    },
    closeWebView() {
      closeWebView();
    },
    copyToClipboard(text) {
      copyText(text);
    },
    eventTracker(eventName, jsonString) {
      const name = String(eventName ?? '');
      const params = jsonToParams(jsonString);
      const channels = ['firebase', 'appsflyer'];
      if (name === 'register') channels.push('openinstall');
      if (config.snowBallAppId && config.snowBallAppId !== '0') channels.push('snowball');
      trackEvent(name, params, channels);
    },
    facebookLogin(callbackName) {
      // Facebook SDK login needs an app id/secret that is not part of this repository.
      callPageCallback(currentWindow(), callbackName, 'Failure: Facebook login is not available in the web build');
      sendLog('warn', 'facebookLogin: provider not configured');
    },
    generateFcmToken(callbackName) {
      callPageCallback(currentWindow(), callbackName, `Failure: ${fcmUnavailableMessage()}`);
    },
    getFcmToken(callbackName) {
      callPageCallback(currentWindow(), callbackName, `Failure: ${fcmUnavailableMessage()}`);
      Android.requestPushPermission();
    },
    getVersion() {
      return String(config.version);
    },
    googleLogin(callbackName) {
      callPageCallback(currentWindow(), callbackName, 'Failure: Google sign-in is not available in the web build');
      sendLog('warn', 'googleLogin: provider not configured');
    },
    lineSdkLogin(arg, callbackName) {
      callPageCallback(currentWindow(), callbackName, 'Failure: LINE login is not available in the web build');
      sendLog('warn', `lineSdkLogin(${arg}): provider not configured`);
    },
    nativeShare(title, text) {
      const payload = { title: String(title ?? ''), text: String(text ?? '') };
      if (navigator.share) {
        navigator.share(payload).catch(() => {});
        return;
      }
      copyText(payload.text || payload.title).then((ok) => {
        if (ok) showToast(t('copy_toast_msg'));
      });
    },
    oauthLogin(provider, callbackName) {
      callPageCallback(currentWindow(), callbackName, `Failure: oauth provider ${provider} is not configured`);
      sendLog('warn', `oauthLogin(${provider}): provider not configured`);
    },
    openAndroid(uri) {
      // Intent.parseUri(str, 1) + BROWSABLE + startActivity()
      const raw = String(uri ?? '');
      try {
        const url = new URL(raw, location.href);
        if (url.protocol === 'http:' || url.protocol === 'https:') {
          window.open(url.toString(), '_blank', 'noopener');
          return;
        }
        // Custom schemes (tel:, mailto:, market:, whatsapp:) — the browser decides.
        window.location.href = url.toString();
      } catch (_) {
        showToast('Invalid URI');
      }
    },
    openWebView(url) {
      openInWebView(String(url ?? ''));
    },
    pasteFromClipboard() {
      // Clipboard reads are asynchronous in the browser while the Android API is synchronous,
      // so the last known value is returned and a refresh is scheduled for the next call.
      readClipboardIntoCache();
      return CLIPBOARD_CACHE.text;
    },
    receiveBase64FromBlob(data) {
      const value = String(data ?? '');
      if (value.includes('image')) {
        savePictureBase64(value);
      } else {
        downloadTextFile(value);
      }
    },
    requestPushPermission() {
      requestPushPermission();
    },
    storageGetItem(key) {
      return prefs.getString(`JS_${String(key ?? '')}`, '');
    },
    storageRemoveItem(key) {
      prefs.remove(`JS_${String(key ?? '')}`);
    },
    storageSetItem(key, value) {
      prefs.putString(`JS_${String(key ?? '')}`, String(value ?? ''));
    },
    supportFCM() {
      return typeof Notification !== 'undefined' && 'serviceWorker' in navigator;
    },
  };

  /** window.JSInterface — qg.java */
  const JSInterface = {
    clearCache(jsToRun) {
      clearCaches();
      showToast(t('cleanCache'));
      if (typeof jsToRun === 'string' && jsToRun.length) {
        try {
          currentWindow()?.eval(jsToRun); // original: evaluateJavascript("javascript:" + str)
        } catch (err) {
          sendLog('warn', `clearCache eval failed: ${err}`);
        }
      }
    },
  };

  /** window.LaunchOpen — ug.java (inferred: reveal the loaded page / dismiss the launch layer) */
  const LaunchOpen = {
    Open() {
      hideLoading();
    },
  };

  /** window.LaunchClose — tg.java (inferred: close the shell, optionally after a delay) */
  const LaunchClose = {
    Close(delayMs) {
      const delay = Number(delayMs) || 0;
      if (delay > 0) setTimeout(() => closeWebView(), delay);
      else setTimeout(() => closeWebView(), 500);
    },
  };

  /** window.Color — rg.java */
  const Color = {
    setColors(jsonString) {
      const colors = parseJsonObject(jsonString);
      const root = document.documentElement;
      const mapping = {
        colorbar: '--colorbar',
        statusBar: '--colorbar',
        statusBarColor: '--colorbar',
        background: '--content-bg',
        backgroundColor: '--content-bg',
        accent: '--color-accent',
        colorAccent: '--color-accent',
      };
      for (const [key, value] of Object.entries(colors)) {
        const cssVar = mapping[key];
        if (cssVar && typeof value === 'string' && /^#([0-9a-f]{3,8})$/i.test(value.trim())) {
          root.style.setProperty(cssVar, value.trim());
          if (cssVar === '--colorbar') {
            document.querySelector('meta[name="theme-color"]')?.setAttribute('content', value.trim());
            document.body.style.background = value.trim();
          }
        }
      }
      sendLog('info', `Color.setColors(${JSON.stringify(colors)})`);
    },
  };

  /** window.LogOpen / LogClose / LogTest — wg.java / vg.java / xg.java */
  const LogOpen = { Open: () => logger?.setVisible(true) };
  const LogClose = { Close: () => logger?.setVisible(false) };
  const LogTest = {
    setText(str) {
      logger?.setVisible(true);
      const el = document.getElementById('webviewtext');
      if (el) el.textContent = String(str ?? '');
    },
  };

  let activeWindow = null;

  function currentWindow() {
    return activeWindow;
  }

  async function requestPushPermission() {
    if (typeof Notification === 'undefined') {
      showToast('Push notifications are not supported in this browser');
      return false;
    }
    if (Notification.permission === 'granted') return true;
    if (Notification.permission === 'denied') {
      // Android mirrors this by sending the user to the app settings screen.
      showToast(t('request_push_permission'));
      return false;
    }
    try {
      const permission = await Notification.requestPermission();
      return permission === 'granted';
    } catch (_) {
      return false;
    }
  }

  async function clearCaches() {
    // qg.clearCache(): WebView cache, cookie store, app cache dir + the three shell preference
    // entries that mirror the resolution cache.
    try {
      prefs.putString(jsKeys.lastUrl, '');
      prefs.putLong(jsKeys.lastUrlAccess, -1);
    } catch (_) {
      /* ignore */
    }
    try {
      if (globalThis.caches) {
        const names = await caches.keys();
        await Promise.all(names.map((name) => caches.delete(name)));
      }
    } catch (_) {
      /* ignore */
    }
  }

  const surfaces = { Android, JSInterface, LaunchOpen, LaunchClose, Color, LogOpen, LogClose, LogTest };

  /** Injects every interface onto a same-origin window (equivalent of addJavascriptInterface). */
  function install(win) {
    if (!win) return false;
    activeWindow = win;
    try {
      for (const [name, value] of Object.entries(surfaces)) {
        Object.defineProperty(win, name, { value, writable: true, configurable: true, enumerable: true });
      }
      installClipboardOverride(win);
      // Signal availability to page scripts (pure web addition, harmless for compatibility).
      try {
        win.dispatchEvent(new win.Event('sige77:bridge-ready'));
      } catch (_) {
        /* ignore */
      }
      return true;
    } catch (err) {
      sendLog('warn', `bridge install failed: ${err}`);
      return false;
    }
  }

  /** jg.onPageFinished(): navigator.clipboard override routed through the bridge. */
  function installClipboardOverride(win) {
    try {
      Object.defineProperty(win.navigator, 'clipboard', {
        value: {
          writeText(text) {
            return new Promise((resolve, reject) => {
              try {
                copyText(text).then((ok) => (ok ? resolve() : reject(new Error('copy failed'))));
              } catch (err) {
                reject(err);
              }
            });
          },
          readText() {
            return new Promise((resolve, reject) => {
              try {
                resolve(Android.pasteFromClipboard());
              } catch (err) {
                reject(err);
              }
            });
          },
        },
        writable: true,
        configurable: true,
      });
    } catch (_) {
      /* not fatal */
    }
  }

  /**
   * Cross-origin relay. Pages that cannot be injected can post:
   *   {type:'sige77:call', id, target:'Android', method:'getVersion', args:[]}
   * and receive {type:'sige77:result', id, value} back. The message source is validated against
   * the shell's iframe so unrelated frames cannot drive the bridge.
   */
  function handleMessage(event, iframeEl) {
    if (!iframeEl || event.source !== iframeEl.contentWindow) return;
    const data = event.data;
    if (!data || typeof data !== 'object' || data.type !== 'sige77:call') return;
    const surface = surfaces[String(data.target)];
    const method = surface && surface[String(data.method)];
    if (typeof method !== 'function') {
      iframeEl.contentWindow?.postMessage(
        { type: 'sige77:result', id: data.id, error: `unknown method ${data.target}.${data.method}` },
        '*',
      );
      return;
    }
    try {
      const value = method.apply(surface, Array.isArray(data.args) ? data.args : []);
      iframeEl.contentWindow?.postMessage({ type: 'sige77:result', id: data.id, value }, '*');
    } catch (err) {
      iframeEl.contentWindow?.postMessage({ type: 'sige77:result', id: data.id, error: String(err) }, '*');
    }
  }

  return { surfaces, install, handleMessage, clearCaches, requestPushPermission, copyText, downloadText };
}
