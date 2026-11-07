package com.google.android.recaptcha.internal;

import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.yx1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzdy extends mv1 implements Function1 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, fs fsVar) {
        super(1, fsVar);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new zzdy(this.zzb, this.zzc, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((fs) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (yx1.a(j, zzdxVar, this) == ftVar) {
                return ftVar;
            }
        }
        return Unit.a;
    }
}
