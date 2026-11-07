package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r1 extends t1 {
    @Override // defpackage.t1
    public final Object q(Object obj, Object obj2) {
        bc bcVar = (bc) obj;
        ListenableFuture listenableFutureApply = bcVar.apply(obj2);
        yv2.k(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bcVar);
        return listenableFutureApply;
    }

    @Override // defpackage.t1
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
