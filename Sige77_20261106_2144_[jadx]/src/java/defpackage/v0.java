package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
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
public abstract class v0 implements ListenableFuture {
    public static final boolean d;
    public static final Logger e;
    public static final xi0 f;
    public static final Object i;
    public volatile Object a;
    public volatile j0 b;
    public volatile u0 c;

    static {
        boolean z;
        Throwable th;
        xi0 m0Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(v0.class.getName());
        Throwable th2 = null;
        try {
            m0Var = new t0();
            th = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                m0Var = new k0(AtomicReferenceFieldUpdater.newUpdater(u0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(u0.class, u0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v0.class, u0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(v0.class, j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "a"));
            } catch (Throwable th4) {
                th2 = th4;
                m0Var = new m0();
            }
        }
        f = m0Var;
        if (th2 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        i = new Object();
    }

    public static void e(v0 v0Var) {
        j0 j0Var = null;
        while (true) {
            for (u0 u0VarI = f.i(v0Var); u0VarI != null; u0VarI = u0VarI.b) {
                Thread thread = u0VarI.a;
                if (thread != null) {
                    u0VarI.a = null;
                    LockSupport.unpark(thread);
                }
            }
            v0Var.c();
            j0 j0Var2 = j0Var;
            j0 j0VarH = f.h(v0Var);
            j0 j0Var3 = j0Var2;
            while (j0VarH != null) {
                j0 j0Var4 = j0VarH.c;
                j0VarH.c = j0Var3;
                j0Var3 = j0VarH;
                j0VarH = j0Var4;
            }
            while (j0Var3 != null) {
                j0Var = j0Var3.c;
                Runnable runnable = j0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof l0) {
                    l0 l0Var = (l0) runnable;
                    v0Var = l0Var.a;
                    if (v0Var.a == l0Var) {
                        if (f.d(v0Var, l0Var, h(l0Var.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = j0Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                j0Var3 = j0Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            e.log(level, sb.toString(), (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof g0) {
            Throwable th = ((g0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof i0) {
            throw new ExecutionException(((i0) obj).a);
        }
        if (obj == i) {
            return null;
        }
        return obj;
    }

    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thO;
        if (listenableFuture instanceof n0) {
            Object g0Var = ((v0) listenableFuture).a;
            if (g0Var instanceof g0) {
                g0 g0Var2 = (g0) g0Var;
                if (g0Var2.a) {
                    g0Var = g0Var2.b != null ? new g0(g0Var2.b, false) : g0.d;
                }
            }
            Objects.requireNonNull(g0Var);
            return g0Var;
        }
        if ((listenableFuture instanceof v0) && (thO = ((v0) listenableFuture).o()) != null) {
            return new i0(thO);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            g0 g0Var3 = g0.d;
            Objects.requireNonNull(g0Var3);
            return g0Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (zIsCancelled) {
                    return new g0(e2, false);
                }
                String strValueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 77);
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(strValueOf);
                return new i0(new IllegalArgumentException(sb.toString(), e2));
            } catch (ExecutionException e3) {
                if (!zIsCancelled) {
                    return new i0(e3.getCause());
                }
                String strValueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(strValueOf2);
                return new g0(new IllegalArgumentException(sb2.toString(), e3), false);
            } catch (Throwable th2) {
                return new i0(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? i : obj;
        }
        String strValueOf3 = String.valueOf(listenableFuture);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
        sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb3.append(strValueOf3);
        return new g0(new IllegalArgumentException(sb3.toString()), false);
    }

    public void a(Runnable runnable, Executor executor) {
        j0 j0Var;
        j0 j0Var2 = j0.d;
        yv2.l(executor, "Executor was null.");
        if (!isDone() && (j0Var = this.b) != j0Var2) {
            j0 j0Var3 = new j0(runnable, executor);
            do {
                j0Var3.c = j0Var;
                if (f.c(this, j0Var, j0Var3)) {
                    return;
                } else {
                    j0Var = this.b;
                }
            } while (j0Var != j0Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    public boolean cancel(boolean z) {
        g0 g0Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof l0)) {
            return false;
        }
        if (d) {
            g0Var = new g0(new CancellationException("Future.cancel() was called."), z);
        } else {
            g0Var = z ? g0.c : g0.d;
            Objects.requireNonNull(g0Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.d(this, obj, g0Var)) {
                if (z) {
                    this.i();
                }
                e(this);
                if (obj instanceof l0) {
                    ListenableFuture listenableFuture = ((l0) obj).b;
                    if (listenableFuture instanceof n0) {
                        this = (v0) listenableFuture;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof l0)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof l0)) {
                return z2;
            }
        }
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        u0 u0Var = u0.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof l0))) {
            return g(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            u0 u0Var2 = this.c;
            if (u0Var2 != u0Var) {
                u0 u0Var3 = new u0();
                z = true;
                while (true) {
                    xi0 xi0Var = f;
                    xi0Var.u(u0Var3, u0Var2);
                    if (xi0Var.e(this, u0Var2, u0Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(u0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof l0))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(u0Var3);
                        break;
                    }
                    long j4 = j3;
                    u0Var2 = this.c;
                    if (u0Var2 != u0Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof l0))) {
                return g(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + strConcat.length() + 21);
                sb2.append(strConcat);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + 33);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + string3.length() + 5);
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    public boolean isCancelled() {
        return this.a instanceof g0;
    }

    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof l0)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void k(u0 u0Var) {
        u0Var.a = null;
        while (true) {
            u0 u0Var2 = this.c;
            if (u0Var2 == u0.c) {
                return;
            }
            u0 u0Var3 = null;
            while (u0Var2 != null) {
                u0 u0Var4 = u0Var2.b;
                if (u0Var2.a != null) {
                    u0Var3 = u0Var2;
                } else if (u0Var3 != null) {
                    u0Var3.b = u0Var4;
                    if (u0Var3.a == null) {
                    }
                } else if (!f.e(this, u0Var2, u0Var4)) {
                }
                u0Var2 = u0Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = i;
        }
        if (!f.d(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.d(this, null, new i0(th))) {
            return false;
        }
        e(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean n(ListenableFuture listenableFuture) {
        i0 i0Var;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj != null) {
            if (obj instanceof g0) {
                listenableFuture.cancel(((g0) obj).a);
            }
        } else if (listenableFuture.isDone()) {
            if (f.d(this, null, h(listenableFuture))) {
                e(this);
                return true;
            }
        } else {
            l0 l0Var = new l0(this, listenableFuture);
            if (f.d(this, null, l0Var)) {
                try {
                    listenableFuture.a(l0Var, t10.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        i0Var = new i0(th);
                    } catch (Throwable unused) {
                        i0Var = i0.b;
                    }
                    f.d(this, l0Var, i0Var);
                    return true;
                }
            }
            obj = this.a;
            if (obj instanceof g0) {
                listenableFuture.cancel(((g0) obj).a);
            }
        }
        return false;
    }

    public final Throwable o() {
        if (!(this instanceof n0)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof i0) {
            return ((i0) obj).a;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.a;
        return (obj instanceof g0) && ((g0) obj).a;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof l0) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((l0) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    string = j();
                    if (sb1.a(string)) {
                        string = null;
                    }
                } catch (RuntimeException | StackOverflowError e4) {
                    String strValueOf = String.valueOf(e4.getClass());
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(strValueOf);
                    string = sb2.toString();
                }
                if (string != null) {
                    ts.q(sb, ", info=[", string, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    public void i() {
    }

    public Object get() throws InterruptedException {
        Object obj;
        u0 u0Var = u0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof l0))) {
                return g(obj2);
            }
            u0 u0Var2 = this.c;
            if (u0Var2 != u0Var) {
                u0 u0Var3 = new u0();
                do {
                    xi0 xi0Var = f;
                    xi0Var.u(u0Var3, u0Var2);
                    if (xi0Var.e(this, u0Var2, u0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(u0Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof l0))));
                        return g(obj);
                    }
                    u0Var2 = this.c;
                } while (u0Var2 != u0Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
