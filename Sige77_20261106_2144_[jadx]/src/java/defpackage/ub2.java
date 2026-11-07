package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ub2 {
    public static final char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static final char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    public static final ub2 e = new ub2(false, true);
    public final boolean a;
    public final boolean b;

    public ub2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final byte[] a(byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = 0;
        boolean z = this.b;
        if (z) {
            i = ((length + 2) / 3) * 4;
        } else {
            int i3 = length % 3;
            i = ((length / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
        }
        byte[] bArr2 = new byte[i];
        int length2 = bArr.length;
        char[] cArr = this.a ? d : c;
        int i4 = (length2 / 3) * 3;
        int i5 = 0;
        while (i2 < i4) {
            int iMin = Math.min(i2 + i4, i4);
            int i6 = i2;
            int i7 = i5;
            while (i6 < iMin) {
                int i8 = i6 + 2;
                int i9 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
                i6 += 3;
                int i10 = i9 | (bArr[i8] & 255);
                bArr2[i7] = (byte) cArr[(i10 >>> 18) & 63];
                bArr2[i7 + 1] = (byte) cArr[(i10 >>> 12) & 63];
                int i11 = i7 + 3;
                bArr2[i7 + 2] = (byte) cArr[(i10 >>> 6) & 63];
                i7 += 4;
                bArr2[i11] = (byte) cArr[i10 & 63];
            }
            int i12 = ((iMin - i2) / 3) * 4;
            i5 += i12;
            if (i12 == -1 && iMin < length2) {
                throw null;
            }
            i2 = iMin;
        }
        if (i2 < length2) {
            int i13 = i2 + 1;
            int i14 = bArr[i2] & 255;
            int i15 = i5 + 1;
            bArr2[i5] = (byte) cArr[i14 >> 2];
            if (i13 == length2) {
                int i16 = i5 + 2;
                bArr2[i15] = (byte) cArr[(i14 << 4) & 63];
                if (z) {
                    int i17 = i5 + 3;
                    bArr2[i16] = 61;
                    i5 += 4;
                    bArr2[i17] = 61;
                } else {
                    i5 = i16;
                }
            } else {
                int i18 = bArr[i13] & 255;
                bArr2[i15] = (byte) cArr[((i14 << 4) & 63) | (i18 >> 4)];
                int i19 = i5 + 3;
                bArr2[i5 + 2] = (byte) cArr[(i18 << 2) & 63];
                if (z) {
                    i5 += 4;
                    bArr2[i19] = 61;
                } else {
                    i5 = i19;
                }
            }
        }
        return i5 != i ? Arrays.copyOf(bArr2, i5) : bArr2;
    }
}
