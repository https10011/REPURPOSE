package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vn1 extends r93 {
    public final long[] k;

    public vn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            e.g("x value invalid for SecT409FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            sm0.a();
            throw null;
        }
        long[] jArr = new long[7];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[6];
        long j2 = j >>> 25;
        jArr[0] = jArr[0] ^ j2;
        jArr[1] = (j2 << 23) ^ jArr[1];
        jArr[6] = j & 33554431;
        this.k = jArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[7];
        for (int i = 0; i < 7; i++) {
            long[] jArr2 = this.k;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[7];
                long[] jArr4 = new long[7];
                long[] jArr5 = new long[7];
                long[] jArr6 = new long[13];
                am2.E(jArr2, jArr6);
                am2.O(jArr6, jArr3);
                am2.U(1, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(1, jArr4, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(3, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(6, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(12, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr5);
                am2.U(24, jArr5, jArr3);
                am2.U(24, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(48, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(96, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.U(192, jArr3, jArr4);
                am2.K(jArr3, jArr4, jArr3);
                am2.K(jArr3, jArr5, jArr);
                return new vn1(jArr);
            }
        }
        uq1.n();
        return null;
    }

    @Override // defpackage.r93
    public final boolean F() {
        long[] jArr = this.k;
        if (jArr[0] == 1) {
            for (int i = 1; i < 7; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean I() {
        for (int i = 0; i < 7; i++) {
            if (this.k[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[7];
        am2.K(this.k, ((vn1) r93Var).k, jArr);
        return new vn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((vn1) r93Var).k;
        long[] jArr2 = ((vn1) r93Var2).k;
        long[] jArr3 = ((vn1) r93Var3).k;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[14];
        am2.D(this.k, jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        long[] jArr6 = new long[14];
        am2.D(jArr2, jArr3, jArr6);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr4[i2] = jArr4[i2] ^ jArr6[i2];
        }
        long[] jArr7 = new long[7];
        am2.O(jArr4, jArr7);
        return new vn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = this.k;
        long jU = bj0.u(jArr[0]);
        long jU2 = bj0.u(jArr[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long j2 = (jU >>> 32) | (jU2 & (-4294967296L));
        long jU3 = bj0.u(jArr[2]);
        long jU4 = bj0.u(jArr[3]);
        long j3 = (jU3 & 4294967295L) | (jU4 << 32);
        long j4 = (jU3 >>> 32) | (jU4 & (-4294967296L));
        long jU5 = bj0.u(jArr[4]);
        long jU6 = bj0.u(jArr[5]);
        long j5 = (jU5 >>> 32) | (jU6 & (-4294967296L));
        long jU7 = bj0.u(jArr[6]);
        long j6 = jU7 >>> 32;
        return new vn1(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((jU5 & 4294967295L) | (jU6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((jU7 & 4294967295L) ^ (j6 << 44)) ^ (j5 >>> 20)) ^ (j2 << 13), ((jU7 >>> 52) ^ (j4 << 13)) ^ (j2 >>> 51), (j5 << 13) ^ (j4 >>> 51), (j6 << 13) ^ (j5 >>> 51)});
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        am2.E(this.k, jArr2);
        am2.O(jArr2, jArr);
        return new vn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((vn1) r93Var).k;
        long[] jArr2 = ((vn1) r93Var2).k;
        long[] jArr3 = new long[13];
        long[] jArr4 = new long[13];
        am2.E(this.k, jArr4);
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        long[] jArr5 = new long[14];
        am2.D(jArr, jArr2, jArr5);
        for (int i2 = 0; i2 < 13; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr5[i2];
        }
        long[] jArr6 = new long[7];
        am2.O(jArr3, jArr6);
        return new vn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((vn1) r93Var).k;
        long[] jArr2 = this.k;
        return new vn1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4], jArr2[5] ^ jArr[5], jArr2[6] ^ jArr[6]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vn1)) {
            return false;
        }
        long[] jArr = ((vn1) obj).k;
        for (int i = 6; i >= 0; i--) {
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
        return new vn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = this.k[i];
            if (j != 0) {
                sp0.v((6 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return z32.s(this.k, 7) ^ 4090087;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 409;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public vn1(long[] jArr) {
        this.k = jArr;
    }
}
