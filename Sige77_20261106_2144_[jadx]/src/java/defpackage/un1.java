package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class un1 extends r93 {
    public final long[] k;

    public un1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            e.g("x value invalid for SecT283FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            sm0.a();
            throw null;
        }
        long[] jArr = new long[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[4];
        long j2 = j >>> 27;
        jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
        jArr[4] = j & 134217727;
        this.k = jArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[5];
        for (int i = 0; i < 5; i++) {
            long[] jArr2 = this.k;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[5];
                long[] jArr4 = new long[5];
                dw0.z(jArr2, jArr3);
                dw0.q(jArr3, jArr2, jArr3);
                dw0.A(2, jArr3, jArr4);
                dw0.q(jArr4, jArr3, jArr4);
                dw0.A(4, jArr4, jArr3);
                dw0.q(jArr3, jArr4, jArr3);
                dw0.A(8, jArr3, jArr4);
                dw0.q(jArr4, jArr3, jArr4);
                dw0.z(jArr4, jArr4);
                dw0.q(jArr4, jArr2, jArr4);
                dw0.A(17, jArr4, jArr3);
                dw0.q(jArr3, jArr4, jArr3);
                dw0.z(jArr3, jArr3);
                dw0.q(jArr3, jArr2, jArr3);
                dw0.A(35, jArr3, jArr4);
                dw0.q(jArr4, jArr3, jArr4);
                dw0.A(70, jArr4, jArr3);
                dw0.q(jArr3, jArr4, jArr3);
                dw0.z(jArr3, jArr3);
                dw0.q(jArr3, jArr2, jArr3);
                dw0.A(141, jArr3, jArr4);
                dw0.q(jArr4, jArr3, jArr4);
                dw0.z(jArr4, jArr);
                return new un1(jArr);
            }
        }
        uq1.n();
        return null;
    }

    @Override // defpackage.r93
    public final boolean F() {
        long[] jArr = this.k;
        if (jArr[0] == 1) {
            for (int i = 1; i < 5; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean I() {
        for (int i = 0; i < 5; i++) {
            if (this.k[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[5];
        dw0.q(this.k, ((un1) r93Var).k, jArr);
        return new un1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((un1) r93Var).k;
        long[] jArr2 = ((un1) r93Var2).k;
        long[] jArr3 = ((un1) r93Var3).k;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[10];
        dw0.m(this.k, jArr, jArr5);
        dw0.b(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[10];
        dw0.m(jArr2, jArr3, jArr6);
        dw0.b(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[5];
        dw0.w(jArr4, jArr7);
        return new un1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[5];
        long[] jArr2 = this.k;
        long jU = bj0.u(jArr2[0]);
        long jU2 = bj0.u(jArr2[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long jU3 = bj0.u(jArr2[2]);
        long jU4 = bj0.u(jArr2[3]);
        long j2 = (jU3 & 4294967295L) | (jU4 << 32);
        long jU5 = bj0.u(jArr2[4]);
        dw0.q(new long[]{(jU >>> 32) | (jU2 & (-4294967296L)), (jU3 >>> 32) | (jU4 & (-4294967296L)), jU5 >>> 32, 0, 0}, dw0.d, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j2;
        jArr[2] = jArr[2] ^ (4294967295L & jU5);
        return new un1(jArr);
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[5];
        dw0.z(this.k, jArr);
        return new un1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((un1) r93Var).k;
        long[] jArr2 = ((un1) r93Var2).k;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        dw0.o(this.k, jArr4);
        dw0.b(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[10];
        dw0.m(jArr, jArr2, jArr5);
        dw0.b(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[5];
        dw0.w(jArr3, jArr6);
        return new un1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((un1) r93Var).k;
        long[] jArr2 = this.k;
        return new un1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr2[2] ^ jArr[2], jArr2[3] ^ jArr[3], jArr2[4] ^ jArr[4]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        long[] jArr = ((un1) obj).k;
        for (int i = 4; i >= 0; i--) {
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
        return new un1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = this.k[i];
            if (j != 0) {
                sp0.v((4 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return z32.s(this.k, 5) ^ 2831275;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 283;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public un1(long[] jArr) {
        this.k = jArr;
    }
}
