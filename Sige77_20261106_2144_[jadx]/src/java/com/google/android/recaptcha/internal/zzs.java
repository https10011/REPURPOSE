package com.google.android.recaptcha.internal;

import defpackage.ea;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.pj1;
import defpackage.qt;
import defpackage.rj1;
import defpackage.ws0;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzs extends mv1 implements Function2 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, fs fsVar) {
        super(2, fsVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, fsVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        int i = this.zza;
        zi0.B(obj);
        if (i == 0) {
            et etVar = (et) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                arrayList2.add(qt.o(etVar, new zzr((zzy) obj3, this.zzc, arrayList, null)));
            }
            ws0[] ws0VarArr = (ws0[]) arrayList2.toArray(new ws0[0]);
            ws0[] ws0VarArr2 = (ws0[]) Arrays.copyOf(ws0VarArr, ws0VarArr.length);
            this.zza = 1;
            if (ea.s(ws0VarArr2, this) == ftVar) {
                return ftVar;
            }
        }
        pj1 pj1Var = rj1.b;
        return new rj1(this.zzb.zzq(this.zzc));
    }
}
