package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ro0 extends wn0 implements List, RandomAccess {
    public static final no0 b = new no0(gh1.e, 0);

    public static gh1 h(int i, Object[] objArr) {
        return i == 0 ? gh1.e : new gh1(i, objArr);
    }

    public static ro0 i(Iterable iterable) {
        if (iterable instanceof Collection) {
            return k((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return gh1.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            ga.e(1, objArr);
            return h(1, objArr);
        }
        mo0 mo0Var = new mo0(4);
        mo0Var.a(next);
        while (it.hasNext()) {
            mo0Var.a(it.next());
        }
        return mo0Var.e();
    }

    public static ro0 k(Collection collection) {
        if (!(collection instanceof wn0)) {
            Object[] array = collection.toArray();
            ga.e(array.length, array);
            return h(array.length, array);
        }
        ro0 ro0VarA = ((wn0) collection).a();
        if (!ro0VarA.f()) {
            return ro0VarA;
        }
        Object[] array2 = ro0VarA.toArray(wn0.a);
        return h(array2.length, array2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wn0
    public int b(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ia.d(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (ia.d(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final no0 listIterator(int i) {
        yv2.m(i, size());
        return isEmpty() ? b : new no0(this, i);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public ro0 m() {
        return size() <= 1 ? this : new oo0(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ro0 subList(int i, int i2) {
        yv2.n(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? gh1.e : new qo0(this, i, i3);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wn0
    public Object writeReplace() {
        return new po0(toArray(wn0.a));
    }

    @Override // defpackage.wn0
    public final ro0 a() {
        return this;
    }
}
