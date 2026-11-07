package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cd3 extends dm2 {
    private static final cd3 zze;
    private static volatile rn2 zzf;
    private gn2 zzb = gn2.b;

    static {
        cd3 cd3Var = new cd3();
        zze = cd3Var;
        dm2.o(cd3.class, cd3Var);
    }

    public static cd3 u() {
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
            return new wn2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", wc3.a});
        }
        if (i2 == 3) {
            return new cd3();
        }
        if (i2 == 4) {
            return new zc3(zze);
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
        synchronized (cd3.class) {
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

    public final uc3 t(String str, uc3 uc3Var) {
        str.getClass();
        uc3 uc3Var2 = (uc3) this.zzb.get(str);
        return uc3Var2 != null ? uc3Var2 : uc3Var;
    }

    public final gn2 v() {
        gn2 gn2Var = this.zzb;
        if (!gn2Var.a) {
            this.zzb = gn2Var.c();
        }
        return this.zzb;
    }
}
