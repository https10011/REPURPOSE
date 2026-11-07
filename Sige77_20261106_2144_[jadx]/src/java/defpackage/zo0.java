package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class zo0 extends wo0 implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    public final transient Comparator d;
    public transient zo0 e;

    public zo0(Comparator comparator) {
        this.d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        zo0 nh1Var = this.e;
        if (nh1Var == null) {
            nh1 nh1Var2 = (nh1) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(nh1Var2.d);
            if (nh1Var2.isEmpty()) {
                nh1Var = n61.a != comparatorReverseOrder ? new nh1(gh1.e, comparatorReverseOrder) : nh1.v;
            } else {
                nh1Var = new nh1(nh1Var2.i.m(), comparatorReverseOrder);
            }
            this.e = nh1Var;
            nh1Var.e = this;
        }
        return nh1Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        nh1 nh1Var = (nh1) this;
        return nh1Var.m(0, nh1Var.o(obj, z));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final nh1 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        yv2.h(this.d.compare(obj, obj2) <= 0);
        nh1 nh1Var = (nh1) this;
        nh1 nh1VarM = nh1Var.m(nh1Var.p(obj, z), nh1Var.i.size());
        return nh1VarM.m(0, nh1VarM.o(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        nh1 nh1Var = (nh1) this;
        return nh1Var.m(nh1Var.p(obj, true), nh1Var.i.size());
    }

    @Override // defpackage.wo0, defpackage.wn0
    public Object writeReplace() {
        return new yo0(this.d, toArray(wn0.a));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        nh1 nh1Var = (nh1) this;
        return nh1Var.m(0, nh1Var.o(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        nh1 nh1Var = (nh1) this;
        return nh1Var.m(nh1Var.p(obj, z), nh1Var.i.size());
    }
}
