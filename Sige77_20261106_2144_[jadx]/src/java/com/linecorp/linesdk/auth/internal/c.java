package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineLoginResult;
import defpackage.jx0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c implements Runnable {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.a;
        LineAuthenticationStatus lineAuthenticationStatus = dVar.h;
        LineAuthenticationActivity lineAuthenticationActivity = dVar.a;
        if (lineAuthenticationStatus.e == 3 || lineAuthenticationActivity.isFinishing()) {
            return;
        }
        Intent intent = d.i;
        if (intent == null) {
            lineAuthenticationActivity.a(LineLoginResult.a(jx0.b, LineApiError.d));
        } else {
            dVar.a(intent);
            d.i = null;
        }
    }
}
