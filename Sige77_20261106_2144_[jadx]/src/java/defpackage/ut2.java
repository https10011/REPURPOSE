package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ut2 extends dp2 {
    public static final ut2 v = new ut2(0, new Object[0]);
    public final transient Object[] f;
    public final transient int i;

    public ut2(int i, Object[] objArr) {
        super(1);
        this.f = objArr;
        this.i = i;
    }

    @Override // defpackage.uk2
    public final int a() {
        return this.i;
    }

    @Override // defpackage.dp2, defpackage.uk2
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.uk2
    public final int c() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y21.y(i, this.i);
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
