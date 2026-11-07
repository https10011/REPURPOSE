package defpackage;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xe0 extends AbstractExecutorService implements AutoCloseable {
    public static final se0 X;
    public static final RuntimePermission Y;
    public static final xe0 Z;
    public static final int a0;
    public static final int b0;
    public static final Unsafe c0;
    public static final long d0;
    public static final long e0;
    public static final int f0;
    public static final int g0;
    public static final Class h0;
    public final Thread.UncaughtExceptionHandler W;
    public volatile long a;
    public volatile long b;
    public final long c;
    public int d;
    public final int e;
    public volatile int f;
    public we0[] i;
    public final String v;
    public final te0 w;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    static {
        Unsafe unsafe = y22.a;
        c0 = unsafe;
        try {
            d0 = unsafe.objectFieldOffset(xe0.class.getDeclaredField("a"));
            e0 = unsafe.objectFieldOffset(xe0.class.getDeclaredField("f"));
            f0 = unsafe.arrayBaseOffset(df0[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(df0[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            g0 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            b0 = i;
            X = new se0();
            Y = new RuntimePermission("modifyThread");
            xe0 xe0Var = (xe0) AccessController.doPrivileged(new qe0(0));
            Z = xe0Var;
            a0 = Math.max(xe0Var.f & 65535, 1);
            h0 = mp.class;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public xe0() {
        te0 ue0Var;
        int iAvailableProcessors = -1;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            iAvailableProcessors = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            ue0Var = (te0) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            ue0Var = null;
        }
        ue0Var = ue0Var == null ? System.getSecurityManager() == null ? X : new ue0() : ue0Var;
        if (iAvailableProcessors < 0 && (iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            iAvailableProcessors = 1;
        }
        iAvailableProcessors = iAvailableProcessors > 32767 ? 32767 : iAvailableProcessors;
        long j = -iAvailableProcessors;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - iAvailableProcessors) & 65535) | (b0 << 16);
        int i2 = iAvailableProcessors > 1 ? iAvailableProcessors - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.v = "ForkJoinPool.commonPool-worker-";
        this.i = new we0[((i6 | (i6 >>> 16)) + 1) << 1];
        this.w = ue0Var;
        this.W = uncaughtExceptionHandler;
        this.c = 60000L;
        this.e = i;
        this.f = iAvailableProcessors;
        this.a = j2;
    }

    public static AccessControlContext b(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    public static void l(xe0 xe0Var, long j, long j2) {
        while (true) {
            Unsafe unsafe = c0;
            long longVolatile = unsafe.getLongVolatile(xe0Var, j);
            xe0 xe0Var2 = xe0Var;
            long j3 = j;
            if (unsafe.compareAndSwapLong(xe0Var2, j3, longVolatile, longVolatile + j2)) {
                return;
            }
            xe0Var = xe0Var2;
            j = j3;
        }
    }

    public static Object m(Object obj, long j) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = c0;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!pe0.a(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public static void n(Executor executor, op opVar) {
        int i;
        we0 we0Var;
        we0[] we0VarArr;
        int length;
        int i2;
        int length2;
        if (!(executor instanceof xe0)) {
            return;
        }
        xe0 xe0Var = (xe0) executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof ff0) {
            ff0 ff0Var = (ff0) threadCurrentThread;
            if (ff0Var.a == xe0Var) {
                we0Var = ff0Var.b;
            } else {
                i = ((yv1) zv1.g.get()).a;
                if (i != 0 || (we0VarArr = xe0Var.i) == null || (length = we0VarArr.length) <= 0) {
                    we0Var = null;
                } else {
                    we0Var = we0VarArr[i & (length - 1) & 126];
                }
            }
        } else {
            i = ((yv1) zv1.g.get()).a;
            if (i != 0) {
                we0Var = null;
            } else {
                we0Var = null;
            }
        }
        if (we0Var == null) {
            return;
        }
        while (true) {
            int i3 = we0Var.f;
            int i4 = we0Var.g;
            df0[] df0VarArr = we0Var.h;
            if (df0VarArr == null || (i2 = i3 - i4) >= 0 || (length2 = df0VarArr.length) <= 0) {
                return;
            }
            long j = (((long) ((length2 - 1) & i3)) << g0) + ((long) f0);
            Unsafe unsafe = c0;
            df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j);
            if (opVar.q()) {
                return;
            }
            int i5 = i3 + 1;
            if (i3 == we0Var.f) {
                if (df0Var != null) {
                    Class cls = h0;
                    if (!(cls != null ? cls.isAssignableFrom(df0Var.getClass()) : false)) {
                        return;
                    }
                    if (oe0.a(unsafe, df0VarArr, j, df0Var)) {
                        we0Var.f = i5;
                        df0Var.c();
                    }
                } else if (i2 == -1) {
                    return;
                }
            }
        }
    }

    public static void q(op opVar) {
        ff0 ff0Var;
        xe0 xe0Var;
        we0 we0Var;
        long j = opVar.w;
        long j2 = d0;
        Thread threadCurrentThread = Thread.currentThread();
        long j3 = 0;
        if (!(threadCurrentThread instanceof ff0) || (xe0Var = (ff0Var = (ff0) threadCurrentThread).a) == null || (we0Var = ff0Var.b) == null) {
            if (opVar.q()) {
                return;
            }
            while (!opVar.q()) {
                if (j == 0) {
                    LockSupport.park(opVar);
                } else {
                    LockSupport.parkNanos(opVar, opVar.v);
                }
            }
            return;
        }
        while (!opVar.q()) {
            int iB = xe0Var.B(we0Var);
            if (iB != 0) {
                try {
                    if (!opVar.q()) {
                        while (!opVar.q()) {
                            if (j == 0) {
                                LockSupport.park(opVar);
                            } else {
                                LockSupport.parkNanos(opVar, opVar.v);
                            }
                        }
                    }
                    return;
                } finally {
                    l(xe0Var, j2, iB > 0 ? 281474976710656L : 0L);
                }
            }
        }
    }

    public final void A(long j) {
        xe0 xe0Var;
        long j2 = j;
        while (true) {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((4294967296L + j2) & 281470681743360L);
            if (this.a == j2) {
                xe0Var = this;
                if (c0.compareAndSwapLong(xe0Var, d0, j2, j3)) {
                    xe0Var.e();
                    return;
                }
            } else {
                xe0Var = this;
            }
            j2 = xe0Var.a;
            if ((140737488355328L & j2) == 0 || ((int) j2) != 0) {
                return;
            } else {
                this = xe0Var;
            }
        }
    }

    public final int B(we0 we0Var) {
        int length;
        Thread.State state;
        long j = this.a;
        we0[] we0VarArr = this.i;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (we0VarArr != null && (length = we0VarArr.length) > 0 && we0Var != null) {
                int i = (int) j;
                if (i != 0) {
                    we0 we0Var2 = we0VarArr[i & (length - 1)];
                    int i2 = we0Var.a;
                    long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                    int i3 = i & Integer.MAX_VALUE;
                    if (we0Var2 != null) {
                        int i4 = we0Var2.a;
                        ff0 ff0Var = we0Var2.j;
                        long j3 = j2 | (((long) we0Var2.b) & 4294967295L);
                        if (i4 == i && c0.compareAndSwapLong(this, d0, j, j3)) {
                            we0Var2.a = i3;
                            if (we0Var2.e < 0) {
                                LockSupport.unpark(ff0Var);
                            }
                            return i2 < 0 ? -1 : 1;
                        }
                    }
                    return 0;
                }
                if (((int) (j >> 48)) - ((short) (this.e & 65535)) > 0) {
                    return c0.compareAndSwapLong(this, d0, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
                }
                int i5 = this.f & 65535;
                int i6 = i5 + s;
                int i7 = i6;
                int i8 = 0;
                for (int i9 = 1; i9 < length; i9 += 2) {
                    we0 we0Var3 = we0VarArr[i9];
                    if (we0Var3 != null) {
                        if (we0Var3.e != 0) {
                            i7--;
                            ff0 ff0Var2 = we0Var3.j;
                            if (ff0Var2 != null && ((state = ff0Var2.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                                i8++;
                            }
                        }
                    }
                }
                if (i7 == 0 && this.a == j) {
                    if (i6 >= 32767 || s >= (this.e >>> 16)) {
                        if (i8 >= i5) {
                            throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
                        }
                        Thread.yield();
                        return 0;
                    }
                }
            }
            return 0;
        }
        return (c0.compareAndSwapLong(this, d0, j, ((-281470681743361L) & j) | ((4294967296L + j) & 281470681743360L)) && e()) ? 1 : 0;
    }

    public final boolean C(df0 df0Var) {
        int length;
        we0 we0Var;
        int i = ((yv1) zv1.g.get()).a;
        we0[] we0VarArr = this.i;
        return we0VarArr != null && (length = we0VarArr.length) > 0 && (we0Var = we0VarArr[(i & (length - 1)) & 126]) != null && we0Var.h(df0Var);
    }

    public final boolean D(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        xe0 xe0Var = this;
        while (true) {
            int i6 = xe0Var.f;
            if ((i6 & 262144) != 0) {
                while (true) {
                    int i7 = xe0Var.f;
                    int i8 = Integer.MIN_VALUE;
                    int i9 = 65535;
                    long j = 0;
                    int i10 = 1;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        while ((xe0Var.f & 524288) == 0) {
                            long j2 = 0;
                            while (true) {
                                long j3 = xe0Var.a;
                                we0[] we0VarArr = xe0Var.i;
                                if (we0VarArr != null) {
                                    for (we0 we0Var : we0VarArr) {
                                        if (we0Var != null) {
                                            ff0 ff0Var = we0Var.j;
                                            while (true) {
                                                df0 df0VarD = we0Var.d();
                                                if (df0VarD == null) {
                                                    break;
                                                }
                                                if (df0VarD.a >= 0) {
                                                    df0VarD.cancel(false);
                                                }
                                            }
                                            if (ff0Var != null) {
                                                try {
                                                    ff0Var.interrupt();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            j3 = (((long) we0Var.a) << 32) + ((long) we0Var.f) + j3;
                                        }
                                    }
                                }
                                long j4 = j2;
                                i = xe0Var.f;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (xe0Var.i != we0VarArr) {
                                    j2 = j4;
                                } else {
                                    if (j4 == j3) {
                                        break;
                                    }
                                    j2 = j3;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (xe0Var.a >>> 32)) > 0) {
                                break;
                            }
                            if (c0.compareAndSwapInt(xe0Var, e0, i, 524288 | i)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                break;
                            }
                            xe0Var = this;
                        }
                        return true;
                    }
                    if (!z) {
                        while (true) {
                            long j5 = xe0Var.a;
                            we0[] we0VarArr2 = xe0Var.i;
                            if ((i7 & i9) + ((int) (j5 >> 48)) > 0) {
                                i3 = i8;
                                i4 = i9;
                                i5 = i10;
                            } else if (we0VarArr2 != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < we0VarArr2.length) {
                                        we0 we0Var2 = we0VarArr2[i11];
                                        if (we0Var2 != null) {
                                            int i12 = we0Var2.e;
                                            int i13 = we0Var2.a;
                                            i3 = i8;
                                            int i14 = we0Var2.d;
                                            i4 = i9;
                                            int i15 = we0Var2.f;
                                            if (i15 != we0Var2.g || ((i14 & 1) == i10 && (i12 >= 0 || i13 >= 0))) {
                                                i5 = i10;
                                                i10 = i5;
                                            } else {
                                                j5 = (((long) i12) << 48) + (((long) i13) << 32) + (((long) i15) << 16) + ((long) i14) + j5;
                                            }
                                        } else {
                                            i3 = i8;
                                            i4 = i9;
                                        }
                                        i11++;
                                        i8 = i3;
                                        i9 = i4;
                                        i10 = i10;
                                    } else {
                                        i3 = i8;
                                        i4 = i9;
                                        i5 = i10;
                                        i10 = 0;
                                    }
                                }
                            } else {
                                i3 = i8;
                                i4 = i9;
                                i5 = i10;
                                i10 = 0;
                            }
                            i7 = xe0Var.f;
                            if ((i7 & i3) != 0) {
                                break;
                            }
                            if (i10 != 0) {
                                break;
                            }
                            if (xe0Var.i == we0VarArr2) {
                                if (j == j5) {
                                    break;
                                }
                                j = j5;
                            }
                            i8 = i3;
                            i9 = i4;
                            i10 = i5;
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    int i16 = i7;
                    if ((i16 & i3) == 0) {
                        c0.compareAndSwapInt(xe0Var, e0, i16, i16 | i3);
                    }
                }
            } else {
                if (!z2 || xe0Var == Z) {
                    break;
                }
                c0.compareAndSwapInt(xe0Var, e0, i6, 262144 | i6);
            }
        }
        return false;
    }

    public final int a(we0 we0Var, df0 df0Var, long j) {
        long j2;
        we0 we0Var2;
        df0[] df0VarArr;
        int length;
        if (we0Var == null) {
            return 0;
        }
        we0Var.g(df0Var);
        int i = we0Var.e;
        int i2 = we0Var.d;
        int i3 = df0Var.a;
        while (i3 >= 0) {
            boolean z = true;
            int iC = zv1.c() | 1;
            we0[] we0VarArr = this.i;
            if (we0VarArr == null) {
                z = false;
                break;
            }
            int length2 = we0VarArr.length;
            int i4 = length2 - 1;
            int i5 = -length2;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                int i6 = (iC + i5) & i4;
                if (i6 >= 0 && i6 < length2 && (we0Var2 = we0VarArr[i6]) != null && we0Var2.e == i2) {
                    int i7 = we0Var2.f;
                    if (i7 - we0Var2.g < 0 && (df0VarArr = we0Var2.h) != null && (length = df0VarArr.length) > 0) {
                        int i8 = we0Var2.d;
                        long j3 = (((long) ((length - 1) & i7)) << g0) + ((long) f0);
                        Unsafe unsafe = c0;
                        df0 df0Var2 = (df0) unsafe.getObjectVolatile(df0VarArr, j3);
                        if (df0Var2 == null) {
                            break;
                        }
                        int i9 = i7 + 1;
                        if (i7 != we0Var2.f || i2 != we0Var2.e || !oe0.a(unsafe, df0VarArr, j3, df0Var2)) {
                            break;
                            break;
                            break;
                        }
                        we0Var2.f = i9;
                        we0Var.e = i8;
                        df0Var2.c();
                        we0Var.e = i;
                        break;
                    }
                }
                i5 += 2;
            }
            int i10 = df0Var.a;
            if (i10 >= 0) {
                if (!z) {
                    if (j == 0) {
                        j2 = 0;
                    } else {
                        long jNanoTime = j - System.nanoTime();
                        if (jNanoTime > 0) {
                            j2 = jNanoTime / 1000000;
                            if (j2 <= 0) {
                                j2 = 1;
                            }
                        }
                    }
                    int iB = B(we0Var);
                    if (iB != 0) {
                        df0Var.l(j2);
                        l(this, d0, iB > 0 ? 281474976710656L : 0L);
                    }
                    i10 = df0Var.a;
                }
                i3 = i10;
            }
            return i10;
        }
        return i3;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this == Z) {
            long nanos = timeUnit.toNanos(j);
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof ff0) {
                ff0 ff0Var = (ff0) threadCurrentThread;
                if (ff0Var.a == this) {
                    p(ff0Var.b);
                    return false;
                }
            }
            long jNanoTime = System.nanoTime();
            loop0: while (true) {
                df0 df0VarS = s();
                if (df0VarS != null) {
                    df0VarS.c();
                } else {
                    while (true) {
                        long j2 = this.a;
                        int i = this.f;
                        int i2 = 65535 & i;
                        int i3 = ((short) (j2 >>> 32)) + i2;
                        int i4 = i2 + ((int) (j2 >> 48));
                        if ((i & (-2146959360)) != 0) {
                            break loop0;
                        }
                        if (i4 > 0) {
                            break;
                        }
                        we0[] we0VarArr = this.i;
                        if (we0VarArr != null) {
                            for (int i5 = 1; i5 < we0VarArr.length; i5 += 2) {
                                we0 we0Var = we0VarArr[i5];
                                if (we0Var != null) {
                                    if ((we0Var.e & 1073741824) == 0) {
                                        break;
                                    }
                                    i3--;
                                }
                            }
                        }
                        if (i3 == 0 && this.a == j2) {
                            break loop0;
                        }
                    }
                    if (System.nanoTime() - jNanoTime > nanos) {
                        break;
                    }
                    Thread.yield();
                }
            }
        } else {
            long nanos2 = timeUnit.toNanos(j);
            if (isTerminated()) {
                return true;
            }
            if (nanos2 > 0) {
                long jNanoTime2 = System.nanoTime() + nanos2;
                synchronized (this) {
                    while (!isTerminated()) {
                        try {
                            if (nanos2 <= 0) {
                                return false;
                            }
                            long j3 = nanos2 / 1000000;
                            if (j3 <= 0) {
                                j3 = 1;
                            }
                            wait(j3);
                            nanos2 = jNanoTime2 - System.nanoTime();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean e() {
        ff0 ff0VarA;
        te0 te0Var = this.w;
        Throwable th = null;
        if (te0Var != null) {
            try {
                ff0VarA = te0Var.a(this);
                if (ff0VarA != null) {
                    try {
                        ff0VarA.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                ff0VarA = null;
            }
        } else {
            ff0VarA = null;
        }
        i(ff0VarA, th);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        j(runnable instanceof df0 ? (df0) runnable : new cf0(runnable));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0046 A[LOOP:0: B:29:0x0046->B:64:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c A[LOOP:1: B:32:0x006c->B:66:0x006c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[EDGE_INSN: B:65:0x007a->B:38:0x007a BREAK  A[LOOP:1: B:32:0x006c->B:66:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x006c A[SYNTHETIC] */
    public final void i(ff0 ff0Var, Throwable th) {
        we0 we0Var;
        int i;
        ReentrantLock reentrantLock;
        df0 df0VarD;
        Unsafe unsafe;
        long j;
        long j2;
        if (ff0Var != null) {
            we0 we0Var2 = ff0Var.b;
            if (we0Var2 != null) {
                String str = this.v;
                long j3 = ((long) we0Var2.c) & 4294967295L;
                int i2 = we0Var2.d & 65535;
                if (str != null) {
                    synchronized (str) {
                        try {
                            we0[] we0VarArr = this.i;
                            if (we0VarArr != null && we0VarArr.length > i2 && we0VarArr[i2] == we0Var2) {
                                we0VarArr[i2] = null;
                            }
                            this.b += j3;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                i = we0Var2.a;
                we0Var = we0Var2;
            } else {
                we0Var = we0Var2;
            }
            if (i != 1073741824) {
                do {
                    unsafe = c0;
                    j = d0;
                    j2 = this.a;
                } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - 4294967296L) & 281470681743360L) | (j2 & 4294967295L)));
            }
            if (we0Var != null) {
                while (true) {
                    df0VarD = we0Var.d();
                    if (df0VarD != null) {
                        break;
                    } else if (df0VarD.a >= 0) {
                        df0VarD.cancel(false);
                    }
                }
            }
            if (!D(false, false) && we0Var != null && we0Var.h != null) {
                x();
            }
            if (th == null) {
                bf0[] bf0VarArr = df0.b;
                throw th;
            }
            reentrantLock = df0.c;
            if (reentrantLock.tryLock()) {
                try {
                    df0.f();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        we0Var = null;
        i = 0;
        if (i != 1073741824) {
            do {
                unsafe = c0;
                j = d0;
                j2 = this.a;
            } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - 4294967296L) & 281470681743360L) | (j2 & 4294967295L)));
        }
        if (we0Var != null) {
            while (true) {
                df0VarD = we0Var.d();
                if (df0VarD != null) {
                    break;
                    break;
                } else if (df0VarD.a >= 0) {
                    df0VarD.cancel(false);
                }
            }
        }
        if (!D(false, false)) {
            x();
        }
        if (th == null) {
            bf0[] bf0VarArr2 = df0.b;
            throw th;
        }
        reentrantLock = df0.c;
        if (reentrantLock.tryLock()) {
            df0.f();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ye0 ye0Var = new ye0((Callable) it.next());
                arrayList.add(ye0Var);
                j(ye0Var);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((df0) arrayList.get(i)).d();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f & 262144) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f & 524288) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    public final void j(df0 df0Var) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        we0 we0Var;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof ff0) {
            ff0 ff0Var = (ff0) threadCurrentThread;
            if (ff0Var.a == this && (we0Var = ff0Var.b) != null) {
                we0Var.e(df0Var);
                return;
            }
        }
        xv1 xv1Var = zv1.g;
        int i = ((yv1) xv1Var.get()).a;
        if (i == 0) {
            int iAddAndGet = zv1.h.addAndGet(-1640531527);
            if (iAddAndGet == 0) {
                iAddAndGet = 1;
            }
            zv1.i.getAndAdd(-4942790177534073029L);
            ((yv1) xv1Var.get()).getClass();
            ((yv1) xv1Var.get()).a = iAddAndGet;
            i = ((yv1) xv1Var.get()).a;
        }
        while (true) {
            int i2 = this.f;
            we0[] we0VarArr = this.i;
            if ((i2 & 262144) != 0 || we0VarArr == null || (length = we0VarArr.length) <= 0) {
                break;
            }
            we0 we0Var2 = we0VarArr[(length - 1) & i & 126];
            if (we0Var2 == null) {
                String str = this.v;
                int i3 = (i | 1073741824) & (-65538);
                we0 we0Var3 = new we0(this, null);
                we0Var3.d = i3;
                we0Var3.e = 1073741824;
                we0Var3.a = 1;
                if (str != null) {
                    synchronized (str) {
                        try {
                            we0[] we0VarArr2 = this.i;
                            if (we0VarArr2 == null || (length4 = we0VarArr2.length) <= 0) {
                                z = false;
                            } else {
                                int i4 = i3 & (length4 - 1) & 126;
                                if (we0VarArr2[i4] == null) {
                                    we0VarArr2[i4] = we0Var3;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            z2 = z;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                we0Var2 = we0Var3;
            } else if (we0Var2.f()) {
                int i5 = we0Var2.f;
                int i6 = we0Var2.g;
                df0[] df0VarArr = we0Var2.h;
                if (df0VarArr == null || (length2 = df0VarArr.length) <= 0) {
                    z2 = true;
                } else {
                    int i7 = length2 - 1;
                    int i8 = i5 - i6;
                    if (i7 + i8 > 0) {
                        df0VarArr[i7 & i6] = df0Var;
                        we0Var2.g = i6 + 1;
                        we0Var2.a = 0;
                        if (i8 < 0 && we0Var2.f - i6 < -1) {
                            return;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                }
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                if (z2) {
                    try {
                        we0Var2.a();
                        int i9 = we0Var2.g;
                        df0[] df0VarArr2 = we0Var2.h;
                        if (df0VarArr2 != null && (length3 = df0VarArr2.length) > 0) {
                            df0VarArr2[(length3 - 1) & i9] = df0Var;
                            we0Var2.g = i9 + 1;
                        }
                        we0Var2.a = 0;
                    } catch (Throwable th2) {
                        we0Var2.a = 0;
                        throw th2;
                    }
                }
                x();
                return;
            }
            int i10 = (i << 13) ^ i;
            int i11 = i10 ^ (i10 >>> 17);
            i = (i11 << 5) ^ i11;
            ((yv1) zv1.g.get()).a = i;
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new ze0(runnable, obj);
    }

    public final void p(we0 we0Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        we0 we0Var2;
        df0[] df0VarArr;
        int i3 = we0Var.e;
        int i4 = we0Var.d & 65536;
        byte b = -1;
        int i5 = i3;
        byte b2 = -1;
        while (true) {
            if (i4 != 0) {
                we0Var.b(0);
            } else {
                we0Var.c(0);
            }
            if (b2 == b && we0Var.a >= 0) {
                b2 = 1;
            }
            int iC = zv1.c();
            we0[] we0VarArr = this.i;
            long j = 281474976710656L;
            if (we0VarArr != null) {
                int length = we0VarArr.length;
                int i6 = length - 1;
                int i7 = length;
                z2 = true;
                while (true) {
                    if (i7 <= 0) {
                        i = 1073741824;
                        z = true;
                        break;
                    }
                    int i8 = (iC - i7) & i6;
                    if (i8 >= 0 && i8 < length && (we0Var2 = we0VarArr[i8]) != null) {
                        int i9 = we0Var2.f;
                        if (i9 - we0Var2.g < 0 && (df0VarArr = we0Var2.h) != null) {
                            i = 1073741824;
                            int length2 = df0VarArr.length;
                            if (length2 > 0) {
                                if (b2 == 0) {
                                    l(this, d0, j);
                                    b2 = 1;
                                }
                                long j2 = (((long) ((length2 - 1) & i9)) << g0) + ((long) f0);
                                Unsafe unsafe = c0;
                                df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j2);
                                if (df0Var != null) {
                                    int i10 = i9 + 1;
                                    if (i9 == we0Var2.f && oe0.a(unsafe, df0VarArr, j2, df0Var)) {
                                        we0Var2.f = i10;
                                        we0Var.e = we0Var2.d;
                                        df0Var.c();
                                        we0Var.e = i3;
                                        i5 = i3;
                                    }
                                }
                                z = false;
                                z2 = false;
                                break;
                            }
                        } else {
                            i = 1073741824;
                        }
                        if ((we0Var2.e & i) == 0) {
                            z2 = false;
                        }
                    }
                    i7--;
                    j = 281474976710656L;
                }
            } else {
                i = 1073741824;
                z = true;
                z2 = true;
            }
            if (z2) {
                break;
            }
            if (z) {
                int i11 = i;
                if (i5 != i11) {
                    we0Var.e = i11;
                    i2 = i11;
                } else {
                    i2 = i5;
                }
                if (b2 == 1) {
                    l(this, d0, -281474976710656L);
                    i5 = i2;
                    b2 = 0;
                } else {
                    i5 = i2;
                }
            }
            b = -1;
        }
        if (b2 == 0) {
            l(this, d0, 281474976710656L);
        }
        we0Var.e = i3;
    }

    public final df0 s() {
        we0[] we0VarArr;
        int length;
        we0 we0Var;
        int i;
        df0[] df0VarArr;
        int length2;
        while ((this.f & Integer.MIN_VALUE) == 0 && (we0VarArr = this.i) != null && (length = we0VarArr.length) > 0) {
            int i2 = length - 1;
            int iC = zv1.c();
            int i3 = iC >>> 16;
            int i4 = iC & i2;
            int i5 = i3 | 1;
            int i6 = i4;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                we0Var = we0VarArr[i6];
                if (we0Var != null) {
                    i = we0Var.f;
                    i7 += i;
                    if (i - we0Var.g < 0 && (df0VarArr = we0Var.h) != null && (length2 = df0VarArr.length) > 0) {
                        break;
                    }
                }
                i6 = (i6 + i5) & i2;
                if (i6 == i4) {
                    if (i8 == i7) {
                        return null;
                    }
                    i8 = i7;
                    i7 = 0;
                }
            }
            long j = (((long) ((length2 - 1) & i)) << g0) + ((long) f0);
            Unsafe unsafe = c0;
            df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j);
            if (df0Var != null) {
                int i9 = i + 1;
                if (i == we0Var.f && oe0.a(unsafe, df0VarArr, j, df0Var)) {
                    we0Var.f = i9;
                    return df0Var;
                }
            }
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(Y);
        }
        D(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(Y);
        }
        D(true, true);
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        df0 af0Var = runnable instanceof df0 ? (df0) runnable : new af0(runnable);
        j(af0Var);
        return af0Var;
    }

    public final we0 t(ff0 ff0Var) {
        int i;
        int length;
        ff0Var.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.W;
        if (uncaughtExceptionHandler != null) {
            ff0Var.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        we0 we0Var = new we0(this, ff0Var);
        int i2 = this.f & 65536;
        String str = this.v;
        if (str == null) {
            return we0Var;
        }
        synchronized (str) {
            try {
                we0[] we0VarArr = this.i;
                int i3 = this.d - 1640531527;
                this.d = i3;
                i = 0;
                if (we0VarArr != null && (length = we0VarArr.length) > 1) {
                    int i4 = length - 1;
                    int i5 = i3 & i4;
                    int i6 = ((i3 << 1) | 1) & i4;
                    int i7 = length >>> 1;
                    while (true) {
                        we0 we0Var2 = we0VarArr[i6];
                        if (we0Var2 == null || we0Var2.a == 1073741824) {
                            break;
                            break;
                        }
                        i7--;
                        if (i7 == 0) {
                            i6 = length | 1;
                            break;
                        }
                        i6 = (i6 + 2) & i4;
                    }
                    int i8 = i2 | i6 | (i3 & 1073610752);
                    we0Var.d = i8;
                    we0Var.a = i8;
                    if (i6 < length) {
                        we0VarArr[i6] = we0Var;
                    } else {
                        int i9 = length << 1;
                        we0[] we0VarArr2 = new we0[i9];
                        we0VarArr2[i6] = we0Var;
                        int i10 = i9 - 1;
                        while (i < length) {
                            we0 we0Var3 = we0VarArr[i];
                            if (we0Var3 != null) {
                                we0VarArr2[we0Var3.d & i10 & 126] = we0Var3;
                            }
                            int i11 = i + 1;
                            if (i11 >= length) {
                                break;
                            }
                            we0VarArr2[i11] = we0VarArr[i11];
                            i += 2;
                        }
                        this.i = we0VarArr2;
                    }
                    i = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ff0Var.setName(str.concat(Integer.toString(i)));
        return we0Var;
    }

    public final String toString() {
        int i;
        String str;
        Thread.State state;
        long j = this.b;
        we0[] we0VarArr = this.i;
        long j2 = 0;
        long j3 = 0;
        if (we0VarArr != null) {
            i = 0;
            for (int i2 = 0; i2 < we0VarArr.length; i2++) {
                we0 we0Var = we0VarArr[i2];
                if (we0Var != null) {
                    int i3 = we0Var.f - we0Var.g;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j3 += (long) i4;
                    } else {
                        j2 += (long) i4;
                        j += ((long) we0Var.c) & 4294967295L;
                        ff0 ff0Var = we0Var.j;
                        if (ff0Var != null && (state = ff0Var.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        int i5 = this.f;
        int i6 = 65535 & i5;
        long j4 = this.a;
        int i7 = ((short) (j4 >>> 32)) + i6;
        int i8 = ((int) (j4 >> 48)) + i6;
        int i9 = i8 >= 0 ? i8 : 0;
        if ((524288 & i5) != 0) {
            str = "Terminated";
        } else if ((Integer.MIN_VALUE & i5) != 0) {
            str = "Terminating";
        } else {
            str = (i5 & 262144) != 0 ? "Shutting down" : "Running";
        }
        StringBuilder sb = new StringBuilder();
        ts.r(sb, super.toString(), "[", str, ", parallelism = ");
        sb.append(i6);
        sb.append(", size = ");
        sb.append(i7);
        sb.append(", active = ");
        sb.append(i9);
        sb.append(", running = ");
        sb.append(i);
        sb.append(", steals = ");
        sb.append(j);
        sb.append(", tasks = ");
        sb.append(j2);
        sb.append(", submissions = ");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x00b4 A[EDGE_INSN: B:99:0x00b4->B:48:0x00b4 BREAK  A[LOOP:1: B:9:0x001c->B:46:0x00aa], SYNTHETIC] */
    public final void w(we0 we0Var) {
        we0 we0Var2;
        int i;
        boolean z;
        long j;
        int i2;
        we0 we0Var3;
        df0[] df0VarArr;
        int length;
        xe0 xe0Var = this;
        we0 we0Var4 = we0Var;
        we0Var4.a();
        int iC = we0Var4.d ^ zv1.c();
        if (iC == 0) {
            iC = 1;
        }
        int i3 = 0;
        while (true) {
            we0[] we0VarArr = xe0Var.i;
            if (we0VarArr == null) {
                return;
            }
            int length2 = we0VarArr.length;
            int i4 = length2 - 1;
            int i5 = iC;
            int i6 = length2;
            boolean z2 = false;
            while (true) {
                if (i6 <= 0) {
                    we0Var2 = we0Var4;
                    i = 65536;
                    break;
                }
                int i7 = i5 & i4;
                if (i7 < 0 || i7 >= length2 || (we0Var3 = we0VarArr[i7]) == null) {
                    i2 = i6;
                    we0Var2 = we0Var4;
                    i = 65536;
                    if (z2) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    int i8 = we0Var3.f;
                    if (i8 - we0Var3.g >= 0 || (df0VarArr = we0Var3.h) == null || (length = df0VarArr.length) <= 0) {
                        i2 = i6;
                        we0Var2 = we0Var4;
                        i = 65536;
                        if (z2) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i9 = we0Var3.d;
                        long j2 = (((long) ((length - 1) & i8)) << g0) + ((long) f0);
                        Unsafe unsafe = c0;
                        df0 df0Var = (df0) unsafe.getObjectVolatile(df0VarArr, j2);
                        if (df0Var != null) {
                            int i10 = i8 + 1;
                            i2 = i6;
                            if (i8 == we0Var3.f && oe0.a(unsafe, df0VarArr, j2, df0Var)) {
                                we0Var3.f = i10;
                                if (i10 - we0Var3.g < 0 && i9 != i3) {
                                    xe0Var.x();
                                }
                                we0Var2 = we0Var;
                                we0Var2.e = i9;
                                df0Var.c();
                                if ((we0Var2.d & 65536) != 0) {
                                    we0Var2.b(1024);
                                } else {
                                    we0Var2.c(1024);
                                }
                                ff0 ff0Var = we0Var2.j;
                                we0Var2.c++;
                                we0Var2.e = 0;
                                if (ff0Var != null) {
                                    ff0Var.a();
                                }
                                i3 = i9;
                            } else {
                                we0Var2 = we0Var;
                            }
                        } else {
                            we0Var2 = we0Var;
                            i2 = i6;
                        }
                        z2 = true;
                    }
                }
                i6 = i2 - 1;
                we0Var4 = we0Var2;
            }
            if (z2) {
                int i11 = (i5 << 13) ^ i5;
                int i12 = i11 ^ (i11 >>> 17);
                iC = i12 ^ (i12 << 5);
            } else {
                int i13 = we0Var2.a;
                if (i13 >= 0) {
                    int i14 = (i13 + i) | Integer.MIN_VALUE;
                    we0Var2.a = i14;
                    do {
                        j = xe0Var.a;
                        we0Var2.b = (int) j;
                    } while (!c0.compareAndSwapLong(xe0Var, d0, j, (((long) i14) & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i15 = we0Var2.b;
                    we0Var2.e = -1073741824;
                    int i16 = 0;
                    while (we0Var2.a < 0) {
                        int i17 = xe0Var.f;
                        if (i17 < 0) {
                            return;
                        }
                        long j3 = xe0Var.a;
                        int i18 = (65535 & i17) + ((int) (j3 >> 48));
                        if (i18 > 0 || (i17 & 262144) == 0) {
                            z = false;
                        } else {
                            z = false;
                            if (xe0Var.D(false, false)) {
                                return;
                            }
                        }
                        int i19 = i16 + 1;
                        if ((i19 & 1) == 0) {
                            Thread.interrupted();
                        } else {
                            if (i18 > 0 || i15 == 0 || i13 != ((int) j3)) {
                                LockSupport.park(this);
                            } else {
                                long jCurrentTimeMillis = System.currentTimeMillis() + xe0Var.c;
                                LockSupport.parkUntil(xe0Var, jCurrentTimeMillis);
                                if (xe0Var.a == j3 && jCurrentTimeMillis - System.currentTimeMillis() <= 20) {
                                    if (c0.compareAndSwapLong(xe0Var, d0, j3, (((long) i15) & 4294967295L) | ((j3 - 4294967296L) & (-4294967296L)))) {
                                        we0Var2.a = 1073741824;
                                        return;
                                    }
                                }
                            }
                            xe0Var = this;
                            i16 = i19;
                        }
                        xe0Var = this;
                        i16 = i19;
                    }
                    we0Var2.e = 0;
                }
                iC = i5;
                i3 = 0;
            }
            we0Var4 = we0Var2;
        }
    }

    public final void x() {
        int i;
        we0 we0Var;
        xe0 xe0Var;
        while (true) {
            long j = this.a;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    this.A(j);
                    return;
                }
                return;
            }
            we0[] we0VarArr = this.i;
            if (we0VarArr == null || we0VarArr.length <= (i = 65535 & i2) || (we0Var = we0VarArr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = we0Var.a;
            long j2 = (((long) we0Var.b) & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            ff0 ff0Var = we0Var.j;
            if (i2 == i4) {
                xe0Var = this;
                if (c0.compareAndSwapLong(xe0Var, d0, j, j2)) {
                    we0Var.a = i3;
                    if (we0Var.e < 0) {
                        LockSupport.unpark(ff0Var);
                        return;
                    }
                    return;
                }
            } else {
                xe0Var = this;
            }
            this = xe0Var;
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new ye0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        ye0 ye0Var = new ye0(callable);
        j(ye0Var);
        return ye0Var;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        ze0 ze0Var = new ze0(runnable, obj);
        j(ze0Var);
        return ze0Var;
    }
}
