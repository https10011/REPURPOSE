/**
 * login.js — #/login (directive §17.3-B #10).
 *
 * Phone number + password sign-in against this application's own backend. Unknown phone and wrong
 * password produce the same generic message, exactly like `POST /api/auth/login` does, so the form
 * never reveals which numbers are registered.
 */

import { api, ApiError } from '../api.js';
import { session, store } from '../store.js';
import { alertDialog, el, screen, toast } from '../ui.js';

export default function login({ query, navigate }) {
  let busy = false;

  const errorBox = el('p', { class: 'form-error', role: 'alert' });
  const phoneInput = el('input', {
    type: 'tel',
    name: 'phone',
    inputmode: 'tel',
    autocomplete: 'tel',
    placeholder: '09XX XXX XXXX',
    required: true,
    value: store.get('lastPhone', ''),
  });
  const passwordInput = el('input', {
    type: 'password',
    name: 'password',
    autocomplete: 'current-password',
    placeholder: 'Your password',
    required: true,
  });
  const phoneError = el('p', { class: 'field-error' });
  const passwordError = el('p', { class: 'field-error' });
  const phoneField = el('div', { class: 'field' }, [el('label', { text: 'Phone number' }), phoneInput, phoneError]);
  const passwordField = el('div', { class: 'field' }, [
    el('label', { text: 'Password' }),
    passwordInput,
    passwordError,
  ]);

  const submit = el('button', { type: 'submit', class: 'btn btn-primary', text: 'Sign in' });

  function clearErrors() {
    errorBox.textContent = '';
    phoneField.classList.remove('invalid');
    passwordField.classList.remove('invalid');
    phoneError.textContent = '';
    passwordError.textContent = '';
  }

  function validate() {
    clearErrors();
    let ok = true;
    const phone = phoneInput.value.replace(/\D+/g, '');
    if (phone.length < 8) {
      phoneField.classList.add('invalid');
      phoneError.textContent = 'Enter the phone number you registered with.';
      ok = false;
    }
    if (passwordInput.value.length < 6) {
      passwordField.classList.add('invalid');
      passwordError.textContent = 'Enter your password.';
      ok = false;
    }
    return ok;
  }

  const form = el('form', { novalidate: true }, [
    errorBox,
    phoneField,
    passwordField,
    submit,
  ]);

  form.addEventListener('submit', async (event) => {
    event.preventDefault();
    if (busy || !validate()) return;
    busy = true;
    submit.disabled = true;
    submit.textContent = 'Signing in…';

    const phone = phoneInput.value.trim();
    try {
      const value = await api.login({ phone, password: passwordInput.value });
      session.set({ authenticated: true, user: value.user });
      store.set('lastPhone', phone);
      api.track('login', { phone: value.user.phone });
      toast(`Welcome back, ${value.user.name.split(' ')[0]}`, 'win');
      navigate(query.next ? `#${query.next}` : '#/home', { replace: true });
    } catch (err) {
      const message =
        err instanceof ApiError
          ? err.message
          : 'Something went wrong. Please try again.';
      errorBox.textContent = message;
      if (err instanceof ApiError && err.code === 'invalid_credentials') {
        passwordField.classList.add('invalid');
        passwordInput.value = '';
        passwordInput.focus();
      }
    } finally {
      busy = false;
      submit.disabled = false;
      submit.textContent = 'Sign in';
    }
  });

  const forgot = el('button', {
    type: 'button',
    class: 'btn btn-ghost',
    text: 'Forgot your password?',
    onclick: () =>
      alertDialog({
        title: 'Password recovery',
        message:
          'Accounts are restored with a verification code sent to your registered number. ' +
          'This build has no SMS gateway, so recovery is performed by the operator. ' +
          'Create a new account if you no longer have access.',
        confirmText: 'OK',
      }),
  });

  return screen([
    el('div', { class: 'auth' }, [
      el('div', { class: 'auth-logo' }, [
        el('img', { src: '../assets/img/splash_logo.jpg', alt: 'Sige77' }),
        el('h1', { text: 'Sign in' }),
        el('p', { class: 'auth-sub', text: 'Use the phone number and password of your Sige77 account.' }),
      ]),
      form,
      forgot,
      el('p', { class: 'auth-alt' }, [
        'New here? ',
        el('a', { href: '#/register', text: 'Create an account' }),
      ]),
    ]),
  ]);
}
