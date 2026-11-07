package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class sy2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sy2(int i) {
        this.a = i;
    }

    public final zi0 a(dx2 dx2Var, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        wq3 wq3Var;
        tr3 tr3VarA;
        ox1 ox1Var;
        int i = 1;
        boolean z = false;
        switch (this.a) {
            case 0:
                yy2 yy2Var = (yy2) dx2Var;
                int i2 = yy2Var.a;
                if (i2 != 16 && i2 != 32) {
                    tv2.f("AES key size must be 16 or 32 bytes");
                    return null;
                }
                ep1 ep1Var = new ep1(12, z);
                ep1Var.c = null;
                ep1Var.d = null;
                ep1Var.b = yy2Var;
                ep1Var.e = num;
                ep1Var.c = ox1.s(i2);
                ep1Var.d = ox1.s(yy2Var.b);
                return ep1Var.C();
            case 1:
                fz2 fz2Var = (fz2) dx2Var;
                int i3 = fz2Var.a;
                if (i3 == 24) {
                    tv2.f("192 bit AES EAX Parameters are not valid");
                    return null;
                }
                p11 p11Var = new p11(27);
                p11Var.c = null;
                p11Var.b = fz2Var;
                p11Var.d = num;
                p11Var.c = ox1.s(i3);
                return p11Var.p();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                oz2 oz2Var = (oz2) dx2Var;
                int i4 = oz2Var.a;
                if (i4 == 24) {
                    tv2.f("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                p11 p11Var2 = new p11(28);
                p11Var2.c = null;
                p11Var2.b = oz2Var;
                p11Var2.d = num;
                p11Var2.c = ox1.s(i4);
                return p11Var2.q();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                sz2 sz2Var = (sz2) dx2Var;
                p11 p11Var3 = new p11(29);
                p11Var3.c = null;
                p11Var3.b = sz2Var;
                p11Var3.d = num;
                p11Var3.c = ox1.s(sz2Var.a);
                return p11Var3.r();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return tz2.I(((wz2) dx2Var).a, ox1.s(32), num);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return a03.I((c03) dx2Var, num);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return r03.I((p03) dx2Var, num);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return l13.I((s13) dx2Var, ox1.s(32), num);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return z13.I(((f23) dx2Var).a, ox1.s(32), num);
            case 9:
                r73 r73Var = (r73) dx2Var;
                int i5 = r73Var.a;
                if (i5 != 64) {
                    throw new InvalidAlgorithmParameterException(ts.g(i5, "invalid key size: ", ". Valid keys must have 64 bytes."));
                }
                u23 u23Var = new u23(i);
                u23Var.c = null;
                u23Var.b = r73Var;
                u23Var.d = num;
                u23Var.c = ox1.s(i5);
                return u23Var.e();
            case 10:
                n83 n83Var = (n83) dx2Var;
                j83 j83Var = n83Var.a;
                if (j83Var == j83.b) {
                    eCParameterSpec = jc3.a;
                } else if (j83Var == j83.c) {
                    eCParameterSpec = jc3.b;
                } else {
                    if (j83Var != j83.d) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(j83Var)));
                    }
                    eCParameterSpec = jc3.c;
                }
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) cr3.e.a.zza("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                return p83.K(w83.I(n83Var, ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW(), num), new m83(((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS()));
            case 11:
                v83 v83Var = (v83) dx2Var;
                t83 t83Var = v83Var.a;
                if (t83Var.equals(t83.g)) {
                    byte[] bArrA = xf3.a(32);
                    bArrA[0] = (byte) (bArrA[0] | 7);
                    byte b = (byte) (bArrA[31] & 63);
                    bArrA[31] = b;
                    bArrA[31] = (byte) (b | 128);
                    ox1Var = new ox1(tr3.a(bArrA));
                    tr3VarA = tr3.a(kv.p0(bArrA));
                } else {
                    t83 t83Var2 = t83.f;
                    t83 t83Var3 = t83.e;
                    t83 t83Var4 = t83.d;
                    if (t83Var != t83Var4 && t83Var != t83Var3 && t83Var != t83Var2) {
                        tv2.f("Unknown KEM ID");
                        return null;
                    }
                    byte[] bArr = lb3.a;
                    if (t83Var == t83Var4) {
                        wq3Var = wq3.a;
                    } else if (t83Var == t83Var3) {
                        wq3Var = wq3.b;
                    } else {
                        if (t83Var != t83Var2) {
                            tv2.f("Unrecognized NIST HPKE KEM identifier");
                            return null;
                        }
                        wq3Var = wq3.c;
                    }
                    ECParameterSpec eCParameterSpecB0 = am2.b0(wq3Var);
                    KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) cr3.e.a.zza("EC");
                    keyPairGenerator2.initialize(eCParameterSpecB0);
                    KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                    ECPoint w = ((ECPublicKey) keyPairGenerateKeyPair2.getPublic()).getW();
                    EllipticCurve curve = am2.b0(wq3Var).getCurve();
                    jc3.g(w, curve);
                    int iZ = am2.Z(curve);
                    int i6 = (iZ * 2) + 1;
                    byte[] bArr2 = new byte[i6];
                    byte[] bArrG = xi0.G(w.getAffineX());
                    byte[] bArrG2 = xi0.G(w.getAffineY());
                    System.arraycopy(bArrG2, 0, bArr2, i6 - bArrG2.length, bArrG2.length);
                    System.arraycopy(bArrG, 0, bArr2, (iZ + 1) - bArrG.length, bArrG.length);
                    bArr2[0] = 4;
                    tr3 tr3VarA2 = tr3.a(bArr2);
                    ox1 ox1Var2 = new ox1(tr3.a(xi0.F(lb3.a(t83Var), ((ECPrivateKey) keyPairGenerateKeyPair2.getPrivate()).getS())));
                    tr3VarA = tr3VarA2;
                    ox1Var = ox1Var2;
                }
                return x83.I(d93.I(v83Var, tr3VarA, num), ox1Var);
            case 12:
                xn3 xn3Var = (xn3) ((xd3) dx2Var).a.c;
                vc3 vc3Var = vc3.d;
                id3 id3VarA = vc3Var.a(xn3Var.B());
                if (!((Boolean) vc3Var.b.get(xn3Var.B())).booleanValue()) {
                    tv2.f("Creating new keys is not allowed.");
                    return null;
                }
                jr2 jr2VarA = xn3Var.A();
                id3VarA.getClass();
                vn3 vn3VarT = xn3.t();
                vn3VarT.i(id3VarA.a);
                vn3VarT.j(jr2VarA);
                vn3VarT.h(ip3.RAW);
                xn3 xn3Var2 = (xn3) vn3VarT.d();
                vf3 vf3Var = new vf3(0, xn3Var2, kg3.a(xn3Var2.B()));
                te3 te3Var = te3.b;
                wf3 wf3Var = (wf3) te3Var.c(ie3.b.a(te3Var.b(vf3Var), null));
                on3 on3VarT = qn3.t();
                String str = (String) wf3Var.c;
                on3VarT.f();
                qn3.v((qn3) on3VarT.b, str);
                jr2 jr2Var = (jr2) wf3Var.e;
                on3VarT.f();
                qn3.w((qn3) on3VarT.b, jr2Var);
                int i7 = wf3Var.b;
                on3VarT.f();
                qn3.u((qn3) on3VarT.b, i7);
                qn3 qn3Var = (qn3) on3VarT.d();
                return new qd3(wf3.d(qn3Var.A(), qn3Var.z(), qn3Var.x(), xn3Var.z(), num));
            case 13:
                pg3 pg3Var = (pg3) dx2Var;
                int i8 = pg3Var.a;
                if (i8 != 32) {
                    tv2.f("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                u23 u23Var2 = new u23(8);
                u23Var2.c = null;
                u23Var2.d = null;
                u23Var2.b = pg3Var;
                u23Var2.c = ox1.s(i8);
                u23Var2.d = num;
                return u23Var2.f();
            default:
                ah3 ah3Var = (ah3) dx2Var;
                u23 u23Var3 = new u23(10);
                u23Var3.c = null;
                u23Var3.d = null;
                u23Var3.b = ah3Var;
                u23Var3.c = ox1.s(ah3Var.a);
                u23Var3.d = num;
                return u23Var3.h();
        }
    }
}
