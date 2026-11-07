package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jt2 {
    public static final jt2 f = new jt2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public jt2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static jt2 e() {
        return new jt2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iT;
        int iR;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iW = ck1.w(i4 << 3, 8, iW);
                } else if (i5 == 2) {
                    iW = tr2.n(i4, (jr2) this.c[i2]) + iW;
                } else if (i5 == 3) {
                    iT = tr2.s(i4) << 1;
                    iR = ((jt2) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(ks2.a());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iW = ck1.w(i4 << 3, 4, iW);
                }
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iT = tr2.t(i4 << 3);
                iR = tr2.r(jLongValue);
            }
            iW = iR + iT + iW;
        }
        this.d = iW;
        return iW;
    }

    public final void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            uq1.k();
            return;
        }
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(pv2 pv2Var) {
        if (this.a == 0) {
            return;
        }
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            tr2 tr2Var = (tr2) pv2Var.a;
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                tr2Var.l(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                tr2Var.d(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                tr2Var.f(i3, (jr2) obj);
            } else if (i4 == 3) {
                tr2Var.p(i3, 3);
                ((jt2) obj).d(pv2Var);
                tr2Var.p(i3, 4);
            } else {
                if (i4 != 5) {
                    sm0.n(ks2.a());
                    return;
                }
                tr2Var.c(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jt2)) {
            return false;
        }
        jt2 jt2Var = (jt2) obj;
        int i = this.a;
        if (i == jt2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = jt2Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = jt2Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
