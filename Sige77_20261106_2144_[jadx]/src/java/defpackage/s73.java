package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class s73 {
    static {
        int i = hp3.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        ue3 ue3Var = ue3.b;
        ue3Var.a(ky2.d);
        ue3Var.b(ky2.e);
        if (f73.a()) {
            return;
        }
        nf3 nf3Var = o73.a;
        if (!ck1.i(1)) {
            tv2.f("Registering AES SIV is not supported in FIPS mode");
            return;
        }
        gf3 gf3Var = y73.a;
        te3 te3Var = te3.b;
        te3Var.h(y73.a);
        te3Var.g(y73.b);
        te3Var.f(y73.c);
        te3Var.e(y73.d);
        ue3Var.b(o73.a);
        oe3 oe3Var = oe3.b;
        HashMap map = new HashMap();
        map.put("AES256_SIV", w73.a);
        rc2 rc2VarB = r73.b();
        rc2VarB.H(64);
        rc2VarB.c = q73.d;
        map.put("AES256_SIV_RAW", rc2VarB.G());
        oe3Var.b(Collections.unmodifiableMap(map));
        le3.b.a(o73.c, r73.class);
        ie3.b.b(o73.d, r73.class);
        vc3.d.c(o73.b, true);
    }
}
