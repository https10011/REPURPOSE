package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kl3 extends cs2 {
    private static final kl3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private el3 zzg;
    private jr2 zzh;
    private jr2 zzi;

    static {
        kl3 kl3Var = new kl3();
        zzc = kl3Var;
        cs2.j(kl3.class, kl3Var);
    }

    public kl3() {
        nr2 nr2Var = jr2.b;
        this.zzh = nr2Var;
        this.zzi = nr2Var;
    }

    public static jl3 A() {
        return (jl3) zzc.o();
    }

    public static kl3 B() {
        return zzc;
    }

    public static ys2 E() {
        return (ys2) zzc.d(7);
    }

    public static kl3 u(jr2 jr2Var, wr2 wr2Var) {
        return (kl3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void w(kl3 kl3Var, jr2 jr2Var) {
        jr2Var.getClass();
        kl3Var.zzh = jr2Var;
    }

    public static /* synthetic */ void x(kl3 kl3Var, el3 el3Var) {
        kl3Var.zzg = el3Var;
        kl3Var.zze |= 1;
    }

    public static /* synthetic */ void z(kl3 kl3Var, jr2 jr2Var) {
        jr2Var.getClass();
        kl3Var.zzi = jr2Var;
    }

    public final jr2 C() {
        return this.zzh;
    }

    public final jr2 D() {
        return this.zzi;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (nl3.a[i - 1]) {
            case 1:
                return new kl3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new jl3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (kl3.class) {
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

    public final el3 y() {
        el3 el3Var = this.zzg;
        return el3Var == null ? el3.z() : el3Var;
    }
}
