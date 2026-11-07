package com.google.android.recaptcha.internal;

import defpackage.fs;
import defpackage.ft;
import defpackage.oo;
import defpackage.rj1;
import defpackage.ta;
import defpackage.uq1;
import defpackage.x50;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public zzl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        x50 x50Var = x50.a;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) x50Var.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        oo.j(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j, fs fsVar) {
        return ta.e(new zzh(this, str, j, null), fsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object zzc(long j, zzsc zzscVar, zzek zzekVar, fs fsVar) {
        zzi zziVar;
        if (fsVar instanceof zzi) {
            zziVar = (zzi) fsVar;
            int i = zziVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, fsVar);
            }
        } else {
            zziVar = new zzi(this, fsVar);
        }
        Object objE = zziVar.zza;
        ft ftVar = ft.a;
        int i2 = zziVar.zzc;
        if (i2 == 0) {
            zi0.B(objE);
            zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
            zziVar.zzc = 1;
            objE = ta.e(zzkVar, zziVar);
            if (objE == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zi0.B(objE);
        }
        return ((rj1) objE).a;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public zzl() {
        this(null, 1, null);
    }
}
