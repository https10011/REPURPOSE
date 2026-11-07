package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u03 extends dm2 {
    private static final u03 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        u03 u03Var = new u03();
        zzj = u03Var;
        dm2.o(u03.class, u03Var);
    }

    public static u03 C() {
        return zzj;
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final String B() {
        return this.zzi;
    }

    public final int D() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", qk2.c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new u03();
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
        synchronized (u03.class) {
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

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
