package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w83 extends x93 {
    public final n83 f;
    public final ECPoint g;
    public final tr3 h;
    public final tr3 i;
    public final Integer j;

    public w83(n83 n83Var, ECPoint eCPoint, tr3 tr3Var, tr3 tr3Var2, Integer num) {
        this.f = n83Var;
        this.g = eCPoint;
        this.h = tr3Var;
        this.i = tr3Var2;
        this.j = num;
    }

    public static w83 I(n83 n83Var, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        j83 j83Var = n83Var.a;
        k83 k83Var = n83Var.d;
        if (j83Var.equals(j83.e)) {
            tv2.f("createForNistCurve may only be called with parameters for NIST curve");
            return null;
        }
        L(k83Var, num);
        if (j83Var == j83.b) {
            curve = jc3.a.getCurve();
        } else if (j83Var == j83.c) {
            curve = jc3.b.getCurve();
        } else {
            if (j83Var != j83.d) {
                e.g("Unable to determine NIST curve type for ".concat(String.valueOf(j83Var)));
                return null;
            }
            curve = jc3.c.getCurve();
        }
        jc3.g(eCPoint, curve);
        return new w83(n83Var, eCPoint, null, K(k83Var, num), num);
    }

    public static w83 J(n83 n83Var, tr3 tr3Var, Integer num) throws GeneralSecurityException {
        j83 j83Var = n83Var.a;
        k83 k83Var = n83Var.d;
        if (!j83Var.equals(j83.e)) {
            tv2.f("createForCurveX25519 may only be called with parameters for curve X25519");
            return null;
        }
        L(k83Var, num);
        if (tr3Var.a.length == 32) {
            return new w83(n83Var, null, tr3Var, K(k83Var, num), num);
        }
        tv2.f("Encoded public point byte length for X25519 curve must be 32");
        return null;
    }

    public static tr3 K(k83 k83Var, Integer num) {
        if (k83Var == k83.d) {
            return we3.a;
        }
        if (num == null) {
            uq1.q("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(k83Var)));
            return null;
        }
        if (k83Var == k83.c) {
            return we3.a(num.intValue());
        }
        if (k83Var == k83.b) {
            return we3.b(num.intValue());
        }
        uq1.q("Unknown EciesParameters.Variant: ".concat(String.valueOf(k83Var)));
        return null;
    }

    public static void L(k83 k83Var, Integer num) throws GeneralSecurityException {
        k83 k83Var2 = k83.d;
        if (!k83Var.equals(k83Var2) && num == null) {
            throw new GeneralSecurityException(ts.k("'idRequirement' must be non-null for ", String.valueOf(k83Var), " variant."));
        }
        if (k83Var == k83Var2 && num != null) {
            tv2.f("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.zi0
    public final /* synthetic */ dx2 E() {
        return this.f;
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return this.j;
    }

    @Override // defpackage.x93
    public final tr3 H() {
        return this.i;
    }
}
