package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gn1 extends r93 {
    public static final BigInteger l = fn1.i;
    public int[] k;

    public gn1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[8];
        x91.A(am2.b, this.k, iArr);
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return r93.G(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return r93.J(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[8];
        am2.J(this.k, ((gn1) r93Var).k, iArr);
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[8];
        int[] iArr2 = this.k;
        if (r93.J(iArr2)) {
            r93.l0(iArr);
        } else {
            r93.b0(am2.b, iArr2, iArr);
        }
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (r93.J(iArr) || r93.G(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        am2.R(iArr, iArr2);
        am2.J(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        am2.R(iArr2, iArr3);
        am2.J(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        am2.T(3, iArr3, iArr4);
        am2.J(iArr4, iArr3, iArr4);
        am2.T(3, iArr4, iArr4);
        am2.J(iArr4, iArr3, iArr4);
        am2.T(2, iArr4, iArr4);
        am2.J(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        am2.T(11, iArr4, iArr5);
        am2.J(iArr5, iArr4, iArr5);
        am2.T(22, iArr5, iArr4);
        am2.J(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        am2.T(44, iArr4, iArr6);
        am2.J(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        am2.T(88, iArr6, iArr7);
        am2.J(iArr7, iArr6, iArr7);
        am2.T(44, iArr7, iArr6);
        am2.J(iArr6, iArr4, iArr6);
        am2.T(3, iArr6, iArr4);
        am2.J(iArr4, iArr3, iArr4);
        am2.T(23, iArr4, iArr4);
        am2.J(iArr4, iArr5, iArr4);
        am2.T(6, iArr4, iArr4);
        am2.J(iArr4, iArr2, iArr4);
        am2.T(2, iArr4, iArr4);
        am2.R(iArr4, iArr2);
        if (r93.q(iArr, iArr2)) {
            return new gn1(iArr4);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[8];
        am2.R(this.k, iArr);
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[8];
        if (r93.c(this.k, ((gn1) r93Var).k, iArr) != 0 || (iArr[7] == -1 && r93.x(iArr, am2.b))) {
            kv.d(8, 977, iArr);
        }
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[8];
        am2.W(this.k, ((gn1) r93Var).k, iArr);
        return new gn1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gn1) {
            return r93.q(this.k, ((gn1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return r93.u(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[8];
        if (kv.I(8, this.k, iArr) != 0 || (iArr[7] == -1 && r93.x(iArr, am2.b))) {
            kv.d(8, 977, iArr);
        }
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return r93.h0(this.k);
    }

    public final int hashCode() {
        return z32.r(this.k, 8) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[8];
        x91.A(am2.b, ((gn1) r93Var).k, iArr);
        am2.J(iArr, this.k, iArr);
        return new gn1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
