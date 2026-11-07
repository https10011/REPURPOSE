package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jo0 extends ao0 implements Serializable {
    public final Object[] a;
    public final int b;

    public jo0(Object... objArr) {
        this.b = objArr.length;
        this.a = new Object[objArr.length * 2];
        for (Object obj : objArr) {
            int iA = a(obj);
            if (iA >= 0) {
                ur.g(obj, "duplicate element: ");
                throw null;
            }
            this.a[-(iA + 1)] = obj;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        Object[] objArr = new Object[this.b];
        int i = 0;
        for (Object obj : this.a) {
            if (obj != null) {
                objArr[i] = obj;
                i++;
            }
        }
        return new eo(2, objArr);
    }

    public final int a(Object obj) {
        int iHashCode = obj.hashCode();
        Object[] objArr = this.a;
        int length = objArr.length;
        boolean z = lo0.b;
        int i = iHashCode % length;
        if ((iHashCode ^ length) < 0 && i != 0) {
            i += length;
        }
        while (true) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return (-i) - 1;
            }
            if (obj.equals(obj2)) {
                return i;
            }
            i++;
            if (i == objArr.length) {
                i = 0;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        obj.getClass();
        return this.b > 0 && a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode = 0;
        for (Object obj : this.a) {
            if (obj != null) {
                iHashCode = obj.hashCode() + iHashCode;
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new fo0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.b;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        fo0 fo0Var = new fo0(this);
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fo0Var.next();
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        fo0 fo0Var = new fo0(this);
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fo0Var.next();
        }
        return objArr;
    }
}
