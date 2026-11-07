package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qm1 extends m40 {
    public static final BigInteger i = new BigInteger(1, cm0.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public final cv h;

    public qm1() {
        super(i);
        this.h = new cv(this, (r93) null, (r93) null, false);
        this.b = f(new BigInteger(1, cm0.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = f(new BigInteger(1, cm0.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, cm0.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.m40
    public final m40 a() {
        return new qm1();
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new cv(this, r93Var, r93Var2, z);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        rm1 rm1Var = new rm1();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(rm1.l) >= 0) {
            e.g("x value invalid for SecP128R1FieldElement");
            return null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[4];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            int[] iArr2 = sp0.b;
            if (am2.B(iArr, iArr2)) {
                long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
                iArr[0] = (int) j;
                long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
                iArr[1] = (int) j2;
                long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
                iArr[2] = (int) j3;
                iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32));
            }
        }
        rm1Var.k = iArr;
        return rm1Var;
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
