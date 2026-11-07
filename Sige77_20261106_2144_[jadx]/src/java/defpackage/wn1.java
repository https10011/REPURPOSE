package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wn1 extends r93 {
    public final long[] k;

    public wn1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            e.g("x value invalid for SecT571FieldElement");
            throw null;
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            sm0.a();
            throw null;
        }
        long[] jArr = new long[9];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        kv.Y(jArr, 0);
        this.k = jArr;
    }

    @Override // defpackage.r93
    public final r93 D() {
        long[] jArr = new long[9];
        long[] jArr2 = this.k;
        if (dw0.p(jArr2)) {
            uq1.n();
            return null;
        }
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        kv.d0(jArr2, jArr5);
        kv.d0(jArr5, jArr3);
        kv.d0(jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(2, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.R(jArr3, jArr5, jArr3);
        kv.e0(5, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(5, jArr4, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(15, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr5);
        kv.e0(30, jArr5, jArr3);
        kv.e0(30, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(60, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(60, jArr4, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(180, jArr3, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.e0(180, jArr4, jArr4);
        kv.R(jArr3, jArr4, jArr3);
        kv.R(jArr3, jArr5, jArr);
        return new wn1(jArr);
    }

    @Override // defpackage.r93
    public final boolean F() {
        long[] jArr = this.k;
        if (jArr[0] == 1) {
            for (int i = 1; i < 9; i++) {
                if (jArr[i] == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r93
    public final boolean I() {
        return dw0.p(this.k);
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        long[] jArr = new long[9];
        kv.R(this.k, ((wn1) r93Var).k, jArr);
        return new wn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        long[] jArr = ((wn1) r93Var).k;
        long[] jArr2 = ((wn1) r93Var2).k;
        long[] jArr3 = ((wn1) r93Var3).k;
        long[] jArr4 = new long[18];
        kv.S(this.k, jArr, jArr4);
        kv.S(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        kv.X(jArr4, jArr5);
        return new wn1(jArr5);
    }

    @Override // defpackage.r93
    public final r93 W() {
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr4 = this.k;
            if (i >= 4) {
                long jU = bj0.u(jArr4[i2]);
                jArr2[4] = jU & 4294967295L;
                jArr3[4] = jU >>> 32;
                kv.R(jArr3, kv.c, jArr);
                kv.c(jArr, jArr2, jArr);
                return new wn1(jArr);
            }
            int i3 = i2 + 1;
            long jU2 = bj0.u(jArr4[i2]);
            i2 += 2;
            long jU3 = bj0.u(jArr4[i3]);
            jArr2[i] = (jU2 & 4294967295L) | (jU3 << 32);
            jArr3[i] = (jU2 >>> 32) | ((-4294967296L) & jU3);
            i++;
        }
    }

    @Override // defpackage.r93
    public final r93 X() {
        long[] jArr = new long[9];
        kv.d0(this.k, jArr);
        return new wn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        long[] jArr = ((wn1) r93Var).k;
        long[] jArr2 = ((wn1) r93Var2).k;
        long[] jArr3 = new long[18];
        long[] jArr4 = new long[18];
        kv.H(this.k, jArr4);
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr3[i] ^ jArr4[i];
        }
        kv.S(jArr, jArr2, jArr3);
        long[] jArr5 = new long[9];
        kv.X(jArr3, jArr5);
        return new wn1(jArr5);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        long[] jArr = new long[9];
        kv.c(this.k, ((wn1) r93Var).k, jArr);
        return new wn1(jArr);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wn1)) {
            return false;
        }
        long[] jArr = ((wn1) obj).k;
        for (int i = 8; i >= 0; i--) {
            if (this.k[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final boolean f0() {
        return (this.k[0] & 1) != 0;
    }

    @Override // defpackage.r93
    public final r93 g() {
        long[] jArr = new long[9];
        long[] jArr2 = this.k;
        jArr[0] = jArr2[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr[i] = jArr2[i];
        }
        return new wn1(jArr);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = this.k[i];
            if (j != 0) {
                sp0.v((8 - i) << 3, j, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final int hashCode() {
        return z32.s(this.k, 9) ^ 5711052;
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return 571;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }

    public wn1(long[] jArr) {
        this.k = jArr;
    }
}
