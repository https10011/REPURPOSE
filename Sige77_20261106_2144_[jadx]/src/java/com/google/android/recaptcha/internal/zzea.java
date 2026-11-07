package com.google.android.recaptcha.internal;

import defpackage.bp;
import defpackage.cp;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzea extends mv1 implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ bp zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, bp bpVar, fs fsVar) {
        super(1, fsVar);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = bpVar;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new zzea(this.zzc, this.zzd, this.zze, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((fs) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVarZzf;
        ft ftVar = ft.a;
        int i = this.zzb;
        try {
            if (i == 0) {
                zi0.B(obj);
                zzenVarZzf = this.zzc.zzb.zzf(41);
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                obj = zzdtVar.zzo(j, this);
                if (obj != ftVar) {
                }
                return ftVar;
            }
            zzenVarZzf = (zzen) this.zza;
            if (i != 1) {
                zi0.B(obj);
            } else {
                zi0.B(obj);
            }
            zzenVarZzf.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((cp) this.zze).D(Unit.a));
            zzsc zzscVar = (zzsc) obj;
            this.zzc.zze = zzscVar;
            zzdt zzdtVar2 = this.zzc.zza;
            long j2 = this.zzd;
            this.zza = zzenVarZzf;
            this.zzb = 2;
            if (zzdtVar2.zzn(zzscVar, j2, this) == ftVar) {
                return ftVar;
            }
            zzenVarZzf.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((cp) this.zze).D(Unit.a));
        } catch (zzbd e) {
            this.zzc.zzd = e;
            zzenVarZzf.zzb(e);
            throw e;
        }
    }
}
