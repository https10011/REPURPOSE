package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzsk extends zznd implements zzoj {
    private static final zzsk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        zzsk zzskVar = new zzsk();
        zzb = zzskVar;
        zznd.zzI(zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zzsj zzf() {
        return (zzsj) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 2;
        zzskVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsk zzskVar, String str) {
        str.getClass();
        zzskVar.zze |= 1;
        zzskVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzsk();
        }
        zzsn zzsnVar = null;
        if (i2 == 4) {
            return new zzsj(zzsnVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzsk.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }
}
