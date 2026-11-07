package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h61 extends go1 implements f61 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(h61.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = fe3.a.objectFieldOffset(h61.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = dw0.c;

    public final Object d(gs gsVar) {
        if (e()) {
            return Unit.a;
        }
        pk pkVarU = aj0.u(sr0.b(gsVar));
        try {
            g61 g61Var = new g61(this, pkVarU);
            while (true) {
                int andDecrement = go1.f.getAndDecrement(this);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        g61Var.c(Unit.a, this.a);
                        break;
                    }
                    if (a(g61Var)) {
                        break;
                    }
                }
            }
            Object objS = pkVarU.s();
            ft ftVar = ft.a;
            if (objS != ftVar) {
                objS = Unit.a;
            }
            return objS == ftVar ? objS : Unit.a;
        } catch (Throwable th) {
            pkVarU.B();
            throw th;
        }
    }

    public final boolean e() {
        int iF = f();
        if (iF == 0) {
            return true;
        }
        if (iF == 1) {
            return false;
        }
        if (iF == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        uq1.q("unexpected");
        return false;
    }

    public final int f() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = go1.f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i3 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    i.getClass();
                    fe3.a.putObjectVolatile(this, j, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final void g(Object obj) {
        while (Math.max(go1.f.get(this), 0) == 0) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            vy2 vy2Var = dw0.c;
            if (objectVolatile != vy2Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = fe3.a;
                    h61 h61Var = this;
                    if (unsafe2.compareAndSwapObject(h61Var, j, objectVolatile, vy2Var)) {
                        h61Var.b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(h61Var, j2) != objectVolatile) {
                            this = h61Var;
                            break;
                        }
                        this = h61Var;
                    }
                }
            }
        }
        uq1.q("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(qt.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(go1.f.get(this), 0) == 0);
        sb.append(",owner=");
        i.getClass();
        sb.append(fe3.a.getObjectVolatile(this, j));
        sb.append(']');
        return sb.toString();
    }
}
