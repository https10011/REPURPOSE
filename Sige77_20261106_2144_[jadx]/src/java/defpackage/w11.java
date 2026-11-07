package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class w11 extends v11 {
    public static HashMap c(Pair... pairArr) {
        HashMap map = new HashMap(v11.a(pairArr.length));
        f(map, pairArr);
        return map;
    }

    public static Map d(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v11.a(pairArr.length));
            f(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        y50 y50Var = y50.a;
        y50Var.getClass();
        return y50Var;
    }

    public static LinkedHashMap e(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(v11.a(pairArr.length));
        f(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void f(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.a, pair.b);
        }
    }

    public static Map g(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            y50 y50Var = y50.a;
            y50Var.getClass();
            return y50Var;
        }
        int i = 0;
        if (size == 1) {
            return v11.b((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v11.a(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            linkedHashMap.put(pair.a, pair.b);
        }
        return linkedHashMap;
    }

    public static Map h(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            y50 y50Var = y50.a;
            y50Var.getClass();
            return y50Var;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
