package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class el3 extends cs2 {
    private static final el3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private ql3 zzf;
    private wk3 zzg;
    private int zzh;

    static {
        el3 el3Var = new el3();
        zzc = el3Var;
        cs2.j(el3.class, el3Var);
    }

    public static /* synthetic */ void u(el3 el3Var, wk3 wk3Var) {
        el3Var.zzg = wk3Var;
        el3Var.zze |= 2;
    }

    public static /* synthetic */ void w(el3 el3Var, ql3 ql3Var) {
        el3Var.zzf = ql3Var;
        el3Var.zze |= 1;
    }

    public static cl3 y() {
        return (cl3) zzc.o();
    }

    public static el3 z() {
        return zzc;
    }

    public final ql3 A() {
        ql3 ql3Var = this.zzf;
        return ql3Var == null ? ql3.x() : ql3Var;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (fl3.a[i - 1]) {
            case 1:
                return new el3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new cl3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (el3.class) {
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

    public final xk3 t() {
        xk3 xk3Var;
        int i = this.zzh;
        if (i == 0) {
            xk3Var = xk3.UNKNOWN_FORMAT;
        } else if (i == 1) {
            xk3Var = xk3.UNCOMPRESSED;
        } else if (i != 2) {
            xk3Var = i != 3 ? null : xk3.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            xk3Var = xk3.COMPRESSED;
        }
        return xk3Var == null ? xk3.UNRECOGNIZED : xk3Var;
    }

    public final wk3 x() {
        wk3 wk3Var = this.zzg;
        return wk3Var == null ? wk3.v() : wk3Var;
    }
}
