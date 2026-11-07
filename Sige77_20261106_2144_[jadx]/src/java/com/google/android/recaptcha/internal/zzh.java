package com.google.android.recaptcha.internal;

import defpackage.e00;
import defpackage.ea;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.qj1;
import defpackage.qt;
import defpackage.rj1;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzh extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, fsVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        zzen zzenVar;
        ft ftVar = ft.a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            zi0.B(obj);
        } else {
            zi0.B(obj);
            et etVar = (et) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(qt.b(etVar, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
            }
            e00[] e00VarArr = (e00[]) arrayList.toArray(new e00[0]);
            e00[] e00VarArr2 = (e00[]) Arrays.copyOf(e00VarArr, e00VarArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = ea.c(e00VarArr2, this);
            if (obj == ftVar) {
                return ftVar;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((rj1) it.next()).a;
            if (!(obj2 instanceof qj1)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
