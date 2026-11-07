package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class m12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        try {
            int iX = au0Var.x();
            if (iX <= 65535 && iX >= -32768) {
                return Short.valueOf((short) iX);
            }
            StringBuilder sbU = ck1.u(iX, "Lossy conversion from ", " to short; at path ");
            sbU.append(au0Var.n(true));
            throw new wt0(sbU.toString(), 4);
        } catch (NumberFormatException e) {
            throw new wt0(4, e);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            eu0Var.p();
        } else {
            eu0Var.x(number.shortValue());
        }
    }
}
