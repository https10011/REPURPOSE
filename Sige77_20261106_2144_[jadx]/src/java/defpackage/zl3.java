package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zl3 extends cs2 {
    private static final zl3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private km3 zzg;
    private jr2 zzh = jr2.b;

    static {
        zl3 zl3Var = new zl3();
        zzc = zl3Var;
        cs2.j(zl3.class, zl3Var);
    }

    public static ys2 B() {
        return (ys2) zzc.d(7);
    }

    public static zl3 u(jr2 jr2Var, wr2 wr2Var) {
        return (zl3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(zl3 zl3Var, jr2 jr2Var) {
        jr2Var.getClass();
        zl3Var.zzh = jr2Var;
    }

    public static /* synthetic */ void w(zl3 zl3Var, km3 km3Var) {
        zl3Var.zzg = km3Var;
        zl3Var.zze |= 1;
    }

    public static yl3 x() {
        return (yl3) zzc.o();
    }

    public static zl3 y() {
        return zzc;
    }

    public final jr2 A() {
        return this.zzh;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (dm3.a[i - 1]) {
            case 1:
                return new zl3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new yl3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (zl3.class) {
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

    public final km3 z() {
        km3 km3Var = this.zzg;
        return km3Var == null ? km3.y() : km3Var;
    }
}
