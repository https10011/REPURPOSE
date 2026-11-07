package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class mi implements nl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater W;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    public static final /* synthetic */ long a0;
    public static final /* synthetic */ long b0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(mi.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(mi.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(mi.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(mi.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(mi.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = fe3.a;
        b0 = unsafe.objectFieldOffset(mi.class.getDeclaredField("sendSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(mi.class, Object.class, "receiveSegment$volatile");
        a0 = unsafe.objectFieldOffset(mi.class.getDeclaredField("receiveSegment$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(mi.class, Object.class, "bufferEndSegment$volatile");
        Y = unsafe.objectFieldOffset(mi.class.getDeclaredField("bufferEndSegment$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(mi.class, Object.class, "_closeCause$volatile");
        X = unsafe.objectFieldOffset(mi.class.getDeclaredField("_closeCause$volatile"));
        W = AtomicReferenceFieldUpdater.newUpdater(mi.class, Object.class, "closeHandler$volatile");
        Z = unsafe.objectFieldOffset(mi.class.getDeclaredField("closeHandler$volatile"));
    }

    public mi(int i2) {
        this.a = i2;
        if (i2 < 0) {
            e.d(ts.g(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        ul ulVar = oi.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        ul ulVar2 = new ul(0L, null, this, 3);
        this.sendSegment$volatile = ulVar2;
        this.receiveSegment$volatile = ulVar2;
        if (x()) {
            ulVar2 = oi.a;
            ulVar2.getClass();
        }
        this.bufferEndSegment$volatile = ulVar2;
        this._closeCause$volatile = oi.s;
    }

    public static Object A(mi miVar, pw pwVar) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        atomicReferenceFieldUpdater.getClass();
        if (miVar == null) {
            ur.a();
            return null;
        }
        ul ulVar = (ul) fe3.a.getObjectVolatile(miVar, a0);
        while (true) {
            miVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            if (miVar.v(atomicLongFieldUpdater.get(miVar), true)) {
                Throwable thP = miVar.p();
                int i2 = at1.a;
                throw thP;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(miVar);
            long j = oi.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (ulVar.e != j2) {
                ul ulVarM = miVar.m(j2, ulVar);
                if (ulVarM == null) {
                    continue;
                } else {
                    ulVar = ulVarM;
                }
            }
            Object objH = miVar.H(ulVar, i3, andIncrement, null);
            Object obj = oi.m;
            if (objH == obj) {
                uq1.q("unexpected");
                return null;
            }
            Object obj2 = oi.o;
            if (objH != obj2) {
                if (objH != oi.n) {
                    ulVar.b();
                    return objH;
                }
                pk pkVarU = aj0.u(sr0.b(pwVar));
                try {
                    Object objH2 = miVar.H(ulVar, i3, andIncrement, pkVarU);
                    if (objH2 == obj) {
                        pkVarU.a(ulVar, i3);
                    } else if (objH2 == obj2) {
                        if (andIncrement < miVar.r()) {
                            ulVar.b();
                        }
                        ul ulVar2 = (ul) atomicReferenceFieldUpdater.get(miVar);
                        for (boolean z = true; !miVar.v(atomicLongFieldUpdater.get(miVar), z); z = true) {
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(miVar);
                            long j3 = oi.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i4 = (int) (andIncrement2 % j3);
                            if (ulVar2.e != j4) {
                                ul ulVarM2 = miVar.m(j4, ulVar2);
                                if (ulVarM2 == null) {
                                    continue;
                                } else {
                                    ulVar2 = ulVarM2;
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            }
                            Object objH3 = miVar.H(ulVar2, i4, andIncrement2, pkVarU);
                            if (objH3 == oi.m) {
                                pkVarU.a(ulVar2, i4);
                            } else if (objH3 == oi.o) {
                                if (andIncrement2 < miVar.r()) {
                                    ulVar2.b();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            } else {
                                if (objH3 == oi.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ulVar2.b();
                                pkVarU.c(objH3, null);
                            }
                        }
                        pj1 pj1Var = rj1.b;
                        pkVarU.resumeWith(new qj1(miVar.p()));
                    } else {
                        ulVar.b();
                        pkVarU.c(objH2, null);
                    }
                    Object objS = pkVarU.s();
                    ft ftVar = ft.a;
                    return objS;
                } catch (Throwable th) {
                    pkVarU.B();
                    throw th;
                }
            }
            if (andIncrement < miVar.r()) {
                ulVar.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:89:0x015b A[RETURN] */
    public static Object C(mi miVar, Object obj, fs fsVar) {
        Object objS;
        ft ftVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        atomicReferenceFieldUpdater.getClass();
        ul ulVar = (ul) fe3.a.getObjectVolatile(miVar, b0);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(miVar);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = miVar.v(andIncrement, false);
            int i2 = oi.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (ulVar.e != j3) {
                ul ulVarN = miVar.n(j3, ulVar);
                if (ulVarN != null) {
                    ulVar = ulVarN;
                } else if (zV) {
                    Object objZ = miVar.z(fsVar, obj);
                    if (objZ != ft.a) {
                        break;
                    }
                    return objZ;
                }
            }
            int iC = c(miVar, ulVar, i3, obj, j, null, zV);
            if (iC == 0) {
                ulVar.b();
                break;
            }
            if (iC != 1) {
                if (iC == 2) {
                    if (!zV) {
                        break;
                    }
                    ulVar.n();
                    Object objZ2 = miVar.z(fsVar, obj);
                    if (objZ2 != ft.a) {
                        break;
                    }
                    return objZ2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                if (iC == 3) {
                    pk pkVarU = aj0.u(sr0.b(fsVar));
                    try {
                        int iC2 = c(miVar, ulVar, i3, obj, j, pkVarU, false);
                        if (iC2 == 0) {
                            ulVar.b();
                            pj1 pj1Var = rj1.b;
                        } else {
                            if (iC2 != 1) {
                                if (iC2 != 2) {
                                    if (iC2 != 4) {
                                        String str = "unexpected";
                                        if (iC2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ulVar.b();
                                        ul ulVar2 = (ul) atomicReferenceFieldUpdater.get(miVar);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(miVar);
                                            long j4 = andIncrement2 & 1152921504606846975L;
                                            boolean zV2 = miVar.v(andIncrement2, false);
                                            int i4 = oi.b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j5 = i4;
                                            long j6 = j4 / j5;
                                            int i5 = (int) (j4 % j5);
                                            if (ulVar2.e != j6) {
                                                ul ulVarN2 = miVar.n(j6, ulVar2);
                                                if (ulVarN2 != null) {
                                                    ulVar2 = ulVarN2;
                                                } else if (zV2) {
                                                }
                                            }
                                            int iC3 = c(miVar, ulVar2, i5, obj, j4, pkVarU, zV2);
                                            if (iC3 == 0) {
                                                ulVar2.b();
                                                pj1 pj1Var2 = rj1.b;
                                            } else if (iC3 == 1) {
                                                pj1 pj1Var3 = rj1.b;
                                            } else if (iC3 == 2) {
                                                if (!zV2) {
                                                    pkVarU.a(ulVar2, i5 + i4);
                                                    break;
                                                }
                                                ulVar2.n();
                                            } else {
                                                if (iC3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iC3 != 4) {
                                                    if (iC3 == 5) {
                                                        ulVar2.b();
                                                    }
                                                    str = str;
                                                } else if (j4 < atomicLongFieldUpdater2.get(miVar)) {
                                                    ulVar2.b();
                                                }
                                            }
                                        }
                                    } else if (j < atomicLongFieldUpdater2.get(miVar)) {
                                        ulVar.b();
                                    }
                                    b(miVar, obj, pkVarU);
                                    break;
                                } else {
                                    pkVarU.a(ulVar, i3 + i2);
                                }
                                objS = pkVarU.s();
                                ftVar = ft.a;
                                if (objS != ftVar) {
                                    objS = Unit.a;
                                }
                                if (objS == ftVar) {
                                    break;
                                }
                                return objS;
                            }
                            pj1 pj1Var4 = rj1.b;
                        }
                        pkVarU.resumeWith(Unit.a);
                        objS = pkVarU.s();
                        ftVar = ft.a;
                        if (objS != ftVar) {
                            objS = Unit.a;
                        }
                        if (objS == ftVar) {
                            break;
                        }
                        return objS;
                    } catch (Throwable th) {
                        pkVarU.B();
                        throw th;
                    }
                }
                if (iC == 4) {
                    if (j < atomicLongFieldUpdater2.get(miVar)) {
                        ulVar.b();
                    }
                    Object objZ3 = miVar.z(fsVar, obj);
                    if (objZ3 != ft.a) {
                        break;
                    }
                    return objZ3;
                }
                if (iC == 5) {
                    ulVar.b();
                }
            } else {
                break;
            }
        }
        return Unit.a;
    }

    public static boolean F(Object obj) {
        if (!(obj instanceof nk)) {
            sm0.g(obj, "Unexpected waiter: ");
            return false;
        }
        nk nkVar = (nk) obj;
        Unit unit = Unit.a;
        ul ulVar = oi.a;
        vy2 vy2VarD = nkVar.d(unit, null);
        if (vy2VarD == null) {
            return false;
        }
        nkVar.f(vy2VarD);
        return true;
    }

    public static final void b(mi miVar, Object obj, pk pkVar) {
        Throwable thQ = miVar.q();
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(new qj1(thQ));
    }

    public static final int c(mi miVar, ul ulVar, int i2, Object obj, long j, Object obj2, boolean z) {
        ulVar.s(i2, obj);
        if (z) {
            return miVar.I(ulVar, i2, obj, j, obj2, z);
        }
        Object objQ = ulVar.q(i2);
        if (objQ == null) {
            if (miVar.d(j)) {
                if (ulVar.p(i2, null, oi.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ulVar.p(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof s72) {
            ulVar.s(i2, null);
            if (miVar.E(objQ, obj)) {
                ulVar.t(i2, oi.i);
                return 0;
            }
            vy2 vy2Var = oi.k;
            if (ulVar.h.getAndSet((i2 * 2) + 1, vy2Var) == vy2Var) {
                return 5;
            }
            ulVar.r(i2, true);
            return 5;
        }
        return miVar.I(ulVar, i2, obj, j, obj2, z);
    }

    public static void t(mi miVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(miVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(miVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void B(s72 s72Var, boolean z) {
        if (s72Var instanceof nk) {
            fs fsVar = (fs) s72Var;
            pj1 pj1Var = rj1.b;
            fsVar.resumeWith(new qj1(z ? p() : q()));
            return;
        }
        if (!(s72Var instanceof li)) {
            sm0.g(s72Var, "Unexpected waiter: ");
            return;
        }
        li liVar = (li) s72Var;
        pk pkVar = liVar.b;
        pkVar.getClass();
        liVar.b = null;
        liVar.a = oi.l;
        Throwable thO = liVar.c.o();
        if (thO == null) {
            pj1 pj1Var2 = rj1.b;
            pkVar.resumeWith(Boolean.FALSE);
        } else {
            pj1 pj1Var3 = rj1.b;
            pkVar.resumeWith(new qj1(thO));
        }
    }

    public final Object D() {
        ul ulVar;
        tl tlVar = ta.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = b;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (v(j2, true)) {
            return new sl(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return tlVar;
        }
        Object obj = oi.k;
        i.getClass();
        ul ulVar2 = (ul) fe3.a.getObjectVolatile(this, a0);
        while (!this.v(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = oi.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (ulVar2.e != j4) {
                ul ulVarM = this.m(j4, ulVar2);
                if (ulVarM == null) {
                    continue;
                } else {
                    ulVar = ulVarM;
                }
            } else {
                ulVar = ulVar2;
            }
            mi miVar = this;
            Object objH = miVar.H(ulVar, i2, andIncrement, obj);
            ulVar2 = ulVar;
            if (objH == oi.m) {
                s72 s72Var = obj instanceof s72 ? (s72) obj : null;
                if (s72Var != null) {
                    s72Var.a(ulVar2, i2);
                }
                miVar.J(andIncrement);
                ulVar2.n();
                return tlVar;
            }
            if (objH != oi.o) {
                if (objH != oi.n) {
                    ulVar2.b();
                    return objH;
                }
                uq1.q("unexpected");
                return null;
            }
            if (andIncrement < miVar.r()) {
                ulVar2.b();
            }
            this = miVar;
        }
        return new sl(this.o());
    }

    public final boolean E(Object obj, Object obj2) {
        if (!(obj instanceof li)) {
            if (!(obj instanceof nk)) {
                sm0.g(obj, "Unexpected receiver type: ");
                return false;
            }
            nk nkVar = (nk) obj;
            ul ulVar = oi.a;
            vy2 vy2VarD = nkVar.d(obj2, null);
            if (vy2VarD == null) {
                return false;
            }
            nkVar.f(vy2VarD);
            return true;
        }
        li liVar = (li) obj;
        pk pkVar = liVar.b;
        pkVar.getClass();
        liVar.b = null;
        liVar.a = obj2;
        Boolean bool = Boolean.TRUE;
        ul ulVar2 = oi.a;
        vy2 vy2VarD2 = pkVar.d(bool, null);
        if (vy2VarD2 == null) {
            return false;
        }
        pkVar.f(vy2VarD2);
        return true;
    }

    public final Object G(Object obj) {
        ul ulVarN;
        an2 an2Var = oi.d;
        f.getClass();
        ul ulVar = (ul) fe3.a.getObjectVolatile(this, b0);
        while (true) {
            long andIncrement = b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = this.v(andIncrement, false);
            int i2 = oi.b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (ulVar.e != j3) {
                ulVarN = this.n(j3, ulVar);
                if (ulVarN == null) {
                    if (zV) {
                        return new sl(this.q());
                    }
                }
            } else {
                ulVarN = ulVar;
            }
            Object obj2 = obj;
            int iC = c(this, ulVarN, i3, obj2, j, an2Var, zV);
            mi miVar = this;
            ulVar = ulVarN;
            if (iC == 0) {
                ulVar.b();
                return Unit.a;
            }
            if (iC == 1) {
                return Unit.a;
            }
            if (iC == 2) {
                if (zV) {
                    ulVar.n();
                    return new sl(miVar.q());
                }
                s72 s72Var = an2Var instanceof s72 ? (s72) an2Var : null;
                if (s72Var != null) {
                    s72Var.a(ulVar, i3 + i2);
                }
                miVar.j((ulVar.e * j2) + ((long) i3));
                return Unit.a;
            }
            if (iC == 3) {
                uq1.q("unexpected");
                return null;
            }
            if (iC == 4) {
                if (j < c.get(miVar)) {
                    ulVar.b();
                }
                return new sl(miVar.q());
            }
            if (iC == 5) {
                ulVar.b();
            }
            this = miVar;
            obj = obj2;
        }
    }

    public final Object H(ul ulVar, int i2, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = ulVar.h;
        Object objQ = ulVar.q(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objQ == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return oi.n;
                }
                if (ulVar.p(i2, objQ, obj)) {
                    k();
                    return oi.m;
                }
            }
        } else if (objQ == oi.d && ulVar.p(i2, objQ, oi.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            ulVar.s(i2, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = ulVar.q(i2);
            if (objQ2 == null || objQ2 == oi.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (ulVar.p(i2, objQ2, oi.h)) {
                        k();
                        return oi.o;
                    }
                } else {
                    if (obj == null) {
                        return oi.n;
                    }
                    if (ulVar.p(i2, objQ2, obj)) {
                        k();
                        return oi.m;
                    }
                }
            } else if (objQ2 != oi.d) {
                vy2 vy2Var = oi.j;
                if (objQ2 == vy2Var) {
                    return oi.o;
                }
                if (objQ2 == oi.h) {
                    return oi.o;
                }
                if (objQ2 == oi.l) {
                    k();
                    return oi.o;
                }
                if (objQ2 != oi.g && ulVar.p(i2, objQ2, oi.f)) {
                    boolean z = objQ2 instanceof t72;
                    if (z) {
                        objQ2 = ((t72) objQ2).a;
                    }
                    if (F(objQ2)) {
                        ulVar.t(i2, oi.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        ulVar.s(i2, null);
                        return obj3;
                    }
                    ulVar.t(i2, vy2Var);
                    ulVar.n();
                    if (z) {
                        k();
                    }
                    return oi.o;
                }
            } else if (ulVar.p(i2, objQ2, oi.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                ulVar.s(i2, null);
                return obj4;
            }
        }
    }

    public final int I(ul ulVar, int i2, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objQ = ulVar.q(i2);
            if (objQ == null) {
                if (!d(j) || z) {
                    if (z) {
                        if (ulVar.p(i2, null, oi.j)) {
                            ulVar.n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ulVar.p(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ulVar.p(i2, null, oi.d)) {
                    break;
                }
            } else {
                if (objQ != oi.e) {
                    vy2 vy2Var = oi.k;
                    if (objQ == vy2Var) {
                        ulVar.s(i2, null);
                        return 5;
                    }
                    if (objQ == oi.h) {
                        ulVar.s(i2, null);
                        return 5;
                    }
                    if (objQ == oi.l) {
                        ulVar.s(i2, null);
                        i();
                        return 4;
                    }
                    ulVar.s(i2, null);
                    if (objQ instanceof t72) {
                        objQ = ((t72) objQ).a;
                    }
                    if (E(objQ, obj)) {
                        ulVar.t(i2, oi.i);
                        return 0;
                    }
                    if (ulVar.h.getAndSet((i2 * 2) + 1, vy2Var) != vy2Var) {
                        ulVar.r(i2, true);
                    }
                    return 5;
                }
                if (ulVar.p(i2, objQ, oi.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        mi miVar = this;
        if (miVar.x()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(miVar) > j) {
                break;
            } else {
                miVar = this;
            }
        }
        int i2 = oi.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j2 = atomicLongFieldUpdater.get(miVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(miVar)) && j2 == atomicLongFieldUpdater.get(miVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(miVar);
                    if (atomicLongFieldUpdater2.compareAndSet(miVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        miVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(miVar);
                    long j5 = atomicLongFieldUpdater2.get(miVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(miVar)) {
                        break;
                    }
                    if (z) {
                        miVar = this;
                    } else {
                        miVar = this;
                        atomicLongFieldUpdater2.compareAndSet(miVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(miVar);
                    if (atomicLongFieldUpdater2.compareAndSet(miVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        miVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.jo1
    public Object a(fs fsVar, Object obj) {
        return C(this, obj, fsVar);
    }

    @Override // defpackage.nl
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean d(long j) {
        return j < d.get(this) || j < c.get(this) + ((long) this.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0070, please report this as an issue */
    @Override // defpackage.jo1
    public Object e(Object obj) {
        int iC;
        s72 s72Var;
        tl tlVar = ta.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (v(j, false) ? false : !d(j & 1152921504606846975L)) {
            return tlVar;
        }
        an2 an2Var = oi.j;
        f.getClass();
        ul ulVar = (ul) fe3.a.getObjectVolatile(this, b0);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zV = v(andIncrement, z);
            int i2 = oi.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (ulVar.e == j5) {
                iC = c(this, ulVar, i3, obj, j3, an2Var, zV);
                if (iC != 0) {
                    ulVar.b();
                    return Unit.a;
                }
                if (iC != 1) {
                    return Unit.a;
                }
                if (iC != 2) {
                    if (zV) {
                        ulVar.n();
                        return new sl(q());
                    }
                    s72Var = an2Var instanceof s72 ? (s72) an2Var : null;
                    if (s72Var != null) {
                        s72Var.a(ulVar, i3 + i2);
                    }
                    ulVar.n();
                    return tlVar;
                }
                if (iC != 3) {
                    uq1.q("unexpected");
                    return null;
                }
                if (iC != 4) {
                    if (j3 < c.get(this)) {
                        ulVar.b();
                    }
                    return new sl(q());
                }
                if (iC == 5) {
                    ulVar.b();
                }
                z = false;
            } else {
                ul ulVarN = n(j5, ulVar);
                if (ulVarN != null) {
                    ulVar = ulVarN;
                    iC = c(this, ulVar, i3, obj, j3, an2Var, zV);
                    if (iC != 0) {
                        ulVar.b();
                        return Unit.a;
                    }
                    if (iC != 1) {
                        return Unit.a;
                    }
                    if (iC != 2) {
                        if (zV) {
                            ulVar.n();
                            return new sl(q());
                        }
                        if (an2Var instanceof s72) {
                        }
                        if (s72Var != null) {
                            s72Var.a(ulVar, i3 + i2);
                        }
                        ulVar.n();
                        return tlVar;
                    }
                    if (iC != 3) {
                        uq1.q("unexpected");
                        return null;
                    }
                    if (iC != 4) {
                        if (j3 < c.get(this)) {
                            ulVar.b();
                        }
                        return new sl(q());
                    }
                    if (iC == 5) {
                        ulVar.b();
                    }
                    z = false;
                } else {
                    if (zV) {
                        return new sl(q());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    public final ul f() {
        v.getClass();
        Unsafe unsafe = fe3.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, Y);
        f.getClass();
        ul ulVar = (ul) unsafe.getObjectVolatile(this, b0);
        if (ulVar.e > ((ul) objectVolatile).e) {
            objectVolatile = ulVar;
        }
        i.getClass();
        ul ulVar2 = (ul) unsafe.getObjectVolatile(this, a0);
        if (ulVar2.e > ((ul) objectVolatile).e) {
            objectVolatile = ulVar2;
        }
        uq uqVar = (uq) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uq.a;
            Object objE = uqVar.e();
            if (objE == tq.a) {
                break;
            }
            uq uqVar2 = (uq) objE;
            if (uqVar2 != null) {
                uqVar = uqVar2;
            } else if (uqVar.h()) {
                break;
            }
        }
        return (ul) uqVar;
    }

    public final boolean g(Throwable th, boolean z) {
        mi miVar;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (!z) {
            miVar = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                miVar = this;
                break;
            }
            ul ulVar = oi.a;
            miVar = this;
            if (atomicLongFieldUpdater.compareAndSet(miVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = miVar;
        }
        vy2 vy2Var = oi.s;
        while (true) {
            w.getClass();
            mi miVar2 = miVar;
            Unsafe unsafe = fe3.a;
            long j5 = X;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(miVar2, j5, vy2Var, th2);
            miVar = miVar2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(miVar, j5) != vy2Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(miVar);
            } while (!atomicLongFieldUpdater.compareAndSet(miVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(miVar);
                int i2 = (int) (j >> 60);
                if (i2 == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(miVar, j, j2));
        }
        miVar.i();
        if (z2) {
            miVar.u();
        }
        return z2;
    }

    public final ul h(long j) {
        long j2;
        ul ulVarF = f();
        if (w()) {
            ul ulVar = ulVarF;
            loop0: while (true) {
                int i2 = oi.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (ulVar.e * ((long) oi.b)) + ((long) i2);
                        if (j2 >= c.get(this)) {
                            while (true) {
                                Object objQ = ulVar.q(i2);
                                if (objQ != null && objQ != oi.e) {
                                    if (objQ != oi.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (ulVar.p(i2, objQ, oi.l)) {
                                    ulVar.n();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        ulVar = (ul) ulVar.f();
                        if (ulVar == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                j(j2);
            }
        }
        Object objT = null;
        loop3: for (ul ulVar2 = ulVarF; ulVar2 != null; ulVar2 = (ul) ulVar2.f()) {
            for (int i3 = oi.b - 1; -1 < i3; i3--) {
                if ((ulVar2.e * ((long) oi.b)) + ((long) i3) < j) {
                    break loop3;
                }
                while (true) {
                    Object objQ2 = ulVar2.q(i3);
                    if (objQ2 != null && objQ2 != oi.e) {
                        if (!(objQ2 instanceof t72)) {
                            if (!(objQ2 instanceof s72)) {
                                break;
                            }
                            if (ulVar2.p(i3, objQ2, oi.l)) {
                                objT = xi0.t(objT, objQ2);
                                ulVar2.r(i3, true);
                                break;
                            }
                        } else {
                            if (ulVar2.p(i3, objQ2, oi.l)) {
                                objT = xi0.t(objT, ((t72) objQ2).a);
                                ulVar2.r(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (ulVar2.p(i3, objQ2, oi.l)) {
                            ulVar2.n();
                            break;
                        }
                    }
                }
            }
        }
        if (objT != null) {
            if (!(objT instanceof ArrayList)) {
                B((s72) objT, true);
                return ulVarF;
            }
            ArrayList arrayList = (ArrayList) objT;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                B((s72) arrayList.get(size), true);
            }
        }
        return ulVarF;
    }

    public final void i() {
        v(b.get(this), false);
    }

    public final void j(long j) {
        i.getClass();
        ul ulVar = (ul) fe3.a.getObjectVolatile(this, a0);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.a) + j2, d.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = oi.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (ulVar.e != j4) {
                    ul ulVarM = this.m(j4, ulVar);
                    if (ulVarM != null) {
                        ulVar = ulVarM;
                    }
                }
                ul ulVar2 = ulVar;
                if (this.H(ulVar2, i2, j2, null) != oi.o || j2 < this.r()) {
                    ulVar2.b();
                }
                ulVar = ulVar2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    public final void k() {
        int i2;
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objQ;
        if (x()) {
            return;
        }
        v.getClass();
        ul ulVar = (ul) fe3.a.getObjectVolatile(this, Y);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j = oi.b;
            long j2 = andIncrement / j;
            if (this.r() <= andIncrement) {
                if (ulVar.e < j2 && ulVar.d() != null) {
                    this.y(j2, ulVar);
                }
                t(this);
                return;
            }
            mi miVar = this;
            if (ulVar.e == j2) {
                i2 = (int) (andIncrement % j);
                Object objQ2 = ulVar.q(i2);
                z = objQ2 instanceof s72;
                atomicLongFieldUpdater = c;
                if (z || andIncrement < atomicLongFieldUpdater.get(miVar) || !ulVar.p(i2, objQ2, oi.g)) {
                    while (true) {
                        objQ = ulVar.q(i2);
                        if (objQ instanceof s72) {
                            if (andIncrement < atomicLongFieldUpdater.get(miVar)) {
                                if (ulVar.p(i2, objQ, new t72((s72) objQ))) {
                                    t(miVar);
                                    return;
                                }
                            } else if (ulVar.p(i2, objQ, oi.g)) {
                                if (!F(objQ)) {
                                    ulVar.t(i2, oi.j);
                                    ulVar.n();
                                    break;
                                } else {
                                    ulVar.t(i2, oi.d);
                                    t(miVar);
                                    return;
                                }
                            }
                        } else {
                            if (objQ == oi.j) {
                                break;
                            }
                            if (objQ == null) {
                                if (ulVar.p(i2, objQ, oi.e)) {
                                    t(miVar);
                                    return;
                                }
                            } else if (objQ != oi.d || objQ == oi.h || objQ == oi.i || objQ == oi.k || objQ == oi.l) {
                                t(miVar);
                                return;
                            } else if (objQ != oi.f) {
                                sm0.g(objQ, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    t(miVar);
                } else if (F(objQ2)) {
                    ulVar.t(i2, oi.d);
                    t(miVar);
                    return;
                } else {
                    ulVar.t(i2, oi.j);
                    ulVar.n();
                    t(miVar);
                }
            } else {
                ul ulVarL = miVar.l(j2, ulVar, andIncrement);
                if (ulVarL == null) {
                    continue;
                } else {
                    ulVar = ulVarL;
                    i2 = (int) (andIncrement % j);
                    Object objQ3 = ulVar.q(i2);
                    z = objQ3 instanceof s72;
                    atomicLongFieldUpdater = c;
                    if (z) {
                        while (true) {
                            objQ = ulVar.q(i2);
                            if (objQ instanceof s72) {
                                if (andIncrement < atomicLongFieldUpdater.get(miVar)) {
                                    if (ulVar.p(i2, objQ, new t72((s72) objQ))) {
                                        t(miVar);
                                        return;
                                    }
                                } else if (ulVar.p(i2, objQ, oi.g)) {
                                    if (!F(objQ)) {
                                        ulVar.t(i2, oi.j);
                                        ulVar.n();
                                        break;
                                    } else {
                                        ulVar.t(i2, oi.d);
                                        t(miVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == oi.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != oi.d) {
                                        if (objQ != oi.f) {
                                            sm0.g(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    t(miVar);
                                    return;
                                }
                                if (ulVar.p(i2, objQ, oi.e)) {
                                    t(miVar);
                                    return;
                                }
                            }
                        }
                        t(miVar);
                    } else {
                        while (true) {
                            objQ = ulVar.q(i2);
                            if (objQ instanceof s72) {
                                if (andIncrement < atomicLongFieldUpdater.get(miVar)) {
                                    if (ulVar.p(i2, objQ, new t72((s72) objQ))) {
                                        t(miVar);
                                        return;
                                    }
                                } else if (ulVar.p(i2, objQ, oi.g)) {
                                    if (!F(objQ)) {
                                        ulVar.t(i2, oi.j);
                                        ulVar.n();
                                        break;
                                    } else {
                                        ulVar.t(i2, oi.d);
                                        t(miVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == oi.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != oi.d) {
                                        if (objQ != oi.f) {
                                            sm0.g(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    t(miVar);
                                    return;
                                }
                                if (ulVar.p(i2, objQ, oi.e)) {
                                    t(miVar);
                                    return;
                                }
                            }
                        }
                        t(miVar);
                    }
                }
            }
            this = miVar;
        }
    }

    public final ul l(long j, ul ulVar, long j2) {
        Object objA;
        Unsafe unsafe;
        ul ulVar2 = oi.a;
        ni niVar = ni.a;
        loop0: while (true) {
            objA = tq.a(ulVar, j, niVar);
            if (!gu2.x(objA)) {
                zn1 zn1VarV = gu2.v(objA);
                while (true) {
                    v.getClass();
                    Unsafe unsafe2 = fe3.a;
                    long j3 = Y;
                    zn1 zn1Var = (zn1) unsafe2.getObjectVolatile(this, j3);
                    if (zn1Var.e >= zn1VarV.e) {
                        break loop0;
                    }
                    if (!zn1VarV.o()) {
                        break;
                    }
                    do {
                        unsafe = fe3.a;
                        if (unsafe.compareAndSwapObject(this, Y, zn1Var, zn1VarV)) {
                            if (!zn1Var.k()) {
                                break loop0;
                            }
                            zn1Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == zn1Var);
                    if (zn1VarV.k()) {
                        zn1VarV.i();
                    }
                }
            } else {
                break;
            }
        }
        if (gu2.x(objA)) {
            i();
            y(j, ulVar);
            t(this);
            return null;
        }
        ul ulVar3 = (ul) gu2.v(objA);
        long j4 = ulVar3.e;
        if (j4 <= j) {
            return ulVar3;
        }
        long j5 = oi.b;
        if (!d.compareAndSet(this, j2 + 1, j4 * j5)) {
            t(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(this, (j4 * j5) - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final ul m(long j, ul ulVar) {
        Object objA;
        ul ulVar2;
        long j2;
        Unsafe unsafe;
        ul ulVar3 = oi.a;
        ni niVar = ni.a;
        loop0: while (true) {
            objA = tq.a(ulVar, j, niVar);
            if (!gu2.x(objA)) {
                zn1 zn1VarV = gu2.v(objA);
                while (true) {
                    i.getClass();
                    Unsafe unsafe2 = fe3.a;
                    long j3 = a0;
                    zn1 zn1Var = (zn1) unsafe2.getObjectVolatile(this, j3);
                    if (zn1Var.e >= zn1VarV.e) {
                        break loop0;
                    }
                    if (!zn1VarV.o()) {
                        break;
                    }
                    do {
                        unsafe = fe3.a;
                        if (unsafe.compareAndSwapObject(this, a0, zn1Var, zn1VarV)) {
                            if (!zn1Var.k()) {
                                break loop0;
                            }
                            zn1Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == zn1Var);
                    if (zn1VarV.k()) {
                        zn1VarV.i();
                    }
                }
            } else {
                break;
            }
        }
        if (gu2.x(objA)) {
            i();
            if (ulVar.e * ((long) oi.b) < r()) {
                ulVar.b();
                return null;
            }
        } else {
            ul ulVar4 = (ul) gu2.v(objA);
            long j4 = ulVar4.e;
            if (x() || j > d.get(this) / ((long) oi.b)) {
                ulVar2 = ulVar4;
                break;
            }
            loop3: while (true) {
                v.getClass();
                Unsafe unsafe3 = fe3.a;
                long j5 = Y;
                zn1 zn1Var2 = (zn1) unsafe3.getObjectVolatile(this, j5);
                if (zn1Var2.e >= j4 || !ulVar4.o()) {
                    ulVar2 = ulVar4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = fe3.a;
                    ulVar2 = ulVar4;
                    if (unsafe4.compareAndSwapObject(this, Y, zn1Var2, ulVar4)) {
                        if (!zn1Var2.k()) {
                            break loop3;
                        }
                        zn1Var2.i();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != zn1Var2) {
                        break;
                    }
                    ulVar4 = ulVar2;
                }
                if (ulVar2.k()) {
                    ulVar2.i();
                }
                ulVar4 = ulVar2;
            }
            if (j4 <= j) {
                return ulVar2;
            }
            long j6 = j4 * ((long) oi.b);
            do {
                j2 = c.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!c.compareAndSet(this, j2, j6));
            if (j4 * ((long) oi.b) < r()) {
                ulVar2.b();
            }
        }
        return null;
    }

    public final ul n(long j, ul ulVar) {
        Object objA;
        long j2;
        long j3;
        Unsafe unsafe;
        ul ulVar2 = oi.a;
        ni niVar = ni.a;
        loop0: while (true) {
            objA = tq.a(ulVar, j, niVar);
            if (!gu2.x(objA)) {
                zn1 zn1VarV = gu2.v(objA);
                while (true) {
                    f.getClass();
                    Unsafe unsafe2 = fe3.a;
                    long j4 = b0;
                    zn1 zn1Var = (zn1) unsafe2.getObjectVolatile(this, j4);
                    if (zn1Var.e >= zn1VarV.e) {
                        break loop0;
                    }
                    if (!zn1VarV.o()) {
                        break;
                    }
                    do {
                        unsafe = fe3.a;
                        if (unsafe.compareAndSwapObject(this, b0, zn1Var, zn1VarV)) {
                            if (!zn1Var.k()) {
                                break loop0;
                            }
                            zn1Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == zn1Var);
                    if (zn1VarV.k()) {
                        zn1VarV.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zX = gu2.x(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zX) {
            i();
            if (ulVar.e * ((long) oi.b) < atomicLongFieldUpdater.get(this)) {
                ulVar.b();
                return null;
            }
        } else {
            ul ulVar3 = (ul) gu2.v(objA);
            long j5 = ulVar3.e;
            if (j5 <= j) {
                return ulVar3;
            }
            long j6 = j5 * ((long) oi.b);
            do {
                j2 = b.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!b.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) oi.b) < atomicLongFieldUpdater.get(this)) {
                ulVar3.b();
            }
        }
        return null;
    }

    public final Throwable o() {
        w.getClass();
        return (Throwable) fe3.a.getObjectVolatile(this, X);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new mn("Channel was closed") : thO;
    }

    public final Throwable q() {
        Throwable thO = o();
        return thO == null ? new nn("Channel was closed") : thO;
    }

    public final long r() {
        return b.get(this) & 1152921504606846975L;
    }

    public final boolean s() {
        while (true) {
            i.getClass();
            Unsafe unsafe = fe3.a;
            long j = a0;
            ul ulVarM = (ul) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (r() <= j2) {
                return false;
            }
            long j3 = oi.b;
            long j4 = j2 / j3;
            if (ulVarM.e == j4 || (ulVarM = m(j4, ulVarM)) != null) {
                ulVarM.b();
                int i2 = (int) (j2 % j3);
                while (true) {
                    Object objQ = ulVarM.q(i2);
                    if (objQ != null && objQ != oi.e) {
                        if (objQ != oi.d) {
                            if (objQ != oi.j && objQ != oi.l && objQ != oi.i && objQ != oi.h) {
                                if (objQ != oi.g) {
                                    if (objQ == oi.f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (ulVarM.p(i2, objQ, oi.h)) {
                        k();
                        break;
                    }
                }
                c.compareAndSet(this, j2, j2 + 1);
            } else if (((ul) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i2;
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (b.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        i.getClass();
        Unsafe unsafe = fe3.a;
        int i4 = 0;
        f.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, b0);
        int i5 = 1;
        v.getClass();
        List listD = jo.d(unsafe.getObjectVolatile(this, a0), objectVolatile, unsafe.getObjectVolatile(this, Y));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((ul) obj) != oi.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            uq1.a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ul) next).e;
            do {
                Object next2 = it.next();
                long j2 = ((ul) next2).e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ul ulVar = (ul) next;
        long j3 = c.get(this);
        long jR = r();
        loop2: while (true) {
            int i6 = oi.b;
            int i7 = i4;
            while (i7 < i6) {
                i2 = i5;
                long j4 = (ulVar.e * ((long) oi.b)) + ((long) i7);
                if (j4 >= jR && j4 >= j3) {
                    break loop2;
                }
                Object objQ = ulVar.q(i7);
                Object obj2 = ulVar.h.get(i7 * 2);
                if (objQ instanceof nk) {
                    string = (j4 >= j3 || j4 < jR) ? (j4 >= jR || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objQ instanceof t72) {
                    string = "EB(" + objQ + ')';
                } else if (Intrinsics.areEqual(objQ, oi.f) || Intrinsics.areEqual(objQ, oi.g)) {
                    string = "resuming_sender";
                } else {
                    if (objQ != null && !Intrinsics.areEqual(objQ, oi.e) && !Intrinsics.areEqual(objQ, oi.i) && !Intrinsics.areEqual(objQ, oi.h) && !Intrinsics.areEqual(objQ, oi.k) && !Intrinsics.areEqual(objQ, oi.j) && !Intrinsics.areEqual(objQ, oi.l)) {
                        string = objQ.toString();
                    }
                    i7++;
                    i5 = i2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i7++;
                i5 = i2;
            }
            i2 = i5;
            ulVar = (ul) ulVar.d();
            if (ulVar == null) {
                break;
            }
            i5 = i2;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - i2) == ',') {
            sb.deleteCharAt(sb.length() - i2).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u() {
        Object objectVolatile;
        mi miVar;
        loop0: while (true) {
            W.getClass();
            Unsafe unsafe = fe3.a;
            long j = Z;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            vy2 vy2Var = objectVolatile == null ? oi.q : oi.r;
            while (true) {
                Unsafe unsafe2 = fe3.a;
                miVar = this;
                if (unsafe2.compareAndSwapObject(miVar, Z, objectVolatile, vy2Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(miVar, j) != objectVolatile) {
                    break;
                } else {
                    this = miVar;
                }
            }
            this = miVar;
        }
        if (objectVolatile == null) {
            return;
        }
        ((Function1) objectVolatile).invoke(miVar.o());
    }

    public final boolean v(long j, boolean z) {
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                h(j & 1152921504606846975L);
                if (!z || !s()) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(ck1.r(i2, "unexpected close status: ").toString());
                }
                ul ulVarH = h(j & 1152921504606846975L);
                Object objT = null;
                loop0: do {
                    for (int i3 = oi.b - 1; -1 < i3; i3--) {
                        long j2 = (ulVarH.e * ((long) oi.b)) + ((long) i3);
                        while (true) {
                            Object objQ = ulVarH.q(i3);
                            if (objQ == oi.i) {
                                break loop0;
                            }
                            vy2 vy2Var = oi.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
                            if (objQ != vy2Var) {
                                if (objQ != oi.e && objQ != null) {
                                    if (!(objQ instanceof s72) && !(objQ instanceof t72)) {
                                        vy2 vy2Var2 = oi.g;
                                        if (objQ == vy2Var2 || objQ == oi.f) {
                                            break loop0;
                                        }
                                        if (objQ != vy2Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        s72 s72Var = objQ instanceof t72 ? ((t72) objQ).a : (s72) objQ;
                                        if (ulVarH.p(i3, objQ, oi.l)) {
                                            objT = xi0.t(objT, s72Var);
                                            ulVarH.s(i3, null);
                                            ulVarH.n();
                                            break;
                                        }
                                    }
                                } else {
                                    if (ulVarH.p(i3, objQ, oi.l)) {
                                        ulVarH.n();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (ulVarH.p(i3, objQ, oi.l)) {
                                    ulVarH.s(i3, null);
                                    ulVarH.n();
                                    break;
                                }
                            }
                        }
                    }
                    ulVarH = (ul) ulVarH.f();
                } while (ulVarH != null);
                if (objT != null) {
                    if (objT instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objT;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            B((s72) arrayList.get(size), false);
                        }
                    } else {
                        B((s72) objT, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j = d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void y(long j, ul ulVar) {
        mi miVar;
        ul ulVar2;
        ul ulVar3;
        while (ulVar.e < j && (ulVar3 = (ul) ulVar.d()) != null) {
            ulVar = ulVar3;
        }
        while (true) {
            ul ulVar4 = ulVar;
            while (ulVar4.g() && (ulVar2 = (ul) ulVar4.d()) != null) {
                ulVar4 = ulVar2;
            }
            while (true) {
                v.getClass();
                Unsafe unsafe = fe3.a;
                long j2 = Y;
                zn1 zn1Var = (zn1) unsafe.getObjectVolatile(this, j2);
                if (zn1Var.e >= ulVar4.e) {
                    return;
                }
                if (!ulVar4.o()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = fe3.a;
                    miVar = this;
                    if (unsafe2.compareAndSwapObject(miVar, Y, zn1Var, ulVar4)) {
                        if (zn1Var.k()) {
                            zn1Var.i();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(miVar, j2) != zn1Var) {
                        break;
                    } else {
                        this = miVar;
                    }
                }
                if (ulVar4.k()) {
                    ulVar4.i();
                }
                this = miVar;
            }
            ulVar = ulVar4;
        }
    }

    public final Object z(fs fsVar, Object obj) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        Throwable thQ = q();
        pj1 pj1Var = rj1.b;
        pkVar.resumeWith(new qj1(thQ));
        Object objS = pkVar.s();
        return objS == ft.a ? objS : Unit.a;
    }
}
