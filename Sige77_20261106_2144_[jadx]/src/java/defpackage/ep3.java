package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ep3 extends cs2 {
    private static final ep3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private xn3 zzg;

    static {
        ep3 ep3Var = new ep3();
        zzc = ep3Var;
        cs2.j(ep3.class, ep3Var);
    }

    public static ep3 u(jr2 jr2Var, wr2 wr2Var) {
        return (ep3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(ep3 ep3Var, String str) {
        str.getClass();
        ep3Var.zzf = str;
    }

    public static /* synthetic */ void w(ep3 ep3Var, xn3 xn3Var) {
        xn3Var.getClass();
        ep3Var.zzg = xn3Var;
        ep3Var.zze |= 1;
    }

    public static dp3 x() {
        return (dp3) zzc.o();
    }

    public static ep3 y() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (cp3.a[i - 1]) {
            case 1:
                return new ep3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new dp3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ep3.class) {
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

    public final xn3 t() {
        xn3 xn3Var = this.zzg;
        return xn3Var == null ? xn3.y() : xn3Var;
    }

    public final String z() {
        return this.zzf;
    }
}
