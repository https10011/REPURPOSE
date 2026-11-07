package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c13 extends dm2 {
    private static final c13 zzh;
    private static volatile rn2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        c13 c13Var = new c13();
        zzh = c13Var;
        dm2.o(c13.class, c13Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", qk2.f, "zzf", qk2.e, "zzg", qk2.g});
        }
        if (i2 == 3) {
            return new c13();
        }
        if (i2 == 4) {
            return new s03(zzh);
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
        synchronized (c13.class) {
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

    public final int t() {
        int iJ = gb2.J(this.zze);
        if (iJ == 0) {
            return 1;
        }
        return iJ;
    }

    public final int u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int v() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
