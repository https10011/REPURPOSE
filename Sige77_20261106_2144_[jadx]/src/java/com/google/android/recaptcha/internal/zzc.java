package com.google.android.recaptcha.internal;

import defpackage.fs;
import defpackage.ft;
import defpackage.gs;
import defpackage.rj1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzc extends gs {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, fs fsVar) {
        super(fsVar);
        this.zzc = zzeVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == ft.a ? objZze : new rj1(objZze);
    }
}
