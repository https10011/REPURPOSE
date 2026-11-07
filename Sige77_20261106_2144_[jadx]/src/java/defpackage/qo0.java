package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qo0 extends ro0 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ro0 e;

    public qo0(ro0 ro0Var, int i, int i2) {
        this.e = ro0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.wn0
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.wn0
    public final int d() {
        return this.e.e() + this.c + this.d;
    }

    @Override // defpackage.wn0
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yv2.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.ro0, defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.ro0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.ro0, java.util.List
    /* JADX INFO: renamed from: o */
    public final ro0 subList(int i, int i2) {
        yv2.n(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.ro0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
