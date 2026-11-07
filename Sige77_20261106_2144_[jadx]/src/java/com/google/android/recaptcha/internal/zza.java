package com.google.android.recaptcha.internal;

import defpackage.fs;
import defpackage.ft;
import defpackage.gs;
import defpackage.rj1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zza extends gs {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, fs fsVar) {
        super(fsVar);
        this.zzd = zzeVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == ft.a ? objZzc : new rj1(objZzc);
    }
}
