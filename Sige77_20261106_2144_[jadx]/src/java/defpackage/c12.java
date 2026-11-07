package defpackage;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class c12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() != 9) {
            return InetAddress.getByName(au0Var.M());
        }
        au0Var.D();
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        eu0Var.B(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
