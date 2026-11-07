package com.google.android.recaptcha.internal;

import defpackage.tv2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzhl implements zzgx {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            tv2.c(4, 3, null);
        } else {
            zzgdVar.zzc().zze(i, zzgdVar.zzc().zza(zzueVarArr[0]));
        }
    }
}
