package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cn1 extends r93 {
    public static final BigInteger l = bn1.i;
    public static final int[] m = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};
    public int[] k;

    public cn1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[7];
        x91.A(gb2.b, this.k, iArr);
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return g93.v(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return g93.w(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[7];
        gb2.v(this.k, ((cn1) r93Var).k, iArr);
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[7];
        int[] iArr2 = this.k;
        if (g93.w(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            iArr[6] = 0;
        } else {
            g93.G(gb2.b, iArr2, iArr);
        }
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (g93.w(iArr) || g93.v(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        gb2.D(iArr, iArr2);
        gb2.v(iArr2, iArr, iArr2);
        gb2.D(iArr2, iArr2);
        gb2.v(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        gb2.D(iArr2, iArr3);
        gb2.v(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        gb2.F(4, iArr3, iArr4);
        gb2.v(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        gb2.F(3, iArr4, iArr5);
        gb2.v(iArr5, iArr2, iArr5);
        gb2.F(8, iArr5, iArr5);
        gb2.v(iArr5, iArr4, iArr5);
        gb2.F(4, iArr5, iArr4);
        gb2.v(iArr4, iArr3, iArr4);
        gb2.F(19, iArr4, iArr3);
        gb2.v(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        gb2.F(42, iArr3, iArr6);
        gb2.v(iArr6, iArr3, iArr6);
        gb2.F(23, iArr6, iArr3);
        gb2.v(iArr3, iArr4, iArr3);
        gb2.F(84, iArr3, iArr4);
        gb2.v(iArr4, iArr6, iArr4);
        gb2.F(20, iArr4, iArr4);
        gb2.v(iArr4, iArr5, iArr4);
        gb2.F(3, iArr4, iArr4);
        gb2.v(iArr4, iArr, iArr4);
        gb2.F(2, iArr4, iArr4);
        gb2.v(iArr4, iArr, iArr4);
        gb2.F(4, iArr4, iArr4);
        gb2.v(iArr4, iArr2, iArr4);
        gb2.D(iArr4, iArr4);
        gb2.D(iArr4, iArr6);
        if (g93.o(iArr, iArr6)) {
            return new cn1(iArr4);
        }
        gb2.v(iArr4, m, iArr4);
        gb2.D(iArr4, iArr6);
        if (g93.o(iArr, iArr6)) {
            return new cn1(iArr4);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[7];
        gb2.D(this.k, iArr);
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[7];
        if (g93.c(this.k, ((cn1) r93Var).k, iArr) != 0 || (iArr[6] == -1 && g93.s(iArr, gb2.b))) {
            kv.d(7, 6803, iArr);
        }
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[7];
        gb2.H(this.k, ((cn1) r93Var).k, iArr);
        return new cn1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cn1) {
            return g93.o(this.k, ((cn1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return g93.q(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[7];
        if (kv.I(7, this.k, iArr) != 0 || (iArr[6] == -1 && g93.s(iArr, gb2.b))) {
            kv.d(7, 6803, iArr);
        }
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return g93.I(this.k);
    }

    public final int hashCode() {
        return z32.r(this.k, 7) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[7];
        x91.A(gb2.b, ((cn1) r93Var).k, iArr);
        gb2.v(iArr, this.k, iArr);
        return new cn1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
