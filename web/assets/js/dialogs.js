/**
 * dialogs.js — replica of `f6` / `b6` / `g6` (Material Light AlertDialog factory).
 *
 * Call sites reproduced here:
 *   yg.onKeyDown()             exit confirmation  : title alertDialog1, message alertDialog2,
 *                                                  buttons alertDialog3 (Cancel) / alertDialog4 (OK)
 *   X5_Activity.F()             route failure     : title + "no network" message + track id,
 *                                                  single button (alertDialog4 == OK), tap = retry
 *   mg.onJsAlert()              window.alert()    : message as title, OK button, result cancelled
 *   yg.uploadPicture()          upload chooser    : title uploadPicture, three equal-weight
 *                                                  buttons (Camera / Album / Cancel)
 *   yg.k() long-click listener  image actions     : two items (Download Image / Copy)
 *
 * The Android dialogs are not cancelable where the APK calls setCancelable(false)
 * (exit dialog, retry dialog, loading dialog); the scrim click is ignored for those.
 */

import { t } from './i18n.js';

const host = () => document.getElementById('dialogHost');

let activeDialog = null;

function close(scrim) {
  scrim?.remove();
  if (activeDialog === scrim) activeDialog = null;
}

/**
 * Core builder.
 * @param {object} options
 * @param {string} [options.title]
 * @param {string} [options.message]
 * @param {Array<{text:string,value:any,variant?:'positive'|'negative'|'neutral'}>} options.buttons
 * @param {boolean} [options.cancelable]
 * @param {boolean} [options.wideButtons]  equal-weight buttons (yg.x() on each button)
 * @param {Array<{text:string,value:any}>} [options.items]  list dialog (long-press menu)
 * @param {number} [options.autoCloseMs]
 * @returns {Promise<any>} resolves with the chosen value (or null when dismissed)
 */
export function showDialog(options) {
  const {
    title = '',
    message = '',
    buttons = [],
    cancelable = false,
    wideButtons = false,
    items = null,
    autoCloseMs = 0,
  } = options || {};

  return new Promise((resolve) => {
    // Only one dialog is visible at a time, like an Activity-hosted AlertDialog.
    if (activeDialog) close(activeDialog);

    const scrim = document.createElement('div');
    scrim.className = 'scrim';
    const box = document.createElement('div');
    box.className = 'dialog';
    box.setAttribute('role', 'alertdialog');
    box.setAttribute('aria-modal', 'true');

    if (title) {
      const h = document.createElement('h2');
      h.className = 'dialog-title';
      h.textContent = title;
      box.appendChild(h);
    }
    if (message) {
      const p = document.createElement('p');
      p.className = 'dialog-message';
      p.textContent = message;
      box.appendChild(p);
    }

    const finish = (value) => {
      if (autoCloseMs) clearTimeout(autoTimer);
      close(scrim);
      resolve(value);
    };

    if (Array.isArray(items) && items.length) {
      const list = document.createElement('div');
      list.className = 'dialog-list';
      items.forEach((item) => {
        const btn = document.createElement('button');
        btn.type = 'button';
        btn.className = 'chooser-item';
        btn.textContent = item.text;
        btn.addEventListener('click', () => finish(item.value));
        list.appendChild(btn);
      });
      box.appendChild(list);
    }

    if (buttons.length) {
      const actions = document.createElement('div');
      actions.className = `dialog-actions${wideButtons ? ' wide' : ''}`;
      buttons.forEach((b) => {
        const btn = document.createElement('button');
        btn.type = 'button';
        btn.textContent = b.text;
        btn.dataset.variant = b.variant || 'neutral';
        btn.addEventListener('click', () => finish(b.value));
        actions.appendChild(btn);
      });
      box.appendChild(actions);
    }

    scrim.appendChild(box);
    if (cancelable) {
      scrim.addEventListener('click', (event) => {
        if (event.target === scrim) finish(null);
      });
    }
    host()?.appendChild(scrim);
    activeDialog = scrim;

    const autoTimer = autoCloseMs ? setTimeout(() => finish(null), autoCloseMs) : 0;

    // Move focus into the dialog (like an AlertDialog window does) without painting a focus
    // ring on the first button; Tab then reaches the buttons normally.
    box.tabIndex = -1;
    box.focus({ preventScroll: true });
  });
}

/** yg.onKeyDown() exit confirmation. */
export function confirmExit() {
  return showDialog({
    title: t('alertDialog1'),
    message: t('alertDialog2'),
    buttons: [
      { text: t('alertDialog3'), value: 'cancel', variant: 'negative' },
      { text: t('alertDialog4'), value: 'exit', variant: 'positive' },
    ],
    cancelable: false,
  });
}

/**
 * X5_Activity.F() — shown when no route could be resolved / no network.
 * The APK message is `resources.getString(2131886195) + " (" + trackId + ")"`.
 */
export function showRouteFailure(trackId, message = t('no_network')) {
  return showDialog({
    title: t('alertDialog1'),
    message: `${message} (${trackId})`,
    buttons: [{ text: t('alertDialog4'), value: 'retry', variant: 'positive' }],
    cancelable: false,
  });
}

/** mg.onJsAlert() — replaces window.alert() inside the embedded page. */
export function showJsAlert(message) {
  return showDialog({
    title: String(message ?? ''),
    buttons: [{ text: t('alertDialog4'), value: 'ok', variant: 'positive' }],
    cancelable: false,
  });
}

/** yg.uploadPicture() — three equal-weight buttons (yg.x() applied to each). */
export function showUploadChooser() {
  return showDialog({
    title: t('uploadPicture'),
    buttons: [
      { text: t('camera'), value: 'camera' },
      { text: t('album'), value: 'album' },
      { text: t('cancel'), value: 'cancel' },
    ],
    wideButtons: true,
    cancelable: false,
  });
}

/** yg.k() long-click image menu (alertDialog with items). */
export function showImageMenu() {
  return showDialog({
    items: [
      { text: t('save_image'), value: 'save' },
      { text: t('copy'), value: 'copy' },
    ],
    cancelable: true,
  });
}

export function dismissActiveDialog() {
  if (activeDialog) close(activeDialog);
}
