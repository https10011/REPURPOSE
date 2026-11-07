package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u43 extends dm2 {
    private static final u43 zze;
    private static volatile rn2 zzf;
    private um2 zzb = vn2.e;

    static {
        u43 u43Var = new u43();
        zze = u43Var;
        dm2.o(u43.class, u43Var);
    }

    public static g43 u() {
        return (g43) zze.j();
    }

    public static u43 v() {
        return zze;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", o43.class});
        }
        if (i2 == 3) {
            return new u43();
        }
        if (i2 == 4) {
            return new g43(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzf;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (u43.class) {
            try {
                cm2Var = zzf;
                if (cm2Var == null) {
                    cm2Var = new cm2(zze);
                    zzf = cm2Var;
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

    public final void w(ArrayList arrayList) {
        um2 um2Var = this.zzb;
        if (!((xk2) um2Var).a) {
            this.zzb = ck1.v(um2Var);
        }
        wk2.d(arrayList, this.zzb);
    }
}
