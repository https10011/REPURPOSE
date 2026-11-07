package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bt extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(bt.class, "workerCtl$volatile");
    public final ia2 a;
    public final Ref.ObjectRef b;
    public ct c;
    public long d;
    public long e;
    public int f;
    public boolean i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public final /* synthetic */ dt v;
    private volatile /* synthetic */ int workerCtl$volatile;

    public bt(dt dtVar, int i) {
        this.v = dtVar;
        setDaemon(true);
        setContextClassLoader(dt.class.getClassLoader());
        this.a = new ia2();
        this.b = new Ref.ObjectRef();
        this.c = ct.d;
        this.nextParkedWorker = dt.X;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final mw1 a(boolean z) {
        mw1 mw1VarE;
        mw1 mw1VarE2;
        long j;
        ct ctVar = this.c;
        ct ctVar2 = ct.a;
        dt dtVar = this.v;
        ia2 ia2Var = this.a;
        if (ctVar != ctVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = dt.w;
            do {
                j = atomicLongFieldUpdater.get(dtVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mw1 mw1VarF = ia2Var.f();
                    return (mw1VarF == null && (mw1VarF = (mw1) dtVar.f.d()) == null) ? i(1) : mw1VarF;
                }
            } while (!dt.w.compareAndSet(dtVar, j, j - 4398046511104L));
            this.c = ct.a;
        }
        if (z) {
            boolean z2 = d(dtVar.a * 2) == 0;
            if (z2 && (mw1VarE2 = e()) != null) {
                return mw1VarE2;
            }
            mw1 mw1VarD = ia2Var.d();
            if (mw1VarD != null) {
                return mw1VarD;
            }
            if (!z2 && (mw1VarE = e()) != null) {
                return mw1VarE;
            }
        } else {
            mw1 mw1VarE3 = e();
            if (mw1VarE3 != null) {
                return mw1VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final mw1 e() {
        int iD = d(2);
        dt dtVar = this.v;
        mj0 mj0Var = dtVar.f;
        mj0 mj0Var2 = dtVar.e;
        if (iD == 0) {
            mw1 mw1Var = (mw1) mj0Var2.d();
            return mw1Var != null ? mw1Var : (mw1) mj0Var.d();
        }
        mw1 mw1Var2 = (mw1) mj0Var.d();
        return mw1Var2 != null ? mw1Var2 : (mw1) mj0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.v.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ct ctVar) {
        ct ctVar2 = this.c;
        boolean z = ctVar2 == ct.a;
        if (z) {
            dt.w.addAndGet(this.v, 4398046511104L);
        }
        if (ctVar2 != ctVar) {
            this.c = ctVar;
        }
        return z;
    }

    public final mw1 i(int i) {
        mw1 mw1VarG;
        long jH;
        AtomicLongFieldUpdater atomicLongFieldUpdater = dt.w;
        dt dtVar = this.v;
        int i2 = (int) (atomicLongFieldUpdater.get(dtVar) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            bt btVar = (bt) dtVar.i.b(iD);
            if (btVar != null && btVar != this) {
                ia2 ia2Var = btVar.a;
                if (i != 3) {
                    ia2Var.getClass();
                    int i4 = ia2.d.get(ia2Var);
                    int i5 = ia2.c.get(ia2Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5 || (z && ia2.e.get(ia2Var) == 0)) {
                            mw1VarG = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        mw1VarG = ia2Var.g(i4, z);
                        if (mw1VarG != null) {
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    mw1VarG = ia2Var.e();
                }
                Ref.ObjectRef objectRef = this.b;
                if (mw1VarG != null) {
                    objectRef.element = mw1VarG;
                    jH = -1;
                } else {
                    jH = ia2Var.h(i, objectRef);
                }
                if (jH == -1) {
                    mw1 mw1Var = (mw1) objectRef.element;
                    objectRef.element = null;
                    return mw1Var;
                }
                if (jH > 0) {
                    jMin = Math.min(jMin, jH);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (dt.W.get(this.v) == 0) {
                    ct ctVar = this.c;
                    ct ctVar2 = ct.e;
                    if (ctVar == ctVar2) {
                        break loop0;
                    }
                    mw1 mw1VarA = a(this.i);
                    if (mw1VarA != null) {
                        this.e = 0L;
                        dt dtVar = this.v;
                        this.d = 0L;
                        if (this.c == ct.c) {
                            this.c = ct.b;
                        }
                        if (!mw1VarA.b) {
                            try {
                                mw1VarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(ct.b) && !dtVar.j() && !dtVar.i(dt.w.get(dtVar))) {
                            dtVar.j();
                        }
                        try {
                            mw1VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        dt.w.addAndGet(dtVar, -2097152L);
                        if (this.c == ctVar2) {
                            break;
                        }
                        this.c = ct.d;
                        break;
                    }
                    this.i = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        vy2 vy2Var = dt.X;
                        if (obj != vy2Var) {
                            w.set(this, -1);
                            while (this.nextParkedWorker != dt.X) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                dt dtVar2 = this.v;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = dt.W;
                                if (atomicIntegerFieldUpdater2.get(dtVar2) != 0) {
                                    break;
                                }
                                ct ctVar3 = this.c;
                                ct ctVar4 = ct.e;
                                if (ctVar3 == ctVar4) {
                                    break;
                                }
                                h(ct.c);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    j = 2097151;
                                    this.d = System.nanoTime() + this.v.c;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.v.c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    dt dtVar3 = this.v;
                                    synchronized (dtVar3.i) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(dtVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = dt.w;
                                                if (((int) (atomicLongFieldUpdater.get(dtVar3) & j)) > dtVar3.a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        dtVar3.e(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(dtVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = dtVar3.i.b(andDecrement);
                                                            objB.getClass();
                                                            bt btVar = (bt) objB;
                                                            dtVar3.i.c(i, btVar);
                                                            btVar.f(i);
                                                            dtVar3.e(btVar, andDecrement, i);
                                                        }
                                                        dtVar3.i.c(andDecrement, null);
                                                        Unit unit = Unit.a;
                                                        this.c = ctVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            dt dtVar4 = this.v;
                            if (this.nextParkedWorker == vy2Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = dt.v;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(dtVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = dtVar4.i.b((int) (j2 & 2097151));
                                    dt dtVar5 = dtVar4;
                                    if (dt.v.compareAndSet(dtVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        dtVar4 = dtVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(ct.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(ct.e);
    }
}
