package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = StringsKt.C(str, new char[]{JwtParser.SEPARATOR_CHAR}).iterator();
        String strConcat = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrvVar) {
        this.zza = CollectionsKt.F(zzrvVar.zzf().zzi());
        this.zzb = CollectionsKt.F(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        set2.getClass();
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
