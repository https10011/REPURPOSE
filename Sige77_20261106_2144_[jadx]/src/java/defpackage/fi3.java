package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fi3 extends cs2 {
    private static final fi3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private li3 zzg;

    static {
        fi3 fi3Var = new fi3();
        zzc = fi3Var;
        cs2.j(fi3.class, fi3Var);
    }

    public static fi3 u(jr2 jr2Var, wr2 wr2Var) {
        return (fi3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(fi3 fi3Var, li3 li3Var) {
        fi3Var.zzg = li3Var;
        fi3Var.zze |= 1;
    }

    public static di3 x() {
        return (di3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ci3.a[i - 1]) {
            case 1:
                return new fi3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new di3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (fi3.class) {
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
        li3 li3Var = this.zzg;
        return li3Var == null ? li3.w() : li3Var;
    }
}
