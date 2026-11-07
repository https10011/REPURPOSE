package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pn1 extends r93 {
    public final long[] k;

    public pn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            e.g("x value invalid for SecT131FieldElement");
            throw null;
        }
        long[] jArrU = yv2.u(bigInteger);
        long j = jArrU[2];
        long j2 = j >>> 3;
        jArrU[0] = ((j2 << 8) ^ (((j2 << 2) ^ j2) ^ (j2 << 3))) ^ jArrU[0];
        jArrU[1] = jArrU[1] ^ (j >>> 59);
        jArrU[2] = j & 7;
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
        long[] jArr5 = new long[5];
        r93.B(jArr2, jArr5);
        r93.U(jArr5, jArr3);
        r93.O(jArr3, jArr2, jArr3);
        r93.Z(2, jArr3, jArr4);
        r93.O(jArr4, jArr3, jArr4);
        r93.Z(4, jArr4, jArr3);
        r93.O(jArr3, jArr4, jArr3);
        r93.Z(8, jArr3, jArr4);
        r93.O(jArr4, jArr3, jArr4);
        r93.Z(16, jArr4, jArr3);
        r93.O(jArr3, jArr4, jArr3);
        r93.Z(32, jArr3, jArr4);
        r93.O(jArr4, jArr3, jArr4);
        long[] jArr6 = new long[5];
        r93.B(jArr4, jArr6);
        r93.U(jArr6, jArr4);
        r93.O(jArr4, jArr2, jArr4);
        r93.Z(65, jArr4, jArr3);
        r93.O(jArr3, jArr4, jArr3);
        long[] jArr7 = new long[5];
        r93.B(jArr3, jArr7);
        r93.U(jArr7, jArr);
        return new pn1(jArr);
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
        r93.O(this.k, ((pn1) r93Var).k, jArr);
        return new pn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((pn1) r93Var).k;
        long[] jArr2 = ((pn1) r93Var2).k;
        long[] jArr3 = ((pn1) r93Var3).k;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[6];
        r93.z(this.k, jArr, jArr5);
        r93.f(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[6];
        r93.z(jArr2, jArr3, jArr6);
        r93.f(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[3];
        r93.U(jArr4, jArr7);
        return new pn1(jArr7);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[3];
        long[] jArr2 = this.k;
        long jU = bj0.u(jArr2[0]);
        long jU2 = bj0.u(jArr2[1]);
        long j = (jU & 4294967295L) | (jU2 << 32);
        long jU3 = bj0.u(jArr2[2]);
        r93.O(new long[]{(jU >>> 32) | (jU2 & (-4294967296L)), jU3 >>> 32, 0}, r93.h, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ (jU3 & 4294967295L);
        return new pn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[5];
        r93.B(this.k, jArr2);
        r93.U(jArr2, jArr);
        return new pn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((pn1) r93Var).k;
        long[] jArr2 = ((pn1) r93Var2).k;
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        r93.B(this.k, jArr4);
        r93.f(jArr3, jArr4, jArr3);
        long[] jArr5 = new long[6];
        r93.z(jArr, jArr2, jArr5);
        r93.f(jArr3, jArr5, jArr3);
        long[] jArr6 = new long[3];
        r93.U(jArr3, jArr6);
        return new pn1(jArr6);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = ((pn1) r93Var).k;
        long[] jArr2 = this.k;
        return new pn1(new long[]{jArr2[0] ^ jArr[0], jArr2[1] ^ jArr[1], jArr[2] ^ jArr2[2]});
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        long[] jArr = ((pn1) obj).k;
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
        return new pn1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return yv2.V(this.k);
    }

    public final int hashCode() {
        return z32.s(this.k, 3) ^ 131832;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 131;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public pn1(long[] jArr) {
        this.k = jArr;
    }
}
