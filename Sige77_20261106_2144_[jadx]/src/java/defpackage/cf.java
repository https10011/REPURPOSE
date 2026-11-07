package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cf extends df {
    /* JADX WARN: Illegal instructions before constructor call */
    public cf(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new af(str, charArray), (Character) '=');
        yv2.h(charArray.length == 64);
    }

    @Override // defpackage.df
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        yv2.n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            af afVar = this.a;
            char[] cArr = afVar.b;
            char[] cArr2 = afVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }
}
