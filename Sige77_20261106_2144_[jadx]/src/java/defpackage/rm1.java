package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rm1 extends r93 {
    public static final BigInteger l = qm1.i;
    public int[] k;

    public rm1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[4];
        x91.A(sp0.b, this.k, iArr);
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return am2.F(this.k);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return am2.G(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[4];
        sp0.w(this.k, ((rm1) r93Var).k, iArr);
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[4];
        int[] iArr2 = this.k;
        if (am2.G(iArr2)) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        } else {
            am2.V(sp0.b, iArr2, iArr);
        }
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (am2.G(iArr) || am2.F(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        sp0.F(iArr, iArr2);
        sp0.w(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        sp0.G(2, iArr2, iArr3);
        sp0.w(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        sp0.G(4, iArr3, iArr4);
        sp0.w(iArr4, iArr3, iArr4);
        sp0.G(2, iArr4, iArr3);
        sp0.w(iArr3, iArr2, iArr3);
        sp0.G(10, iArr3, iArr2);
        sp0.w(iArr2, iArr3, iArr2);
        sp0.G(10, iArr2, iArr4);
        sp0.w(iArr4, iArr3, iArr4);
        sp0.F(iArr4, iArr3);
        sp0.w(iArr3, iArr, iArr3);
        sp0.G(95, iArr3, iArr3);
        sp0.F(iArr3, iArr4);
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr4[i]) {
                return null;
            }
        }
        return new rm1(iArr3);
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[4];
        sp0.F(this.k, iArr);
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[4];
        sp0.b(this.k, ((rm1) r93Var).k, iArr);
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[4];
        sp0.I(this.k, ((rm1) r93Var).k, iArr);
        return new rm1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        int[] iArr = this.k;
        int[] iArr2 = ((rm1) obj).k;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return (this.k[0] & 1) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[4];
        if (kv.I(4, this.k, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && am2.B(iArr, sp0.b))) {
            sp0.c(iArr);
        }
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        int[] iArr = this.k;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                sp0.r(bArr, i2, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return z32.r(this.k, 4) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[4];
        x91.A(sp0.b, ((rm1) r93Var).k, iArr);
        sp0.w(iArr, this.k, iArr);
        return new rm1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
