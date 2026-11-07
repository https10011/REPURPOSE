package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j93 extends hs2 {
    public final p11 b;

    public j93(p11 p11Var) {
        this.b = p11Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.hs2, defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        p11 p11Var = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    gu2.W("getEventName", arrayList, 0);
                    return new vt2(((fj2) p11Var.c).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    gu2.W("getTimestamp", arrayList, 0);
                    return new ep2(Double.valueOf(((fj2) p11Var.c).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    gu2.W("getParamValue", arrayList, 1);
                    String strZzc = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc();
                    HashMap map = ((fj2) p11Var.c).c;
                    return z32.I(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    gu2.W("getParams", arrayList, 0);
                    HashMap map2 = ((fj2) p11Var.c).c;
                    hs2 hs2Var = new hs2();
                    for (String str2 : map2.keySet()) {
                        hs2Var.a(str2, z32.I(map2.get(str2)));
                    }
                    return hs2Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    gu2.W("setParamValue", arrayList, 2);
                    String strZzc2 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0)).zzc();
                    qt2 qt2VarT = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(1));
                    fj2 fj2Var = (fj2) p11Var.c;
                    Object objJ0 = gu2.j0(qt2VarT);
                    HashMap map3 = fj2Var.c;
                    if (objJ0 == null) {
                        map3.remove(strZzc2);
                        return qt2VarT;
                    }
                    map3.put(strZzc2, fj2.b(map3.get(strZzc2), objJ0, strZzc2));
                    return qt2VarT;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    gu2.W("setEventName", arrayList, 1);
                    qt2 qt2VarT2 = ((f91) ep1Var.c).t(ep1Var, (qt2) arrayList.get(0));
                    if (qt2.O.equals(qt2VarT2) || qt2.P.equals(qt2VarT2)) {
                        e.g("Illegal event name");
                        return null;
                    }
                    ((fj2) p11Var.c).a = qt2VarT2.zzc();
                    return new vt2(qt2VarT2.zzc());
                }
                break;
        }
        return super.c(str, ep1Var, arrayList);
    }
}
