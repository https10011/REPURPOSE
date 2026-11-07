package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class s02 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        if (strM.length() == 1) {
            return Character.valueOf(strM.charAt(0));
        }
        StringBuilder sbN = ts.n("Expecting character, got: ", strM, "; at ");
        sbN.append(au0Var.n(true));
        throw new wt0(sbN.toString(), 4);
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        Character ch = (Character) obj;
        eu0Var.B(ch == null ? null : String.valueOf(ch));
    }
}
