package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e63 extends dm2 {
    private static final e63 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private int zze = 1;
    private um2 zzf = vn2.e;

    static {
        e63 e63Var = new e63();
        zzg = e63Var;
        dm2.o(e63.class, e63Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", qk2.l, "zzf", h53.class});
        }
        if (i2 == 3) {
            return new e63();
        }
        if (i2 == 4) {
            return new s03(zzg);
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
        synchronized (e63.class) {
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
}
