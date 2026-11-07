package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w53 extends dm2 {
    private static final w53 zzi;
    private static volatile rn2 zzj;
    private int zzb;
    private um2 zze = vn2.e;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;

    static {
        w53 w53Var = new w53();
        zzi = w53Var;
        dm2.o(w53.class, w53Var);
    }

    public static s53 A() {
        return (s53) zzi.j();
    }

    public static s53 B(w53 w53Var) {
        bm2 bm2VarJ = zzi.j();
        bm2VarJ.h(w53Var);
        return (s53) bm2VarJ;
    }

    public final /* synthetic */ void C(int i, a63 a63Var) {
        I();
        this.zze.set(i, a63Var);
    }

    public final /* synthetic */ void D(a63 a63Var) {
        I();
        this.zze.add(a63Var);
    }

    public final /* synthetic */ void E(ArrayList arrayList) {
        I();
        wk2.d(arrayList, this.zze);
    }

    public final void F() {
        this.zze = vn2.e;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void I() {
        um2 um2Var = this.zze;
        if (((xk2) um2Var).a) {
            return;
        }
        this.zze = ck1.v(um2Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", a63.class, "zzf", "zzg", "zzh", qk2.k});
        }
        if (i2 == 3) {
            return new w53();
        }
        if (i2 == 4) {
            return new s53(zzi);
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
        synchronized (w53.class) {
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

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final a63 v(int i) {
        return (a63) this.zze.get(i);
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final String z() {
        return this.zzg;
    }
}
