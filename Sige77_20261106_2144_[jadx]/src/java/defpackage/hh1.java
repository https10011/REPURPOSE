package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hh1 extends ro0 {
    public final /* synthetic */ ih1 c;

    public hh1(ih1 ih1Var) {
        this.c = ih1Var;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ih1 ih1Var = this.c;
        yv2.j(i, ih1Var.f);
        Object[] objArr = ih1Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
