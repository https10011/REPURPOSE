package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m63 extends dm2 {
    private static final m63 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private int zze;
    private tm2 zzf = dn2.e;

    static {
        m63 m63Var = new m63();
        zzg = m63Var;
        dm2.o(m63.class, m63Var);
    }

    public static k63 y() {
        return (k63) zzg.j();
    }

    public final void A(List list) {
        List list2 = this.zzf;
        if (!((xk2) list2).a) {
            int size = list2.size();
            this.zzf = ((dn2) list2).zzg(size + size);
        }
        wk2.d(list, this.zzf);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new m63();
        }
        if (i2 == 4) {
            return new k63(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzh;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (m63.class) {
            try {
                cm2Var = zzh;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzg);
                    zzh = cm2Var;
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

    public final long x(int i) {
        return ((dn2) this.zzf).b(i);
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
