package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class qj implements Iterable, Serializable {
    public static final qj c = new qj(dr0.b);
    public static final pj d;
    public int a = 0;
    public final byte[] b;

    static {
        d = l6.a() ? new u41(4) : new c11(4);
    }

    public qj(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int b(int i, int i2, int i3) {
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

    public static qj c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new qj(d.b(bArr, i, i2));
    }

    public byte a(int i) {
        return this.b[i];
    }

    public void d(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof qj) && size() == ((qj) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof qj)) {
                return obj.equals(this);
            }
            qj qjVar = (qj) obj;
            int i = this.a;
            int i2 = qjVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > qjVar.size()) {
                    tv2.b(size, size());
                    return false;
                }
                if (size > qjVar.size()) {
                    StringBuilder sbU = ck1.u(size, "Ran off end of other: 0, ", ", ");
                    sbU.append(qjVar.size());
                    throw new IllegalArgumentException(sbU.toString());
                }
                byte[] bArr = qjVar.b;
                int iE = e() + size;
                int iE2 = e();
                int iE3 = qjVar.e();
                while (iE2 < iE) {
                    if (this.b[iE2] == bArr[iE3]) {
                        iE2++;
                        iE3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iE = e();
        int i2 = size;
        for (int i3 = iE; i3 < iE + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new nj(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = yi0.j(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = yi0.j(iB == 0 ? c : new oj(this.b, e(), iB)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return ts.l(sb, strConcat, "\">");
    }
}
