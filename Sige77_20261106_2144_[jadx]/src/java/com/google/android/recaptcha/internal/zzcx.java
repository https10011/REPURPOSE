package com.google.android.recaptcha.internal;

import defpackage.fs;
import defpackage.ft;
import defpackage.gs;
import defpackage.rj1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzcx extends gs {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, fs fsVar) {
        super(fsVar);
        this.zzb = zzdcVar;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo3executegIAlus = this.zzb.mo3executegIAlus(null, this);
        return objMo3executegIAlus == ft.a ? objMo3executegIAlus : new rj1(objMo3executegIAlus);
    }
}
