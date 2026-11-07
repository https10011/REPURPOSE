package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hy0 extends f1 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final hy0 d;
    public final jy0 e;

    public hy0(Object[] objArr, int i, int i2, hy0 hy0Var, jy0 jy0Var) {
        objArr.getClass();
        jy0Var.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = hy0Var;
        this.e = jy0Var;
        ((AbstractList) this).modCount = ((AbstractList) jy0Var).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.e.c) {
            return new zo1(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.f1
    public final int a() {
        f();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.b(i, i2);
        e(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.b(i, i2);
        int size = collection.size();
        d(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.f1
    public final Object b(int i) {
        g();
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.a(i, i2);
        return h(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.b, this.c);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        jy0 jy0Var = this.e;
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            hy0Var.d(i, collection, i2);
        } else {
            jy0 jy0Var2 = jy0.e;
            jy0Var.d(i, collection, i2);
        }
        this.a = jy0Var.a;
        this.c += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        jy0 jy0Var = this.e;
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            hy0Var.e(i, obj);
        } else {
            jy0 jy0Var2 = jy0.e;
            jy0Var.e(i, obj);
        }
        this.a = jy0Var.a;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.areEqual(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.e.c) {
            uq1.k();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.a(i, i2);
        return this.a[this.b + i];
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            objH = hy0Var.h(i);
        } else {
            jy0 jy0Var = jy0.e;
            objH = this.e.h(i);
        }
        this.c--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            hy0Var.i(i, i2);
        } else {
            jy0 jy0Var = jy0.e;
            this.e.i(i, i2);
        }
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.c; i++) {
            if (Intrinsics.areEqual(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int iK;
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            iK = hy0Var.k(i, i2, collection, z);
        } else {
            jy0 jy0Var = jy0.e;
            iK = this.e.k(i, i2, collection, z);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.c - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.b(i, i2);
        return new gy0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return k(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return k(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        x0 x0Var = b1.a;
        int i2 = this.c;
        x0Var.getClass();
        x0.a(i, i2);
        Object[] objArr = this.a;
        int i3 = this.b + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        x0 x0Var = b1.a;
        int i3 = this.c;
        x0Var.getClass();
        x0.c(i, i2, i3);
        return new hy0(this.a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        ub.d(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return r93.b(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return ub.g(objArr, i2, i + i2);
    }
}
