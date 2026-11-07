package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzrr extends zznd implements zzoj {
    private static final zzrr zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzml zzj;
    private zzpj zzk;
    private int zzl;
    private zzqz zzm;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private zznk zzn = zznd.zzB();

    static {
        zzrr zzrrVar = new zzrr();
        zzb = zzrrVar;
        zznd.zzI(zzrr.class, zzrrVar);
    }

    private zzrr() {
    }

    public static zzrr zzg() {
        return zzb;
    }

    public static zzrr zzi(byte[] bArr) throws zznn {
        return (zzrr) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzri.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i2 == 3) {
            return new zzrr();
        }
        zzrq zzrqVar = null;
        if (i2 == 4) {
            return new zzrp(zzrqVar);
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
        synchronized (zzrr.class) {
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
