package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z extends b0 {
    @Override // defpackage.b0
    public final Object q(Object obj, Throwable th) {
        bc bcVar = (bc) obj;
        ListenableFuture listenableFutureApply = bcVar.apply(th);
        yv2.k(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bcVar);
        return listenableFutureApply;
    }

    @Override // defpackage.b0
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
