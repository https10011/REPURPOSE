package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mn3 implements Runnable, Closeable {
    public bo3 a;
    public final boolean b = ta.N(Thread.currentThread());
    public boolean c;
    public boolean d;
    public final boolean e;

    public mn3(bo3 bo3Var, boolean z) {
        this.e = false;
        this.a = bo3Var;
        this.e = z;
    }

    public final void a(v0 v0Var) {
        if (this.c) {
            uq1.q("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.d) {
            uq1.q("Signal is already attached to future");
        } else {
            this.d = true;
            v0Var.a(this, t10.a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bo3 bo3Var = this.a;
        try {
            this.a = null;
            boolean z = this.d;
            if (!z) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.c = true;
                if (this.b && !z) {
                    ta.N(Thread.currentThread());
                }
            }
            if (bo3Var != null) {
                bo3Var.close();
            }
            if (this.e) {
                vm3.b(vm3.c(), kn3.i);
            }
        } catch (Throwable th) {
            if (bo3Var != null) {
                try {
                    bo3Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.c || !(z = this.d)) {
            ta.O().post(e10.d);
            return;
        }
        this.c = true;
        if (!this.b || z) {
            return;
        }
        ta.N(Thread.currentThread());
    }
}
