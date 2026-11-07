package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class t43 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new gf3(wz2.class, new op0(20));
        b = new cf3(tr3VarC, new c11(20));
        c = new hd3(tz2.class, new br0(20));
        d = new ad3(tr3VarC, new r41(20));
    }

    public static qv2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = a53.a[ip3Var.ordinal()];
        if (i == 1) {
            return qv2.f;
        }
        if (i == 2 || i == 3) {
            return qv2.i;
        }
        if (i == 4) {
            return qv2.v;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(qv2 qv2Var) throws GeneralSecurityException {
        if (qv2.f == qv2Var) {
            return ip3.TINK;
        }
        if (qv2.i == qv2Var) {
            return ip3.CRUNCHY;
        }
        if (qv2.v == qv2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(qv2Var)));
    }
}
