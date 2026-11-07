package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dn1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public final cv h;

    public dn1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = f(new BigInteger(1, cm0.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, cm0.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new dn1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        en1 en1Var = new en1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(en1.l) >= 0) {
            e.g("x value invalid for SecP224R1FieldElement");
            return null;
        }
        int[] iArrP = g93.p(bigInteger);
        if (iArrP[6] == -1) {
            int[] iArr = nj2.b;
            if (g93.s(iArrP, iArr)) {
                long j = (((long) iArrP[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
                iArrP[0] = (int) j;
                long j2 = ((((long) iArrP[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
                iArrP[1] = (int) j2;
                long j3 = ((((long) iArrP[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
                iArrP[2] = (int) j3;
                long j4 = ((((long) iArrP[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
                iArrP[3] = (int) j4;
                long j5 = ((((long) iArrP[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
                iArrP[4] = (int) j5;
                long j6 = ((((long) iArrP[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
                iArrP[5] = (int) j6;
                iArrP[6] = (int) (((((long) iArrP[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32));
            }
        }
        en1Var.k = iArrP;
        return en1Var;
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
