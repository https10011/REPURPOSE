/**
 * notifications.js — #/notifications (directive §17.3-B #16).
 *
 * Account notices plus the locally issued one-time codes, listed newest first. Unread entries carry
 * the accent dot; opening the screen marks everything read through `POST /api/notifications` and
 * clears the tab badge, which mirrors the notification channel the APK declared in
 * MyFirebaseMessagingService (the delivery mechanism differs, the surface does not).
 */

import { api, ApiError } from '../api.js';
import { session } from '../store.js';
import {
  el,
  emptyState,
  errorState,
  render,
  screen,
  screenHead,
  skeletonList,
  timeAgo,
  toast,
} from '../ui.js';

export default function notifications({ navigate, setBadge }) {
  const body = el('div', {}, [skeletonList('block', 4)]);
  let unread = 0;

  async function load() {
    render(body, [skeletonList('block', 4)]);
    try {
      const value = await api.notifications();
      const list = value.notifications || [];
      unread = list.filter((n) => !n.read).length;
      setBadge(unread);

      render(
        body,
        list.length
          ? el('div', { class: 'card flush' }, [el('ul', { class: 'notif-list' }, list.map(row))])
          : emptyState({
              icon: '♢',
              title: 'No notifications',
              text: 'Verification codes and account notices will appear here.',
            }),
      );

      if (unread > 0) {
        // Mark read only after the list has been presented, so the dots are visible first.
        setTimeout(markRead, 400);
      }
    } catch (err) {
      if (err instanceof ApiError && err.status === 401) {
        session.clear();
        navigate('#/login', { replace: true });
        return;
      }
      render(body, [errorState(err instanceof ApiError ? err.message : 'Could not load notifications.', load)]);
    }
  }

  async function markRead() {
    try {
      await api.markNotificationsRead();
      setBadge(0);
      body.querySelectorAll('.notif.unread').forEach((node) => {
        node.classList.remove('unread');
        node.classList.add('read');
      });
    } catch (_) {
      /* the badge simply stays until the next successful load */
    }
  }

  function row(notification) {
    return el('li', { class: `notif ${notification.read ? 'read' : 'unread'}` }, [
      el('span', { class: 'notif-dot', 'aria-hidden': 'true' }),
      el('div', { class: 'notif-body' }, [
        el('h3', { text: notification.title }),
        el('p', { text: notification.body }),
        el('time', { text: timeAgo(notification.createdAt) }),
      ]),
    ]);
  }

  const refresh = el('button', {
    type: 'button',
    class: 'btn',
    text: 'Refresh',
    onclick: () => {
      load();
      toast('Checking for new notifications');
    },
  });

  load();

  return screen([
    screenHead({ title: 'Notifications', back: '#/home', navigate }),
    body,
    refresh,
  ]);
}
