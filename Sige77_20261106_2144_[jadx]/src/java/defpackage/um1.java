package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class um1 extends r93 {
    public static final BigInteger l = tm1.i;
    public int[] k;

    public um1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[5];
        x91.A(rq0.d, this.k, iArr);
        return new um1(iArr);
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
        rq0.y(this.k, ((um1) r93Var).k, iArr);
        return new um1(iArr);
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
            gu2.J(rq0.d, iArr2, iArr);
        }
        return new um1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (gu2.A(iArr) || gu2.z(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        rq0.C(iArr, iArr2);
        rq0.y(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        rq0.D(2, iArr2, iArr3);
        rq0.y(iArr3, iArr2, iArr3);
        rq0.D(4, iArr3, iArr2);
        rq0.y(iArr2, iArr3, iArr2);
        rq0.D(8, iArr2, iArr3);
        rq0.y(iArr3, iArr2, iArr3);
        rq0.D(16, iArr3, iArr2);
        rq0.y(iArr2, iArr3, iArr2);
        rq0.D(32, iArr2, iArr3);
        rq0.y(iArr3, iArr2, iArr3);
        rq0.D(64, iArr3, iArr2);
        rq0.y(iArr2, iArr3, iArr2);
        rq0.C(iArr2, iArr3);
        rq0.y(iArr3, iArr, iArr3);
        rq0.D(29, iArr3, iArr3);
        rq0.C(iArr3, iArr2);
        if (gu2.r(iArr, iArr2)) {
            return new um1(iArr3);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[5];
        rq0.C(this.k, iArr);
        return new um1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[5];
        if (gu2.c(this.k, ((um1) r93Var).k, iArr) != 0 || (iArr[4] == -1 && gu2.w(iArr, rq0.d))) {
            kv.j(5, -2147483647, iArr);
        }
        return new um1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[5];
        rq0.E(this.k, ((um1) r93Var).k, iArr);
        return new um1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof um1) {
            return gu2.r(this.k, ((um1) obj).k);
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
        if (kv.I(5, this.k, iArr) != 0 || (iArr[4] == -1 && gu2.w(iArr, rq0.d))) {
            kv.j(5, -2147483647, iArr);
        }
        return new um1(iArr);
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
        x91.A(rq0.d, ((um1) r93Var).k, iArr);
        rq0.y(iArr, this.k, iArr);
        return new um1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
