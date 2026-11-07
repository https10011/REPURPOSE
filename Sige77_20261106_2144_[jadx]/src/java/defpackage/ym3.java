package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ym3 extends dq2 {
    public final xw c;
    public final HashMap d;

    public ym3(xw xwVar) {
        super("require");
        this.d = new HashMap();
        this.c = xwVar;
    }

    @Override // defpackage.dq2
    public final qt2 g(ep1 ep1Var, List list) {
        qt2 qt2Var;
        gu2.W("require", list, 1);
        String strZzc = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0)).zzc();
        HashMap map = this.d;
        if (map.containsKey(strZzc)) {
            return (qt2) map.get(strZzc);
        }
        HashMap map2 = this.c.a;
        if (map2.containsKey(strZzc)) {
            try {
                qt2Var = (qt2) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                uq1.q("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
                return null;
            }
        } else {
            qt2Var = qt2.O;
        }
        if (qt2Var instanceof dq2) {
            map.put(strZzc, (dq2) qt2Var);
        }
        return qt2Var;
    }
}
