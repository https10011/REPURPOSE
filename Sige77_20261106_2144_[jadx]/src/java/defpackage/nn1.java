package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nn1 extends r93 {
    public final long[] k;

    public nn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            e.g("x value invalid for SecT113FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            sm0.a();
            throw null;
        }
        long[] jArr = new long[2];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[1];
        long j2 = j >>> 49;
        jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
        jArr[1] = j & 562949953421311L;
        this.k = jArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            long[] jArr2 = this.k;
            if (jArr2[i] != 0) {
                long[] jArr3 = new long[2];
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[4];
                x91.y(jArr2, jArr5);
                x91.I(jArr5, jArr3);
                x91.E(jArr3, jArr2, jArr3);
                long[] jArr6 = new long[4];
                x91.y(jArr3, jArr6);
                x91.I(jArr6, jArr3);
                x91.E(jArr3, jArr2, jArr3);
                x91.P(3, jArr3, jArr4);
                x91.E(jArr4, jArr3, jArr4);
                long[] jArr7 = new long[4];
                x91.y(jArr4, jArr7);
                x91.I(jArr7, jArr4);
                x91.E(jArr4, jArr2, jArr4);
                x91.P(7, jArr4, jArr3);
                x91.E(jArr3, jArr4, jArr3);
                x91.P(14, jArr3, jArr4);
                x91.E(jArr4, jArr3, jArr4);
                x91.P(28, jArr4, jArr3);
                x91.E(jArr3, jArr4, jArr3);
                x91.P(56, jArr3, jArr4);
                x91.E(jArr4, jArr3, jArr4);
                long[] jArr8 = new long[4];
                x91.y(jArr4, jArr8);
                x91.I(jArr8, jArr);
                return new nn1(jArr);
            }
        }
        uq1.n();
        return null;
    }

    @Override // defpackage.r93
    public final boolean F() {
        long[] jArr = this.k;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    @Override // defpackage.r93
    public final boolean I() {
        for (int i = 0; i < 2; i++) {
            if (this.k[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[2];
        x91.E(this.k, ((nn1) r93Var).k, jArr);
        return new nn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((nn1) r93Var).k;
        long[] jArr2 = ((nn1) r93Var2).k;
        long[] jArr3 = ((nn1) r93Var3).k;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        x91.w(this.k, jArr, jArr5);
        x91.h(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        x91.w(jArr2, jArr3, jArr6);
        x91.h(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        x91.I(jArr4, jArr7);
        return new nn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = this.k;
        long jU = bj0.u(jArr[0]);
        long jU2 = bj0.u(jArr[1]);
        long j = (4294967295L & jU) | (jU2 << 32);
        long j2 = (jU >>> 32) | (jU2 & (-4294967296L));
        return new nn1(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        x91.y(this.k, jArr2);
        x91.I(jArr2, jArr);
        return new nn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((nn1) r93Var).k;
        long[] jArr2 = ((nn1) r93Var2).k;
        long[] jArr3 = new long[4];
        long[] jArr4 = new long[4];
        x91.y(this.k, jArr4);
        x91.h(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[4];
        x91.w(jArr, jArr2, jArr5);
        x91.h(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[2];
        x91.I(jArr3, jArr6);
        return new nn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((nn1) r93Var).k;
        long[] jArr2 = this.k;
        return new nn1(new long[]{jArr2[0] ^ jArr[0], jArr[1] ^ jArr2[1]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn1)) {
            return false;
        }
        long[] jArr = ((nn1) obj).k;
        for (int i = 1; i >= 0; i--) {
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
        return new nn1(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = this.k[i];
            if (j != 0) {
                sp0.v((1 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return z32.s(this.k, 2) ^ 113009;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 113;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public nn1(long[] jArr) {
        this.k = jArr;
    }
}
