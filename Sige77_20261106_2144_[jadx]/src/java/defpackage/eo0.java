package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eo0 extends zn0 {
    public final Object a;
    public final Object b;

    public eo0(Object obj, Object obj2) {
        obj.getClass();
        this.a = obj;
        obj2.getClass();
        this.b = obj2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        return new eo(3, this.a, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj.equals(this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return obj.equals(this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new io0(new jv0(this.a, this.b));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj.equals(this.a)) {
            return this.b;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return 1;
    }
}
