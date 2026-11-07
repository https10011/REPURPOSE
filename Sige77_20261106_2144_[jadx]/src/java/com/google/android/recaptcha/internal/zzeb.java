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
final class zzeb extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ bp zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, bp bpVar, long j, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzecVar;
        this.zzc = bpVar;
        this.zzd = j;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e;
        ft ftVar = ft.a;
        if (this.zza != 0) {
            try {
                zi0.B(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((cp) zzebVar.zzc).V(zzbdVar);
            }
        } else {
            zi0.B(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == ftVar) {
                        return ftVar;
                    }
                } catch (zzbd e3) {
                    e = e3;
                    zzbdVar = e;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    ((cp) zzebVar.zzc).V(zzbdVar);
                }
            } catch (zzbd e4) {
                e = e4;
                zzebVar = this;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((cp) zzebVar.zzc).V(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return Unit.a;
    }
}
