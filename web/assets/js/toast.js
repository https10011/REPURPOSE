/**
 * toast.js — ToastUtils replica.
 *
 * Android side: `com.hjq.toast.ToastUtils` initialised in AppTestApp.onCreate with
 *   setGravity(BOTTOM, 0, 36dp)   (dimens.xml: toast_y_offset = 36dp)
 *   setView(2131493004)           (library layout; not present in the decompiled resources)
 * Because the custom view is unavailable, the toasts reuse the shell's own card language
 * (#444444, 20dp radius — drawable/dialog_bg.xml) which is documented as an inference.
 */

import { t } from './i18n.js';

const DEFAULT_DURATION = 2000; // Toast.LENGTH_SHORT
let host = null;

function ensureHost() {
  if (host && host.isConnected) return host;
  host = document.getElementById('toastHost');
  if (!host) {
    host = document.createElement('div');
    host.id = 'toastHost';
    document.getElementById('content')?.appendChild(host);
  }
  return host;
}

export function showToast(message, duration = DEFAULT_DURATION) {
  const text = String(message ?? '');
  if (!text) return;
  const node = document.createElement('div');
  node.className = 'toast';
  node.setAttribute('role', 'status');
  node.textContent = text;
  ensureHost().appendChild(node);
  // Multiple toasts stack (ToastUtils queues them on Android; stacking is the closest
  // equivalent without hiding information).
  setTimeout(() => {
    node.style.transition = 'opacity 160ms ease-in';
    node.style.opacity = '0';
    setTimeout(() => node.remove(), 180);
  }, Math.max(600, duration));
}

export const toastString = (key) => showToast(t(key));
