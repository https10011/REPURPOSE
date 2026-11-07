package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class w13 {
    public static final r13 d;
    public final o13 a;
    public final Character b;
    public volatile w13 c;

    static {
        new t13("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new t13("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new w13("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new w13("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new r13(new o13("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public w13(o13 o13Var, Character ch) {
        this.a = o13Var;
        if (ch != null) {
            byte[] bArr = o13Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                e.g(xi0.H("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        qt.K(0, i, bArr.length);
        while (i2 < i) {
            o13 o13Var = this.a;
            b(i2, Math.min(o13Var.f, i - i2), sb, bArr);
            i2 += o13Var.f;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        qt.K(i, i + i2, bArr.length);
        o13 o13Var = this.a;
        int i3 = o13Var.f;
        int i4 = o13Var.d;
        if (i2 > i3) {
            sm0.a();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(o13Var.b[((int) (j >>> ((i7 - i4) - i5))) & o13Var.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < o13Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(byte[] bArr, int i) {
        qt.K(0, i, bArr.length);
        o13 o13Var = this.a;
        int i2 = o13Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(o13Var.e * nj2.Y(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            e.b(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w13) {
            w13 w13Var = (w13) obj;
            if (this.a.equals(w13Var.a) && Objects.equals(this.b, w13Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        o13 o13Var = this.a;
        sb.append(o13Var);
        if (8 % o13Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public w13(String str, String str2) {
        this(new o13(str, str2.toCharArray()), (Character) '=');
    }
}
