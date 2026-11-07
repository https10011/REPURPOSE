package defpackage;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ze0 extends df0 implements RunnableFuture {
    public final Runnable i;
    public final Object v;

    public ze0(Runnable runnable, Object obj) {
        runnable.getClass();
        this.i = runnable;
        this.v = obj;
    }

    @Override // defpackage.df0
    public final boolean e() {
        this.i.run();
        return true;
    }

    @Override // defpackage.df0
    public final Object i() {
        return this.v;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.i + "]";
    }
}
