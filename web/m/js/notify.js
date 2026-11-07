/**
 * notify.js — local notification delivery for one-time codes (directive §6.3).
 *
 * The original application delivered OTP codes by SMS through a gateway that is not part of the
 * repository. The addendum replaces that with an in-app notification, so this module delivers the
 * code through every channel the browser offers, in this order:
 *
 *   1. a system/browser notification (Notification API) when permission has been granted,
 *   2. an in-app banner rendered by the caller (always, so the flow never depends on permission),
 *   3. a toast for immediate feedback.
 *
 * Nothing here contacts an external service. Verification itself is performed by the backend
 * (`POST /api/auth/otp/verify`).
 */

import { toast } from './ui.js';

/** True when the browser can raise system notifications and the user has granted permission. */
export function canNotify() {
  return typeof window !== 'undefined' && 'Notification' in window && Notification.permission === 'granted';
}

/**
 * Asks for notification permission. Returns the resulting permission string. Never throws and
 * never blocks the caller: a denial simply falls back to the in-app banner.
 */
export async function requestPermission() {
  if (typeof window === 'undefined' || !('Notification' in window)) return 'unsupported';
  if (Notification.permission === 'granted' || Notification.permission === 'denied') return Notification.permission;
  try {
    return await Notification.requestPermission();
  } catch (_) {
    return 'denied';
  }
}

/**
 * Delivers a verification code.
 *
 * @param {{ code: string, phonePretty?: string, expiresInSec?: number }} payload
 * @returns {boolean} true when a system notification was actually shown.
 */
export function deliverOtp(payload) {
  const code = String((payload && payload.code) || '');
  const minutes = Math.max(1, Math.round(((payload && payload.expiresInSec) || 600) / 60));
  const title = 'Sige77 verification code';
  const body = `Your code is ${code}. It expires in ${minutes} minutes.`;
  let shown = false;

  if (canNotify()) {
    try {
      const notification = new Notification(title, {
        body,
        tag: 'sige77-otp',
        icon: '../assets/img/ic_launcher.png',
        badge: '../assets/img/ic_launcher.png',
        requireInteraction: true,
      });
      notification.onclick = () => {
        window.focus();
        notification.close();
      };
      shown = true;
    } catch (_) {
      shown = false;
    }
  }

  toast(`Verification code ${code}`, 'win');
  return shown;
}
