package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uz implements kr1 {
    public final OutputStream a;
    public final xr1 b;
    public final /* synthetic */ ep1 c;

    public uz(ep1 ep1Var) {
        this.c = ep1Var;
        Socket socket = (Socket) ep1Var.b;
        this.a = socket.getOutputStream();
        this.b = new xr1(socket);
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.a;
        ep1 ep1Var = this.c;
        xr1 xr1Var = this.b;
        xr1Var.h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) ep1Var.c;
                Socket socket = (Socket) ep1Var.b;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    xr1Var.i();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    xr1Var.i();
                    return;
                }
                socket.close();
                Unit unit = Unit.a;
                if (xr1Var.i()) {
                    throw xr1Var.j(null);
                }
            } catch (Throwable th) {
                xr1Var.i();
                throw th;
            }
        } catch (IOException e) {
            if (!xr1Var.i()) {
                throw e;
            }
            throw xr1Var.j(e);
        }
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.b;
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) throws IOException {
        kv.l(jiVar.b, 0L, j);
        while (j > 0) {
            xr1 xr1Var = this.b;
            xr1Var.f();
            yn1 yn1Var = jiVar.a;
            yn1Var.getClass();
            int iMin = (int) Math.min(j, yn1Var.c - yn1Var.b);
            xr1Var.h();
            try {
                try {
                    this.a.write(yn1Var.a, yn1Var.b, iMin);
                    Unit unit = Unit.a;
                    if (xr1Var.i()) {
                        throw xr1Var.j(null);
                    }
                    int i = yn1Var.b + iMin;
                    yn1Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    jiVar.b -= j2;
                    if (i == yn1Var.c) {
                        jiVar.a = yn1Var.a();
                        ao1.a(yn1Var);
                    }
                } catch (IOException e) {
                    if (!xr1Var.i()) {
                        throw e;
                    }
                    throw xr1Var.j(e);
                }
            } catch (Throwable th) {
                xr1Var.i();
                throw th;
            }
        }
    }

    @Override // defpackage.kr1, java.io.Flushable
    public final void flush() throws IOException {
        xr1 xr1Var = this.b;
        xr1Var.h();
        try {
            try {
                this.a.flush();
                Unit unit = Unit.a;
                if (xr1Var.i()) {
                    throw xr1Var.j(null);
                }
            } catch (IOException e) {
                if (!xr1Var.i()) {
                    throw e;
                }
                throw xr1Var.j(e);
            }
        } catch (Throwable th) {
            xr1Var.i();
            throw th;
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
