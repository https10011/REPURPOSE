package com.google.android.recaptcha.internal;

import defpackage.aw0;
import defpackage.tv2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzgc {
    public static final Class zza(Object obj) throws zzce {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                tv2.c(4, 5, null);
                return null;
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i = zzav.zza;
                if (((zzfu) aw0.a(zzgb.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                tv2.c(6, 47, null);
                return null;
            } catch (Exception e) {
                tv2.c(6, 8, e);
                return null;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        tv2.c(4, 6, null);
        return null;
    }
}
