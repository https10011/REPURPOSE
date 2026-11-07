package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dt implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final mj0 e;
    public final mj0 f;
    public final mi1 i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(dt.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(dt.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater W = AtomicIntegerFieldUpdater.newUpdater(dt.class, "_isTerminated$volatile");
    public static final vy2 X = new vy2("NOT_IN_STACK", 4);

    public dt(String str, int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            e.d(ts.g(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            e.d(ts.i("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            e.d(ts.g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.e = new mj0();
        this.f = new mj0();
        this.i = new mi1((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.i) {
            try {
                if (W.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = w;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.i.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                bt btVar = new bt(this, i3);
                this.i.c(i3, btVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                btVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z) {
        mw1 nw1Var;
        ct ctVar;
        pw1.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof mw1) {
            nw1Var = (mw1) runnable;
            nw1Var.a = jNanoTime;
            nw1Var.b = z;
        } else {
            nw1Var = new nw1(runnable, jNanoTime, z);
        }
        boolean z2 = nw1Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        bt btVar = null;
        bt btVar2 = threadCurrentThread instanceof bt ? (bt) threadCurrentThread : null;
        if (btVar2 != null && Intrinsics.areEqual(btVar2.v, this)) {
            btVar = btVar2;
        }
        if (btVar != null && (ctVar = btVar.c) != ct.e && (nw1Var.b || ctVar != ct.b)) {
            btVar.i = true;
            nw1Var = btVar.a.a(nw1Var);
        }
        if (nw1Var != null) {
            if (!(nw1Var.b ? this.f.a(nw1Var) : this.e.a(nw1Var))) {
                throw new RejectedExecutionException(ts.l(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z2) {
            if (j() || i(jAddAndGet)) {
                return;
            }
            j();
            return;
        }
        if (j() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        mw1 mw1VarA;
        if (W.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            bt btVar = null;
            bt btVar2 = threadCurrentThread instanceof bt ? (bt) threadCurrentThread : null;
            if (btVar2 != null && Intrinsics.areEqual(btVar2.v, this)) {
                btVar = btVar2;
            }
            synchronized (this.i) {
                i = (int) (w.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.i.b(i2);
                    objB.getClass();
                    bt btVar3 = (bt) objB;
                    if (btVar3 != btVar) {
                        while (btVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(btVar3);
                            btVar3.join(10000L);
                        }
                        btVar3.a.c(this.f);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (btVar != null) {
                    mw1VarA = btVar.a(true);
                    if (mw1VarA == null) {
                        mw1VarA = (mw1) this.e.d();
                        if (mw1VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    mw1VarA = (mw1) this.e.d();
                    if (mw1VarA == null && (mw1VarA = (mw1) this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    mw1VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (btVar != null) {
                btVar.h(ct.e);
            }
            v.set(this, 0L);
            w.set(this, 0L);
        }
    }

    public final void e(bt btVar, int i, int i2) {
        while (true) {
            long j = v.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = btVar.c();
                    while (true) {
                        if (objC == X) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        bt btVar2 = (bt) objC;
                        int iB = btVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = btVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                dt dtVar = this;
                if (v.compareAndSet(dtVar, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = dtVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final boolean i(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        dt dtVar;
        vy2 vy2Var;
        int iB;
        while (true) {
            long j = v.get(this);
            bt btVar = (bt) this.i.b((int) (2097151 & j));
            if (btVar == null) {
                btVar = null;
                dtVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = btVar.c();
                while (true) {
                    vy2Var = X;
                    if (objC == vy2Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    bt btVar2 = (bt) objC;
                    iB = btVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = btVar2.c();
                    j = j;
                }
                if (iB >= 0) {
                    dt dtVar2 = this;
                    boolean zCompareAndSet = v.compareAndSet(dtVar2, j, ((long) iB) | j2);
                    dtVar = dtVar2;
                    if (zCompareAndSet) {
                        btVar.g(vy2Var);
                    }
                    this = dtVar;
                } else {
                    continue;
                }
            }
            if (btVar == null) {
                return false;
            }
            if (bt.w.compareAndSet(btVar, -1, 0)) {
                LockSupport.unpark(btVar);
                return true;
            }
            this = dtVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mi1 mi1Var = this.i;
        int iA = mi1Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            bt btVar = (bt) mi1Var.b(i6);
            if (btVar != null) {
                int iB = btVar.a.b();
                int iOrdinal = btVar.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new e71();
                    }
                    i5++;
                }
            }
        }
        long j = w.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(qt.j(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
