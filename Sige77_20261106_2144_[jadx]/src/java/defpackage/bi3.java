package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bi3 extends cs2 {
    private static final bi3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private jr2 zzg = jr2.b;
    private li3 zzh;

    static {
        bi3 bi3Var = new bi3();
        zzc = bi3Var;
        cs2.j(bi3.class, bi3Var);
    }

    public static ys2 A() {
        return (ys2) zzc.d(7);
    }

    public static bi3 u(jr2 jr2Var, wr2 wr2Var) {
        return (bi3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(bi3 bi3Var, nr2 nr2Var) {
        nr2Var.getClass();
        bi3Var.zzg = nr2Var;
    }

    public static /* synthetic */ void w(bi3 bi3Var, li3 li3Var) {
        bi3Var.zzh = li3Var;
        bi3Var.zze |= 1;
    }

    public static ai3 x() {
        return (ai3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (zh3.a[i - 1]) {
            case 1:
                return new bi3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ai3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (bi3.class) {
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

    public final li3 y() {
        li3 li3Var = this.zzh;
        return li3Var == null ? li3.w() : li3Var;
    }

    public final jr2 z() {
        return this.zzg;
    }
}
