package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jj3 extends cs2 {
    private static final jj3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private qj3 zzg;
    private jr2 zzh = jr2.b;

    static {
        jj3 jj3Var = new jj3();
        zzc = jj3Var;
        cs2.j(jj3.class, jj3Var);
    }

    public static ys2 A() {
        return (ys2) zzc.d(7);
    }

    public static jj3 u(jr2 jr2Var, wr2 wr2Var) {
        return (jj3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(jj3 jj3Var, nr2 nr2Var) {
        nr2Var.getClass();
        jj3Var.zzh = nr2Var;
    }

    public static /* synthetic */ void w(jj3 jj3Var, qj3 qj3Var) {
        jj3Var.zzg = qj3Var;
        jj3Var.zze |= 1;
    }

    public static ij3 x() {
        return (ij3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (hj3.a[i - 1]) {
            case 1:
                return new jj3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ij3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (jj3.class) {
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

    public final qj3 y() {
        qj3 qj3Var = this.zzg;
        return qj3Var == null ? qj3.w() : qj3Var;
    }

    public final jr2 z() {
        return this.zzh;
    }
}
