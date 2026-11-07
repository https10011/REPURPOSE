package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class l92 extends k92 {
    public nq0 s;
    public nq0 t;
    public nq0 u;

    public l92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.r92
    public nq0 i() {
        if (this.t == null) {
            this.t = nq0.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.r92
    public nq0 k() {
        if (this.s == null) {
            this.s = nq0.c(this.c.getSystemGestureInsets());
        }
        return this.s;
    }

    @Override // defpackage.r92
    public nq0 m() {
        if (this.u == null) {
            this.u = nq0.c(this.c.getTappableElementInsets());
        }
        return this.u;
    }

    @Override // defpackage.i92, defpackage.r92
    public u92 p(int i, int i2, int i3, int i4) {
        return u92.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.j92, defpackage.r92
    public void v(nq0 nq0Var) {
    }
}
