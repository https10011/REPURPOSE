/**
 * ui.js — shared DOM helpers for the application screens.
 *
 * Everything here is framework-free: the product layer must stay deployable on plain PHP
 * hosting, exactly like the shell. The helpers cover the small set of primitives every screen
 * needs — element building, escaping, toasts, sheets, dialogs and the loading/empty/error states
 * the directive requires on each screen.
 */

/* ------------------------------------------------------------------ escaping -- */

const ESCAPE_MAP = { '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' };

/** Escapes a value for interpolation into a template literal. Always use it for dynamic text. */
export function esc(value) {
  return String(value ?? '').replace(/[&<>"']/g, (c) => ESCAPE_MAP[c]);
}

/* ------------------------------------------------------------------ elements -- */

export function qs(selector, root = document) {
  return root.querySelector(selector);
}

export function qsa(selector, root = document) {
  return Array.from(root.querySelectorAll(selector));
}

export function clear(node) {
  while (node && node.firstChild) node.removeChild(node.firstChild);
  return node;
}

/** Builds an element: el('button', { class: 'btn', onclick: fn }, [childOrString]) */
export function el(tag, props = {}, children = []) {
  const node = document.createElement(tag);
  for (const [key, value] of Object.entries(props)) {
    if (value === null || value === undefined || value === false) continue;
    if (key === 'class') node.className = value;
    else if (key === 'text') node.textContent = value;
    else if (key === 'html') node.innerHTML = value;
    else if (key === 'dataset') Object.assign(node.dataset, value);
    else if (key.startsWith('on') && typeof value === 'function') node.addEventListener(key.slice(2), value);
    else if (key === 'value') node.value = value;
    else if (key in node) node[key] = value;
    else node.setAttribute(key, value);
  }
  for (const child of [].concat(children)) {
    if (child === null || child === undefined || child === false) continue;
    node.appendChild(typeof child === 'string' ? document.createTextNode(child) : child);
  }
  return node;
}

/** Replaces a host's children with the given nodes/strings. */
export function render(host, children) {
  clear(host);
  for (const child of [].concat(children)) {
    if (child === null || child === undefined || child === false) continue;
    host.appendChild(typeof child === 'string' ? document.createTextNode(child) : child);
  }
  return host;
}

/* -------------------------------------------------------------------- format -- */

export function formatCredits(value) {
  const n = Number(value) || 0;
  return n.toLocaleString('en-US');
}

export function formatMultiplier(value) {
  const n = Number(value) || 0;
  return `${n.toFixed(2)}×`;
}

export function timeAgo(iso) {
  if (!iso) return '';
  const then = new Date(String(iso).replace(' ', 'T') + (String(iso).includes('Z') ? '' : 'Z')).getTime();
  if (!Number.isFinite(then)) return String(iso);
  const diff = Math.max(0, Date.now() - then);
  const minutes = Math.floor(diff / 60000);
  if (minutes < 1) return 'just now';
  if (minutes < 60) return `${minutes}m ago`;
  const hours = Math.floor(minutes / 60);
  if (hours < 24) return `${hours}h ago`;
  const days = Math.floor(hours / 24);
  if (days < 7) return `${days}d ago`;
  return new Date(then).toLocaleDateString();
}

export function initials(name) {
  const parts = String(name || '?').trim().split(/\s+/).slice(0, 2);
  return parts.map((p) => p.charAt(0).toUpperCase()).join('') || '?';
}

/* -------------------------------------------------------------------- states -- */

export function skeletonList(kind = 'block', count = 3) {
  const nodes = [];
  for (let i = 0; i < count; i++) nodes.push(el('div', { class: `skeleton ${kind}` }));
  return el('div', { class: 'skeleton-wrap' }, nodes);
}

export function emptyState({ icon = '◌', title = 'Nothing here yet', text = '' } = {}) {
  return el('div', { class: 'empty' }, [
    el('span', { class: 'empty-icon', text: icon }),
    el('h3', { text: title }),
    text ? el('p', { text }) : null,
  ]);
}

export function errorState(message, onRetry) {
  return el('div', { class: 'error-box' }, [
    el('span', { text: message }),
    onRetry ? el('button', { type: 'button', text: 'Retry', onclick: onRetry }) : null,
  ]);
}

export function spinner() {
  return el('span', { class: 'spinner', role: 'presentation' });
}

/* -------------------------------------------------------------------- toast -- */

const TOAST_MS = 2400;

/** Transient feedback. Mirrors the shell toast but stays inside the app surface. */
export function toast(message, kind = '') {
  const host = qs('#toastHost');
  if (!host) return;
  const node = el('div', { class: `toast ${kind}`.trim(), role: 'status', text: message });
  host.appendChild(node);
  setTimeout(() => node.remove(), TOAST_MS);
}

/* -------------------------------------------------------------------- sheet -- */

/**
 * Bottom sheet with the given items. Resolves with the chosen item's `value`, or null when
 * dismissed by tapping the backdrop.
 */
export function openSheet(title, items) {
  const host = qs('#sheetHost');
  return new Promise((resolve) => {
    const close = (value) => {
      host.classList.remove('open');
      render(host, []);
      resolve(value);
    };
    const backdrop = el('div', { class: 'sheet-backdrop', onclick: () => close(null) });
    const sheet = el('div', { class: 'sheet', role: 'dialog' }, [
      title ? el('h3', { text: title }) : null,
      ...items.map((item) =>
        el('button', {
          type: 'button',
          class: `sheet-item${item.danger ? ' danger' : ''}`,
          text: item.label,
          onclick: () => close(item.value),
        }),
      ),
    ]);
    render(host, [backdrop, sheet]);
    host.classList.add('open');
  });
}

/* ------------------------------------------------------------------- dialog -- */

function openDialog({ title, message, confirmText = 'OK', cancelText = null, danger = false }) {
  const host = qs('#dialogHost');
  return new Promise((resolve) => {
    const close = (value) => {
      host.classList.remove('open');
      render(host, []);
      document.removeEventListener('keydown', onKey);
      resolve(value);
    };
    const onKey = (event) => {
      if (event.key === 'Escape') close(false);
    };
    const backdrop = el('div', { class: 'dialog-backdrop', onclick: () => close(false) });
    const actions = [
      cancelText
        ? el('button', { type: 'button', class: 'btn', text: cancelText, onclick: () => close(false) })
        : null,
      el('button', {
        type: 'button',
        class: `btn ${danger ? 'btn-danger' : 'btn-primary'}`,
        text: confirmText,
        onclick: () => close(true),
      }),
    ].filter(Boolean);
    const dialog = el('div', { class: 'dialog', role: 'alertdialog' }, [
      el('h3', { text: title }),
      message ? el('p', { text: message }) : null,
      el('div', { class: 'dialog-actions' }, actions),
    ]);
    render(host, [backdrop, dialog]);
    host.classList.add('open');
    document.addEventListener('keydown', onKey);
    dialog.querySelector('.btn-primary, .btn-danger')?.focus();
  });
}

export function confirmDialog(options) {
  return openDialog({ ...options, cancelText: options.cancelText || 'Cancel' });
}

export function alertDialog(options) {
  return openDialog({ ...options, cancelText: null }).then(() => undefined);
}

/* --------------------------------------------------------------------- head -- */

/**
 * Screen header. Returns the header element; `back` is a route string, `action` an optional
 * { label, onClick } pair rendered on the right.
 */
export function screenHead({ title, back = null, action = null, navigate = () => {} }) {
  const nodes = [];
  if (back) {
    nodes.push(
      el('button', {
        type: 'button',
        class: 'head-action back',
        'aria-label': 'Back',
        html: '&lsaquo;',
        onclick: () => navigate(back),
      }),
    );
  }
  nodes.push(el('h1', { text: title }));
  if (action) {
    nodes.push(
      el('button', {
        type: 'button',
        class: 'head-action',
        'aria-label': action.label,
        text: action.label,
        onclick: action.onClick,
      }),
    );
  }
  return el('header', { class: 'screen-head' }, nodes);
}

/** Wraps a screen body in the standard container. */
export function screen(children) {
  return el('section', { class: 'screen' }, children);
}
