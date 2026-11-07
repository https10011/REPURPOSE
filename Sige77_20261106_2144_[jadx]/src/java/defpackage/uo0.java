package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class uo0 implements Map, Serializable {
    public transient ih1 a;
    public transient jh1 b;
    public transient kh1 c;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wo0 entrySet() {
        ih1 ih1Var = this.a;
        if (ih1Var != null) {
            return ih1Var;
        }
        lh1 lh1Var = (lh1) this;
        ih1 ih1Var2 = new ih1(lh1Var, lh1Var.e, lh1Var.f);
        this.a = ih1Var2;
        return ih1Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        kh1 kh1Var = this.c;
        if (kh1Var == null) {
            lh1 lh1Var = (lh1) this;
            kh1 kh1Var2 = new kh1(lh1Var.e, 1, lh1Var.f);
            this.c = kh1Var2;
            kh1Var = kh1Var2;
        }
        return kh1Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r93.y(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((lh1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        jh1 jh1Var = this.b;
        if (jh1Var != null) {
            return jh1Var;
        }
        lh1 lh1Var = (lh1) this;
        jh1 jh1Var2 = new jh1(lh1Var, new kh1(lh1Var.e, 0, lh1Var.f));
        this.b = jh1Var2;
        return jh1Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((lh1) this).f;
        gu2.k(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        bs0 it = ((ih1) entrySet()).iterator();
        boolean z = true;
        while (true) {
            no0 no0Var = (no0) it;
            if (!no0Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) no0Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        kh1 kh1Var = this.c;
        if (kh1Var != null) {
            return kh1Var;
        }
        lh1 lh1Var = (lh1) this;
        kh1 kh1Var2 = new kh1(lh1Var.e, 1, lh1Var.f);
        this.c = kh1Var2;
        return kh1Var2;
    }

    public Object writeReplace() {
        return new to0(this);
    }
}
