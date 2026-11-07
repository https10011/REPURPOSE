package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class b12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        try {
            String strM = au0Var.M();
            if (strM.equals("null")) {
                return null;
            }
            return new URI(strM);
        } catch (URISyntaxException e) {
            throw new wt0(4, e);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        URI uri = (URI) obj;
        eu0Var.B(uri == null ? null : uri.toASCIIString());
    }
}
