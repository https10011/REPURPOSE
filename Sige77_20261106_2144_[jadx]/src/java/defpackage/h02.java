package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h02 extends vd0 implements RunnableFuture {
    public volatile nr0 w;

    public h02(Callable callable) {
        this.w = new g02(this, callable);
    }

    @Override // defpackage.v0
    public final void c() {
        nr0 nr0Var;
        if (p() && (nr0Var = this.w) != null) {
            nr0Var.c();
        }
        this.w = null;
    }

    @Override // defpackage.v0
    public final String j() {
        nr0 nr0Var = this.w;
        if (nr0Var == null) {
            return super.j();
        }
        String strValueOf = String.valueOf(nr0Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        nr0 nr0Var = this.w;
        if (nr0Var != null) {
            nr0Var.run();
        }
        this.w = null;
    }
}
