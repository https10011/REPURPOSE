package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sn1 extends r93 {
    public final long[] k;

    public sn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            e.g("x value invalid for SecT233FieldElement");
            throw null;
        }
        long[] jArrT = r93.t(bigInteger);
        long j = jArrT[3];
        long j2 = j >>> 41;
        jArrT[0] = jArrT[0] ^ j2;
        jArrT[1] = (j2 << 10) ^ jArrT[1];
        jArrT[3] = j & 2199023255551L;
        this.k = jArrT;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[4];
        long[] jArr2 = this.k;
        if (r93.K(jArr2)) {
            uq1.n();
            return null;
        }
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        gb2.E(jArr2, jArr3);
        gb2.w(jArr3, jArr2, jArr3);
        gb2.E(jArr3, jArr3);
        gb2.w(jArr3, jArr2, jArr3);
        gb2.G(3, jArr3, jArr4);
        gb2.w(jArr4, jArr3, jArr4);
        gb2.E(jArr4, jArr4);
        gb2.w(jArr4, jArr2, jArr4);
        gb2.G(7, jArr4, jArr3);
        gb2.w(jArr3, jArr4, jArr3);
        gb2.G(14, jArr3, jArr4);
        gb2.w(jArr4, jArr3, jArr4);
        gb2.E(jArr4, jArr4);
        gb2.w(jArr4, jArr2, jArr4);
        gb2.G(29, jArr4, jArr3);
        gb2.w(jArr3, jArr4, jArr3);
        gb2.G(58, jArr3, jArr4);
        gb2.w(jArr4, jArr3, jArr4);
        gb2.G(116, jArr4, jArr3);
        gb2.w(jArr3, jArr4, jArr3);
        gb2.E(jArr3, jArr);
        return new sn1(jArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return r93.H(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return r93.K(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[4];
        gb2.w(this.k, ((sn1) r93Var).k, jArr);
        return new sn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((sn1) r93Var).k;
        long[] jArr2 = ((sn1) r93Var2).k;
        long[] jArr3 = ((sn1) r93Var3).k;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        gb2.r(this.k, jArr, jArr5);
        gb2.d(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        gb2.r(jArr2, jArr3, jArr6);
        gb2.d(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        gb2.A(jArr4, jArr7);
        return new sn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[4];
        long[] jArr2 = this.k;
        long jU = bj0.u(jArr2[0]);
        long jU2 = bj0.u(jArr2[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long j2 = (jU >>> 32) | (jU2 & (-4294967296L));
        long jU3 = bj0.u(jArr2[2]);
        int i = 3;
        long jU4 = bj0.u(jArr2[3]);
        long j3 = (4294967295L & jU3) | (jU4 << 32);
        long j4 = (jU3 >>> 32) | (jU4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArr3[i4] = jArr3[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = i;
            int i8 = -i5;
            jArr3[i6] = jArr3[i6] ^ ((j6 << i5) | (j7 >>> i8));
            int i9 = i4 + 2;
            jArr3[i9] = jArr3[i9] ^ ((j5 << i5) | (j6 >>> i8));
            int i10 = i4 + 3;
            jArr3[i10] = jArr3[i10] ^ (j5 >>> i8);
            i2++;
            i = i7;
        }
        gb2.A(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new sn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[4];
        gb2.E(this.k, jArr);
        return new sn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((sn1) r93Var).k;
        long[] jArr2 = ((sn1) r93Var2).k;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        gb2.t(this.k, jArr4);
        gb2.d(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        gb2.r(jArr, jArr2, jArr5);
        gb2.d(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        gb2.A(jArr3, jArr6);
        return new sn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((sn1) r93Var).k;
        long[] jArr2 = this.k;
        return new sn1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sn1) {
            return r93.r(this.k, ((sn1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return (this.k[0] & 1) != 0;
    }

    @Override // defpackage.r93
    public final r93 g() {
        long[] jArr = this.k;
        return new sn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return r93.i0(this.k);
    }

    public final int hashCode() {
        return z32.s(this.k, 4) ^ 2330074;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 233;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public sn1(long[] jArr) {
        this.k = jArr;
    }
}
