package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rw2 extends kw2 {
    public final /* synthetic */ sw2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw2(sw2 sw2Var) {
        super(2);
        this.f = sw2Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        uw2 uw2Var = this.f.i;
        return new AbstractMap.SimpleImmutableEntry(uw2Var.c.w.get(i), uw2Var.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.i.d.size();
    }
}
