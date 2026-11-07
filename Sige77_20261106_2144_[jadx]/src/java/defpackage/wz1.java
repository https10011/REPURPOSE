package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wz1 extends rz1 {
    public final /* synthetic */ int a = 1;
    public pz1 b;

    public wz1(pz1 pz1Var) {
        this.b = pz1Var;
    }

    @Override // defpackage.rz1, defpackage.nz1
    public void a(pz1 pz1Var) {
        switch (this.a) {
            case 1:
                hd hdVar = (hd) this.b;
                if (!hdVar.q0) {
                    hdVar.K();
                    hdVar.q0 = true;
                }
                break;
        }
    }

    @Override // defpackage.nz1
    public final void d(pz1 pz1Var) {
        switch (this.a) {
            case 0:
                this.b.D();
                pz1Var.B(this);
                break;
            default:
                hd hdVar = (hd) this.b;
                int i = hdVar.p0 - 1;
                hdVar.p0 = i;
                if (i == 0) {
                    hdVar.q0 = false;
                    hdVar.o();
                }
                pz1Var.B(this);
                break;
        }
    }

    public /* synthetic */ wz1() {
    }
}
