package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l11 implements Map, Serializable, KMutableMap {
    public static final h11 a0 = new h11(null);
    public static final l11 b0;
    public n11 W;
    public o11 X;
    public m11 Y;
    public boolean Z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int i;
    public int v;
    public int w;

    static {
        l11 l11Var = new l11(0);
        l11Var.Z = true;
        b0 = l11Var;
    }

    public l11(int i) {
        if (i < 0) {
            e.g("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        a0.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.i = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.Z) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        bp1 bp1Var = new bp1();
        bp1Var.a = this;
        return bp1Var;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iH = h(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iH];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 >= objArr.length) {
                        e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    objArr[i4] = obj;
                    this.c[i4] = iH;
                    iArr[iH] = i5;
                    this.w++;
                    this.v++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (Intrinsics.areEqual(this.a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    i(this.d.length * 2);
                    break;
                }
                iH = iH == 0 ? this.d.length - 1 : iH - 1;
            }
        }
    }

    public final void b() {
        if (this.Z) {
            uq1.k();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        r93.V(this.a, i3, i);
        if (objArr != null) {
            r93.V(objArr, i3, this.f);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        r93.V(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            r93.V(objArr, 0, this.f);
        }
        this.w = 0;
        this.f = 0;
        this.v++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean zAreEqual;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zAreEqual = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        zAreEqual = Intrinsics.areEqual(objArr[iF], entry.getValue());
                    }
                    if (!zAreEqual) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.w;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            x0 x0Var = b1.a;
            int length2 = objArr.length;
            x0Var.getClass();
            int iD = x0.d(length2, i5);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, iD);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, iD) : null;
            this.c = Arrays.copyOf(this.c, iD);
            a0.getClass();
            int iHighestOneBit = Integer.highestOneBit((iD >= 1 ? iD : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        m11 m11Var = this.Y;
        if (m11Var != null) {
            return m11Var;
        }
        m11 m11Var2 = new m11(this);
        this.Y = m11Var2;
        return m11Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.w == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iH];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.areEqual(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.d.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (Intrinsics.areEqual(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.i;
    }

    @Override // java.util.Map
    public final int hashCode() {
        i11 i11Var = new i11(this, 0);
        int i = 0;
        while (i11Var.hasNext()) {
            int i2 = i11Var.a;
            l11 l11Var = (l11) i11Var.d;
            if (i2 >= l11Var.f) {
                uq1.a();
                return 0;
            }
            i11Var.a = i2 + 1;
            i11Var.b = i2;
            Object obj = l11Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = l11Var.b;
            objArr.getClass();
            Object obj2 = objArr[i11Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            i11Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        int[] iArr;
        this.v++;
        int i2 = 0;
        if (this.f > this.w) {
            c(false);
        }
        this.d = new int[i];
        a0.getClass();
        this.i = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iH = h(this.a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iH] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    uq1.q("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iH = iH == 0 ? iArr.length - 1 : iH - 1;
            }
            iArr[iH] = i3;
            this.c[i2] = iH;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.w == 0;
    }

    public final void j(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.c[i];
        int i2 = this.e * 2;
        int length2 = this.d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.d.length - 1 : length - 1;
            i4++;
            int i6 = this.e;
            int[] iArr = this.d;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iH = h(this.a[i8]) - length;
                        int[] iArr2 = this.d;
                        if ((iH & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.c[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.c[i] = -1;
            this.w--;
            this.v++;
        } while (i3 >= 0);
        this.d[i5] = -1;
        this.c[i] = -1;
        this.w--;
        this.v++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        n11 n11Var = this.W;
        if (n11Var != null) {
            return n11Var;
        }
        n11 n11Var2 = new n11(this);
        this.W = n11Var2;
        return n11Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                e.g("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    e.g("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.w * 3) + 2);
        sb.append("{");
        int i = 0;
        i11 i11Var = new i11(this, 0);
        while (i11Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i11Var.a;
            l11 l11Var = (l11) i11Var.d;
            if (i2 >= l11Var.f) {
                uq1.a();
                return null;
            }
            i11Var.a = i2 + 1;
            i11Var.b = i2;
            Object obj = l11Var.a[i2];
            if (obj == l11Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = l11Var.b;
            objArr.getClass();
            Object obj2 = objArr[i11Var.b];
            if (obj2 == l11Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            i11Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        o11 o11Var = this.X;
        if (o11Var != null) {
            return o11Var;
        }
        o11 o11Var2 = new o11(this);
        this.X = o11Var2;
        return o11Var2;
    }

    public l11() {
        this(8);
    }
}
