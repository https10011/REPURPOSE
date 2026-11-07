package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k03 extends dm2 {
    private static final k03 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private int zze;
    private um2 zzf;
    private um2 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        k03 k03Var = new k03();
        zzj = k03Var;
        dm2.o(k03.class, k03Var);
    }

    public k03() {
        vn2 vn2Var = vn2.e;
        this.zzf = vn2Var;
        this.zzg = vn2Var;
    }

    public final n03 A(int i) {
        return (n03) this.zzg.get(i);
    }

    public final void B(int i, w03 w03Var) {
        um2 um2Var = this.zzf;
        if (!((xk2) um2Var).a) {
            this.zzf = ck1.v(um2Var);
        }
        this.zzf.set(i, w03Var);
    }

    public final void C(int i, n03 n03Var) {
        um2 um2Var = this.zzg;
        if (!((xk2) um2Var).a) {
            this.zzg = ck1.v(um2Var);
        }
        this.zzg.set(i, n03Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", w03.class, "zzg", n03.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new k03();
        }
        if (i2 == 4) {
            return new j03(zzj);
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
        synchronized (k03.class) {
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

    public final int u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final w03 x(int i) {
        return (w03) this.zzf.get(i);
    }

    public final um2 y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
