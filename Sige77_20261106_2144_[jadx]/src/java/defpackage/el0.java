package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class el0 implements kr1 {
    public final lf1 a;
    public final Deflater b;
    public final g00 c;
    public boolean d;
    public final CRC32 e;

    public el0(qi qiVar) {
        lf1 lf1Var = new lf1(qiVar);
        this.a = lf1Var;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new g00(lf1Var, deflater);
        this.e = new CRC32();
        ji jiVar = lf1Var.b;
        jiVar.W(8075);
        jiVar.S(8);
        jiVar.S(0);
        jiVar.V(0);
        jiVar.S(0);
        jiVar.S(0);
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        lf1 lf1Var = this.a;
        if (this.d) {
            return;
        }
        try {
            g00 g00Var = this.c;
            g00Var.b.finish();
            g00Var.a(false);
            int value = (int) this.e.getValue();
            boolean z = lf1Var.c;
            ji jiVar = lf1Var.b;
            if (z) {
                throw new IllegalStateException("closed");
            }
            jiVar.V(kv.Z(value));
            lf1Var.a();
            int bytesRead = (int) deflater.getBytesRead();
            if (lf1Var.c) {
                throw new IllegalStateException("closed");
            }
            jiVar.V(kv.Z(bytesRead));
            lf1Var.a();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                lf1Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.a.a.d();
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) throws IOException {
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return;
        }
        if (j == 0) {
            return;
        }
        yn1 yn1Var = jiVar.a;
        yn1Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, yn1Var.c - yn1Var.b);
            this.e.update(yn1Var.a, yn1Var.b, iMin);
            j2 -= (long) iMin;
            yn1Var = yn1Var.f;
            yn1Var.getClass();
        }
        this.c.f(jiVar, j);
    }

    @Override // defpackage.kr1, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }
}
