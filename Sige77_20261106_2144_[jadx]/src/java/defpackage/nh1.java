package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nh1 extends zo0 {
    public static final nh1 v;
    public final transient ro0 i;

    static {
        no0 no0Var = ro0.b;
        v = new nh1(gh1.e, n61.a);
    }

    public nh1(ro0 ro0Var, Comparator comparator) {
        super(comparator);
        this.i = ro0Var;
    }

    @Override // defpackage.wo0, defpackage.wn0
    public final ro0 a() {
        return this.i;
    }

    @Override // defpackage.wn0
    public final int b(Object[] objArr) {
        return this.i.b(objArr);
    }

    @Override // defpackage.wn0
    public final Object[] c() {
        return this.i.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iP = p(obj, true);
        ro0 ro0Var = this.i;
        if (iP == ro0Var.size()) {
            return null;
        }
        return ro0Var.get(iP);
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.i, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof z51) {
            collection = ((z51) collection).n();
        }
        Comparator comparator = this.d;
        if (!kv.D(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        bs0 it = iterator();
        Iterator it2 = collection.iterator();
        no0 no0Var = (no0) it;
        if (!no0Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = no0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!no0Var.hasNext()) {
                        return false;
                    }
                    next2 = no0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.wn0
    public final int d() {
        return this.i.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.i.m().listIterator(0);
    }

    @Override // defpackage.wn0
    public final int e() {
        return this.i.e();
    }

    @Override // defpackage.wo0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.i.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!kv.D(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            bs0 it2 = iterator();
            do {
                no0 no0Var = (no0) it2;
                if (!no0Var.hasNext()) {
                    return true;
                }
                next = no0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return this.i.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.i.get(0);
        }
        uq1.a();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iO = o(obj, true) - 1;
        if (iO == -1) {
            return null;
        }
        return this.i.get(iO);
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return this.i.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iP = p(obj, false);
        ro0 ro0Var = this.i;
        if (iP == ro0Var.size()) {
            return null;
        }
        return ro0Var.get(iP);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            uq1.a();
            return null;
        }
        ro0 ro0Var = this.i;
        return ro0Var.get(ro0Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iO = o(obj, false) - 1;
        if (iO == -1) {
            return null;
        }
        return this.i.get(iO);
    }

    public final nh1 m(int i, int i2) {
        ro0 ro0Var = this.i;
        if (i == 0 && i2 == ro0Var.size()) {
            return this;
        }
        Comparator comparator = this.d;
        if (i < i2) {
            return new nh1(ro0Var.subList(i, i2), comparator);
        }
        return n61.a != comparator ? new nh1(gh1.e, comparator) : v;
    }

    public final int o(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int p(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.size();
    }
}
