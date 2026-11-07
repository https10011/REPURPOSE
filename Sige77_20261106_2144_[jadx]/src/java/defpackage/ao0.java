package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ao0 extends xn0 implements Set {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (collection.size() != size()) {
            return false;
        }
        for (Object obj2 : collection) {
            if (obj2 == null || !contains(obj2)) {
                return false;
            }
        }
        return true;
    }
}
