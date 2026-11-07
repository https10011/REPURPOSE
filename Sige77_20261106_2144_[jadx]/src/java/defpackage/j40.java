package defpackage;

import java.util.EnumMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j40 extends yi0 {
    public final /* synthetic */ int d0;

    public /* synthetic */ j40(int i) {
        this.d0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[LOOP:1: B:44:0x00ea->B:46:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[LOOP:2: B:48:0x0109->B:49:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a8 A[LOOP:4: B:74:0x01a6->B:75:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0193 A[SYNTHETIC] */
    @Override // defpackage.yi0
    public final boolean[] i(String str) {
        int i;
        int iA;
        int i2;
        int iA2;
        int iDigit;
        int iA3;
        int i3;
        int iA4;
        int i4;
        int iDigit2;
        int i5;
        int iA5;
        int i6;
        int iDigit3;
        boolean[] zArr = null;
        switch (this.d0) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = str + g22.J(str);
                        i = i40.m[Character.digit(str.charAt(0), 10)];
                        zArr = new boolean[95];
                        iA = yi0.a(zArr, 0, g22.h, true);
                        for (i2 = 1; i2 <= 6; i2++) {
                            iDigit = Character.digit(str.charAt(i2), 10);
                            if (((i >> (6 - i2)) & 1) == 1) {
                                iDigit += 10;
                            }
                            iA += yi0.a(zArr, iA, g22.l[iDigit], false);
                        }
                        iA2 = yi0.a(zArr, iA, g22.i, false) + iA;
                        for (int i7 = 7; i7 <= 12; i7++) {
                            iA2 += yi0.a(zArr, iA2, g22.k[Character.digit(str.charAt(i7), 10)], true);
                        }
                        yi0.a(zArr, iA2, g22.h, true);
                    } catch (hf0 e) {
                        sm0.s(e);
                    }
                } else if (length == 13) {
                    try {
                        if (!g22.I(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                        i = i40.m[Character.digit(str.charAt(0), 10)];
                        zArr = new boolean[95];
                        iA = yi0.a(zArr, 0, g22.h, true);
                        while (i2 <= 6) {
                            iDigit = Character.digit(str.charAt(i2), 10);
                            if (((i >> (6 - i2)) & 1) == 1) {
                                iDigit += 10;
                            }
                            iA += yi0.a(zArr, iA, g22.l[iDigit], false);
                        }
                        iA2 = yi0.a(zArr, iA, g22.i, false) + iA;
                        while (i7 <= 12) {
                            iA2 += yi0.a(zArr, iA2, g22.k[Character.digit(str.charAt(i7), 10)], true);
                        }
                        yi0.a(zArr, iA2, g22.h, true);
                    } catch (hf0 unused) {
                        e.g("Illegal contents");
                    }
                } else {
                    e.g("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                }
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = str + g22.J(str);
                        zArr = new boolean[67];
                        iA3 = yi0.a(zArr, 0, g22.h, true);
                        for (i3 = 0; i3 <= 3; i3++) {
                            iA3 += yi0.a(zArr, iA3, g22.k[Character.digit(str.charAt(i3), 10)], false);
                        }
                        iA4 = yi0.a(zArr, iA3, g22.i, false) + iA3;
                        for (i4 = 4; i4 <= 7; i4++) {
                            iA4 += yi0.a(zArr, iA4, g22.k[Character.digit(str.charAt(i4), 10)], true);
                        }
                        yi0.a(zArr, iA4, g22.h, true);
                    } catch (hf0 e2) {
                        sm0.s(e2);
                    }
                } else if (length2 == 8) {
                    try {
                        if (!g22.I(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                        zArr = new boolean[67];
                        iA3 = yi0.a(zArr, 0, g22.h, true);
                        while (i3 <= 3) {
                            iA3 += yi0.a(zArr, iA3, g22.k[Character.digit(str.charAt(i3), 10)], false);
                        }
                        iA4 = yi0.a(zArr, iA3, g22.i, false) + iA3;
                        while (i4 <= 7) {
                            iA4 += yi0.a(zArr, iA4, g22.k[Character.digit(str.charAt(i4), 10)], true);
                        }
                        yi0.a(zArr, iA4, g22.h, true);
                    } catch (hf0 unused2) {
                        e.g("Illegal contents");
                    }
                } else {
                    e.g("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                }
                return zArr;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = str + g22.J(i40.K(str));
                        iDigit2 = Character.digit(str.charAt(0), 10);
                        if (iDigit2 != 0) {
                            i5 = i40.n[iDigit2][Character.digit(str.charAt(7), 10)];
                            zArr = new boolean[51];
                            iA5 = yi0.a(zArr, 0, g22.h, true);
                            for (i6 = 1; i6 <= 6; i6++) {
                                iDigit3 = Character.digit(str.charAt(i6), 10);
                                if (((i5 >> (6 - i6)) & 1) == 1) {
                                    iDigit3 += 10;
                                }
                                iA5 += yi0.a(zArr, iA5, g22.l[iDigit3], false);
                            }
                            yi0.a(zArr, iA5, g22.j, false);
                        } else {
                            i5 = i40.n[iDigit2][Character.digit(str.charAt(7), 10)];
                            zArr = new boolean[51];
                            iA5 = yi0.a(zArr, 0, g22.h, true);
                            while (i6 <= 6) {
                                iDigit3 = Character.digit(str.charAt(i6), 10);
                                if (((i5 >> (6 - i6)) & 1) == 1) {
                                    iDigit3 += 10;
                                }
                                iA5 += yi0.a(zArr, iA5, g22.l[iDigit3], false);
                            }
                            yi0.a(zArr, iA5, g22.j, false);
                        }
                    } catch (hf0 e3) {
                        sm0.s(e3);
                    }
                } else if (length3 == 8) {
                    try {
                        if (!g22.I(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                        iDigit2 = Character.digit(str.charAt(0), 10);
                        if (iDigit2 != 0 || iDigit2 == 1) {
                            i5 = i40.n[iDigit2][Character.digit(str.charAt(7), 10)];
                            zArr = new boolean[51];
                            iA5 = yi0.a(zArr, 0, g22.h, true);
                            while (i6 <= 6) {
                                iDigit3 = Character.digit(str.charAt(i6), 10);
                                if (((i5 >> (6 - i6)) & 1) == 1) {
                                    iDigit3 += 10;
                                }
                                iA5 += yi0.a(zArr, iA5, g22.l[iDigit3], false);
                            }
                            yi0.a(zArr, iA5, g22.j, false);
                        } else {
                            e.g("Number system must be 0 or 1");
                        }
                    } catch (hf0 unused3) {
                        e.g("Illegal contents");
                    }
                } else {
                    e.g("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                }
                return zArr;
        }
    }

    @Override // defpackage.yi0
    public final int k() {
        return 9;
    }

    @Override // defpackage.yi0, defpackage.na2
    public final hh m(String str, int i, EnumMap enumMap) {
        switch (this.d0) {
            case 0:
                if (i == 8) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode EAN_13, but got ".concat(ts.w(i)));
                return null;
            case 1:
                if (i == 7) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode EAN_8, but got ".concat(ts.w(i)));
                return null;
            default:
                if (i == 16) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode UPC_E, but got ".concat(ts.w(i)));
                return null;
        }
    }
}
