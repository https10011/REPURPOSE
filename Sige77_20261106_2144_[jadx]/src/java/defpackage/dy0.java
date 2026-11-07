package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dy0 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ dy0(fy0 fy0Var, int i) {
        this.a = i;
        this.b = fy0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                fy0Var.clear();
                break;
            default:
                fy0Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ey0 ey0VarA;
        int i = this.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ey0 ey0Var = null;
                if (key != null) {
                    try {
                        ey0VarA = fy0Var.a(key, false);
                    } catch (ClassCastException unused) {
                        ey0VarA = null;
                    }
                    break;
                } else {
                    ey0VarA = null;
                }
                if (ey0VarA != null && Objects.equals(ey0VarA.v, entry.getValue())) {
                    ey0Var = ey0VarA;
                }
                return ey0Var != null;
            default:
                return fy0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                return new cy0(fy0Var, 0);
            default:
                return new cy0(fy0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ey0 ey0VarA;
        int i = this.a;
        ey0 ey0VarA2 = null;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        ey0VarA = fy0Var.a(key, false);
                    } catch (ClassCastException unused) {
                        ey0VarA = null;
                    }
                    break;
                } else {
                    ey0VarA = null;
                }
                if (ey0VarA != null && Objects.equals(ey0VarA.v, entry.getValue())) {
                    ey0VarA2 = ey0VarA;
                }
                if (ey0VarA2 == null) {
                    return false;
                }
                fy0Var.c(ey0VarA2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        ey0VarA2 = fy0Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (ey0VarA2 != null) {
                    fy0Var.c(ey0VarA2, true);
                }
                return ey0VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return fy0Var.d;
    }
}
