package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class e0 extends lt0 implements fs, et {
    public final CoroutineContext e;

    public e0(CoroutineContext coroutineContext, boolean z) {
        super(z);
        A((ws0) coroutineContext.get(k42.c));
        this.e = coroutineContext.plus(this);
    }

    @Override // defpackage.lt0
    public final void I(Object obj) {
        if (!(obj instanceof vp)) {
            W(obj);
        } else {
            vp vpVar = (vp) obj;
            V(vpVar.a, vp.b.get(vpVar) != 0);
        }
    }

    public final void X(ht htVar, e0 e0Var, Function2 function2) {
        int iOrdinal = htVar.ordinal();
        if (iOrdinal == 0) {
            bj0.t(function2, e0Var, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                function2.getClass();
                fs fsVarB = sr0.b(sr0.a(e0Var, this, function2));
                Unit unit = Unit.a;
                pj1 pj1Var = rj1.b;
                fsVarB.resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                throw new e71();
            }
            try {
                CoroutineContext coroutineContext = this.e;
                Object objC = ix1.c(coroutineContext, null);
                try {
                    Object objC2 = !(function2 instanceof ze) ? sr0.c(function2, e0Var, this) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(e0Var, this);
                    ix1.a(coroutineContext, objC);
                    if (objC2 != ft.a) {
                        pj1 pj1Var2 = rj1.b;
                        resumeWith(objC2);
                    }
                } catch (Throwable th) {
                    ix1.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                pj1 pj1Var3 = rj1.b;
                resumeWith(new qj1(th2));
            }
        }
    }

    @Override // defpackage.et
    public final CoroutineContext b() {
        return this.e;
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.lt0
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        Throwable thA = rj1.a(obj);
        if (thA != null) {
            obj = new vp(thA, false);
        }
        Object objE = E(obj);
        if (objE == yv2.b) {
            return;
        }
        h(objE);
    }

    @Override // defpackage.lt0
    public final void z(xp xpVar) {
        ia.h(xpVar, this.e);
    }

    public void W(Object obj) {
    }

    public void V(Throwable th, boolean z) {
    }
}
