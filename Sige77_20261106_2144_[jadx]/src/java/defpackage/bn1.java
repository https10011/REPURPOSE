package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bn1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public final cv h;

    public bn1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(l40.a);
        this.c = f(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, cm0.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new bn1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        cn1 cn1Var = new cn1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(cn1.l) >= 0) {
            e.g("x value invalid for SecP224K1FieldElement");
            return null;
        }
        int[] iArrP = g93.p(bigInteger);
        if (iArrP[6] == -1 && g93.s(iArrP, gb2.b)) {
            kv.d(7, 6803, iArrP);
        }
        cn1Var.k = iArrP;
        return cn1Var;
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
