package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n51 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ vd0 b;

    public n51(Executor executor, vd0 vd0Var) {
        this.a = executor;
        this.b = vd0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.m(e);
        }
    }
}
