package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qi3 extends cs2 {
    private static final qi3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private yi3 zzg;
    private zl3 zzh;

    static {
        qi3 qi3Var = new qi3();
        zzc = qi3Var;
        cs2.j(qi3.class, qi3Var);
    }

    public static ys2 A() {
        return (ys2) zzc.d(7);
    }

    public static qi3 u(jr2 jr2Var, wr2 wr2Var) {
        return (qi3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(qi3 qi3Var, yi3 yi3Var) {
        qi3Var.zzg = yi3Var;
        qi3Var.zze |= 1;
    }

    public static /* synthetic */ void w(qi3 qi3Var, zl3 zl3Var) {
        qi3Var.zzh = zl3Var;
        qi3Var.zze |= 2;
    }

    public static oi3 x() {
        return (oi3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ni3.a[i - 1]) {
            case 1:
                return new qi3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new oi3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (qi3.class) {
                    try {
                        as2Var = zzd;
                        if (as2Var == null) {
                            as2Var = new as2();
                            zzd = as2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return as2Var;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int t() {
        return this.zzf;
    }

    public final yi3 y() {
        yi3 yi3Var = this.zzg;
        return yi3Var == null ? yi3.x() : yi3Var;
    }

    public final zl3 z() {
        zl3 zl3Var = this.zzh;
        return zl3Var == null ? zl3.y() : zl3Var;
    }
}
