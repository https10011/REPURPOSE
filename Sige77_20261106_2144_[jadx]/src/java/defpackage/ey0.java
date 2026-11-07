package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ey0 implements Map.Entry {
    public ey0 a;
    public ey0 b;
    public ey0 c;
    public ey0 d;
    public ey0 e;
    public final Object f;
    public final boolean i;
    public Object v;
    public int w;

    public ey0(boolean z, ey0 ey0Var, Object obj, ey0 ey0Var2, ey0 ey0Var3) {
        this.a = ey0Var;
        this.f = obj;
        this.i = z;
        this.w = 1;
        this.d = ey0Var2;
        this.e = ey0Var3;
        ey0Var3.d = this;
        ey0Var2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.v;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.v;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.i) {
            uq1.h("value == null");
            return null;
        }
        Object obj2 = this.v;
        this.v = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.v;
    }

    public ey0(boolean z) {
        this.f = null;
        this.i = z;
        this.e = this;
        this.d = this;
    }
}
