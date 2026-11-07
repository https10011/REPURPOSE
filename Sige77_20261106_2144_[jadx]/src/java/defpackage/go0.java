package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class go0 extends zn0 {
    public final Object[] a;
    public final int b;

    public go0(Object... objArr) {
        if ((objArr.length & 1) != 0) {
            throw new InternalError("length is odd");
        }
        this.b = objArr.length >> 1;
        this.a = new Object[((objArr.length * 2) + 1) & (-2)];
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            obj.getClass();
            Object obj2 = objArr[i + 1];
            obj2.getClass();
            int iA = a(obj);
            if (iA >= 0) {
                ur.g(obj, "duplicate key: ");
                throw null;
            }
            int i2 = -(iA + 1);
            Object[] objArr2 = this.a;
            objArr2[i2] = obj;
            objArr2[i2 + 1] = obj2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("not serial proxy");
    }

    private Object writeReplace() {
        Object[] objArr = new Object[this.b * 2];
        Object[] objArr2 = this.a;
        int length = objArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 2) {
            Object obj = objArr2[i2];
            if (obj != null) {
                int i3 = i + 1;
                objArr[i] = obj;
                i += 2;
                objArr[i3] = objArr2[i2 + 1];
            }
        }
        return new eo(3, objArr);
    }

    public final int a(Object obj) {
        int iHashCode = obj.hashCode();
        Object[] objArr = this.a;
        int length = objArr.length >> 1;
        boolean z = lo0.b;
        int i = iHashCode % length;
        if ((iHashCode ^ length) < 0 && i != 0) {
            i += length;
        }
        int i2 = i << 1;
        while (true) {
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return (-i2) - 1;
            }
            if (obj.equals(obj2)) {
                return i2;
            }
            i2 += 2;
            if (i2 == objArr.length) {
                i2 = 0;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        obj.getClass();
        return this.b > 0 && a(obj) >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        int i = 1;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            Object obj2 = objArr[i];
            if (obj2 != null && obj.equals(obj2)) {
                return true;
            }
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new hb(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.b == 0) {
            obj.getClass();
            return null;
        }
        int iA = a(obj);
        if (iA < 0) {
            return null;
        }
        return this.a[iA + 1];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return iHashCode;
            }
            Object obj = objArr[i];
            if (obj != null) {
                iHashCode += objArr[i + 1].hashCode() ^ obj.hashCode();
            }
            i += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b;
    }
}
