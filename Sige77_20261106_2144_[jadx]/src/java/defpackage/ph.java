package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ph implements kr1 {
    @Override // defpackage.kr1
    public final vx1 d() {
        return vx1.d;
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) throws EOFException {
        jiVar.skip(j);
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.kr1, java.io.Flushable
    public final void flush() {
    }
}
