package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sz1 extends rz1 {
    public final /* synthetic */ mb a;
    public final /* synthetic */ tz1 b;

    public sz1(tz1 tz1Var, mb mbVar) {
        this.b = tz1Var;
        this.a = mbVar;
    }

    @Override // defpackage.nz1
    public final void d(pz1 pz1Var) {
        ((ArrayList) this.a.get(this.b.b)).remove(pz1Var);
        pz1Var.B(this);
    }
}
