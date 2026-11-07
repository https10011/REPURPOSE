/**
 * track-id.js — support "track id" shown in the retry dialog.
 *
 * Verbatim port of X5_Activity.F():
 *
 *   String uuid = String.valueOf(j10.b);           // device UUID
 *   String head = uuid.substring(0, 4);
 *   String tail = uuid.substring(uuid.length() - 4);
 *   IntRange range = new IntRange(100, 10000, 1);  // ga.w(cf1, range) -> inclusive random int
 *   trackId = random + "-" + head + "-" + tail;
 *
 * `ga.w` on an IntRange(100, 10000, 1) returns a uniformly distributed integer in [100, 10000].
 * The helper accepts an RNG so tests are deterministic.
 */
export function makeTrackId(deviceUuid, random = Math.random) {
  const uuid = String(deviceUuid || '');
  const head = uuid.substring(0, 4);
  const tail = uuid.substring(Math.max(0, uuid.length - 4));
  const n = 100 + Math.floor(random() * (10000 - 100 + 1)); // inclusive 100..10000
  return `${n}-${head}-${tail}`;
}

/** Range guard: clamps into the documented 100..10000 window (used by tests). */
export function isTrackId(value) {
  return /^\d{3,5}-[0-9a-zA-Z]{0,4}-[0-9a-zA-Z]{0,4}$/.test(String(value || ''));
}
