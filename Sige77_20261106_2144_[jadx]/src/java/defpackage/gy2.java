package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gy2 {
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
        ue3Var.a(ky2.b);
        ue3Var.b(ky2.c);
        bh3.a();
        int i = ry2.e;
        if (!ck1.g(i)) {
            tv2.f("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        gf3 gf3Var = h23.a;
        te3 te3Var = te3.b;
        te3Var.h(h23.a);
        te3Var.g(h23.b);
        te3Var.f(h23.c);
        te3Var.e(h23.d);
        ue3Var.b(ry2.a);
        oe3 oe3Var = oe3.b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", y03.e);
        qp0 qp0VarB = yy2.b();
        qp0VarB.r(16);
        qp0VarB.u(32);
        qp0VarB.A(16);
        qp0VarB.x(16);
        wy2 wy2Var = wy2.e;
        qp0VarB.e = wy2Var;
        vy2 vy2Var = vy2.e;
        qp0VarB.f = vy2Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", qp0VarB.p());
        map.put("AES256_CTR_HMAC_SHA256", y03.f);
        qp0 qp0VarB2 = yy2.b();
        qp0VarB2.r(32);
        qp0VarB2.u(32);
        qp0VarB2.A(32);
        qp0VarB2.x(16);
        qp0VarB2.e = wy2Var;
        qp0VarB2.f = vy2Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", qp0VarB2.p());
        oe3Var.b(Collections.unmodifiableMap(map));
        le3 le3Var = le3.b;
        le3Var.a(ry2.c, yy2.class);
        ie3 ie3Var = ie3.b;
        ie3Var.b(ry2.d, yy2.class);
        vc3 vc3Var = vc3.d;
        vc3Var.b(ry2.b, i, true);
        int i2 = mz2.e;
        if (!ck1.g(i2)) {
            tv2.f("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        te3Var.h(j33.a);
        te3Var.g(j33.b);
        te3Var.f(j33.c);
        te3Var.e(j33.d);
        ue3Var.b(mz2.a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", y03.a);
        ep1 ep1VarB = oz2.b();
        ep1VarB.G();
        ep1VarB.J(16);
        ep1VarB.L();
        nz2 nz2Var = nz2.e;
        ep1VarB.e = nz2Var;
        map2.put("AES128_GCM_RAW", ep1VarB.D());
        map2.put("AES256_GCM", y03.b);
        ep1 ep1VarB2 = oz2.b();
        ep1VarB2.G();
        ep1VarB2.J(32);
        ep1VarB2.L();
        ep1VarB2.e = nz2Var;
        map2.put("AES256_GCM_RAW", ep1VarB2.D());
        oe3Var.b(Collections.unmodifiableMap(map2));
        le3Var.a(mz2.c, oz2.class);
        ie3Var.b(mz2.d, oz2.class);
        vc3Var.b(mz2.b, i2, true);
        if (f73.a()) {
            return;
        }
        nf3 nf3Var = cz2.a;
        if (!ck1.i(1)) {
            tv2.f("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        te3Var.h(t23.a);
        te3Var.g(t23.b);
        te3Var.f(t23.c);
        te3Var.e(t23.d);
        ue3Var.b(cz2.a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", y03.c);
        ud2 ud2VarB = fz2.b();
        ud2VarB.o(16);
        ud2VarB.w(16);
        ud2VarB.A();
        dz2 dz2Var = dz2.e;
        ud2VarB.d = dz2Var;
        map3.put("AES128_EAX_RAW", ud2VarB.n());
        map3.put("AES256_EAX", y03.d);
        ud2 ud2VarB2 = fz2.b();
        ud2VarB2.o(16);
        ud2VarB2.w(32);
        ud2VarB2.A();
        ud2VarB2.d = dz2Var;
        map3.put("AES256_EAX_RAW", ud2VarB2.n());
        oe3Var.b(Collections.unmodifiableMap(map3));
        ie3Var.b(cz2.c, fz2.class);
        vc3Var.c(cz2.b, true);
        nf3 nf3Var2 = qz2.a;
        if (!ck1.i(1)) {
            tv2.f("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        te3Var.h(c43.a);
        te3Var.g(c43.b);
        te3Var.f(c43.c);
        te3Var.e(c43.d);
        HashMap map4 = new HashMap();
        nl1 nl1VarB = sz2.b();
        nl1VarB.o(16);
        rz2 rz2Var = rz2.c;
        nl1VarB.a = rz2Var;
        map4.put("AES128_GCM_SIV", nl1VarB.n());
        nl1 nl1VarB2 = sz2.b();
        nl1VarB2.o(16);
        rz2 rz2Var2 = rz2.e;
        nl1VarB2.a = rz2Var2;
        map4.put("AES128_GCM_SIV_RAW", nl1VarB2.n());
        nl1 nl1VarB3 = sz2.b();
        nl1VarB3.o(32);
        nl1VarB3.a = rz2Var;
        map4.put("AES256_GCM_SIV", nl1VarB3.n());
        nl1 nl1VarB4 = sz2.b();
        nl1VarB4.o(32);
        nl1VarB4.a = rz2Var2;
        map4.put("AES256_GCM_SIV_RAW", nl1VarB4.n());
        oe3Var.b(Collections.unmodifiableMap(map4));
        le3Var.a(qz2.c, sz2.class);
        ie3Var.b(qz2.b, sz2.class);
        ue3Var.b(qz2.a);
        vc3Var.c(qz2.d, true);
        nf3 nf3Var3 = vz2.a;
        if (!ck1.i(1)) {
            tv2.f("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        te3Var.h(t43.a);
        te3Var.g(t43.b);
        te3Var.f(t43.c);
        te3Var.e(t43.d);
        ue3Var.b(vz2.a);
        ie3Var.b(vz2.b, wz2.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new wz2(qv2.f));
        map5.put("CHACHA20_POLY1305_RAW", new wz2(qv2.v));
        oe3Var.b(Collections.unmodifiableMap(map5));
        vc3Var.c(vz2.c, true);
        nf3 nf3Var4 = yz2.a;
        if (!ck1.i(1)) {
            tv2.f("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        te3Var.h(i03.a);
        te3Var.g(i03.b);
        te3Var.f(i03.c);
        te3Var.e(i03.d);
        ue3Var.b(yz2.a);
        ie3Var.b(yz2.c, c03.class);
        vc3Var.c(yz2.b, true);
        id3 id3Var = zz2.a;
        if (!ck1.i(1)) {
            tv2.f("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        te3Var.h(t03.a);
        te3Var.g(t03.b);
        te3Var.f(t03.c);
        te3Var.e(t03.d);
        ie3Var.b(zz2.b, p03.class);
        ue3Var.b(zz2.c);
        vc3Var.c(zz2.a, true);
        nf3 nf3Var5 = u13.a;
        if (!ck1.i(1)) {
            tv2.f("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        te3Var.h(q63.a);
        te3Var.g(q63.b);
        te3Var.f(q63.c);
        te3Var.e(q63.d);
        ue3Var.b(u13.a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new f23(rz2.f));
        map6.put("XCHACHA20_POLY1305_RAW", new f23(rz2.h));
        oe3Var.b(Collections.unmodifiableMap(map6));
        ie3Var.b(u13.d, f23.class);
        le3Var.a(u13.c, f23.class);
        vc3Var.c(u13.b, true);
        te3Var.h(h63.a);
        te3Var.g(h63.b);
        te3Var.f(h63.c);
        te3Var.e(h63.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", y03.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", y03.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", y03.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", y03.j);
        oe3Var.b(Collections.unmodifiableMap(map7));
        ue3Var.b(nj2.f);
        ie3Var.b(nj2.e, s13.class);
    }
}
