package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nr0 extends AtomicReference implements Runnable {
    public static final e10 a;
    public static final e10 b;

    static {
        int i = 2;
        a = new e10(i);
        b = new e10(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        e10 e10Var = b;
        e10 e10Var2 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            mr0 mr0Var = new mr0(this);
            mr0.a(mr0Var, Thread.currentThread());
            if (compareAndSet(runnable, mr0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(e10Var2)) == e10Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        mr0 mr0Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof mr0;
            e10 e10Var = b;
            if (!z2 && runnable != e10Var) {
                break;
            }
            if (z2) {
                mr0Var = (mr0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == e10Var || compareAndSet(runnable, e10Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(mr0Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            e10 e10Var = a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, e10Var)) {
                        g(threadCurrentThread);
                    }
                    if (zD) {
                        return;
                    }
                    a(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, e10Var)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            string = "running=[DONE]";
        } else if (runnable instanceof mr0) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strF = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strF).length() + string.length() + 2);
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strF);
        return sb2.toString();
    }
}
