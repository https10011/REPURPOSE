package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sh extends e0 {
    public final Thread f;
    public final s70 i;

    public sh(CoroutineContext coroutineContext, Thread thread, s70 s70Var) {
        super(coroutineContext, true);
        this.f = thread;
        this.i = s70Var;
    }

    @Override // defpackage.lt0
    public final void g(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f;
        if (Intrinsics.areEqual(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
