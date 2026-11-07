package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fc3 extends dm2 {
    private static final fc3 zzf;
    private static volatile rn2 zzg;
    private int zzb;
    private boolean zze;

    static {
        fc3 fc3Var = new fc3();
        zzf = fc3Var;
        dm2.o(fc3.class, fc3Var);
    }

    public static fc3 u() {
        return zzf;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new fc3();
        }
        if (i2 == 4) {
            return new s03(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzg;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (fc3.class) {
            try {
                cm2Var = zzg;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzf);
                    zzg = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final boolean t() {
        return this.zze;
    }
}
