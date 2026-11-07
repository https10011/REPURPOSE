/**
 * loading-dialog.js — replica of `mz0` (loading dialog) + `c6` (dismiss handler).
 *
 * Android behaviour recovered from yg.onCreate() and mz0:
 *   • layout loading_dialog_view: 50dp loader, 12sp white text, 5dp gap, padding 10dp
 *   • drawable dialog_bg: #444444, 20dp radius
 *   • window gravity = bottom, y = 300px, not cancelable
 *   • two loader styles:  k = 0 -> LVCircularRing ("ring"),  k = 1 -> LoadCircleView ("line")
 *   • minimum display time `j` = 1000 ms (su1.b default)
 *   • success/failure: RightDiaView / WrongDiaView are shown, and once their drawing animation
 *     finishes the dialog is dismissed after `j` ms (b(View) -> sendEmptyMessageDelayed(1|2, j))
 *
 * X5_Activity.p() sets `j = 2` before showing the success mark, i.e. the dialog closes as soon
 * as the mark has been drawn (≈320 ms animation + 2 ms), and a toast is shown instead.
 */

import { STRINGS } from './i18n.js';

const MARK_ANIMATION_MS = 320;

export function createLoadingDialog(root = document.getElementById('loadingDialog')) {
  const textEl = root?.querySelector('.loading-text');
  const loaders = {
    ring: root?.querySelector('[data-loader="ring"]'),
    line: root?.querySelector('[data-loader="line"]'),
    success: root?.querySelector('[data-loader="success"]'),
    fail: root?.querySelector('[data-loader="fail"]'),
  };

  let visible = false;
  let shownAt = 0;
  let minDuration = 1000;
  let dismissDelay = 0; // mz0.j
  let dynamic = true; // mz0.i
  let timer = null;

  function clearTimer() {
    if (timer) {
      clearTimeout(timer);
      timer = null;
    }
  }

  function hideAllLoaders() {
    Object.values(loaders).forEach((el) => el?.classList.remove('visible'));
  }

  function setText(text) {
    if (!textEl) return;
    const value = text === null || text === undefined ? '' : String(text);
    textEl.textContent = value;
    textEl.classList.toggle('visible', value.length > 0);
  }

  function show(style = 'ring', text = '') {
    clearTimer();
    hideAllLoaders();
    loaders[style]?.classList.add('visible');
    setText(text);
    root?.classList.add('visible');
    visible = true;
    shownAt = Date.now();
  }

  function hide() {
    clearTimer();
    root?.classList.remove('visible');
    visible = false;
  }

  /** mz0.a() */
  function cancel() {
    hide();
  }

  function scheduleDismiss(delayMs) {
    clearTimer();
    timer = setTimeout(hide, Math.max(0, delayMs));
  }

  /**
   * mz0 success branch (X5_Activity.p(true)): success mark then dismiss after the drawing
   * animation plus `dismissDelay` (2 ms in the APK).
   */
  function showSuccess(text = STRINGS.loading_ring_succeed, options = {}) {
    const delay = options.dismissDelayMs ?? dismissDelay ?? 2;
    hideAllLoaders();
    loaders.success?.classList.add('visible');
    if (text !== null) setText(text);
    root?.classList.add('visible');
    visible = true;
    const elapsed = Date.now() - shownAt;
    const minWait = Math.max(0, Math.min(minDuration - elapsed, 1000));
    scheduleDismiss(MARK_ANIMATION_MS + delay + minWait);
  }

  /** Failure mirror (WrongDiaView). */
  function showFail(text = '', options = {}) {
    const delay = options.dismissDelayMs ?? dismissDelay ?? 0;
    hideAllLoaders();
    loaders.fail?.classList.add('visible');
    if (text !== null) setText(text);
    root?.classList.add('visible');
    visible = true;
    scheduleDismiss(MARK_ANIMATION_MS + delay);
  }

  return {
    show,
    hide,
    cancel,
    setText,
    setStyle: (style) => {
      hideAllLoaders();
      loaders[style]?.classList.add('visible');
    },
    showSuccess,
    showFail,
    setMinDuration: (ms) => {
      minDuration = Math.max(0, Number(ms) || 0);
    },
    setDismissDelay: (ms) => {
      dismissDelay = Math.max(0, Number(ms) || 0);
    },
    setDynamic: (value) => {
      dynamic = !!value;
    },
    isDynamic: () => dynamic,
    isVisible: () => visible,
  };
}
