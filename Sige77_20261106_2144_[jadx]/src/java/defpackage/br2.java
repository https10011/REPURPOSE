package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class br2 extends cp2 {
    public static final br2 v = new br2(0, new Object[0]);
    public final transient Object[] f;
    public final transient int i;

    public br2(int i, Object[] objArr) {
        super(0);
        this.f = objArr;
        this.i = i;
    }

    @Override // defpackage.uk2
    public final Object[] d() {
        return this.f;
    }

    @Override // defpackage.uk2
    public final int e() {
        return 0;
    }

    @Override // defpackage.uk2
    public final int f() {
        return this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yi0.v(i, this.i);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.cp2, defpackage.uk2
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
