package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hl3 extends cs2 {
    private static final hl3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private kl3 zzg;
    private jr2 zzh = jr2.b;

    static {
        hl3 hl3Var = new hl3();
        zzc = hl3Var;
        cs2.j(hl3.class, hl3Var);
    }

    public static ys2 B() {
        return (ys2) zzc.d(7);
    }

    public static hl3 u(jr2 jr2Var, wr2 wr2Var) {
        return (hl3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(hl3 hl3Var, jr2 jr2Var) {
        jr2Var.getClass();
        hl3Var.zzh = jr2Var;
    }

    public static /* synthetic */ void x(hl3 hl3Var, kl3 kl3Var) {
        hl3Var.zzg = kl3Var;
        hl3Var.zze |= 1;
    }

    public static gl3 y() {
        return (gl3) zzc.o();
    }

    public final jr2 A() {
        return this.zzh;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (il3.a[i - 1]) {
            case 1:
                return new hl3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new gl3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (hl3.class) {
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

    public final kl3 z() {
        kl3 kl3Var = this.zzg;
        return kl3Var == null ? kl3.B() : kl3Var;
    }
}
