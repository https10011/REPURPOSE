package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t13 extends w13 {
    /* JADX WARN: Illegal instructions before constructor call */
    public t13(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new o13(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        sm0.a();
        throw null;
    }

    @Override // defpackage.w13
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        qt.K(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            o13 o13Var = this.a;
            char[] cArr = o13Var.b;
            char[] cArr2 = o13Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }
}
