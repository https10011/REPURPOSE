package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class km3 extends cs2 {
    private static final km3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;

    static {
        km3 km3Var = new km3();
        zzc = km3Var;
        cs2.j(km3.class, km3Var);
    }

    public static im3 x() {
        return (im3) zzc.o();
    }

    public static km3 y() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (lm3.a[i - 1]) {
            case 1:
                return new km3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new im3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (km3.class) {
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

    public final bm3 w() {
        bm3 bm3VarA = bm3.a(this.zze);
        return bm3VarA == null ? bm3.UNRECOGNIZED : bm3VarA;
    }
}
