package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bv extends r93 {
    public static final BigInteger l = av.i;
    public static final int[] m = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    public int[] k;

    public bv(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[8];
        x91.A(qt.a, this.k, iArr);
        return new bv(iArr);
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
        qt.r(this.k, ((bv) r93Var).k, iArr);
        return new bv(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[8];
        int[] iArr2 = this.k;
        if (r93.J(iArr2)) {
            r93.l0(iArr);
        } else {
            r93.b0(qt.a, iArr2, iArr);
        }
        return new bv(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (r93.J(iArr) || r93.G(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        qt.x(iArr, iArr2);
        qt.r(iArr2, iArr, iArr2);
        qt.x(iArr2, iArr2);
        qt.r(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        qt.x(iArr2, iArr3);
        qt.r(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        qt.y(3, iArr3, iArr4);
        qt.r(iArr4, iArr2, iArr4);
        qt.y(4, iArr4, iArr2);
        qt.r(iArr2, iArr3, iArr2);
        qt.y(4, iArr2, iArr4);
        qt.r(iArr4, iArr3, iArr4);
        qt.y(15, iArr4, iArr3);
        qt.r(iArr3, iArr4, iArr3);
        qt.y(30, iArr3, iArr4);
        qt.r(iArr4, iArr3, iArr4);
        qt.y(60, iArr4, iArr3);
        qt.r(iArr3, iArr4, iArr3);
        qt.y(11, iArr3, iArr4);
        qt.r(iArr4, iArr2, iArr4);
        qt.y(120, iArr4, iArr2);
        qt.r(iArr2, iArr3, iArr2);
        qt.x(iArr2, iArr2);
        qt.x(iArr2, iArr3);
        if (r93.q(iArr, iArr3)) {
            return new bv(iArr2);
        }
        qt.r(iArr2, m, iArr2);
        qt.x(iArr2, iArr3);
        if (r93.q(iArr, iArr3)) {
            return new bv(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[8];
        qt.x(this.k, iArr);
        return new bv(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[8];
        r93.c(this.k, ((bv) r93Var).k, iArr);
        if (r93.x(iArr, qt.a)) {
            qt.A(iArr);
        }
        return new bv(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[8];
        qt.B(this.k, ((bv) r93Var).k, iArr);
        return new bv(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bv) {
            return r93.q(this.k, ((bv) obj).k);
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
        kv.I(8, this.k, iArr);
        if (r93.x(iArr, qt.a)) {
            qt.A(iArr);
        }
        return new bv(iArr);
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
        x91.A(qt.a, ((bv) r93Var).k, iArr);
        qt.r(iArr, this.k, iArr);
        return new bv(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
