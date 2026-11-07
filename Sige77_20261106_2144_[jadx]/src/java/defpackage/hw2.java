package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hw2 extends kw2 {
    public final transient kw2 f;

    public hw2(kw2 kw2Var) {
        super(2);
        this.f = kw2Var;
    }

    @Override // defpackage.kw2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        kw2 kw2Var = this.f;
        qt.I(i, kw2Var.size());
        return kw2Var.get((kw2Var.size() - 1) - i);
    }

    @Override // defpackage.kw2, java.util.List
    public final int indexOf(Object obj) {
        kw2 kw2Var = this.f;
        int iLastIndexOf = kw2Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (kw2Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.kw2
    public final kw2 k() {
        return this.f;
    }

    @Override // defpackage.kw2, java.util.List
    /* JADX INFO: renamed from: l */
    public final kw2 subList(int i, int i2) {
        kw2 kw2Var = this.f;
        qt.K(i, i2, kw2Var.size());
        return kw2Var.subList(kw2Var.size() - i2, kw2Var.size() - i).k();
    }

    @Override // defpackage.kw2, java.util.List
    public final int lastIndexOf(Object obj) {
        kw2 kw2Var = this.f;
        int iIndexOf = kw2Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (kw2Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
