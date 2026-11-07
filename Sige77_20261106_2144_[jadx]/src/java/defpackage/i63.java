package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i63 extends dm2 {
    private static final i63 zzh;
    private static volatile rn2 zzi;
    private tm2 zzb;
    private tm2 zze;
    private um2 zzf;
    private um2 zzg;

    static {
        i63 i63Var = new i63();
        zzh = i63Var;
        dm2.o(i63.class, i63Var);
    }

    public i63() {
        dn2 dn2Var = dn2.e;
        this.zzb = dn2Var;
        this.zze = dn2Var;
        vn2 vn2Var = vn2.e;
        this.zzf = vn2Var;
        this.zzg = vn2Var;
    }

    public static g63 B() {
        return (g63) zzh.j();
    }

    public static i63 C() {
        return zzh;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final void D(Iterable iterable) {
        List list = this.zzb;
        if (!((xk2) list).a) {
            int size = list.size();
            this.zzb = ((dn2) list).zzg(size + size);
        }
        wk2.d(iterable, this.zzb);
    }

    public final void E() {
        this.zzb = dn2.e;
    }

    public final void F(List list) {
        List list2 = this.zze;
        if (!((xk2) list2).a) {
            int size = list2.size();
            this.zze = ((dn2) list2).zzg(size + size);
        }
        wk2.d(list, this.zze);
    }

    public final void G() {
        this.zze = dn2.e;
    }

    public final void H(ArrayList arrayList) {
        um2 um2Var = this.zzf;
        if (!((xk2) um2Var).a) {
            this.zzf = ck1.v(um2Var);
        }
        wk2.d(arrayList, this.zzf);
    }

    public final void I() {
        this.zzf = vn2.e;
    }

    public final void J(Iterable iterable) {
        um2 um2Var = this.zzg;
        if (!((xk2) um2Var).a) {
            this.zzg = ck1.v(um2Var);
        }
        wk2.d(iterable, this.zzg);
    }

    public final void K() {
        this.zzg = vn2.e;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", z43.class, "zzg", m63.class});
        }
        if (i2 == 3) {
            return new i63();
        }
        if (i2 == 4) {
            return new g63(zzh);
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
        synchronized (i63.class) {
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

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return this.zzb.size();
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final um2 x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final um2 z() {
        return this.zzg;
    }
}
