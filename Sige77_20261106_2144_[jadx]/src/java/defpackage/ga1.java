package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ga1 implements kr1 {
    public final FileOutputStream a;
    public final vx1 b;

    public ga1(FileOutputStream fileOutputStream, vx1 vx1Var) {
        this.a = fileOutputStream;
        this.b = vx1Var;
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.b;
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) throws IOException {
        kv.l(jiVar.b, 0L, j);
        while (j > 0) {
            this.b.f();
            yn1 yn1Var = jiVar.a;
            yn1Var.getClass();
            int iMin = (int) Math.min(j, yn1Var.c - yn1Var.b);
            this.a.write(yn1Var.a, yn1Var.b, iMin);
            int i = yn1Var.b + iMin;
            yn1Var.b = i;
            long j2 = iMin;
            j -= j2;
            jiVar.b -= j2;
            if (i == yn1Var.c) {
                jiVar.a = yn1Var.a();
                ao1.a(yn1Var);
            }
        }
    }

    @Override // defpackage.kr1, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }
}
