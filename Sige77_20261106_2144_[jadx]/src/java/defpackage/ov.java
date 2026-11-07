package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ov implements kw1 {
    public final int a;
    public final int b;
    public xh1 c;

    public ov() {
        if (!d42.z(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            e.g("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.kw1
    public final void e(er1 er1Var) {
        er1Var.m(this.a, this.b);
    }

    @Override // defpackage.kw1
    public final void f(xh1 xh1Var) {
        this.c = xh1Var;
    }

    @Override // defpackage.kw1
    public final xh1 h() {
        return this.c;
    }

    @Override // defpackage.uw0
    public final void b() {
    }

    @Override // defpackage.uw0
    public final void j() {
    }

    @Override // defpackage.uw0
    public final void k() {
    }

    @Override // defpackage.kw1
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.kw1
    public final void c(er1 er1Var) {
    }

    @Override // defpackage.kw1
    public final void g(Drawable drawable) {
    }
}
