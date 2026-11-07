package defpackage;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class d12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        try {
            return UUID.fromString(strM);
        } catch (IllegalArgumentException e) {
            StringBuilder sbN = ts.n("Failed parsing '", strM, "' as UUID; at path ");
            sbN.append(au0Var.n(true));
            throw new wt0(4, sbN.toString(), e);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        eu0Var.B(uuid == null ? null : uuid.toString());
    }
}
