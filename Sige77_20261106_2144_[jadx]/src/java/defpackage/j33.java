package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class j33 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new gf3(oz2.class, new j10(19));
        b = new cf3(tr3VarC, new gp1(19));
        c = new hd3(gz2.class, new vl0(19));
        d = new ad3(tr3VarC, new w40(19));
    }

    public static nz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = z33.a[ip3Var.ordinal()];
        if (i == 1) {
            return nz2.c;
        }
        if (i == 2 || i == 3) {
            return nz2.d;
        }
        if (i == 4) {
            return nz2.e;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static ip3 b(nz2 nz2Var) throws GeneralSecurityException {
        if (nz2.c == nz2Var) {
            return ip3.TINK;
        }
        if (nz2.d == nz2Var) {
            return ip3.CRUNCHY;
        }
        if (nz2.e == nz2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(nz2Var)));
    }

    public static void c(oz2 oz2Var) {
        int i = oz2Var.c;
        int i2 = oz2Var.b;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(oz2Var.c)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }
}
