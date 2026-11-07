package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p40 extends r93 {
    public int k;
    public int l;
    public int[] m;
    public p01 n;

    public p40(int i, int[] iArr, p01 p01Var) {
        this.l = i;
        this.k = iArr.length == 1 ? 2 : 3;
        this.m = iArr;
        this.n = p01Var;
    }

    public static void r0(r93 r93Var, r93 r93Var2) {
        if (!(r93Var instanceof p40) || !(r93Var2 instanceof p40)) {
            e.g("Field elements are not both instances of ECFieldElement.F2m");
            return;
        }
        p40 p40Var = (p40) r93Var;
        p40 p40Var2 = (p40) r93Var2;
        if (p40Var.k != p40Var2.k) {
            e.g("One of the F2m field elements has incorrect representation");
        } else {
            if (p40Var.l == p40Var2.l && z32.e(p40Var.m, p40Var2.m)) {
                return;
            }
            e.g("Field elements are not elements of the same field F2m");
        }
    }

    @Override // defpackage.r93
    public final r93 D() {
        int i;
        int i2 = this.l;
        int[] iArr = this.m;
        p01 p01Var = this.n;
        int i3 = p01Var.i();
        if (i3 == 0) {
            uq1.n();
            return null;
        }
        int i4 = 1;
        if (i3 != 1) {
            p01 p01Var2 = (p01) p01Var.clone();
            int i5 = (i2 + 63) >>> 6;
            p01 p01Var3 = new p01(i5);
            long[] jArr = p01Var3.a;
            p01.k(jArr, i2);
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                p01.k(jArr, iArr[length]);
            }
            int iJ = 0;
            p01.k(jArr, 0);
            p01 p01Var4 = new p01(i5);
            p01Var4.a[0] = 1;
            p01 p01Var5 = new p01(i5);
            int[] iArr2 = new int[2];
            iArr2[0] = i3;
            iArr2[1] = i2 + 1;
            p01[] p01VarArr = {p01Var2, p01Var3};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            p01[] p01VarArr2 = {p01Var4, p01Var5};
            int i6 = iArr2[1];
            int i7 = i6 - iArr2[0];
            while (true) {
                if (i7 < 0) {
                    i7 = -i7;
                    iArr2[i4] = i6;
                    iArr3[i4] = iJ;
                    i4 = 1 - i4;
                    i6 = iArr2[i4];
                    iJ = iArr3[i4];
                }
                i = 1 - i4;
                p01VarArr[i4].d(p01VarArr[i], iArr2[i], i7);
                int iJ2 = p01VarArr[i4].j(i6);
                if (iJ2 == 0) {
                    break;
                }
                int i8 = iArr3[i];
                p01VarArr2[i4].d(p01VarArr2[i], i8, i7);
                int i9 = i8 + i7;
                if (i9 > iJ) {
                    iJ = i9;
                } else if (i9 == iJ) {
                    iJ = p01VarArr2[i4].j(iJ);
                }
                i7 += iJ2 - i6;
                i6 = iJ2;
            }
            p01Var = p01VarArr2[i];
        }
        return new p40(i2, iArr, p01Var);
    }

    @Override // defpackage.r93
    public final boolean F() {
        return this.n.p();
    }

    @Override // defpackage.r93
    public final boolean I() {
        for (long j : this.n.a) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r93
    public final r93 N(r93 r93Var) {
        int i;
        int i2 = this.l;
        int[] iArr = this.m;
        p01 p01Var = this.n;
        p01 p01Var2 = ((p40) r93Var).n;
        int i3 = p01Var.i();
        if (i3 != 0) {
            int i4 = p01Var2.i();
            if (i4 != 0) {
                if (i3 > i4) {
                    i4 = i3;
                    i3 = i4;
                } else {
                    p01Var2 = p01Var;
                    p01Var = p01Var2;
                }
                int i5 = (i3 + 63) >>> 6;
                int i6 = (i4 + 63) >>> 6;
                int i7 = ((i3 + i4) + 62) >>> 6;
                if (i5 == 1) {
                    long j = p01Var2.a[0];
                    if (j != 1) {
                        long[] jArr = new long[i7];
                        p01.r(j, p01Var.a, i6, jArr);
                        p01Var = new p01(jArr, p01.t(jArr, i7, i2, iArr));
                    }
                } else {
                    int i8 = (i4 + 70) >>> 6;
                    int[] iArr2 = new int[16];
                    int i9 = i8 << 4;
                    long[] jArr2 = new long[i9];
                    iArr2[1] = i8;
                    System.arraycopy(p01Var.a, 0, jArr2, i8, i6);
                    int i10 = 2;
                    int i11 = i8;
                    while (i10 < 16) {
                        int i12 = i11 + i8;
                        iArr2[i10] = i12;
                        if ((i10 & 1) == 0) {
                            p01.u(jArr2, i12 >>> 1, jArr2, i12, i8, 1);
                        } else {
                            int i13 = i12 - i8;
                            for (int i14 = 0; i14 < i8; i14++) {
                                jArr2[i12 + i14] = jArr2[i8 + i14] ^ jArr2[i13 + i14];
                            }
                        }
                        i10++;
                        i11 = i12;
                    }
                    long[] jArr3 = new long[i9];
                    p01.u(jArr2, 0, jArr3, 0, i9, 4);
                    long[] jArr4 = p01Var2.a;
                    int i15 = i7 << 3;
                    long[] jArr5 = new long[i15];
                    int i16 = 0;
                    while (i16 < i5) {
                        int i17 = i8;
                        int i18 = i16;
                        long j2 = jArr4[i16];
                        while (true) {
                            i = i15;
                            long j3 = j2;
                            int i19 = iArr2[((int) j2) & 15];
                            int i20 = iArr2[((int) (j3 >>> 4)) & 15];
                            i8 = i17;
                            for (int i21 = 0; i21 < i8; i21++) {
                                int i22 = i18 + i21;
                                jArr5[i22] = jArr5[i22] ^ (jArr2[i19 + i21] ^ jArr3[i20 + i21]);
                            }
                            long j4 = j3 >>> 8;
                            if (j4 == 0) {
                                break;
                            }
                            i18 += i7;
                            i17 = i8;
                            j2 = j4;
                            i15 = i;
                        }
                        i16++;
                        i15 = i;
                    }
                    while (true) {
                        int i23 = i15 - i7;
                        if (i23 == 0) {
                            break;
                        }
                        p01.g(jArr5, i23 - i7, jArr5, i23, i7, 8);
                        i15 = i23;
                    }
                    p01Var2 = new p01(jArr5, p01.t(jArr5, i7, i2, iArr));
                    p01Var = p01Var2;
                }
            } else {
                p01Var = p01Var2;
            }
        }
        return new p40(i2, iArr, p01Var);
    }

    @Override // defpackage.r93
    public final r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return Q(r93Var, r93Var2, r93Var3);
    }

    @Override // defpackage.r93
    public final r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        p01 p01Var = this.n;
        p01 p01Var2 = ((p40) r93Var).n;
        p01 p01Var3 = ((p40) r93Var2).n;
        p01 p01Var4 = ((p40) r93Var3).n;
        int i = this.l;
        int[] iArr = this.m;
        p01 p01VarQ = p01Var.q(p01Var2);
        p01 p01VarQ2 = p01Var3.q(p01Var4);
        if (p01VarQ == p01Var || p01VarQ == p01Var2) {
            p01VarQ = (p01) p01VarQ.clone();
        }
        p01VarQ.f(p01VarQ2);
        long[] jArr = p01VarQ.a;
        int iT = p01.t(jArr, jArr.length, i, iArr);
        if (iT < jArr.length) {
            long[] jArr2 = new long[iT];
            p01VarQ.a = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, iT);
        }
        return new p40(i, iArr, p01VarQ);
    }

    @Override // defpackage.r93
    public final r93 W() {
        int i;
        p01 p01Var = this.n;
        for (long j : p01Var.a) {
            if (j != 0) {
                if (p01Var.p() || (i = (i = this.l) - 1) < 1) {
                    break;
                    break;
                }
                int[] iArr = this.m;
                int iN = p01Var.n();
                if (iN != 0) {
                    int i2 = ((i + 63) >>> 6) << 1;
                    long[] jArr = new long[i2];
                    System.arraycopy(p01Var.a, 0, jArr, 0, iN);
                    while (true) {
                        int i3 = i3 - 1;
                        if (i3 < 0) {
                            break;
                        }
                        int i4 = iN << 1;
                        while (true) {
                            iN--;
                            if (iN >= 0) {
                                long j2 = jArr[iN];
                                jArr[i4 - 1] = p01.o((int) (j2 >>> 32));
                                i4 -= 2;
                                jArr[i4] = p01.o((int) j2);
                            }
                        }
                        iN = p01.t(jArr, i2, i, iArr);
                    }
                    p01Var = new p01(jArr, iN);
                }
                return new p40(i, iArr, p01Var);
            }
        }
        return this;
    }

    @Override // defpackage.r93
    public final r93 X() {
        int i = this.l;
        int[] iArr = this.m;
        p01 p01Var = this.n;
        int iN = p01Var.n();
        if (iN != 0) {
            int i2 = iN << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j = p01Var.a[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = p01.o((int) j);
                i3 += 2;
                jArr[i4] = p01.o((int) (j >>> 32));
            }
            p01Var = new p01(jArr, p01.t(jArr, i2, i, iArr));
        }
        return new p40(i, iArr, p01Var);
    }

    @Override // defpackage.r93
    public final r93 a0(r93 r93Var, r93 r93Var2) {
        p01 p01Var;
        int[] iArr = this.m;
        int i = this.l;
        p01 p01Var2 = this.n;
        p01 p01Var3 = ((p40) r93Var).n;
        p01 p01Var4 = ((p40) r93Var2).n;
        int iN = p01Var2.n();
        if (iN == 0) {
            p01Var = p01Var2;
        } else {
            int i2 = iN << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j = p01Var2.a[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = p01.o((int) j);
                i3 += 2;
                jArr[i4] = p01.o((int) (j >>> 32));
            }
            p01Var = new p01(jArr, i2);
        }
        p01 p01VarQ = p01Var3.q(p01Var4);
        if (p01Var == p01Var2) {
            p01Var = (p01) p01Var.clone();
        }
        p01Var.f(p01VarQ);
        long[] jArr2 = p01Var.a;
        int iT = p01.t(jArr2, jArr2.length, i, iArr);
        if (iT < jArr2.length) {
            long[] jArr3 = new long[iT];
            p01Var.a = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, iT);
        }
        return new p40(i, iArr, p01Var);
    }

    @Override // defpackage.r93
    public final r93 d(r93 r93Var) {
        p01 p01Var = (p01) this.n.clone();
        p01Var.f(((p40) r93Var).n);
        return new p40(this.l, this.m, p01Var);
    }

    @Override // defpackage.r93
    public final r93 e0(r93 r93Var) {
        return d(r93Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return this.l == p40Var.l && this.k == p40Var.k && z32.e(this.m, p40Var.m) && this.n.equals(p40Var.n);
    }

    @Override // defpackage.r93
    public final boolean f0() {
        long[] jArr = this.n.a;
        return jArr.length > 0 && (jArr[0] & 1) != 0;
    }

    @Override // defpackage.r93
    public final r93 g() {
        p01 p01Var;
        int i = this.l;
        int[] iArr = this.m;
        p01 p01Var2 = this.n;
        if (p01Var2.a.length == 0) {
            p01Var = new p01(new long[]{1});
        } else {
            int iMax = Math.max(1, p01Var2.n());
            long[] jArr = new long[iMax];
            long[] jArr2 = p01Var2.a;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
            jArr[0] = 1 ^ jArr[0];
            p01Var = new p01(jArr);
        }
        return new p40(i, iArr, p01Var);
    }

    @Override // defpackage.r93
    public final BigInteger g0() {
        p01 p01Var = this.n;
        int iN = p01Var.n();
        if (iN == 0) {
            return l40.a;
        }
        int i = iN - 1;
        long j = p01Var.a[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = iN - 2; i5 >= 0; i5--) {
            long j2 = p01Var.a[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.n.hashCode() ^ this.l;
        int[] iArr = this.m;
        if (iArr == null) {
            i = 0;
        } else {
            int length = iArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ iArr[length];
            }
            i = i2;
        }
        return i ^ iHashCode;
    }

    @Override // defpackage.r93
    public final int k() {
        return this.n.i();
    }

    @Override // defpackage.r93
    public final r93 p(r93 r93Var) {
        return N(r93Var.D());
    }

    @Override // defpackage.r93
    public final int v() {
        return this.l;
    }

    @Override // defpackage.r93
    public final r93 R() {
        return this;
    }
}
