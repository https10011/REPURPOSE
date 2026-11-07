package defpackage;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ln implements Closeable, et {
    public final CoroutineContext a;

    public ln(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
    }

    @Override // defpackage.et
    public final CoroutineContext b() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ws0 ws0Var = (ws0) this.a.get(k42.c);
        if (ws0Var != null) {
            ws0Var.cancel(null);
        }
    }
}
