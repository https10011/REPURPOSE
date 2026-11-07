package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g02 extends nr0 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ h02 d;
    public final Object e;

    public g02(h02 h02Var, Callable callable) {
        this.d = h02Var;
        callable.getClass();
        this.e = callable;
    }

    @Override // defpackage.nr0
    public final void a(Throwable th) {
        int i = this.c;
        h02 h02Var = this.d;
        switch (i) {
            case 0:
                h02Var.m(th);
                break;
            default:
                h02Var.m(th);
                break;
        }
    }

    @Override // defpackage.nr0
    public final void b(Object obj) {
        int i = this.c;
        h02 h02Var = this.d;
        switch (i) {
            case 0:
                h02Var.n((ListenableFuture) obj);
                break;
            default:
                h02Var.l(obj);
                break;
        }
    }

    @Override // defpackage.nr0
    public final boolean d() {
        int i = this.c;
        h02 h02Var = this.d;
        switch (i) {
            case 0:
                break;
        }
        return h02Var.isDone();
    }

    @Override // defpackage.nr0
    public final Object e() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                ac acVar = (ac) obj;
                ListenableFuture listenableFutureCall = acVar.call();
                yv2.k(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", acVar);
                return listenableFutureCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.nr0
    public final String f() {
        switch (this.c) {
            case 0:
                return ((ac) this.e).toString();
            default:
                return ((Callable) this.e).toString();
        }
    }

    public g02(h02 h02Var, ac acVar) {
        this.d = h02Var;
        this.e = acVar;
    }
}
