package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n40 extends m40 {
    public int h;
    public int i;
    public int j;
    public int k;
    public u40 l;

    public n40(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.l = new u40(this, null, null, false, 0);
        this.b = f(bigInteger);
        this.c = f(bigInteger2);
        this.f = 6;
    }

    @Override // defpackage.m40
    public final m40 a() {
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        r93 r93Var = this.b;
        r93 r93Var2 = this.c;
        BigInteger bigInteger = this.d;
        BigInteger bigInteger2 = this.e;
        n40 n40Var = new n40(i, i2, i3, i4);
        n40Var.h = i;
        n40Var.i = i2;
        n40Var.j = i3;
        n40Var.k = i4;
        n40Var.d = bigInteger;
        n40Var.e = bigInteger2;
        n40Var.l = new u40(n40Var, null, null, false, 0);
        n40Var.b = r93Var;
        n40Var.c = r93Var2;
        n40Var.f = 6;
        return n40Var;
    }

    @Override // defpackage.m40
    public final t40 c(r93 r93Var, r93 r93Var2, boolean z) {
        return new u40(this, r93Var, r93Var2, z, 0);
    }

    @Override // defpackage.m40
    public final r93 f(BigInteger bigInteger) {
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        p40 p40Var = new p40();
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            e.g("x value invalid in F2m field element");
            return null;
        }
        if (i3 == 0 && i4 == 0) {
            p40Var.k = 2;
            p40Var.m = new int[]{i2};
        } else {
            if (i3 >= i4) {
                e.g("k2 must be smaller than k3");
                return null;
            }
            if (i3 <= 0) {
                e.g("k2 must be larger than 0");
                return null;
            }
            p40Var.k = 3;
            p40Var.m = new int[]{i2, i3, i4};
        }
        p40Var.l = i;
        p01 p01Var = new p01();
        if (bigInteger.signum() < 0) {
            e.g("invalid F2m field value");
            return null;
        }
        int i5 = 1;
        if (bigInteger.signum() == 0) {
            p01Var.a = new long[]{0};
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
            } else {
                i5 = 0;
            }
            int i6 = (length + 7) / 8;
            p01Var.a = new long[i6];
            int i7 = i6 - 1;
            int i8 = (length % 8) + i5;
            if (i5 < i8) {
                long j = 0;
                while (i5 < i8) {
                    j = (j << 8) | ((long) (byteArray[i5] & 255));
                    i5++;
                }
                p01Var.a[i7] = j;
                i7 = i6 - 2;
            }
            while (i7 >= 0) {
                int i9 = 0;
                long j2 = 0;
                while (i9 < 8) {
                    j2 = (j2 << 8) | ((long) (byteArray[i5] & 255));
                    i9++;
                    i5++;
                }
                p01Var.a[i7] = j2;
                i7--;
            }
        }
        p40Var.n = p01Var;
        return p40Var;
    }

    @Override // defpackage.m40
    public final int g() {
        return this.h;
    }

    @Override // defpackage.m40
    public final t40 h() {
        return this.l;
    }

    @Override // defpackage.m40
    public final boolean j(int i) {
        return i == 0 || i == 1 || i == 6;
    }

    public n40(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}
