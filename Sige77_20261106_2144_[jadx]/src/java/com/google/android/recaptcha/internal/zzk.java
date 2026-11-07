package com.google.android.recaptcha.internal;

import defpackage.e00;
import defpackage.ea;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.pj1;
import defpackage.qj1;
import defpackage.qt;
import defpackage.rj1;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzk extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, fsVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        qj1 qj1Var;
        ft ftVar = ft.a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            zi0.B(obj);
        } else {
            zi0.B(obj);
            et etVar = (et) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(qt.b(etVar, new zzj((zze) it.next(), this.zzd, this.zze, null)));
            }
            e00[] e00VarArr = (e00[]) arrayList.toArray(new e00[0]);
            e00[] e00VarArr2 = (e00[]) Arrays.copyOf(e00VarArr, e00VarArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = ea.c(e00VarArr2, this);
            if (obj == ftVar) {
                return ftVar;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            pj1 pj1Var = rj1.b;
            qj1Var = new qj1(zzbdVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((rj1) it2.next()).a instanceof qj1)) {
                    zzenVar.zza();
                    qj1Var = Unit.a;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            pj1 pj1Var2 = rj1.b;
            qj1Var = new qj1(zzbdVar2);
        }
        return new rj1(qj1Var);
    }
}
