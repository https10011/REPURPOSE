package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class q63 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new gf3(f23.class, new gp1(20));
        b = new cf3(tr3VarC, new j10(20));
        c = new hd3(z13.class, new k42(20));
        d = new ad3(tr3VarC, new w40(20));
    }

    public static rz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = t63.a[ip3Var.ordinal()];
        if (i == 1) {
            return rz2.f;
        }
        if (i == 2 || i == 3) {
            return rz2.g;
        }
        if (i == 4) {
            return rz2.h;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(rz2 rz2Var) throws GeneralSecurityException {
        if (rz2.f == rz2Var) {
            return ip3.TINK;
        }
        if (rz2.g == rz2Var) {
            return ip3.CRUNCHY;
        }
        if (rz2.h == rz2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(rz2Var)));
    }
}
