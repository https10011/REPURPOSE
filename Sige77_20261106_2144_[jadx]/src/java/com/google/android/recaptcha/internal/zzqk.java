package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzqk extends zznd implements zzoj {
    private static final zzqk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private zzni zzk = zznd.zzy();

    static {
        zzqk zzqkVar = new zzqk();
        zzb = zzqkVar;
        zznd.zzI(zzqk.class, zzqkVar);
    }

    private zzqk() {
    }

    public static /* synthetic */ void zzM(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzf = str;
    }

    public static /* synthetic */ void zzN(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzi = str;
    }

    public static zzqh zzf() {
        return (zzqh) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzqk zzqkVar, Iterable iterable) {
        zzni zzniVar = zzqkVar.zzk;
        if (!zzniVar.zzc()) {
            zzqkVar.zzk = zznd.zzz(zzniVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzqkVar.zzk.zzh(((zzqi) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzk(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzj = str;
    }

    public static /* synthetic */ void zzl(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzh = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzqk();
        }
        zzqj zzqjVar = null;
        if (i2 == 4) {
            return new zzqh(zzqjVar);
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
        synchronized (zzqk.class) {
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
