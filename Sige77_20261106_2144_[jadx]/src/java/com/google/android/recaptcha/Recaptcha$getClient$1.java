package com.google.android.recaptcha;

import defpackage.fs;
import defpackage.ft;
import defpackage.gs;
import defpackage.rj1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Recaptcha$getClient$1 extends gs {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, fs fsVar) {
        super(fsVar);
        this.zzb = recaptcha;
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM1getClientBWLJW6A = this.zzb.m1getClientBWLJW6A(null, null, 0L, this);
        return objM1getClientBWLJW6A == ft.a ? objM1getClientBWLJW6A : new rj1(objM1getClientBWLJW6A);
    }
}
