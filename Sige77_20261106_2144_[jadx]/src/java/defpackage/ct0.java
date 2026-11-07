package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ct0 extends pk {
    public final lt0 X;

    public ct0(fs fsVar, lt0 lt0Var) {
        super(1, fsVar);
        this.X = lt0Var;
    }

    @Override // defpackage.pk
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.pk
    public final Throwable q(lt0 lt0Var) {
        Throwable thD;
        Object objX = this.X.x();
        if (!(objX instanceof et0) || (thD = ((et0) objX).d()) == null) {
            return objX instanceof vp ? ((vp) objX).a : lt0Var.getCancellationException();
        }
        return thD;
    }
}
