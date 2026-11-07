package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qx2 extends ww2 {
    public static final qx2 W;
    public final transient kw2 w;

    static {
        vv2 vv2Var = kw2.e;
        W = new qx2(lx2.v, fx2.b);
    }

    public qx2(kw2 kw2Var, Comparator comparator) {
        super(comparator);
        this.w = kw2Var;
    }

    @Override // defpackage.uk2
    public final int b(Object[] objArr) {
        return this.w.b(objArr);
    }

    @Override // defpackage.uk2
    public final int c() {
        return this.w.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iT = t(obj, true);
        kw2 kw2Var = this.w;
        if (iT == kw2Var.size()) {
            return null;
        }
        return kw2Var.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.w, obj, this.i) >= 0) {
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
        if (collection instanceof cx2) {
            collection = ((cx2) collection).zza();
        }
        Comparator comparator = this.i;
        if (!y21.A(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        vv2 vv2VarListIterator = this.w.listIterator(0);
        Iterator it = collection.iterator();
        if (vv2VarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = vv2VarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!vv2VarListIterator.hasNext()) {
                            break;
                        }
                        next2 = vv2VarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.w.k().listIterator(0);
    }

    @Override // defpackage.uk2
    public final int e() {
        return this.w.e();
    }

    @Override // defpackage.pw2, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            kw2 kw2Var = this.w;
            if (kw2Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.i;
                if (!y21.A(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    vv2 vv2VarListIterator = kw2Var.listIterator(0);
                    while (vv2VarListIterator.hasNext()) {
                        Object next = vv2VarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.ww2, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.w.get(0);
        }
        uq1.a();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iS = s(obj, true) - 1;
        if (iS == -1) {
            return null;
        }
        return this.w.get(iS);
    }

    @Override // defpackage.uk2
    public final bs0 g() {
        return this.w.listIterator(0);
    }

    @Override // defpackage.uk2
    public final Object[] h() {
        return this.w.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iT = t(obj, false);
        kw2 kw2Var = this.w;
        if (iT == kw2Var.size()) {
            return null;
        }
        return kw2Var.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // defpackage.ww2, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            uq1.a();
            return null;
        }
        kw2 kw2Var = this.w;
        return kw2Var.get(kw2Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iS = s(obj, false) - 1;
        if (iS == -1) {
            return null;
        }
        return this.w.get(iS);
    }

    @Override // defpackage.pw2
    public final kw2 m() {
        return this.w;
    }

    public final int s(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.w, obj, this.i);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w.size();
    }

    public final int t(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.w, obj, this.i);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final qx2 u(int i, int i2) {
        kw2 kw2Var = this.w;
        if (i == 0) {
            if (i2 == kw2Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.i;
        return i < i2 ? new qx2(kw2Var.subList(i, i2), comparator) : ww2.r(comparator);
    }
}
