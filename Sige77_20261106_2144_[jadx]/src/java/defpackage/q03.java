package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q03 extends dm2 {
    private static final q03 zzi;
    private static volatile rn2 zzj;
    private int zzb;
    private z03 zze;
    private u03 zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;

    static {
        q03 q03Var = new q03();
        zzi = q03Var;
        dm2.o(q03.class, q03Var);
    }

    public static q03 B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new q03();
        }
        if (i2 == 4) {
            return new o03(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzj;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (q03.class) {
            try {
                cm2Var = zzj;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzi);
                    zzj = cm2Var;
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

    public final z03 u() {
        z03 z03Var = this.zze;
        return z03Var == null ? z03.A() : z03Var;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final u03 w() {
        u03 u03Var = this.zzf;
        return u03Var == null ? u03.C() : u03Var;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
