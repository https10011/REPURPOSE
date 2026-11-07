/**
 * app.js — boot sequence and routing table of the application served at /m/index.html.
 *
 * Boot mirrors the shell's own lifecycle: resolve the session first (the server is the authority),
 * then hand control to the hash router. While that first call is in flight the boot screen is shown;
 * once it answers, the router decides between the auth screens and the signed-in screens, so a
 * signed-in user never sees a flash of the login form.
 *
 * Route table (directive §17.4):
 *   #/               -> #/home or #/login depending on the session
 *   #/login          public
 *   #/register       public
 *   #/otp            public (a session does not exist yet)
 *   #/home           session required
 *   #/games          session required
 *   #/game/:slug     session required
 *   #/notifications  session required
 *   #/profile        session required
 */

import { api, ApiError } from './api.js';
import { session } from './store.js';
import { createRouter } from './router.js';
import { clear, qs } from './ui.js';

const view = qs('#view');
const tabbar = qs('#tabbar');
const app = qs('#app');
const boot = qs('#boot');
const bootText = qs('#bootText');

const ROUTES = [
  {
    path: '/',
    auth: null,
    chrome: 'plain',
    screen: () => import('./screens/home.js'),
    redirect: true,
  },
  { path: '/login', auth: false, chrome: 'plain', title: 'Sign in', screen: () => import('./screens/login.js') },
  { path: '/register', auth: false, chrome: 'plain', title: 'Create account', screen: () => import('./screens/register.js') },
  { path: '/otp', auth: false, chrome: 'plain', title: 'Verify', screen: () => import('./screens/otp.js') },
  { path: '/home', auth: true, tab: 'home', title: 'Home', screen: () => import('./screens/home.js') },
  { path: '/games', auth: true, tab: 'games', title: 'Games', screen: () => import('./screens/games.js') },
  { path: '/game/:slug', auth: true, tab: 'games', title: 'Game', screen: () => import('./screens/game.js') },
  { path: '/notifications', auth: true, tab: 'notifications', title: 'Notifications', screen: () => import('./screens/notifications.js') },
  { path: '/profile', auth: true, tab: 'profile', title: 'Profile', screen: () => import('./screens/profile.js') },
];

const router = createRouter({
  routes: ROUTES,
  view,
  tabbar,
  getSession: () => session,
});

/* The `/` route is only a redirect: it forwards to home or login once the session is known. */
const rootRoute = ROUTES.find((r) => r.redirect);
rootRoute.screen = async () => ({
  default: () => {
    router.navigate(session.authenticated ? '#/home' : '#/login', { replace: true });
    return document.createElement('div');
  },
});

function showApp() {
  boot.classList.add('hidden');
  app.hidden = false;
}

async function boot0() {
  bootText.textContent = 'Restoring your session…';
  try {
    const value = await api.session();
    session.set(value);
  } catch (err) {
    // A backend that is unreachable must not brick the page: fall back to signed-out and let the
    // login screen surface the real error when the user submits.
    session.clear();
    if (!(err instanceof ApiError)) console.error('[app] session bootstrap failed', err);
  }
  showApp();
  router.start();
}

// Expose the session and router for the shell harness and for debugging, exactly like the shell
// exposes its own state to the page. Read-only usage is expected.
window.Sige77App = { session, router, api };

boot0();
