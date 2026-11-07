package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pn extends yi0 {
    public static final char[] d0;
    public static final char[] e0 = {'T', 'N', '*', 'E'};
    public static final char[] f0 = {'/', ':', '+', JwtParser.SEPARATOR_CHAR};
    public static final char g0;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        d0 = cArr;
        g0 = cArr[0];
    }

    @Override // defpackage.yi0
    public final boolean[] i(String str) {
        int i;
        int length = str.length();
        char c = g0;
        if (length < 2) {
            str = c + str + c;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = d0;
            boolean zI = on.I(cArr, upperCase);
            boolean zI2 = on.I(cArr, upperCase2);
            char[] cArr2 = e0;
            boolean zI3 = on.I(cArr2, upperCase);
            boolean zI4 = on.I(cArr2, upperCase2);
            if (zI) {
                if (!zI2) {
                    e.g("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zI3) {
                if (zI2 || zI4) {
                    e.g("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c + str + c;
            } else if (!zI4) {
                e.g("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!on.I(f0, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = on.h;
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = on.i[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
