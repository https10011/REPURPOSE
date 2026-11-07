package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rq3 implements lv2 {
    public static final rc2 a;
    public static final rc2 b;

    static {
        hd2 hd2VarD = rc2.D();
        hd2VarD.l(wq3.a, j83.b);
        hd2VarD.l(wq3.b, j83.c);
        hd2VarD.l(wq3.c, j83.d);
        a = hd2VarD.k();
        hd2 hd2VarD2 = rc2.D();
        hd2VarD2.l(zq3.a, l83.c);
        hd2VarD2.l(zq3.b, l83.b);
        hd2VarD2.l(zq3.c, l83.d);
        b = hd2VarD2.k();
    }

    public static final String a(i83 i83Var) {
        if (i83Var.equals(i83.b)) {
            return "HmacSha1";
        }
        if (i83Var == i83.c) {
            return "HmacSha224";
        }
        if (i83Var == i83.d) {
            return "HmacSha256";
        }
        if (i83Var == i83.e) {
            return "HmacSha384";
        }
        if (i83Var == i83.f) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(i83Var)));
    }
}
