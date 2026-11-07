package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fo2 extends cp2 {
    public final transient int f;
    public final transient int i;
    public final /* synthetic */ cp2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo2(cp2 cp2Var, int i, int i2) {
        super(0);
        this.v = cp2Var;
        this.f = i;
        this.i = i2;
    }

    @Override // defpackage.uk2
    public final Object[] d() {
        return this.v.d();
    }

    @Override // defpackage.uk2
    public final int e() {
        return this.v.e() + this.f;
    }

    @Override // defpackage.uk2
    public final int f() {
        return this.v.e() + this.f + this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yi0.v(i, this.i);
        return this.v.get(i + this.f);
    }

    @Override // defpackage.cp2, java.util.List
    /* JADX INFO: renamed from: l */
    public final cp2 subList(int i, int i2) {
        yi0.y(i, i2, this.i);
        int i3 = this.f;
        return this.v.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
