package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface kr1 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    vx1 d();

    void f(ji jiVar, long j);

    void flush();
}
