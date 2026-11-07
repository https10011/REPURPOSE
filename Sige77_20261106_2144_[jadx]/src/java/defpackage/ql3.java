package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ql3 extends cs2 {
    private static final ql3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private jr2 zzg = jr2.b;

    static {
        ql3 ql3Var = new ql3();
        zzc = ql3Var;
        cs2.j(ql3.class, ql3Var);
    }

    public static ol3 t() {
        return (ol3) zzc.o();
    }

    public static /* synthetic */ void u(ql3 ql3Var, jr2 jr2Var) {
        jr2Var.getClass();
        ql3Var.zzg = jr2Var;
    }

    public static ql3 x() {
        return zzc;
    }

    public final jr2 A() {
        return this.zzg;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (sl3.a[i - 1]) {
            case 1:
                return new ql3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ol3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ql3.class) {
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

    public final tl3 y() {
        tl3 tl3Var;
        int i = this.zze;
        if (i == 0) {
            tl3Var = tl3.UNKNOWN_CURVE;
        } else if (i == 2) {
            tl3Var = tl3.NIST_P256;
        } else if (i == 3) {
            tl3Var = tl3.NIST_P384;
        } else if (i != 4) {
            tl3Var = i != 5 ? null : tl3.CURVE25519;
        } else {
            tl3Var = tl3.NIST_P521;
        }
        return tl3Var == null ? tl3.UNRECOGNIZED : tl3Var;
    }

    public final bm3 z() {
        bm3 bm3VarA = bm3.a(this.zzf);
        return bm3VarA == null ? bm3.UNRECOGNIZED : bm3VarA;
    }
}
