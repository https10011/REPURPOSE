package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ck2 extends AbstractSet {
    public final int a;
    public final /* synthetic */ dk2 b;

    public ck2(dk2 dk2Var, int i) {
        this.b = dk2Var;
        this.a = i;
    }

    public final int a() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.b[i];
    }

    public final int b() {
        return this.b.b[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.a, a(), b(), obj, this.a == -1 ? dk2.f : ek2.b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rb(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b() - a();
    }
}
