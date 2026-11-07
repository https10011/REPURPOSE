package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ko0 extends yn0 {
    public final yn0 a;
    public final int b;
    public final int c;

    public ko0(yn0 yn0Var, int i, int i2) {
        this.a = yn0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(String.format("Index %d out-of-bounds for length %d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        yn0 yn0Var = this.a;
        if (!(yn0Var instanceof do0) || !((do0) yn0Var).b) {
            obj.getClass();
        }
        for (int i = 0; i < this.c; i++) {
            if (ta.g(obj, get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.yn0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new co0(this, this.c);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        yn0 yn0Var = this.a;
        if (!(yn0Var instanceof do0) || !((do0) yn0Var).b) {
            obj.getClass();
        }
        for (int i = this.c - 1; i >= 0; i--) {
            if (ta.g(obj, get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.yn0, java.util.List
    public final ListIterator listIterator(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.c)) {
            throw a(i);
        }
        return new co0(this, i2, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.yn0, java.util.List
    public final List subList(int i, int i2) {
        yn0.b(i, i2, this.c);
        return new ko0(this.a, this.b + i, i2 - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = get(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = get(i2);
        }
        return objArr;
    }
}
