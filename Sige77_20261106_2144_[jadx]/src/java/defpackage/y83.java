package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class y83 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;
    public static final hd3 e;
    public static final ad3 f;
    public static final rc2 g;
    public static final rc2 h;
    public static final rc2 i;
    public static final rc2 j;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        tr3 tr3VarC2 = kg3.c("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        a = new gf3(v83.class, new qh1(21));
        b = new cf3(tr3VarC, new mo1(21));
        c = new hd3(d93.class, new sh1(21));
        d = new ad3(tr3VarC2, new k42(21));
        e = new hd3(x83.class, new gp1(21));
        f = new ad3(tr3VarC, new j10(21));
        hd2 hd2VarD = rc2.D();
        hd2VarD.l(ip3.RAW, s83.d);
        hd2VarD.l(ip3.TINK, s83.b);
        ip3 ip3Var = ip3.LEGACY;
        s83 s83Var = s83.c;
        hd2VarD.l(ip3Var, s83Var);
        hd2VarD.l(ip3.CRUNCHY, s83Var);
        g = hd2VarD.k();
        hd2 hd2VarD2 = rc2.D();
        hd2VarD2.l(qm3.DHKEM_P256_HKDF_SHA256, t83.d);
        hd2VarD2.l(qm3.DHKEM_P384_HKDF_SHA384, t83.e);
        hd2VarD2.l(qm3.DHKEM_P521_HKDF_SHA512, t83.f);
        hd2VarD2.l(qm3.DHKEM_X25519_HKDF_SHA256, t83.g);
        h = hd2VarD2.k();
        hd2 hd2VarD3 = rc2.D();
        hd2VarD3.l(rm3.HKDF_SHA256, r83.d);
        hd2VarD3.l(rm3.HKDF_SHA384, r83.e);
        hd2VarD3.l(rm3.HKDF_SHA512, r83.f);
        i = hd2VarD3.k();
        hd2 hd2VarD4 = rc2.D();
        hd2VarD4.l(nm3.AES_128_GCM, q83.d);
        hd2VarD4.l(nm3.AES_256_GCM, q83.e);
        hd2VarD4.l(nm3.CHACHA20_POLY1305, q83.f);
        j = hd2VarD4.k();
    }

    public static v83 a(ip3 ip3Var, bn3 bn3Var) {
        ep1 ep1VarB = v83.b();
        ep1VarB.e = (s83) g.F(ip3Var);
        ep1VarB.b = (t83) h.F(bn3Var.y());
        ep1VarB.c = (r83) i.F(bn3Var.x());
        ep1VarB.d = (q83) j.F(bn3Var.t());
        return ep1VarB.E();
    }

    public static ln3 b(d93 d93Var) {
        jn3 jn3VarZ = ln3.z();
        jn3VarZ.f();
        ((ln3) jn3VarZ.b).zzf = 0;
        bn3 bn3VarD = d(d93Var.f);
        jn3VarZ.f();
        ln3.x((ln3) jn3VarZ.b, bn3VarD);
        byte[] bArrB = d93Var.g.b();
        nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
        jn3VarZ.f();
        ln3.w((ln3) jn3VarZ.b, nr2VarE);
        return (ln3) jn3VarZ.d();
    }

    public static tr3 c(t83 t83Var, byte[] bArr) throws GeneralSecurityException {
        int i2;
        BigInteger bigIntegerE = xi0.E(bArr);
        byte[] bArr2 = lb3.a;
        if (t83Var == t83.g) {
            i2 = 32;
        } else if (t83Var == t83.d) {
            i2 = 65;
        } else if (t83Var == t83.e) {
            i2 = 97;
        } else {
            if (t83Var != t83.f) {
                tv2.f("Unrecognized HPKE KEM identifier");
                return null;
            }
            i2 = 133;
        }
        return tr3.a(xi0.F(i2, bigIntegerE));
    }

    public static bn3 d(v83 v83Var) {
        an3 an3VarZ = bn3.z();
        qm3 qm3Var = (qm3) h.E(v83Var.a);
        an3VarZ.f();
        ((bn3) an3VarZ.b).zze = qm3Var.zza();
        rm3 rm3Var = (rm3) i.E(v83Var.b);
        an3VarZ.f();
        ((bn3) an3VarZ.b).zzf = rm3Var.zza();
        nm3 nm3Var = (nm3) j.E(v83Var.c);
        an3VarZ.f();
        ((bn3) an3VarZ.b).zzg = nm3Var.zza();
        return (bn3) an3VarZ.d();
    }
}
