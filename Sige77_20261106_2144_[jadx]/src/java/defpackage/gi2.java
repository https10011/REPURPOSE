package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gi2 extends fi2 {
    public static final gi2 e = new gi2(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public gi2(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.ci2
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.ci2
    public final int b() {
        return 0;
    }

    @Override // defpackage.ci2
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ci2
    public final boolean d() {
        return false;
    }

    @Override // defpackage.fi2, defpackage.ci2
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ia.s(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
