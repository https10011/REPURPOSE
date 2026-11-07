package com.google.android.recaptcha.internal;

import defpackage.bp;
import defpackage.cp;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzdx extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzecVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzdx(this.zzb, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            bp bpVar = this.zzb.zzc;
            this.zza = 1;
            if (((cp) bpVar).i(this) == ftVar) {
                return ftVar;
            }
        }
        return Unit.a;
    }
}
