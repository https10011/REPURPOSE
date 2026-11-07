package com.google.android.recaptcha.internal;

import defpackage.f61;
import defpackage.fs;
import defpackage.ft;
import defpackage.h61;
import defpackage.uq1;
import defpackage.wb;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzcb {
    private Object zza;
    private final f61 zzb = new h61();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zza(Object obj, fs fsVar) {
        zzby zzbyVar;
        h61 h61Var;
        f61 f61Var;
        if (fsVar instanceof zzby) {
            zzbyVar = (zzby) fsVar;
            int i = zzbyVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, fsVar);
            }
        } else {
            zzbyVar = new zzby(this, fsVar);
        }
        Object obj2 = zzbyVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzbyVar.zzd;
        if (i2 == 0) {
            zi0.B(obj2);
            f61 f61Var2 = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = f61Var2;
            zzbyVar.zzd = 1;
            h61Var = (h61) f61Var2;
            if (h61Var.d(zzbyVar) == ftVar) {
                f61Var = h61Var;
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f61 f61Var3 = (f61) zzbyVar.zza;
            obj = zzbyVar.zzf;
            zzcb zzcbVar = zzbyVar.zze;
            zi0.B(obj2);
            f61Var = f61Var3;
            this = zzcbVar;
        }
        try {
            f61Var = h61Var;
            return Boolean.valueOf(Intrinsics.areEqual(this.zza, obj));
        } finally {
            ((h61) f61Var).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzb(Object[] objArr, fs fsVar) {
        zzbz zzbzVar;
        h61 h61Var;
        f61 f61Var;
        if (fsVar instanceof zzbz) {
            zzbzVar = (zzbz) fsVar;
            int i = zzbzVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, fsVar);
            }
        } else {
            zzbzVar = new zzbz(this, fsVar);
        }
        Object obj = zzbzVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzbzVar.zzd;
        if (i2 == 0) {
            zi0.B(obj);
            f61 f61Var2 = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = f61Var2;
            zzbzVar.zzd = 1;
            h61Var = (h61) f61Var2;
            if (h61Var.d(zzbzVar) == ftVar) {
                f61Var = h61Var;
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f61 f61Var3 = (f61) zzbzVar.zza;
            objArr = zzbzVar.zzf;
            zzcb zzcbVar = zzbzVar.zze;
            zi0.B(obj);
            f61Var = f61Var3;
            this = zzcbVar;
        }
        try {
            f61Var = h61Var;
            return Boolean.valueOf(wb.i(objArr, this.zza));
        } finally {
            ((h61) f61Var).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzc(Object obj, fs fsVar) {
        zzca zzcaVar;
        h61 h61Var;
        f61 f61Var;
        if (fsVar instanceof zzca) {
            zzcaVar = (zzca) fsVar;
            int i = zzcaVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, fsVar);
            }
        } else {
            zzcaVar = new zzca(this, fsVar);
        }
        Object obj2 = zzcaVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzcaVar.zzd;
        if (i2 == 0) {
            zi0.B(obj2);
            f61 f61Var2 = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = f61Var2;
            zzcaVar.zzd = 1;
            h61Var = (h61) f61Var2;
            if (h61Var.d(zzcaVar) == ftVar) {
                f61Var = h61Var;
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f61 f61Var3 = (f61) zzcaVar.zza;
            obj = zzcaVar.zzf;
            zzcb zzcbVar = zzcaVar.zze;
            zi0.B(obj2);
            f61Var = f61Var3;
            this = zzcbVar;
        }
        try {
            f61Var = h61Var;
            this.zza = obj;
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            ((h61) f61Var).g(null);
        }
    }
}
