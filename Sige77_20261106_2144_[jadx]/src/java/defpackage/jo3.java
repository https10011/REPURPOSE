package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jo3 extends cs2 {
    private static final jo3 zzc;
    private static volatile ys2 zzd;
    private String zze = BuildConfig.FLAVOR;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        jo3 jo3Var = new jo3();
        zzc = jo3Var;
        cs2.j(jo3.class, jo3Var);
    }

    public static /* synthetic */ void u(jo3 jo3Var, String str) {
        str.getClass();
        jo3Var.zze = str;
    }

    public static io3 x() {
        return (io3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ho3.a[i - 1]) {
            case 1:
                return new jo3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new io3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (jo3.class) {
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
