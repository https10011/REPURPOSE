/**
 * game.js — #/game/:slug (directive §17.3-B #15, §17.7).
 *
 * One screen, three behaviours:
 *   • a playable game (crash, dice, slots) gets its own board and control set, and every round is
 *     resolved by the backend (`POST /api/games/play`) so payouts and the ledger stay authoritative;
 *   • a game the catalog marks as blocked renders the documented placeholder instead of a fake
 *     board, and says on screen that its original logic was not recoverable;
 *   • a slug that is not in the catalog shows a not-found state with a way back.
 *
 * Stake handling is shared: amount field, quick chips, validation against the catalog's min/max and
 * the current balance. Insufficient balance is reported from the backend (`402`) rather than
 * guessed locally.
 */

import { api, ApiError } from '../api.js';
import { session, store } from '../store.js';
import {
  el,
  emptyState,
  errorState,
  formatCredits,
  formatMultiplier,
  render,
  screen,
  screenHead,
  skeletonList,
  timeAgo,
  toast,
} from '../ui.js';

const RULES = {
  crash: [
    'A crash point is drawn from a provably-fair style distribution: point = floor(97 / (1 − u)) / 100, u uniform in [0,1).',
    'You set an auto cash-out target between 1.01× and 1000×.',
    'You win the target multiplier when the crash point is at or above your target; otherwise the round is lost.',
    'Return to player is 97% for any fixed target.',
  ],
  dice: [
    'A single roll from 1 to 100 is drawn.',
    'Choose under or over and a target between 2 and 98.',
    'Under wins when the roll is below the target; over wins when it is above it.',
    'Multiplier = 0.97 / chance, so return to player is 97% at every target.',
  ],
  slots: [
    'Three reels, six equally likely symbols each: seven, bell, bar, cherry, lemon, coin.',
    'Only three of a kind pays: 120× seven, 50× bell, 20× bar, 10× cherry, 5× lemon, 2× coin.',
    'Return to player is 95.83% on this paytable (207/216).',
  ],
};

const ART = { crash: '↗', dice: '⚄', slots: '▤', 'live-casino': '♠' };

export default function game({ params, navigate, setBadge }) {
  const slug = params.slug;
  const body = el('div', {}, [skeletonList('block', 1), skeletonList('line', 4)]);
  let game = null;
  let busy = false;

  const head = screenHead({ title: 'Game', back: '#/games', navigate });

  async function load() {
    render(body, [skeletonList('block', 1), skeletonList('line', 4)]);
    try {
      const [catalog, account] = await Promise.all([
        api.games(),
        api.account().catch(() => null),
      ]);
      if (account) {
        session.set({ authenticated: true, user: account.user });
        setBadge(account.unreadNotifications || 0);
      }
      game = (catalog.games || []).find((g) => g.slug === slug) || null;
      head.querySelector('h1').textContent = game ? game.name : 'Game';
      if (!game) {
        render(body, [
          emptyState({
            icon: '?',
            title: 'Game not found',
            text: 'That game is not in the catalog.',
          }),
          el('button', { type: 'button', class: 'btn btn-primary', text: 'Back to catalog', onclick: () => navigate('#/games') }),
        ]);
        return;
      }
      render(body, game.status === 'playable' ? buildPlayable() : buildBlocked());
    } catch (err) {
      if (err instanceof ApiError && err.status === 401) {
        session.clear();
        navigate('#/login', { replace: true });
        return;
      }
      render(body, [errorState(err instanceof ApiError ? err.message : 'Could not open the game.', load)]);
    }
  }

  /* ------------------------------------------------------------------ blocked -- */

  function buildBlocked() {
    return [
      el('div', { class: 'stage' }, [
        el('span', { class: 'stage-label', text: 'Unavailable' }),
        el('span', { class: 'stage-value', html: ART[game.slug] || '◉' }),
        el('span', { class: 'stage-note', text: game.tagline || '' }),
      ]),
      el('div', { class: 'card' }, [
        el('h3', { style: 'margin:0 0 6px', text: 'Gameplay unavailable' }),
        el('p', { class: 'tiny muted', style: 'margin:0 0 10px' }, [
          'The original Android build contained no game code for this title: the APK is a WebView ' +
            'shell and the product logic lived on a remote server that is not part of the ' +
            'repository. Nothing is simulated here in its place.',
        ]),
        el('p', { class: 'tiny muted', style: 'margin:0' }, [
          'To implement it later: the original rules, paytable and RNG contract would have to be ' +
            'recovered. Until then this entry stays in the catalog as a documented placeholder.',
        ]),
      ]),
      el('button', { type: 'button', class: 'btn', text: 'Back to catalog', onclick: () => navigate('#/games') }),
    ];
  }

  /* ----------------------------------------------------------------- playable -- */

  function buildPlayable() {
    const isCrash = game.slug === 'crash';
    const isDice = game.slug === 'dice';
    const isSlots = game.slug === 'slots';

    const state = {
      stake: clampStake(store.getNumber(`stake:${game.slug}`, game.minStake) || game.minStake),
      autoCashout: Number(store.get(`crash:target`, '1.50')) || 1.5,
      target: Number(store.get(`dice:target`, '50')) || 50,
      direction: store.get(`dice:direction`, 'under') || 'under',
    };

    const balancePill = el('span', { class: 'balance-pill', text: `Balance ${formatCredits(session.balance)}` });
    const stage = el('div', { class: 'stage' });
    const playButton = el('button', { type: 'button', class: 'btn btn-primary', text: 'Play' });
    const historyList = el('ul', { class: 'history-list' });
    const historyHost = el('div', { class: 'card flush', hidden: true }, [historyList]);

    /* ---- stake controls ---- */
    const stakeInput = el('input', {
      type: 'number',
      min: String(game.minStake),
      max: String(game.maxStake),
      step: '10',
      value: String(state.stake),
      'aria-label': 'Stake',
    });
    stakeInput.addEventListener('change', () => {
      state.stake = clampStake(Number(stakeInput.value));
      stakeInput.value = String(state.stake);
      store.setNumber(`stake:${game.slug}`, state.stake);
    });

    const quickChips = el('div', { class: 'stake-quick' });
    const QUICK = [10, 25, 50, 100, 250, 500];
    render(
      quickChips,
      QUICK.filter((amount) => amount <= game.maxStake).map((amount) =>
        el('button', {
          type: 'button',
          text: `+${amount}`,
          onclick: () => {
            state.stake = clampStake(state.stake + amount);
            stakeInput.value = String(state.stake);
            store.setNumber(`stake:${game.slug}`, state.stake);
          },
        }),
      ),
    );
    const halfButton = el('button', {
      type: 'button',
      text: '½',
      onclick: () => {
        state.stake = clampStake(Math.floor(state.stake / 2));
        stakeInput.value = String(state.stake);
        store.setNumber(`stake:${game.slug}`, state.stake);
      },
    });
    const maxButton = el('button', {
      type: 'button',
      text: 'Max',
      onclick: () => {
        state.stake = clampStake(Math.min(game.maxStake, session.balance));
        stakeInput.value = String(state.stake);
        store.setNumber(`stake:${game.slug}`, state.stake);
      },
    });
    quickChips.appendChild(halfButton);
    quickChips.appendChild(maxButton);

    /* ---- game-specific controls ---- */
    const controls = el('div', { class: 'controls' }, [
      el('div', { class: 'stake-row' }, [el('label', { text: 'Stake' }), stakeInput]),
      quickChips,
    ]);

    if (isCrash) {
      const range = el('input', {
        type: 'range',
        min: '1.01',
        max: '10',
        step: '0.01',
        value: String(Math.min(state.autoCashout, 10)),
      });
      const out = el('output', { text: formatMultiplier(state.autoCashout) });
      range.addEventListener('input', () => {
        state.autoCashout = Number(range.value);
        out.textContent = formatMultiplier(state.autoCashout);
        store.set('crash:target', String(state.autoCashout));
      });
      const manual = el('input', {
        type: 'number',
        min: '1.01',
        max: '1000',
        step: '0.01',
        value: String(state.autoCashout),
        'aria-label': 'Auto cash-out target',
      });
      manual.addEventListener('change', () => {
        state.autoCashout = Math.min(1000, Math.max(1.01, Number(manual.value) || 1.01));
        manual.value = String(state.autoCashout);
        range.value = String(Math.min(state.autoCashout, 10));
        out.textContent = formatMultiplier(state.autoCashout);
        store.set('crash:target', String(state.autoCashout));
      });
      controls.appendChild(
        el('div', { class: 'control-row' }, [el('label', { text: 'Auto cash-out' }), range, out]),
      );
      controls.appendChild(el('div', { class: 'control-row' }, [el('label', { text: 'Exact' }), manual]));
    }

    if (isDice) {
      const range = el('input', {
        type: 'range',
        min: '2',
        max: '98',
        step: '1',
        value: String(state.target),
      });
      const out = el('output', { text: String(state.target) });
      const chanceLine = el('p', { class: 'field-hint' });
      const directionButtons = el('div', { class: 'seg' });

      const updateChance = () => {
        const chance =
          state.direction === 'under' ? (state.target - 1) / 100 : (100 - state.target) / 100;
        const multiplier = chance > 0 ? 0.97 / chance : 0;
        chanceLine.textContent = `Win chance ${(chance * 100).toFixed(0)}% · payout ${formatMultiplier(multiplier)}`;
      };

      const renderDirection = () => {
        render(directionButtons, [
          el('button', {
            type: 'button',
            class: state.direction === 'under' ? 'active' : '',
            text: 'Roll under',
            onclick: () => {
              state.direction = 'under';
              store.set('dice:direction', 'under');
              renderDirection();
              updateChance();
            },
          }),
          el('button', {
            type: 'button',
            class: state.direction === 'over' ? 'active' : '',
            text: 'Roll over',
            onclick: () => {
              state.direction = 'over';
              store.set('dice:direction', 'over');
              renderDirection();
              updateChance();
            },
          }),
        ]);
      };

      range.addEventListener('input', () => {
        state.target = Number(range.value);
        out.textContent = String(state.target);
        store.set('dice:target', String(state.target));
        updateChance();
      });

      renderDirection();
      updateChance();
      controls.appendChild(el('div', { class: 'seg-wrap' }, [directionButtons]));
      controls.appendChild(el('div', { class: 'control-row' }, [el('label', { text: 'Target' }), range, out]));
      controls.appendChild(chanceLine);
    }

    controls.appendChild(playButton);

    const rules = el('details', { class: 'rules' }, [
      el('summary', { text: 'How this game works' }),
      el('div', { class: 'rules-body' }, [
        el('ul', {}, (RULES[game.slug] || []).map((line) => el('li', { text: line }))),
        el('p', { class: 'tiny', style: 'margin:10px 0 0' }, [
          `Stake limits ${formatCredits(game.minStake)}–${formatCredits(game.maxStake)} credits · ` +
            (game.rtp ? `catalog RTP ${(game.rtp * 100).toFixed(2)}%` : 'RTP not published'),
        ]),
        el('p', { class: 'tiny', style: 'margin:6px 0 0' }, [
          'This game is an equivalent implementation built for the web reconstruction: the APK ' +
            'contained no game code (see the reconstruction notes).',
        ]),
      ]),
    ]);

    /* ---- board rendering ---- */
    function idleBoard() {
      if (isSlots) {
        render(stage, [
          el('span', { class: 'stage-label', text: 'Three reels' }),
          el('div', { class: 'slot-reels' }, [1, 2, 3].map(() => el('div', { class: 'slot-reel', text: '▤' }))),
          el('span', { class: 'stage-note', text: 'Press play to spin.' }),
          paytable(),
        ]);
        return;
      }
      if (isCrash) {
        render(stage, [
          el('span', { class: 'stage-label', text: 'Crash point' }),
          el('span', { class: 'stage-value', text: '—' }),
          el('div', { class: 'crash-track' }, [el('div', { class: 'crash-fill' })]),
          el('span', { class: 'stage-note', text: `Auto cash-out at ${formatMultiplier(state.autoCashout)}` }),
        ]);
        return;
      }
      render(stage, [
        el('span', { class: 'stage-label', text: 'Roll' }),
        el('span', { class: 'stage-value', text: '—' }),
        diceBoard(null, state.target),
        el('span', { class: 'stage-note', text: 'Press play to roll.' }),
      ]);
    }

    function paytable() {
      return el('div', { class: 'slot-paytable' }, [
        el('span', { text: '777 120×' }),
        el('span', { text: 'bell 50×' }),
        el('span', { text: 'bar 20×' }),
        el('span', { text: 'cherry 10×' }),
        el('span', { text: 'lemon 5×' }),
        el('span', { text: 'coin 2×' }),
      ]);
    }

    function diceBoard(roll, target) {
      const marker = el('span', { class: 'dice-marker', style: `left:${roll ? (roll / 100) * 100 : 0}%` });
      const targetMark = el('span', { class: 'dice-target', style: `left:${(target / 100) * 100}%` });
      return el('div', { class: 'dice-board' }, [el('div', { class: 'dice-bar' }, [targetMark, marker])]);
    }

    function refreshBalance() {
      balancePill.textContent = `Balance ${formatCredits(session.balance)}`;
    }

    /* ---- round submission ---- */
    async function play() {
      if (busy) return;
      const stake = clampStake(Number(stakeInput.value));
      state.stake = stake;
      stakeInput.value = String(stake);

      if (stake < game.minStake || stake > game.maxStake) {
        toast(`Stake must be between ${formatCredits(game.minStake)} and ${formatCredits(game.maxStake)}`, 'lose');
        return;
      }
      if (stake > session.balance) {
        toast('Not enough balance for that stake', 'lose');
        return;
      }

      busy = true;
      playButton.disabled = true;
      playButton.textContent = 'Playing…';

      const payload = { slug: game.slug, stake };
      if (isCrash) payload.autoCashout = state.autoCashout;
      if (isDice) {
        payload.target = state.target;
        payload.direction = state.direction;
      }

      startAnimation();

      try {
        const result = await api.play(payload);
        session.applyBalance(result.balance);
        refreshBalance();
        await finishAnimation(result);
        api.track('game_round', { slug: game.slug, stake, payout: result.payout });
        loadHistory();
      } catch (err) {
        stopAnimation();
        idleBoard();
        const message = err instanceof ApiError ? err.message : 'The round could not be played.';
        toast(message, 'lose');
        if (err instanceof ApiError && err.status === 401) {
          session.clear();
          navigate('#/login', { replace: true });
        }
      } finally {
        busy = false;
        playButton.disabled = false;
        playButton.textContent = 'Play';
      }
    }

    /* ---- animation (presentation only; the outcome already came from the server) ---- */
    let animationTimer = null;

    function startAnimation() {
      stopAnimation();
      if (isSlots) {
        const reels = [1, 2, 3].map(() => el('div', { class: 'slot-reel spinning', text: '▤' }));
        render(stage, [
          el('span', { class: 'stage-label', text: 'Spinning' }),
          el('div', { class: 'slot-reels' }, reels),
          el('span', { class: 'stage-note', text: 'Good luck…' }),
          paytable(),
        ]);
        return;
      }
      if (isCrash) {
        const fill = el('div', { class: 'crash-fill' });
        const value = el('span', { class: 'stage-value', text: '1.00×' });
        render(stage, [
          el('span', { class: 'stage-label', text: 'Climbing' }),
          value,
          el('div', { class: 'crash-track' }, [fill]),
          el('span', { class: 'stage-note', text: `Auto cash-out at ${formatMultiplier(state.autoCashout)}` }),
        ]);
        const started = Date.now();
        animationTimer = setInterval(() => {
          const t = Math.min(1, (Date.now() - started) / 1100);
          const shown = 1 + t * 3.2;
          value.textContent = formatMultiplier(shown);
          fill.style.width = `${Math.min(100, t * 100)}%`;
        }, 60);
        return;
      }
      const value = el('span', { class: 'stage-value', text: '…' });
      const marker = el('span', { class: 'dice-marker', style: 'left:0%' });
      const targetMark = el('span', { class: 'dice-target', style: `left:${(state.target / 100) * 100}%` });
      render(stage, [
        el('span', { class: 'stage-label', text: 'Rolling' }),
        value,
        el('div', { class: 'dice-board' }, [el('div', { class: 'dice-bar' }, [targetMark, marker])]),
        el('span', { class: 'stage-note', text: '…' }),
      ]);
      const started = Date.now();
      animationTimer = setInterval(() => {
        const t = Math.min(1, (Date.now() - started) / 900);
        value.textContent = String(Math.max(1, Math.round(t * 100)));
        marker.style.left = `${t * 100}%`;
      }, 60);
    }

    function stopAnimation() {
      if (animationTimer) clearInterval(animationTimer);
      animationTimer = null;
    }

    function finishAnimation(result) {
      return new Promise((resolve) => {
        const wait = isSlots ? 650 : isCrash ? 350 : 120;
        setTimeout(() => {
          stopAnimation();
          renderResult(result);
          resolve();
        }, wait);
      });
    }

    function renderResult(result) {
      const won = result.payout > 0;
      const outcome = result.outcome || {};
      if (isSlots) {
        const reels = outcome.reels || ['▤', '▤', '▤'];
        const glyph = { seven: '7', bell: '🔔', bar: '▬', cherry: '🍒', lemon: '🍋', coin: '🪙' };
        render(stage, [
          el('span', { class: 'stage-label', text: won ? 'Three of a kind' : 'No match' }),
          el('div', { class: 'slot-reels' }, reels.map((r) => el('div', { class: 'slot-reel', text: glyph[r] || r }))),
          el('span', {
            class: `stage-value ${won ? 'win' : 'lose'}`,
            style: 'font-size:26px',
            text: won ? `+${formatCredits(result.payout)}` : '−' + formatCredits(result.stake),
          }),
          paytable(),
        ]);
        toast(won ? `Won ${formatCredits(result.payout)} credits` : 'No win this spin', won ? 'win' : 'lose');
        return;
      }
      if (isCrash) {
        render(stage, [
          el('span', { class: 'stage-label', text: 'Crashed at' }),
          el('span', { class: `stage-value ${won ? 'win' : 'lose'}`, text: formatMultiplier(outcome.crashPoint || 1) }),
          el('div', { class: 'crash-track' }, [
            el('div', {
              class: 'crash-fill',
              style: `width:${Math.min(100, ((outcome.crashPoint || 1) / 10) * 100)}%`,
            }),
          ]),
          el('span', {
            class: 'stage-note',
            text: won
              ? `Cashed out at ${formatMultiplier(outcome.autoCashout)} · +${formatCredits(result.payout)}`
              : `Target ${formatMultiplier(outcome.autoCashout)} not reached · −${formatCredits(result.stake)}`,
          }),
        ]);
        toast(won ? `Cashed out ${formatMultiplier(outcome.autoCashout)} · +${formatCredits(result.payout)}` : 'Crashed before your target', won ? 'win' : 'lose');
        return;
      }
      render(stage, [
        el('span', { class: 'stage-label', text: 'Rolled' }),
        el('span', { class: `stage-value ${won ? 'win' : 'lose'}`, text: String(outcome.roll) }),
        diceBoard(outcome.roll, outcome.target || state.target),
        el('span', {
          class: 'stage-note',
          text: won
            ? `${outcome.direction === 'under' ? 'Under' : 'Over'} ${outcome.target} · ${formatMultiplier(outcome.multiplier)} · +${formatCredits(result.payout)}`
            : `${outcome.direction === 'under' ? 'Under' : 'Over'} ${outcome.target} · −${formatCredits(result.stake)}`,
        }),
      ]);
      toast(won ? `Won ${formatCredits(result.payout)} credits` : 'No win this roll', won ? 'win' : 'lose');
    }

    /* ---- history ---- */
    function historyRow(round) {
      const net = (round.payout || 0) - (round.stake || 0);
      return el('li', { class: 'round-row' }, [
        el('span', { class: 'round-game' }, [
          el('b', { text: round.multiplier ? formatMultiplier(round.multiplier) : '—' }),
          el('span', { class: 'round-stake', text: ` · stake ${formatCredits(round.stake)} · ${timeAgo(round.createdAt)}` }),
        ]),
        el('span', { class: `round-delta ${net >= 0 ? 'win' : 'lose'}`, text: `${net >= 0 ? '+' : ''}${formatCredits(net)}` }),
      ]);
    }

    async function loadHistory() {
      try {
        const value = await api.history(game.slug);
        const rounds = value.rounds || [];
        render(
          historyList,
          rounds.length
            ? rounds.slice(0, 12).map(historyRow)
            : [el('li', { class: 'round-row' }, [el('span', { class: 'muted tiny', text: 'No rounds yet.' })])],
        );
        historyHost.hidden = false;
      } catch (_) {
        historyHost.hidden = true;
      }
    }

    playButton.addEventListener('click', play);
    idleBoard();
    loadHistory();

    return [
      el('div', { class: 'game-head' }, [
        el('span', { class: 'tiny muted', text: game.tagline || '' }),
        balancePill,
      ]),
      stage,
      controls,
      rules,
      el('div', { class: 'section-head' }, [el('h2', { text: 'Your rounds' })]),
      historyHost,
    ];
  }

  function clampStake(value) {
    const n = Math.round(Number(value) || 0);
    if (!game) return Math.max(1, n);
    return Math.min(game.maxStake, Math.max(game.minStake, n));
  }

  load();

  return screen([head, body]);
}
