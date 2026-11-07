package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class lt0 implements ws0, km, db1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(lt0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = fe3.a;
        d = unsafe.objectFieldOffset(lt0.class.getDeclaredField("_state$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(lt0.class, Object.class, "_parentHandle$volatile");
        c = unsafe.objectFieldOffset(lt0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public lt0(boolean z) {
        this._state$volatile = z ? yv2.g : yv2.f;
    }

    public static im G(uz0 uz0Var) {
        while (uz0Var.m()) {
            uz0Var = uz0Var.l();
        }
        while (true) {
            uz0Var = uz0Var.k();
            if (!uz0Var.m()) {
                if (uz0Var instanceof im) {
                    return (im) uz0Var;
                }
                if (uz0Var instanceof f71) {
                    return null;
                }
            }
        }
    }

    public static String P(Object obj) {
        if (!(obj instanceof et0)) {
            if (obj instanceof up0) {
                return ((up0) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof vp ? "Cancelled" : "Completed";
        }
        et0 et0Var = (et0) obj;
        if (et0Var.e()) {
            return "Cancelling";
        }
        return et0.b.get(et0Var) != 0 ? "Completing" : "Active";
    }

    public static CancellationException Q(lt0 lt0Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new xs0(lt0Var.m(), th, lt0Var) : cancellationException;
    }

    public final void A(ws0 ws0Var) {
        g71 g71Var = g71.a;
        if (ws0Var == null) {
            N(g71Var);
            return;
        }
        ws0Var.start();
        hm hmVarAttachChild = ws0Var.attachChild(this);
        N(hmVarAttachChild);
        if (x() instanceof up0) {
            return;
        }
        hmVarAttachChild.a();
        N(g71Var);
    }

    public final n20 B(boolean z, bt0 bt0Var) {
        lt0 lt0Var;
        bt0 bt0Var2;
        boolean zD;
        bt0Var.i = this;
        loop0: while (true) {
            Object objX = this.x();
            if (!(objX instanceof u50)) {
                lt0Var = this;
                bt0Var2 = bt0Var;
                boolean z2 = objX instanceof up0;
                g71 g71Var = g71.a;
                if (z2) {
                    up0 up0Var = (up0) objX;
                    f71 f71VarC = up0Var.c();
                    if (f71VarC == null) {
                        lt0Var.L((bt0) objX);
                    } else {
                        if (bt0Var2.q()) {
                            et0 et0Var = up0Var instanceof et0 ? (et0) up0Var : null;
                            Throwable thD = et0Var != null ? et0Var.d() : null;
                            if (thD == null) {
                                zD = f71VarC.d(bt0Var2, 5);
                            } else if (z) {
                                bt0Var2.r(thD);
                                return g71Var;
                            }
                        } else {
                            zD = f71VarC.d(bt0Var2, 1);
                        }
                        if (zD) {
                            break;
                        }
                    }
                    this = lt0Var;
                    bt0Var = bt0Var2;
                } else if (z) {
                    Object objX2 = lt0Var.x();
                    vp vpVar = objX2 instanceof vp ? (vp) objX2 : null;
                    bt0Var2.r(vpVar != null ? vpVar.a : null);
                }
                return g71Var;
            }
            u50 u50Var = (u50) objX;
            if (u50Var.a) {
                while (true) {
                    a.getClass();
                    Unsafe unsafe = fe3.a;
                    long j = d;
                    lt0Var = this;
                    bt0Var2 = bt0Var;
                    if (unsafe.compareAndSwapObject(lt0Var, j, objX, bt0Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(lt0Var, j) != objX) {
                        break;
                    }
                    this = lt0Var;
                    bt0Var = bt0Var2;
                }
            } else {
                lt0Var = this;
                bt0Var2 = bt0Var;
                lt0Var.K(u50Var);
            }
            this = lt0Var;
            bt0Var = bt0Var2;
        }
        return bt0Var2;
    }

    public boolean C() {
        return this instanceof sh;
    }

    public final boolean D(Object obj) {
        Object objT;
        do {
            objT = T(x(), obj);
            if (objT == yv2.a) {
                return false;
            }
            if (objT == yv2.b) {
                return true;
            }
        } while (objT == yv2.c);
        g(objT);
        return true;
    }

    public final Object E(Object obj) {
        Object objT;
        do {
            objT = T(x(), obj);
            if (objT == yv2.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                vp vpVar = obj instanceof vp ? (vp) obj : null;
                throw new IllegalStateException(str, vpVar != null ? vpVar.a : null);
            }
        } while (objT == yv2.c);
        return objT;
    }

    public String F() {
        return getClass().getSimpleName();
    }

    public final void H(f71 f71Var, Throwable th) {
        f71Var.d(new ky0(4), 4);
        Object objJ = f71Var.j();
        objJ.getClass();
        xp xpVar = null;
        for (uz0 uz0VarK = (uz0) objJ; !Intrinsics.areEqual(uz0VarK, f71Var); uz0VarK = uz0VarK.k()) {
            if ((uz0VarK instanceof bt0) && ((bt0) uz0VarK).q()) {
                try {
                    ((bt0) uz0VarK).r(th);
                } catch (Throwable th2) {
                    if (xpVar != null) {
                        a80.a(xpVar, th2);
                    } else {
                        xpVar = new xp(0, "Exception in completion handler " + uz0VarK + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (xpVar != null) {
            z(xpVar);
        }
        l(th);
    }

    public final void K(u50 u50Var) {
        f71 f71Var = new f71();
        Object tp0Var = u50Var.a ? f71Var : new tp0(f71Var);
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = d;
            lt0 lt0Var = this;
            u50 u50Var2 = u50Var;
            if (unsafe.compareAndSwapObject(lt0Var, j, u50Var2, tp0Var) || unsafe.getObjectVolatile(lt0Var, j) != u50Var2) {
                return;
            }
            this = lt0Var;
            u50Var = u50Var2;
        }
    }

    public final void L(bt0 bt0Var) {
        bt0Var.f(new f71());
        uz0 uz0VarK = bt0Var.k();
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = d;
            lt0 lt0Var = this;
            bt0 bt0Var2 = bt0Var;
            if (unsafe.compareAndSwapObject(lt0Var, j, bt0Var2, uz0VarK) || unsafe.getObjectVolatile(lt0Var, j) != bt0Var2) {
                return;
            }
            this = lt0Var;
            bt0Var = bt0Var2;
        }
    }

    public final void M(bt0 bt0Var) {
        lt0 lt0Var;
        while (true) {
            Object objX = this.x();
            if (!(objX instanceof bt0)) {
                if (!(objX instanceof up0) || ((up0) objX).c() == null) {
                    return;
                }
                bt0Var.n();
                return;
            }
            if (objX != bt0Var) {
                return;
            }
            u50 u50Var = yv2.g;
            while (true) {
                a.getClass();
                Unsafe unsafe = fe3.a;
                long j = d;
                lt0Var = this;
                if (unsafe.compareAndSwapObject(lt0Var, j, objX, u50Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(lt0Var, j) != objX) {
                    break;
                } else {
                    this = lt0Var;
                }
            }
            this = lt0Var;
        }
    }

    public final void N(hm hmVar) {
        b.getClass();
        fe3.a.putObjectVolatile(this, c, hmVar);
    }

    public final int O(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof u50;
        long j = d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((u50) obj).a) {
                return 0;
            }
            u50 u50Var = yv2.g;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = fe3.a;
                if (unsafe2.compareAndSwapObject(this, d, obj, u50Var)) {
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof tp0)) {
            return 0;
        }
        f71 f71Var = ((tp0) obj).a;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = fe3.a;
            if (unsafe.compareAndSwapObject(this, d, obj, f71Var)) {
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final boolean R(up0 up0Var, Object obj) {
        Object vp0Var = obj instanceof up0 ? new vp0((up0) obj) : obj;
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = d;
            lt0 lt0Var = this;
            up0 up0Var2 = up0Var;
            if (unsafe.compareAndSwapObject(lt0Var, j, up0Var2, vp0Var)) {
                lt0Var.I(obj);
                lt0Var.o(up0Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(lt0Var, j) != up0Var2) {
                return false;
            }
            this = lt0Var;
            up0Var = up0Var2;
        }
    }

    public final boolean S(up0 up0Var, Throwable th) {
        f71 f71VarV = v(up0Var);
        if (f71VarV == null) {
            return false;
        }
        et0 et0Var = new et0(f71VarV, th);
        while (true) {
            a.getClass();
            Unsafe unsafe = fe3.a;
            long j = d;
            lt0 lt0Var = this;
            up0 up0Var2 = up0Var;
            if (unsafe.compareAndSwapObject(lt0Var, j, up0Var2, et0Var)) {
                lt0Var.H(f71VarV, th);
                return true;
            }
            if (unsafe.getObjectVolatile(lt0Var, j) != up0Var2) {
                return false;
            }
            this = lt0Var;
            up0Var = up0Var2;
        }
    }

    public final Object T(Object obj, Object obj2) {
        if (!(obj instanceof up0)) {
            return yv2.a;
        }
        if (((obj instanceof u50) || (obj instanceof bt0)) && !(obj instanceof im) && !(obj2 instanceof vp)) {
            return R((up0) obj, obj2) ? obj2 : yv2.c;
        }
        up0 up0Var = (up0) obj;
        f71 f71VarV = v(up0Var);
        if (f71VarV == null) {
            return yv2.c;
        }
        et0 et0Var = up0Var instanceof et0 ? (et0) up0Var : null;
        if (et0Var == null) {
            et0Var = new et0(f71VarV, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (et0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = et0.b;
            if (atomicIntegerFieldUpdater.get(et0Var) != 0) {
                return yv2.a;
            }
            atomicIntegerFieldUpdater.set(et0Var, 1);
            if (et0Var != up0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, up0Var, et0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != up0Var) {
                        return yv2.c;
                    }
                }
            }
            boolean zE = et0Var.e();
            vp vpVar = obj2 instanceof vp ? (vp) obj2 : null;
            if (vpVar != null) {
                et0Var.a(vpVar.a);
            }
            Throwable thD = zE ? null : et0Var.d();
            objectRef.element = thD;
            Unit unit = Unit.a;
            if (thD != null) {
                H(f71VarV, thD);
            }
            im imVarG = G(f71VarV);
            if (imVarG != null && U(et0Var, imVarG, obj2)) {
                return yv2.b;
            }
            f71VarV.d(new ky0(2), 2);
            im imVarG2 = G(f71VarV);
            return (imVarG2 == null || !U(et0Var, imVarG2, obj2)) ? q(et0Var, obj2) : yv2.b;
        }
    }

    public final boolean U(et0 et0Var, im imVar, Object obj) {
        while (ye1.q(imVar.v, false, new dt0(this, et0Var, imVar, obj)) == g71.a) {
            imVar = G(imVar);
            if (imVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ws0
    public final hm attachChild(km kmVar) {
        lt0 lt0Var;
        im imVar = new im(kmVar);
        imVar.i = this;
        loop0: while (true) {
            Object objX = this.x();
            if (objX instanceof u50) {
                u50 u50Var = (u50) objX;
                if (u50Var.a) {
                    while (true) {
                        a.getClass();
                        Unsafe unsafe = fe3.a;
                        long j = d;
                        lt0Var = this;
                        if (unsafe.compareAndSwapObject(lt0Var, j, objX, imVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(lt0Var, j) != objX) {
                            break;
                        }
                        this = lt0Var;
                    }
                } else {
                    lt0Var = this;
                    lt0Var.K(u50Var);
                }
                this = lt0Var;
            } else {
                lt0Var = this;
                boolean z = objX instanceof up0;
                g71 g71Var = g71.a;
                Throwable thD = null;
                if (!z) {
                    Object objX2 = lt0Var.x();
                    vp vpVar = objX2 instanceof vp ? (vp) objX2 : null;
                    imVar.r(vpVar != null ? vpVar.a : null);
                    return g71Var;
                }
                f71 f71VarC = ((up0) objX).c();
                if (f71VarC != null) {
                    if (f71VarC.d(imVar, 7)) {
                        break;
                    }
                    boolean zD = f71VarC.d(imVar, 3);
                    Object objX3 = lt0Var.x();
                    if (objX3 instanceof et0) {
                        thD = ((et0) objX3).d();
                    } else {
                        vp vpVar2 = objX3 instanceof vp ? (vp) objX3 : null;
                        if (vpVar2 != null) {
                            thD = vpVar2.a;
                        }
                    }
                    imVar.r(thD);
                    if (zD) {
                        break;
                    }
                    return g71Var;
                }
                lt0Var.L((bt0) objX);
                this = lt0Var;
            }
        }
        return imVar;
    }

    @Override // defpackage.ws0, defpackage.nl
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new xs0(m(), null, this);
        }
        k(cancellationException);
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // defpackage.ws0
    public final CancellationException getCancellationException() {
        Object objX = x();
        if (!(objX instanceof et0)) {
            if (!(objX instanceof up0)) {
                return objX instanceof vp ? Q(this, ((vp) objX).a) : new xs0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            sm0.g(this, "Job is still new or active: ");
            return null;
        }
        Throwable thD = ((et0) objX).d();
        if (thD == null) {
            sm0.g(this, "Job is still new or active: ");
            return null;
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new xs0(strConcat, thD, this) : cancellationException;
    }

    @Override // defpackage.ws0
    public final Sequence getChildren() {
        return new vb(new ht0(null, this), 3);
    }

    public Object getCompleted() {
        return r();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objX = x();
        if (objX instanceof up0) {
            uq1.q("This job has not completed yet");
            return null;
        }
        vp vpVar = objX instanceof vp ? (vp) objX : null;
        if (vpVar != null) {
            return vpVar.a;
        }
        return null;
    }

    public final f getKey() {
        return k42.c;
    }

    public void h(Object obj) {
        g(obj);
    }

    public final Object i(fs fsVar) throws Throwable {
        Object objX;
        do {
            objX = x();
            if (!(objX instanceof up0)) {
                if (objX instanceof vp) {
                    throw ((vp) objX).a;
                }
                return yv2.W(objX);
            }
        } while (O(objX) < 0);
        ct0 ct0Var = new ct0(sr0.b(fsVar), this);
        ct0Var.u();
        ct0Var.x(new jk(ye1.q(this, true, new uj1(ct0Var)), 2));
        Object objS = ct0Var.s();
        ft ftVar = ft.a;
        return objS;
    }

    @Override // defpackage.ws0
    public final n20 invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return B(z2, z ? new xr0(function1) : new yr0(function1));
    }

    @Override // defpackage.ws0
    public boolean isActive() {
        Object objX = x();
        return (objX instanceof up0) && ((up0) objX).isActive();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean j(Object obj) {
        Throwable thP;
        Object objX;
        Throwable thD;
        vy2 vy2Var;
        up0 up0Var;
        Object objT;
        Object objT2 = yv2.a;
        if (u()) {
            do {
                Object objX2 = x();
                if (objX2 instanceof up0) {
                    if (objX2 instanceof et0) {
                        if (et0.b.get((et0) objX2) != 0) {
                        }
                    }
                    objT2 = T(objX2, new vp(p(obj), false));
                }
                objT2 = yv2.a;
                break;
            } while (objT2 == yv2.c);
            if (objT2 != yv2.b) {
                if (objT2 == yv2.a) {
                    thP = null;
                    while (true) {
                        objX = x();
                        if (objX instanceof et0) {
                            synchronized (objX) {
                                if (((et0) objX).b() == yv2.e) {
                                    vy2Var = yv2.d;
                                } else {
                                    boolean zE = ((et0) objX).e();
                                    if (obj == null || !zE) {
                                        if (thP == null) {
                                            thP = p(obj);
                                        }
                                        ((et0) objX).a(thP);
                                    }
                                    thD = zE ? null : ((et0) objX).d();
                                    if (thD != null) {
                                        H(((et0) objX).a, thD);
                                    }
                                    vy2Var = yv2.a;
                                }
                            }
                        } else if (objX instanceof up0) {
                            if (thP == null) {
                                thP = p(obj);
                            }
                            up0Var = (up0) objX;
                            if (up0Var.isActive()) {
                                objT = T(objX, new vp(thP, false));
                                if (objT != yv2.a) {
                                    sm0.g(objX, "Cannot happen in ");
                                    return false;
                                }
                                if (objT != yv2.c) {
                                    objT2 = objT;
                                    break;
                                }
                            } else if (S(up0Var, thP)) {
                                vy2Var = yv2.a;
                            }
                        } else {
                            vy2Var = yv2.d;
                        }
                        objT2 = vy2Var;
                        break;
                    }
                }
                if (objT2 != yv2.a && objT2 != yv2.b) {
                    if (objT2 == yv2.d) {
                        return false;
                    }
                    g(objT2);
                    return true;
                }
            }
        } else {
            if (objT2 == yv2.a) {
                thP = null;
                while (true) {
                    objX = x();
                    if (objX instanceof et0) {
                        synchronized (objX) {
                            if (((et0) objX).b() == yv2.e) {
                                vy2Var = yv2.d;
                            } else {
                                boolean zE2 = ((et0) objX).e();
                                if (obj == null) {
                                    if (thP == null) {
                                        thP = p(obj);
                                    }
                                    ((et0) objX).a(thP);
                                } else {
                                    if (thP == null) {
                                        thP = p(obj);
                                    }
                                    ((et0) objX).a(thP);
                                }
                                if (zE2) {
                                }
                                if (thD != null) {
                                    H(((et0) objX).a, thD);
                                }
                                vy2Var = yv2.a;
                            }
                        }
                    } else if (objX instanceof up0) {
                        if (thP == null) {
                            thP = p(obj);
                        }
                        up0Var = (up0) objX;
                        if (up0Var.isActive()) {
                            objT = T(objX, new vp(thP, false));
                            if (objT != yv2.a) {
                                sm0.g(objX, "Cannot happen in ");
                                return false;
                            }
                            if (objT != yv2.c) {
                                objT2 = objT;
                                break;
                            }
                        } else if (S(up0Var, thP)) {
                            vy2Var = yv2.a;
                        }
                    } else {
                        vy2Var = yv2.d;
                    }
                    objT2 = vy2Var;
                    break;
                }
            }
            if (objT2 != yv2.a) {
                if (objT2 == yv2.d) {
                    return false;
                }
                g(objT2);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.ws0
    public final Object join(fs fsVar) {
        Object objX;
        do {
            objX = x();
            if (!(objX instanceof up0)) {
                ye1.h(fsVar.getContext());
                return Unit.a;
            }
        } while (O(objX) < 0);
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        pkVar.x(new jk(ye1.q(this, true, new vj1(pkVar)), 2));
        Object objS = pkVar.s();
        ft ftVar = ft.a;
        if (objS != ftVar) {
            objS = Unit.a;
        }
        return objS == ftVar ? objS : Unit.a;
    }

    public void k(CancellationException cancellationException) {
        j(cancellationException);
    }

    public final boolean l(Throwable th) {
        if (C()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hm hmVarW = w();
        if (hmVarW == null || hmVarW == g71.a) {
            return z;
        }
        return hmVarW.b(th) || z;
    }

    public String m() {
        return "Job was cancelled";
    }

    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    public boolean n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return j(th) && t();
    }

    public final void o(up0 up0Var, Object obj) {
        hm hmVarW = w();
        if (hmVarW != null) {
            hmVarW.a();
            N(g71.a);
        }
        xp xpVar = null;
        vp vpVar = obj instanceof vp ? (vp) obj : null;
        Throwable th = vpVar != null ? vpVar.a : null;
        if (up0Var instanceof bt0) {
            try {
                ((bt0) up0Var).r(th);
                return;
            } catch (Throwable th2) {
                z(new xp(0, "Exception in completion handler " + up0Var + " for " + this, th2));
                return;
            }
        }
        f71 f71VarC = up0Var.c();
        if (f71VarC != null) {
            f71VarC.d(new ky0(1), 1);
            Object objJ = f71VarC.j();
            objJ.getClass();
            for (uz0 uz0VarK = (uz0) objJ; !Intrinsics.areEqual(uz0VarK, f71VarC); uz0VarK = uz0VarK.k()) {
                if (uz0VarK instanceof bt0) {
                    try {
                        ((bt0) uz0VarK).r(th);
                    } catch (Throwable th3) {
                        if (xpVar != null) {
                            a80.a(xpVar, th3);
                        } else {
                            xpVar = new xp(0, "Exception in completion handler " + uz0VarK + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (xpVar != null) {
                z(xpVar);
            }
        }
    }

    public final Throwable p(Object obj) {
        Throwable thD;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new xs0(m(), null, this) : th;
        }
        obj.getClass();
        lt0 lt0Var = (lt0) ((db1) obj);
        Object objX = lt0Var.x();
        if (objX instanceof et0) {
            thD = ((et0) objX).d();
        } else if (objX instanceof vp) {
            thD = ((vp) objX).a;
        } else {
            if (objX instanceof up0) {
                sm0.g(objX, "Cannot be cancelling child in this state: ");
                return null;
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new xs0("Parent job is ".concat(P(objX)), thD, lt0Var) : cancellationException;
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    public final Object q(et0 et0Var, Object obj) throws Throwable {
        Throwable th;
        lt0 lt0Var;
        et0 et0Var2;
        vp vpVar = obj instanceof vp ? (vp) obj : null;
        Throwable th2 = vpVar != null ? vpVar.a : null;
        synchronized (et0Var) {
            try {
                et0Var.e();
                ArrayList arrayListF = et0Var.f(th2);
                Throwable thS = s(et0Var, arrayListF);
                if (thS != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            int size = arrayListF.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListF.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thS && th3 != thS && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    a80.a(thS, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thS != null && thS != th2) {
                    obj = new vp(thS, false);
                }
                if (thS != null && (l(thS) || y(thS))) {
                    obj.getClass();
                    vp.b.compareAndSet((vp) obj, 0, 1);
                }
                I(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                Object vp0Var = obj instanceof up0 ? new vp0((up0) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = fe3.a;
                    long j = d;
                    lt0Var = this;
                    et0Var2 = et0Var;
                    if (unsafe.compareAndSwapObject(lt0Var, j, et0Var2, vp0Var) || unsafe.getObjectVolatile(lt0Var, j) != et0Var2) {
                        break;
                    }
                    this = lt0Var;
                    et0Var = et0Var2;
                }
                lt0Var.o(et0Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object r() {
        Object objX = x();
        if (objX instanceof up0) {
            uq1.q("This job has not completed yet");
            return null;
        }
        if (objX instanceof vp) {
            throw ((vp) objX).a;
        }
        return yv2.W(objX);
    }

    public final Throwable s(et0 et0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (et0Var.e()) {
                return new xs0(m(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof wx1) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof wx1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // defpackage.ws0
    public final boolean start() {
        int iO;
        do {
            iO = O(x());
            if (iO == 0) {
                return false;
            }
        } while (iO != 1);
        return true;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(F() + '{' + P(x()) + '}');
        sb.append('@');
        sb.append(qt.j(this));
        return sb.toString();
    }

    public boolean u() {
        return this instanceof cp;
    }

    public final f71 v(up0 up0Var) {
        f71 f71VarC = up0Var.c();
        if (f71VarC != null) {
            return f71VarC;
        }
        if (up0Var instanceof u50) {
            return new f71();
        }
        if (up0Var instanceof bt0) {
            L((bt0) up0Var);
            return null;
        }
        sm0.g(up0Var, "State should have list: ");
        return null;
    }

    public final hm w() {
        b.getClass();
        return (hm) fe3.a.getObjectVolatile(this, c);
    }

    public final Object x() {
        a.getClass();
        return fe3.a.getObjectVolatile(this, d);
    }

    public boolean y(Throwable th) {
        return false;
    }

    @Override // defpackage.ws0
    public final n20 invokeOnCompletion(Function1 function1) {
        return B(true, new yr0(function1));
    }

    public void J() {
    }

    public void I(Object obj) {
    }

    public void g(Object obj) {
    }

    public void z(xp xpVar) {
        throw xpVar;
    }
}
