package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wx2 extends pw2 {
    public final transient Object i;

    public wx2(Object obj) {
        super(2);
        this.i = obj;
    }

    @Override // defpackage.uk2
    public final int b(Object[] objArr) {
        objArr[0] = this.i;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.i.equals(obj);
    }

    @Override // defpackage.uk2
    public final bs0 g() {
        return new yw2(this.i);
    }

    @Override // defpackage.pw2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new yw2(this.i);
    }

    @Override // defpackage.pw2
    public final kw2 m() {
        Object[] objArr = {this.i};
        for (int i = 0; i < 1; i++) {
            vv2 vv2Var = kw2.e;
            if (objArr[i] == null) {
                uq1.h(ck1.r(i, "at index "));
                return null;
            }
        }
        return kw2.m(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ts.k("[", this.i.toString(), "]");
    }
}
