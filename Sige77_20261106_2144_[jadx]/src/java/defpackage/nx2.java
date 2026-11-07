package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nx2 extends pw2 {
    public static final Object[] Y;
    public static final nx2 Z;
    public final transient int W;
    public final transient int X;
    public final transient Object[] i;
    public final transient int v;
    public final transient Object[] w;

    static {
        Object[] objArr = new Object[0];
        Y = objArr;
        Z = new nx2(0, 0, 0, objArr, objArr);
    }

    public nx2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(2);
        this.i = objArr;
        this.v = i;
        this.w = objArr2;
        this.W = i2;
        this.X = i3;
    }

    @Override // defpackage.uk2
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.X;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.uk2
    public final int c() {
        return this.X;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.w;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.W;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.uk2
    public final int e() {
        return 0;
    }

    @Override // defpackage.uk2
    public final bs0 g() {
        return m().listIterator(0);
    }

    @Override // defpackage.uk2
    public final Object[] h() {
        return this.i;
    }

    @Override // defpackage.pw2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // defpackage.pw2
    public final kw2 o() {
        return kw2.m(this.X, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.X;
    }
}
