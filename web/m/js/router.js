/**
 * router.js — hash router for the application layer.
 *
 * The hash is used deliberately: the page is framed by the shell at /m/index.html and may be
 * served from any sub-path, so path-based routing would break the moment the deployment root
 * changes. `#/home`, `#/games`, `#/game/:slug`, … therefore work identically everywhere, and the
 * browser back button drives the app exactly like the Android back button drives X5_Activity.
 *
 * Guarding happens here, not in the screens: `auth: true` routes bounce to `#/login` when there is
 * no session, and `auth: false` routes bounce to `#/home` when there is one (login/register/OTP).
 */

import { clear } from './ui.js';

function parseHash() {
  const raw = location.hash.replace(/^#/, '');
  const [path, queryString = ''] = raw.split('?');
  const query = Object.fromEntries(new URLSearchParams(queryString));
  return { path: path || '/', query };
}

function matchRoute(routes, path) {
  for (const route of routes) {
    const routeParts = route.path.split('/').filter(Boolean);
    const pathParts = path.split('/').filter(Boolean);
    if (routeParts.length !== pathParts.length) continue;
    const params = {};
    let ok = true;
    for (let i = 0; i < routeParts.length; i += 1) {
      const rp = routeParts[i];
      if (rp.startsWith(':')) params[rp.slice(1)] = decodeURIComponent(pathParts[i]);
      else if (rp !== pathParts[i]) {
        ok = false;
        break;
      }
    }
    if (ok) return { route, params };
  }
  return null;
}

export function createRouter({ routes, view, tabbar, getSession, onRoute }) {
  let current = null;
  let token = 0;

  function navigate(to, { replace = false } = {}) {
    const target = to.startsWith('#') ? to : `#${to}`;
    if (location.hash === target) {
      render();
      return;
    }
    if (replace) history.replaceState(null, '', target);
    else history.pushState(null, '', target);
    render();
  }

  function activeTab(route) {
    if (!tabbar) return;
    const tabs = tabbar.querySelectorAll('.tab');
    tabs.forEach((tab) => tab.classList.toggle('active', tab.dataset.tab === route.tab));
  }

  function setBadge(count) {
    const badge = document.querySelector('[data-badge="notifications"]');
    if (!badge) return;
    badge.textContent = count > 99 ? '99+' : String(count);
    badge.hidden = !count;
  }

  async function render() {
    const { path, query } = parseHash();
    const matched = matchRoute(routes, path);

    if (!matched) {
      navigate('#/home', { replace: true });
      return;
    }

    const { route, params } = matched;
    const signedIn = !!(getSession() && getSession().authenticated);

    if (route.auth === true && !signedIn) {
      navigate(`#/login?next=${encodeURIComponent(path)}`, { replace: true });
      return;
    }
    if (route.auth === false && signedIn) {
      navigate('#/home', { replace: true });
      return;
    }

    const myToken = ++token;
    current = { route, params };
    document.title = route.title ? `${route.title} · Sige77` : 'Sige77';
    activeTab(route);
    if (tabbar) tabbar.hidden = route.chrome === 'plain';

    clear(view);
    try {
      const screen = await route.screen();
      if (myToken !== token) return; // a newer navigation won
      const mount = screen.default || screen.mount;
      const ctx = {
        params,
        query,
        navigate,
        getSession,
        setBadge,
        rerender: render,
      };
      view.appendChild(await mount(ctx));
      if (typeof onRoute === 'function') onRoute(route, ctx);
    } catch (err) {
      if (myToken !== token) return;
      view.appendChild(
        (await import('./ui.js')).screen([
          (await import('./ui.js')).emptyState({
            icon: '⚠',
            title: 'Screen failed to load',
            text: String((err && err.message) || err),
          }),
        ]),
      );
      // eslint-disable-next-line no-console
      console.error('[app] route render failed', err);
    }
  }

  function start() {
    window.addEventListener('hashchange', render);
    if (!location.hash) history.replaceState(null, '', '#/');
    render();
  }

  return { start, navigate, render, setBadge, get current() { return current; } };
}
