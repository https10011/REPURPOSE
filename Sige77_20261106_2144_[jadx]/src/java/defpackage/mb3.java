package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mb3 extends fu2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lc3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb3(lc3 lc3Var, y53 y53Var, int i) {
        super(y53Var);
        this.e = i;
        this.f = lc3Var;
    }

    @Override // defpackage.fu2
    public final void a() {
        int i = this.e;
        lc3 lc3Var = this.f;
        switch (i) {
            case 0:
                lc3Var.D();
                if (lc3Var.V()) {
                    c33 c33Var = ((y53) lc3Var.a).f;
                    y53.l(c33Var);
                    c33Var.a0.a("Inactivity, disconnecting from the service");
                    lc3Var.M();
                    break;
                }
                break;
            default:
                c33 c33Var2 = ((y53) lc3Var.a).f;
                y53.l(c33Var2);
                c33Var2.w.a("Tasks have been queued for a long time");
                break;
        }
    }
}
