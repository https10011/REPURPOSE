package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class x70 extends s70 implements h00 {
    public static final /* synthetic */ long W;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ AtomicIntegerFieldUpdater w;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = fe3.a;
        X = unsafe.objectFieldOffset(x70.class.getDeclaredField("_queue$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "_delayed$volatile");
        W = unsafe.objectFieldOffset(x70.class.getDeclaredField("_delayed$volatile"));
        w = AtomicIntegerFieldUpdater.newUpdater(x70.class, "_isCompleted$volatile");
    }

    public final long A() {
        v70 v70Var;
        fb fbVar = this.e;
        if (((fbVar == null || fbVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, X);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xz0) {
                    long j = xz0.f.get((xz0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == y21.b) {
                    return Long.MAX_VALUE;
                }
            }
            v.getClass();
            w70 w70Var = (w70) unsafe.getObjectVolatile(this, W);
            if (w70Var != null) {
                synchronized (w70Var) {
                    v70[] v70VarArr = w70Var.a;
                    v70Var = v70VarArr != null ? v70VarArr[0] : null;
                }
                if (v70Var != null) {
                    long jNanoTime = v70Var.a - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread B();

    public final boolean C() {
        fb fbVar = this.e;
        if (fbVar != null ? fbVar.isEmpty() : true) {
            v.getClass();
            Unsafe unsafe = fe3.a;
            w70 w70Var = (w70) unsafe.getObjectVolatile(this, W);
            if (w70Var != null && kx1.b.get(w70Var) != 0) {
                return false;
            }
            i.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, X);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xz0) {
                    long j = xz0.f.get((xz0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == y21.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void D(long j, v70 v70Var) {
        vy.Y.N(j, v70Var);
    }

    public final void I() {
        v70 v70VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            v.getClass();
            w70 w70Var = (w70) fe3.a.getObjectVolatile(this, W);
            if (w70Var == null) {
                return;
            }
            synchronized (w70Var) {
                v70VarB = kx1.b.get(w70Var) > 0 ? w70Var.b(0) : null;
            }
            if (v70VarB == null) {
                return;
            } else {
                D(jNanoTime, v70VarB);
            }
        }
    }

    public final void M() {
        i.getClass();
        Unsafe unsafe = fe3.a;
        unsafe.putObjectVolatile(this, X, (Object) null);
        v.getClass();
        unsafe.putObjectVolatile(this, W, (Object) null);
    }

    public final void N(long j, v70 v70Var) {
        Thread threadB;
        int iR = R(j, v70Var);
        if (iR == 0) {
            if (!S(v70Var) || Thread.currentThread() == (threadB = B())) {
                return;
            }
            LockSupport.unpark(threadB);
            return;
        }
        if (iR == 1) {
            D(j, v70Var);
        } else {
            if (iR == 2) {
                return;
            }
            uq1.q("unexpected result");
        }
    }

    public final int R(long j, v70 v70Var) {
        x70 x70Var;
        Unsafe unsafe;
        if (w.get(this) != 0) {
            return 1;
        }
        v.getClass();
        Unsafe unsafe2 = fe3.a;
        long j2 = W;
        w70 w70Var = (w70) unsafe2.getObjectVolatile(this, j2);
        if (w70Var == null) {
            w70 w70Var2 = new w70();
            w70Var2.c = j;
            while (true) {
                unsafe = fe3.a;
                x70Var = this;
                if (unsafe.compareAndSwapObject(x70Var, W, (Object) null, w70Var2) || unsafe.getObjectVolatile(x70Var, j2) != null) {
                    break;
                }
                this = x70Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(x70Var, j2);
            objectVolatile.getClass();
            w70Var = (w70) objectVolatile;
        } else {
            x70Var = this;
        }
        return v70Var.c(j, w70Var, x70Var);
    }

    public final boolean S(v70 v70Var) {
        v.getClass();
        w70 w70Var = (w70) fe3.a.getObjectVolatile(this, W);
        v70 v70Var2 = null;
        if (w70Var != null) {
            synchronized (w70Var) {
                v70[] v70VarArr = w70Var.a;
                v70Var2 = v70VarArr != null ? v70VarArr[0] : null;
            }
        }
        return v70Var2 == v70Var;
    }

    @Override // defpackage.h00
    public final void a(long j, pk pkVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            t70 t70Var = new t70(this, j2 + jNanoTime, pkVar);
            N(jNanoTime, t70Var);
            pkVar.x(new jk(t70Var, 2));
        }
    }

    public n20 b(long j, xx1 xx1Var, CoroutineContext coroutineContext) {
        return wy.a.b(j, xx1Var, coroutineContext);
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        t(runnable);
    }

    @Override // defpackage.s70
    public final long n() {
        if (p()) {
            return 0L;
        }
        w();
        Runnable runnableS = s();
        if (runnableS == null) {
            return A();
        }
        runnableS.run();
        return 0L;
    }

    public final void q() {
        x70 x70Var;
        Unsafe unsafe;
        vy2 vy2Var = y21.b;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = fe3.a;
            long j = X;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = fe3.a;
                    x70Var = this;
                    if (unsafe3.compareAndSwapObject(x70Var, X, (Object) null, vy2Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(x70Var, j) != null) {
                        break;
                    } else {
                        this = x70Var;
                    }
                }
            } else {
                x70Var = this;
                if (objectVolatile instanceof xz0) {
                    ((xz0) objectVolatile).c();
                    return;
                }
                if (objectVolatile == vy2Var) {
                    return;
                }
                xz0 xz0Var = new xz0(8, true);
                xz0Var.a((Runnable) objectVolatile);
                do {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(x70Var, X, objectVolatile, xz0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(x70Var, j) == objectVolatile);
            }
            this = x70Var;
        }
    }

    public final Runnable s() {
        x70 x70Var;
        Unsafe unsafe;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = fe3.a;
            long j = X;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof xz0) {
                xz0 xz0Var = (xz0) objectVolatile;
                Object objE = xz0Var.e();
                if (objE == xz0.g) {
                    xz0 xz0VarD = xz0Var.d();
                    while (true) {
                        Unsafe unsafe3 = fe3.a;
                        x70Var = this;
                        if (unsafe3.compareAndSwapObject(x70Var, X, objectVolatile, xz0VarD) || unsafe3.getObjectVolatile(x70Var, j) != objectVolatile) {
                            break;
                        }
                        this = x70Var;
                    }
                } else {
                    return (Runnable) objE;
                }
            } else {
                x70Var = this;
                if (objectVolatile == y21.b) {
                    return null;
                }
                do {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(x70Var, X, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(x70Var, j) == objectVolatile);
            }
            this = x70Var;
        }
    }

    @Override // defpackage.s70
    public void shutdown() {
        jx1.a.set(null);
        w.set(this, 1);
        q();
        while (n() <= 0) {
        }
        I();
    }

    public void t(Runnable runnable) {
        w();
        if (!x(runnable)) {
            vy.Y.t(runnable);
            return;
        }
        Thread threadB = B();
        if (Thread.currentThread() != threadB) {
            LockSupport.unpark(threadB);
        }
    }

    public final void w() {
        v70 v70VarB;
        v.getClass();
        w70 w70Var = (w70) fe3.a.getObjectVolatile(this, W);
        if (w70Var == null || kx1.b.get(w70Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (w70Var) {
                try {
                    v70[] v70VarArr = w70Var.a;
                    v70VarB = null;
                    v70 v70Var = v70VarArr != null ? v70VarArr[0] : null;
                    if (v70Var != null) {
                        v70VarB = ((jNanoTime - v70Var.a) > 0L ? 1 : ((jNanoTime - v70Var.a) == 0L ? 0 : -1)) >= 0 ? x(v70Var) : false ? w70Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (v70VarB != null);
    }

    public final boolean x(Runnable runnable) {
        x70 x70Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            i.getClass();
            Unsafe unsafe3 = fe3.a;
            long j = X;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (w.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = fe3.a;
                    x70 x70Var2 = this;
                    runnable2 = runnable;
                    x70Var = x70Var2;
                    if (unsafe4.compareAndSwapObject(x70Var2, X, (Object) null, runnable2)) {
                        return true;
                    }
                    if (unsafe4.getObjectVolatile(x70Var, j) != null) {
                        break;
                    }
                    this = x70Var;
                    runnable = runnable2;
                }
                this = x70Var;
                runnable = runnable2;
            } else {
                x70Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof xz0) {
                    xz0 xz0Var = (xz0) objectVolatile;
                    int iA = xz0Var.a(runnable2);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA == 1) {
                        xz0 xz0VarD = xz0Var.d();
                        do {
                            unsafe2 = fe3.a;
                            if (unsafe2.compareAndSwapObject(x70Var, X, objectVolatile, xz0VarD)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(x70Var, j) == objectVolatile);
                    } else if (iA == 2) {
                        return false;
                    }
                    this = x70Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == y21.b) {
                        return false;
                    }
                    xz0 xz0Var2 = new xz0(8, true);
                    xz0Var2.a((Runnable) objectVolatile);
                    xz0Var2.a(runnable2);
                    do {
                        unsafe = fe3.a;
                        if (unsafe.compareAndSwapObject(x70Var, X, objectVolatile, xz0Var2)) {
                            return true;
                        }
                    } while (unsafe.getObjectVolatile(x70Var, j) == objectVolatile);
                    this = x70Var;
                    runnable = runnable2;
                }
            }
        }
    }
}
