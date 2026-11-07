/**
 * app-config.js — static equivalent of the AndroidManifest <meta-data> block.
 *
 * Every value below is copied verbatim from
 *   Sige77_20261106_2144_[jadx]/AndroidManifest.xml
 * and is read by `AppTestApp.onCreate()` in the APK. In the Android app these values are
 * compiled into the binary, so they are equally static here; the PHP backend can override
 * them at runtime via GET /api/app/config (see mergeRemoteConfig) which mirrors the fact that
 * the merchant controls the values at build time.
 *
 * NOTE: `merchant_url` is the seed domain list, `backupDomain` is the last-resort source of
 * domain routes — both are used by the resolver in domain-route.js.
 */

export const MANIFEST = Object.freeze({
  packageName: 'prod.app_sige7tlbf5.com',
  merchant: 'sige7tlbf5',
  appName: 'Sige77',
  version: '2.4.87',
  versionCode: 1,
  merchantUrls: [
    'https://www.77sige.club',
    'https://www.77sige.net',
    'https://www.sige77.app',
    'https://www.sige777.net',
    'https://www.sige777.club',
    'https://www.sige777.vip',
    'https://www.sige77a.com',
    'https://www.sige77a.org',
    'https://www.sige77a.app',
    'https://www.sige77a.net',
    'https://www.49704794.com',
  ],
  backupDomain: 'https://www.112121313.com',
  // meta-data that the client sanitises (`d.h()` = trim + lowercase, "0" -> "")
  affiliateCode: '_',
  fbPixelId: '_',
  tid: '_0',
  adjustDefaultTracker: '_0',
  snowBallAppId: '_',
  adjustAppToken:  '',
  appsFlyerKey:   '',
  openInstallKey: '0',
  agentName:      '',
  device: 1,
  // `isSingleLine = 0` in the manifest -> the /m/index.html suffix is appended (X5_Activity.E)
  isSingleLine: false,
  // google-services values present in strings.xml (needed by the bridge's FCM/OAuth stubs)
  firebase: {
    projectId: 'tcg-sige77-0122',
    appId: '1:146421029714:android:f0781f13fc9e414483388b',
    senderId: '146421029714',
    // The Web API key from strings.xml is deliberately not copied into the repository.
    // Nothing in this reconstruction reads it (Firebase/FCM is BLOCKED, see §13); a real
    // deployment supplies its own value. Evidence: Sige77_20261106_2144_[jadx]/resources/
    // res/values/strings.xml (google_api_key).
    apiKey: '',
    storageBucket: 'tcg-sige77-0122.firebasestorage.app',
    webClientId: '146421029714-rh3et1nsad7vmvo8ld9tlj6901hg5afa.apps.googleusercontent.com',
  },
  // android:theme="@style/SplashTheme" -> shape_splash.xml (white bg + centred logo)
  splash: {
    background: 'assets/img/splash_bg.jpg',
    logo: 'assets/img/splash_logo.jpg',
    // yg.onCreate() uses icon_bg as the `loading` overlay bitmap (scaleType=centerCrop)
    loadingImage: 'assets/img/icon_bg.jpg',
  },
  // WebViewCacheInterceptor configuration (AppTestApp.onCreate)
  cacheConfig: {
    maxBytes: 104857600,
    connectTimeoutSec: 15,
    readTimeoutSec: 15,
    // cacheExtensionConfig.addExtension("json").removeExtension(html|htm|swf)
    cachedExtensions: ['json'],
    excludedExtensions: ['html', 'htm', 'swf'],
  },
  // rm.c() speed-test configuration
  resolver: {
    maxCandidates: 20,
    requestTimeoutMs: 5000,
    connectTimeoutMs: 3000,
    lastUrlTtlMs: 86400000,
  },
});

/**
 * `ea.q(CharSequence)` in the APK: true when the value contains at least one
 * non-whitespace character. Note that placeholder values such as "_" or "_0" ARE
 * considered configured by the original code, which is why they end up in the
 * decorated URL — reproduced verbatim rather than "cleaned up".
 */
export function isConfigured(value) {
  if (value === null || value === undefined) return false;
  return String(value).trim().length > 0;
}

/** `d.h()` in the APK: trim + lowercase. */
export function normaliseFlag(value) {
  if (value === null || value === undefined) return '';
  const s = String(value).trim().toLowerCase();
  return s === '0' ? '' : s;
}

/**
 * Merges the server-side configuration (GET /api/app/config) over the compiled defaults.
 * The backend is authoritative for the domain lists and splash URL, exactly like the merchant
 * controls them at build/serve time in the Android distribution.
 */
export function mergeRemoteConfig(base, remote) {
  if (!remote || typeof remote !== 'object') return base;
  const merged = { ...base };
  const scalar = ['merchant', 'appName', 'version', 'backupDomain', 'agentName', 'affiliateCode', 'fbPixelId', 'tid', 'snowBallAppId', 'splashUrl'];
  for (const key of scalar) {
    if (remote[key] !== undefined && remote[key] !== null) merged[key] = remote[key];
  }
  if (Array.isArray(remote.merchantUrls) && remote.merchantUrls.length) {
    merged.merchantUrls = remote.merchantUrls.slice();
  }
  if (remote.device !== undefined) merged.device = Number(remote.device) || 1;
  if (remote.isSingleLine !== undefined) merged.isSingleLine = !!Number(remote.isSingleLine);
  if (remote.resolver && typeof remote.resolver === 'object') {
    merged.resolver = { ...merged.resolver, ...remote.resolver };
  }
  return merged;
}
