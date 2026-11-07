package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f20 extends h20 implements gt, fs {
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(f20.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long w = fe3.a.objectFieldOffset(f20.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final ys d;
    public final gs e;
    public Object f;
    public final Object i;

    public f20(ys ysVar, gs gsVar) {
        super(-1);
        this.d = ysVar;
        this.e = gsVar;
        this.f = yi0.a;
        this.i = ix1.b(gsVar.getContext());
    }

    @Override // defpackage.gt
    public final gt getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.h20
    public final Object j() {
        Object obj = this.f;
        this.f = yi0.a;
        return obj;
    }

    public final void k() {
        do {
            v.getClass();
        } while (fe3.a.getObjectVolatile(this, w) == yi0.b);
    }

    public final pk l() {
        f20 f20Var;
        vy2 vy2Var = yi0.b;
        while (true) {
            v.getClass();
            Unsafe unsafe = fe3.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, vy2Var);
                return null;
            }
            if (objectVolatile instanceof pk) {
                while (true) {
                    Unsafe unsafe2 = fe3.a;
                    f20 f20Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(f20Var2, w, objectVolatile, vy2Var);
                    f20Var = f20Var2;
                    if (zCompareAndSwapObject) {
                        return (pk) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(f20Var, j) != objectVolatile) {
                        break;
                    }
                    this = f20Var;
                }
            } else {
                f20Var = this;
                if (objectVolatile != vy2Var && !(objectVolatile instanceof Throwable)) {
                    sm0.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = f20Var;
        }
    }

    public final pk m() {
        v.getClass();
        Object objectVolatile = fe3.a.getObjectVolatile(this, w);
        if (objectVolatile instanceof pk) {
            return (pk) objectVolatile;
        }
        return null;
    }

    public final boolean n() {
        v.getClass();
        return fe3.a.getObjectVolatile(this, w) != null;
    }

    public final boolean o(Throwable th) {
        f20 f20Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            v.getClass();
            Unsafe unsafe2 = fe3.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            vy2 vy2Var = yi0.b;
            if (Intrinsics.areEqual(objectVolatile, vy2Var)) {
                while (true) {
                    Unsafe unsafe3 = fe3.a;
                    f20 f20Var2 = this;
                    th2 = th;
                    f20Var = f20Var2;
                    if (unsafe3.compareAndSwapObject(f20Var2, w, vy2Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(f20Var, j) != vy2Var) {
                        break;
                    }
                    this = f20Var;
                    th = th2;
                }
            } else {
                f20Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(f20Var, w, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(f20Var, j) == objectVolatile);
            }
            this = f20Var;
            th = th2;
        }
    }

    public final Throwable p(pk pkVar) {
        Unsafe unsafe;
        f20 f20Var;
        pk pkVar2;
        while (true) {
            v.getClass();
            Unsafe unsafe2 = fe3.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            vy2 vy2Var = yi0.b;
            if (objectVolatile != vy2Var) {
                f20 f20Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    sm0.g(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = fe3.a;
                    if (unsafe.compareAndSwapObject(f20Var2, w, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(f20Var2, j) == objectVolatile);
                e.g("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = fe3.a;
                f20Var = this;
                pkVar2 = pkVar;
                if (unsafe3.compareAndSwapObject(f20Var, w, vy2Var, pkVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(f20Var, j) != vy2Var) {
                    break;
                }
                this = f20Var;
                pkVar = pkVar2;
            }
            this = f20Var;
            pkVar = pkVar2;
        }
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        Throwable thA = rj1.a(obj);
        Object vpVar = thA == null ? obj : new vp(thA, false);
        gs gsVar = this.e;
        CoroutineContext context = gsVar.getContext();
        ys ysVar = this.d;
        if (ysVar.i(context)) {
            this.f = vpVar;
            this.c = 0;
            ysVar.e(gsVar.getContext(), this);
            return;
        }
        s70 s70VarA = jx1.a();
        if (s70VarA.c >= 4294967296L) {
            this.f = vpVar;
            this.c = 0;
            fb fbVar = s70VarA.e;
            if (fbVar == null) {
                fbVar = new fb();
                s70VarA.e = fbVar;
            }
            fbVar.addLast(this);
            return;
        }
        s70VarA.m(true);
        try {
            CoroutineContext context2 = gsVar.getContext();
            Object objC = ix1.c(context2, this.i);
            try {
                gsVar.resumeWith(obj);
                Unit unit = Unit.a;
                ix1.a(context2, objC);
                while (s70VarA.p()) {
                }
            } catch (Throwable th) {
                ix1.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                s70VarA.l(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + qt.C(this.e) + ']';
    }

    @Override // defpackage.h20
    public final fs e() {
        return this;
    }
}
