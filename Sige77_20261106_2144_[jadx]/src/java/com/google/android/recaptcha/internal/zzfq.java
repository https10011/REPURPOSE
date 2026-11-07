package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.k42;
import defpackage.mv1;
import defpackage.ws0;
import defpackage.zi0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzfq extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, fsVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            et etVar = (et) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() < this.zzc.size()) {
                    ws0 ws0Var = (ws0) etVar.b().get(k42.c);
                    if (!(ws0Var != null ? ws0Var.isActive() : true)) {
                        break;
                    }
                    zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                    try {
                        zzft.zzf(this.zzd, zzufVar, this.zzb);
                    } catch (Exception e) {
                        zzufVar.zzk();
                        new Integer(zzufVar.zzg());
                        CollectionsKt.s(zzufVar.zzj(), (String) null, (String) null, (String) null, new zzfp(this.zzd), 31);
                        zzft zzftVar = this.zzd;
                        zzgd zzgdVar2 = this.zzb;
                        this.zza = 1;
                        if (zzftVar.zzh(e, zzgdVar2, this) == ftVar) {
                            return ftVar;
                        }
                    }
                } else {
                    break;
                }
            }
            return Unit.a;
        }
        return Unit.a;
    }
}
