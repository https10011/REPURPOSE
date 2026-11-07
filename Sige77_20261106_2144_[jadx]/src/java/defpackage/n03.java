package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n03 extends dm2 {
    private static final n03 zzm;
    private static volatile rn2 zzn;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private um2 zzg = vn2.e;
    private boolean zzh;
    private u03 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        n03 n03Var = new n03();
        zzm = n03Var;
        dm2.o(n03.class, n03Var);
    }

    public static l03 F() {
        return (l03) zzm.j();
    }

    public final u03 A() {
        u03 u03Var = this.zzi;
        return u03Var == null ? u03.C() : u03Var;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        return (this.zzb & 64) != 0;
    }

    public final boolean E() {
        return this.zzl;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void H(int i, q03 q03Var) {
        um2 um2Var = this.zzg;
        if (!((xk2) um2Var).a) {
            this.zzg = ck1.v(um2Var);
        }
        this.zzg.set(i, q03Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", q03.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new n03();
        }
        if (i2 == 4) {
            return new l03(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzn;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (n03.class) {
            try {
                cm2Var = zzn;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzm);
                    zzn = cm2Var;
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

    public final String v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final q03 y(int i) {
        return (q03) this.zzg.get(i);
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
