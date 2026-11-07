package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sz extends g80 {
    public static final sz d;
    public dt c;

    static {
        int i = pw1.c;
        int i2 = pw1.d;
        long j = pw1.e;
        String str = pw1.a;
        sz szVar = new sz();
        szVar.c = new dt(str, i, i2, j);
        d = szVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        this.c.b(runnable, false);
    }

    @Override // defpackage.ys
    public final String toString() {
        return "Dispatchers.Default";
    }
}
