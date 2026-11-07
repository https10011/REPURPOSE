package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class iy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ iy1(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                ky1 ky1Var = toolbar.C0;
                o31 o31Var = ky1Var == null ? null : ky1Var.b;
                if (o31Var != null) {
                    o31Var.collapseActionView();
                }
                break;
            default:
                toolbar.n();
                break;
        }
    }
}
