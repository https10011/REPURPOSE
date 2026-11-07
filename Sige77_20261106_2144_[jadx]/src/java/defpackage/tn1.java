package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tn1 extends r93 {
    public long[] k;

    public tn1(long[] jArr) {
        this.k = jArr;
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
        nj2.U(jArr2, jArr3);
        nj2.M(jArr3, jArr2, jArr3);
        nj2.U(jArr3, jArr3);
        nj2.M(jArr3, jArr2, jArr3);
        nj2.V(3, jArr3, jArr4);
        nj2.M(jArr4, jArr3, jArr4);
        nj2.U(jArr4, jArr4);
        nj2.M(jArr4, jArr2, jArr4);
        nj2.V(7, jArr4, jArr3);
        nj2.M(jArr3, jArr4, jArr3);
        nj2.V(14, jArr3, jArr4);
        nj2.M(jArr4, jArr3, jArr4);
        nj2.U(jArr4, jArr4);
        nj2.M(jArr4, jArr2, jArr4);
        nj2.V(29, jArr4, jArr3);
        nj2.M(jArr3, jArr4, jArr3);
        nj2.U(jArr3, jArr3);
        nj2.M(jArr3, jArr2, jArr3);
        nj2.V(59, jArr3, jArr4);
        nj2.M(jArr4, jArr3, jArr4);
        nj2.U(jArr4, jArr4);
        nj2.M(jArr4, jArr2, jArr4);
        nj2.V(119, jArr4, jArr3);
        nj2.M(jArr3, jArr4, jArr3);
        nj2.U(jArr3, jArr);
        return new tn1(jArr);
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
        nj2.M(this.k, ((tn1) r93Var).k, jArr);
        return new tn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = this.k;
        long[] jArr2 = ((tn1) r93Var).k;
        long[] jArr3 = ((tn1) r93Var2).k;
        long[] jArr4 = ((tn1) r93Var3).k;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        nj2.E(jArr, jArr2, jArr6);
        nj2.i(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        nj2.E(jArr3, jArr4, jArr7);
        nj2.i(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        nj2.O(jArr5, jArr8);
        return new tn1(jArr8);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[4];
        long[] jArr2 = this.k;
        boolean z = false;
        long jU = bj0.u(jArr2[0]);
        boolean z2 = true;
        long jU2 = bj0.u(jArr2[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long j2 = (jU >>> 32) | (jU2 & (-4294967296L));
        long jU3 = bj0.u(jArr2[2]);
        long jU4 = bj0.u(jArr2[3]);
        long j3 = (jU3 & 4294967295L) | (jU4 << 32);
        long j4 = (jU3 >>> 32) | (jU4 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        while (i < 2) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            boolean z3 = z;
            int i4 = i2 & 63;
            jArr3[i3] = jArr3[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            boolean z4 = z2;
            int i6 = -i4;
            jArr3[i5] = jArr3[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            jArr3[i7] = jArr3[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArr3[i8] = jArr3[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            jArr3[i9] = jArr3[i9] ^ (j5 >>> i6);
            i++;
            z = z3;
            z2 = z4;
        }
        boolean z5 = z;
        boolean z6 = z2;
        nj2.O(jArr3, jArr);
        jArr[z5 ? 1 : 0] = jArr[z5 ? 1 : 0] ^ j;
        jArr[z6 ? 1 : 0] = jArr[z6 ? 1 : 0] ^ j3;
        return new tn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[4];
        nj2.U(this.k, jArr);
        return new tn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = this.k;
        long[] jArr2 = ((tn1) r93Var).k;
        long[] jArr3 = ((tn1) r93Var2).k;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        nj2.G(jArr, jArr5);
        nj2.i(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        nj2.E(jArr2, jArr3, jArr6);
        nj2.i(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        nj2.O(jArr4, jArr7);
        return new tn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = this.k;
        long[] jArr2 = ((tn1) r93Var).k;
        return new tn1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tn1) {
            return r93.r(this.k, ((tn1) obj).k);
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
        return new tn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return r93.i0(this.k);
    }

    public final int hashCode() {
        return z32.s(this.k, 4) ^ 23900158;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 239;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }
}
