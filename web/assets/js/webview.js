/**
 * webview.js — WebView container equivalent.
 *
 * Original sources:
 *   yg.k()      : WebSettings, WebViewClient (jg), WebChromeClient (mg), loadUrl(A0)
 *   jg.java     : onPageStarted / onPageFinished / onReceivedError / onReceivedHttpError /
 *                 shouldInterceptRequest (offline assets, HTTP cache, anti-hijack keyword check)
 *   mg.java     : onProgressChanged(100) -> unblock images, `p(!n0)`, Adjust ad-id bridge
 *
 * Web mapping:
 *   <iframe id="webview">            = WebView
 *   iframe.load                      = onPageFinished
 *   iframe load timeout / probe fail = onReceivedError  (errorCode stays below -6 like Chromium)
 *   fetch(url) response status       = onReceivedHttpError (same-origin only)
 *   Service Worker (sw.js)           = shouldInterceptRequest / HTTP cache
 *   contextmenu on images            = setOnLongClickListener (hit test type 5/8)
 *
 * Settings translated: JavaScript enabled (iframe always), DOM storage (native), zoom only when
 * `o()` is true, `loadsImagesAutomatically` model, `mediaPlaybackRequiresUserGesture=false`
 * via the `allow="autoplay"` attribute, mixed content allowed (https page + http iframe is
 * blocked by browsers -> reported as a load error, documented limitation).
 */

const HIJACK_KEYWORDS = ['"root"', 'ucbet', '"brand="'];

export function createWebView(options = {}) {
  const iframe = options.iframe || document.getElementById('webview');
  const {
    onProgress = () => {},
    onFinish = () => {},
    onError = () => {},
    onHttpError = () => {},
    onLongPressImage = () => {},
    onBlocked = () => {},
    onFileChooser = () => {},
    onJsAlert = () => {},
    log = () => {},
    timeoutMs = 15000,
  } = options;

  let currentUrl = '';
  let lastStart = 0;
  let finished = false;
  let timer = null;
  let progressTimer = null;
  let handlersInstalled = false;

  function stopTimers() {
    if (timer) clearTimeout(timer);
    if (progressTimer) clearInterval(progressTimer);
    timer = null;
    progressTimer = null;
  }

  function fakeProgress() {
    let value = 5;
    progressTimer = setInterval(() => {
      value = Math.min(95, value + Math.max(1, Math.round((95 - value) / 8)));
      onProgress(value);
    }, 180);
  }

  function sameOrigin(url) {
    try {
      return new URL(url, location.href).origin === location.origin;
    } catch (_) {
      return false;
    }
  }

  function contentWindow() {
    try {
      return iframe.contentWindow;
    } catch (_) {
      return null;
    }
  }

  function installPageHandlers() {
    const win = contentWindow();
    if (!win || !sameOrigin(currentUrl)) return;
    try {
      const doc = win.document;
      if (!doc) return;
      if (doc.__sige77Instrumented) return;
      doc.__sige77Instrumented = true;

      // yg.k() setOnLongClickListener: hit-test type IMAGE (5/8) -> save/copy menu.
      doc.addEventListener('contextmenu', (event) => {
        const target = event.target;
        const src = target && (target.currentSrc || target.src);
        if (target && target.tagName === 'IMG' && src) {
          event.preventDefault();
          onLongPressImage({ url: src, alt: target.alt || '' });
        }
      });

      // mg.onShowFileChooser(): the shell asks Camera / Album / Cancel before opening the picker.
      doc.addEventListener(
        'click',
        (event) => {
          const input = event.target && event.target.closest ? event.target.closest('input[type="file"]') : null;
          if (!input || input.dataset.sige77Chooser === '1') return;
          event.preventDefault();
          onFileChooser(input);
        },
        true,
      );

      // window.alert(): mg.onJsAlert() turns it into an AlertDialog and cancels the JS result.
      win.alert = (message) => onJsAlert(String(message ?? ''));
    } catch (err) {
      // Cross-origin or detached — nothing to instrument.
      log('warn', `page instrumentation skipped: ${err}`);
    }
  }

  /**
   * Opens the native picker for a page file input after the shell chooser ran.
   * The Android app delegates to ACTION_GET_CONTENT / IMAGE_CAPTURE; the browser equivalent is a
   * hidden <input type=file> (with `capture` for the camera).
   */
  function pickFileFor(input, mode) {
    return new Promise((resolve) => {
      const picker = document.createElement('input');
      picker.type = 'file';
      picker.accept = input.accept || '';
      picker.multiple = !!input.multiple;
      if (mode === 'camera') {
        picker.accept = input.accept && input.accept !== '' ? input.accept : 'image/*';
        picker.capture = 'environment';
      }
      picker.style.position = 'fixed';
      picker.style.left = '-9999px';
      document.body.appendChild(picker);
      picker.addEventListener('change', () => {
        const files = picker.files || [];
        picker.remove();
        resolve(files);
      });
      picker.click();
    });
  }

  /** Writes the chosen files into the page's own input and fires the change event. */
  function applyFiles(input, files) {
    if (!input || !files || files.length === 0) return false;
    try {
      const dt = new DataTransfer();
      Array.from(files).forEach((file) => dt.items.add(file));
      input.files = dt.files;
      input.dispatchEvent(new Event('input', { bubbles: true }));
      input.dispatchEvent(new Event('change', { bubbles: true }));
      return true;
    } catch (err) {
      log('warn', `assigning files failed: ${err}`);
      return false;
    }
  }

  /** jg.shouldInterceptRequest(): anti-hijack keyword validation of the main document. */
  async function checkHijack(url) {
    if (!sameOrigin(url)) return { checked: false };
    try {
      const res = await fetch(url, { cache: 'no-store', credentials: 'same-origin' });
      if (!res.ok) return { checked: true, ok: false, status: res.status };
      const text = await res.text();
      const ok = HIJACK_KEYWORDS.some((keyword) => text.includes(keyword));
      return { checked: true, ok, status: res.status, sample: ok ? '' : text.slice(0, 120) };
    } catch (err) {
      return { checked: true, ok: false, status: 0, error: String(err) };
    }
  }

  function load(url) {
    currentUrl = String(url || '');
    loadedUrl = currentUrl;
    inPageNavigations = 0;
    finished = false;
    lastStart = Date.now();
    stopTimers();
    onProgress(0);
    fakeProgress();

    iframe.src = currentUrl;

    iframe.onload = async () => {
      if (finished) {
        // A later navigation inside the same frame: remember it for canGoBack().
        trackInPageNavigation();
        installPageHandlers();
        return;
      }
      finished = true;
      stopTimers();
      const ms = Date.now() - lastStart;
      installPageHandlers();
      trackInPageNavigation();
      const hijack = await checkHijack(currentUrl);
      if (hijack.checked && !hijack.ok) {
        log('warn', `addBlackLine: ${currentUrl} reason: ${hijack.status ? `http status=${hijack.status}` : 'html not contain keyword'}`);
        onBlocked({ url: currentUrl, reason: 'hijack', status: hijack.status });
        return;
      }
      onProgress(100);
      log('info', `onPageFinished url=${currentUrl} (${ms}ms)`);
      onFinish({ url: currentUrl, durationMs: ms });
    };

    // Chromium fires `load` even for error pages, so an explicit probe runs in parallel.
    timer = setTimeout(async () => {
      if (finished) return;
      const hijack = await checkHijack(currentUrl);
      if (hijack.checked && !hijack.ok) {
        finished = true;
        stopTimers();
        log('error', `onReceivedHttpError: ${currentUrl} ${hijack.status || ''}`);
        if (hijack.status) onHttpError({ url: currentUrl, status: hijack.status });
        else onError({ url: currentUrl, code: -2, description: 'net::ERR_FAILED' });
        return;
      }
      if (!hijack.checked) {
        // Cross-origin: verify reachability with an opaque request.
        try {
          await fetch(currentUrl, { mode: 'no-cors', cache: 'no-store' });
          // Opaque success tells us nothing about status; treat as loaded.
          finished = true;
          stopTimers();
          onProgress(100);
          onFinish({ url: currentUrl, durationMs: Date.now() - lastStart });
        } catch (_) {
          finished = true;
          stopTimers();
          log('error', `onReceivedError: ${currentUrl} net::ERR_FAILED`);
          onError({ url: currentUrl, code: -2, description: 'net::ERR_FAILED' });
        }
      }
    }, timeoutMs);
  }

  /**
   * WebView.canGoBack() equivalent.
   * `history.length` alone is unreliable: a freshly assigned iframe already reports 2 entries
   * (about:blank + the document), so the counter only counts navigations that happened *inside*
   * the loaded page after its first load.
   */
  let inPageNavigations = 0;
  let loadedUrl = '';

  function canGoBack() {
    return inPageNavigations > 0;
  }

  function goBack() {
    const win = contentWindow();
    try {
      win?.history.back();
      inPageNavigations = Math.max(0, inPageNavigations - 1);
      return true;
    } catch (_) {
      return false;
    }
  }

  /** Detects same-frame navigations performed by the embedded page (link clicks etc.). */
  function trackInPageNavigation() {
    const win = contentWindow();
    if (!win) return;
    try {
      const href = win.location.href;
      if (loadedUrl && href !== loadedUrl) {
        inPageNavigations += 1;
        loadedUrl = href;
      }
    } catch (_) {
      /* cross-origin: cannot observe */
    }
  }

  return {
    load,
    canGoBack,
    goBack,
    pickFile: pickFileFor,
    applyFiles,
    getUrl: () => currentUrl,
    isSameOrigin: () => sameOrigin(currentUrl),
    contentWindow,
    stop: () => {
      finished = true;
      stopTimers();
      iframe.src = 'about:blank';
    },
  };
}
