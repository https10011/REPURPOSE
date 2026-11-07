/**
 * i18n.js — application strings.
 *
 * Source of truth: Sige77_20261106_2144_[jadx]/src/resources/package_1/res/values/strings.xml
 * Only strings that belong to the application itself are listed here (library strings are
 * irrelevant for the reconstruction). Names are kept identical to the Android resource names
 * so that future agents can trace every value back to the APK.
 *
 * `strings.xml` in the decompiled tree is the default (English) resource set, so the web
 * reconstruction is English by default — exactly like the APK on a device whose locale has
 * no translation. A zh-CN table is included because the loading dialog is hard-coded in
 * Chinese inside `yg.onCreate()` ("加载中...", "加载成功").
 */

export const STRINGS = {
  // --- resources/values/strings.xml -------------------------------------------------
  app_name: 'Sige77',
  alertDialog1: 'Reminder',
  alertDialog2: 'Ok to leave the game',
  alertDialog3: 'Cancel',
  alertDialog4: 'OK',
  ok: 'OK',
  cancel: 'Cancel',
  retry: 'Retry',
  no_network: 'No Network',
  domain_route_not_found: 'Can not find the fast route, please try again later.',
  find_fastest_route: "We've got the fastest line for you!",
  tip_speed_test: 'Trying to find the fastest line.',
  mloading_dialog: 'Loading…',
  mloading_dialog_succeed: 'Loaded!',
  prompt1: 'Warm reminder, the first load will be longer, please operate under WIFI',
  prompt2: 'After the first load, the next time you open it will not consume traffic, surprise!',
  prompt3: 'Trying to download, please be patient.',
  prompt4: 'I have already made a great effort to load it for you, and I will be ready soon.',
  save_image: 'Download Image',
  save_success: 'Saved successfully',
  save_failed: 'Save failed',
  copy: 'Copy',
  copy_toast_msg: 'Link copied to clipboard',
  camera: 'Camera',
  album: 'Album',
  file: 'File',
  uploadPicture: 'Please select the upload method',
  PERMISSION1: 'Cannot take pictures',
  PERMISSION2: 'You have not granted photo permission',
  PERMISSION3: 'cancel',
  PERMISSION4: 'Go to set',
  apk_install_failed: 'Sorry, download failed. Please check your network connection or try again later.',
  cleanCache: 'Successful Clean Log',
  cleanLog: 'CleanLog',
  logText: 'TestLogText',
  request_push_permission:
    "Enabling push notification permissions ensures that you won't miss out on important messages.",
  app_gcm_token: 'GCMToken',

  // --- hard-coded in yg.onCreate() ---------------------------------------------------
  loading_ring_text: '加载中...',
  loading_ring_succeed: '加载成功',
};

/** Additional shell strings that exist only as literals in the decompiled code. */
export const SHELL_TEXT = {
  bt_not_supported: 'Not supported in this browser',
  download_started: 'Download started',
  clipboard_denied: 'Clipboard permission denied',
  external_blocked: 'Popup blocked by the browser',
  no_domains: 'Domain route empty',
  debug_log_title: 'Shell log',
};

export function t(key, fallback = '') {
  return Object.prototype.hasOwnProperty.call(STRINGS, key) ? STRINGS[key] : fallback || key;
}
