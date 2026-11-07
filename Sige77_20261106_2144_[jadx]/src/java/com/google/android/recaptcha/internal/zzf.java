package com.google.android.recaptcha.internal;

import defpackage.wx1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        if (exc instanceof wx1) {
            return new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage());
        }
        return exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
