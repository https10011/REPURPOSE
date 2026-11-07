package com.google.android.recaptcha.internal;

import defpackage.tv2;
import defpackage.wb;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzhc implements zzgx {
    public static final zzhc zza = new zzhc();

    private zzhc() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length < 2) {
            tv2.c(4, 3, null);
            return;
        }
        Class<?> clsZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            tv2.c(4, 5, null);
            return;
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            tv2.c(4, 5, null);
            return;
        }
        String strZza = zzgdVar.zzh().zza(str);
        if (Intrinsics.areEqual(strZza, "forName")) {
            tv2.c(6, 48, null);
            return;
        }
        Class[] clsArrZzf = zzgdVar.zzc().zzf(wb.o(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e) {
            tv2.c(6, 13, e);
        }
    }
}
