package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q extends r {
    public final String a;
    public byte[] b;

    static {
        new ConcurrentHashMap();
    }

    public q(String str) {
        char cCharAt;
        if (str == null) {
            e.g("'identifier' cannot be null");
            throw null;
        }
        boolean zH = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            zH = h(2, str);
        }
        if (zH) {
            this.a = str;
        } else {
            e.g(ts.k("string ", str, " not an OID"));
            throw null;
        }
    }

    public static boolean h(int i, String str) {
        boolean z;
        char cCharAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                cCharAt = str.charAt(length);
                if ('0' > cCharAt || cCharAt > '9') {
                    break;
                }
                z = true;
            }
            if (cCharAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public static void i(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // defpackage.r
    public final boolean b(r rVar) {
        if (rVar == this) {
            return true;
        }
        if (!(rVar instanceof q)) {
            return false;
        }
        return this.a.equals(((q) rVar).a);
    }

    @Override // defpackage.r
    public final void c(kj0 kj0Var) throws IOException {
        byte[] bArrG = g();
        kj0Var.R(6);
        kj0Var.S(bArrG.length);
        ((ByteArrayOutputStream) kj0Var.b).write(bArrG);
    }

    @Override // defpackage.r
    public final int d() {
        int length = g().length;
        return cu1.a(length) + 1 + length;
    }

    public final void f(ByteArrayOutputStream byteArrayOutputStream) {
        String strSubstring;
        int i;
        String strSubstring2;
        int i2;
        String strSubstring3;
        String str = this.a;
        int iIndexOf = str.indexOf(46, 0);
        if (iIndexOf == -1) {
            strSubstring = str.substring(0);
            i = -1;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            i = iIndexOf + 1;
        }
        int i3 = Integer.parseInt(strSubstring) * 40;
        if (i == -1) {
            i2 = i;
            strSubstring2 = null;
        } else {
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 == -1) {
                strSubstring2 = str.substring(i);
                i2 = -1;
            } else {
                strSubstring2 = str.substring(i, iIndexOf2);
                i2 = iIndexOf2 + 1;
            }
        }
        if (strSubstring2.length() <= 18) {
            i(byteArrayOutputStream, Long.parseLong(strSubstring2) + ((long) i3));
        } else {
            k(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i3)));
        }
        while (i2 != -1) {
            if (i2 == -1) {
                strSubstring3 = null;
            } else {
                int iIndexOf3 = str.indexOf(46, i2);
                if (iIndexOf3 == -1) {
                    strSubstring3 = str.substring(i2);
                    i2 = -1;
                } else {
                    String strSubstring4 = str.substring(i2, iIndexOf3);
                    i2 = iIndexOf3 + 1;
                    strSubstring3 = strSubstring4;
                }
            }
            if (strSubstring3.length() <= 18) {
                i(byteArrayOutputStream, Long.parseLong(strSubstring3));
            } else {
                k(byteArrayOutputStream, new BigInteger(strSubstring3));
            }
        }
    }

    public final synchronized byte[] g() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.r, defpackage.p
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public q(q qVar, String str) {
        if (h(0, str)) {
            this.a = y00.l(new StringBuilder(), qVar.a, ".", str);
        } else {
            e.g(ts.k("string ", str, " not a valid OID branch"));
            throw null;
        }
    }
}
