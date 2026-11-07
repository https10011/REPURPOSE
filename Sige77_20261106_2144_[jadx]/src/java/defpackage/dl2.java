package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dl2 extends fl2 {
    public final byte[] c;
    public final int d;
    public final int e;

    public dl2(byte[] bArr, int i, int i2) {
        hl2.l(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hl2
    public final byte a(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.hl2
    public final int b() {
        return this.e;
    }

    @Override // defpackage.hl2
    public final fl2 c(int i, int i2) {
        int iL = hl2.l(i, i2, this.e);
        if (iL == 0) {
            return hl2.b;
        }
        return new dl2(this.c, this.d + i, iL);
    }

    @Override // defpackage.hl2
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // defpackage.hl2
    public final void e(tl2 tl2Var) {
        tl2Var.c(this.c, this.d, this.e);
    }

    @Override // defpackage.hl2
    public final boolean f(hl2 hl2Var) {
        boolean z = hl2Var instanceof gl2;
        if (!z && !(hl2Var instanceof dl2)) {
            return hl2Var.f(this);
        }
        int iB = hl2Var.b();
        int i = this.e;
        if (i > iB) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > hl2Var.b()) {
            int iB2 = hl2Var.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iB2).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(iB2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return hl2.m(i2, 0, i, bArr, ((gl2) hl2Var).c);
        }
        if (!(hl2Var instanceof dl2)) {
            return hl2Var.c(0, i).equals(c(i2, i + i2));
        }
        dl2 dl2Var = (dl2) hl2Var;
        return hl2.m(i2, dl2Var.d, i, bArr, dl2Var.c);
    }

    @Override // defpackage.hl2
    public final int g(int i, int i2) {
        return sm2.a(i, this.c, this.d, i2);
    }
}
