package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class us2 extends dp2 {
    public final transient int f;
    public final transient int i;
    public final /* synthetic */ dp2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us2(dp2 dp2Var, int i, int i2) {
        super(1);
        this.v = dp2Var;
        this.f = i;
        this.i = i2;
    }

    @Override // defpackage.uk2
    public final int a() {
        return this.v.c() + this.f + this.i;
    }

    @Override // defpackage.uk2
    public final int c() {
        return this.v.c() + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y21.y(i, this.i);
        return this.v.get(i + this.f);
    }

    @Override // defpackage.uk2
    public final Object[] h() {
        return this.v.h();
    }

    @Override // defpackage.dp2, java.util.List
    /* JADX INFO: renamed from: k */
    public final dp2 subList(int i, int i2) {
        y21.z(i, i2, this.i);
        int i3 = this.f;
        return (dp2) this.v.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
