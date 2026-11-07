package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hp3 extends cs2 {
    public static final /* synthetic */ int a = 0;
    private static final hp3 zzc;
    private static volatile ys2 zzd;
    private String zze = BuildConfig.FLAVOR;
    private js2 zzf = zs2.e;

    static {
        hp3 hp3Var = new hp3();
        zzc = hp3Var;
        cs2.j(hp3.class, hp3Var);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (jp3.a[i - 1]) {
            case 1:
                return new hp3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new tk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", ao3.class});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (hp3.class) {
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
