package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzev {
    public static final zzrl zza(zzbn zzbnVar, zzbn zzbnVar2) {
        zzrj zzrjVarZzf = zzrl.zzf();
        zzrjVarZzf.zzq(zzqb.zzb(zzbnVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzrjVarZzf.zzr(zzpz.zza(zzbnVar.zza(timeUnit)));
        zzrjVarZzf.zze(zzqb.zzb(zzbnVar2.zzb()));
        zzrjVarZzf.zzf(zzpz.zza(zzbnVar2.zza(timeUnit)));
        return (zzrl) zzrjVarZzf.zzk();
    }
}
