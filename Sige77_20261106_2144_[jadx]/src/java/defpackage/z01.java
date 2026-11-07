package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class z01 {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    public z01(long j) {
        this.b = j;
    }

    public final synchronized Object a(Object obj) {
        y01 y01Var;
        y01Var = (y01) this.a.get(obj);
        return y01Var != null ? y01Var.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        y01 y01Var = (y01) this.a.put(obj, obj2 == null ? null : new y01(obj2, iB));
        if (y01Var != null) {
            this.c -= (long) y01Var.b;
            if (!y01Var.a.equals(obj2)) {
                c(obj, y01Var.a);
            }
        }
        e(this.b);
        return y01Var != null ? y01Var.a : null;
    }

    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            y01 y01Var = (y01) entry.getValue();
            this.c -= (long) y01Var.b;
            Object key = entry.getKey();
            it.remove();
            c(key, y01Var.a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
