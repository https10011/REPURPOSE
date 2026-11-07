package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oo0 extends ro0 {
    public final transient ro0 c;

    public oo0(ro0 ro0Var) {
        this.c = ro0Var;
    }

    @Override // defpackage.ro0, defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return this.c.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        ro0 ro0Var = this.c;
        yv2.j(i, ro0Var.size());
        return ro0Var.get((ro0Var.size() - 1) - i);
    }

    @Override // defpackage.ro0, java.util.List
    public final int indexOf(Object obj) {
        ro0 ro0Var = this.c;
        int iLastIndexOf = ro0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (ro0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.ro0, defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.ro0, java.util.List
    public final int lastIndexOf(Object obj) {
        ro0 ro0Var = this.c;
        int iIndexOf = ro0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (ro0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.ro0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.ro0
    public final ro0 m() {
        return this.c;
    }

    @Override // defpackage.ro0, java.util.List
    /* JADX INFO: renamed from: o */
    public final ro0 subList(int i, int i2) {
        ro0 ro0Var = this.c;
        yv2.n(i, i2, ro0Var.size());
        return ro0Var.subList(ro0Var.size() - i2, ro0Var.size() - i).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.ro0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
