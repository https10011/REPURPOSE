package defpackage;

import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean a(yn1 yn1Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = yn1Var.c;
        byte[] bArr2 = yn1Var.a;
        while (i2 < i3) {
            if (i == i4) {
                yn1Var = yn1Var.f;
                yn1Var.getClass();
                byte[] bArr3 = yn1Var.a;
                bArr2 = bArr3;
                i = yn1Var.b;
                i4 = yn1Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String b(ji jiVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (jiVar.n(j2) == 13) {
                String strB = jiVar.B(j2, Charsets.UTF_8);
                jiVar.skip(2L);
                return strB;
            }
        }
        String strB2 = jiVar.B(j, Charsets.UTF_8);
        jiVar.skip(1L);
        return strB2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int c(ji jiVar, ca1 ca1Var, boolean z) {
        int i;
        int i2;
        int i3;
        yn1 yn1Var;
        int i4;
        ca1Var.getClass();
        yn1 yn1Var2 = jiVar.a;
        if (yn1Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = yn1Var2.a;
        int i5 = yn1Var2.b;
        int i6 = yn1Var2.c;
        int[] iArr = ca1Var.c;
        yn1 yn1Var3 = yn1Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (yn1Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            yn1Var3 = yn1Var3.f;
                            yn1Var3.getClass();
                            int i16 = yn1Var3.b;
                            byte[] bArr2 = yn1Var3.a;
                            i2 = yn1Var3.c;
                            if (yn1Var3 == yn1Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                yn1Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        yn1Var3.getClass();
                        yn1 yn1Var4 = yn1Var3.f;
                        yn1Var4.getClass();
                        i3 = yn1Var4.b;
                        byte[] bArr3 = yn1Var4.a;
                        i4 = yn1Var4.c;
                        if (yn1Var4 != yn1Var2) {
                            yn1Var = yn1Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            yn1Var = null;
                        }
                    } else {
                        yn1Var = yn1Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        yn1Var3 = yn1Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    yn1Var3 = yn1Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
