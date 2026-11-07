package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x13 extends dm2 {
    private static final x13 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private um2 zze;
    private um2 zzf;
    private um2 zzg;
    private boolean zzh;
    private um2 zzi;

    static {
        x13 x13Var = new x13();
        zzj = x13Var;
        dm2.o(x13.class, x13Var);
    }

    public x13() {
        vn2 vn2Var = vn2.e;
        this.zze = vn2Var;
        this.zzf = vn2Var;
        this.zzg = vn2Var;
        this.zzi = vn2Var;
    }

    public static x13 z() {
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
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", c13.class, "zzf", d13.class, "zzg", p13.class, "zzh", "zzi", c13.class});
        }
        if (i2 == 3) {
            return new x13();
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
        synchronized (x13.class) {
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

    public final List t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final um2 y() {
        return this.zzi;
    }
}
