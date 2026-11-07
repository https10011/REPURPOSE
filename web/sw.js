/**
 * sw.js — Service Worker equivalent of `jg.shouldInterceptRequest()` +
 * `WebViewCacheInterceptor`.
 *
 * Android behaviour reproduced:
 *   1. Offline assets (yg.onCreate lists `assets/offline/`, intercepted by *file name*):
 *        js  -> application/x-javascript
 *        css -> text/css
 *        else-> text/html
 *        header Access-Control-Allow-Origin: *
 *      The decompiled APK ships no `assets/offline` folder, so `web/offline/` is a local sample
 *      set (documented in docs/RECONSTRUCTION_NOTES.md). Interception rules are identical.
 *   2. HTTP cache: `cacheExtensionConfig.addExtension("json")` with
 *      `removeExtension(html|htm|swf)`, CacheType.FORCE, 100 MB — therefore only `.json`
 *      responses are served cache-first; html/js/css always go to the network.
 *
 * Everything else is passed through untouched.
 */

const CACHE_NAME = 'sige77-shell-v1';
const OFFLINE_PREFIX = new URL('offline/', self.registration ? self.registration.scope : self.location.href).pathname;
const JSON_CACHE_MAX_AGE = 1000 * 60 * 60 * 24; // 24h, mirrors the resolver cache TTL

const MIME_BY_EXT = { js: 'application/x-javascript', css: 'text/css' };

function offlineMime(pathname) {
  const ext = pathname.split('.').pop().toLowerCase();
  return MIME_BY_EXT[ext] || 'text/html';
}

self.addEventListener('install', (event) => {
  self.skipWaiting();
  event.waitUntil(
    caches.open(CACHE_NAME).then((cache) =>
      // Pre-cache the sample offline bundle if present; failures are non-fatal.
      Promise.all(
        ['index.html', 'app.css', 'app.js'].map((file) =>
          cache.add(new Request(`offline/${file}`, { cache: 'reload' })).catch(() => {}),
        ),
      ),
    ),
  );
});

self.addEventListener('activate', (event) => {
  event.waitUntil(
    (async () => {
      const names = await caches.keys();
      await Promise.all(names.filter((n) => n !== CACHE_NAME).map((n) => caches.delete(n)));
      await self.clients.claim();
    })(),
  );
});

self.addEventListener('fetch', (event) => {
  const request = event.request;
  if (request.method !== 'GET') return;

  const url = new URL(request.url);
  if (url.origin !== self.location.origin) return;

  // 1) offline assets — cache first, by file name
  if (url.pathname.startsWith(OFFLINE_PREFIX)) {
    event.respondWith(
      (async () => {
        const cache = await caches.open(CACHE_NAME);
        const cached = await cache.match(request, { ignoreSearch: true });
        if (cached) {
          const body = await cached.blob();
          return new Response(body, {
            status: 200,
            statusText: 'OK',
            headers: {
              'Content-Type': offlineMime(url.pathname),
              'Access-Control-Allow-Origin': '*',
              'Cache-Control': 'no-cache',
            },
          });
        }
        const response = await fetch(request);
        if (response.ok) cache.put(request, response.clone());
        return response;
      })(),
    );
    return;
  }

  // 2) JSON HTTP cache (FORCE mode for `.json` only)
  if (url.pathname.endsWith('.json')) {
    event.respondWith(
      (async () => {
        const cache = await caches.open(CACHE_NAME);
        const cached = await cache.match(request);
        if (cached) {
          const age = Date.now() - new Date(cached.headers.get('date') || 0).getTime();
          if (Number.isFinite(age) && age < JSON_CACHE_MAX_AGE) return cached;
        }
        try {
          const response = await fetch(request);
          if (response.ok) cache.put(request, response.clone());
          return response;
        } catch (err) {
          if (cached) return cached;
          throw err;
        }
      })(),
    );
  }

  // html / htm / swf / everything else: default network behaviour (no interception)
});

/** Push notification equivalent of MyFirebaseMessagingService.onMessageReceived(). */
self.addEventListener('push', (event) => {
  let payload = {};
  try {
    payload = event.data ? event.data.json() : {};
  } catch (_) {
    payload = { title: 'Sige77', body: event.data ? event.data.text() : '' };
  }
  const title = payload.title || payload.notification?.title || 'Sige77';
  const body = payload.body || payload.notification?.body || '';
  const icon = payload.icon || 'assets/img/ic_launcher.png';
  event.waitUntil(
    self.registration.showNotification(title, {
      body,
      icon,
      badge: icon,
      data: { url: payload.url || self.registration.scope },
      silent: payload.mute === '1' || payload.mute === 1,
    }),
  );
});

self.addEventListener('notificationclick', (event) => {
  event.notification.close();
  const url = event.notification.data?.url || self.registration.scope;
  event.waitUntil(
    self.clients.matchAll({ type: 'window', includeUncontrolled: true }).then((clients) => {
      const existing = clients.find((c) => c.url.startsWith(self.registration.scope));
      if (existing) return existing.focus();
      return self.clients.openWindow(url);
    }),
  );
});
