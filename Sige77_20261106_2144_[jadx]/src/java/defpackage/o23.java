package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o23 extends dm2 {
    private static final o23 zze;
    private static volatile rn2 zzf;
    private um2 zzb = vn2.e;

    static {
        o23 o23Var = new o23();
        zze = o23Var;
        dm2.o(o23.class, o23Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new o23();
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
        synchronized (o23.class) {
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
}
