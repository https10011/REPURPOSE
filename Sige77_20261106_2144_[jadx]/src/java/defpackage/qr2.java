package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface qr2 {
    static qt2 b(qr2 qr2Var, vt2 vt2Var, ep1 ep1Var, ArrayList arrayList) {
        String str = vt2Var.a;
        if (qr2Var.e(str)) {
            qt2 qt2VarD = qr2Var.d(str);
            if (qt2VarD instanceof dq2) {
                return ((dq2) qt2VarD).g(ep1Var, arrayList);
            }
            e.g(y00.k(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            gu2.W("hasOwnProperty", arrayList, 1);
            return qr2Var.e(((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc()) ? qt2.T : qt2.U;
        }
        e.g(ts.j("Object has no function ", str));
        return null;
    }

    void a(String str, qt2 qt2Var);

    qt2 d(String str);

    boolean e(String str);
}
