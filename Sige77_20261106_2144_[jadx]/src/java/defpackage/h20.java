package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h20 extends mw1 {
    public int c;

    public h20(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract fs e();

    public Throwable g(Object obj) {
        vp vpVar = obj instanceof vp ? (vp) obj : null;
        if (vpVar != null) {
            return vpVar.a;
        }
        return null;
    }

    public final void i(Throwable th) {
        ia.h(new jt("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), e().getContext());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fs fsVarE = e();
            fsVarE.getClass();
            f20 f20Var = (f20) fsVarE;
            gs gsVar = f20Var.e;
            Object obj = f20Var.i;
            CoroutineContext context = gsVar.getContext();
            Object objC = ix1.c(context, obj);
            ws0 ws0Var = null;
            m22 m22VarC = objC != ix1.a ? vs.c(gsVar, context, objC) : null;
            try {
                CoroutineContext context2 = gsVar.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                if (thG == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        ws0Var = (ws0) context2.get(k42.c);
                    }
                }
                if (ws0Var != null && !ws0Var.isActive()) {
                    CancellationException cancellationException = ws0Var.getCancellationException();
                    b(cancellationException);
                    pj1 pj1Var = rj1.b;
                    gsVar.resumeWith(zi0.i(cancellationException));
                } else if (thG != null) {
                    pj1 pj1Var2 = rj1.b;
                    gsVar.resumeWith(new qj1(thG));
                } else {
                    pj1 pj1Var3 = rj1.b;
                    gsVar.resumeWith(h(objJ));
                }
                Unit unit = Unit.a;
            } finally {
                if (m22VarC == null || m22VarC.Y()) {
                    ix1.a(context, objC);
                }
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
