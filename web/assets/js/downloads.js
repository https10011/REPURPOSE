/**
 * downloads.js — replica of the WebView DownloadListener and its helpers.
 *
 * Android side (yg.k() + defpackage/zf.java, cg.java, dg.java):
 *   blob:…                              -> JS fetch -> FileReader -> window.Android.receiveBase64FromBlob
 *   data:image… / mime image/*          -> save into Pictures/AppDownload (t() / url2bitmap())
 *   *.apk                               -> download + system installer (progress dialog)
 *   anything else                       -> download with URLUtil.guessFileName()
 * Text payloads arriving through receiveBase64FromBlob go to downloadTextFileAction().
 *
 * Web equivalents: Blob + <a download>. "Saving to the gallery" has no browser equivalent, so
 * the file is downloaded through the normal browser download flow instead.
 */

import { t } from './i18n.js';
import { showToast } from './toast.js';

const EXT_BY_MIME = {
  'image/jpeg': 'jpg',
  'image/jpg': 'jpg',
  'image/png': 'png',
  'image/gif': 'gif',
  'image/webp': 'webp',
  'image/svg+xml': 'svg',
  'text/plain': 'txt',
  'text/html': 'html',
  'application/json': 'json',
  'application/pdf': 'pdf',
  'application/vnd.android.package-archive': 'apk',
};

/** URLUtil.guessFileName(url, contentDisposition, mimeType) */
export function guessFileName(url, contentDisposition = '', mimeType = '') {
  const fromDisposition = /filename\*?=(?:UTF-8'')?"?([^";]+)"?/i.exec(contentDisposition || '');
  if (fromDisposition && fromDisposition[1]) return decodeURIComponent(fromDisposition[1].trim());
  try {
    const base = globalThis.location?.href || 'http://localhost/';
    const path = new URL(url, base).pathname;
    const last = path.substring(path.lastIndexOf('/') + 1);
    if (last && last.includes('.')) return decodeURIComponent(last);
  } catch (_) {
    /* ignore malformed URLs */
  }
  const ext = EXT_BY_MIME[String(mimeType).split(';')[0].trim()] || 'bin';
  return `download_${Date.now()}.${ext}`;
}

function safeName(name, fallback = `download_${Date.now()}`) {
  const cleaned = String(name || '')
    .replace(/[\\/:*?"<>|\u0000-\u001f]/g, '_')
    .trim();
  return cleaned || fallback;
}

/** Triggers a browser download for a Blob. */
export function downloadBlob(blob, filename) {
  const url = URL.createObjectURL(blob);
  const a = document.createElement('a');
  a.href = url;
  a.download = safeName(filename);
  a.rel = 'noopener';
  document.body.appendChild(a);
  a.click();
  a.remove();
  setTimeout(() => URL.revokeObjectURL(url), 30000);
}

export function downloadUrl(url, filename, mimeType = '') {
  const a = document.createElement('a');
  a.href = url;
  a.download = safeName(filename || guessFileName(url, '', mimeType));
  a.rel = 'noopener';
  a.target = '_blank';
  document.body.appendChild(a);
  a.click();
  a.remove();
}

function dataUrlToBlob(dataUrl) {
  const [meta, payload] = String(dataUrl).split(',');
  const mime = /data:([^;]+)/.exec(meta || '')?.[1] || 'application/octet-stream';
  const isBase64 = /;base64/i.test(meta || '');
  const bytes = isBase64
    ? Uint8Array.from(atob(payload || ''), (c) => c.charCodeAt(0))
    : new TextEncoder().encode(decodeURIComponent(payload || ''));
  return new Blob([bytes], { type: mime });
}

/**
 * yg.t(String dataUrl) — "save picture from base64".
 * Android builds `img_<timestamp>.<ext>` from the MIME subtype; same naming here.
 */
export function savePictureBase64(dataUrl) {
  try {
    const mime = (/data:([^;]+)/.exec(dataUrl)?.[1] || 'image/png').toLowerCase();
    const ext = EXT_BY_MIME[mime] || mime.split('/')[1] || 'png';
    const blob = dataUrlToBlob(dataUrl);
    downloadBlob(blob, `img_${Date.now()}.${ext}`);
    showToast(t('save_success'));
    return true;
  } catch (err) {
    showToast(t('save_failed'));
    return false;
  }
}

/** yg.downloadTextFileAction(String base64) — text payload from the blob download path. */
export function downloadTextFile(base64OrDataUrl) {
  const raw = String(base64OrDataUrl ?? '');
  try {
    if (raw.startsWith('data:')) {
      downloadBlob(dataUrlToBlob(raw), `text_${Date.now()}.txt`);
      return true;
    }
    const decoded = atob(raw);
    const bytes = Uint8Array.from(decoded, (c) => c.charCodeAt(0));
    downloadBlob(new Blob([bytes], { type: 'application/octet-stream' }), `file_${Date.now()}`);
    return true;
  } catch (_) {
    // JSInterface.receiveBase64FromBlob also forwards error messages this way; surface them.
    showToast(t('save_failed'));
    return false;
  }
}

/** yg.url2bitmap(String url) — download a remote image. */
export async function downloadImageFromUrl(url) {
  try {
    const res = await fetch(url, { mode: 'cors', credentials: 'omit' });
    if (!res.ok) throw new Error(`HTTP ${res.status}`);
    const blob = await res.blob();
    downloadBlob(blob, guessFileName(url, '', blob.type || 'image/jpeg'));
    showToast(t('save_success'));
    return true;
  } catch (_) {
    // Cross-origin images without CORS cannot be fetched; fall back to navigation download.
    downloadUrl(url, guessFileName(url));
    return false;
  }
}

/** Text file export used by the debug console ("CleanLog" / log dump). */
export function downloadText(text, filename = 'shell-log.txt') {
  downloadBlob(new Blob([String(text ?? '')], { type: 'text/plain;charset=utf-8' }), filename);
}

/**
 * DownloadListener entry point. Every branch of the Android listener is represented.
 * @param {{url:string, contentDisposition?:string, mimeType?:string}} payload
 * @param {object} deps  { onBase64(dataUrl) } used for the blob: branch
 */
export async function handleDownloadStart(payload, deps = {}) {
  const url = String(payload?.url || '');
  const mime = String(payload?.mimeType || '');
  const lower = url.toLowerCase();

  if (url.startsWith('blob:')) {
    // Original: evaluateJavascript(fetch(blob) -> FileReader -> Android.receiveBase64FromBlob)
    try {
      const res = await fetch(url);
      const blob = await res.blob();
      const dataUrl = await new Promise((resolve, reject) => {
        const reader = new FileReader();
        reader.onload = () => resolve(String(reader.result));
        reader.onerror = () => reject(reader.error);
        reader.readAsDataURL(blob);
      });
      deps.onBase64?.(dataUrl);
      return true;
    } catch (err) {
      deps.onBase64?.(String(err?.message || err));
      return false;
    }
  }

  if (lower.startsWith('data:image') || mime.startsWith('image/')) {
    if (lower.startsWith('data:')) {
      return savePictureBase64(url);
    }
    return downloadImageFromUrl(url);
  }

  if (lower.endsWith('.apk')) {
    // The APK installer cannot run in a browser; the file still downloads so the user can
    // install it manually. On failure the original shows apk_install_failed.
    try {
      downloadUrl(url, guessFileName(url, payload?.contentDisposition, mime || 'application/vnd.android.package-archive'));
      return true;
    } catch (_) {
      showToast(t('apk_install_failed'));
      return false;
    }
  }

  downloadUrl(url, guessFileName(url, payload?.contentDisposition, mime));
  return true;
}
