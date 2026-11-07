package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ln3 extends cs2 {
    private static final ln3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private bn3 zzg;
    private jr2 zzh = jr2.b;

    static {
        ln3 ln3Var = new ln3();
        zzc = ln3Var;
        cs2.j(ln3.class, ln3Var);
    }

    public static ln3 A() {
        return zzc;
    }

    public static ys2 C() {
        return (ys2) zzc.d(7);
    }

    public static ln3 u(jr2 jr2Var, wr2 wr2Var) {
        return (ln3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(ln3 ln3Var, nr2 nr2Var) {
        nr2Var.getClass();
        ln3Var.zzh = nr2Var;
    }

    public static /* synthetic */ void x(ln3 ln3Var, bn3 bn3Var) {
        ln3Var.zzg = bn3Var;
        ln3Var.zze |= 1;
    }

    public static jn3 z() {
        return (jn3) zzc.o();
    }

    public final jr2 B() {
        return this.zzh;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (in3.a[i - 1]) {
            case 1:
                return new ln3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new jn3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ln3.class) {
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

    public final bn3 y() {
        bn3 bn3Var = this.zzg;
        return bn3Var == null ? bn3.A() : bn3Var;
    }
}
