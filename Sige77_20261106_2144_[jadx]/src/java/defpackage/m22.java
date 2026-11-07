package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m22 extends em1 {
    public final ThreadLocal i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public m22(fs fsVar, CoroutineContext coroutineContext) {
        n22 n22Var = n22.a;
        super(fsVar, coroutineContext.get(n22Var) == null ? coroutineContext.plus(n22Var) : coroutineContext);
        this.i = new ThreadLocal();
        if (fsVar.getContext().get(d.M) instanceof ys) {
            return;
        }
        Object objC = ix1.c(coroutineContext, null);
        ix1.a(coroutineContext, objC);
        Z(coroutineContext, objC);
    }

    public final boolean Y() {
        boolean z = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return !z;
    }

    public final void Z(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new Pair(coroutineContext, obj));
    }

    @Override // defpackage.em1, defpackage.lt0
    public final void h(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.i.get();
            if (pair != null) {
                ix1.a((CoroutineContext) pair.a, pair.b);
            }
            this.i.remove();
        }
        Object objT = r93.T(obj);
        fs fsVar = this.f;
        CoroutineContext context = fsVar.getContext();
        Object objC = ix1.c(context, null);
        m22 m22VarC = objC != ix1.a ? vs.c(fsVar, context, objC) : null;
        try {
            this.f.resumeWith(objT);
            Unit unit = Unit.a;
        } finally {
            if (m22VarC == null || m22VarC.Y()) {
                ix1.a(context, objC);
            }
        }
    }
}
