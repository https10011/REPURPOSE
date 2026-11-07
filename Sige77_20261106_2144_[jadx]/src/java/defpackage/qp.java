package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qp implements Future {
    public static final kp c = new kp(null);
    public static final boolean d;
    public static final Executor e;
    public static final Unsafe f;
    public static final long i;
    public static final long v;
    public static final long w;
    public volatile Object a;
    public volatile np b;

    static {
        boolean z = xe0.a0 > 1;
        d = z;
        e = z ? xe0.Z : new iz2(3);
        Unsafe unsafe = y22.a;
        f = unsafe;
        try {
            i = unsafe.objectFieldOffset(qp.class.getDeclaredField("a"));
            v = unsafe.objectFieldOffset(qp.class.getDeclaredField("b"));
            w = unsafe.objectFieldOffset(np.class.getDeclaredField("i"));
        } catch (Exception e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static qp b(Executor executor, bv1 bv1Var) {
        qp qpVar = new qp();
        lp lpVar = new lp();
        lpVar.i = qpVar;
        lpVar.v = bv1Var;
        executor.execute(lpVar);
        return qpVar;
    }

    public static kp d(Object obj, Throwable th) {
        if (!(th instanceof wp)) {
            th = new wp(th);
        } else if (obj instanceof kp) {
            kp kpVar = (kp) obj;
            if (th == kpVar.a) {
                return kpVar;
            }
        }
        return new kp((RuntimeException) th);
    }

    public static void e(np npVar, np npVar2) {
        f.putOrderedObject(npVar, w, npVar2);
    }

    public static Object g(Object obj) throws ExecutionException, InterruptedException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        }
        if (!(obj instanceof kp)) {
            return obj;
        }
        Throwable th = ((kp) obj).a;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if ((th instanceof wp) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new ExecutionException(th);
    }

    public final void c() {
        np npVar;
        boolean zA = false;
        while (true) {
            npVar = this.b;
            if (npVar == null || npVar.o()) {
                break;
            }
            zA = ep.a(f, this, v, npVar, npVar.i);
        }
        if (npVar == null || zA) {
            return;
        }
        np npVar2 = npVar.i;
        np npVar3 = npVar;
        while (npVar2 != null) {
            np npVar4 = npVar2.i;
            if (!npVar2.o()) {
                dp.a(f, npVar3, w, npVar2, npVar4);
                return;
            } else {
                npVar3 = npVar2;
                npVar2 = npVar4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        if (this.a == null) {
            if (gp.a(f, this, i, new kp(new CancellationException()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        f();
        return z2 || isCancelled();
    }

    public final void f() {
        qp qpVar;
        while (true) {
            qp qpVarP = this;
            while (true) {
                np npVar = qpVarP.b;
                if (npVar != null) {
                    qpVar = qpVarP;
                } else if (qpVarP == this || (npVar = this.b) == null) {
                    return;
                } else {
                    qpVar = this;
                }
                np npVar2 = npVar;
                np npVar3 = npVar2.i;
                Unsafe unsafe = f;
                np npVar4 = npVar2;
                if (ep.a(unsafe, qpVar, v, npVar4, npVar3)) {
                    if (npVar3 != null) {
                        if (qpVar != this) {
                            while (!i(npVar4)) {
                            }
                        } else {
                            dp.a(unsafe, npVar4, w, npVar3, null);
                            npVar4 = npVar4;
                        }
                    }
                    qpVarP = npVar4.p(-1);
                    if (qpVarP == null) {
                        break;
                    }
                }
                qpVarP = qpVar;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        long nanos = timeUnit.toNanos(j);
        Object obj = this.a;
        if (obj == null) {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            boolean zInterrupted = false;
            boolean zI = false;
            op opVar = null;
            Object obj2 = null;
            while (!zInterrupted) {
                zInterrupted = Thread.interrupted();
                if (zInterrupted || (obj2 = this.a) != null || nanos <= 0) {
                    break;
                }
                if (opVar == null) {
                    opVar = new op(nanos, jNanoTime);
                    if (Thread.currentThread() instanceof ff0) {
                        xe0.n(e, opVar);
                    }
                } else if (zI) {
                    try {
                        xe0.q(opVar);
                        zInterrupted = opVar.X;
                        nanos = opVar.v;
                    } catch (InterruptedException unused) {
                        zInterrupted = true;
                    }
                } else {
                    zI = i(opVar);
                }
            }
            if (opVar != null) {
                opVar.Y = null;
                if (obj2 == null) {
                    c();
                }
            }
            if (obj2 != null) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                f();
                obj = obj2;
            } else {
                if (!zInterrupted) {
                    throw new TimeoutException();
                }
                obj = null;
            }
        }
        return g(obj);
    }

    public final void h(ra2 ra2Var, Executor executor) {
        if (d || executor != xe0.Z) {
            executor.getClass();
        } else {
            executor = e;
        }
        Object obj = this.a;
        if (obj == null) {
            pp ppVar = new pp(executor, new qp(), this, ra2Var);
            while (!i(ppVar)) {
                if (this.a != null) {
                    e(ppVar, null);
                    break;
                }
            }
            if (this.a != null) {
                ppVar.p(0);
                return;
            }
            return;
        }
        qp qpVar = new qp();
        if (obj instanceof kp) {
            Throwable th = ((kp) obj).a;
            if (th != null) {
                qpVar.a = d(obj, th);
                return;
            }
            obj = null;
        }
        try {
            if (executor != null) {
                executor.execute(new pp(null, qpVar, this, ra2Var));
            } else {
                ra2Var.a(obj);
                qpVar.a = c;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!(th instanceof wp)) {
                th = new wp(th);
            }
            qpVar.a = new kp(th);
        }
    }

    public final boolean i(np npVar) {
        np npVar2 = this.b;
        e(npVar, npVar2);
        return ip.a(f, this, v, npVar2, npVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object obj = this.a;
        return (obj instanceof kp) && (((kp) obj).a instanceof CancellationException);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final String toString() {
        String strG;
        Object obj = this.a;
        int i2 = 0;
        for (np npVar = this.b; npVar != null; npVar = npVar.i) {
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj == null) {
            strG = i2 == 0 ? "[Not completed]" : ts.g(i2, "[Not completed, ", " dependents]");
        } else if (obj instanceof kp) {
            kp kpVar = (kp) obj;
            if (kpVar.a != null) {
                strG = "[Completed exceptionally: " + kpVar.a + "]";
            } else {
                strG = "[Completed normally]";
            }
        } else {
            strG = "[Completed normally]";
        }
        sb.append(strG);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.a;
        if (obj == null) {
            if (!Thread.interrupted()) {
                boolean zI = false;
                op opVar = null;
                while (true) {
                    Object obj2 = this.a;
                    if (obj2 != null) {
                        if (opVar != null) {
                            opVar.Y = null;
                            if (opVar.X) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        f();
                        obj = obj2;
                        break;
                    }
                    if (opVar == null) {
                        opVar = new op(0L, 0L);
                        if (Thread.currentThread() instanceof ff0) {
                            xe0.n(e, opVar);
                        }
                    } else if (!zI) {
                        zI = i(opVar);
                    } else {
                        if (opVar.X) {
                            opVar.Y = null;
                            c();
                            obj = null;
                            break;
                        }
                        try {
                            xe0.q(opVar);
                        } catch (InterruptedException unused) {
                            opVar.X = true;
                        }
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return g(obj);
    }
}
