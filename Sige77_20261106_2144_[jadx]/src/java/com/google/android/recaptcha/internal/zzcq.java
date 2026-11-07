package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import defpackage.fs;
import defpackage.i7;
import defpackage.qt;
import defpackage.wx1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, fs fsVar) throws wx1, RecaptchaException, i7 {
        return zzcv.zzh(zza(application), str, j, null, null, null, fsVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) throws wx1, RecaptchaException, i7 {
        return zzas.zza(qt.b(zza(application).zzd().zza(), new zzco(application, str, j, null)));
    }

    public static final Object zzd(Application application, String str, fs fsVar) throws RecaptchaException, i7 {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, fsVar, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, i7 {
        return zzas.zza(qt.b(zza(application).zzd().zza(), new zzcp(application, str, null)));
    }
}
