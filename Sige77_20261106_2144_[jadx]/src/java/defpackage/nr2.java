package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nr2 extends mr2 {
    public final byte[] d;

    public nr2(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // defpackage.jr2
    public final byte a(int i) {
        return this.d[i];
    }

    @Override // defpackage.jr2
    public final int b() {
        return this.d.length;
    }

    @Override // defpackage.jr2
    public final mr2 d(int i, int i2) {
        byte[] bArr = this.d;
        int iC = jr2.c(0, i2, bArr.length);
        return iC == 0 ? jr2.b : new lr2(bArr, 0, iC);
    }

    @Override // defpackage.jr2
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // defpackage.jr2
    public final boolean h(jr2 jr2Var) {
        boolean z = jr2Var instanceof nr2;
        byte[] bArr = this.d;
        if (z) {
            return Arrays.equals(bArr, ((nr2) jr2Var).d);
        }
        if (!(jr2Var instanceof lr2)) {
            return jr2Var.h(this);
        }
        int length = bArr.length;
        if (length > jr2Var.b()) {
            tv2.b(length, bArr.length);
            return false;
        }
        if (length > jr2Var.b()) {
            e.g(ts.i("Ran off end of other: 0, ", length, jr2Var.b(), ", "));
            return false;
        }
        if (jr2Var instanceof nr2) {
            return jr2.g(0, 0, length, bArr, ((nr2) jr2Var).d);
        }
        lr2 lr2Var = (lr2) jr2Var;
        return jr2.g(0, lr2Var.e, length, bArr, lr2Var.d);
    }

    @Override // defpackage.jr2
    public final void k(tr2 tr2Var) {
        byte[] bArr = this.d;
        tr2Var.i(bArr, 0, bArr.length);
    }

    @Override // defpackage.jr2
    public final int l(int i, int i2) {
        return ds2.a(i, this.d, 0, i2);
    }

    @Override // defpackage.jr2
    public final or2 m() {
        byte[] bArr = this.d;
        return sn.D(bArr, 0, bArr.length);
    }
}
