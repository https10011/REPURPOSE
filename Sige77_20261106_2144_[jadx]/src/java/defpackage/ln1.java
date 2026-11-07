package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ln1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final cv h;

    public ln1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(new BigInteger(1, cm0.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = f(new BigInteger(1, cm0.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, cm0.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new ln1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        mn1 mn1Var = new mn1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(mn1.l) >= 0) {
            e.g("x value invalid for SecP521R1FieldElement");
            return null;
        }
        int[] iArrR = kv.r(521, bigInteger);
        if (kv.p(17, iArrR, g93.d)) {
            for (int i2 = 0; i2 < 17; i2++) {
                iArrR[i2] = 0;
            }
        }
        mn1Var.k = iArrR;
        return mn1Var;
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
