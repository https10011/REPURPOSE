package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class um {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public um(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            kw0 kw0Var = (kw0) entry.getValue();
            List arrayList = (List) this.a.get(kw0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(kw0Var, arrayList);
            }
            arrayList.add((vm) entry.getKey());
        }
    }

    public static void a(List list, ww0 ww0Var, kw0 kw0Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                vm vmVar = (vm) list.get(size);
                Method method = vmVar.b;
                try {
                    int i = vmVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, ww0Var);
                    } else if (i == 2) {
                        method.invoke(obj, ww0Var, kw0Var);
                    }
                } catch (IllegalAccessException e) {
                    sm0.n(e);
                    return;
                } catch (InvocationTargetException e2) {
                    sm0.m("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
