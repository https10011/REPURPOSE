package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e33 extends dm2 {
    private static final e33 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private int zzh;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        e33 e33Var = new e33();
        zzj = e33Var;
        dm2.o(e33.class, e33Var);
    }

    public static e33 v() {
        return zzj;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new e33();
        }
        if (i2 == 4) {
            return new s03(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzk;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (e33.class) {
            try {
                cm2Var = zzk;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzj);
                    zzk = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final int t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }
}
