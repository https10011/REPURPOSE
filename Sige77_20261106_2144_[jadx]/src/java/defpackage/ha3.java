package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ha3 {
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
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        tr3 tr3VarC2 = kg3.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        a = new gf3(n83.class, new vi(22));
        b = new cf3(tr3VarC, new ba0(22));
        c = new hd3(w83.class, new xn(22));
        d = new ad3(tr3VarC2, new br0(22));
        e = new hd3(p83.class, new op0(22));
        f = new ad3(tr3VarC, new c11(22));
        hd2 hd2VarD = rc2.D();
        hd2VarD.l(ip3.RAW, k83.d);
        hd2VarD.l(ip3.TINK, k83.b);
        ip3 ip3Var = ip3.LEGACY;
        k83 k83Var = k83.c;
        hd2VarD.l(ip3Var, k83Var);
        hd2VarD.l(ip3.CRUNCHY, k83Var);
        g = hd2VarD.k();
        hd2 hd2VarD2 = rc2.D();
        hd2VarD2.l(bm3.SHA1, i83.b);
        hd2VarD2.l(bm3.SHA224, i83.c);
        hd2VarD2.l(bm3.SHA256, i83.d);
        hd2VarD2.l(bm3.SHA384, i83.e);
        hd2VarD2.l(bm3.SHA512, i83.f);
        h = hd2VarD2.k();
        hd2 hd2VarD3 = rc2.D();
        hd2VarD3.l(tl3.NIST_P256, j83.b);
        hd2VarD3.l(tl3.NIST_P384, j83.c);
        hd2VarD3.l(tl3.NIST_P521, j83.d);
        hd2VarD3.l(tl3.CURVE25519, j83.e);
        i = hd2VarD3.k();
        hd2 hd2VarD4 = rc2.D();
        hd2VarD4.l(xk3.UNCOMPRESSED, l83.c);
        hd2VarD4.l(xk3.COMPRESSED, l83.b);
        hd2VarD4.l(xk3.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, l83.d);
        j = hd2VarD4.k();
    }

    public static int a(j83 j83Var) throws GeneralSecurityException {
        if (j83.b == j83Var) {
            return 33;
        }
        if (j83.c == j83Var) {
            return 49;
        }
        if (j83.d == j83Var) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(j83Var)));
    }

    public static n83 b(ip3 ip3Var, el3 el3Var) {
        vn3 vn3VarT = xn3.t();
        vn3VarT.i(el3Var.x().w().B());
        vn3VarT.h(ip3.RAW);
        vn3VarT.j(el3Var.x().w().A());
        xn3 xn3Var = (xn3) vn3VarT.d();
        qp0 qp0VarB = n83.b();
        qp0VarB.e = (k83) g.F(ip3Var);
        qp0VarB.a = (j83) i.F(el3Var.A().y());
        qp0VarB.b = (i83) h.F(el3Var.A().z());
        qp0VarB.t(sp0.J(xn3Var.c()));
        tr3 tr3VarA = tr3.a(el3Var.A().A().o());
        if (tr3VarA.a.length == 0) {
            qp0VarB.f = null;
        } else {
            qp0VarB.f = tr3VarA;
        }
        if (!el3Var.A().y().equals(tl3.CURVE25519)) {
            qp0VarB.c = (l83) j.F(el3Var.t());
        } else if (!el3Var.t().equals(xk3.COMPRESSED)) {
            tv2.f("For CURVE25519 EcPointFormat must be compressed");
            return null;
        }
        return qp0VarB.q();
    }

    public static kl3 c(w83 w83Var) {
        n83 n83Var = w83Var.f;
        if (n83Var.a.equals(j83.e)) {
            jl3 jl3VarA = kl3.A();
            jl3VarA.f();
            ((kl3) jl3VarA.b).zzf = 0;
            el3 el3VarD = d(n83Var);
            jl3VarA.f();
            kl3.x((kl3) jl3VarA.b, el3VarD);
            byte[] bArrB = w83Var.h.b();
            nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
            jl3VarA.f();
            kl3.w((kl3) jl3VarA.b, nr2VarE);
            nr2 nr2Var = jr2.b;
            jl3VarA.f();
            kl3.z((kl3) jl3VarA.b, nr2Var);
            return (kl3) jl3VarA.d();
        }
        int iA = a(n83Var.a);
        ECPoint eCPoint = w83Var.g;
        if (eCPoint == null) {
            tv2.f("NistCurvePoint was null for NIST curve");
            return null;
        }
        jl3 jl3VarA2 = kl3.A();
        jl3VarA2.f();
        ((kl3) jl3VarA2.b).zzf = 0;
        el3 el3VarD2 = d(n83Var);
        jl3VarA2.f();
        kl3.x((kl3) jl3VarA2.b, el3VarD2);
        byte[] bArrF = xi0.F(iA, eCPoint.getAffineX());
        nr2 nr2VarE2 = jr2.e(bArrF, 0, bArrF.length);
        jl3VarA2.f();
        kl3.w((kl3) jl3VarA2.b, nr2VarE2);
        byte[] bArrF2 = xi0.F(iA, eCPoint.getAffineY());
        nr2 nr2VarE3 = jr2.e(bArrF2, 0, bArrF2.length);
        jl3VarA2.f();
        kl3.z((kl3) jl3VarA2.b, nr2VarE3);
        return (kl3) jl3VarA2.d();
    }

    public static el3 d(n83 n83Var) {
        ol3 ol3VarT = ql3.t();
        tl3 tl3Var = (tl3) i.E(n83Var.a);
        ol3VarT.f();
        ((ql3) ol3VarT.b).zze = tl3Var.zza();
        bm3 bm3Var = (bm3) h.E(n83Var.b);
        ol3VarT.f();
        ((ql3) ol3VarT.b).zzf = bm3Var.zza();
        tr3 tr3Var = n83Var.f;
        if (tr3Var != null && tr3Var.a.length > 0) {
            byte[] bArrB = tr3Var.b();
            nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
            ol3VarT.f();
            ql3.u((ql3) ol3VarT.b, nr2VarE);
        }
        ql3 ql3Var = (ql3) ol3VarT.d();
        try {
            xn3 xn3VarU = xn3.u(sp0.N(n83Var.e), wr2.b);
            vk3 vk3VarT = wk3.t();
            vn3 vn3VarT = xn3.t();
            vn3VarT.i(xn3VarU.B());
            vn3VarT.h(ip3.TINK);
            vn3VarT.j(xn3VarU.A());
            xn3 xn3Var = (xn3) vn3VarT.d();
            vk3VarT.f();
            wk3.u((wk3) vk3VarT.b, xn3Var);
            wk3 wk3Var = (wk3) vk3VarT.d();
            l83 l83Var = n83Var.c;
            if (l83Var == null) {
                l83Var = l83.b;
            }
            cl3 cl3VarY = el3.y();
            cl3VarY.f();
            el3.w((el3) cl3VarY.b, ql3Var);
            cl3VarY.f();
            el3.u((el3) cl3VarY.b, wk3Var);
            xk3 xk3Var = (xk3) j.E(l83Var);
            cl3VarY.f();
            ((el3) cl3VarY.b).zzh = xk3Var.zza();
            return (el3) cl3VarY.d();
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }
}
