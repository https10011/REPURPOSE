package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r13 extends w13 {
    public final char[] e;

    public r13(o13 o13Var) {
        super(o13Var, (Character) null);
        this.e = new char[512];
        char[] cArr = o13Var.b;
        if (cArr.length != 16) {
            sm0.a();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.w13
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        qt.K(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
