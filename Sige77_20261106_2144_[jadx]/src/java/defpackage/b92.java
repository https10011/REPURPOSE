package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class b92 extends h92 {
    public final WindowInsets.Builder e;

    public b92(u92 u92Var) {
        super(u92Var);
        WindowInsets windowInsetsG = u92Var.g();
        this.e = windowInsetsG != null ? t12.h(windowInsetsG) : t12.g();
    }

    @Override // defpackage.h92
    public u92 b() {
        a();
        u92 u92VarH = u92.h(null, this.e.build());
        nq0[] nq0VarArr = this.b;
        r92 r92Var = u92VarH.a;
        r92Var.t(nq0VarArr);
        r92Var.s(null);
        r92Var.x(this.c);
        r92Var.y(this.d);
        return u92VarH;
    }

    @Override // defpackage.h92
    public void e(nq0 nq0Var) {
        this.e.setMandatorySystemGestureInsets(nq0Var.d());
    }

    @Override // defpackage.h92
    public void f(nq0 nq0Var) {
        this.e.setStableInsets(nq0Var.d());
    }

    @Override // defpackage.h92
    public void g(nq0 nq0Var) {
        this.e.setSystemGestureInsets(nq0Var.d());
    }

    @Override // defpackage.h92
    public void h(nq0 nq0Var) {
        this.e.setSystemWindowInsets(nq0Var.d());
    }

    @Override // defpackage.h92
    public void i(nq0 nq0Var) {
        this.e.setTappableElementInsets(nq0Var.d());
    }

    public b92() {
        this.e = t12.g();
    }
}
