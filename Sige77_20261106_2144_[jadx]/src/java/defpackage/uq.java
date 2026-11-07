package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class uq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uq.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = fe3.a;
        c = unsafe.objectFieldOffset(uq.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(uq.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(uq.class.getDeclaredField("_prev$volatile"));
    }

    public uq(zn1 zn1Var) {
        this._prev$volatile = zn1Var;
    }

    public final void b() {
        b.getClass();
        fe3.a.putObjectVolatile(this, d, (Object) null);
    }

    public final uq c() {
        uq uqVarF = f();
        while (uqVarF != null && uqVarF.g()) {
            b.getClass();
            uqVarF = (uq) fe3.a.getObjectVolatile(uqVarF, d);
        }
        return uqVarF;
    }

    public final uq d() {
        Object objE = e();
        if (objE == tq.a) {
            return null;
        }
        return (uq) objE;
    }

    public final Object e() {
        a.getClass();
        return fe3.a.getObjectVolatile(this, c);
    }

    public final uq f() {
        b.getClass();
        return (uq) fe3.a.getObjectVolatile(this, d);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = c;
            uq uqVar = this;
            if (unsafe.compareAndSwapObject(uqVar, j, (Object) null, tq.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(uqVar, j) != null) {
                return false;
            }
            this = uqVar;
        }
    }

    public final void i() {
        uq uqVar;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            uq uqVarC = c();
            uq uqVarD = d();
            uqVarD.getClass();
            do {
                uqVar = uqVarD;
                if (!uqVar.g()) {
                    break;
                } else {
                    uqVarD = uqVar.d();
                }
            } while (uqVarD != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = fe3.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(uqVar, j);
                uq uqVar2 = ((uq) objectVolatile) == null ? null : uqVarC;
                while (true) {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(uqVar, d, objectVolatile, uqVar2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(uqVar, j) != objectVolatile) {
                    }
                }
            }
            if (uqVarC != null) {
                a.getClass();
                unsafe.putObjectVolatile(uqVarC, c, uqVar);
            }
            if (!uqVar.g() || uqVar.d() == null) {
                if (uqVarC == null || !uqVarC.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(zn1 zn1Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = c;
            uq uqVar = this;
            zn1 zn1Var2 = zn1Var;
            if (unsafe.compareAndSwapObject(uqVar, j, (Object) null, zn1Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(uqVar, j) != null) {
                return false;
            }
            this = uqVar;
            zn1Var = zn1Var2;
        }
    }
}
