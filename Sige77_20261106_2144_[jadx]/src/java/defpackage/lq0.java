package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lq0 implements ds1 {
    public final InputStream a;
    public final vx1 b;

    public lq0(InputStream inputStream, vx1 vx1Var) {
        inputStream.getClass();
        this.a = inputStream;
        this.b = vx1Var;
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) throws IOException {
        jiVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.b.f();
            yn1 yn1VarM = jiVar.M(1);
            int i = this.a.read(yn1VarM.a, yn1VarM.c, (int) Math.min(j, 8192 - yn1VarM.c));
            if (i != -1) {
                yn1VarM.c += i;
                long j2 = i;
                jiVar.b += j2;
                return j2;
            }
            if (yn1VarM.b != yn1VarM.c) {
                return -1L;
            }
            jiVar.a = yn1VarM.a();
            ao1.a(yn1VarM);
            return -1L;
        } catch (AssertionError e) {
            if (hb2.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
