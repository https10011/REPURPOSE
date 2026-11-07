package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bf extends df {
    public final char[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public bf() {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        super(new af("base16()", cArr), (Character) null);
        this.d = new char[512];
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.df
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        yv2.n(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.d;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
