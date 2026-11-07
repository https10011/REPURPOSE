package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.qt;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzds extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzds(this.zzb, this.zzc, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws Throwable {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = qt.E(zzdtVar.zzi.zza().b(), new zzdh(zzdtVar, null), this);
            if (obj == ftVar) {
                return ftVar;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
