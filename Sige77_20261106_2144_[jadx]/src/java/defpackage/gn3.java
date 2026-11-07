package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gn3 extends cs2 {
    private static final gn3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private ln3 zzg;
    private jr2 zzh = jr2.b;

    static {
        gn3 gn3Var = new gn3();
        zzc = gn3Var;
        cs2.j(gn3.class, gn3Var);
    }

    public static ys2 B() {
        return (ys2) zzc.d(7);
    }

    public static gn3 u(jr2 jr2Var, wr2 wr2Var) {
        return (gn3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(gn3 gn3Var, nr2 nr2Var) {
        nr2Var.getClass();
        gn3Var.zzh = nr2Var;
    }

    public static /* synthetic */ void x(gn3 gn3Var, ln3 ln3Var) {
        gn3Var.zzg = ln3Var;
        gn3Var.zze |= 1;
    }

    public static en3 y() {
        return (en3) zzc.o();
    }

    public final jr2 A() {
        return this.zzh;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (dn3.a[i - 1]) {
            case 1:
                return new gn3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new en3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (gn3.class) {
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

    public final ln3 z() {
        ln3 ln3Var = this.zzg;
        return ln3Var == null ? ln3.A() : ln3Var;
    }
}
