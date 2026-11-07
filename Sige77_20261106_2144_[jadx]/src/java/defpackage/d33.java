package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class d33 implements Iterable, Serializable {
    public static final d33 c = new d33(w33.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i = q23.a;
    }

    public d33(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            e.c(ts.g(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            e.c(ts.i("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        e.c(ts.i("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static d33 h(byte[] bArr, int i) {
        g(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new d33(bArr2);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public byte b(int i) {
        return this.b[i];
    }

    public int c() {
        return 0;
    }

    public int d() {
        return this.b.length;
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d33) && d() == ((d33) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof d33)) {
                return obj.equals(this);
            }
            d33 d33Var = (d33) obj;
            int i = this.a;
            int i2 = d33Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iD = d();
                if (iD > d33Var.d()) {
                    tv2.b(iD, d());
                    return false;
                }
                if (iD > d33Var.d()) {
                    e.g(ts.i("Ran off end of other: 0, ", iD, d33Var.d(), ", "));
                    return false;
                }
                byte[] bArr = d33Var.b;
                int iC = c() + iD;
                int iC2 = c();
                int iC3 = d33Var.c();
                while (iC2 < iC) {
                    if (this.b[iC2] == bArr[iC3]) {
                        iC2++;
                        iC3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final ByteArrayInputStream f() {
        return new ByteArrayInputStream(this.b, c(), d());
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iD = d();
        int iC = c();
        byte[] bArr = w33.a;
        int i2 = iD;
        for (int i3 = iC; i3 < iC + iD; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public final byte[] i() {
        int iD = d();
        if (iD == 0) {
            return w33.a;
        }
        byte[] bArr = new byte[iD];
        e(bArr, iD);
        return bArr;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new nj(this);
    }

    public final String toString() {
        d33 y23Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            strConcat = yv2.X(this);
        } else {
            int iG = g(0, 47, d());
            if (iG == 0) {
                y23Var = c;
            } else {
                y23Var = new y23(this.b, c(), iG);
            }
            strConcat = yv2.X(y23Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iD);
        sb.append(" contents=\"");
        return ts.l(sb, strConcat, "\">");
    }
}
