package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wm1 extends r93 {
    public static final BigInteger l = vm1.i;
    public final int[] k;

    public wm1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(l) >= 0) {
            e.g("x value invalid for SecP160R2FieldElement");
            throw null;
        }
        int[] iArrS = gu2.s(bigInteger);
        if (iArrS[4] == -1) {
            int[] iArr = y21.c;
            if (gu2.w(iArrS, iArr)) {
                gu2.K(iArr, iArrS);
            }
        }
        this.k = iArrS;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[5];
        x91.A(y21.c, this.k, iArr);
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return gu2.z(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return gu2.A(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[5];
        y21.m(this.k, ((wm1) r93Var).k, iArr);
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[5];
        int[] iArr2 = this.k;
        if (gu2.A(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
        } else {
            gu2.J(y21.c, iArr2, iArr);
        }
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (gu2.A(iArr) || gu2.z(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        y21.r(iArr, iArr2);
        y21.m(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        y21.r(iArr2, iArr3);
        y21.m(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        y21.r(iArr3, iArr4);
        y21.m(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        y21.s(3, iArr4, iArr5);
        y21.m(iArr5, iArr3, iArr5);
        y21.s(7, iArr5, iArr4);
        y21.m(iArr4, iArr5, iArr4);
        y21.s(3, iArr4, iArr5);
        y21.m(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        y21.s(14, iArr5, iArr6);
        y21.m(iArr6, iArr4, iArr6);
        y21.s(31, iArr6, iArr4);
        y21.m(iArr4, iArr6, iArr4);
        y21.s(62, iArr4, iArr6);
        y21.m(iArr6, iArr4, iArr6);
        y21.s(3, iArr6, iArr4);
        y21.m(iArr4, iArr3, iArr4);
        y21.s(18, iArr4, iArr4);
        y21.m(iArr4, iArr5, iArr4);
        y21.s(2, iArr4, iArr4);
        y21.m(iArr4, iArr, iArr4);
        y21.s(3, iArr4, iArr4);
        y21.m(iArr4, iArr2, iArr4);
        y21.s(6, iArr4, iArr4);
        y21.m(iArr4, iArr3, iArr4);
        y21.s(2, iArr4, iArr4);
        y21.m(iArr4, iArr, iArr4);
        y21.r(iArr4, iArr2);
        if (gu2.r(iArr, iArr2)) {
            return new wm1(iArr4);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[5];
        y21.r(this.k, iArr);
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[5];
        if (gu2.c(this.k, ((wm1) r93Var).k, iArr) != 0 || (iArr[4] == -1 && gu2.w(iArr, y21.c))) {
            kv.d(5, 21389, iArr);
        }
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[5];
        y21.t(this.k, ((wm1) r93Var).k, iArr);
        return new wm1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wm1) {
            return gu2.r(this.k, ((wm1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return gu2.t(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[5];
        if (kv.I(5, this.k, iArr) != 0 || (iArr[4] == -1 && gu2.w(iArr, y21.c))) {
            kv.d(5, 21389, iArr);
        }
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return gu2.M(this.k);
    }

    public final int hashCode() {
        return z32.r(this.k, 5) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[5];
        x91.A(y21.c, ((wm1) r93Var).k, iArr);
        y21.m(iArr, this.k, iArr);
        return new wm1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }

    public wm1(int[] iArr) {
        this.k = iArr;
    }
}
