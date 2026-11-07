package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d13 extends dm2 {
    private static final d13 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        d13 d13Var = new d13();
        zzg = d13Var;
        dm2.o(d13.class, d13Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            qk2 qk2Var = qk2.f;
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", qk2Var, "zzf", qk2Var});
        }
        if (i2 == 3) {
            return new d13();
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
        synchronized (d13.class) {
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

    public final int t() {
        int iJ = gb2.J(this.zze);
        if (iJ == 0) {
            return 1;
        }
        return iJ;
    }

    public final int u() {
        int iJ = gb2.J(this.zzf);
        if (iJ == 0) {
            return 1;
        }
        return iJ;
    }
}
