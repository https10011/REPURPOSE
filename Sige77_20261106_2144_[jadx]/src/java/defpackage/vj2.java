package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vj2 extends lo2 {
    public final Level b;
    public final Set c;
    public final ud2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj2(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = wj2.f;
        this.b = level;
        this.c = wj2.f;
        this.d = wj2.i;
    }

    @Override // defpackage.lo2
    public final boolean w(Level level) {
        return true;
    }

    @Override // defpackage.lo2
    public final void y(qp3 qp3Var) {
        String strA = (String) qp3Var.c().Q(dr3.a);
        if (strA == null) {
            strA = (String) this.a;
        }
        if (strA == null) {
            iq3 iq3Var = qp3Var.d;
            if (iq3Var == null) {
                uq1.q("cannot request log site information prior to postProcess()");
                return;
            }
            strA = iq3Var.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        wj2.F(qp3Var, jw.D(strA), this.b, this.c, this.d);
    }
}
