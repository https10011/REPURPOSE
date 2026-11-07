package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ z7(k8 k8Var, int i) {
        this.a = i;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.a;
        k8 k8Var = this.b;
        switch (i) {
            case 0:
                if ((k8Var.M0 & 1) != 0) {
                    k8Var.w(0);
                }
                if ((k8Var.M0 & 4096) != 0) {
                    k8Var.w(108);
                }
                k8Var.L0 = false;
                k8Var.M0 = 0;
                break;
            default:
                k8Var.j0.showAtLocation(k8Var.i0, 55, 0, 0);
                y62 y62Var = k8Var.l0;
                if (y62Var != null) {
                    y62Var.b();
                }
                if (k8Var.m0 && (viewGroup = k8Var.n0) != null && viewGroup.isLaidOut()) {
                    k8Var.i0.setAlpha(0.0f);
                    y62 y62VarA = x52.a(k8Var.i0);
                    y62VarA.a(1.0f);
                    k8Var.l0 = y62VarA;
                    y62VarA.d(new a8(this, 0));
                } else {
                    k8Var.i0.setAlpha(1.0f);
                    k8Var.i0.setVisibility(0);
                }
                break;
        }
    }
}
