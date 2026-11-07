package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fm3 extends cs2 {
    private static final fm3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private km3 zzf;
    private int zzg;
    private int zzh;

    static {
        fm3 fm3Var = new fm3();
        zzc = fm3Var;
        cs2.j(fm3.class, fm3Var);
    }

    public static fm3 u(jr2 jr2Var, wr2 wr2Var) {
        return (fm3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(fm3 fm3Var, km3 km3Var) {
        fm3Var.zzf = km3Var;
        fm3Var.zze |= 1;
    }

    public static em3 y() {
        return (em3) zzc.o();
    }

    public static fm3 z() {
        return zzc;
    }

    public final km3 A() {
        km3 km3Var = this.zzf;
        return km3Var == null ? km3.y() : km3Var;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (hm3.a[i - 1]) {
            case 1:
                return new fm3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new em3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (fm3.class) {
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

    public final int x() {
        return this.zzh;
    }
}
