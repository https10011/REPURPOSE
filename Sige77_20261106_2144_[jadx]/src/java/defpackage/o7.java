package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o7 implements a91 {
    public final /* synthetic */ p7 a;

    public o7(p7 p7Var) {
        this.a = p7Var;
    }

    @Override // defpackage.a91
    public final void a() {
        p7 p7Var = this.a;
        y7 delegate = p7Var.getDelegate();
        delegate.a();
        p7Var.getSavedStateRegistry().a("androidx:appcompat");
        delegate.e();
    }
}
