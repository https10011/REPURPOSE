package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ln0 extends yi0 {
    public static final int[] e0 = {1, 1, 1, 1};
    public static final int[] f0 = {3, 1, 1};
    public static final int[][] g0 = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public final /* synthetic */ int d0;

    public /* synthetic */ ln0(int i) {
        this.d0 = i;
    }

    public static void K(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static int L(int i, String str) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static int M(int i, String str) {
        char cCharAt;
        int length = str.length();
        if (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == 241) {
                return 4;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (cCharAt = str.charAt(i2)) >= '0' && cCharAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void N(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static void O(int[] iArr, int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf A[LOOP:4: B:78:0x01bd->B:79:0x01bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e0 A[LOOP:5: B:82:0x01de->B:83:0x01e0, LOOP_END] */
    @Override // defpackage.yi0
    public final boolean[] i(String str) {
        int i;
        int i2;
        int i3;
        char c;
        int iM;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        boolean[] zArr;
        int[] iArr2;
        int iA;
        int i8;
        int i9;
        String string = str;
        char c2 = '`';
        char c3 = ' ';
        int i10 = 9;
        int iA2 = 0;
        switch (this.d0) {
            case 0:
                int length = string.length();
                if (length % 2 != 0) {
                    e.g("The length of the input should be even");
                } else {
                    if (length <= 80) {
                        boolean[] zArr2 = new boolean[(length * 9) + 9];
                        int iA3 = yi0.a(zArr2, 0, e0, true);
                        for (int i11 = 0; i11 < length; i11 += 2) {
                            int iDigit = Character.digit(string.charAt(i11), 10);
                            int iDigit2 = Character.digit(string.charAt(i11 + 1), 10);
                            int[] iArr3 = new int[10];
                            for (int i12 = 0; i12 < 5; i12++) {
                                int i13 = i12 * 2;
                                int[][] iArr4 = g0;
                                iArr3[i13] = iArr4[iDigit][i12];
                                iArr3[i13 + 1] = iArr4[iDigit2][i12];
                            }
                            iA3 += yi0.a(zArr2, iA3, iArr3, true);
                        }
                        yi0.a(zArr2, iA3, f0, true);
                        return zArr2;
                    }
                    e.g("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                return null;
            case 1:
                int[][] iArr5 = on.j;
                int length2 = string.length();
                if (length2 > 0 && length2 <= 80) {
                    for (int i14 = 0; i14 < length2; i14++) {
                        char cCharAt = string.charAt(i14);
                        switch (cCharAt) {
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                                continue;
                                break;
                            default:
                                if (cCharAt > 127) {
                                    e.g("Bad character in input: ".concat(String.valueOf(cCharAt)));
                                }
                                break;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 1;
                    while (i15 < length2) {
                        int iM2 = M(i15, string);
                        int iCharAt = 100;
                        if (iM2 == 2) {
                            c = c3;
                            i3 = 100;
                            i = 103;
                            i2 = 96;
                        } else {
                            i = 103;
                            if (iM2 != 1) {
                                i2 = 96;
                                i3 = 99;
                                if (i17 == 99) {
                                    c = c3;
                                } else {
                                    c = c3;
                                    if (i17 == 100) {
                                        if (iM2 != 4 && (iM = M(i15 + 2, string)) != 1 && iM != 2) {
                                            if (iM != 4) {
                                                int i19 = i15 + 4;
                                                while (true) {
                                                    int iM3 = M(i19, string);
                                                    if (iM3 == 3) {
                                                        i19 += 2;
                                                    } else if (iM3 != 2) {
                                                        i3 = 99;
                                                    }
                                                }
                                            } else if (M(i15 + 3, string) == 3) {
                                                i3 = 99;
                                            }
                                        }
                                        i3 = 100;
                                    } else {
                                        if (iM2 == 4) {
                                            iM2 = M(i15 + 1, string);
                                        }
                                        if (iM2 == 3) {
                                            i3 = 99;
                                        } else {
                                            i3 = 100;
                                        }
                                    }
                                }
                            } else if (i15 >= string.length()) {
                                i4 = 96;
                                c = c3;
                                i2 = i4;
                                i3 = 100;
                            } else {
                                char cCharAt2 = string.charAt(i15);
                                if (cCharAt2 >= c3) {
                                    if (i17 == 101) {
                                        i4 = 96;
                                        if (cCharAt2 < '`') {
                                        }
                                    } else {
                                        i4 = 96;
                                    }
                                    c = c3;
                                    i2 = i4;
                                    i3 = 100;
                                } else {
                                    i4 = 96;
                                }
                                c = c3;
                                i2 = i4;
                                i3 = 101;
                            }
                        }
                        if (i3 == i17) {
                            switch (string.charAt(i15)) {
                                case 241:
                                    iCharAt = 102;
                                    break;
                                case 242:
                                    iCharAt = 97;
                                    break;
                                case 243:
                                    iCharAt = i2;
                                    break;
                                case 244:
                                    if (i17 == 101) {
                                        iCharAt = 101;
                                    }
                                    break;
                                default:
                                    if (i17 == 100) {
                                        iCharAt = string.charAt(i15) - ' ';
                                    } else if (i17 != 101) {
                                        iCharAt = Integer.parseInt(string.substring(i15, i15 + 2));
                                        i15++;
                                    } else {
                                        char cCharAt3 = string.charAt(i15);
                                        iCharAt = cCharAt3 - ' ';
                                        if (iCharAt < 0) {
                                            iCharAt = cCharAt3 + '@';
                                        }
                                    }
                                    break;
                            }
                            i15++;
                        } else {
                            if (i17 != 0) {
                                i5 = i3;
                            } else if (i3 != 100) {
                                i5 = i3 != 101 ? 105 : i;
                            } else {
                                i5 = 104;
                            }
                            iCharAt = i5;
                            i17 = i3;
                        }
                        arrayList.add(iArr5[iCharAt]);
                        i16 += iCharAt * i18;
                        if (i15 != 0) {
                            i18++;
                        }
                        c3 = c;
                    }
                    arrayList.add(iArr5[i16 % 103]);
                    arrayList.add(iArr5[106]);
                    int size = arrayList.size();
                    int i20 = 0;
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        for (int i22 : (int[]) obj) {
                            i20 += i22;
                        }
                    }
                    boolean[] zArr3 = new boolean[i20];
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj2 = arrayList.get(i23);
                        i23++;
                        iA2 += yi0.a(zArr3, iA2, (int[]) obj2, true);
                    }
                    return zArr3;
                }
                e.g("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr6 = on.k;
                int length3 = string.length();
                if (length3 <= 80) {
                    int i24 = 0;
                    while (i24 < length3) {
                        if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i24)) < 0) {
                            int length4 = string.length();
                            StringBuilder sb = new StringBuilder();
                            int i25 = 0;
                            while (i25 < length4) {
                                char cCharAt4 = string.charAt(i25);
                                if (cCharAt4 == 0) {
                                    sb.append("%U");
                                } else if (cCharAt4 == ' ') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 == '@') {
                                    sb.append("%V");
                                } else if (cCharAt4 == c2) {
                                    sb.append("%W");
                                } else if (cCharAt4 == '-' || cCharAt4 == '.') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= 26) {
                                    sb.append('$');
                                    sb.append((char) (cCharAt4 + '@'));
                                } else if (cCharAt4 < ' ') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 + '&'));
                                } else if (cCharAt4 <= ',' || cCharAt4 == '/' || cCharAt4 == ':') {
                                    sb.append('/');
                                    sb.append((char) (cCharAt4 + ' '));
                                } else if (cCharAt4 <= '9') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= '?') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 + 11));
                                } else if (cCharAt4 <= 'Z') {
                                    sb.append(cCharAt4);
                                } else if (cCharAt4 <= '_') {
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 - 16));
                                } else if (cCharAt4 <= 'z') {
                                    sb.append('+');
                                    sb.append((char) (cCharAt4 - ' '));
                                } else {
                                    if (cCharAt4 > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + string.charAt(i25) + "'");
                                    }
                                    sb.append('%');
                                    sb.append((char) (cCharAt4 - '+'));
                                }
                                i25++;
                                c2 = '`';
                            }
                            string = sb.toString();
                            length3 = string.length();
                            if (length3 > 80) {
                                e.g(ts.g(length3, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                            }
                            iArr = new int[9];
                            i6 = length3 + 25;
                            for (i7 = 0; i7 < length3; i7++) {
                                N(iArr, iArr6["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i7))]);
                                for (i9 = 0; i9 < 9; i9++) {
                                    i6 += iArr[i9];
                                }
                            }
                            zArr = new boolean[i6];
                            N(iArr, 148);
                            int iA4 = yi0.a(zArr, 0, iArr, true);
                            iArr2 = new int[]{1};
                            iA = yi0.a(zArr, iA4, iArr2, false) + iA4;
                            for (i8 = 0; i8 < length3; i8++) {
                                N(iArr, iArr6["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i8))]);
                                int iA5 = yi0.a(zArr, iA, iArr, true) + iA;
                                iA = yi0.a(zArr, iA5, iArr2, false) + iA5;
                            }
                            N(iArr, 148);
                            yi0.a(zArr, iA, iArr, true);
                            return zArr;
                        }
                        i24++;
                        c2 = '`';
                    }
                    iArr = new int[9];
                    i6 = length3 + 25;
                    while (i7 < length3) {
                        N(iArr, iArr6["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i7))]);
                        while (i9 < 9) {
                            i6 += iArr[i9];
                        }
                    }
                    zArr = new boolean[i6];
                    N(iArr, 148);
                    int iA6 = yi0.a(zArr, 0, iArr, true);
                    iArr2 = new int[]{1};
                    iA = yi0.a(zArr, iA6, iArr2, false) + iA6;
                    while (i8 < length3) {
                        N(iArr, iArr6["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i8))]);
                        int iA7 = yi0.a(zArr, iA, iArr, true) + iA;
                        iA = yi0.a(zArr, iA7, iArr2, false) + iA7;
                    }
                    N(iArr, 148);
                    yi0.a(zArr, iA, iArr, true);
                    return zArr;
                }
                e.g("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                return null;
            default:
                int[] iArr7 = on.l;
                int length5 = string.length();
                if (length5 > 80) {
                    e.g("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                    return null;
                }
                int[] iArr8 = new int[9];
                int length6 = ((string.length() + 4) * 9) + 1;
                O(iArr8, iArr7[47]);
                boolean[] zArr4 = new boolean[length6];
                K(zArr4, 0, iArr8);
                while (iA2 < length5) {
                    O(iArr8, iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(iA2))]);
                    K(zArr4, i10, iArr8);
                    i10 += 9;
                    iA2++;
                }
                int iL = L(20, string);
                O(iArr8, iArr7[iL]);
                K(zArr4, i10, iArr8);
                StringBuilder sbM = ts.m(string);
                sbM.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iL));
                O(iArr8, iArr7[L(15, sbM.toString())]);
                K(zArr4, i10 + 9, iArr8);
                O(iArr8, iArr7[47]);
                K(zArr4, i10 + 18, iArr8);
                zArr4[i10 + 27] = true;
                return zArr4;
        }
    }

    @Override // defpackage.yi0, defpackage.na2
    public final hh m(String str, int i, EnumMap enumMap) {
        switch (this.d0) {
            case 0:
                if (i == 9) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode ITF, but got ".concat(ts.w(i)));
                return null;
            case 1:
                if (i == 5) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode CODE_128, but got ".concat(ts.w(i)));
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (i == 3) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode CODE_39, but got ".concat(ts.w(i)));
                return null;
            default:
                if (i == 4) {
                    return super.m(str, i, enumMap);
                }
                e.g("Can only encode CODE_93, but got ".concat(ts.w(i)));
                return null;
        }
    }
}
