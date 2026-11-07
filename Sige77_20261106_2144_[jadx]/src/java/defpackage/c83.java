package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c83 extends dq2 {
    public final /* synthetic */ int c = 1;
    public final Object d;

    public c83(ox1 ox1Var) {
        super("internal.logger");
        this.d = ox1Var;
        this.b.put("log", new rh3(this, false, true));
        this.b.put("silent", new ac3("silent", 1));
        ((dq2) this.b.get("silent")).a("log", new rh3(this, true, true));
        this.b.put("unmonitored", new ac3("unmonitored", 2));
        ((dq2) this.b.get("unmonitored")).a("log", new rh3(this, false, false));
    }

    @Override // defpackage.dq2
    public final qt2 g(ep1 ep1Var, List list) {
        TreeMap treeMap;
        int i = this.c;
        String str = this.a;
        xt2 xt2Var = qt2.O;
        Object obj = this.d;
        String str2 = null;
        switch (i) {
            case 0:
                gu2.W(str, list, 3);
                String strZzc = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0)).zzc();
                qt2 qt2Var = (qt2) list.get(1);
                f91 f91Var = (f91) ep1Var.c;
                long jI0 = (long) gu2.i0(f91Var.t(ep1Var, qt2Var).zzd().doubleValue());
                qt2 qt2VarT = f91Var.t(ep1Var, (qt2) list.get(2));
                HashMap mapK0 = qt2VarT instanceof hs2 ? gu2.k0((hs2) qt2VarT) : new HashMap();
                p11 p11Var = (p11) obj;
                p11Var.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapK0.keySet()) {
                    HashMap map2 = ((fj2) p11Var.b).c;
                    map.put(str3, fj2.b(map2.containsKey(str3) ? map2.get(str3) : null, mapK0.get(str3), str3));
                }
                ((ArrayList) p11Var.d).add(new fj2(strZzc, jI0, map));
                return xt2Var;
            case 1:
                gu2.W("getValue", list, 2);
                qt2 qt2VarT2 = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0));
                qt2 qt2VarT3 = ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(1));
                String strZzc2 = qt2VarT2.zzc();
                dc2 dc2Var = (dc2) obj;
                Map map3 = (Map) ((f53) dc2Var.b).d.get((String) dc2Var.a);
                if (map3 != null && map3.containsKey(strZzc2)) {
                    str2 = (String) map3.get(strZzc2);
                }
                return str2 != null ? new vt2(str2) : qt2VarT3;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return xt2Var;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    return z32.I(((x43) obj).call());
                } catch (Exception unused) {
                    return xt2Var;
                }
            default:
                gu2.W(str, list, 3);
                ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0)).zzc();
                qt2 qt2Var2 = (qt2) list.get(1);
                f91 f91Var2 = (f91) ep1Var.c;
                qt2 qt2VarT4 = f91Var2.t(ep1Var, qt2Var2);
                if (qt2VarT4 instanceof et2) {
                    qt2 qt2VarT5 = f91Var2.t(ep1Var, (qt2) list.get(2));
                    if (qt2VarT5 instanceof hs2) {
                        hs2 hs2Var = (hs2) qt2VarT5;
                        HashMap map4 = hs2Var.a;
                        if (map4.containsKey("type")) {
                            String strZzc3 = hs2Var.d("type").zzc();
                            int iH0 = map4.containsKey("priority") ? gu2.h0(hs2Var.d("priority").zzd().doubleValue()) : 1000;
                            yd2 yd2Var = (yd2) obj;
                            et2 et2Var = (et2) qt2VarT4;
                            yd2Var.getClass();
                            if ("create".equals(strZzc3)) {
                                treeMap = (TreeMap) yd2Var.c;
                            } else if ("edit".equals(strZzc3)) {
                                treeMap = (TreeMap) yd2Var.b;
                            } else {
                                uq1.q("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iH0))) {
                                iH0 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iH0), et2Var);
                            return xt2Var;
                        }
                        e.g("Undefined rule type");
                    } else {
                        e.g("Invalid callback params");
                    }
                } else {
                    e.g("Invalid callback type");
                }
                return null;
        }
    }

    public c83(p11 p11Var) {
        super("internal.eventLogger");
        this.d = p11Var;
    }

    public c83(yd2 yd2Var) {
        super("internal.registerCallback");
        this.d = yd2Var;
    }

    public c83(x43 x43Var) {
        super("internal.appMetadata");
        this.d = x43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c83(ac3 ac3Var, dc2 dc2Var) {
        super("getValue");
        this.d = dc2Var;
    }
}
