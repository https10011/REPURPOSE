package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m53 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ t53 b;

    public m53(t53 t53Var, String str) {
        this.b = t53Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        c33 c33Var = ((y53) this.b.a).f;
        y53.l(c33Var);
        c33Var.f.b(th, this.a);
    }
}
