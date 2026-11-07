package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class po3 extends cs2 {
    private static final po3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private wo3 zzg;

    static {
        po3 po3Var = new po3();
        zzc = po3Var;
        cs2.j(po3.class, po3Var);
    }

    public static po3 u(jr2 jr2Var, wr2 wr2Var) {
        return (po3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(po3 po3Var, wo3 wo3Var) {
        po3Var.zzg = wo3Var;
        po3Var.zze |= 1;
    }

    public static no3 w() {
        return (no3) zzc.o();
    }

    public static ys2 y() {
        return (ys2) zzc.d(7);
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (mo3.a[i - 1]) {
            case 1:
                return new po3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new no3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (po3.class) {
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

    public final wo3 x() {
        wo3 wo3Var = this.zzg;
        return wo3Var == null ? wo3.w() : wo3Var;
    }
}
