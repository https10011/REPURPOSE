package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lh1 extends uo0 {
    public static final lh1 i = new lh1(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public lh1(Object obj, Object[] objArr, int i2) {
        this.d = obj;
        this.e = objArr;
        this.f = i2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static lh1 b(int i2, Object[] objArr, q8 q8Var) {
        boolean z;
        int i3;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        so0 so0Var;
        boolean z4;
        int i5 = i2;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return i;
        }
        so0 so0Var2 = null;
        ?? r5 = 0;
        so0 so0Var3 = null;
        so0 so0Var4 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new lh1(null, objArrCopyOf, 1);
        }
        yv2.m(i5, objArrCopyOf.length >> 1);
        int iH = wo0.h(i5);
        char c3 = 2;
        if (i5 != 1) {
            int i7 = iH - 1;
            if (iH <= 128) {
                byte[] bArr = new byte[iH];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i8 * 2;
                    int i11 = i9 * 2;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i6];
                    Objects.requireNonNull(obj2);
                    int iF = d42.F(obj.hashCode());
                    while (true) {
                        int i12 = iF & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i11;
                            if (i9 < i8) {
                                objArrCopyOf[i11] = obj;
                                objArrCopyOf[i11 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            so0Var3 = new so0(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iF = i12 + 1;
                        z5 = z2;
                        i6 = i4;
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i9);
                    sArr[2] = so0Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i3 = 1;
                if (iH <= 32768) {
                    sArr = new short[iH];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i16 * 2;
                        int i18 = i15 * 2;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iF2 = d42.F(obj4.hashCode());
                        while (true) {
                            int i19 = iF2 & i7;
                            int i20 = sArr[i19] & 65535;
                            if (i20 == 65535) {
                                sArr[i19] = (short) i18;
                                if (i15 < i16) {
                                    objArrCopyOf[i18] = obj4;
                                    objArrCopyOf[i18 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                                int i21 = ~i20;
                                Object obj6 = objArrCopyOf[i21 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                so0Var4 = new so0(obj4, obj5, obj6);
                                objArrCopyOf[i21 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iF2 = i19 + 1;
                        }
                    }
                    if (i15 == i5) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i15), so0Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iH];
                    Arrays.fill(iArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i5) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iF3 = d42.F(obj7.hashCode());
                        while (true) {
                            int i26 = iF3 & i7;
                            int i27 = iArr[i26];
                            if (i27 == -1) {
                                iArr[i26] = i25;
                                if (i23 < i22) {
                                    objArrCopyOf[i25] = obj7;
                                    objArrCopyOf[i25 ^ 1] = obj8;
                                }
                                i23++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i27])) {
                                int i28 = i27 ^ 1;
                                Object obj9 = objArrCopyOf[i28];
                                Objects.requireNonNull(obj9);
                                so0Var2 = new so0(obj7, obj8, obj9);
                                objArrCopyOf[i28] = obj8;
                                break;
                            }
                            iF3 = i26 + 1;
                            c3 = c2;
                        }
                        i22++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i23 == i5) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i23);
                        objArr3[c] = so0Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                so0Var = (so0) objArr2[c];
                if (q8Var != null) {
                    throw so0Var.a();
                }
                q8Var.c = so0Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i5 = iIntValue;
            }
            return new lh1(r4, objArrCopyOf, i5);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i3 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            so0Var = (so0) objArr2[c];
            if (q8Var != null) {
                throw so0Var.a();
            }
            q8Var.c = so0Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i5 = iIntValue2;
        }
        return new lh1(r4, objArrCopyOf, i5);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.uo0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.e;
            if (this.f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iF = d42.F(obj.hashCode());
                    while (true) {
                        int i2 = iF & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iF = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iF2 = d42.F(obj.hashCode());
                    while (true) {
                        int i4 = iF2 & length2;
                        int i5 = sArr[i4] & 65535;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iF2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iF3 = d42.F(obj.hashCode());
                    while (true) {
                        int i6 = iF3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            obj2 = objArr[i7 ^ 1];
                        } else {
                            iF3 = i6 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
