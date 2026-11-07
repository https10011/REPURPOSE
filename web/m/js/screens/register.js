/**
 * register.js — #/register (directive §17.3-B #11).
 *
 * Name, phone number, password and confirmation. The account is created in this application's own
 * database (`POST /api/auth/register`) and the phone number is then verified through the local
 * one-time code flow, which is why a successful submit navigates to `#/otp` instead of home.
 */

import { api, ApiError } from '../api.js';
import { store } from '../store.js';
import { el, screen } from '../ui.js';
import { deliverOtp, requestPermission } from '../notify.js';

export default function register({ navigate }) {
  let busy = false;

  const errorBox = el('p', { class: 'form-error', role: 'alert' });

  const nameInput = el('input', { type: 'text', autocomplete: 'name', placeholder: 'Your name', required: true });
  const phoneInput = el('input', {
    type: 'tel',
    inputmode: 'tel',
    autocomplete: 'tel',
    placeholder: '09XX XXX XXXX',
    required: true,
  });
  const passwordInput = el('input', {
    type: 'password',
    autocomplete: 'new-password',
    placeholder: 'At least 8 characters',
    required: true,
  });
  const confirmInput = el('input', {
    type: 'password',
    autocomplete: 'new-password',
    placeholder: 'Repeat your password',
    required: true,
  });

  function field(label, input, hint) {
    const error = el('p', { class: 'field-error' });
    const wrap = el('div', { class: 'field' }, [
      el('label', { text: label }),
      input,
      hint ? el('p', { class: 'field-hint', text: hint }) : null,
      error,
    ]);
    return { wrap, error, input };
  }

  const nameField = field('Full name', nameInput);
  const phoneField = field('Phone number', phoneInput, 'Used to sign in. Any format is accepted.');
  const passwordField = field('Password', passwordInput);
  const confirmField = field('Confirm password', confirmInput);

  const submit = el('button', { type: 'submit', class: 'btn btn-primary', text: 'Create account' });

  function reset() {
    errorBox.textContent = '';
    [nameField, phoneField, passwordField, confirmField].forEach((f) => {
      f.wrap.classList.remove('invalid');
      f.error.textContent = '';
    });
  }

  function validate() {
    reset();
    let ok = true;
    if (nameInput.value.trim().length < 2) {
      nameField.wrap.classList.add('invalid');
      nameField.error.textContent = 'Enter your name (at least 2 characters).';
      ok = false;
    }
    if (phoneInput.value.replace(/\D+/g, '').length < 8) {
      phoneField.wrap.classList.add('invalid');
      phoneField.error.textContent = 'Enter a valid phone number.';
      ok = false;
    }
    if (passwordInput.value.length < 8) {
      passwordField.wrap.classList.add('invalid');
      passwordField.error.textContent = 'Password must be at least 8 characters.';
      ok = false;
    } else if (passwordInput.value !== confirmInput.value) {
      confirmField.wrap.classList.add('invalid');
      confirmField.error.textContent = 'The passwords do not match.';
      ok = false;
    }
    return ok;
  }

  const form = el('form', { novalidate: true }, [
    errorBox,
    nameField.wrap,
    phoneField.wrap,
    passwordField.wrap,
    confirmField.wrap,
    el('p', { class: 'field-hint', text: 'By creating an account you accept the Sige77 terms of use.' }),
    submit,
  ]);

  form.addEventListener('submit', async (event) => {
    event.preventDefault();
    if (busy || !validate()) return;
    busy = true;
    submit.disabled = true;
    submit.textContent = 'Creating account…';

    const phone = phoneInput.value.trim();
    try {
      // Ask for notification permission in the same user gesture as the submit, then let the
      // backend issue the code. A denial is fine: the OTP screen shows the code in-app.
      await requestPermission();

      const value = await api.register({
        name: nameInput.value.trim(),
        phone,
        password: passwordInput.value,
        passwordConfirm: confirmInput.value,
      });

      store.set('lastPhone', phone);
      const delivered = deliverOtp(value.otp || {});
      store.set('pendingOtpPhone', value.phone);
      store.set('pendingOtpCode', (value.otp && value.otp.code) || '');
      store.set('pendingOtpNotify', delivered ? '1' : '0');
      api.track('register', { phone: value.phone });

      navigate(`#/otp?phone=${encodeURIComponent(value.phone)}&purpose=register`);
    } catch (err) {
      errorBox.textContent = err instanceof ApiError ? err.message : 'Could not create the account.';
      if (err instanceof ApiError && err.code === 'phone_taken') {
        phoneField.wrap.classList.add('invalid');
        phoneField.error.textContent = 'That number already has an account.';
      }
    } finally {
      busy = false;
      submit.disabled = false;
      submit.textContent = 'Create account';
    }
  });

  return screen([
    el('div', { class: 'auth' }, [
      el('div', { class: 'auth-logo' }, [
        el('img', { src: '../assets/img/splash_logo.jpg', alt: 'Sige77' }),
        el('h1', { text: 'Create account' }),
        el('p', { class: 'auth-sub', text: 'Register with your phone number.' }),
      ]),
      form,
      el('p', { class: 'auth-alt' }, [
        'Already registered? ',
        el('a', { href: '#/login', text: 'Sign in' }),
      ]),
    ]),
  ]);
}
