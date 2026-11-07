/**
 * profile.js — #/profile (directive §17.3-B #17, #18).
 *
 * Account details, wallet summary, session information, the local settings the shell supports, the
 * route back to the launcher page ("Open Sige77 site") and sign-out. Sign-out revokes the session
 * server-side before the local state is cleared, so a stale cookie can never keep a screen alive.
 */

import { api, ApiError } from '../api.js';
import { session, store } from '../store.js';
import {
  alertDialog,
  confirmDialog,
  el,
  errorState,
  formatCredits,
  initials,
  render,
  screen,
  screenHead,
  skeletonList,
  toast,
} from '../ui.js';

export default function profile({ navigate, setBadge }) {
  const body = el('div', {}, [skeletonList('block', 1), skeletonList('line', 5)]);

  async function load() {
    render(body, [skeletonList('block', 1), skeletonList('line', 5)]);
    try {
      const account = await api.account();
      session.set({ authenticated: true, user: account.user });
      setBadge(account.unreadNotifications || 0);
      render(body, build(account));
    } catch (err) {
      if (err instanceof ApiError && err.status === 401) {
        session.clear();
        navigate('#/login', { replace: true });
        return;
      }
      render(body, [errorState(err instanceof ApiError ? err.message : 'Could not load your profile.', load)]);
    }
  }

  function rowItem(label, valueNode) {
    return el('li', { class: 'row-item' }, [
      el('span', { class: 'row-label', text: label }),
      typeof valueNode === 'string' ? el('span', { class: 'row-value', text: valueNode }) : valueNode,
    ]);
  }

  function toggle(key, label, initial) {
    const input = el('input', {
      type: 'checkbox',
      checked: initial,
      'aria-label': label,
      onchange: () => {
        store.setBool(key, input.checked);
        toast(`${label} ${input.checked ? 'enabled' : 'disabled'}`);
      },
    });
    return el('li', { class: 'row-item' }, [
      el('span', { class: 'row-label', text: label }),
      el('label', { class: 'switch' }, [input, el('span', { class: 'track' })]),
    ]);
  }

  function build(account) {
    const user = account.user;
    const stats = account.stats || {};
    const currency = user.wallet.currency;

    const signOut = el('button', {
      type: 'button',
      class: 'btn btn-danger',
      text: 'Sign out',
      onclick: async () => {
        const ok = await confirmDialog({
          title: 'Sign out?',
          message: 'You will need your phone number and password to sign in again.',
          confirmText: 'Sign out',
          danger: true,
        });
        if (!ok) return;
        signOut.disabled = true;
        signOut.textContent = 'Signing out…';
        try {
          await api.logout();
        } catch (_) {
          /* the local session is cleared regardless; the cookie is HttpOnly and expires server-side */
        }
        session.clear();
        store.remove('pendingOtpPhone');
        setBadge(0);
        toast('Signed out');
        navigate('#/login', { replace: true });
      },
    });

    return [
      el('div', { class: 'profile-head' }, [
        el('div', { class: 'avatar', text: initials(user.name) }),
        el('div', {}, [
          el('h2', { text: user.name }),
          el('p', { text: user.phonePretty || user.phone }),
        ]),
      ]),

      el('div', { class: 'card flush' }, [
        el('ul', { class: 'rows' }, [
          rowItem('Balance', `${formatCredits(user.wallet.balance)} ${currency}`),
          rowItem('Number verified', user.verified ? 'Yes' : 'No'),
          rowItem('Rounds played', String(stats.rounds || 0)),
          rowItem('Total staked', `${formatCredits(stats.wagered || 0)} ${currency}`),
          rowItem('Total returned', `${formatCredits(stats.returned || 0)} ${currency}`),
          rowItem(
            'Net result',
            el('span', {
              class: `row-value ${(stats.net || 0) >= 0 ? '' : 'muted'}`,
              text: `${(stats.net || 0) >= 0 ? '+' : ''}${formatCredits(stats.net || 0)} ${currency}`,
            }),
          ),
        ]),
      ]),

      el('div', { class: 'section-head' }, [el('h2', { text: 'Settings' })]),
      el('div', { class: 'card flush' }, [
        el('ul', { class: 'rows' }, [
          toggle('settings:notifications', 'In-app notifications', store.getBool('settings:notifications', true)),
          toggle('settings:sounds', 'Sound feedback', store.getBool('settings:sounds', true)),
          rowItem('Signed in', user.lastLoginAt ? new Date(String(user.lastLoginAt).replace(' ', 'T') + 'Z').toLocaleString() : 'just now'),
          rowItem('Account created', new Date(String(user.createdAt).replace(' ', 'T') + 'Z').toLocaleDateString()),
        ]),
      ]),

      el('div', { class: 'section-head' }, [el('h2', { text: 'Application' })]),
      el('div', { class: 'card flush' }, [
        el('ul', { class: 'rows' }, [
          rowItem('App version', '2.4.87'),
          rowItem('Package', 'prod.app_sige7tlbf5.com'),
          rowItem('Platform', 'Web (HTML5 · CSS3 · JavaScript · PHP · MySQL)'),
        ]),
      ]),

      el('button', {
        type: 'button',
        class: 'btn',
        text: 'Open Sige77 site',
        onclick: () => {
          if (window.Android && typeof window.Android.openWebView === 'function') {
            window.Android.openWebView('../index.html');
            return;
          }
          window.open('../index.html', '_blank', 'noopener');
        },
      }),
      el('div', { style: 'height:10px' }),
      el('button', {
        type: 'button',
        class: 'btn btn-ghost',
        text: 'About this reconstruction',
        onclick: () =>
          alertDialog({
            title: 'About this build',
            message:
              'This is a web reconstruction of the Sige77 Android shell. The original application ' +
              'was a WebView launcher; the screens you are using are the self-contained product ' +
              'layer built for this reconstruction. See WEB_RECONSTRUCTION_DIRECTIVE.md.',
            confirmText: 'Close',
          }),
      }),
      signOut,
    ];
  }

  load();

  return screen([screenHead({ title: 'Profile' }), body]);
}
