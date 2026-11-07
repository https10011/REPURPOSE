package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.rj1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzd extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzd(this.zzb, this.zzc, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws zzbd {
        Object objZzh;
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i != 0) {
            objZzh = ((rj1) obj).a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzscVar, this);
            if (objZzh == ftVar) {
                return ftVar;
            }
        }
        return new rj1(objZzh);
    }
}
