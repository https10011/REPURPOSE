package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h63 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = new gf3(s13.class, new qh1(20));
        b = new cf3(tr3VarC, new u41(20));
        c = new hd3(l13.class, new mo1(20));
        d = new ad3(tr3VarC, new sh1(20));
    }

    public static nz2 a(ip3 ip3Var) throws GeneralSecurityException {
        int i = p63.a[ip3Var.ordinal()];
        if (i == 1) {
            return nz2.f;
        }
        if (i == 2) {
            return nz2.i;
        }
        throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
    }
}
