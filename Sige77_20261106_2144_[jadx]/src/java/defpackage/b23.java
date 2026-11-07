package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b23 extends dm2 {
    private static final b23 zzh;
    private static volatile rn2 zzi;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private um2 zzf = vn2.e;
    private boolean zzg;

    static {
        b23 b23Var = new b23();
        zzh = b23Var;
        dm2.o(b23.class, b23Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", w23.class, "zzg"});
        }
        if (i2 == 3) {
            return new b23();
        }
        if (i2 == 4) {
            return new s03(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzi;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (b23.class) {
            try {
                cm2Var = zzi;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzh);
                    zzi = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final String t() {
        return this.zze;
    }
}
