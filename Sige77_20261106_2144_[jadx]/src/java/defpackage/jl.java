package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jl extends rz1 {
    public boolean a = false;
    public final ViewGroup b;

    public jl(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.rz1, defpackage.nz1
    public final void b() {
        ea.A(this.b, false);
    }

    @Override // defpackage.rz1, defpackage.nz1
    public final void c() {
        ea.A(this.b, true);
    }

    @Override // defpackage.nz1
    public final void d(pz1 pz1Var) {
        if (!this.a) {
            ea.A(this.b, false);
        }
        pz1Var.B(this);
    }

    @Override // defpackage.rz1, defpackage.nz1
    public final void f(pz1 pz1Var) {
        ea.A(this.b, false);
        this.a = true;
    }
}
