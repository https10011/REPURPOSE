package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class c43 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new gf3(sz2.class, new vi(20));
        b = new cf3(tr3VarC, new nk1(19));
        c = new hd3(pz2.class, new ba0(20));
        d = new ad3(tr3VarC, new xn(20));
    }

    public static rz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = p43.a[ip3Var.ordinal()];
        if (i == 1) {
            return rz2.c;
        }
        if (i == 2 || i == 3) {
            return rz2.d;
        }
        if (i == 4) {
            return rz2.e;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(rz2 rz2Var) throws GeneralSecurityException {
        if (rz2.c == rz2Var) {
            return ip3.TINK;
        }
        if (rz2.d == rz2Var) {
            return ip3.CRUNCHY;
        }
        if (rz2.e == rz2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(rz2Var)));
    }
}
