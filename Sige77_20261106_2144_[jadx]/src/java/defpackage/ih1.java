package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ih1 extends wo0 {
    public final transient uo0 d;
    public final transient Object[] e;
    public final transient int f;

    public ih1(uo0 uo0Var, Object[] objArr, int i) {
        this.d = uo0Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.wn0
    public final int b(Object[] objArr) {
        return a().b(objArr);
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.wo0
    public final ro0 k() {
        return new hh1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
