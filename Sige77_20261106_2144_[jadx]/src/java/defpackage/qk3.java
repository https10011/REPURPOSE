package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qk3 extends cs2 {
    private static final qk3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private jr2 zzf = jr2.b;

    static {
        qk3 qk3Var = new qk3();
        zzc = qk3Var;
        cs2.j(qk3.class, qk3Var);
    }

    public static qk3 u(jr2 jr2Var, wr2 wr2Var) {
        return (qk3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(qk3 qk3Var, nr2 nr2Var) {
        nr2Var.getClass();
        qk3Var.zzf = nr2Var;
    }

    public static pk3 w() {
        return (pk3) zzc.o();
    }

    public static ys2 y() {
        return (ys2) zzc.d(7);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ok3.a[i - 1]) {
            case 1:
                return new qk3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new pk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (qk3.class) {
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
