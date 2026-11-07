package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m11 extends c1 {
    public final l11 a;

    public m11(l11 l11Var) {
        this.a = l11Var;
    }

    @Override // defpackage.g1
    public final int a() {
        return this.a.w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.c1
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        l11 l11Var = this.a;
        l11Var.getClass();
        int iF = l11Var.f(entry.getKey());
        if (iF < 0) {
            return false;
        }
        Object[] objArr = l11Var.b;
        objArr.getClass();
        return Intrinsics.areEqual(objArr[iF], entry.getValue());
    }

    @Override // defpackage.c1
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        l11 l11Var = this.a;
        l11Var.getClass();
        entry.getClass();
        l11Var.b();
        int iF = l11Var.f(entry.getKey());
        if (iF < 0) {
            return false;
        }
        Object[] objArr = l11Var.b;
        objArr.getClass();
        if (!Intrinsics.areEqual(objArr[iF], entry.getValue())) {
            return false;
        }
        l11Var.j(iF);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.d(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        l11 l11Var = this.a;
        l11Var.getClass();
        return new i11(l11Var, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.b();
        return super.retainAll(collection);
    }
}
