package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class yn0 extends xn0 implements List, RandomAccess {
    public static void b(int i, int i2, int i3) {
        if (i < 0) {
            e.c(ck1.r(i, "fromIndex = "));
            return;
        }
        if (i2 > i3) {
            e.c(ck1.r(i2, "toIndex = "));
            return;
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
    }

    public final IndexOutOfBoundsException a(int i) {
        StringBuilder sbU = ck1.u(i, "Index: ", " Size: ");
        sbU.append(size());
        return new IndexOutOfBoundsException(sbU.toString());
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int size = size();
        boolean z = lo0.b;
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(ts.i("Index: ", i, size, ", Size: "));
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (!it.hasNext() || !ta.g(get(i), it.next())) {
                return false;
            }
        }
        return !it.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            int i2 = iHashCode * 31;
            Object obj = get(i);
            iHashCode = i2 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new co0(this, size());
    }

    public ListIterator listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw a(i);
        }
        return new co0(this, size, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int i2) {
        b(i, i2, size());
        return new ko0(this, i, i2 - i);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
