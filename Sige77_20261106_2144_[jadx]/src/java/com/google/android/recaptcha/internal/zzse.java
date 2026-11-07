package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzse extends zznd implements zzoj {
    private static final zzse zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf;
    private long zzg;
    private zzle zzh;
    private String zzi;
    private String zzj;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zznd.zzI(zzse.class, zzseVar);
    }

    private zzse() {
        zzle zzleVar = zzle.zzb;
        this.zze = zzleVar;
        this.zzf = BuildConfig.FLAVOR;
        this.zzh = zzleVar;
        this.zzi = BuildConfig.FLAVOR;
        this.zzj = BuildConfig.FLAVOR;
    }

    public static zzse zzk() {
        return zzb;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzle zzg() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzse();
        }
        zzsn zzsnVar = null;
        if (i2 == 4) {
            return new zzsd(zzsnVar);
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
        synchronized (zzse.class) {
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

    public final zzle zzi() {
        return this.zze;
    }

    public final String zzl() {
        return this.zzf;
    }
}
