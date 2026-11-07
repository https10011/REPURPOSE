package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jr2 implements Serializable, Iterable {
    public static final nr2 b = new nr2(ds2.a);
    public static final c11 c = new c11(11);
    public int a;

    public static int c(int i, int i2, int i3) {
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

    public static nr2 e(byte[] bArr, int i, int i2) {
        try {
            return i(bArr, i, i2);
        } catch (ks2 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* synthetic */ boolean g(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        c(i, i4, bArr.length);
        c(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static nr2 i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        c(i, i + i2, bArr.length);
        c.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new nr2(bArr2);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract mr2 d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jr2)) {
            return false;
        }
        jr2 jr2Var = (jr2) obj;
        int iB = b();
        if (iB != jr2Var.b()) {
            return false;
        }
        if (iB == 0) {
            return true;
        }
        int i = this.a;
        int i2 = jr2Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return h(jr2Var);
        }
        return false;
    }

    public abstract void f(byte[] bArr, int i);

    public abstract boolean h(jr2 jr2Var);

    public final int hashCode() {
        int iL = this.a;
        if (iL == 0) {
            int iB = b();
            iL = l(iB, iB);
            if (iL == 0) {
                iL = 1;
            }
            this.a = iL;
        }
        return iL;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new nj(this);
    }

    public abstract void k(tr2 tr2Var);

    public abstract int l(int i, int i2);

    public abstract or2 m();

    public final byte[] o() {
        int iB = b();
        if (iB == 0) {
            return ds2.a;
        }
        byte[] bArr = new byte[iB];
        f(bArr, iB);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iB = b();
        String strO0 = b() <= 50 ? r93.o0(o()) : r93.o0(d(0, 47).o()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iB);
        sb.append(" contents=\"");
        return ts.l(sb, strO0, "\">");
    }
}
