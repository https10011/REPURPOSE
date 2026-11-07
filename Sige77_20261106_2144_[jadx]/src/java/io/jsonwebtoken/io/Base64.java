package io.jsonwebtoken.io;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class Base64 {
    private static final char[] BASE64URL_ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    private static final int[] BASE64URL_IALPHABET;
    private static final char[] BASE64_ALPHABET;
    private static final int[] BASE64_IALPHABET;
    static final Base64 DEFAULT;
    private static final int IALPHABET_MAX_INDEX;
    static final Base64 URL_SAFE;
    private final char[] ALPHABET;
    private final int[] IALPHABET;
    private final boolean urlsafe;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        BASE64_ALPHABET = cArr;
        int[] iArr = new int[256];
        BASE64_IALPHABET = iArr;
        int[] iArr2 = new int[256];
        BASE64URL_IALPHABET = iArr2;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i]] = i;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i]] = i;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }

    private Base64(boolean z) {
        this.urlsafe = z;
        this.ALPHABET = z ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = z ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private int ctoi(char c) {
        int i = c > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c];
        if (i >= 0) {
            return i;
        }
        throw new DecodingException("Illegal " + getName() + " character: '" + c + "'");
    }

    private char[] encodeToChar(byte[] bArr, boolean z) {
        int i;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i2 = (length / 3) * 3;
        int i3 = length - i2;
        boolean z2 = true;
        int i4 = length - 1;
        int i5 = ((i4 / 3) + 1) << 2;
        int i6 = i5 + (z ? ((i5 - 1) / 76) << 1 : 0);
        if (i3 == 2) {
            i = 1;
        } else {
            i = i3 == 1 ? 2 : 0;
        }
        char[] cArr = new char[this.urlsafe ? i6 - i : i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i2) {
            int i10 = i7 + 2;
            int i11 = ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7] & 255) << 16);
            i7 += 3;
            int i12 = i11 | (bArr[i10] & 255);
            char[] cArr2 = this.ALPHABET;
            cArr[i8] = cArr2[(i12 >>> 18) & 63];
            cArr[i8 + 1] = cArr2[(i12 >>> 12) & 63];
            cArr[i8 + 2] = cArr2[(i12 >>> 6) & 63];
            boolean z3 = z2;
            int i13 = i8 + 4;
            cArr[i8 + 3] = cArr2[i12 & 63];
            if (z && (i9 = i9 + 1) == 19 && i13 < i6 - 2) {
                int i14 = i8 + 5;
                cArr[i13] = '\r';
                i8 += 6;
                cArr[i14] = '\n';
                i9 = 0;
            } else {
                i8 = i13;
            }
            z2 = z3;
        }
        if (i3 > 0) {
            int i15 = ((bArr[i2] & 255) << 10) | (i3 == 2 ? (bArr[i4] & 255) << 2 : 0);
            char[] cArr3 = this.ALPHABET;
            cArr[i6 - 4] = cArr3[i15 >> 12];
            cArr[i6 - 3] = cArr3[(i15 >>> 6) & 63];
            if (i3 == 2) {
                cArr[i6 - 2] = cArr3[i15 & 63];
            } else if (!this.urlsafe) {
                cArr[i6 - 2] = '=';
            }
            if (!this.urlsafe) {
                cArr[i6 - 1] = '=';
            }
        }
        return cArr;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    public final byte[] decodeFast(char[] cArr) throws DecodingException {
        int i;
        int i2;
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && this.IALPHABET[cArr[i4]] < 0) {
            i4++;
        }
        while (i3 > 0 && this.IALPHABET[cArr[i3]] < 0) {
            i3--;
        }
        boolean z = true;
        if (cArr[i3] == '=') {
            i = cArr[i3 + (-1)] == '=' ? 2 : 1;
        } else {
            i = 0;
        }
        int i5 = (i3 - i4) + 1;
        if (length > 76) {
            i2 = (cArr[76] == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i6 = (((i5 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i4 + 4;
            int iCtoi = (ctoi(cArr[i4 + 1]) << 12) | (ctoi(cArr[i4]) << 18) | (ctoi(cArr[i4 + 2]) << 6) | ctoi(cArr[i4 + 3]);
            bArr[i8] = (byte) (iCtoi >> 16);
            int i11 = i8 + 2;
            boolean z2 = z;
            bArr[i8 + 1] = (byte) (iCtoi >> 8);
            i8 += 3;
            bArr[i11] = (byte) iCtoi;
            if (i2 <= 0 || (i9 = i9 + 1) != 19) {
                i4 = i10;
            } else {
                i4 += 6;
                i9 = 0;
            }
            z = z2;
        }
        if (i8 < i6) {
            int iCtoi2 = 0;
            int i12 = 0;
            while (i4 <= i3 - i) {
                iCtoi2 |= ctoi(cArr[i4]) << (18 - (i12 * 6));
                i12++;
                i4++;
            }
            int i13 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (iCtoi2 >> i13);
                i13 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    public final String encodeToString(byte[] bArr, boolean z) {
        return new String(encodeToChar(bArr, z));
    }
}
