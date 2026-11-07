package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jr3 {
    public static final long d;
    public static final jr3 e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = jCharAt;
        e = new jr3(0, -1, -1);
    }

    public jr3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(int i, int i2, String str) {
        if (i == i2) {
            throw xp.b(i - 1, "missing precision", str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw xp.b(i4, "invalid precision character", str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw xp.a("precision too large", i, i2, str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw xp.a("invalid precision", i, i2, str);
    }

    public final boolean a() {
        return this == e;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (a()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.b != -1;
    }

    public final boolean c() {
        return (this.a & 128) != 0;
    }

    public final void d(StringBuilder sb) {
        if (a()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.a & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.c;
        if (i5 != -1) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jr3) {
            jr3 jr3Var = (jr3) obj;
            if (jr3Var.a == this.a && jr3Var.b == this.b && jr3Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
