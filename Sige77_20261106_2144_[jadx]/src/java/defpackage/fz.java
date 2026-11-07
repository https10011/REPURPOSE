package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fz extends g80 implements Executor {
    public static final fz c = new fz();
    public static final ys d;

    static {
        v22 v22Var = v22.c;
        int i = vv1.a;
        if (64 >= i) {
            i = 64;
        }
        d = v22Var.j(ta.E(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        d.e(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(g.a, runnable);
    }

    @Override // defpackage.ys
    public final String toString() {
        return "Dispatchers.IO";
    }
}
