package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hh3 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new gf3(pg3.class, new w40(22));
        b = new cf3(tr3VarC, new nk1(22));
        c = new hd3(jg3.class, new vl0(22));
        d = new ad3(tr3VarC, new vi(23));
    }

    public static dz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = kh3.a[ip3Var.ordinal()];
        if (i == 1) {
            return dz2.v;
        }
        if (i == 2) {
            return dz2.w;
        }
        if (i == 3) {
            return dz2.W;
        }
        if (i == 4) {
            return dz2.X;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(dz2 dz2Var) throws GeneralSecurityException {
        if (dz2.v == dz2Var) {
            return ip3.TINK;
        }
        if (dz2.w == dz2Var) {
            return ip3.CRUNCHY;
        }
        if (dz2.X == dz2Var) {
            return ip3.RAW;
        }
        if (dz2.W == dz2Var) {
            return ip3.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dz2Var)));
    }
}
