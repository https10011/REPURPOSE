package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w63 extends dm2 {
    private static final w63 zze;
    private static volatile rn2 zzf;
    private um2 zzb = vn2.e;

    static {
        w63 w63Var = new w63();
        zze = w63Var;
        dm2.o(w63.class, w63Var);
    }

    public static w63 v() {
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
            return new wn2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", z63.class});
        }
        if (i2 == 3) {
            return new w63();
        }
        if (i2 == 4) {
            return new s03(zze);
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
        synchronized (w63.class) {
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

    public final int u() {
        return this.zzb.size();
    }
}
