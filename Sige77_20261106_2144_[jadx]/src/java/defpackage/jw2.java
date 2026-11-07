package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jw2 extends kw2 {
    public final transient int f;
    public final transient int i;
    public final /* synthetic */ kw2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw2(kw2 kw2Var, int i, int i2) {
        super(2);
        this.v = kw2Var;
        this.f = i;
        this.i = i2;
    }

    @Override // defpackage.uk2
    public final int c() {
        return this.v.e() + this.f + this.i;
    }

    @Override // defpackage.uk2
    public final int e() {
        return this.v.e() + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qt.I(i, this.i);
        return this.v.get(i + this.f);
    }

    @Override // defpackage.uk2
    public final Object[] h() {
        return this.v.h();
    }

    @Override // defpackage.kw2, java.util.List
    /* JADX INFO: renamed from: l */
    public final kw2 subList(int i, int i2) {
        qt.K(i, i2, this.i);
        int i3 = this.f;
        return this.v.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
