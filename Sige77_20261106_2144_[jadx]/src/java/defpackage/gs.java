package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gs extends ze {
    private final CoroutineContext _context;
    private transient fs<Object> intercepted;

    public gs(fs fsVar) {
        this(fsVar, fsVar != null ? fsVar.getContext() : null);
    }

    @Override // defpackage.fs
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final fs<Object> intercepted() {
        fs<Object> fsVar = this.intercepted;
        if (fsVar != null) {
            return fsVar;
        }
        d dVar = getContext().get(d.M);
        fs<Object> f20Var = dVar != null ? new f20((ys) dVar, this) : this;
        this.intercepted = f20Var;
        return f20Var;
    }

    @Override // defpackage.ze
    public void releaseIntercepted() {
        fs<Object> fsVar = this.intercepted;
        if (fsVar != null && fsVar != this) {
            getContext().get(d.M).getClass();
            f20 f20Var = (f20) fsVar;
            f20Var.k();
            pk pkVarM = f20Var.m();
            if (pkVarM != null) {
                pkVarM.o();
            }
        }
        this.intercepted = up.a;
    }

    public gs(fs fsVar, CoroutineContext coroutineContext) {
        super(fsVar);
        this._context = coroutineContext;
    }
}
