package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t53 extends i73 {
    public static final AtomicLong X = new AtomicLong(Long.MIN_VALUE);
    public final Semaphore W;
    public q53 c;
    public q53 d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final m53 i;
    public final m53 v;
    public final Object w;

    public t53(y53 y53Var) {
        super(y53Var);
        this.w = new Object();
        this.W = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.i = new m53(this, "Thread death: Uncaught exception on worker thread");
        this.v = new m53(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.lo2
    public final void D() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        uq1.q("Call expected from worker thread");
    }

    @Override // defpackage.i73
    public final boolean F() {
        return false;
    }

    public final void I() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        uq1.q("Call expected from network thread");
    }

    public final void J() {
        if (Thread.currentThread() != this.c) {
            return;
        }
        uq1.q("Call not expected from worker thread");
    }

    public final boolean K() {
        return Thread.currentThread() == this.c;
    }

    public final o53 L(Callable callable) {
        G();
        o53 o53Var = new o53(this, callable, false);
        if (Thread.currentThread() != this.c) {
            R(o53Var);
            return o53Var;
        }
        if (!this.e.isEmpty()) {
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.w.a("Callable skipped the worker queue.");
        }
        o53Var.run();
        return o53Var;
    }

    public final o53 M(Callable callable) {
        G();
        o53 o53Var = new o53(this, callable, true);
        if (Thread.currentThread() == this.c) {
            o53Var.run();
            return o53Var;
        }
        R(o53Var);
        return o53Var;
    }

    public final void N(Runnable runnable) {
        G();
        gu2.o(runnable);
        R(new o53(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object O(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            t53 t53Var = ((y53) this.a).i;
            y53.l(t53Var);
            t53Var.N(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                c33 c33Var = ((y53) this.a).f;
                y53.l(c33Var);
                z23 z23Var = c33Var.w;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                z23Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            c33 c33Var2 = ((y53) this.a).f;
            y53.l(c33Var2);
            c33Var2.w.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void P(Runnable runnable) {
        G();
        R(new o53(this, runnable, true, "Task exception on worker thread"));
    }

    public final void Q(Runnable runnable) {
        G();
        o53 o53Var = new o53(this, runnable, false, "Task exception on network thread");
        synchronized (this.w) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f;
                linkedBlockingQueue.add(o53Var);
                q53 q53Var = this.d;
                if (q53Var == null) {
                    q53 q53Var2 = new q53(this, "Measurement Network", linkedBlockingQueue);
                    this.d = q53Var2;
                    q53Var2.setUncaughtExceptionHandler(this.v);
                    this.d.start();
                } else {
                    Object obj = q53Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R(o53 o53Var) {
        synchronized (this.w) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(o53Var);
                q53 q53Var = this.c;
                if (q53Var == null) {
                    q53 q53Var2 = new q53(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = q53Var2;
                    q53Var2.setUncaughtExceptionHandler(this.i);
                    this.c.start();
                } else {
                    Object obj = q53Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
