package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x83 extends t93 {
    public final d93 f;
    public final ox1 g;

    public x83(d93 d93Var, ox1 ox1Var) {
        this.f = d93Var;
        this.g = ox1Var;
    }

    public static x83 I(d93 d93Var, ox1 ox1Var) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        v83 v83Var = d93Var.f;
        tr3 tr3Var = (tr3) ox1Var.a;
        t83 t83Var = v83Var.a;
        int length = tr3Var.a.length;
        String str = "Encoded private key byte length for " + String.valueOf(t83Var) + " must be %d, not " + length;
        t83 t83Var2 = t83.g;
        t83 t83Var3 = t83.f;
        t83 t83Var4 = t83.e;
        t83 t83Var5 = t83.d;
        if (t83Var == t83Var5) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (t83Var == t83Var4) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (t83Var == t83Var3) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (t83Var != t83Var2) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(t83Var)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] bArrB = d93Var.g.b();
        byte[] bArrB2 = tr3Var.b();
        if (t83Var == t83Var5 || t83Var == t83Var4 || t83Var == t83Var3) {
            if (t83Var == t83Var5) {
                eCParameterSpec = jc3.a;
            } else if (t83Var == t83Var4) {
                eCParameterSpec = jc3.b;
            } else {
                if (t83Var != t83Var3) {
                    e.g("Unable to determine NIST curve params for ".concat(String.valueOf(t83Var)));
                    return null;
                }
                eCParameterSpec = jc3.c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerE = xi0.E(bArrB2);
            if (bigIntegerE.signum() <= 0 || bigIntegerE.compareTo(order) >= 0) {
                tv2.f("Invalid private key.");
                return null;
            }
            if (!jc3.c(bigIntegerE, eCParameterSpec).equals(am2.c0(eCParameterSpec.getCurve(), zq3.a, bArrB))) {
                tv2.f("Invalid private key for public key.");
                return null;
            }
        } else {
            if (t83Var != t83Var2) {
                e.g("Unable to validate key pair for ".concat(String.valueOf(t83Var)));
                return null;
            }
            if (!Arrays.equals(kv.p0(bArrB2), bArrB)) {
                tv2.f("Invalid private key for public key.");
                return null;
            }
        }
        return new x83(d93Var, ox1Var);
    }

    @Override // defpackage.zi0
    public final /* synthetic */ dx2 E() {
        return this.f.f;
    }

    @Override // defpackage.t93
    public final /* synthetic */ zi0 H() {
        return this.f;
    }
}
