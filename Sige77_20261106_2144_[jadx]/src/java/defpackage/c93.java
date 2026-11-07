package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p73 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ w93 e;

    public /* synthetic */ c93(w93 w93Var, p73 p73Var, long j, boolean z, int i) {
        this.a = i;
        this.b = p73Var;
        this.c = j;
        this.d = z;
        this.e = w93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        p73 p73Var = this.b;
        w93 w93Var = this.e;
        switch (i) {
            case 0:
                w93Var.e0(p73Var);
                w93Var.U(p73Var, j, z);
                break;
            default:
                w93Var.e0(p73Var);
                w93Var.U(p73Var, j, z);
                break;
        }
    }
}
