package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ec3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc3 b;

    public /* synthetic */ ec3(lc3 lc3Var, int i) {
        this.a = i;
        this.b = lc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lc3 lc3Var = this.b;
        switch (i) {
            case 0:
                lc3Var.K();
                break;
            case 1:
                y53 y53Var = (y53) lc3Var.a;
                n13 n13Var = lc3Var.d;
                if (n13Var == null) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.f.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        n13Var.C(lc3Var.U(false));
                        lc3Var.R();
                    } catch (RemoteException e) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.f.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                y53 y53Var2 = (y53) lc3Var.a;
                n13 n13Var2 = lc3Var.d;
                if (n13Var2 == null) {
                    c33 c33Var3 = y53Var2.f;
                    y53.l(c33Var3);
                    c33Var3.f.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        n13Var2.v(lc3Var.U(false));
                        lc3Var.R();
                    } catch (RemoteException e2) {
                        c33 c33Var4 = y53Var2.f;
                        y53.l(c33Var4);
                        c33Var4.f.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
