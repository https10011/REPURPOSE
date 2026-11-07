package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class af {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;

    public af(String str, char[] cArr) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iX = aj0.x(length);
            this.d = iX;
            int iMin = Math.min(8, Integer.lowestOneBit(iX));
            try {
                this.e = 8 / iMin;
                this.f = iX / iMin;
                this.c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (!(c < 128)) {
                        e.g(ga.s("Non-ASCII character: %s", Character.valueOf(c)));
                        throw null;
                    }
                    if (!(bArr[c] == -1)) {
                        e.g(ga.s("Duplicate character: %s", Character.valueOf(c)));
                        throw null;
                    }
                    bArr[c] = (byte) i;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.e];
                for (int i2 = 0; i2 < this.f; i2++) {
                    int i3 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[aj0.r(i2 * 8, i3)] = true;
                }
            } catch (ArithmeticException e) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
            }
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof af) {
            return Arrays.equals(this.b, ((af) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
