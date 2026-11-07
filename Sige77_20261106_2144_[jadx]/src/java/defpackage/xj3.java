package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xj3 extends cs2 {
    private static final xj3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;

    static {
        xj3 xj3Var = new xj3();
        zzc = xj3Var;
        cs2.j(xj3.class, xj3Var);
    }

    public static xj3 u(jr2 jr2Var, wr2 wr2Var) {
        return (xj3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static wj3 x() {
        return (wj3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (vj3.a[i - 1]) {
            case 1:
                return new xj3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new wj3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (xj3.class) {
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

    public final int w() {
        return this.zzf;
    }
}
