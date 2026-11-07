package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class je2 extends lo2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je2(qp0 qp0Var, int i) {
        super(qp0Var);
        this.b = i;
    }

    public abstract de2 F();

    @Override // defpackage.lo2
    public final de2 p() {
        de2 de2VarB;
        switch (this.b) {
            case 0:
                qp0 qp0Var = (qp0) this.a;
                try {
                    ((ec1) qp0Var.d).a();
                    if (((ec1) qp0Var.d).b()) {
                        de2VarB = !(((jf2) ((ec1) qp0Var.d).b) == jf2.f) ? ck1.b(2, ((pv2) qp0Var.c).b("FM_init_msg")) : F();
                    } else {
                        de2VarB = ck1.a(6);
                    }
                    return de2VarB;
                } catch (Exception e) {
                    return ck1.b(3, e.getMessage());
                }
            default:
                try {
                    return F();
                } catch (Exception e2) {
                    return ck1.b(3, e2.getMessage());
                }
        }
    }
}
