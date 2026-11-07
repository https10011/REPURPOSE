package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qn3 extends cs2 {
    private static final qn3 zzc;
    private static volatile ys2 zzd;
    private String zze = BuildConfig.FLAVOR;
    private jr2 zzf = jr2.b;
    private int zzg;

    static {
        qn3 qn3Var = new qn3();
        zzc = qn3Var;
        cs2.j(qn3.class, qn3Var);
    }

    public static on3 t() {
        return (on3) zzc.o();
    }

    public static void u(qn3 qn3Var, int i) {
        int i2;
        if (i == 6) {
            ds2.c();
            throw null;
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                i2 = 1;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                i2 = 2;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                i2 = 3;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                i2 = 4;
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                i2 = -1;
                break;
            default:
                throw null;
        }
        qn3Var.zzg = i2;
    }

    public static /* synthetic */ void v(qn3 qn3Var, String str) {
        str.getClass();
        qn3Var.zze = str;
    }

    public static /* synthetic */ void w(qn3 qn3Var, jr2 jr2Var) {
        jr2Var.getClass();
        qn3Var.zzf = jr2Var;
    }

    public static qn3 y() {
        return zzc;
    }

    public final String A() {
        return this.zze;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (nn3.a[i - 1]) {
            case 1:
                return new qn3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new on3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (qn3.class) {
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

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[PHI: r1
      0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    public final int x() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        if (i2 == 0) {
            return 6;
        }
        return i2;
    }

    public final jr2 z() {
        return this.zzf;
    }
}
