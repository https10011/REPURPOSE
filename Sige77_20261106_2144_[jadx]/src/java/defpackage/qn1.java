package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qn1 extends r93 {
    public final long[] k;

    public qn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            e.g("x value invalid for SecT163FieldElement");
            throw null;
        }
        long[] jArrU = yv2.u(bigInteger);
        long j = jArrU[2];
        long j2 = j >>> 35;
        jArrU[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArrU[0];
        jArrU[2] = j & 34359738367L;
        this.k = jArrU;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[3];
        long[] jArr2 = this.k;
        if (yv2.E(jArr2)) {
            uq1.n();
            return null;
        }
        long[] jArr3 = new long[3];
        long[] jArr4 = new long[3];
        long[] jArr5 = new long[6];
        z32.v(jArr2, jArr5);
        z32.B(jArr5, jArr3);
        z32.D(1, jArr3, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(1, jArr4, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(3, jArr3, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(3, jArr4, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(9, jArr3, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(9, jArr4, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(27, jArr3, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(27, jArr4, jArr4);
        z32.y(jArr3, jArr4, jArr3);
        z32.D(81, jArr3, jArr4);
        z32.y(jArr3, jArr4, jArr);
        return new qn1(jArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        long[] jArr = this.k;
        if (jArr[0] == 1) {
            for (int i = 1; i < 3; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean I() {
        return yv2.E(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[3];
        z32.y(this.k, ((qn1) r93Var).k, jArr);
        return new qn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((qn1) r93Var).k;
        long[] jArr2 = ((qn1) r93Var2).k;
        long[] jArr3 = ((qn1) r93Var3).k;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        z32.t(this.k, jArr, jArr5);
        z32.c(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        z32.t(jArr2, jArr3, jArr6);
        z32.c(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        z32.B(jArr4, jArr7);
        return new qn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[3];
        long[] jArr2 = this.k;
        long jU = bj0.u(jArr2[0]);
        long jU2 = bj0.u(jArr2[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long jU3 = bj0.u(jArr2[2]);
        z32.y(new long[]{(jU >>> 32) | (jU2 & (-4294967296L)), jU3 >>> 32, 0}, z32.f, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jU3 & 4294967295L);
        return new qn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        z32.v(this.k, jArr2);
        z32.B(jArr2, jArr);
        return new qn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((qn1) r93Var).k;
        long[] jArr2 = ((qn1) r93Var2).k;
        long[] jArr3 = new long[6];
        long[] jArr4 = new long[6];
        z32.v(this.k, jArr4);
        z32.c(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        z32.t(jArr, jArr2, jArr5);
        z32.c(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        z32.B(jArr3, jArr6);
        return new qn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((qn1) r93Var).k;
        long[] jArr2 = this.k;
        return new qn1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn1)) {
            return false;
        }
        long[] jArr = ((qn1) obj).k;
        for (int i = 2; i >= 0; i--) {
            if (this.k[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return (this.k[0] & 1) != 0;
    }

    @Override // defpackage.r93
    public final r93 g() {
        long[] jArr = this.k;
        return new qn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return yv2.V(this.k);
    }

    public final int hashCode() {
        return z32.s(this.k, 3) ^ 163763;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 163;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public qn1(long[] jArr) {
        this.k = jArr;
    }
}
