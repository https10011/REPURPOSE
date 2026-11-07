package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class pk extends h20 implements nk, gt, s72 {
    public static final /* synthetic */ long W;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(pk.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(pk.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final fs d;
    public final CoroutineContext e;

    static {
        Unsafe unsafe = fe3.a;
        W = unsafe.objectFieldOffset(pk.class.getDeclaredField("_state$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(pk.class, Object.class, "_parentHandle$volatile");
        w = unsafe.objectFieldOffset(pk.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pk(int i2, fs fsVar) {
        super(i2);
        this.d = fsVar;
        this.e = fsVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f4.a;
    }

    public static Object F(h71 h71Var, Object obj, int i2, xg0 xg0Var) {
        if (obj instanceof vp) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (xg0Var != null || (h71Var instanceof kk)) {
            return new tp(obj, h71Var instanceof kk ? (kk) h71Var : null, xg0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(h71 h71Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + h71Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thP;
        fs fsVar = this.d;
        f20 f20Var = fsVar instanceof f20 ? (f20) fsVar : null;
        if (f20Var == null || (thP = f20Var.p(this)) == null) {
            return;
        }
        o();
        n(thP);
    }

    public final boolean C() {
        i.getClass();
        Unsafe unsafe = fe3.a;
        long j = W;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof tp) && ((tp) objectVolatile).d != null) {
            o();
            return false;
        }
        f.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, f4.a);
        return true;
    }

    public final void D(Object obj, int i2, xg0 xg0Var) {
        pk pkVar;
        while (true) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j = W;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof h71)) {
                pk pkVar2 = this;
                if (objectVolatile instanceof sk) {
                    sk skVar = (sk) objectVolatile;
                    if (sk.c.compareAndSet(skVar, 0, 1)) {
                        if (xg0Var != null) {
                            pkVar2.l(xg0Var, skVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                sm0.g(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((h71) objectVolatile, obj, i2, xg0Var);
            while (true) {
                Unsafe unsafe2 = fe3.a;
                pkVar = this;
                if (unsafe2.compareAndSwapObject(pkVar, W, objectVolatile, objF)) {
                    if (!pkVar.y()) {
                        pkVar.o();
                    }
                    pkVar.p(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(pkVar, j) != objectVolatile) {
                    break;
                } else {
                    this = pkVar;
                }
            }
            this = pkVar;
        }
    }

    public final void E(ys ysVar, Unit unit) {
        fs fsVar = this.d;
        f20 f20Var = fsVar instanceof f20 ? (f20) fsVar : null;
        D(unit, (f20Var != null ? f20Var.d : null) == ysVar ? 4 : this.c, null);
    }

    public final vy2 G(Object obj, xg0 xg0Var) {
        pk pkVar;
        vy2 vy2Var = ia.b;
        while (true) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j = W;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof h71)) {
                return null;
            }
            Object objF = F((h71) objectVolatile, obj, this.c, xg0Var);
            while (true) {
                Unsafe unsafe2 = fe3.a;
                pkVar = this;
                if (unsafe2.compareAndSwapObject(pkVar, W, objectVolatile, objF)) {
                    if (!pkVar.y()) {
                        pkVar.o();
                    }
                    return vy2Var;
                }
                if (unsafe2.getObjectVolatile(pkVar, j) != objectVolatile) {
                    break;
                }
                this = pkVar;
            }
            this = pkVar;
        }
    }

    @Override // defpackage.s72
    public final void a(zn1 zn1Var, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                uq1.q("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(zn1Var);
    }

    @Override // defpackage.h20
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        pk pkVar;
        while (true) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j = W;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof h71) {
                uq1.q("Not completed");
                return;
            }
            if (objectVolatile instanceof vp) {
                return;
            }
            if (objectVolatile instanceof tp) {
                tp tpVar = (tp) objectVolatile;
                if (tpVar.e != null) {
                    uq1.q("Must be called at most once");
                    return;
                }
                tp tpVarA = tp.a(tpVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = fe3.a;
                    pk pkVar2 = this;
                    if (unsafe2.compareAndSwapObject(pkVar2, W, objectVolatile, tpVarA)) {
                        kk kkVar = tpVar.b;
                        if (kkVar != null) {
                            pkVar2.k(kkVar, cancellationException);
                        }
                        xg0 xg0Var = tpVar.c;
                        if (xg0Var != null) {
                            pkVar2.l(xg0Var, cancellationException, tpVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(pkVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        pkVar = pkVar2;
                        break;
                    }
                    this = pkVar2;
                }
            } else {
                pk pkVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                tp tpVar2 = new tp(objectVolatile, (kk) null, (xg0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    tp tpVar3 = tpVar2;
                    Unsafe unsafe3 = fe3.a;
                    pkVar = pkVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(pkVar, W, objectVolatile, tpVar3);
                    tpVar2 = tpVar3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(pkVar, j) != objectVolatile) {
                        break;
                    } else {
                        pkVar3 = pkVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = pkVar;
        }
    }

    @Override // defpackage.nk
    public final void c(Object obj, xg0 xg0Var) {
        D(obj, this.c, xg0Var);
    }

    @Override // defpackage.nk
    public final vy2 d(Object obj, xg0 xg0Var) {
        return G(obj, xg0Var);
    }

    @Override // defpackage.h20
    public final fs e() {
        return this.d;
    }

    @Override // defpackage.nk
    public final void f(Object obj) {
        p(this.c);
    }

    @Override // defpackage.h20
    public final Throwable g(Object obj) {
        Throwable thG = super.g(obj);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // defpackage.gt
    public final gt getCallerFrame() {
        fs fsVar = this.d;
        if (fsVar instanceof gt) {
            return (gt) fsVar;
        }
        return null;
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.h20
    public final Object h(Object obj) {
        return obj instanceof tp ? ((tp) obj).a : obj;
    }

    @Override // defpackage.h20
    public final Object j() {
        return t();
    }

    public final void k(kk kkVar, Throwable th) {
        try {
            kkVar.a(th);
        } catch (Throwable th2) {
            ia.h(new xp(0, "Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    public final void l(xg0 xg0Var, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.e;
        try {
            xg0Var.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            ia.h(new xp(0, "Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m(zn1 zn1Var, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int i2 = f.get(this) & 536870911;
        if (i2 == 536870911) {
            uq1.q("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            zn1Var.m(i2, coroutineContext);
        } catch (Throwable th2) {
            ia.h(new xp(0, "Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final boolean n(Throwable th) {
        pk pkVar;
        while (true) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j = W;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof h71)) {
                return false;
            }
            sk skVar = new sk(this, th, (objectVolatile instanceof kk) || (objectVolatile instanceof zn1));
            while (true) {
                Unsafe unsafe2 = fe3.a;
                pkVar = this;
                if (unsafe2.compareAndSwapObject(pkVar, W, objectVolatile, skVar)) {
                    h71 h71Var = (h71) objectVolatile;
                    if (h71Var instanceof kk) {
                        pkVar.k((kk) objectVolatile, th);
                    } else if (h71Var instanceof zn1) {
                        pkVar.m((zn1) objectVolatile, th);
                    }
                    if (!pkVar.y()) {
                        pkVar.o();
                    }
                    pkVar.p(pkVar.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(pkVar, j) != objectVolatile) {
                    break;
                }
                this = pkVar;
            }
            this = pkVar;
        }
    }

    public final void o() {
        n20 n20VarR = r();
        if (n20VarR == null) {
            return;
        }
        n20VarR.a();
        v.getClass();
        fe3.a.putObjectVolatile(this, w, g71.a);
    }

    public final void p(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    uq1.q("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                fs fsVar = this.d;
                if (!z && (fsVar instanceof f20)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.c;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        f20 f20Var = (f20) fsVar;
                        ys ysVar = f20Var.d;
                        CoroutineContext context = f20Var.e.getContext();
                        if (ysVar.i(context)) {
                            ysVar.e(context, this);
                            return;
                        }
                        s70 s70VarA = jx1.a();
                        if (s70VarA.c >= 4294967296L) {
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
                            nj2.S(this, fsVar, true);
                            do {
                            } while (s70VarA.p());
                        } catch (Throwable th) {
                            try {
                                i(th);
                            } finally {
                                s70VarA.l(true);
                            }
                        }
                        return;
                    }
                }
                nj2.S(this, fsVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable q(lt0 lt0Var) {
        return lt0Var.getCancellationException();
    }

    public final n20 r() {
        v.getClass();
        return (n20) fe3.a.getObjectVolatile(this, w);
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        Throwable thA = rj1.a(obj);
        if (thA != null) {
            obj = new vp(thA, false);
        }
        D(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        ws0 ws0Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.q("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objT = t();
                if (objT instanceof vp) {
                    throw ((vp) objT).a;
                }
                int i4 = this.c;
                if ((i4 != 1 && i4 != 2) || (ws0Var = (ws0) this.e.get(k42.c)) == null || ws0Var.isActive()) {
                    return h(objT);
                }
                CancellationException cancellationException = ws0Var.getCancellationException();
                b(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (r() == null) {
            v();
        }
        if (zY) {
            B();
        }
        return ft.a;
    }

    public final Object t() {
        i.getClass();
        return fe3.a.getObjectVolatile(this, W);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(qt.C(this.d));
        sb.append("){");
        Object objT = t();
        if (objT instanceof h71) {
            str = "Active";
        } else {
            str = objT instanceof sk ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(qt.j(this));
        return sb.toString();
    }

    public final void u() {
        n20 n20VarV = v();
        if (n20VarV == null || (t() instanceof h71)) {
            return;
        }
        n20VarV.a();
        v.getClass();
        fe3.a.putObjectVolatile(this, w, g71.a);
    }

    public final n20 v() {
        ws0 ws0Var = (ws0) this.e.get(k42.c);
        if (ws0Var == null) {
            return null;
        }
        n20 n20VarQ = ye1.q(ws0Var, true, new gm(this));
        while (true) {
            v.getClass();
            Unsafe unsafe = fe3.a;
            long j = w;
            pk pkVar = this;
            if (unsafe.compareAndSwapObject(pkVar, j, (Object) null, n20VarQ) || unsafe.getObjectVolatile(pkVar, j) != null) {
                break;
            }
            this = pkVar;
        }
        return n20VarQ;
    }

    public final void w(Function1 function1) {
        x(new jk(function1, 1));
    }

    public final void x(h71 h71Var) {
        pk pkVar;
        Unsafe unsafe;
        pk pkVar2;
        while (true) {
            i.getClass();
            Unsafe unsafe2 = fe3.a;
            long j = W;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof f4) {
                while (true) {
                    Unsafe unsafe3 = fe3.a;
                    pkVar = this;
                    if (unsafe3.compareAndSwapObject(pkVar, W, objectVolatile, h71Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(pkVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = pkVar;
                    }
                }
            } else {
                pkVar = this;
                if ((objectVolatile instanceof kk) || (objectVolatile instanceof zn1)) {
                    z(h71Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof vp) {
                    vp vpVar = (vp) objectVolatile;
                    if (!vp.b.compareAndSet(vpVar, 0, 1)) {
                        z(h71Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof sk) {
                        Throwable th = vpVar.a;
                        if (h71Var instanceof kk) {
                            pkVar.k((kk) h71Var, th);
                            return;
                        } else {
                            pkVar.m((zn1) h71Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof tp) {
                    tp tpVar = (tp) objectVolatile;
                    if (tpVar.b != null) {
                        z(h71Var, objectVolatile);
                        throw null;
                    }
                    if (h71Var instanceof zn1) {
                        return;
                    }
                    kk kkVar = (kk) h71Var;
                    Throwable th2 = tpVar.e;
                    if (th2 != null) {
                        pkVar.k(kkVar, th2);
                        return;
                    }
                    tp tpVarA = tp.a(tpVar, kkVar, null, 29);
                    do {
                        unsafe = fe3.a;
                        pkVar2 = pkVar;
                        if (unsafe.compareAndSwapObject(pkVar, W, objectVolatile, tpVarA)) {
                            return;
                        } else {
                            pkVar = pkVar2;
                        }
                    } while (unsafe.getObjectVolatile(pkVar2, j) == objectVolatile);
                } else {
                    pk pkVar3 = pkVar;
                    if (h71Var instanceof zn1) {
                        return;
                    }
                    tp tpVar2 = new tp(objectVolatile, (kk) h71Var, (xg0) null, (Throwable) null, 28);
                    while (true) {
                        tp tpVar3 = tpVar2;
                        Unsafe unsafe4 = fe3.a;
                        pkVar = pkVar3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(pkVar, W, objectVolatile, tpVar3);
                        tpVar2 = tpVar3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(pkVar, j) != objectVolatile) {
                            break;
                        } else {
                            pkVar3 = pkVar;
                        }
                    }
                }
            }
            this = pkVar;
        }
    }

    public final boolean y() {
        if (this.c != 2) {
            return false;
        }
        fs fsVar = this.d;
        fsVar.getClass();
        return ((f20) fsVar).n();
    }
}
