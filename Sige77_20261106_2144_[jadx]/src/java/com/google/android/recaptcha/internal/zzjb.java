package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.w11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapE = w11.e(new Pair(-4, zzba.zzo), new Pair(-12, zzba.zzp), new Pair(-6, zzba.zzk), new Pair(-11, zzba.zzm), new Pair(-13, zzba.zzq), new Pair(-14, zzba.zzr), new Pair(-2, zzba.zzl), new Pair(-7, zzba.zzs), new Pair(-5, zzba.zzt), new Pair(-9, zzba.zzu), new Pair(-8, zzba.zzE), new Pair(-15, zzba.zzn), new Pair(-1, zzba.zzv), new Pair(-3, zzba.zzx), new Pair(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMapE.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            linkedHashMapE.put(1, zzba.zzA);
            linkedHashMapE.put(2, zzba.zzB);
            linkedHashMapE.put(0, zzba.zzC);
            linkedHashMapE.put(3, zzba.zzD);
        }
        if (i >= 29) {
            linkedHashMapE.put(4, zzba.zzz);
        }
        return linkedHashMapE;
    }
}
