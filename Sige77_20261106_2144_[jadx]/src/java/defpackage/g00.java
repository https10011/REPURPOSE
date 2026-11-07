package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g00 implements kr1 {
    public final lf1 a;
    public final Deflater b;
    public boolean c;

    public g00(lf1 lf1Var, Deflater deflater) {
        this.a = lf1Var;
        this.b = deflater;
    }

    public final void a(boolean z) throws IOException {
        yn1 yn1VarM;
        int iDeflate;
        lf1 lf1Var = this.a;
        ji jiVar = lf1Var.b;
        while (true) {
            yn1VarM = jiVar.M(1);
            byte[] bArr = yn1VarM.a;
            int i = yn1VarM.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                yn1VarM.c += iDeflate;
                jiVar.b += (long) iDeflate;
                lf1Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (yn1VarM.b == yn1VarM.c) {
            jiVar.a = yn1VarM.a();
            ao1.a(yn1VarM);
        }
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        deflater.finish();
        a(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.a.a.d();
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) throws IOException {
        kv.l(jiVar.b, 0L, j);
        while (true) {
            Deflater deflater = this.b;
            if (j <= 0) {
                deflater.setInput(xi0.c, 0, 0);
                return;
            }
            yn1 yn1Var = jiVar.a;
            yn1Var.getClass();
            int iMin = (int) Math.min(j, yn1Var.c - yn1Var.b);
            deflater.setInput(yn1Var.a, yn1Var.b, iMin);
            a(false);
            long j2 = iMin;
            jiVar.b -= j2;
            int i = yn1Var.b + iMin;
            yn1Var.b = i;
            if (i == yn1Var.c) {
                jiVar.a = yn1Var.a();
                ao1.a(yn1Var);
            }
            j -= j2;
        }
    }

    @Override // defpackage.kr1, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.a.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }
}
