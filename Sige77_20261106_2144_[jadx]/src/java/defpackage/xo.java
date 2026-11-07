package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xo extends nr0 {
    public final Executor c;
    public final /* synthetic */ yo d;
    public final /* synthetic */ int e;
    public final /* synthetic */ yo f;
    public final Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(yo yoVar, Callable callable) {
        this(yoVar, t10.a);
        this.e = 1;
        this.f = yoVar;
        this.i = callable;
    }

    @Override // defpackage.nr0
    public final void a(Throwable th) {
        yo yoVar = this.d;
        yoVar.a0 = null;
        if (th instanceof ExecutionException) {
            yoVar.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            yoVar.cancel(false);
        } else {
            yoVar.m(th);
        }
    }

    @Override // defpackage.nr0
    public final void b(Object obj) {
        this.d.a0 = null;
        int i = this.e;
        yo yoVar = this.f;
        switch (i) {
            case 0:
                yoVar.n((ListenableFuture) obj);
                break;
            default:
                yoVar.l(obj);
                break;
        }
    }

    @Override // defpackage.nr0
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.nr0
    public final Object e() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((rd2) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.nr0
    public final String f() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((rd2) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(yo yoVar, rd2 rd2Var, Executor executor) {
        this(yoVar, executor);
        this.e = 0;
        this.f = yoVar;
        this.i = rd2Var;
    }

    public xo(yo yoVar, Executor executor) {
        this.d = yoVar;
        executor.getClass();
        this.c = executor;
    }
}
