package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uk3 extends cs2 {
    private static final uk3 zzc;
    private static volatile ys2 zzd;

    static {
        uk3 uk3Var = new uk3();
        zzc = uk3Var;
        cs2.j(uk3.class, uk3Var);
    }

    public static void t(jr2 jr2Var, wr2 wr2Var) {
    }

    public static uk3 u() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (sk3.a[i - 1]) {
            case 1:
                return new uk3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new tk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0000", null);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (uk3.class) {
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
}
