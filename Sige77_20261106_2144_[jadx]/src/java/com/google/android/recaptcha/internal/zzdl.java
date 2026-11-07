package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzdl extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            if (zzdtVar.zzv(zzscVar, j, this) == ftVar) {
                return ftVar;
            }
        }
        return Unit.a;
    }
}
