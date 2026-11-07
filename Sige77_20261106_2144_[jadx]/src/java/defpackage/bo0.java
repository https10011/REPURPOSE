package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bo0 extends yn0 implements Serializable {
    public final Object a;
    public final Object b;

    public bo0(Object obj, Object obj2) {
        obj.getClass();
        this.a = obj;
        obj2.getClass();
        this.b = obj2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        Object obj = lo0.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        return obj2 == obj ? new eo(1, obj3) : new eo(1, obj3, obj2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            Object obj = lo0.c;
            Object obj2 = this.b;
            if (obj2 != obj) {
                return obj2;
            }
        }
        throw a(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        obj.getClass();
        if (obj.equals(this.a)) {
            return 0;
        }
        Object obj2 = lo0.c;
        Object obj3 = this.b;
        return (obj3 == obj2 || !obj.equals(obj3)) ? -1 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        obj.getClass();
        Object obj2 = lo0.c;
        Object obj3 = this.b;
        if (obj3 == obj2 || !obj.equals(obj3)) {
            return obj.equals(this.a) ? 0 : -1;
        }
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b != lo0.c ? 2 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        objArr[0] = this.a;
        if (size == 2) {
            objArr[1] = this.b;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public bo0(Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = lo0.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object obj = lo0.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        if (obj2 == obj) {
            return new Object[]{obj3};
        }
        return new Object[]{obj3, obj2};
    }
}
