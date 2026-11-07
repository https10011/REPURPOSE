package com.google.android.recaptcha.internal;

import defpackage.e;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.qt;
import defpackage.ta;
import defpackage.tv2;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzft implements zzfo {
    private final et zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(et etVar, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = etVar;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            tv2.c(5, 2, null);
            return;
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk != 1) {
            zzbk.zza(iZzk - 2, jZza);
        } else {
            e.g("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, fs fsVar) throws Throwable {
        Object objE = ta.e(new zzfq(zzgdVar, list, this, null), fsVar);
        return objE == ft.a ? objE : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, fs fsVar) throws Throwable {
        Object objE = ta.e(new zzfr(exc, zzgdVar, this, null), fsVar);
        return objE == ft.a ? objE : Unit.a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        qt.o(this.zza, new zzfs(new zzgd(this.zzb), this, str, null));
    }
}
