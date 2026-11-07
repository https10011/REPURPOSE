package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vy extends x70 implements Runnable {
    public static final vy Y;
    public static final long Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        vy vyVar = new vy();
        Y = vyVar;
        vyVar.m(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        Z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.x70
    public final Thread B() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(Y.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.x70
    public final void D(long j, v70 v70Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void T() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            M();
            notifyAll();
        }
    }

    @Override // defpackage.x70, defpackage.h00
    public final n20 b(long j, xx1 xx1Var, CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return g71.a;
        }
        long jNanoTime = System.nanoTime();
        u70 u70Var = new u70(j2 + jNanoTime, xx1Var);
        N(jNanoTime, u70Var);
        return u70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jx1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    T();
                    if (C()) {
                        return;
                    }
                    B();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jN = n();
                    if (jN == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = Z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            T();
                            if (C()) {
                                return;
                            }
                            B();
                            return;
                        }
                        if (jN > j2) {
                            jN = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jN > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            T();
                            if (C()) {
                                return;
                            }
                            B();
                            return;
                        }
                        LockSupport.parkNanos(this, jN);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            T();
            if (!C()) {
                B();
            }
            throw th;
        }
    }

    @Override // defpackage.x70, defpackage.s70
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.x70
    public final void t(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.t(runnable);
    }

    @Override // defpackage.ys
    public final String toString() {
        return "DefaultExecutor";
    }
}
