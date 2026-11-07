package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lx2 extends kw2 {
    public static final lx2 v = new lx2(0, new Object[0]);
    public final transient Object[] f;
    public final transient int i;

    public lx2(int i, Object[] objArr) {
        super(2);
        this.f = objArr;
        this.i = i;
    }

    @Override // defpackage.kw2, defpackage.uk2
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.uk2
    public final int c() {
        return this.i;
    }

    @Override // defpackage.uk2
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qt.I(i, this.i);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.uk2
    public final Object[] h() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
