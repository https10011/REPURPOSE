package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gl2 extends fl2 {
    public final byte[] c;

    public gl2(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.hl2
    public final byte a(int i) {
        return this.c[i];
    }

    @Override // defpackage.hl2
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.hl2
    public final fl2 c(int i, int i2) {
        byte[] bArr = this.c;
        int iL = hl2.l(0, i2, bArr.length);
        return iL == 0 ? hl2.b : new dl2(bArr, 0, iL);
    }

    @Override // defpackage.hl2
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // defpackage.hl2
    public final void e(tl2 tl2Var) {
        byte[] bArr = this.c;
        tl2Var.c(bArr, 0, bArr.length);
    }

    @Override // defpackage.hl2
    public final boolean f(hl2 hl2Var) {
        boolean z = hl2Var instanceof gl2;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((gl2) hl2Var).c);
        }
        boolean z2 = hl2Var instanceof dl2;
        if (!z2) {
            return hl2Var.f(this);
        }
        dl2 dl2Var = (dl2) hl2Var;
        int i = dl2Var.e;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return hl2.m(0, 0, length, bArr, ((gl2) hl2Var).c);
            }
            if (!z2) {
                return hl2Var.c(0, length).equals(c(0, length));
            }
            return hl2.m(0, dl2Var.d, length, bArr, dl2Var.c);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.hl2
    public final int g(int i, int i2) {
        return sm2.a(i, this.c, 0, i2);
    }
}
