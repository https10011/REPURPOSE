package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xr3 extends ij2 {
    public final Map b;

    public xr3(g93 g93Var, g93 g93Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, g93Var);
        d(linkedHashMap, g93Var2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((pq3) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, g93 g93Var) {
        for (int i = 0; i < g93Var.J(); i++) {
            pq3 pq3VarM = g93Var.M(i);
            Object obj = linkedHashMap.get(pq3VarM);
            boolean z = pq3VarM.c;
            Class cls = pq3VarM.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(pq3VarM, arrayList);
                }
                arrayList.add(cls.cast(g93Var.N(i)));
            } else {
                linkedHashMap.put(pq3VarM, cls.cast(g93Var.N(i)));
            }
        }
    }

    @Override // defpackage.ij2
    public final void a(ud2 ud2Var, lr3 lr3Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            pq3 pq3Var = (pq3) entry.getKey();
            Object value = entry.getValue();
            if (pq3Var.c) {
                ud2Var.y(pq3Var, ((List) value).iterator(), lr3Var);
            } else {
                ud2Var.v(pq3Var, value, lr3Var);
            }
        }
    }

    @Override // defpackage.ij2
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.ij2
    public final Set c() {
        return this.b.keySet();
    }
}
