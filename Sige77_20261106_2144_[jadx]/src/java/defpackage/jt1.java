package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jt1 {
    public static final jt1 e = new jt1(fy1.b, 0, 0, 0);
    public final int a;
    public final fy1 b;
    public final int c;
    public final int d;

    public jt1(fy1 fy1Var, int i, int i2, int i3) {
        this.b = fy1Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public final jt1 a(int i) {
        int i2;
        fy1 xq1Var = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = fm0.b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xq1Var.getClass();
            i4 += i7;
            xq1Var = new xq1(xq1Var, i6, i7);
        }
        int i8 = this.c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        jt1 jt1Var = new jt1(xq1Var, i3, i9, i4 + i2);
        return i9 == 2078 ? jt1Var.b(i + 1) : jt1Var;
    }

    public final jt1 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        fy1 fy1Var = this.b;
        fy1Var.getClass();
        return new jt1(new fh(fy1Var, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(jt1 jt1Var) {
        int i;
        int i2 = this.d + (fm0.b[this.a][jt1Var.a] >> 16);
        int i3 = jt1Var.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= jt1Var.d;
    }

    public final jt1 d(int i, int i2) {
        int i3 = this.d;
        fy1 xq1Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = fm0.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xq1Var.getClass();
            i3 += i7;
            xq1Var = new xq1(xq1Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        xq1Var.getClass();
        return new jt1(new xq1(xq1Var, i2, i8), i, 0, i3 + i8);
    }

    public final jt1 e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = fm0.d[i3][i];
        fy1 fy1Var = this.b;
        fy1Var.getClass();
        return new jt1(new xq1(new xq1(fy1Var, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", fm0.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
