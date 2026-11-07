package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jg2 extends fg2 {
    public final /* synthetic */ TaskCompletionSource i;
    public final /* synthetic */ fg2 v;
    public final /* synthetic */ yb2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg2(yb2 yb2Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, fg2 fg2Var) {
        super(taskCompletionSource);
        this.w = yb2Var;
        this.i = taskCompletionSource2;
        this.v = fg2Var;
    }

    @Override // defpackage.fg2
    public final void b() {
        synchronized (this.w.f) {
            try {
                yb2 yb2Var = this.w;
                TaskCompletionSource taskCompletionSource = this.i;
                yb2Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new hd2(8, yb2Var, taskCompletionSource));
                if (this.w.l.getAndIncrement() > 0) {
                    this.w.b.b("Already connected to the service.", new Object[0]);
                }
                yb2.b(this.w, this.v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
