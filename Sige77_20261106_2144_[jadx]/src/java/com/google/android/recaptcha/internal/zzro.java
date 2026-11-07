package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzro extends zznd implements zzoj {
    private static final zzro zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzqt zzg;
    private zzqk zzh;
    private zzqw zzi;
    private String zzf = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        zzro zzroVar = new zzro();
        zzb = zzroVar;
        zznd.zzI(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzrm zzf() {
        return (zzrm) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzro zzroVar, zzqk zzqkVar) {
        zzqkVar.getClass();
        zzroVar.zzh = zzqkVar;
        zzroVar.zze |= 2;
    }

    public static /* synthetic */ void zzj(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzk = str;
    }

    public static /* synthetic */ void zzk(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzj = str;
    }

    public static /* synthetic */ void zzl(zzro zzroVar, String str) {
        str.getClass();
        zzroVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzro();
        }
        zzrn zzrnVar = null;
        if (i2 == 4) {
            return new zzrm(zzrnVar);
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
        synchronized (zzro.class) {
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
