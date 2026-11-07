package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class do0 extends yn0 implements Serializable {
    public final Object[] a;
    public final boolean b;

    public do0(Object[] objArr, boolean z) {
        this.a = objArr;
        this.b = z;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        return new eo(this.b ? 4 : 1, this.a);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!this.b) {
            obj.getClass();
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return -1;
            }
            if (ta.g(obj, objArr[i])) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!this.b) {
            obj.getClass();
        }
        Object[] objArr = this.a;
        for (int length = objArr.length - 1; length >= 0; length--) {
            if (ta.g(obj, objArr[length])) {
                return length;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        if (objArr.length < length) {
            return Arrays.copyOf(objArr2, length, objArr.getClass());
        }
        System.arraycopy(objArr2, 0, objArr, 0, length);
        if (objArr.length > length) {
            objArr[length] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.a;
        return Arrays.copyOf(objArr, objArr.length);
    }
}
