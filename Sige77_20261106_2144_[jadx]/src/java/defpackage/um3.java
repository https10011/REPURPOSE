package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class um3 extends cs2 {
    private static final um3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private bn3 zzf;

    static {
        um3 um3Var = new um3();
        zzc = um3Var;
        cs2.j(um3.class, um3Var);
    }

    public static um3 t(jr2 jr2Var, wr2 wr2Var) {
        return (um3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void u(um3 um3Var, bn3 bn3Var) {
        um3Var.zzf = bn3Var;
        um3Var.zze |= 1;
    }

    public static tm3 v() {
        return (tm3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (sm3.a[i - 1]) {
            case 1:
                return new um3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new tm3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (um3.class) {
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

    public final bn3 w() {
        bn3 bn3Var = this.zzf;
        return bn3Var == null ? bn3.A() : bn3Var;
    }
}
