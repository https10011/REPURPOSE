package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vb3 {
    public static final vb3 b;
    public final zo0 a;

    static {
        int i = zo0.f;
        b = new vb3(nh1.v);
    }

    public vb3(zo0 zo0Var) {
        this.a = zo0Var;
    }

    public static vb3 a(ll2 ll2Var) throws xm2 {
        String strW;
        long j;
        ub3 ub3Var;
        int iG = ll2Var.G();
        if (iG < 0) {
            tv2.i("Negative number of flags");
            return null;
        }
        int i = zo0.f;
        xo0 xo0Var = new xo0(n61.a);
        long j2 = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            long jH = ll2Var.H();
            int i3 = (int) jH;
            long j3 = jH >>> 3;
            if (j3 == 0) {
                j = 0;
                strW = ll2Var.w();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    tv2.i("Flag name larger than max size");
                    return null;
                }
                strW = null;
                j = j4;
            }
            int i4 = i3 & 7;
            if (i4 == 0 || i4 == 1) {
                ub3Var = new ub3(j, strW, i4, 0L, null);
            } else if (i4 == 2) {
                ub3Var = new ub3(j, strW, i4, ll2Var.H(), null);
            } else if (i4 == 3) {
                ub3Var = new ub3(j, strW, i4, Double.doubleToRawLongBits(ll2Var.o()), null);
            } else if (i4 == 4) {
                ub3Var = new ub3(j, strW, i4, 0L, ll2Var.w());
            } else {
                if (i4 != 5) {
                    tv2.i(ck1.s(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                    return null;
                }
                ub3Var = new ub3(j, strW, i4, 0L, ll2Var.z());
            }
            long j5 = ub3Var.a;
            if (j5 != 0) {
                j2 = j5;
            }
            xo0Var.a(ub3Var);
        }
        return new vb3(xo0Var.e());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vb3)) {
            return false;
        }
        return this.a.equals(((vb3) obj).a);
    }

    public final int hashCode() {
        zo0 zo0Var = this.a;
        zo0Var.getClass();
        return r93.y(zo0Var);
    }
}
