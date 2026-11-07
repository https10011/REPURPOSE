package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class p1 implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(p1.class.getName());
    public static final zi0 f;
    public static final Object i;
    public volatile Object a;
    public volatile l1 b;
    public volatile o1 c;

    static {
        zi0 n1Var;
        try {
            n1Var = new m1(AtomicReferenceFieldUpdater.newUpdater(o1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o1.class, o1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p1.class, o1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(p1.class, l1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            n1Var = new n1();
        }
        f = n1Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i = new Object();
    }

    public static void d(p1 p1Var) {
        o1 o1Var;
        l1 l1Var;
        l1 l1Var2;
        l1 l1Var3;
        do {
            o1Var = p1Var.c;
        } while (!f.e(p1Var, o1Var, o1.c));
        while (true) {
            l1Var = null;
            if (o1Var == null) {
                break;
            }
            Thread thread = o1Var.a;
            if (thread != null) {
                o1Var.a = null;
                LockSupport.unpark(thread);
            }
            o1Var = o1Var.b;
        }
        p1Var.c();
        do {
            l1Var2 = p1Var.b;
        } while (!f.c(p1Var, l1Var2, l1.d));
        while (true) {
            l1Var3 = l1Var;
            l1Var = l1Var2;
            if (l1Var == null) {
                break;
            }
            l1Var2 = l1Var.c;
            l1Var.c = l1Var3;
        }
        while (l1Var3 != null) {
            l1 l1Var4 = l1Var3.c;
            e(l1Var3.a, l1Var3.b);
            l1Var3 = l1Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof j1) {
            Throwable th = ((j1) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof k1) {
            throw new ExecutionException(((k1) obj).a);
        }
        if (obj == i) {
            return null;
        }
        return obj;
    }

    public static Object g(p1 p1Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = p1Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(Runnable runnable, Executor executor) {
        l1 l1Var = this.b;
        l1 l1Var2 = l1.d;
        if (l1Var != l1Var2) {
            l1 l1Var3 = new l1(runnable, executor);
            do {
                l1Var3.c = l1Var;
                if (f.c(this, l1Var, l1Var3)) {
                    return;
                } else {
                    l1Var = this.b;
                }
            } while (l1Var != l1Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public final boolean cancel(boolean z) {
        j1 j1Var;
        Object obj = this.a;
        if (obj == null) {
            if (d) {
                j1Var = new j1(new CancellationException("Future.cancel() was called."), z);
            } else {
                j1Var = z ? j1.c : j1.d;
            }
            if (f.d(this, obj, j1Var)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        o1 o1Var = o1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o1 o1Var2 = this.c;
            if (o1Var2 != o1Var) {
                o1 o1Var3 = new o1();
                while (true) {
                    zi0 zi0Var = f;
                    zi0Var.s(o1Var3, o1Var2);
                    if (zi0Var.e(this, o1Var2, o1Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(o1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(o1Var3);
                        break;
                    }
                    o1Var2 = this.c;
                    if (o1Var2 == o1Var) {
                    }
                }
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(o1 o1Var) {
        o1Var.a = null;
        while (true) {
            o1 o1Var2 = this.c;
            if (o1Var2 == o1.c) {
                return;
            }
            o1 o1Var3 = null;
            while (o1Var2 != null) {
                o1 o1Var4 = o1Var2.b;
                if (o1Var2.a != null) {
                    o1Var3 = o1Var2;
                } else if (o1Var3 != null) {
                    o1Var3.b = o1Var4;
                    if (o1Var3.a == null) {
                    }
                } else if (!f.e(this, o1Var2, o1Var4)) {
                }
                o1Var2 = o1Var4;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.a instanceof j1;
    }

    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = i;
        }
        if (!f.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f.d(this, null, new k1(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof j1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                ts.q(sb, "PENDING, info=[", strH, "]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public final Object get() throws InterruptedException {
        Object obj;
        o1 o1Var = o1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            o1 o1Var2 = this.c;
            if (o1Var2 != o1Var) {
                o1 o1Var3 = new o1();
                do {
                    zi0 zi0Var = f;
                    zi0Var.s(o1Var3, o1Var2);
                    if (zi0Var.e(this, o1Var2, o1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(o1Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    o1Var2 = this.c;
                } while (o1Var2 != o1Var);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
