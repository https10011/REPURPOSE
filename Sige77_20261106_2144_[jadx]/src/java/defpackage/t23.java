package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class t23 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new gf3(fz2.class, new qh1(19));
        b = new cf3(tr3VarC, new u41(19));
        c = new hd3(az2.class, new mo1(19));
        d = new ad3(tr3VarC, new sh1(19));
    }

    public static dz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = i33.a[ip3Var.ordinal()];
        if (i == 1) {
            return dz2.c;
        }
        if (i == 2 || i == 3) {
            return dz2.d;
        }
        if (i == 4) {
            return dz2.e;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(dz2 dz2Var) throws GeneralSecurityException {
        if (dz2.c == dz2Var) {
            return ip3.TINK;
        }
        if (dz2.d == dz2Var) {
            return ip3.CRUNCHY;
        }
        if (dz2.e == dz2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dz2Var)));
    }

    public static qj3 c(fz2 fz2Var) {
        if (fz2Var.c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(fz2Var.c)));
        }
        pj3 pj3VarV = qj3.v();
        int i = fz2Var.b;
        pj3VarV.f();
        ((qj3) pj3VarV.b).zze = i;
        return (qj3) pj3VarV.d();
    }
}
