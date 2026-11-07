package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xl3 extends cs2 {
    private static final xl3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private jr2 zzf = jr2.b;
    private lo3 zzg;

    static {
        xl3 xl3Var = new xl3();
        zzc = xl3Var;
        cs2.j(xl3.class, xl3Var);
    }

    public static xl3 t(ByteArrayInputStream byteArrayInputStream, wr2 wr2Var) throws ks2 {
        cs2 cs2VarG = cs2.g(zzc, new pr2(byteArrayInputStream), wr2Var);
        cs2.l(cs2VarG);
        return (xl3) cs2VarG;
    }

    public static /* synthetic */ void u(xl3 xl3Var, nr2 nr2Var) {
        nr2Var.getClass();
        xl3Var.zzf = nr2Var;
    }

    public static /* synthetic */ void v(xl3 xl3Var, lo3 lo3Var) {
        xl3Var.zzg = lo3Var;
        xl3Var.zze |= 1;
    }

    public static vl3 w() {
        return (vl3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ul3.a[i - 1]) {
            case 1:
                return new xl3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new vl3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (xl3.class) {
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

    public final jr2 x() {
        return this.zzf;
    }
}
