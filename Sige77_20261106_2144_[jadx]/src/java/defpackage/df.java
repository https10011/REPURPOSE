package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class df {
    public static final cf c;
    public final af a;
    public final Character b;

    static {
        new cf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        c = new cf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new df("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new df("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new bf();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public df(af afVar, Character ch) {
        boolean z;
        this.a = afVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = afVar.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        yv2.i(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        yv2.n(0, length, bArr.length);
        af afVar = this.a;
        int i = afVar.e;
        int i2 = afVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(aj0.r(length, i2) * i);
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            e.b(e);
            return null;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        yv2.n(i, i + i2, bArr.length);
        af afVar = this.a;
        int i3 = afVar.f;
        int i4 = afVar.d;
        int i5 = 0;
        yv2.h(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(afVar.b[((int) (j >>> (i7 - i5))) & afVar.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < afVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        yv2.n(0, i, bArr.length);
        while (i2 < i) {
            af afVar = this.a;
            b(i2, Math.min(afVar.f, i - i2), sb, bArr);
            i2 += afVar.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof df) {
            df dfVar = (df) obj;
            if (this.a.equals(dfVar.a) && ia.d(this.b, dfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b}) ^ Arrays.hashCode(this.a.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        af afVar = this.a;
        sb.append(afVar.a);
        if (8 % afVar.d != 0) {
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

    public df(String str, String str2) {
        this(new af(str, str2.toCharArray()), (Character) '=');
    }
}
