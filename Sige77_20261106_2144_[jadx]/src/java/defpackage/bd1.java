package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bd1 extends e0 implements nl, jo1 {
    public final mi f;

    public bd1(CoroutineContext coroutineContext, mi miVar) {
        super(coroutineContext, true);
        this.f = miVar;
    }

    @Override // defpackage.e0
    public final void V(Throwable th, boolean z) {
        if (this.f.g(th, false) || z) {
            return;
        }
        ia.h(th, this.e);
    }

    @Override // defpackage.e0
    public final void W(Object obj) {
        this.f.g(null, false);
    }

    @Override // defpackage.jo1
    public final Object a(fs fsVar, Object obj) {
        return this.f.a(fsVar, obj);
    }

    @Override // defpackage.lt0, defpackage.ws0, defpackage.nl
    public final void cancel(CancellationException cancellationException) {
        Object objX = x();
        if (objX instanceof vp) {
            return;
        }
        if ((objX instanceof et0) && ((et0) objX).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new xs0(m(), null, this);
        }
        k(cancellationException);
    }

    @Override // defpackage.jo1
    public final Object e(Object obj) {
        throw null;
    }

    @Override // defpackage.lt0
    public final void k(CancellationException cancellationException) {
        CancellationException cancellationExceptionQ = lt0.Q(this, cancellationException);
        this.f.g(cancellationExceptionQ, true);
        j(cancellationExceptionQ);
    }
}
