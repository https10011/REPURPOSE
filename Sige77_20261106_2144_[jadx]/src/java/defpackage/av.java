package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class av extends m40 {
    public static final BigInteger i = r93.h0(qt.a);
    public final cv h;

    public av() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(new BigInteger(1, cm0.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = f(new BigInteger(1, cm0.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, cm0.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new av();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        bv bvVar = new bv();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(bv.l) >= 0) {
            e.g("x value invalid for Curve25519FieldElement");
            return null;
        }
        int[] iArrS = r93.s(bigInteger);
        while (true) {
            int[] iArr = qt.a;
            if (!r93.x(iArrS, iArr)) {
                bvVar.k = iArrS;
                return bvVar;
            }
            r93.d0(iArr, iArrS);
        }
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
        return i2 == 4;
    }
}
