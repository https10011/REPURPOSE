package defpackage;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ok0 extends AbstractList {
    public static final AtomicInteger e = new AtomicInteger();
    public Handler a;
    public final ArrayList c;
    public final String b = String.valueOf(Integer.valueOf(e.incrementAndGet()));
    public final ArrayList d = new ArrayList();

    public ok0(mk0... mk0VarArr) {
        List listAsList = Arrays.asList(mk0VarArr);
        listAsList.getClass();
        this.c = new ArrayList(listAsList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mk0 mk0Var = (mk0) obj;
        mk0Var.getClass();
        return this.c.add(mk0Var);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof mk0) {
            return super.contains((mk0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (mk0) this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof mk0) {
            return super.indexOf((mk0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof mk0) {
            return super.lastIndexOf((mk0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof mk0) {
            return super.remove((mk0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        mk0 mk0Var = (mk0) obj;
        mk0Var.getClass();
        return (mk0) this.c.set(i, mk0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        mk0 mk0Var = (mk0) obj;
        mk0Var.getClass();
        this.c.add(i, mk0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (mk0) this.c.remove(i);
    }

    public ok0(Collection collection) {
        this.c = new ArrayList(collection);
    }
}
