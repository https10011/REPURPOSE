package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bh3 {
    static {
        int i = hp3.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ue3 ue3Var = ue3.b;
        ue3Var.a(ky2.k);
        ue3Var.b(ky2.l);
        ue3Var.a(ky2.j);
        int i = tg3.f;
        if (!ck1.g(i)) {
            tv2.f("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        rc2 rc2Var = mh3.a;
        te3 te3Var = te3.b;
        te3Var.h(mh3.c);
        te3Var.g(mh3.d);
        te3Var.f(mh3.e);
        te3Var.e(mh3.f);
        ue3Var.b(tg3.a);
        ue3Var.b(tg3.b);
        oe3 oe3Var = oe3.b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", eh3.a);
        ep1 ep1VarB = ah3.b();
        ep1VarB.b = 32;
        ep1VarB.c = 16;
        yg3 yg3Var = yg3.e;
        ep1VarB.e = yg3Var;
        zg3 zg3Var = zg3.d;
        ep1VarB.d = zg3Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", ep1VarB.F());
        ep1 ep1VarB2 = ah3.b();
        ep1VarB2.b = 32;
        ep1VarB2.c = 32;
        yg3 yg3Var2 = yg3.b;
        ep1VarB2.e = yg3Var2;
        ep1VarB2.d = zg3Var;
        map.put("HMAC_SHA256_256BITTAG", ep1VarB2.F());
        ep1 ep1VarB3 = ah3.b();
        ep1VarB3.b = 32;
        ep1VarB3.c = 32;
        ep1VarB3.e = yg3Var;
        ep1VarB3.d = zg3Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", ep1VarB3.F());
        ep1 ep1VarB4 = ah3.b();
        ep1VarB4.b = 64;
        ep1VarB4.c = 16;
        ep1VarB4.e = yg3Var2;
        zg3 zg3Var2 = zg3.f;
        ep1VarB4.d = zg3Var2;
        map.put("HMAC_SHA512_128BITTAG", ep1VarB4.F());
        ep1 ep1VarB5 = ah3.b();
        ep1VarB5.b = 64;
        ep1VarB5.c = 16;
        ep1VarB5.e = yg3Var;
        ep1VarB5.d = zg3Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", ep1VarB5.F());
        ep1 ep1VarB6 = ah3.b();
        ep1VarB6.b = 64;
        ep1VarB6.c = 32;
        ep1VarB6.e = yg3Var2;
        ep1VarB6.d = zg3Var2;
        map.put("HMAC_SHA512_256BITTAG", ep1VarB6.F());
        ep1 ep1VarB7 = ah3.b();
        ep1VarB7.b = 64;
        ep1VarB7.c = 32;
        ep1VarB7.e = yg3Var;
        ep1VarB7.d = zg3Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", ep1VarB7.F());
        map.put("HMAC_SHA512_512BITTAG", eh3.b);
        ep1 ep1VarB8 = ah3.b();
        ep1VarB8.b = 64;
        ep1VarB8.c = 64;
        ep1VarB8.e = yg3Var;
        ep1VarB8.d = zg3Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", ep1VarB8.F());
        oe3Var.b(Collections.unmodifiableMap(map));
        ie3 ie3Var = ie3.b;
        ie3Var.b(tg3.e, ah3.class);
        le3.b.a(tg3.d, ah3.class);
        vc3 vc3Var = vc3.d;
        vc3Var.b(tg3.c, i, true);
        if (f73.a()) {
            return;
        }
        sy2 sy2Var = ng3.a;
        if (!ck1.i(1)) {
            tv2.f("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        te3Var.h(hh3.a);
        te3Var.g(hh3.b);
        te3Var.f(hh3.c);
        te3Var.e(hh3.d);
        ie3Var.b(ng3.a, pg3.class);
        ue3Var.b(ng3.b);
        ue3Var.b(ng3.c);
        HashMap map2 = new HashMap();
        pg3 pg3Var = eh3.c;
        map2.put("AES_CMAC", pg3Var);
        map2.put("AES256_CMAC", pg3Var);
        u23 u23VarB = pg3.b();
        u23VarB.i(32);
        u23VarB.k(16);
        u23VarB.d = dz2.X;
        map2.put("AES256_CMAC_RAW", u23VarB.g());
        oe3Var.b(Collections.unmodifiableMap(map2));
        vc3Var.c(ng3.d, true);
    }
}
