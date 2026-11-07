package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h23 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new gf3(yy2.class, new br0(19));
        b = new cf3(tr3VarC, new op0(19));
        c = new hd3(oy2.class, new r41(19));
        d = new ad3(tr3VarC, new c11(19));
    }

    public static vy2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = v23.a[ip3Var.ordinal()];
        if (i == 1) {
            return vy2.c;
        }
        if (i == 2 || i == 3) {
            return vy2.d;
        }
        if (i == 4) {
            return vy2.e;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static wy2 b(bm3 bm3Var) throws GeneralSecurityException {
        int i = v23.b[bm3Var.ordinal()];
        if (i == 1) {
            return wy2.c;
        }
        if (i == 2) {
            return wy2.d;
        }
        if (i == 3) {
            return wy2.e;
        }
        if (i == 4) {
            return wy2.f;
        }
        if (i == 5) {
            return wy2.i;
        }
        throw new GeneralSecurityException(ck1.r(bm3Var.zza(), "Unable to parse HashType: "));
    }

    public static ip3 c(vy2 vy2Var) throws GeneralSecurityException {
        if (vy2.c == vy2Var) {
            return ip3.TINK;
        }
        if (vy2.d == vy2Var) {
            return ip3.CRUNCHY;
        }
        if (vy2.e == vy2Var) {
            return ip3.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vy2Var)));
    }

    public static km3 d(yy2 yy2Var) {
        bm3 bm3Var;
        im3 im3VarX = km3.x();
        int i = yy2Var.d;
        im3VarX.f();
        ((km3) im3VarX.b).zzf = i;
        wy2 wy2Var = yy2Var.f;
        if (wy2.c == wy2Var) {
            bm3Var = bm3.SHA1;
        } else if (wy2.d == wy2Var) {
            bm3Var = bm3.SHA224;
        } else if (wy2.e == wy2Var) {
            bm3Var = bm3.SHA256;
        } else if (wy2.f == wy2Var) {
            bm3Var = bm3.SHA384;
        } else {
            if (wy2.i != wy2Var) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(wy2Var)));
            }
            bm3Var = bm3.SHA512;
        }
        im3VarX.f();
        ((km3) im3VarX.b).zze = bm3Var.zza();
        return (km3) im3VarX.d();
    }
}
