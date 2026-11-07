package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d93 extends x93 {
    public final v83 f;
    public final tr3 g;
    public final tr3 h;
    public final Integer i;

    public d93(v83 v83Var, tr3 tr3Var, tr3 tr3Var2, Integer num) {
        this.f = v83Var;
        this.g = tr3Var;
        this.h = tr3Var2;
        this.i = num;
    }

    public static d93 I(v83 v83Var, tr3 tr3Var, Integer num) {
        EllipticCurve curve;
        tr3 tr3VarB;
        s83 s83Var = v83Var.d;
        s83 s83Var2 = s83.d;
        if (!s83Var.equals(s83Var2) && num == null) {
            throw new GeneralSecurityException(ts.k("'idRequirement' must be non-null for ", String.valueOf(s83Var), " variant."));
        }
        if (s83Var == s83Var2 && num != null) {
            tv2.f("'idRequirement' must be null for NO_PREFIX variant.");
            return null;
        }
        t83 t83Var = v83Var.a;
        int length = tr3Var.a.length;
        String str = "Encoded public key byte length for " + String.valueOf(t83Var) + " must be %d, not " + length;
        t83 t83Var2 = t83.f;
        t83 t83Var3 = t83.e;
        t83 t83Var4 = t83.d;
        if (t83Var == t83Var4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (t83Var == t83Var3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (t83Var == t83Var2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (t83Var != t83.g) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(t83Var)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (t83Var == t83Var4 || t83Var == t83Var3 || t83Var == t83Var2) {
            if (t83Var == t83Var4) {
                curve = jc3.a.getCurve();
            } else if (t83Var == t83Var3) {
                curve = jc3.b.getCurve();
            } else {
                if (t83Var != t83Var2) {
                    e.g("Unable to determine NIST curve type for ".concat(String.valueOf(t83Var)));
                    return null;
                }
                curve = jc3.c.getCurve();
            }
            jc3.g(am2.c0(curve, zq3.a, tr3Var.b()), curve);
        }
        if (s83Var == s83Var2) {
            tr3VarB = we3.a;
        } else {
            if (num == null) {
                uq1.q("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(s83Var)));
                return null;
            }
            if (s83Var == s83.c) {
                tr3VarB = we3.a(num.intValue());
            } else {
                if (s83Var != s83.b) {
                    uq1.q("Unknown HpkeParameters.Variant: ".concat(String.valueOf(s83Var)));
                    return null;
                }
                tr3VarB = we3.b(num.intValue());
            }
        }
        return new d93(v83Var, tr3Var, tr3VarB, num);
    }

    @Override // defpackage.zi0
    public final /* synthetic */ dx2 E() {
        return this.f;
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return this.i;
    }

    @Override // defpackage.x93
    public final tr3 H() {
        return this.h;
    }
}
