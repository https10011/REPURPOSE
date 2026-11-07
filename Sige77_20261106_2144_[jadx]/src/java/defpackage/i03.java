package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class i03 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new gf3(c03.class, new qh1(17));
        b = new cf3(tr3VarC, new j10(17));
        c = new hd3(a03.class, new gp1(17));
        d = new ad3(tr3VarC, new nk1(17));
    }

    public static vy2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = m03.a[ip3Var.ordinal()];
        if (i == 1) {
            return vy2.f;
        }
        if (i == 2) {
            return vy2.i;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }
}
