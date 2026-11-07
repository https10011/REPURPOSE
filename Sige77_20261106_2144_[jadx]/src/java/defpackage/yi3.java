package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yi3 extends cs2 {
    private static final yi3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private fj3 zzg;
    private jr2 zzh = jr2.b;

    static {
        yi3 yi3Var = new yi3();
        zzc = yi3Var;
        cs2.j(yi3.class, yi3Var);
    }

    public static /* synthetic */ void u(yi3 yi3Var, nr2 nr2Var) {
        nr2Var.getClass();
        yi3Var.zzh = nr2Var;
    }

    public static /* synthetic */ void v(yi3 yi3Var, fj3 fj3Var) {
        yi3Var.zzg = fj3Var;
        yi3Var.zze |= 1;
    }

    public static wi3 w() {
        return (wi3) zzc.o();
    }

    public static yi3 x() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (vi3.a[i - 1]) {
            case 1:
                return new yi3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new wi3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (yi3.class) {
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

    public final fj3 y() {
        fj3 fj3Var = this.zzg;
        return fj3Var == null ? fj3.w() : fj3Var;
    }

    public final jr2 z() {
        return this.zzh;
    }
}
