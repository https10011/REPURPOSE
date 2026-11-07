package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ap3 extends cs2 {
    private static final ap3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private ep3 zzg;

    static {
        ap3 ap3Var = new ap3();
        zzc = ap3Var;
        cs2.j(ap3.class, ap3Var);
    }

    public static ap3 u(jr2 jr2Var, wr2 wr2Var) {
        return (ap3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(ap3 ap3Var, ep3 ep3Var) {
        ap3Var.zzg = ep3Var;
        ap3Var.zze |= 1;
    }

    public static yo3 w() {
        return (yo3) zzc.o();
    }

    public static ys2 y() {
        return (ys2) zzc.d(7);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (xo3.a[i - 1]) {
            case 1:
                return new ap3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new yo3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ap3.class) {
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

    public final ep3 x() {
        ep3 ep3Var = this.zzg;
        return ep3Var == null ? ep3.y() : ep3Var;
    }
}
