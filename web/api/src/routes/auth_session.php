<?php
/** GET /api/auth/session — current account, or {authenticated:false}. */

declare(strict_types=1);

Http::cors();
Http::requireMethod('GET');

$user = Auth::user();
if ($user === null) {
    Http::ok(['authenticated' => false]);
}

Http::ok(['authenticated' => true, 'user' => Auth::publicUser($user)]);
