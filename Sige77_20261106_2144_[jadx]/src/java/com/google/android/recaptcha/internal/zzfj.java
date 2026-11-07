package com.google.android.recaptcha.internal;

import defpackage.aw0;
import defpackage.fs;
import defpackage.ft;
import defpackage.ta;
import defpackage.uq1;
import defpackage.vv0;
import defpackage.zi0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzfj {
    private final vv0 zza;

    public zzfj() {
        int i = zzav.zza;
        this.zza = aw0.a(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, fs fsVar) throws Throwable {
        zzfg zzfgVar;
        if (fsVar instanceof zzfg) {
            zzfgVar = (zzfg) fsVar;
            int i = zzfgVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, fsVar);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, fsVar);
        }
        Object obj = zzfgVar.zza;
        ft ftVar = ft.a;
        int i2 = zzfgVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                zi0.B(obj);
                return obj;
            }
            uq1.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zi0.B(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objE = ta.e(zzfhVar, zzfgVar);
        return objE == ftVar ? ftVar : objE;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, fs fsVar) {
        return zzc(this, zzbrVar, zzspVar, fsVar);
    }
}
