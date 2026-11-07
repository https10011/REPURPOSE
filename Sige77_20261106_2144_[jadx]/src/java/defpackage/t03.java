package defpackage;

import com.appsflyer.internal.d;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class t03 {
    public static final gf3 a;
    public static final cf3 b;
    public static final hd3 c;
    public static final ad3 d;

    static {
        tr3 tr3VarC = kg3.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new gf3(p03.class, new br0(18));
        b = new cf3(tr3VarC, new sh1(18));
        c = new hd3(r03.class, new u41(18));
        d = new ad3(tr3VarC, new k42(18));
    }

    public static p03 a(ep3 ep3Var, ip3 ip3Var) throws GeneralSecurityException {
        wy2 wy2Var;
        dz2 dz2Var = dz2.i;
        wy2 wy2Var2 = wy2.Z;
        wy2 wy2Var3 = wy2.Y;
        wy2 wy2Var4 = wy2.X;
        wy2 wy2Var5 = wy2.w;
        wy2 wy2Var6 = wy2.W;
        wy2 wy2Var7 = wy2.v;
        vn3 vn3VarT = xn3.t();
        vn3VarT.i(ep3Var.t().B());
        vn3VarT.j(ep3Var.t().A());
        vn3VarT.h(ip3.RAW);
        dx2 dx2VarJ = sp0.J(((xn3) vn3VarT.d()).c());
        if (dx2VarJ instanceof oz2) {
            wy2Var = wy2Var7;
        } else if (dx2VarJ instanceof wz2) {
            wy2Var = wy2Var6;
        } else if (dx2VarJ instanceof f23) {
            wy2Var = wy2Var5;
        } else if (dx2VarJ instanceof yy2) {
            wy2Var = wy2Var4;
        } else if (dx2VarJ instanceof fz2) {
            wy2Var = wy2Var3;
        } else {
            if (!(dx2VarJ instanceof sz2)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(dx2VarJ)));
            }
            wy2Var = wy2Var2;
        }
        int i = x03.a[ip3Var.ordinal()];
        if (i == 1) {
            dz2Var = dz2.f;
        } else if (i != 2) {
            throw new GeneralSecurityException(ck1.r(ip3Var.zza(), "Unable to parse OutputPrefixType: "));
        }
        String strZ = ep3Var.z();
        my2 my2Var = (my2) dx2VarJ;
        if (strZ == null) {
            tv2.f("kekUri must be set");
            return null;
        }
        if (my2Var.a()) {
            tv2.f("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((wy2Var == wy2Var7 && (my2Var instanceof oz2)) || ((wy2Var == wy2Var6 && (my2Var instanceof wz2)) || ((wy2Var == wy2Var5 && (my2Var instanceof f23)) || ((wy2Var == wy2Var4 && (my2Var instanceof yy2)) || ((wy2Var == wy2Var3 && (my2Var instanceof fz2)) || (wy2Var == wy2Var2 && (my2Var instanceof sz2))))))) {
            return new p03(dz2Var, strZ, wy2Var, my2Var);
        }
        throw new GeneralSecurityException(d.a("Cannot use parsing strategy ", wy2Var.b, " when new keys are picked according to ", String.valueOf(my2Var), "."));
    }

    public static ep3 b(p03 p03Var) {
        try {
            xn3 xn3VarU = xn3.u(sp0.N(p03Var.d), wr2.b);
            dp3 dp3VarX = ep3.x();
            String str = p03Var.b;
            dp3VarX.f();
            ep3.v((ep3) dp3VarX.b, str);
            dp3VarX.f();
            ep3.w((ep3) dp3VarX.b, xn3VarU);
            return (ep3) dp3VarX.d();
        } catch (ks2 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
