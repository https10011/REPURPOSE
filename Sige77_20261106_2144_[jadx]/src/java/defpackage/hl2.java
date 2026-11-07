package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hl2 implements Iterable, Serializable {
    public static final gl2 b = new gl2(sm2.a);
    public int a;

    static {
        int i = yk2.a;
    }

    public static gl2 h(byte[] bArr, int i, int i2) {
        try {
            return i(bArr, i, i2);
        } catch (xm2 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static gl2 i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        l(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new gl2(bArr2);
    }

    public static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean m(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        l(i, i4, bArr.length);
        l(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract fl2 c(int i, int i2);

    public abstract void d(byte[] bArr, int i);

    public abstract void e(tl2 tl2Var);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hl2)) {
            return false;
        }
        hl2 hl2Var = (hl2) obj;
        int iB = b();
        if (iB != hl2Var.b()) {
            return false;
        }
        if (iB == 0) {
            return true;
        }
        int i = this.a;
        int i2 = hl2Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return f(hl2Var);
        }
        return false;
    }

    public abstract boolean f(hl2 hl2Var);

    public abstract int g(int i, int i2);

    public final int hashCode() {
        int iG = this.a;
        if (iG == 0) {
            int iB = b();
            iG = g(iB, iB);
            if (iG == 0) {
                iG = 1;
            }
            this.a = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new nj(this);
    }

    public final byte[] k() {
        int iB = b();
        if (iB == 0) {
            return sm2.a;
        }
        byte[] bArr = new byte[iB];
        d(bArr, iB);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iB = b();
        String strU = b() <= 50 ? x91.U(k()) : x91.U(c(0, 47).k()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iB);
        sb.append(" contents=\"");
        return ts.l(sb, strU, "\">");
    }
}
