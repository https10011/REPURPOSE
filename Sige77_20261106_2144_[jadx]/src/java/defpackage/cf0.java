package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cf0 extends df0 {
    public final Runnable i;

    public cf0(Runnable runnable) {
        this.i = runnable;
    }

    @Override // defpackage.df0
    public final boolean e() {
        this.i.run();
        return true;
    }

    @Override // defpackage.df0
    public final /* bridge */ /* synthetic */ Object i() {
        return null;
    }

    @Override // defpackage.df0
    public final void k(Throwable th) throws Throwable {
        throw th;
    }
}
