package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fn1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
    public final cv h;

    public fn1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(l40.a);
        this.c = f(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new fn1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        gn1 gn1Var = new gn1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(gn1.l) >= 0) {
            e.g("x value invalid for SecP256K1FieldElement");
            return null;
        }
        int[] iArrS = r93.s(bigInteger);
        if (iArrS[7] == -1) {
            int[] iArr = am2.b;
            if (r93.x(iArrS, iArr)) {
                r93.d0(iArr, iArrS);
            }
        }
        gn1Var.k = iArrS;
        return gn1Var;
    }

    @Override // defpackage.m40
    public final int g() {
        return i.bitLength();
    }

    @Override // defpackage.m40
    public final t40 h() {
        return this.h;
    }

    @Override // defpackage.m40
    public final boolean j(int i2) {
        return i2 == 2;
    }
}
