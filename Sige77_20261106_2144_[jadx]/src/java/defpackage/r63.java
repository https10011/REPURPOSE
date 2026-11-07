package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r63 extends dm2 {
    private static final r63 zzh;
    private static volatile rn2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        r63 r63Var = new r63();
        zzh = r63Var;
        dm2.o(r63.class, r63Var);
    }

    public static n63 u() {
        return (n63) zzh.j();
    }

    public static r63 v() {
        return zzh;
    }

    public final /* synthetic */ void A(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", qk2.o, "zzf", qk2.m, "zzg", qk2.n});
        }
        if (i2 == 3) {
            return new r63();
        }
        if (i2 == 4) {
            return new n63(zzh);
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
        synchronized (r63.class) {
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
        int iJ = ck1.j(this.zzf);
        if (iJ == 0) {
            return 1;
        }
        return iJ;
    }

    public final void w(int i) {
        this.zzf = ck1.m(i);
        this.zzb |= 2;
    }

    public final int x() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
      0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int y() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void z(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
