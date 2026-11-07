package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p01 implements Cloneable {
    public static final short[] b = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    public static final byte[] c = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    public long[] a;

    public p01(long[] jArr, int i) {
        if (i == jArr.length) {
            this.a = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.a = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static void c(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public static long g(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr2[i2 + i6];
            int i7 = i + i6;
            jArr[i7] = (j | (j2 << i4)) ^ jArr[i7];
            j = j2 >>> i5;
        }
        return j;
    }

    public static int h(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        byte[] bArr = c;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            i = i5 == 0 ? bArr[i3] : bArr[i5] + 8;
        } else {
            int i6 = i3 >>> 24;
            i = i6 == 0 ? bArr[i4] + 16 : bArr[i6] + 24;
        }
        return i2 + i;
    }

    public static void k(long[] jArr, int i) {
        int i2 = i >>> 6;
        jArr[i2] = (1 << (i & 63)) ^ jArr[i2];
    }

    public static void l(int i, int i2, int i3, long[] jArr, long[] jArr2) {
        int i4 = i3 >>> 6;
        int i5 = i3 & 63;
        if (i5 == 0) {
            c(i4, i, i2, jArr, jArr2);
            return;
        }
        int i6 = i2;
        int i7 = i4 + 1;
        int i8 = 64 - i5;
        int i9 = 64 - i8;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i4] = jArr[i4] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i10 = i7 + i6;
            jArr[i10] = (j | (j2 >>> i8)) ^ jArr[i10];
            j = j2 << i9;
        }
    }

    public static void m(int i, long j, long[] jArr) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = jArr[i2] ^ j;
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    public static long o(int i) {
        short[] sArr = b;
        int i2 = sArr[i & 255] | (sArr[(i >>> 8) & 255] << 16);
        return ((((long) ((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & 255])) & 4294967295L) << 32) | (4294967295L & ((long) i2));
    }

    public static void r(long j, long[] jArr, int i, long[] jArr2) {
        int i2 = i;
        long[] jArr3 = jArr2;
        if ((j & 1) != 0) {
            c(0, 0, i2, jArr3, jArr);
        }
        long j2 = j;
        int i3 = 1;
        while (true) {
            j2 >>>= 1;
            if (j2 == 0) {
                return;
            }
            if ((j2 & 1) != 0) {
                long jG = g(jArr3, 0, jArr, 0, i2, i3);
                if (jG != 0) {
                    jArr2[i] = jArr2[i] ^ jG;
                }
            }
            i3++;
            i2 = i;
            jArr3 = jArr2;
        }
    }

    public static int t(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = (i2 + 63) >>> 6;
        if (i < i3) {
            return i;
        }
        int i4 = i << 6;
        int iMin = Math.min(i4, (i2 << 1) - 1);
        int i5 = i4 - iMin;
        while (i5 >= 64) {
            i--;
            i5 -= 64;
        }
        int length = iArr.length;
        int i6 = iArr[length - 1];
        int i7 = length > 1 ? iArr[length - 2] : 0;
        int iMax = Math.max(i2, i6 + 64);
        int iMin2 = (Math.min(iMin - iMax, i2 - i7) + i5) >> 6;
        if (iMin2 > 1) {
            int i8 = i - iMin2;
            iMin = i8 << 6;
            int i9 = iMin - i2;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                l(i8, i - i8, iArr[length2] + i9, jArr, jArr);
            }
            l(i8, i - i8, i9, jArr, jArr);
            while (i > i8) {
                i--;
                jArr[i] = 0;
            }
        }
        if (iMin > iMax) {
            int i10 = iMax >>> 6;
            while (true) {
                i--;
                if (i <= i10) {
                    break;
                }
                long j = jArr[i];
                if (j != 0) {
                    jArr[i] = 0;
                    int i11 = (i << 6) - i2;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        m(iArr[length3] + i11, j, jArr);
                    }
                    m(i11, j, jArr);
                }
            }
            int i12 = iMax & 63;
            long j2 = jArr[i10];
            long j3 = j2 >>> i12;
            if (j3 != 0) {
                jArr[i10] = j2 ^ (j3 << i12);
                int i13 = iMax - i2;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    m(iArr[length4] + i13, j3, jArr);
                }
                m(i13, j3, jArr);
            }
        } else {
            iMax = iMin;
        }
        if (iMax > i2) {
            while (true) {
                iMax--;
                if (iMax < i2) {
                    break;
                }
                if (((1 << (iMax & 63)) & jArr[iMax >>> 6]) != 0) {
                    k(jArr, iMax);
                    int i14 = iMax - i2;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        k(jArr, iArr[length5] + i14);
                    }
                    k(jArr, i14);
                }
            }
        }
        return i3;
    }

    public static void u(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.a;
        if (jArr2 == null) {
            jArr = null;
        } else {
            long[] jArr3 = new long[jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        return new p01(jArr);
    }

    public final void d(p01 p01Var, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        long[] jArr = this.a;
        if (i5 == 0) {
            c(i4, 0, i3, jArr, p01Var.a);
            return;
        }
        long jG = g(jArr, i4, p01Var.a, 0, i3, i5);
        if (jG != 0) {
            long[] jArr2 = this.a;
            int i6 = i3 + i4;
            jArr2[i6] = jG ^ jArr2[i6];
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p01)) {
            return false;
        }
        p01 p01Var = (p01) obj;
        int iN = n();
        if (p01Var.n() != iN) {
            return false;
        }
        for (int i = 0; i < iN; i++) {
            if (this.a[i] != p01Var.a[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(p01 p01Var) {
        int iN = p01Var.n();
        if (iN == 0) {
            return;
        }
        long[] jArr = this.a;
        if (iN > jArr.length) {
            long[] jArr2 = new long[iN];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, iN));
            this.a = jArr2;
        }
        c(0, 0, iN, this.a, p01Var.a);
    }

    public final int hashCode() {
        int iN = n();
        int i = 1;
        for (int i2 = 0; i2 < iN; i2++) {
            long j = this.a[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final int i() {
        int length = this.a.length;
        while (length != 0) {
            length--;
            long j = this.a[length];
            if (j != 0) {
                return h(j) + (length << 6);
            }
        }
        return 0;
    }

    public final int j(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.a[i2];
            if (j != 0) {
                return h(j) + (i2 << 6);
            }
        }
        return 0;
    }

    public final int n() {
        long[] jArr = this.a;
        int iMin = Math.min(jArr.length, jArr.length);
        if (iMin >= 1) {
            if (jArr[0] != 0) {
                while (true) {
                    int i = iMin - 1;
                    if (jArr[i] != 0) {
                        return iMin;
                    }
                    iMin = i;
                }
            } else {
                while (true) {
                    int i2 = iMin - 1;
                    if (jArr[i2] != 0) {
                        return iMin;
                    }
                    if (i2 > 0) {
                        iMin = i2;
                    }
                }
            }
        }
        return 0;
    }

    public final boolean p() {
        long[] jArr = this.a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final p01 q(p01 p01Var) {
        int i;
        int i2;
        p01 p01Var2;
        p01 p01Var3;
        long[] jArr;
        int i3 = i();
        if (i3 == 0) {
            return this;
        }
        int i4 = p01Var.i();
        if (i4 == 0) {
            return p01Var;
        }
        if (i3 > i4) {
            i2 = i3;
            i = i4;
            p01Var3 = this;
            p01Var2 = p01Var;
        } else {
            i = i3;
            i2 = i4;
            p01Var2 = this;
            p01Var3 = p01Var;
        }
        int i5 = (i + 63) >>> 6;
        int i6 = (i2 + 63) >>> 6;
        int i7 = ((i + i2) + 62) >>> 6;
        if (i5 == 1) {
            long j = p01Var2.a[0];
            if (j == 1) {
                return p01Var3;
            }
            long[] jArr2 = new long[i7];
            r(j, p01Var3.a, i6, jArr2);
            return new p01(jArr2, i7);
        }
        int i8 = (i2 + 70) >>> 6;
        int[] iArr = new int[16];
        int i9 = i8 << 4;
        long[] jArr3 = new long[i9];
        iArr[1] = i8;
        System.arraycopy(p01Var3.a, 0, jArr3, i8, i6);
        int i10 = 2;
        int i11 = i8;
        while (i10 < 16) {
            int i12 = i11 + i8;
            iArr[i10] = i12;
            if ((i10 & 1) == 0) {
                u(jArr3, i12 >>> 1, jArr3, i12, i8, 1);
                jArr = jArr3;
            } else {
                jArr = jArr3;
                int i13 = i12 - i8;
                for (int i14 = 0; i14 < i8; i14++) {
                    jArr[i12 + i14] = jArr[i8 + i14] ^ jArr[i13 + i14];
                }
            }
            i10++;
            i11 = i12;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        long[] jArr5 = new long[i9];
        u(jArr4, 0, jArr5, 0, i9, 4);
        long[] jArr6 = p01Var2.a;
        int i15 = i7 << 3;
        long[] jArr7 = new long[i15];
        for (int i16 = 0; i16 < i5; i16++) {
            long j2 = jArr6[i16];
            int i17 = i16;
            while (true) {
                int i18 = iArr[((int) j2) & 15];
                int i19 = iArr[((int) (j2 >>> 4)) & 15];
                for (int i20 = 0; i20 < i8; i20++) {
                    int i21 = i17 + i20;
                    jArr7[i21] = jArr7[i21] ^ (jArr4[i18 + i20] ^ jArr5[i19 + i20]);
                }
                j2 >>>= 8;
                if (j2 == 0) {
                    break;
                }
                i17 += i7;
            }
        }
        while (true) {
            int i22 = i15 - i7;
            if (i22 == 0) {
                return new p01(jArr7, i7);
            }
            g(jArr7, i22 - i7, jArr7, i22, i7, 8);
            i15 = i22;
        }
    }

    public final String toString() {
        int iN = n();
        if (iN == 0) {
            return "0";
        }
        int i = iN - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.a[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.a[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public p01(long[] jArr) {
        this.a = jArr;
    }

    public p01(int i) {
        this.a = new long[i];
    }
}
