package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ym1 extends r93 {
    public static final BigInteger l = xm1.i;
    public int[] k;

    public ym1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[6];
        x91.A(x91.b, this.k, iArr);
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return yv2.C(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return yv2.D(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[6];
        x91.D(this.k, ((ym1) r93Var).k, iArr);
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[6];
        int[] iArr2 = this.k;
        if (yv2.D(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
        } else {
            yv2.Q(x91.b, iArr2, iArr);
        }
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (yv2.D(iArr) || yv2.C(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        x91.N(iArr, iArr2);
        x91.D(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        x91.N(iArr2, iArr3);
        x91.D(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        x91.O(3, iArr3, iArr4);
        x91.D(iArr4, iArr3, iArr4);
        x91.O(2, iArr4, iArr4);
        x91.D(iArr4, iArr2, iArr4);
        x91.O(8, iArr4, iArr2);
        x91.D(iArr2, iArr4, iArr2);
        x91.O(3, iArr2, iArr4);
        x91.D(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        x91.O(16, iArr4, iArr5);
        x91.D(iArr5, iArr2, iArr5);
        x91.O(35, iArr5, iArr2);
        x91.D(iArr2, iArr5, iArr2);
        x91.O(70, iArr2, iArr5);
        x91.D(iArr5, iArr2, iArr5);
        x91.O(19, iArr5, iArr2);
        x91.D(iArr2, iArr4, iArr2);
        x91.O(20, iArr2, iArr2);
        x91.D(iArr2, iArr4, iArr2);
        x91.O(4, iArr2, iArr2);
        x91.D(iArr2, iArr3, iArr2);
        x91.O(6, iArr2, iArr2);
        x91.D(iArr2, iArr3, iArr2);
        x91.N(iArr2, iArr2);
        x91.N(iArr2, iArr3);
        if (yv2.s(iArr, iArr3)) {
            return new ym1(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[6];
        x91.N(this.k, iArr);
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[6];
        if (yv2.b(this.k, ((ym1) r93Var).k, iArr) != 0 || (iArr[5] == -1 && yv2.B(iArr, x91.b))) {
            kv.d(6, 4553, iArr);
        }
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[6];
        x91.Q(this.k, ((ym1) r93Var).k, iArr);
        return new ym1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ym1) {
            return yv2.s(this.k, ((ym1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return yv2.x(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[6];
        if (kv.I(6, this.k, iArr) != 0 || (iArr[5] == -1 && yv2.B(iArr, x91.b))) {
            kv.d(6, 4553, iArr);
        }
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return yv2.U(this.k);
    }

    public final int hashCode() {
        return z32.r(this.k, 6) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[6];
        x91.A(x91.b, ((ym1) r93Var).k, iArr);
        x91.D(iArr, this.k, iArr);
        return new ym1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
