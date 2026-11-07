package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class go1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ok a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = fe3.a;
        g = unsafe.objectFieldOffset(go1.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(go1.class, "deqIdx$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "tail$volatile");
        h = unsafe.objectFieldOffset(go1.class.getDeclaredField("tail$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(go1.class, "enqIdx$volatile");
        f = AtomicIntegerFieldUpdater.newUpdater(go1.class, "_availablePermits$volatile");
    }

    public go1() {
        io1 io1Var = new io1(0L, null, 2);
        this.head$volatile = io1Var;
        this.tail$volatile = io1Var;
        this._availablePermits$volatile = 1;
        this.a = new ok(this, 2);
    }

    public final boolean a(g61 g61Var) {
        Object objA;
        Unsafe unsafe;
        go1 go1Var = this;
        d.getClass();
        Unsafe unsafe2 = fe3.a;
        long j = h;
        io1 io1Var = (io1) unsafe2.getObjectVolatile(go1Var, j);
        long andIncrement = e.getAndIncrement(go1Var);
        eo1 eo1Var = eo1.a;
        long j2 = andIncrement / ((long) ho1.f);
        loop0: while (true) {
            objA = tq.a(io1Var, j2, eo1Var);
            if (gu2.x(objA)) {
                break;
            }
            zn1 zn1VarV = gu2.v(objA);
            while (true) {
                zn1 zn1Var = (zn1) fe3.a.getObjectVolatile(go1Var, j);
                if (zn1Var.e >= zn1VarV.e) {
                    go1Var = this;
                    break loop0;
                }
                if (!zn1VarV.o()) {
                    break;
                }
                do {
                    unsafe = fe3.a;
                    go1Var = this;
                    if (unsafe.compareAndSwapObject(go1Var, h, zn1Var, zn1VarV)) {
                        if (!zn1Var.k()) {
                            break loop0;
                        }
                        zn1Var.i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(go1Var, j) == zn1Var);
                if (zn1VarV.k()) {
                    zn1VarV.i();
                }
            }
            go1Var = this;
        }
        io1 io1Var2 = (io1) gu2.v(objA);
        AtomicReferenceArray atomicReferenceArray = io1Var2.g;
        int i = (int) (andIncrement % ((long) ho1.f));
        while (!atomicReferenceArray.compareAndSet(i, null, g61Var)) {
            if (atomicReferenceArray.get(i) != null) {
                vy2 vy2Var = ho1.b;
                vy2 vy2Var2 = ho1.c;
                while (!atomicReferenceArray.compareAndSet(i, vy2Var, vy2Var2)) {
                    if (atomicReferenceArray.get(i) != vy2Var) {
                        return false;
                    }
                }
                g61Var.c(Unit.a, go1Var.a);
                return true;
            }
        }
        g61Var.a(io1Var2, i);
        return true;
    }

    public final void b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!c());
    }

    public final boolean c() {
        Object objA;
        Unsafe unsafe;
        b.getClass();
        Unsafe unsafe2 = fe3.a;
        long j = g;
        io1 io1Var = (io1) unsafe2.getObjectVolatile(this, j);
        long andIncrement = c.getAndIncrement(this);
        long j2 = andIncrement / ((long) ho1.f);
        fo1 fo1Var = fo1.a;
        loop0: while (true) {
            objA = tq.a(io1Var, j2, fo1Var);
            if (gu2.x(objA)) {
                break;
            }
            zn1 zn1VarV = gu2.v(objA);
            while (true) {
                zn1 zn1Var = (zn1) fe3.a.getObjectVolatile(this, j);
                if (zn1Var.e >= zn1VarV.e) {
                    break loop0;
                }
                if (!zn1VarV.o()) {
                    break;
                }
                do {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(this, g, zn1Var, zn1VarV)) {
                        if (!zn1Var.k()) {
                            break loop0;
                        }
                        zn1Var.i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == zn1Var);
                if (zn1VarV.k()) {
                    zn1VarV.i();
                }
            }
        }
        io1 io1Var2 = (io1) gu2.v(objA);
        io1Var2.b();
        AtomicReferenceArray atomicReferenceArray = io1Var2.g;
        boolean z = false;
        if (io1Var2.e <= j2) {
            int i = (int) (andIncrement % ((long) ho1.f));
            Object andSet = atomicReferenceArray.getAndSet(i, ho1.b);
            if (andSet == null) {
                int i2 = ho1.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == ho1.c) {
                        return true;
                    }
                }
                vy2 vy2Var = ho1.b;
                vy2 vy2Var2 = ho1.d;
                while (!atomicReferenceArray.compareAndSet(i, vy2Var, vy2Var2)) {
                    if (atomicReferenceArray.get(i) != vy2Var) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != ho1.e) {
                if (!(andSet instanceof nk)) {
                    sm0.g(andSet, "unexpected: ");
                    return false;
                }
                nk nkVar = (nk) andSet;
                vy2 vy2VarD = nkVar.d(Unit.a, this.a);
                if (vy2VarD != null) {
                    nkVar.f(vy2VarD);
                    return true;
                }
            }
        }
        return false;
    }
}
