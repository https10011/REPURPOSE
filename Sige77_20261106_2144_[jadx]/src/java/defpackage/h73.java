package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h73 extends dm2 {
    private static final h73 zzk;
    private static volatile rn2 zzl;
    private int zzb;
    private int zze;
    private um2 zzf = vn2.e;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private boolean zzi;
    private double zzj;

    static {
        h73 h73Var = new h73();
        zzk = h73Var;
        dm2.o(h73.class, h73Var);
    }

    public final double A() {
        return this.zzj;
    }

    public final int B() {
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
            return new wn2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", qk2.p, "zzf", h73.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new h73();
        }
        if (i2 == 4) {
            return new s03(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzl;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (h73.class) {
            try {
                cm2Var = zzl;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzk);
                    zzl = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final List t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final String w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
