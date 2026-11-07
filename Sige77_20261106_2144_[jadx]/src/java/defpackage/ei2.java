package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ei2 extends fi2 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ fi2 e;

    public ei2(fi2 fi2Var, int i, int i2) {
        this.e = fi2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ci2
    public final Object[] a() {
        return this.e.a();
    }

    @Override // defpackage.ci2
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // defpackage.ci2
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // defpackage.ci2
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fi2, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fi2 subList(int i, int i2) {
        ia.u(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ia.s(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
