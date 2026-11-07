package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yn1 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public yn1 f;
    public yn1 g;

    public yn1(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final yn1 a() {
        yn1 yn1Var = this.f;
        if (yn1Var == this) {
            yn1Var = null;
        }
        yn1 yn1Var2 = this.g;
        yn1Var2.getClass();
        yn1Var2.f = this.f;
        yn1 yn1Var3 = this.f;
        yn1Var3.getClass();
        yn1Var3.g = this.g;
        this.f = null;
        this.g = null;
        return yn1Var;
    }

    public final void b(yn1 yn1Var) {
        yn1Var.getClass();
        yn1Var.g = this;
        yn1Var.f = this.f;
        yn1 yn1Var2 = this.f;
        yn1Var2.getClass();
        yn1Var2.g = yn1Var;
        this.f = yn1Var;
    }

    public final yn1 c() {
        this.d = true;
        return new yn1(this.a, this.b, this.c, true, false);
    }

    public final void d(yn1 yn1Var, int i) {
        yn1Var.getClass();
        byte[] bArr = yn1Var.a;
        if (!yn1Var.e) {
            uq1.q("only owner can write");
            return;
        }
        int i2 = yn1Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (yn1Var.d) {
                sm0.a();
                return;
            }
            int i4 = yn1Var.b;
            if (i3 - i4 > 8192) {
                sm0.a();
                return;
            } else {
                ub.b(0, i4, i2, bArr, bArr);
                yn1Var.c -= yn1Var.b;
                yn1Var.b = 0;
            }
        }
        int i5 = yn1Var.c;
        int i6 = this.b;
        ub.b(i5, i6, i6 + i, this.a, bArr);
        yn1Var.c += i;
        this.b += i;
    }

    public yn1() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
