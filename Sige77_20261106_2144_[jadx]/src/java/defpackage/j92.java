package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class j92 extends i92 {
    public nq0 r;

    public j92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.r92
    public u92 b() {
        return u92.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.r92
    public u92 c() {
        return u92.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.r92
    public final nq0 j() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = nq0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.r92
    public boolean q() {
        return this.c.isConsumed();
    }

    @Override // defpackage.r92
    public void v(nq0 nq0Var) {
        this.r = nq0Var;
    }
}
