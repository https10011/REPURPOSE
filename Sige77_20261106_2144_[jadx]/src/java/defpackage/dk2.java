package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dk2 extends AbstractMap {
    public static final rs f = new rs(15);
    public final Object[] a;
    public final int[] b;
    public final ck2 c;
    public Integer d;
    public String e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dk2, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dk2] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public dk2(dk2 dk2Var, dk2 dk2Var2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.c = new ck2(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = dk2Var2.size() + dk2Var.size();
        int i = dk2Var.b[dk2Var.size()] + dk2Var2.b[dk2Var2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = dk2Var.c(0);
        Map.Entry entryC2 = dk2Var2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        int i6 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new ck2(abstractMap, i6));
                        ck2 ck2Var = (ck2) entryC.getValue();
                        ck2 ck2Var2 = (ck2) entryC2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iB = ck2Var.b();
                            dk2 dk2Var3 = ck2Var.b;
                            if (i9 >= iB - ck2Var.a() && i10 >= ck2Var2.b() - ck2Var2.a()) {
                                break;
                            }
                            int iCompare = i9 == ck2Var.b() - ck2Var.a() ? 1 : i10 == ck2Var2.b() - ck2Var2.a() ? -1 : 0;
                            if (iCompare == 0) {
                                rs rsVar = ek2.b;
                                iCompare = ek2.b.compare(dk2Var3.a[ck2Var.a() + i9], ck2Var2.b.a[ck2Var2.a() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = dk2Var3.a[ck2Var.a() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = ck2Var2.b.a[ck2Var2.a() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i6] = iA;
                        entryC = dk2Var.c(i8);
                        entryC2 = dk2Var2.c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC, i6, iA, objArr2, iArr);
                entryC = dk2Var.c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = dk2Var2.c(i4);
            iA = iA2;
            entryC = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.a = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.b = b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        ck2 ck2Var = (ck2) entry.getValue();
        int iB = ck2Var.b() - ck2Var.a();
        System.arraycopy(ck2Var.b.a, ck2Var.a(), objArr, i2, iB);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new ck2(this, i));
        int i3 = i2 + iB;
        iArr[i + 1] = i3;
        return i3;
    }

    public final Map.Entry c(int i) {
        if (i < this.b[0]) {
            return (Map.Entry) this.a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.d == null) {
            this.d = Integer.valueOf(super.hashCode());
        }
        return this.d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.e == null) {
            this.e = super.toString();
        }
        return this.e;
    }

    public dk2() {
        List list = Collections.EMPTY_LIST;
        this.c = new ck2(this, -1);
        this.d = null;
        this.e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.b = iArr;
                return;
            }
            throw y00.i(it2);
        }
        throw y00.i(it);
    }
}
