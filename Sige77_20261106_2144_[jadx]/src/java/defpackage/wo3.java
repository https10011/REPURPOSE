package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wo3 extends cs2 {
    private static final wo3 zzc;
    private static volatile ys2 zzd;
    private String zze = BuildConfig.FLAVOR;

    static {
        wo3 wo3Var = new wo3();
        zzc = wo3Var;
        cs2.j(wo3.class, wo3Var);
    }

    public static vo3 t() {
        return (vo3) zzc.o();
    }

    public static wo3 u(jr2 jr2Var, wr2 wr2Var) {
        return (wo3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(wo3 wo3Var, String str) {
        str.getClass();
        wo3Var.zze = str;
    }

    public static wo3 w() {
        return zzc;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (uo3.a[i - 1]) {
            case 1:
                return new wo3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new vo3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (wo3.class) {
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

    public final String x() {
        return this.zze;
    }
}
