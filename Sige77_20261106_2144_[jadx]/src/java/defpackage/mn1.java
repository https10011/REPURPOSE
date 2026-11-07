package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mn1 extends r93 {
    public static final BigInteger l = ln1.i;
    public int[] k;

    public mn1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[17];
        x91.A(g93.d, this.k, iArr);
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return kv.P(this.k, 17);
    }

    @Override // defpackage.r93
    public final boolean I() {
        return kv.Q(this.k, 17);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int[] iArr = new int[17];
        g93.z(this.k, ((mn1) r93Var).k, iArr);
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[17];
        int[] iArr2 = this.k;
        if (kv.Q(iArr2, 17)) {
            for (int i = 0; i < 17; i++) {
                iArr[i] = 0;
            }
        } else {
            kv.f0(17, g93.d, iArr2, iArr);
        }
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (kv.Q(iArr, 17) || kv.P(iArr, 17)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int[] iArr4 = new int[33];
        g93.t(iArr, iArr4);
        g93.B(iArr4, iArr2);
        int i = 519;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            g93.t(iArr2, iArr4);
            g93.B(iArr4, iArr2);
        }
        g93.E(iArr2, iArr3);
        if (kv.p(17, iArr, iArr3)) {
            return new mn1(iArr2);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[17];
        g93.E(this.k, iArr);
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[17];
        g93.d(this.k, ((mn1) r93Var).k, iArr);
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[17];
        g93.H(this.k, ((mn1) r93Var).k, iArr);
        return new mn1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mn1) {
            return kv.p(17, this.k, ((mn1) obj).k);
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return kv.u(this.k) == 1;
    }

    @Override // defpackage.r93
    public final r93 g() {
        int[] iArr = new int[17];
        int[] iArr2 = this.k;
        int I = kv.I(16, iArr2, iArr) + iArr2[16];
        if (I > 511 || (I == 511 && kv.p(16, iArr, g93.d))) {
            I = (kv.J(iArr) + I) & 511;
        }
        iArr[16] = I;
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return kv.j0(this.k, 17);
    }

    public final int hashCode() {
        return z32.r(this.k, 17) ^ l.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        int[] iArr = new int[17];
        x91.A(g93.d, ((mn1) r93Var).k, iArr);
        g93.z(iArr, this.k, iArr);
        return new mn1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
