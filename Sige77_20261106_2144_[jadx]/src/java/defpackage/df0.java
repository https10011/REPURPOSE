package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class df0 implements Future, Serializable {
    public static final bf0[] b = new bf0[32];
    public static final ReentrantLock c = new ReentrantLock();
    public static final ReferenceQueue d = new ReferenceQueue();
    public static final Unsafe e;
    public static final long f;
    public volatile int a;

    static {
        Unsafe unsafe = y22.a;
        e = unsafe;
        try {
            f = unsafe.objectFieldOffset(df0.class.getDeclaredField("a"));
        } catch (Exception e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void f() {
        while (true) {
            Reference referencePoll = d.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof bf0) {
                int i = ((bf0) referencePoll).d & 31;
                bf0[] bf0VarArr = b;
                bf0 bf0Var = bf0VarArr[i];
                bf0 bf0Var2 = null;
                while (bf0Var != null) {
                    bf0 bf0Var3 = bf0Var.b;
                    if (bf0Var == referencePoll) {
                        if (bf0Var2 != null) {
                            bf0Var2.b = bf0Var3;
                            break;
                        } else {
                            bf0VarArr[i] = bf0Var3;
                            break;
                        }
                    }
                    bf0Var2 = bf0Var;
                    bf0Var = bf0Var3;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            n((Throwable) object);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object cancellationException;
        objectOutputStream.defaultWriteObject();
        int i = this.a & (-268435456);
        if (i >= -268435456) {
            cancellationException = null;
        } else {
            cancellationException = i == -1073741824 ? new CancellationException() : j();
        }
        objectOutputStream.writeObject(cancellationException);
    }

    public final boolean b() {
        while (true) {
            int i = this.a;
            if (((short) i) != 0) {
                return false;
            }
            df0 df0Var = this;
            if (e.compareAndSwapInt(df0Var, f, i, ((-65536) & i) | 1)) {
                return true;
            }
            this = df0Var;
        }
    }

    public final int c() {
        int i = this.a;
        if (i >= 0) {
            try {
                if (e()) {
                    return m(-268435456);
                }
            } catch (Throwable th) {
                return n(th);
            }
        }
        return i;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m(-1073741824) & (-268435456)) == -1073741824;
    }

    public final int d() {
        int length;
        int i = this.a;
        if (i < 0) {
            return i;
        }
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof ff0)) {
            return g();
        }
        ff0 ff0Var = (ff0) threadCurrentThread;
        we0 we0Var = ff0Var.b;
        int i2 = we0Var.f;
        int i3 = we0Var.g;
        df0[] df0VarArr = we0Var.h;
        if (df0VarArr != null && i2 != i3 && (length = df0VarArr.length) > 0) {
            int i4 = i3 - 1;
            if (oe0.a(we0.k, df0VarArr, (((long) ((length - 1) & i4)) << we0.n) + ((long) we0.m), this)) {
                we0Var.g = i4;
                ve0.b();
                int iC = c();
                if (iC < 0) {
                    return iC;
                }
            }
        }
        return ff0Var.a.a(we0Var, this, 0L);
    }

    public abstract boolean e();

    public final int g() {
        boolean z = false;
        int iC = xe0.Z.C(this) ? c() : 0;
        if (iC < 0 || (iC = this.a) < 0) {
            return iC;
        }
        int i = iC;
        while (true) {
            df0 df0Var = this;
            if (e.compareAndSwapInt(df0Var, f, i, i | 65536)) {
                synchronized (df0Var) {
                    if (df0Var.a >= 0) {
                        try {
                            df0Var.wait(0L);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        df0Var.notifyAll();
                    }
                }
            }
            i = df0Var.a;
            if (i < 0) {
                break;
            }
            this = df0Var;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        df0 df0Var;
        int i;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iC = this.a;
        if (iC < 0 || nanos <= 0) {
            df0Var = this;
        } else {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof ff0) {
                ff0 ff0Var = (ff0) threadCurrentThread;
                iC = ff0Var.a.a(ff0Var.b, this, jNanoTime);
            } else {
                iC = xe0.Z.C(this) ? c() : 0;
                if (iC >= 0) {
                    while (true) {
                        i = this.a;
                        if (i < 0) {
                            break;
                        }
                        long jNanoTime2 = jNanoTime - System.nanoTime();
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        long j2 = jNanoTime2 / 1000000;
                        if (j2 > 0) {
                            df0 df0Var2 = this;
                            if (e.compareAndSwapInt(df0Var2, f, i, i | 65536)) {
                                synchronized (df0Var2) {
                                    try {
                                        if (df0Var2.a >= 0) {
                                            df0Var2.wait(j2);
                                        } else {
                                            df0Var2.notifyAll();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            this = df0Var2;
                        }
                    }
                    df0Var = this;
                    iC = i;
                }
            }
            df0Var = this;
        }
        if (iC >= 0) {
            iC = df0Var.a;
        }
        int i2 = iC & (-268435456);
        if (i2 == -268435456) {
            return df0Var.i();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        }
        if (i2 != Integer.MIN_VALUE) {
            throw new TimeoutException();
        }
        throw new ExecutionException(df0Var.j());
    }

    public final int h() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iC = this.a;
        if (iC >= 0) {
            iC = xe0.Z.C(this) ? c() : 0;
            if (iC >= 0) {
                while (true) {
                    int i = this.a;
                    if (i < 0) {
                        return i;
                    }
                    df0 df0Var = this;
                    if (e.compareAndSwapInt(df0Var, f, i, i | 65536)) {
                        synchronized (df0Var) {
                            try {
                                if (df0Var.a >= 0) {
                                    df0Var.wait(0L);
                                } else {
                                    df0Var.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this = df0Var;
                }
            }
        }
        return iC;
    }

    public abstract Object i();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.a & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a < 0;
    }

    public final Throwable j() {
        Throwable th;
        int iIdentityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            f();
            bf0 bf0Var = b[iIdentityHashCode & 31];
            while (bf0Var != null && bf0Var.get() != this) {
                bf0Var = bf0Var.b;
            }
            reentrantLock.unlock();
            if (bf0Var == null || (th = bf0Var.a) == null) {
                return null;
            }
            if (bf0Var.c != Thread.currentThread().getId()) {
                try {
                    Constructor<?> constructor = null;
                    for (Constructor<?> constructor2 : th.getClass().getConstructors()) {
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(th);
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(null);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void l(long j) {
        int i = this.a;
        if (i < 0 || !e.compareAndSwapInt(this, f, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.a >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    public final int m(int i) {
        while (true) {
            int i2 = this.a;
            if (i2 < 0) {
                return i2;
            }
            df0 df0Var = this;
            if (e.compareAndSwapInt(df0Var, f, i2, i2 | i)) {
                if ((i2 >>> 16) == 0) {
                    return i;
                }
                synchronized (df0Var) {
                    df0Var.notifyAll();
                }
                return i;
            }
            this = df0Var;
        }
    }

    public final int n(Throwable th) {
        int iM = this.a;
        if (iM >= 0) {
            int iIdentityHashCode = System.identityHashCode(this);
            ReentrantLock reentrantLock = c;
            reentrantLock.lock();
            try {
                f();
                bf0[] bf0VarArr = b;
                int i = iIdentityHashCode & 31;
                bf0 bf0Var = bf0VarArr[i];
                while (true) {
                    if (bf0Var == null) {
                        bf0VarArr[i] = new bf0(this, th, bf0VarArr[i], d);
                        break;
                    }
                    if (bf0Var.get() == this) {
                        break;
                    }
                    bf0Var = bf0Var.b;
                }
                reentrantLock.unlock();
                iM = m(Integer.MIN_VALUE);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (((-268435456) & iM) == Integer.MIN_VALUE) {
            k(th);
        }
        return iM;
    }

    public void run() throws Throwable {
        int iC = c();
        if (iC >= 0) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof ff0) {
                ff0 ff0Var = (ff0) threadCurrentThread;
                iC = ff0Var.a.a(ff0Var.b, this, 0L);
            } else {
                iC = g();
            }
        }
        int i = iC & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable thJ = j();
            if (thJ == null) {
                throw new Error("Unknown Exception");
            }
            throw thJ;
        }
    }

    public void k(Throwable th) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        int iD = (Thread.currentThread() instanceof ff0 ? d() : h()) & (-268435456);
        if (iD == -1073741824) {
            throw new CancellationException();
        }
        if (iD != Integer.MIN_VALUE) {
            return i();
        }
        throw new ExecutionException(j());
    }
}
