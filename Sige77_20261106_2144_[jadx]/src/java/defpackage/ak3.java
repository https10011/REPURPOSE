package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ak3 extends cs2 {
    private static final ak3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private jr2 zzf = jr2.b;

    static {
        ak3 ak3Var = new ak3();
        zzc = ak3Var;
        cs2.j(ak3.class, ak3Var);
    }

    public static ak3 u(jr2 jr2Var, wr2 wr2Var) {
        return (ak3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(ak3 ak3Var, nr2 nr2Var) {
        nr2Var.getClass();
        ak3Var.zzf = nr2Var;
    }

    public static zj3 w() {
        return (zj3) zzc.o();
    }

    public static ys2 y() {
        return (ys2) zzc.d(7);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (yj3.a[i - 1]) {
            case 1:
                return new ak3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new zj3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ak3.class) {
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
