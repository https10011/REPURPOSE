package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class in1 extends r93 {
    public static final BigInteger l = hn1.i;
    public int[] k;

    public in1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[8];
        x91.A(gu2.e, this.k, iArr);
        return new in1(iArr);
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
        gu2.D(this.k, ((in1) r93Var).k, iArr);
        return new in1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[8];
        int[] iArr2 = this.k;
        if (r93.J(iArr2)) {
            r93.l0(iArr);
        } else {
            r93.b0(gu2.e, iArr2, iArr);
        }
        return new in1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (r93.J(iArr) || r93.G(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        gu2.G(iArr, iArr2);
        gu2.D(iArr2, iArr, iArr2);
        gu2.I(2, iArr2, iArr3);
        gu2.D(iArr3, iArr2, iArr3);
        gu2.I(4, iArr3, iArr2);
        gu2.D(iArr2, iArr3, iArr2);
        gu2.I(8, iArr2, iArr3);
        gu2.D(iArr3, iArr2, iArr3);
        gu2.I(16, iArr3, iArr2);
        gu2.D(iArr2, iArr3, iArr2);
        gu2.I(32, iArr2, iArr2);
        gu2.D(iArr2, iArr, iArr2);
        gu2.I(96, iArr2, iArr2);
        gu2.D(iArr2, iArr, iArr2);
        gu2.I(94, iArr2, iArr2);
        gu2.G(iArr2, iArr3);
        if (r93.q(iArr, iArr3)) {
            return new in1(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[8];
        gu2.G(this.k, iArr);
        return new in1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[8];
        if (r93.c(this.k, ((in1) r93Var).k, iArr) != 0 || (iArr[7] == -1 && r93.x(iArr, gu2.e))) {
            gu2.e(iArr);
        }
        return new in1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[8];
        gu2.L(this.k, ((in1) r93Var).k, iArr);
        return new in1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof in1) {
            return r93.q(this.k, ((in1) obj).k);
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
        if (kv.I(8, this.k, iArr) != 0 || (iArr[7] == -1 && r93.x(iArr, gu2.e))) {
            gu2.e(iArr);
        }
        return new in1(iArr);
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
        x91.A(gu2.e, ((in1) r93Var).k, iArr);
        gu2.D(iArr, this.k, iArr);
        return new in1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
