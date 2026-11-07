package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uj1 extends bt0 {
    public final ct0 v;

    public uj1(ct0 ct0Var) {
        this.v = ct0Var;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return false;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        Object objX = p().x();
        boolean z = objX instanceof vp;
        ct0 ct0Var = this.v;
        if (z) {
            pj1 pj1Var = rj1.b;
            ct0Var.resumeWith(zi0.i(((vp) objX).a));
        } else {
            pj1 pj1Var2 = rj1.b;
            ct0Var.resumeWith(yv2.W(objX));
        }
    }
}
