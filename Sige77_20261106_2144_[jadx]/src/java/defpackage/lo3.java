package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lo3 extends cs2 {
    private static final lo3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private js2 zzf = zs2.e;

    static {
        lo3 lo3Var = new lo3();
        zzc = lo3Var;
        cs2.j(lo3.class, lo3Var);
    }

    public static void u(lo3 lo3Var, jo3 jo3Var) {
        js2 js2Var = lo3Var.zzf;
        if (!((zq2) js2Var).a) {
            lo3Var.zzf = ((zs2) js2Var).b(js2Var.size() << 1);
        }
        lo3Var.zzf.add(jo3Var);
    }

    public static ko3 v() {
        return (ko3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ho3.a[i - 1]) {
            case 1:
                return new lo3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ko3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", jo3.class});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (lo3.class) {
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
