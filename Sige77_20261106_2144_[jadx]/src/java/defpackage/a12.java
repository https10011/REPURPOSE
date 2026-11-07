package defpackage;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class a12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        if (strM.equals("null")) {
            return null;
        }
        return new URL(strM);
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        URL url = (URL) obj;
        eu0Var.B(url == null ? null : url.toExternalForm());
    }
}
