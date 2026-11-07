package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lk extends xi0 {
    public final Typeface h;
    public final gk1 i;
    public boolean j;

    public lk(gk1 gk1Var, Typeface typeface) {
        this.h = typeface;
        this.i = gk1Var;
    }

    @Override // defpackage.xi0
    public final void q(int i) {
        if (this.j) {
            return;
        }
        go goVar = (go) this.i.b;
        if (goVar.l(this.h)) {
            goVar.j(false);
        }
    }

    @Override // defpackage.xi0
    public final void s(Typeface typeface, boolean z) {
        if (this.j) {
            return;
        }
        go goVar = (go) this.i.b;
        if (goVar.l(typeface)) {
            goVar.j(false);
        }
    }
}
