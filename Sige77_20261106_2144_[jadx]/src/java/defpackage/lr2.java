package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lr2 extends mr2 {
    public final byte[] d;
    public final int e;
    public final int f;

    public lr2(byte[] bArr, int i, int i2) {
        jr2.c(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.jr2
    public final byte a(int i) {
        return this.d[this.e + i];
    }

    @Override // defpackage.jr2
    public final int b() {
        return this.f;
    }

    @Override // defpackage.jr2
    public final mr2 d(int i, int i2) {
        int iC = jr2.c(i, i2, this.f);
        if (iC == 0) {
            return jr2.b;
        }
        return new lr2(this.d, this.e + i, iC);
    }

    @Override // defpackage.jr2
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // defpackage.jr2
    public final boolean h(jr2 jr2Var) {
        if (!(jr2Var instanceof nr2) && !(jr2Var instanceof lr2)) {
            return jr2Var.h(this);
        }
        int iB = jr2Var.b();
        int i = this.f;
        if (i > iB) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > jr2Var.b()) {
            e.g(ts.i("Ran off end of other: 0, ", i, jr2Var.b(), ", "));
            return false;
        }
        boolean z = jr2Var instanceof nr2;
        byte[] bArr = this.d;
        int i2 = this.e;
        if (z) {
            return jr2.g(i2, 0, i, bArr, ((nr2) jr2Var).d);
        }
        if (!(jr2Var instanceof lr2)) {
            return jr2Var.d(0, i).equals(d(i2, i + i2));
        }
        lr2 lr2Var = (lr2) jr2Var;
        return jr2.g(i2, lr2Var.e, i, bArr, lr2Var.d);
    }

    @Override // defpackage.jr2
    public final void k(tr2 tr2Var) {
        tr2Var.i(this.d, this.e, this.f);
    }

    @Override // defpackage.jr2
    public final int l(int i, int i2) {
        return ds2.a(i, this.d, this.e, i2);
    }

    @Override // defpackage.jr2
    public final or2 m() {
        return sn.D(this.d, this.e, this.f);
    }
}
