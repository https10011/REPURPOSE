package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class io0 extends ao0 implements Serializable {
    public final Object a;
    public final Object b;

    public io0(Object obj, Object obj2) {
        obj2.getClass();
        if (obj.equals(obj2)) {
            ur.g(obj, "duplicate element: ");
            throw null;
        }
        this.a = obj;
        this.b = obj2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        Object obj = lo0.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        return obj2 == obj ? new eo(2, obj3) : new eo(2, obj3, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj.equals(this.a) || this.b.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Object obj = lo0.c;
        Object obj2 = this.b;
        return iHashCode + (obj2 == obj ? 0 : obj2.hashCode());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ho0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b == lo0.c ? 1 : 2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        Object obj = this.a;
        if (size == 1) {
            objArr[0] = obj;
        } else {
            boolean z = lo0.b;
            Object obj2 = this.b;
            if (z) {
                objArr[0] = obj2;
                objArr[1] = obj;
            } else {
                objArr[0] = obj;
                objArr[1] = obj2;
            }
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public io0(Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = lo0.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object obj = lo0.c;
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj3 == obj) {
            return new Object[]{obj2};
        }
        if (lo0.b) {
            return new Object[]{obj3, obj2};
        }
        return new Object[]{obj2, obj3};
    }
}
