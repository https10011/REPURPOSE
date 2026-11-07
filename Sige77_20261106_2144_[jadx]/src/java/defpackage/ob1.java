package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ob1 implements Serializable {
    public final HashMap a;

    public ob1(HashMap map) {
        map.getClass();
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return new nb1(this.a);
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void a(w1 w1Var, List list) {
        HashMap map = this.a;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!map.containsKey(w1Var)) {
                map.put(w1Var, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(w1Var);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public ob1() {
        this.a = new HashMap();
    }
}
