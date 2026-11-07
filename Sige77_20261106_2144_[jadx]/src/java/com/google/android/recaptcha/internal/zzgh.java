package com.google.android.recaptcha.internal;

import defpackage.tv2;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzgh implements zzgx {
    public static final zzgh zza = new zzgh();

    private zzgh() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        Object objValueOf;
        if (zzueVarArr.length != 2) {
            tv2.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            tv2.c(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            tv2.c(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objValueOf = String.valueOf(((String) objZza).charAt(iIntValue));
            } else {
                objValueOf = objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue);
            }
            zzgdVar.zzc().zze(i, objValueOf);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                tv2.c(4, 22, e);
            } else {
                tv2.c(4, 23, e);
            }
        }
    }
}
