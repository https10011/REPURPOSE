package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xm1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    public final cv h;

    public xm1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(l40.a);
        this.c = f(BigInteger.valueOf(3L));
        this.d = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new xm1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        ym1 ym1Var = new ym1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(ym1.l) >= 0) {
            e.g("x value invalid for SecP192K1FieldElement");
            return null;
        }
        int[] iArrT = yv2.t(bigInteger);
        if (iArrT[5] == -1) {
            int[] iArr = x91.b;
            if (yv2.B(iArrT, iArr)) {
                yv2.S(iArr, iArrT);
            }
        }
        ym1Var.k = iArrT;
        return ym1Var;
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
