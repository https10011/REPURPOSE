<?php
/** POST /api/auth/logout — revokes the session cookie and its row. */

declare(strict_types=1);

Http::cors();
Http::requireMethod('POST');
Auth::requireSameOrigin();

Auth::endSession();
Http::ok(['signedOut' => true]);
