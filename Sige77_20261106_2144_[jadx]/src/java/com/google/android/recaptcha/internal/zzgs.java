package com.google.android.recaptcha.internal;

import defpackage.tv2;
import java.lang.reflect.Proxy;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzgs implements zzgx {
    public static final zzgs zza = new zzgs();

    private zzgs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int iIntValue;
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            tv2.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            tv2.c(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            tv2.c(4, 5, null);
            return;
        }
        Object objZza3 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            tv2.c(4, 5, null);
            return;
        }
        String strZza = zzgdVar.zzh().zza(str2);
        Object objZza4 = zzgdVar.zzc().zza(zzueVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzgdVar.zzc().zza(zzueVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                tv2.c(4, 5, null);
                return;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            if (objZza2 instanceof String) {
                objZza2 = zzgdVar.zzh().zza((String) objZza2);
            }
            Class clsZza = zzgc.zza(objZza2);
            zzgdVar.zzc().zze(i, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzfy(new zzgr(zzgdVar, str, iIntValue), strZza, objZza4)));
        } catch (Exception e) {
            tv2.c(6, 20, e);
        }
    }
}
