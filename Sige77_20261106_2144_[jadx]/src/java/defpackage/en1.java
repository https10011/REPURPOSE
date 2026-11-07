package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class en1 extends r93 {
    public static final BigInteger l = dn1.i;
    public int[] k;

    public en1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[7];
        x91.A(nj2.b, this.k, iArr);
        return new en1(iArr);
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
        nj2.L(this.k, ((en1) r93Var).k, iArr);
        return new en1(iArr);
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
            g93.G(nj2.b, iArr2, iArr);
        }
        return new en1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = nj2.b;
        int[] iArr4 = this.k;
        if (g93.w(iArr4) || g93.v(iArr4)) {
            return this;
        }
        int[] iArr5 = new int[7];
        char c = 6;
        if (g93.w(iArr4)) {
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr5[2] = 0;
            iArr5[3] = 0;
            iArr5[4] = 0;
            iArr5[5] = 0;
            iArr5[6] = 0;
        } else {
            g93.G(iArr3, iArr4, iArr5);
        }
        Random random = new Random();
        int[] iArr6 = new int[7];
        int i = iArr3[6];
        int i2 = i | (i >>> 1);
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        int i6 = (i5 >>> 16) | i5;
        do {
            for (int i7 = 0; i7 != 7; i7++) {
                iArr6[i7] = random.nextInt();
            }
            iArr6[6] = iArr6[6] & i6;
        } while (kv.C(7, iArr6, iArr3));
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[7];
        g93.m(iArr4, iArr8);
        for (int i8 = 0; i8 < 7; i8++) {
            g93.m(iArr8, iArr9);
            int i9 = 1 << i8;
            int[] iArr10 = new int[14];
            g93.F(iArr8, iArr10);
            nj2.N(iArr10, iArr8);
            while (true) {
                i9--;
                if (i9 > 0) {
                    g93.F(iArr8, iArr10);
                    nj2.N(iArr10, iArr8);
                }
            }
            nj2.L(iArr8, iArr9, iArr8);
        }
        int[] iArr11 = new int[14];
        g93.F(iArr8, iArr11);
        nj2.N(iArr11, iArr8);
        int i10 = 95;
        while (true) {
            i10--;
            if (i10 <= 0) {
                break;
            }
            g93.F(iArr8, iArr11);
            nj2.N(iArr11, iArr8);
        }
        if (!g93.v(iArr8)) {
            return null;
        }
        loop5: while (true) {
            int[] iArr12 = new int[7];
            g93.m(iArr6, iArr12);
            int[] iArr13 = new int[7];
            iArr13[0] = 1;
            int[] iArr14 = new int[7];
            g93.m(iArr5, iArr14);
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            for (int i11 = 0; i11 < 7; i11++) {
                g93.m(iArr12, iArr15);
                g93.m(iArr13, iArr16);
                int i12 = 1 << i11;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        nj2.L(iArr13, iArr12, iArr13);
                        nj2.X(iArr13, iArr13);
                        nj2.T(iArr12, iArr7);
                        nj2.h(iArr14, iArr7, iArr12);
                        nj2.L(iArr14, iArr7, iArr14);
                        nj2.P(iArr14, kv.c0(iArr14, 7));
                        c = c;
                    }
                }
                nj2.L(iArr13, iArr16, iArr7);
                nj2.L(iArr7, iArr5, iArr7);
                nj2.L(iArr12, iArr15, iArr14);
                nj2.h(iArr14, iArr7, iArr14);
                nj2.L(iArr12, iArr16, iArr7);
                g93.m(iArr14, iArr12);
                nj2.L(iArr13, iArr15, iArr13);
                nj2.h(iArr13, iArr7, iArr13);
                nj2.T(iArr13, iArr14);
                nj2.L(iArr14, iArr5, iArr14);
            }
            char c2 = c;
            iArr = new int[7];
            iArr2 = new int[7];
            for (int i13 = 1; i13 < 96; i13++) {
                g93.m(iArr12, iArr);
                g93.m(iArr13, iArr2);
                nj2.L(iArr13, iArr12, iArr13);
                nj2.X(iArr13, iArr13);
                nj2.T(iArr12, iArr7);
                nj2.h(iArr14, iArr7, iArr12);
                nj2.L(iArr14, iArr7, iArr14);
                nj2.P(iArr14, kv.c0(iArr14, 7));
                if (g93.w(iArr12)) {
                    break loop5;
                }
            }
            if (kv.I(7, iArr6, iArr6) != 0 || (iArr6[c2] == -1 && g93.s(iArr6, iArr3))) {
                nj2.j(iArr6);
            }
            c = c2;
        }
        x91.A(iArr3, iArr2, iArr7);
        nj2.L(iArr7, iArr, iArr7);
        nj2.T(iArr7, iArr6);
        if (g93.o(iArr4, iArr6)) {
            return new en1(iArr7);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[7];
        nj2.T(this.k, iArr);
        return new en1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[7];
        nj2.h(this.k, ((en1) r93Var).k, iArr);
        return new en1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[7];
        nj2.W(this.k, ((en1) r93Var).k, iArr);
        return new en1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof en1) {
            return g93.o(this.k, ((en1) obj).k);
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
        if (kv.I(7, this.k, iArr) != 0 || (iArr[6] == -1 && g93.s(iArr, nj2.b))) {
            nj2.j(iArr);
        }
        return new en1(iArr);
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
        x91.A(nj2.b, ((en1) r93Var).k, iArr);
        nj2.L(iArr, this.k, iArr);
        return new en1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
