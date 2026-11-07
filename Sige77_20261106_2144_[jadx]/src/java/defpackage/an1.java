package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class an1 extends r93 {
    public static final BigInteger l = zm1.i;
    public int[] k;

    public an1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[6];
        x91.A(ye1.c, this.k, iArr);
        return new an1(iArr);
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
        ye1.r(this.k, ((an1) r93Var).k, iArr);
        return new an1(iArr);
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
            yv2.Q(ye1.c, iArr2, iArr);
        }
        return new an1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (yv2.D(iArr) || yv2.C(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        ye1.z(iArr, iArr2);
        ye1.r(iArr2, iArr, iArr2);
        ye1.A(2, iArr2, iArr3);
        ye1.r(iArr3, iArr2, iArr3);
        ye1.A(4, iArr3, iArr2);
        ye1.r(iArr2, iArr3, iArr2);
        ye1.A(8, iArr2, iArr3);
        ye1.r(iArr3, iArr2, iArr3);
        ye1.A(16, iArr3, iArr2);
        ye1.r(iArr2, iArr3, iArr2);
        ye1.A(32, iArr2, iArr3);
        ye1.r(iArr3, iArr2, iArr3);
        ye1.A(64, iArr3, iArr2);
        ye1.r(iArr2, iArr3, iArr2);
        ye1.A(62, iArr2, iArr2);
        ye1.z(iArr2, iArr3);
        if (yv2.s(iArr, iArr3)) {
            return new an1(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[6];
        ye1.z(this.k, iArr);
        return new an1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[6];
        if (yv2.b(this.k, ((an1) r93Var).k, iArr) != 0 || (iArr[5] == -1 && yv2.B(iArr, ye1.c))) {
            ye1.f(iArr);
        }
        return new an1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[6];
        ye1.C(this.k, ((an1) r93Var).k, iArr);
        return new an1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof an1) {
            return yv2.s(this.k, ((an1) obj).k);
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
        if (kv.I(6, this.k, iArr) != 0 || (iArr[5] == -1 && yv2.B(iArr, ye1.c))) {
            ye1.f(iArr);
        }
        return new an1(iArr);
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
        x91.A(ye1.c, ((an1) r93Var).k, iArr);
        ye1.r(iArr, this.k, iArr);
        return new an1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
