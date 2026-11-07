package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vk1 extends r93 {
    public static final BigInteger l = uk1.i;
    public int[] k;

    public vk1(int[] iArr) {
        this.k = iArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        int[] iArr = new int[8];
        x91.A(aj0.b, this.k, iArr);
        return new vk1(iArr);
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
        aj0.z(this.k, ((vk1) r93Var).k, iArr);
        return new vk1(iArr);
    }

    @Override // defpackage.r93
    public final r93 R() {
        int[] iArr = new int[8];
        int[] iArr2 = this.k;
        if (r93.J(iArr2)) {
            r93.l0(iArr);
        } else {
            r93.b0(aj0.b, iArr2, iArr);
        }
        return new vk1(iArr);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int[] iArr = this.k;
        if (r93.J(iArr) || r93.G(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        aj0.Q(iArr, iArr2);
        aj0.z(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        aj0.R(2, iArr2, iArr3);
        aj0.z(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        aj0.R(2, iArr3, iArr4);
        aj0.z(iArr4, iArr2, iArr4);
        aj0.R(6, iArr4, iArr2);
        aj0.z(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        aj0.R(12, iArr2, iArr5);
        aj0.z(iArr5, iArr2, iArr5);
        aj0.R(6, iArr5, iArr2);
        aj0.z(iArr2, iArr4, iArr2);
        aj0.Q(iArr2, iArr4);
        aj0.z(iArr4, iArr, iArr4);
        aj0.R(31, iArr4, iArr5);
        aj0.z(iArr5, iArr4, iArr2);
        aj0.R(32, iArr5, iArr5);
        aj0.z(iArr5, iArr2, iArr5);
        aj0.R(62, iArr5, iArr5);
        aj0.z(iArr5, iArr2, iArr5);
        aj0.R(4, iArr5, iArr5);
        aj0.z(iArr5, iArr3, iArr5);
        aj0.R(32, iArr5, iArr5);
        aj0.z(iArr5, iArr, iArr5);
        aj0.R(62, iArr5, iArr5);
        aj0.Q(iArr5, iArr3);
        if (r93.q(iArr, iArr3)) {
            return new vk1(iArr5);
        }
        return null;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int[] iArr = new int[8];
        aj0.Q(this.k, iArr);
        return new vk1(iArr);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        int[] iArr = new int[8];
        aj0.b(this.k, ((vk1) r93Var).k, iArr);
        return new vk1(iArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        int[] iArr = new int[8];
        aj0.S(this.k, ((vk1) r93Var).k, iArr);
        return new vk1(iArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vk1) {
            return r93.q(this.k, ((vk1) obj).k);
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
        if (kv.I(8, this.k, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && r93.x(iArr, aj0.b))) {
            aj0.c(iArr);
        }
        return new vk1(iArr);
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
        x91.A(aj0.b, ((vk1) r93Var).k, iArr);
        aj0.z(iArr, this.k, iArr);
        return new vk1(iArr);
    }

    @Override // defpackage.r93
    public final int v() {
        return l.bitLength();
    }
}
