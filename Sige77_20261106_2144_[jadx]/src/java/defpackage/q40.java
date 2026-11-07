package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q40 extends r93 {
    public final BigInteger k;
    public final BigInteger l;
    public final BigInteger m;

    public q40(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            e.g("x value invalid in Fp field element");
            throw null;
        }
        this.k = bigInteger;
        this.l = bigInteger2;
        this.m = bigInteger3;
    }

    @Override // defpackage.r93
    public final r93 D() {
        BigInteger bigInteger = this.k;
        int iBitLength = bigInteger.bitLength();
        int i = (iBitLength + 31) >> 5;
        int[] iArr = new int[i];
        x91.A(kv.r(iBitLength, bigInteger), kv.r(iBitLength, this.m), iArr);
        return new q40(bigInteger, this.l, kv.j0(iArr, i));
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        return new q40(this.k, this.l, r0(this.m, r93Var.g0()));
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return new q40(this.k, this.l, s0(this.m.multiply(r93Var.g0()).subtract(r93Var2.g0().multiply(r93Var3.g0()))));
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return new q40(this.k, this.l, s0(this.m.multiply(r93Var.g0()).add(r93Var2.g0().multiply(r93Var3.g0()))));
    }

    @Override // defpackage.r93
    public final r93 R() {
        BigInteger bigInteger = this.m;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.l;
        BigInteger bigInteger3 = this.k;
        return new q40(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }

    @Override // defpackage.r93
    public final r93 W() {
        r93 r93Var;
        int i;
        BigInteger bigInteger;
        if (I() || F()) {
            return this;
        }
        BigInteger bigInteger2 = this.k;
        int i2 = 0;
        r93 r93Var2 = null;
        if (!bigInteger2.testBit(0)) {
            uq1.m("not done yet");
            return null;
        }
        int i3 = 1;
        boolean zTestBit = bigInteger2.testBit(1);
        BigInteger bigInteger3 = this.l;
        BigInteger bigInteger4 = this.m;
        BigInteger bigInteger5 = l40.b;
        if (zTestBit) {
            q40 q40Var = new q40(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
            if (q40Var.X().equals(this)) {
                return q40Var;
            }
            return null;
        }
        boolean zTestBit2 = bigInteger2.testBit(2);
        BigInteger bigIntegerS0 = l40.c;
        if (zTestBit2) {
            BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
            BigInteger bigIntegerR0 = r0(bigIntegerModPow, bigInteger4);
            if (r0(bigIntegerR0, bigIntegerModPow).equals(bigInteger5)) {
                q40 q40Var2 = new q40(bigInteger2, bigInteger3, bigIntegerR0);
                if (q40Var2.X().equals(this)) {
                    return q40Var2;
                }
                return null;
            }
            q40 q40Var3 = new q40(bigInteger2, bigInteger3, s0(bigIntegerR0.multiply(bigIntegerS0.modPow(bigInteger2.shiftRight(2), bigInteger2))));
            if (q40Var3.X().equals(this)) {
                return q40Var3;
            }
            return null;
        }
        BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(1);
        if (!bigInteger4.modPow(bigIntegerShiftRight, bigInteger2).equals(bigInteger5)) {
            return null;
        }
        BigInteger bigIntegerShiftLeft = bigInteger4.shiftLeft(1);
        if (bigIntegerShiftLeft.compareTo(bigInteger2) >= 0) {
            bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(bigInteger2);
        }
        BigInteger bigIntegerShiftLeft2 = bigIntegerShiftLeft.shiftLeft(1);
        if (bigIntegerShiftLeft2.compareTo(bigInteger2) >= 0) {
            bigIntegerShiftLeft2 = bigIntegerShiftLeft2.subtract(bigInteger2);
        }
        BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger5);
        BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger5);
        Random random = new Random();
        while (true) {
            BigInteger bigInteger6 = new BigInteger(bigInteger2.bitLength(), random);
            if (bigInteger6.compareTo(bigInteger2) >= 0 || !s0(bigInteger6.multiply(bigInteger6).subtract(bigIntegerShiftLeft2)).modPow(bigIntegerShiftRight, bigInteger2).equals(bigIntegerSubtract)) {
                r93Var = r93Var2;
                i = i2;
                i2 = i;
                r93Var2 = r93Var;
            } else {
                int iBitLength = bigIntegerAdd.bitLength();
                r93Var = r93Var2;
                int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                int i4 = iBitLength - i3;
                int i5 = i2;
                BigInteger bigInteger7 = bigIntegerShiftRight;
                BigInteger bigIntegerR1 = bigInteger5;
                BigInteger bigIntegerR2 = bigIntegerR1;
                BigInteger bigInteger8 = bigIntegerR2;
                BigInteger bigInteger9 = bigIntegerS0;
                Random random2 = random;
                BigInteger bigIntegerS1 = bigInteger6;
                while (true) {
                    bigInteger = bigIntegerSubtract;
                    if (i4 < lowestSetBit + 1) {
                        break;
                    }
                    bigIntegerR1 = r0(bigIntegerR1, bigIntegerR2);
                    if (bigIntegerAdd.testBit(i4)) {
                        bigIntegerR2 = r0(bigIntegerR1, bigInteger4);
                        BigInteger bigIntegerR3 = r0(bigInteger8, bigIntegerS1);
                        bigIntegerS0 = s0(bigIntegerS1.multiply(bigIntegerS0).subtract(bigInteger6.multiply(bigIntegerR1)));
                        bigIntegerS1 = s0(bigIntegerS1.multiply(bigIntegerS1).subtract(bigIntegerR2.shiftLeft(1)));
                        bigInteger8 = bigIntegerR3;
                    } else {
                        BigInteger bigIntegerS2 = s0(bigInteger8.multiply(bigIntegerS0).subtract(bigIntegerR1));
                        BigInteger bigIntegerS3 = s0(bigIntegerS1.multiply(bigIntegerS0).subtract(bigInteger6.multiply(bigIntegerR1)));
                        bigIntegerS0 = s0(bigIntegerS0.multiply(bigIntegerS0).subtract(bigIntegerR1.shiftLeft(1)));
                        bigIntegerS1 = bigIntegerS3;
                        bigInteger8 = bigIntegerS2;
                        bigIntegerR2 = bigIntegerR1;
                    }
                    i4--;
                    bigIntegerSubtract = bigInteger;
                }
                BigInteger bigIntegerR4 = r0(bigIntegerR1, bigIntegerR2);
                BigInteger bigIntegerR5 = r0(bigIntegerR4, bigInteger4);
                BigInteger bigIntegerS4 = s0(bigInteger8.multiply(bigIntegerS0).subtract(bigIntegerR4));
                BigInteger bigIntegerS5 = s0(bigIntegerS1.multiply(bigIntegerS0).subtract(bigInteger6.multiply(bigIntegerR4)));
                BigInteger bigIntegerS6 = s0(bigIntegerR4.multiply(bigIntegerR5));
                for (int i6 = 1; i6 <= lowestSetBit; i6++) {
                    bigIntegerS4 = r0(bigIntegerS4, bigIntegerS5);
                    bigIntegerS5 = s0(bigIntegerS5.multiply(bigIntegerS5).subtract(bigIntegerS6.shiftLeft(1)));
                    bigIntegerS6 = s0(bigIntegerS6.multiply(bigIntegerS6));
                }
                BigInteger[] bigIntegerArr = {bigIntegerS4, bigIntegerS5};
                BigInteger bigInteger10 = bigIntegerArr[i5];
                BigInteger bigIntegerSubtract2 = bigIntegerArr[1];
                if (r0(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerShiftLeft2)) {
                    if (bigIntegerSubtract2.testBit(i5)) {
                        bigIntegerSubtract2 = bigInteger2.subtract(bigIntegerSubtract2);
                    }
                    return new q40(bigInteger2, bigInteger3, bigIntegerSubtract2.shiftRight(1));
                }
                i = i5;
                if (bigInteger10.equals(bigInteger5)) {
                    i2 = i;
                    i3 = 1;
                    r93Var2 = r93Var;
                    bigIntegerShiftRight = bigInteger7;
                    bigIntegerS0 = bigInteger9;
                    random = random2;
                    bigIntegerSubtract = bigInteger;
                } else {
                    if (!bigInteger10.equals(bigInteger)) {
                        return r93Var;
                    }
                    i3 = 1;
                    bigIntegerShiftRight = bigInteger7;
                    bigIntegerS0 = bigInteger9;
                    random = random2;
                    bigIntegerSubtract = bigInteger;
                    i2 = i;
                    r93Var2 = r93Var;
                }
            }
        }
    }

    @Override // defpackage.r93
    public final r93 X() {
        BigInteger bigInteger = this.m;
        return new q40(this.k, this.l, r0(bigInteger, bigInteger));
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        BigInteger bigIntegerG0 = r93Var.g0();
        BigInteger bigIntegerG1 = r93Var2.g0();
        BigInteger bigInteger = this.m;
        return new q40(this.k, this.l, s0(bigInteger.multiply(bigInteger).add(bigIntegerG0.multiply(bigIntegerG1))));
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        BigInteger bigIntegerAdd = this.m.add(r93Var.g0());
        BigInteger bigInteger = this.k;
        if (bigIntegerAdd.compareTo(bigInteger) >= 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(bigInteger);
        }
        return new q40(bigInteger, this.l, bigIntegerAdd);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        BigInteger bigIntegerSubtract = this.m.subtract(r93Var.g0());
        int iSignum = bigIntegerSubtract.signum();
        BigInteger bigInteger = this.k;
        if (iSignum < 0) {
            bigIntegerSubtract = bigIntegerSubtract.add(bigInteger);
        }
        return new q40(bigInteger, this.l, bigIntegerSubtract);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return this.k.equals(q40Var.k) && this.m.equals(q40Var.m);
    }

    @Override // defpackage.r93
    public final r93 g() {
        BigInteger bigIntegerAdd = this.m.add(l40.b);
        BigInteger bigInteger = this.k;
        if (bigIntegerAdd.compareTo(bigInteger) == 0) {
            bigIntegerAdd = l40.a;
        }
        return new q40(bigInteger, this.l, bigIntegerAdd);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode() ^ this.k.hashCode();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        BigInteger bigIntegerG0 = r93Var.g0();
        BigInteger bigInteger = this.k;
        int iBitLength = bigInteger.bitLength();
        int i = (iBitLength + 31) >> 5;
        int[] iArrR = kv.r(iBitLength, bigInteger);
        int[] iArrR2 = kv.r(iBitLength, bigIntegerG0);
        int[] iArr = new int[i];
        x91.A(iArrR, iArrR2, iArr);
        return new q40(bigInteger, this.l, r0(this.m, kv.j0(iArr, i)));
    }

    public final BigInteger r0(BigInteger bigInteger, BigInteger bigInteger2) {
        return s0(bigInteger.multiply(bigInteger2));
    }

    public final BigInteger s0(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.k;
        BigInteger bigInteger3 = this.l;
        if (bigInteger3 == null) {
            return bigInteger.mod(bigInteger2);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        int iBitLength = bigInteger2.bitLength();
        boolean zEquals = bigInteger3.equals(l40.b);
        while (bigInteger.bitLength() > iBitLength + 1) {
            BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
            if (!zEquals) {
                bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger3);
            }
            bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
        }
        while (bigInteger.compareTo(bigInteger2) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger2);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
    }

    @Override // defpackage.r93
    public final int v() {
        return this.k.bitLength();
    }
}
