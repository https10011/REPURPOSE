package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s71 extends l02 {
    public static final r71 b = new r71(new s71(2), 0);
    public final int a;

    public s71(int i) {
        this.a = i;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        int iR = au0Var.R();
        int iV = ts.v(iR);
        if (iV == 5 || iV == 6) {
            return ck1.d(this.a, au0Var);
        }
        if (iV == 8) {
            au0Var.D();
            return null;
        }
        throw new wt0("Expecting number, got: " + y00.p(iR) + "; at path " + au0Var.n(false), 4);
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        eu0Var.A((Number) obj);
    }
}
