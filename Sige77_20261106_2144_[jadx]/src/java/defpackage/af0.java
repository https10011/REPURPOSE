package defpackage;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class af0 extends df0 implements RunnableFuture {
    public final Runnable i;

    public af0(Runnable runnable) {
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

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.i + "]";
    }
}
