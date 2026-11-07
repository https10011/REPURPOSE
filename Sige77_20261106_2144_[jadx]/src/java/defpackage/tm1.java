package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tm1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));
    public final cv h;

    public tm1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = f(new BigInteger(1, cm0.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, cm0.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new tm1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        um1 um1Var = new um1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(um1.l) >= 0) {
            e.g("x value invalid for SecP160R1FieldElement");
            return null;
        }
        int[] iArrS = gu2.s(bigInteger);
        if (iArrS[4] == -1) {
            int[] iArr = rq0.d;
            if (gu2.w(iArrS, iArr)) {
                gu2.K(iArr, iArrS);
            }
        }
        um1Var.k = iArrS;
        return um1Var;
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
