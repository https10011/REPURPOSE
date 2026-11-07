package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ll0 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public ll0(Looper looper) {
        this.a = 0;
        this.b = new th2(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((th2) obj).post(runnable);
                break;
            case 1:
                ((Executor) obj).execute(new g4(runnable, 1));
                break;
            default:
                t53 t53Var = ((y53) ((w93) obj).a).i;
                y53.l(t53Var);
                t53Var.N(runnable);
                break;
        }
    }

    public /* synthetic */ ll0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
