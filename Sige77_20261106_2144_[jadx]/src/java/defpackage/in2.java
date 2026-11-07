package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class in2 extends cp2 {
    public final transient cp2 f;

    public in2(cp2 cp2Var) {
        super(0);
        this.f = cp2Var;
    }

    @Override // defpackage.cp2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        cp2 cp2Var = this.f;
        yi0.v(i, cp2Var.size());
        return cp2Var.get((cp2Var.size() - 1) - i);
    }

    @Override // defpackage.cp2, java.util.List
    public final int indexOf(Object obj) {
        cp2 cp2Var = this.f;
        int iLastIndexOf = cp2Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (cp2Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.cp2
    public final cp2 k() {
        return this.f;
    }

    @Override // defpackage.cp2, java.util.List
    /* JADX INFO: renamed from: l */
    public final cp2 subList(int i, int i2) {
        cp2 cp2Var = this.f;
        yi0.y(i, i2, cp2Var.size());
        return cp2Var.subList(cp2Var.size() - i2, cp2Var.size() - i).k();
    }

    @Override // defpackage.cp2, java.util.List
    public final int lastIndexOf(Object obj) {
        cp2 cp2Var = this.f;
        int iIndexOf = cp2Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (cp2Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
