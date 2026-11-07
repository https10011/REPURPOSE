package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kn1 extends r93 {
    public static final BigInteger l = jn1.i;
    public int[] k;

    public kn1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[12];
        x91.A(yv2.h, this.k, iArr);
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return kv.P(this.k, 12);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return kv.Q(this.k, 12);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[12];
        yv2.J(this.k, ((kn1) r93Var).k, iArr);
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[12];
        int[] iArr2 = this.k;
        if (kv.Q(iArr2, 12)) {
            for (int i = 0; i < 12; i++) {
                iArr[i] = 0;
            }
        } else {
            kv.f0(12, yv2.h, iArr2, iArr);
        }
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (kv.Q(iArr, 12) || kv.P(iArr, 12)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        yv2.M(iArr, iArr2);
        yv2.J(iArr2, iArr, iArr2);
        yv2.O(2, iArr2, iArr3);
        yv2.J(iArr3, iArr2, iArr3);
        yv2.M(iArr3, iArr3);
        yv2.J(iArr3, iArr, iArr3);
        yv2.O(5, iArr3, iArr4);
        yv2.J(iArr4, iArr3, iArr4);
        yv2.O(5, iArr4, iArr5);
        yv2.J(iArr5, iArr3, iArr5);
        yv2.O(15, iArr5, iArr3);
        yv2.J(iArr3, iArr5, iArr3);
        yv2.O(2, iArr3, iArr4);
        yv2.J(iArr2, iArr4, iArr2);
        yv2.O(28, iArr4, iArr4);
        yv2.J(iArr3, iArr4, iArr3);
        yv2.O(60, iArr3, iArr4);
        yv2.J(iArr4, iArr3, iArr4);
        yv2.O(120, iArr4, iArr3);
        yv2.J(iArr3, iArr4, iArr3);
        yv2.O(15, iArr3, iArr3);
        yv2.J(iArr3, iArr5, iArr3);
        yv2.O(33, iArr3, iArr3);
        yv2.J(iArr3, iArr2, iArr3);
        yv2.O(64, iArr3, iArr3);
        yv2.J(iArr3, iArr, iArr3);
        yv2.O(30, iArr3, iArr2);
        yv2.M(iArr2, iArr3);
        if (kv.p(12, iArr, iArr3)) {
            return new kn1(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[12];
        yv2.M(this.k, iArr);
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[12];
        if (kv.b(12, this.k, ((kn1) r93Var).k, iArr) != 0 || (iArr[11] == -1 && kv.C(12, iArr, yv2.h))) {
            yv2.d(iArr);
        }
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[12];
        yv2.T(this.k, ((kn1) r93Var).k, iArr);
        return new kn1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kn1) {
            return kv.p(12, this.k, ((kn1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return kv.u(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[12];
        if (kv.I(12, this.k, iArr) != 0 || (iArr[11] == -1 && kv.C(12, iArr, yv2.h))) {
            yv2.d(iArr);
        }
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return kv.j0(this.k, 12);
    }

    public final int hashCode() {
        return z32.r(this.k, 12) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[12];
        x91.A(yv2.h, ((kn1) r93Var).k, iArr);
        yv2.J(iArr, this.k, iArr);
        return new kn1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
