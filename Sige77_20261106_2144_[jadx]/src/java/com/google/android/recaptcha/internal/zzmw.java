package com.google.android.recaptcha.internal;

import defpackage.e;
import defpackage.sm0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzmw implements zzog {
    private static final zzmw zza = new zzmw();

    private zzmw() {
    }

    public static zzmw zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        if (!zznd.class.isAssignableFrom(cls)) {
            e.g("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzof) zznd.zzu(cls.asSubclass(zznd.class)).zzh(3, null, null);
        } catch (Exception e) {
            sm0.m("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        return zznd.class.isAssignableFrom(cls);
    }
}
