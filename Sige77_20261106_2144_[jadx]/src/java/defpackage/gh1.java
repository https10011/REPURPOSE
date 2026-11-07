package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gh1 extends ro0 {
    public static final gh1 e = new gh1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public gh1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.ro0, defpackage.wn0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wn0
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.wn0
    public final int d() {
        return this.d;
    }

    @Override // defpackage.wn0
    public final int e() {
        return 0;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yv2.j(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
