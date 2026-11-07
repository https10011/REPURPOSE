package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jl0 extends ys implements h00 {
    public final Handler c;
    public final boolean d;
    public final jl0 e;

    public jl0(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
        this.e = z ? this : new jl0(handler, true);
    }

    @Override // defpackage.h00
    public final void a(long j, pk pkVar) {
        bh0 bh0Var = new bh0(9, pkVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(bh0Var, j)) {
            pkVar.w(new fu(2, this, bh0Var));
        } else {
            l(pkVar.e, bh0Var);
        }
    }

    @Override // defpackage.h00
    public final n20 b(long j, final xx1 xx1Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(xx1Var, j)) {
            return new n20() { // from class: il0
                @Override // defpackage.n20
                public final void a() {
                    this.a.c.removeCallbacks(xx1Var);
                }
            };
        }
        l(coroutineContext, xx1Var);
        return g71.a;
    }

    @Override // defpackage.ys
    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        l(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jl0)) {
            return false;
        }
        jl0 jl0Var = (jl0) obj;
        return jl0Var.c == this.c && jl0Var.d == this.d;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.ys
    public final boolean i(CoroutineContext coroutineContext) {
        return (this.d && Intrinsics.areEqual(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final void l(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ws0 ws0Var = (ws0) coroutineContext.get(k42.c);
        if (ws0Var != null) {
            ws0Var.cancel(cancellationException);
        }
        sz szVar = i20.a;
        fz.c.e(coroutineContext, runnable);
    }

    @Override // defpackage.ys
    public final String toString() {
        jl0 jl0Var;
        String str;
        sz szVar = i20.a;
        jl0 jl0Var2 = e11.a;
        if (this == jl0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                jl0Var = jl0Var2.e;
            } catch (UnsupportedOperationException unused) {
                jl0Var = null;
            }
            str = this == jl0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.c.toString();
        return this.d ? y00.k(string, ".immediate") : string;
    }
}
