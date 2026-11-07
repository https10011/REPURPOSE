package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ww2 extends pw2 implements NavigableSet, Iterable {
    public final transient Comparator i;
    public transient ww2 v;

    public ww2(Comparator comparator) {
        super(2);
        this.i = comparator;
    }

    public static qx2 r(Comparator comparator) {
        if (fx2.b == comparator) {
            return qx2.W;
        }
        vv2 vv2Var = kw2.e;
        return new qx2(lx2.v, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.i;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        qx2 qx2Var = (qx2) this;
        return qx2Var.u(0, qx2Var.s(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final ww2 descendingSet() {
        ww2 ww2VarR = this.v;
        if (ww2VarR == null) {
            qx2 qx2Var = (qx2) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(qx2Var.i);
            ww2VarR = qx2Var.isEmpty() ? r(comparatorReverseOrder) : new qx2(qx2Var.w.k(), comparatorReverseOrder);
            this.v = ww2VarR;
            ww2VarR.v = this;
        }
        return ww2VarR;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final qx2 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.i.compare(obj, obj2) > 0) {
            sm0.a();
            return null;
        }
        qx2 qx2Var = (qx2) this;
        qx2 qx2VarU = qx2Var.u(qx2Var.t(obj, z), qx2Var.w.size());
        return qx2VarU.u(0, qx2VarU.s(obj2, z2));
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        qx2 qx2Var = (qx2) this;
        return qx2Var.u(qx2Var.t(obj, true), qx2Var.w.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        qx2 qx2Var = (qx2) this;
        return qx2Var.u(0, qx2Var.s(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        qx2 qx2Var = (qx2) this;
        return qx2Var.u(qx2Var.t(obj, z), qx2Var.w.size());
    }
}
