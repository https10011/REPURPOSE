package defpackage;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class u02 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        try {
            return ea.t(strM);
        } catch (NumberFormatException e) {
            StringBuilder sbN = ts.n("Failed parsing '", strM, "' as BigDecimal; at path ");
            sbN.append(au0Var.n(true));
            throw new wt0(4, sbN.toString(), e);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        eu0Var.A((BigDecimal) obj);
    }
}
