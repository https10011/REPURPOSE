package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mj3 extends cs2 {
    private static final mj3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private qj3 zzf;
    private int zzg;

    static {
        mj3 mj3Var = new mj3();
        zzc = mj3Var;
        cs2.j(mj3.class, mj3Var);
    }

    public static mj3 u(jr2 jr2Var, wr2 wr2Var) {
        return (mj3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(mj3 mj3Var, qj3 qj3Var) {
        mj3Var.zzf = qj3Var;
        mj3Var.zze |= 1;
    }

    public static lj3 x() {
        return (lj3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (kj3.a[i - 1]) {
            case 1:
                return new mj3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new lj3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (mj3.class) {
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
        return this.zzg;
    }

    public final qj3 y() {
        qj3 qj3Var = this.zzf;
        return qj3Var == null ? qj3.w() : qj3Var;
    }
}
