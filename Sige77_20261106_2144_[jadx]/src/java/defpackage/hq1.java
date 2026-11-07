package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hq1 extends mv1 implements xg0 {
    public /* synthetic */ lq1 a;
    public /* synthetic */ d61 b;

    @Override // defpackage.xg0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq1 hq1Var = new hq1(3, (fs) obj3);
        hq1Var.a = (lq1) obj;
        hq1Var.b = (d61) obj2;
        return hq1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        zi0.B(obj);
        lq1 lq1Var = this.a;
        d61 d61Var = this.b;
        Set setKeySet = d61Var.a().keySet();
        ArrayList arrayList = new ArrayList(ko.h(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((fc1) it.next()).a);
        }
        Map<String, ?> all = lq1Var.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = lq1Var.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v11.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.F((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        d61 d61Var2 = new d61(new LinkedHashMap(d61Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                d61Var2.d(new fc1(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                d61Var2.d(new fc1(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                d61Var2.d(new fc1(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                d61Var2.d(new fc1(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                d61Var2.d(new fc1(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                d61Var2.d(new fc1(str), (Set) value2);
            }
        }
        return new d61(new LinkedHashMap(d61Var2.a()), true);
    }
}
