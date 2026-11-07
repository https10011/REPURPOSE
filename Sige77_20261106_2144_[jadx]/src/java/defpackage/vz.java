package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vz implements ds1 {
    public final InputStream a;
    public final xr1 b;
    public final /* synthetic */ ep1 c;

    public vz(ep1 ep1Var) {
        this.c = ep1Var;
        Socket socket = (Socket) ep1Var.b;
        this.a = socket.getInputStream();
        this.b = new xr1(socket);
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
        xr1 xr1Var = this.b;
        xr1Var.f();
        yn1 yn1VarM = jiVar.M(1);
        int iMin = (int) Math.min(j, 8192 - yn1VarM.c);
        try {
            xr1Var.h();
            try {
                try {
                    int i = this.a.read(yn1VarM.a, yn1VarM.c, iMin);
                    if (xr1Var.i()) {
                        throw xr1Var.j(null);
                    }
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
                } catch (IOException e) {
                    if (xr1Var.i()) {
                        throw xr1Var.j(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                xr1Var.i();
                throw th;
            }
        } catch (AssertionError e2) {
            if (hb2.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
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
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    xr1Var.i();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    xr1Var.i();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
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

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
