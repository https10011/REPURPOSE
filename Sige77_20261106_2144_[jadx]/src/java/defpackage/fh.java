package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fh extends fy1 {
    public final short c;
    public final short d;

    public fh(fy1 fy1Var, int i, int i2) {
        super(fy1Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.fy1
    public final void a(gh ghVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                ghVar.d(31, 5);
                if (s > 62) {
                    ghVar.d(s - 31, 16);
                } else if (i == 0) {
                    ghVar.d(Math.min((int) s, 31), 5);
                } else {
                    ghVar.d(s - 31, 5);
                }
            }
            ghVar.d(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.c;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
