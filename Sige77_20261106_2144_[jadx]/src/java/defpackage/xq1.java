package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xq1 extends fy1 {
    public final short c;
    public final short d;

    public xq1(fy1 fy1Var, int i, int i2) {
        super(fy1Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.fy1
    public final void a(gh ghVar, byte[] bArr) {
        ghVar.d(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
