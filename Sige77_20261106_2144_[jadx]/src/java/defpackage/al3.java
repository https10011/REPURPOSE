package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class al3 extends cs2 {
    private static final al3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private el3 zzf;

    static {
        al3 al3Var = new al3();
        zzc = al3Var;
        cs2.j(al3.class, al3Var);
    }

    public static zk3 t() {
        return (zk3) zzc.o();
    }

    public static al3 u(jr2 jr2Var, wr2 wr2Var) {
        return (al3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(al3 al3Var, el3 el3Var) {
        al3Var.zzf = el3Var;
        al3Var.zze |= 1;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (bl3.a[i - 1]) {
            case 1:
                return new al3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new zk3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (al3.class) {
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

    public final el3 w() {
        el3 el3Var = this.zzf;
        return el3Var == null ? el3.z() : el3Var;
    }
}
