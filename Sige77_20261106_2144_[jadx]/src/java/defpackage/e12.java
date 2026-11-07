package defpackage;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class e12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) {
        String strM = au0Var.M();
        try {
            return Currency.getInstance(strM);
        } catch (IllegalArgumentException e) {
            StringBuilder sbN = ts.n("Failed parsing '", strM, "' as Currency; at path ");
            sbN.append(au0Var.n(true));
            throw new wt0(4, sbN.toString(), e);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        eu0Var.B(((Currency) obj).getCurrencyCode());
    }
}
