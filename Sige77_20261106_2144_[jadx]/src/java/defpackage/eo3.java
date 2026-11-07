package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eo3 extends cs2 {
    private static final eo3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private qn3 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        eo3 eo3Var = new eo3();
        zzc = eo3Var;
        cs2.j(eo3.class, eo3Var);
    }

    public static do3 A() {
        return (do3) zzc.o();
    }

    public static /* synthetic */ void v(eo3 eo3Var, qn3 qn3Var) {
        eo3Var.zzf = qn3Var;
        eo3Var.zze |= 1;
    }

    public final ip3 B() {
        ip3 ip3VarA = ip3.a(this.zzi);
        return ip3VarA == null ? ip3.UNRECOGNIZED : ip3VarA;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (co3.a[i - 1]) {
            case 1:
                return new eo3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new do3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (eo3.class) {
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
        return this.zzh;
    }

    public final qn3 y() {
        qn3 qn3Var = this.zzf;
        return qn3Var == null ? qn3.y() : qn3Var;
    }

    public final int z() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i2 = i != 3 ? 0 : 4;
                }
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 5;
        }
        return i2;
    }
}
