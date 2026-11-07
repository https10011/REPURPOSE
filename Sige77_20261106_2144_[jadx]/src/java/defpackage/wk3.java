package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wk3 extends cs2 {
    private static final wk3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private xn3 zzf;

    static {
        wk3 wk3Var = new wk3();
        zzc = wk3Var;
        cs2.j(wk3.class, wk3Var);
    }

    public static vk3 t() {
        return (vk3) zzc.o();
    }

    public static /* synthetic */ void u(wk3 wk3Var, xn3 xn3Var) {
        xn3Var.getClass();
        wk3Var.zzf = xn3Var;
        wk3Var.zze |= 1;
    }

    public static wk3 v() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (yk3.a[i - 1]) {
            case 1:
                return new wk3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new vk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (wk3.class) {
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

    public final xn3 w() {
        xn3 xn3Var = this.zzf;
        return xn3Var == null ? xn3.y() : xn3Var;
    }
}
