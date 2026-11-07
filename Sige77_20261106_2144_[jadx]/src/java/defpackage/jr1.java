package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jr1 extends wo0 {
    public final transient Object d;

    public jr1(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.wo0, defpackage.wn0
    public final ro0 a() {
        no0 no0Var = ro0.b;
        Object[] objArr = {this.d};
        ga.e(1, objArr);
        return ro0.h(1, objArr);
    }

    @Override // defpackage.wn0
    public final int b(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // defpackage.wn0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.wn0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.wn0
    /* JADX INFO: renamed from: g */
    public final bs0 iterator() {
        return new as0(this.d);
    }

    @Override // defpackage.wo0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
