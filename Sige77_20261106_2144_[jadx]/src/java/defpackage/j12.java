package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class j12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        int iR = au0Var.R();
        if (iR != 9) {
            return iR == 6 ? Boolean.valueOf(Boolean.parseBoolean(au0Var.M())) : Boolean.valueOf(au0Var.t());
        }
        au0Var.D();
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            eu0Var.p();
            return;
        }
        eu0Var.D();
        eu0Var.a();
        eu0Var.a.write(bool.booleanValue() ? "true" : "false");
    }
}
