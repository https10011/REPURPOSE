package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cj3 extends cs2 {
    private static final cj3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private fj3 zzf;
    private int zzg;

    static {
        cj3 cj3Var = new cj3();
        zzc = cj3Var;
        cs2.j(cj3.class, cj3Var);
    }

    public static /* synthetic */ void v(cj3 cj3Var, fj3 fj3Var) {
        cj3Var.zzf = fj3Var;
        cj3Var.zze |= 1;
    }

    public static bj3 w() {
        return (bj3) zzc.o();
    }

    public static cj3 x() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (zi3.a[i - 1]) {
            case 1:
                return new cj3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new bj3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (cj3.class) {
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
        return this.zzg;
    }

    public final fj3 y() {
        fj3 fj3Var = this.zzf;
        return fj3Var == null ? fj3.w() : fj3Var;
    }
}
