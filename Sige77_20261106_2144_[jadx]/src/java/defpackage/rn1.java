package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rn1 extends r93 {
    public final long[] k;

    public rn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            e.g("x value invalid for SecT193FieldElement");
            throw null;
        }
        long[] jArrT = r93.t(bigInteger);
        long j = jArrT[3];
        long j2 = j >>> 1;
        jArrT[0] = (j2 ^ (j2 << 15)) ^ jArrT[0];
        jArrT[1] = jArrT[1] ^ (j >>> 50);
        jArrT[3] = j & 1;
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
        long[] jArr5 = new long[8];
        ye1.p(jArr2, jArr5);
        ye1.v(jArr5, jArr3);
        ye1.B(1, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(1, jArr4, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(3, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(6, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(12, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(24, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(48, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr3);
        ye1.B(96, jArr3, jArr4);
        ye1.s(jArr3, jArr4, jArr);
        return new rn1(jArr);
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
        ye1.s(this.k, ((rn1) r93Var).k, jArr);
        return new rn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((rn1) r93Var).k;
        long[] jArr2 = ((rn1) r93Var2).k;
        long[] jArr3 = ((rn1) r93Var3).k;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        ye1.n(this.k, jArr, jArr5);
        ye1.e(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        ye1.n(jArr2, jArr3, jArr6);
        ye1.e(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        ye1.v(jArr4, jArr7);
        return new rn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = this.k;
        long jU = bj0.u(jArr[0]);
        long jU2 = bj0.u(jArr[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long j2 = (jU >>> 32) | (jU2 & (-4294967296L));
        long jU3 = bj0.u(jArr[2]);
        long j3 = jU3 >>> 32;
        return new rn1(new long[]{j ^ (j2 << 8), ((((jU3 & 4294967295L) ^ (jArr[3] << 32)) ^ (j3 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ (j3 << 33), jU3 >>> 63});
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        ye1.p(this.k, jArr2);
        ye1.v(jArr2, jArr);
        return new rn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((rn1) r93Var).k;
        long[] jArr2 = ((rn1) r93Var2).k;
        long[] jArr3 = new long[8];
        long[] jArr4 = new long[8];
        ye1.p(this.k, jArr4);
        ye1.e(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[8];
        ye1.n(jArr, jArr2, jArr5);
        ye1.e(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[4];
        ye1.v(jArr3, jArr6);
        return new rn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((rn1) r93Var).k;
        long[] jArr2 = this.k;
        return new rn1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr[3] ^ jArr2[3]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rn1) {
            return r93.r(this.k, ((rn1) obj).k);
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
        return new rn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return r93.i0(this.k);
    }

    public final int hashCode() {
        return z32.s(this.k, 4) ^ 1930015;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 193;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public rn1(long[] jArr) {
        this.k = jArr;
    }
}
