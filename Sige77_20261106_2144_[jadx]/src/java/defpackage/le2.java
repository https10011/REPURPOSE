package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class le2 extends je2 {
    public final Uri c;

    public le2(qp0 qp0Var, Uri uri) {
        super(qp0Var, 0);
        this.c = uri;
    }

    @Override // defpackage.je2
    public final de2 F() {
        qp0 qp0Var = (qp0) this.a;
        if (!lf2.c(((lf2) qp0Var.e).a)) {
            if (g93.i) {
                g93.b("wakeupStatsEnabled is disable", new Object[0]);
            }
            return ck1.b(5, "wakeupStatsEnabled is disable");
        }
        HashMap map = new HashMap();
        Uri uri = this.c;
        if (uri != null) {
            map.put("ul", uri.toString());
        }
        ud2 ud2Var = (ud2) qp0Var.b;
        ce2 ce2VarB = ud2Var.b("/stats/wakeup", ud2Var.i(map), false);
        h(ce2VarB);
        return de2.a(ce2VarB);
    }
}
