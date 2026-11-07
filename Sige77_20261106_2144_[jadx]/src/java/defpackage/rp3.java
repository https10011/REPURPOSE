package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rp3 extends cs2 {
    private static final rp3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private vp3 zzg;

    static {
        rp3 rp3Var = new rp3();
        zzc = rp3Var;
        cs2.j(rp3.class, rp3Var);
    }

    public static rp3 u(jr2 jr2Var, wr2 wr2Var) {
        return (rp3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(rp3 rp3Var, vp3 vp3Var) {
        rp3Var.zzg = vp3Var;
        rp3Var.zze |= 1;
    }

    public static pp3 w() {
        return (pp3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (tp3.a[i - 1]) {
            case 1:
                return new rp3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new pp3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (rp3.class) {
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

    public final vp3 x() {
        vp3 vp3Var = this.zzg;
        return vp3Var == null ? vp3.w() : vp3Var;
    }
}
