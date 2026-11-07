package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tw1 extends xi0 {
    public final /* synthetic */ xi0 h;
    public final /* synthetic */ vw1 i;

    public tw1(vw1 vw1Var, xi0 xi0Var) {
        this.i = vw1Var;
        this.h = xi0Var;
    }

    @Override // defpackage.xi0
    public final void q(int i) {
        this.i.n = true;
        this.h.q(i);
    }

    @Override // defpackage.xi0
    public final void r(Typeface typeface) {
        vw1 vw1Var = this.i;
        Typeface typefaceCreate = Typeface.create(typeface, vw1Var.d);
        vw1Var.p = typefaceCreate;
        vw1Var.n = true;
        this.h.s(typefaceCreate, false);
    }
}
