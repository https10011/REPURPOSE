package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jk3 extends cs2 {
    private static final jk3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private jr2 zzf = jr2.b;

    static {
        jk3 jk3Var = new jk3();
        zzc = jk3Var;
        cs2.j(jk3.class, jk3Var);
    }

    public static jk3 u(jr2 jr2Var, wr2 wr2Var) {
        return (jk3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(jk3 jk3Var, nr2 nr2Var) {
        nr2Var.getClass();
        jk3Var.zzf = nr2Var;
    }

    public static hk3 w() {
        return (hk3) zzc.o();
    }

    public static ys2 y() {
        return (ys2) zzc.d(7);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (gk3.a[i - 1]) {
            case 1:
                return new jk3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new hk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (jk3.class) {
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
        return this.zze;
    }

    public final jr2 x() {
        return this.zzf;
    }
}
