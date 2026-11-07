/**
 * debug-log.js — `LogOpen` / `LogClose` / `LogTest` bridge + client log pipeline.
 *
 * Android side:
 *   wg.java  LogOpen.Open()        -> makes the debug views visible
 *   vg.java  LogClose.Close()      -> hides them
 *   xg.java  LogTest.setText(str)  -> replaces the debug text
 *   qg.java  JSInterface.clearCache() -> clears the log ("Successful Clean Log" toast)
 * The views come from activity_webs.xml / activtiy_vassonic.xml:
 *   TextView id/webviewtext (14sp, bottom-start) and Button id/webviewbutton ("CleanLog").
 *
 * In addition every `qt.q()` / `kv.*` call of the APK is mirrored here through `log()`, which
 * also queues the entry for POST /api/log (see api/src/routes/log.php).
 */

import { t } from './i18n.js';

const MAX_LINES = 200;
const FLUSH_DELAY = 1500;

export function createDebugLog({ sendLog, prefs }) {
  const textEl = document.getElementById('webviewtext');
  const buttonEl = document.getElementById('webviewbutton');
  const lines = [];
  let queue = [];
  let timer = null;
  let visible = false;

  function render() {
    if (!textEl) return;
    textEl.textContent = lines.join('\n');
    textEl.scrollTop = textEl.scrollHeight;
  }

  function flush() {
    timer = null;
    if (!queue.length) return;
    const batch = queue.slice();
    queue = [];
    try {
      sendLog?.(batch);
    } catch (_) {
      /* logging must never throw into the UI */
    }
  }

  function append(level, message) {
    const stamp = new Date().toISOString().substring(11, 23);
    lines.push(`${stamp} ${level.toUpperCase()} ${message}`);
    while (lines.length > MAX_LINES) lines.shift();
    if (visible) render();
  }

  /**
   * @param {'verbose'|'debug'|'info'|'warn'|'error'} level
   * @param {string} message
   * @param {object} [extra]
   */
  function log(level, message, extra) {
    const msg = String(message ?? '');
    append(level, msg);
    queue.push({ level, message: msg, context: extra || null });
    if (!timer) timer = setTimeout(flush, FLUSH_DELAY);
    // Mirror to the browser console for developers (the APK logs to logcat).
    const fn = level === 'error' ? console.error : level === 'warn' ? console.warn : console.log;
    fn(`[shell] ${msg}`);
  }

  function setVisible(next) {
    visible = !!next;
    textEl?.classList.toggle('visible', visible);
    buttonEl?.classList.toggle('visible', visible);
    if (visible) render();
  }

  function clear() {
    lines.length = 0;
    queue = [];
    render();
  }

  // `webviewbutton` = "CleanLog" action
  buttonEl?.addEventListener('click', () => {
    clear();
    log('info', t('cleanLog'));
  });

  // Flush pending entries when the page is being hidden/closed (best effort).
  window.addEventListener('pagehide', () => {
    if (queue.length) {
      sendLog?.(queue.slice());
      queue = [];
    }
  });
  window.addEventListener('visibilitychange', () => {
    if (document.visibilityState === 'hidden' && queue.length) flush();
  });

  return { log, setVisible, clear, isVisible: () => visible };
}
