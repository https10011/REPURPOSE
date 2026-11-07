/**
 * home.js — #/home (directive §17.3-B #13).
 *
 * Signed-in landing: balance card, quick actions, a preview of the catalog, recent activity and a
 * promo strip. Data comes from `GET /api/account` (profile, wallet, statistics, recent rounds) and
 * `GET /api/games`. Every state the directive requires is present: skeleton while loading, an
 * error box with retry, and an empty state for a player with no rounds yet.
 */

import { api, ApiError } from '../api.js';
import { session } from '../store.js';
import {
  el,
  emptyState,
  errorState,
  formatCredits,
  initials,
  render,
  screen,
  screenHead,
  skeletonList,
  timeAgo,
  toast,
} from '../ui.js';
import { gameTile } from '../partials/game-tile.js';

/**
 * The daily demo-credit strip. Credits are play money, and a player who loses them all would have
 * no way back into the games, so the strip is a real control: it claims the allowance once per UTC
 * day and reports the outcome. The button is disabled while a claim is in flight.
 */
function claimStrip(account, reload) {
  const daily = account.dailyCredits || { amount: 500, claimedToday: false };
  const label = `${formatCredits(daily.amount)} credits`;
  let busy = false;

  const button = el('button', {
    type: 'button',
    class: 'btn btn-small btn-primary',
    text: daily.claimedToday ? 'Claimed today' : `Claim ${label}`,
    disabled: !!daily.claimedToday,
    onclick: async () => {
      if (busy || daily.claimedToday) return;
      busy = true;
      button.disabled = true;
      button.textContent = 'Adding…';
      try {
        const result = await api.claimDailyCredits();
        session.applyBalance(result.balance);
        toast(
          result.granted
            ? `${formatCredits(result.granted)} demo credits added.`
            : 'Credits already claimed today.',
        );
        reload();
      } catch (err) {
        busy = false;
        button.disabled = false;
        button.textContent = `Claim ${label}`;
        toast(err instanceof ApiError ? err.message : 'Could not add credits.', 'error');
      }
    },
  });

  return el('div', { class: 'promo-strip' }, [
    el('span', { html: '&#9733;', style: 'font-size:20px' }),
    el('div', {}, [
      el('b', { text: 'Daily demo credits' }),
      el('span', {
        class: 'tiny',
        text: daily.claimedToday
          ? 'Today’s demo credits are already on your balance. They refresh at 00:00 UTC.'
          : `${label} are added to your balance once a day so the games can always be played.`,
      }),
    ]),
    button,
  ]);
}

export default function home({ navigate, setBadge }) {
  const body = el('div', {}, [skeletonList('block', 2), skeletonList('tile', 4)]);

  const head = screenHead({ title: 'Sige77' });

  async function load() {
    render(body, [skeletonList('block', 2), skeletonList('tile', 4)]);
    try {
      const [account, catalog] = await Promise.all([api.account(), api.games()]);
      session.set({ authenticated: true, user: account.user });
      setBadge(account.unreadNotifications || 0);
      render(body, build(account, catalog));
    } catch (err) {
      if (err instanceof ApiError && err.status === 401) {
        session.clear();
        navigate('#/login', { replace: true });
        return;
      }
      render(body, [
        errorState(err instanceof ApiError ? err.message : 'Could not load your account.', load),
      ]);
    }
  }

  function build(account, catalog) {
    const user = account.user;
    const stats = account.stats || {};
    const games = (catalog.games || []).filter((g) => g.status === 'playable').slice(0, 4);
    const recent = (account.recentRounds || []).slice(0, 4);

    return [
      el('div', { class: 'balance-card' }, [
        el('p', { class: 'balance-label', text: 'Available balance' }),
        el('p', { class: 'balance-value' }, [
          formatCredits(user.wallet.balance),
          el('small', { text: user.wallet.currency }),
        ]),
        el('div', { class: 'balance-meta' }, [
          el('div', {}, [el('b', { text: String(stats.rounds || 0) }), 'rounds played']),
          el('div', {}, [el('b', { text: formatCredits(stats.wagered || 0) }), 'total staked']),
          el('div', {}, [
            el('b', {
              class: (stats.net || 0) >= 0 ? 'muted' : 'muted',
              text: `${(stats.net || 0) >= 0 ? '+' : ''}${formatCredits(stats.net || 0)}`,
            }),
            'net result',
          ]),
        ]),
      ]),

      el('div', { class: 'quick-actions' }, [
        quick('◉', 'Play', () => navigate('#/games')),
        quick('♢', 'Alerts', () => navigate('#/notifications')),
        quick('☺', 'Profile', () => navigate('#/profile')),
        quick('⇱', 'Site', () => openSite()),
      ]),

      claimStrip(account, load),

      el('div', { class: 'section' }, [
        el('div', { class: 'section-head' }, [
          el('h2', { text: 'Games' }),
          el('a', { href: '#/games', text: 'See all' }),
        ]),
        games.length
          ? el('div', { class: 'game-grid' }, games.map((g) => gameTile(g, navigate)))
          : emptyState({ icon: '◉', title: 'No games available', text: 'The catalog is empty right now.' }),
      ]),

      el('div', { class: 'section' }, [
        el('div', { class: 'section-head' }, [el('h2', { text: 'Recent activity' })]),
        recent.length
          ? el('div', { class: 'card flush' }, [el('ul', { class: 'history-list' }, recent.map(roundRow))])
          : emptyState({
              icon: '⟳',
              title: 'No rounds yet',
              text: 'Play a game and your results will appear here.',
            }),
      ]),
    ];
  }

  function quick(icon, label, onClick) {
    return el('button', { type: 'button', class: 'quick', onclick: onClick }, [
      el('span', { text: icon }),
      el('span', { text: label }),
    ]);
  }

  function roundRow(round) {
    const net = (round.payout || 0) - (round.stake || 0);
    return el('li', { class: 'round-row' }, [
      el('span', { class: 'round-game' }, [
        el('b', { text: round.gameName }),
        el('span', { class: 'round-stake', text: ` · ${formatCredits(round.stake)} stake · ${timeAgo(round.createdAt)}` }),
      ]),
      el('span', { class: `round-delta ${net >= 0 ? 'win' : 'lose'}`, text: `${net >= 0 ? '+' : ''}${formatCredits(net)}` }),
    ]);
  }

  function openSite() {
    // The shell owns the launcher page; opening it keeps the "back to the Sige77 site" behaviour
    // that OpenWebActivity provided in the APK.
    if (window.Android && typeof window.Android.openWebView === 'function') {
      window.Android.openWebView('../index.html');
      return;
    }
    window.open('../index.html', '_blank', 'noopener');
  }

  load();

  return screen([
    head,
    el('div', { class: 'tiny muted', style: 'padding:0 2px 10px' }, [
      el('span', { text: session.user ? `Signed in as ${session.user.name}` : '' }),
    ]),
    body,
  ]);
}
