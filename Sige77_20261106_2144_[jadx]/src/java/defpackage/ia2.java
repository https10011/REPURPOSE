package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ia2 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ia2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = fe3.a.objectFieldOffset(ia2.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ia2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ia2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ia2.class, "blockingTasksInBuffer$volatile");

    public final mw1 a(mw1 mw1Var) {
        b.getClass();
        mw1 mw1Var2 = (mw1) fe3.a.getAndSetObject(this, f, mw1Var);
        if (mw1Var2 == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return mw1Var2;
        }
        if (mw1Var2.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, mw1Var2);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        b.getClass();
        Object objectVolatile = fe3.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void c(mj0 mj0Var) {
        b.getClass();
        mw1 mw1Var = (mw1) fe3.a.getAndSetObject(this, f, (Object) null);
        if (mw1Var != null) {
            mj0Var.a(mw1Var);
        }
        while (true) {
            mw1 mw1VarE = e();
            if (mw1VarE == null) {
                return;
            } else {
                mj0Var.a(mw1VarE);
            }
        }
    }

    public final mw1 d() {
        b.getClass();
        mw1 mw1Var = (mw1) fe3.a.getAndSetObject(this, f, (Object) null);
        return mw1Var == null ? e() : mw1Var;
    }

    public final mw1 e() {
        mw1 mw1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (mw1Var = (mw1) this.a.getAndSet(i2, null)) != null) {
                if (mw1Var.b) {
                    e.decrementAndGet(this);
                }
                return mw1Var;
            }
        }
    }

    public final mw1 f() {
        ia2 ia2Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = fe3.a;
            long j = f;
            mw1 mw1Var = (mw1) unsafe.getObjectVolatile(this, j);
            if (mw1Var == null || !mw1Var.b) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = fe3.a;
                ia2Var = this;
                if (unsafe2.compareAndSwapObject(ia2Var, f, mw1Var, (Object) null)) {
                    return mw1Var;
                }
                if (unsafe2.getObjectVolatile(ia2Var, j) != mw1Var) {
                    break;
                }
                this = ia2Var;
            }
            this = ia2Var;
        }
        ia2 ia2Var2 = this;
        int i = d.get(ia2Var2);
        int i2 = c.get(ia2Var2);
        while (i != i2 && e.get(ia2Var2) != 0) {
            i2--;
            mw1 mw1VarG = ia2Var2.g(i2, true);
            if (mw1VarG != null) {
                return mw1VarG;
            }
        }
        return null;
    }

    public final mw1 g(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        mw1 mw1Var = (mw1) atomicReferenceArray.get(i2);
        if (mw1Var != null && mw1Var.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, mw1Var, null)) {
                if (atomicReferenceArray.get(i2) != mw1Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return mw1Var;
        }
        return null;
    }

    public final long h(int i, Ref.ObjectRef objectRef) {
        ia2 ia2Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = fe3.a;
            long j = f;
            mw1 mw1Var = (mw1) unsafe.getObjectVolatile(this, j);
            if (mw1Var == null) {
                return -2L;
            }
            if (((mw1Var.b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            pw1.f.getClass();
            long jNanoTime = System.nanoTime() - mw1Var.a;
            long j2 = pw1.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = fe3.a;
                ia2Var = this;
                if (unsafe2.compareAndSwapObject(ia2Var, f, mw1Var, (Object) null)) {
                    objectRef.element = mw1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ia2Var, j) != mw1Var) {
                    break;
                }
                this = ia2Var;
            }
            this = ia2Var;
        }
    }
}
