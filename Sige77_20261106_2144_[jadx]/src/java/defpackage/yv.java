package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yv extends r {
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public yv(byte[] bArr) {
        if (bArr == null) {
            uq1.h("data cannot be null");
            throw null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.a = bArr2;
    }

    @Override // defpackage.r
    public final boolean b(r rVar) {
        byte[] bArr;
        if (rVar instanceof yv) {
            yv yvVar = (yv) rVar;
            byte[] bArr2 = null;
            byte[] bArr3 = this.a;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            byte[] bArr4 = yvVar.a;
            if (bArr4 != null) {
                bArr2 = new byte[bArr4.length];
                System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            }
            if (z32.d(bArr, bArr2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r
    public final void c(kj0 kj0Var) throws IOException {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        int length = bArr.length;
        int i = length + 1;
        byte[] bArr4 = new byte[i];
        bArr4[0] = 0;
        System.arraycopy(bArr, 0, bArr4, 1, length);
        kj0Var.R(3);
        kj0Var.S(i);
        ((ByteArrayOutputStream) kj0Var.b).write(bArr4);
    }

    @Override // defpackage.r
    public final int d() {
        byte[] bArr = this.a;
        return cu1.a(bArr.length + 1) + 1 + bArr.length + 1;
    }

    @Override // defpackage.r
    public final r e() {
        return new yv(this.a);
    }

    @Override // defpackage.r, defpackage.p
    public final int hashCode() {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new kj0(byteArrayOutputStream, 3).T(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                int i2 = (byteArray[i] >>> 4) & 15;
                char[] cArr = b;
                stringBuffer.append(cArr[i2]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            ly lyVar = new ly("Internal error encoding BitString: " + e.getMessage(), 2);
            lyVar.b = e;
            throw lyVar;
        }
    }
}
