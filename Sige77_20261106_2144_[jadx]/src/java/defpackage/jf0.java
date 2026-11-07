package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jf0 extends wd0 {
    public final ListenableFuture w;

    public jf0(ListenableFuture listenableFuture) {
        this.w = listenableFuture;
    }

    @Override // defpackage.v0
    public final void a(Runnable runnable, Executor executor) {
        this.w.a(runnable, executor);
    }

    @Override // defpackage.v0
    public final boolean cancel(boolean z) {
        return this.w.cancel(z);
    }

    @Override // defpackage.v0
    public final Object get() {
        return this.w.get();
    }

    @Override // defpackage.v0
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // defpackage.v0
    public final boolean isDone() {
        return this.w.isDone();
    }

    @Override // defpackage.v0
    public final String toString() {
        return this.w.toString();
    }

    @Override // defpackage.v0
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.get(j, timeUnit);
    }
}
