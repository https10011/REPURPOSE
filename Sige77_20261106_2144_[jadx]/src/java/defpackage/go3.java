package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class go3 extends cs2 {
    private static final go3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private js2 zzf = zs2.e;

    static {
        go3 go3Var = new go3();
        zzc = go3Var;
        cs2.j(go3.class, go3Var);
    }

    public static fo3 A() {
        return (fo3) zzc.o();
    }

    public static go3 v(ByteArrayInputStream byteArrayInputStream, wr2 wr2Var) throws ks2 {
        cs2 cs2VarG = cs2.g(zzc, new pr2(byteArrayInputStream), wr2Var);
        cs2.l(cs2VarG);
        return (go3) cs2VarG;
    }

    public static go3 w(byte[] bArr, wr2 wr2Var) {
        return (go3) cs2.i(zzc, bArr, wr2Var);
    }

    public static void y(go3 go3Var, eo3 eo3Var) {
        js2 js2Var = go3Var.zzf;
        if (!((zq2) js2Var).a) {
            go3Var.zzf = ((zs2) js2Var).b(js2Var.size() << 1);
        }
        go3Var.zzf.add(eo3Var);
    }

    public final js2 B() {
        return this.zzf;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (co3.a[i - 1]) {
            case 1:
                return new go3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new fo3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", eo3.class});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (go3.class) {
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
        return this.zzf.size();
    }

    public final eo3 u(int i) {
        return (eo3) this.zzf.get(i);
    }

    public final int z() {
        return this.zze;
    }
}
