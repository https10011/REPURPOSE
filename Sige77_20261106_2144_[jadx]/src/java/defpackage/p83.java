package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p83 extends t93 {
    public final w83 f;
    public final m83 g;
    public final ox1 h;

    public p83(w83 w83Var, m83 m83Var, ox1 ox1Var) {
        this.f = w83Var;
        this.g = m83Var;
        this.h = ox1Var;
    }

    public static ECParameterSpec I(j83 j83Var) {
        if (j83Var == j83.b) {
            return jc3.a;
        }
        if (j83Var == j83.c) {
            return jc3.b;
        }
        if (j83Var == j83.d) {
            return jc3.c;
        }
        e.g("Unable to determine NIST curve type for ".concat(String.valueOf(j83Var)));
        return null;
    }

    public static p83 J(w83 w83Var, ox1 ox1Var) throws GeneralSecurityException {
        tr3 tr3Var = w83Var.h;
        if (tr3Var == null) {
            tv2.f("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
            return null;
        }
        byte[] bArrB = ((tr3) ox1Var.a).b();
        byte[] bArrB2 = tr3Var.b();
        if (bArrB.length != 32) {
            tv2.f("Private key bytes length for X25519 curve must be 32");
            return null;
        }
        if (Arrays.equals(kv.p0(bArrB), bArrB2)) {
            return new p83(w83Var, null, ox1Var);
        }
        tv2.f("Invalid private key for public key.");
        return null;
    }

    public static p83 K(w83 w83Var, m83 m83Var) throws GeneralSecurityException {
        ECPoint eCPoint = w83Var.g;
        if (eCPoint == null) {
            tv2.f("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            return null;
        }
        BigInteger bigInteger = (BigInteger) m83Var.a;
        j83 j83Var = w83Var.f.a;
        BigInteger order = I(j83Var).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            tv2.f("Invalid private value");
            return null;
        }
        if (jc3.c(bigInteger, I(j83Var)).equals(eCPoint)) {
            return new p83(w83Var, m83Var, null);
        }
        tv2.f("Invalid private value");
        return null;
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
