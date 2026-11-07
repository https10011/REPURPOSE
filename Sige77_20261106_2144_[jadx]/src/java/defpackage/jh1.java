package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jh1 extends wo0 {
    public final transient uo0 d;
    public final transient kh1 e;

    public jh1(uo0 uo0Var, kh1 kh1Var) {
        this.d = uo0Var;
        this.e = kh1Var;
    }

    @Override // defpackage.wo0, defpackage.wn0
    public final ro0 a() {
        return this.e;
    }

    @Override // defpackage.wn0
    public final int b(Object[] objArr) {
        return this.e.b(objArr);
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((lh1) this.d).f;
    }
}
