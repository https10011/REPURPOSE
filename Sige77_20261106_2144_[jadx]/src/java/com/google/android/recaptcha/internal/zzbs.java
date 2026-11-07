package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.rj0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzbs {
    private final rj0 zza;

    public zzbs() {
        this.zza = rj0.b;
    }

    public final int zza(Context context) {
        int iB = this.zza.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public zzbs(rj0 rj0Var) {
        this.zza = rj0Var;
    }
}
