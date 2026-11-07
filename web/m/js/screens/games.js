/**
 * games.js — #/games (directive §17.3-B #14).
 *
 * Full catalog with a search field and category chips, backed by `GET /api/games?category&q`.
 * Loading shows tiles, an empty result shows the empty state, and a failure shows a retry box.
 */

import { api, ApiError } from '../api.js';
import {
  el,
  emptyState,
  errorState,
  render,
  screen,
  screenHead,
  skeletonList,
} from '../ui.js';
import { gameTile } from '../partials/game-tile.js';

export default function games({ navigate }) {
  const body = el('div', {}, [skeletonList('tile', 6)]);
  let category = 'all';
  let search = '';
  let debounce = null;
  let categories = ['all'];

  const searchInput = el('input', {
    type: 'search',
    placeholder: 'Search games',
    'aria-label': 'Search games',
  });
  const chips = el('div', { class: 'chips' });

  searchInput.addEventListener('input', () => {
    search = searchInput.value.trim();
    clearTimeout(debounce);
    debounce = setTimeout(load, 220);
  });

  function renderChips() {
    render(
      chips,
      categories.map((name) =>
        el('button', {
          type: 'button',
          class: `chip${name === category ? ' active' : ''}`,
          text: name === 'all' ? 'All' : name.charAt(0).toUpperCase() + name.slice(1),
          onclick: () => {
            category = name;
            renderChips();
            load();
          },
        }),
      ),
    );
  }

  async function load() {
    render(body, [skeletonList('tile', 6)]);
    try {
      const value = await api.games({ category, q: search });
      const list = value.games || [];
      if (Array.isArray(value.categories) && value.categories.length) {
        categories = ['all', ...value.categories];
        renderChips();
      }
      render(
        body,
        list.length
          ? el('div', { class: 'game-grid' }, list.map((game) => gameTile(game, navigate)))
          : emptyState({
              icon: '⌕',
              title: 'No games match',
              text: search ? `Nothing found for “${search}”.` : 'This category is empty.',
            }),
      );
    } catch (err) {
      render(body, [errorState(err instanceof ApiError ? err.message : 'Could not load the catalog.', load)]);
    }
  }

  renderChips();
  load();

  return screen([
    screenHead({ title: 'Games', back: '#/home', navigate }),
    el('div', { class: 'search-field' }, [searchInput]),
    chips,
    body,
  ]);
}
