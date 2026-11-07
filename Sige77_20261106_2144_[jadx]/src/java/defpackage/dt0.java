package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dt0 extends bt0 {
    public final im W;
    public final Object X;
    public final lt0 v;
    public final et0 w;

    public dt0(lt0 lt0Var, et0 et0Var, im imVar, Object obj) {
        this.v = lt0Var;
        this.w = et0Var;
        this.W = imVar;
        this.X = obj;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return false;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        im imVar = this.W;
        im imVarG = lt0.G(imVar);
        lt0 lt0Var = this.v;
        et0 et0Var = this.w;
        Object obj = this.X;
        if (imVarG == null || !lt0Var.U(et0Var, imVarG, obj)) {
            et0Var.a.d(new ky0(2), 2);
            im imVarG2 = lt0.G(imVar);
            if (imVarG2 == null || !lt0Var.U(et0Var, imVarG2, obj)) {
                lt0Var.g(lt0Var.q(et0Var, obj));
            }
        }
    }
}
