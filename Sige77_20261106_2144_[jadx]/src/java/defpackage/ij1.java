package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ij1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu b;
    public final /* synthetic */ di0 c;

    public /* synthetic */ ij1(cu cuVar, di0 di0Var, int i) {
        this.a = i;
        this.b = cuVar;
        this.c = di0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object zh0Var = this.c;
        cu cuVar = this.b;
        switch (i) {
            case 0:
                ((gg) cuVar).a(zh0Var);
                break;
            default:
                if (zh0Var == null) {
                    zh0Var = new zh0("No provider data returned", 4);
                }
                ((gg) cuVar).a(zh0Var);
                break;
        }
    }
}
