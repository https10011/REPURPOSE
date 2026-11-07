package defpackage;

import com.fm.openinstall.listener.ResultCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ke2 extends je2 {
    public final ag2 c;
    public final ResultCallback d;

    public ke2(qp0 qp0Var, ag2 ag2Var, ResultCallback resultCallback) {
        super(qp0Var, 0);
        this.c = ag2Var;
        this.d = resultCallback;
    }

    @Override // defpackage.je2
    public final de2 F() {
        HashMap map = new HashMap();
        ag2 ag2Var = this.c;
        map.put("sU", ag2Var.a);
        map.put("sP", ag2Var.b);
        qp0 qp0Var = (qp0) this.a;
        ud2 ud2Var = (ud2) qp0Var.b;
        ce2 ce2VarB = ud2Var.b("/share/report", ud2Var.i(map), false);
        if (!(ce2VarB instanceof vd2)) {
            ud2 ud2Var2 = (ud2) qp0Var.b;
            ce2VarB = ud2Var2.b("/share/report", ud2Var2.i(map), false);
        }
        h(ce2VarB);
        return de2.a(ce2VarB);
    }

    @Override // defpackage.lo2
    public final void i(de2 de2Var) {
        ResultCallback resultCallback = this.d;
        if (resultCallback != null) {
            resultCallback.onResult(null, de2Var.b);
        }
    }
}
