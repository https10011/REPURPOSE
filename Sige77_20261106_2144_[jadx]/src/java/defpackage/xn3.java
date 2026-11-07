package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xn3 extends cs2 {
    private static final xn3 zzc;
    private static volatile ys2 zzd;
    private String zze = BuildConfig.FLAVOR;
    private jr2 zzf = jr2.b;
    private int zzg;

    static {
        xn3 xn3Var = new xn3();
        zzc = xn3Var;
        cs2.j(xn3.class, xn3Var);
    }

    public static vn3 t() {
        return (vn3) zzc.o();
    }

    public static xn3 u(byte[] bArr, wr2 wr2Var) {
        return (xn3) cs2.i(zzc, bArr, wr2Var);
    }

    public static /* synthetic */ void v(xn3 xn3Var, String str) {
        str.getClass();
        xn3Var.zze = str;
    }

    public static /* synthetic */ void w(xn3 xn3Var, jr2 jr2Var) {
        jr2Var.getClass();
        xn3Var.zzf = jr2Var;
    }

    public static xn3 y() {
        return zzc;
    }

    public final jr2 A() {
        return this.zzf;
    }

    public final String B() {
        return this.zze;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (un3.a[i - 1]) {
            case 1:
                return new xn3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new vn3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (xn3.class) {
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

    public final ip3 z() {
        ip3 ip3VarA = ip3.a(this.zzg);
        return ip3VarA == null ? ip3.UNRECOGNIZED : ip3VarA;
    }
}
