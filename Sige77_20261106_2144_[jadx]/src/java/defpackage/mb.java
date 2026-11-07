package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class mb extends wq1 implements Map {
    public hb d;
    public jb e;
    public lb f;

    public mb(mb mbVar) {
        super(0);
        g(mbVar);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        hb hbVar = this.d;
        if (hbVar != null) {
            return hbVar;
        }
        hb hbVar2 = new hb(this, 0);
        this.d = hbVar2;
        return hbVar2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jb jbVar = this.e;
        if (jbVar != null) {
            return jbVar;
        }
        jb jbVar2 = new jb(this);
        this.e = jbVar2;
        return jbVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        lb lbVar = this.f;
        if (lbVar != null) {
            return lbVar;
        }
        lb lbVar2 = new lb(this);
        this.f = lbVar2;
        return lbVar2;
    }

    public mb() {
        super(0);
    }
}
