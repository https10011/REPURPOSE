package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gk implements ListenableFuture {
    public final WeakReference a;
    public final fk b = new fk(this);

    public gk(ek ekVar) {
        this.a = new WeakReference(ekVar);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        ek ekVar = (ek) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && ekVar != null) {
            ekVar.a = null;
            ekVar.b = null;
            ekVar.c.j(null);
        }
        return zCancel;
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.a instanceof j1;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
