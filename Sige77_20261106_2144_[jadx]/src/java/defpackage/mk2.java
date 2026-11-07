package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mk2 implements Closeable {
    public static final xv1 b = new xv1(2);
    public int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            e.b("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
