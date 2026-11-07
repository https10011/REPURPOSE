package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mh1 extends wo0 {
    public static final mh1 W;
    public static final Object[] w;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int i;
    public final transient int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        W = new mh1(0, 0, 0, objArr, objArr);
    }

    public mh1(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.i = i2;
        this.v = i3;
    }

    @Override // defpackage.wn0
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i = this.v;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wn0
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iF = d42.F(obj.hashCode());
                while (true) {
                    int i = iF & this.i;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iF = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wn0
    public final int d() {
        return this.v;
    }

    @Override // defpackage.wn0
    public final int e() {
        return 0;
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.wo0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.wo0
    public final ro0 k() {
        return ro0.h(this.v, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }
}
