/**
 * game-tile.js — catalog tile shared by #/home and #/games.
 *
 * A tile is always clickable: playable games open `#/game/:slug`, blocked ones open the same route
 * so the screen can present the documented placeholder (directive §17.7). Nothing is silently
 * disabled, and the status badge states which case it is.
 */

import { el, esc } from '../ui.js';

const ART = {
  crash: '↗',
  dice: '⚄',
  slots: '▤',
  'live-casino': '♠',
};

export function gameTile(game, navigate) {
  const blocked = game.status !== 'playable';
  return el('button', {
    type: 'button',
    class: 'game-tile',
    'data-slug': game.slug,
    onclick: () => navigate(`#/game/${encodeURIComponent(game.slug)}`),
  }, [
    el('span', { class: `tile-badge${blocked ? ' blocked' : ''}`, text: blocked ? 'Soon' : 'Play' }),
    el('span', { class: 'tile-art', html: esc(ART[game.slug] || '◉') }),
    el('h3', { text: game.name }),
    el('p', { text: game.tagline || '' }),
  ]);
}
