package defpackage;

import com.appsflyer.internal.d;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vs2 implements ct2 {
    public static final int[] j = new int[0];
    public static final Unsafe k = nt2.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final yq2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public vs2(int[] iArr, Object[] objArr, int i, int i2, yq2 yq2Var, int[] iArr2, int i3, int i4, r41 r41Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = yq2Var instanceof cs2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = yq2Var;
    }

    public static long D(Object obj, long j2) {
        return ((Long) nt2.m(obj, j2)).longValue();
    }

    public static void H(Object obj) {
        if (I(obj)) {
            return;
        }
        e.g("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof cs2) {
            return ((cs2) obj).s();
        }
        return true;
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbB = d.b("Field ", str, " for ", name, " not found. Known fields are ");
            sbB.append(string);
            throw new RuntimeException(sbB.toString(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0256  */
    /* JADX WARN: Code duplicated, block: B:127:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x0331  */
    /* JADX WARN: Code duplicated, block: B:181:0x0385  */
    public static vs2 o(bt2 bt2Var, r41 r41Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        Field fieldN;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldN2;
        int i26;
        Object obj2;
        Field fieldN3;
        int i27;
        char cCharAt9;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        if (!(bt2Var instanceof bt2)) {
            ur.a();
            return null;
        }
        String str = bt2Var.b;
        int length = str.length();
        int i31 = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i30 = i33 + 1;
                cCharAt12 = str.charAt(i33);
                if (cCharAt12 < 55296) {
                    break;
                }
                i34 |= (cCharAt12 & 8191) << i35;
                i35 += 13;
                i33 = i30;
            }
            iCharAt2 = i34 | (cCharAt12 << i35);
            i33 = i30;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i8 = 0;
            iArr = j;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = str.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt7 = str.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt7 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt6 = str.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt6 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt5 = str.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt5 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt4 = str.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt4 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt3 = str.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt3 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt2 = str.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt2 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            if (str.charAt(i51) >= 55296) {
                while (true) {
                    i9 = i54 + 1;
                    if (str.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i9;
                }
                i54 = i9;
            }
            int i55 = i54 + 1;
            int iCharAt8 = str.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i2 = i55 + 1;
                    cCharAt = str.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i2;
                }
                iCharAt8 = i56 | (cCharAt << i57);
            } else {
                i2 = i55;
            }
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i58 = (iCharAt3 << 1) + iCharAt4;
            int i59 = iCharAt7;
            i3 = iCharAt5;
            i4 = i59;
            i5 = iCharAt6;
            i6 = i58;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i2;
            i8 = iCharAt8;
        }
        Unsafe unsafe = k;
        Object[] objArr = bt2Var.c;
        Class<?> cls = bt2Var.a.getClass();
        int i60 = 1;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt << 1];
        int i61 = i8 + i4;
        int i62 = i61;
        int i63 = i8;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int iCharAt9 = str.charAt(i33);
            if (iCharAt9 >= i31) {
                int i67 = iCharAt9 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt11 = str.charAt(i68);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt11 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                    length = i16;
                }
                iCharAt9 = i67 | (cCharAt11 << i69);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i66;
            }
            int i70 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i71 = iCharAt10 & 8191;
                int i72 = 13;
                while (true) {
                    i28 = i70 + 1;
                    cCharAt10 = str.charAt(i70);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i71 |= (cCharAt10 & 8191) << i72;
                    i72 += 13;
                    i70 = i28;
                    c = 55296;
                }
                iCharAt10 = i71 | (cCharAt10 << i72);
                i70 = i28;
            }
            int i73 = iCharAt10 & 255;
            int i74 = iCharAt9;
            if ((iCharAt10 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i73 >= 51) {
                int i75 = i70 + 1;
                int iCharAt11 = str.charAt(i70);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i76 = iCharAt11 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        cCharAt9 = str.charAt(i75);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i76 |= (cCharAt9 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    iCharAt11 = i76 | (cCharAt9 << i77);
                    i75 = i27;
                }
                int i78 = i73 - 51;
                i20 = i75;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i60;
                    i24 = i6 + 1;
                    objArr2[((i64 / 3) << i79) + i79] = objArr3[i6];
                } else {
                    if (i78 == 12) {
                        int i80 = i60;
                        if (ts.b(bt2Var.a(), i80) || (iCharAt10 & 2048) != 0) {
                            i24 = i6 + 1;
                            objArr2[((i64 / 3) << i80) + i80] = objArr3[i6];
                        }
                    }
                    i25 = iCharAt11 << 1;
                    obj = objArr3[i25];
                    if (obj instanceof Field) {
                        fieldN2 = (Field) obj;
                    } else {
                        fieldN2 = n(cls, (String) obj);
                        objArr3[i25] = fieldN2;
                        iArr[i62] = i64;
                        i62++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                    i26 = i25 + 1;
                    obj2 = objArr3[i26];
                    if (obj2 instanceof Field) {
                        fieldN3 = (Field) obj2;
                    } else {
                        fieldN3 = n(cls, (String) obj2);
                        objArr3[i26] = fieldN3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                    i60 = 1;
                    i18 = i7;
                }
                i6 = i24;
                i25 = iCharAt11 << 1;
                obj = objArr3[i25];
                if (obj instanceof Field) {
                    fieldN2 = (Field) obj;
                } else {
                    fieldN2 = n(cls, (String) obj);
                    objArr3[i25] = fieldN2;
                    iArr[i62] = i64;
                    i62++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN2);
                i26 = i25 + 1;
                obj2 = objArr3[i26];
                if (obj2 instanceof Field) {
                    fieldN3 = (Field) obj2;
                } else {
                    fieldN3 = n(cls, (String) obj2);
                    objArr3[i26] = fieldN3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
                i60 = 1;
                i18 = i7;
            } else {
                int i81 = i6 + 1;
                Field fieldN4 = n(cls, (String) objArr3[i6]);
                if (i73 == 9 || i73 == 17) {
                    i18 = i7;
                    objArr2[((i64 / 3) << 1) + 1] = fieldN4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i18 = i7;
                        i23 = i6 + 2;
                        objArr2[((i64 / 3) << 1) + 1] = objArr3[i81];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        i18 = i7;
                        if (bt2Var.a() == 1 || (iCharAt10 & 2048) != 0) {
                            i23 = i6 + 2;
                            objArr2[((i64 / 3) << 1) + 1] = objArr3[i81];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((iCharAt10 & 4096) != 0 || i73 > 17) {
                            i60 = 1;
                            iObjectFieldOffset2 = 1048575;
                            i20 = i70;
                            i6 = i19;
                            i21 = 0;
                        } else {
                            int i82 = i70 + 1;
                            int iCharAt12 = str.charAt(i70);
                            if (iCharAt12 >= 55296) {
                                int i83 = iCharAt12 & 8191;
                                int i84 = 13;
                                while (true) {
                                    i22 = i82 + 1;
                                    cCharAt8 = str.charAt(i82);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i83 |= (cCharAt8 & 8191) << i84;
                                    i84 += 13;
                                    i82 = i22;
                                }
                                iCharAt12 = i83 | (cCharAt8 << i84);
                                i82 = i22;
                            }
                            i60 = 1;
                            int i85 = (iCharAt12 / 32) + (i18 << 1);
                            Object obj3 = objArr3[i85];
                            if (obj3 instanceof Field) {
                                fieldN = (Field) obj3;
                            } else {
                                fieldN = n(cls, (String) obj3);
                                objArr3[i85] = fieldN;
                            }
                            int i86 = i82;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                            i21 = iCharAt12 % 32;
                            i6 = i19;
                            i20 = i86;
                        }
                    } else {
                        if (i73 == 50) {
                            int i87 = i63 + 1;
                            iArr[i63] = i64;
                            int i88 = (i64 / 3) << 1;
                            int i89 = i6 + 2;
                            objArr2[i88] = objArr3[i81];
                            if ((iCharAt10 & 2048) != 0) {
                                objArr2[i88 + 1] = objArr3[i89];
                                i18 = i7;
                                i63 = i87;
                                i19 = i6 + 3;
                            } else {
                                i18 = i7;
                                i19 = i89;
                                i63 = i87;
                            }
                        } else {
                            i18 = i7;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((iCharAt10 & 4096) != 0) {
                            i60 = 1;
                            iObjectFieldOffset2 = 1048575;
                            i20 = i70;
                            i6 = i19;
                            i21 = 0;
                        } else {
                            i60 = 1;
                            iObjectFieldOffset2 = 1048575;
                            i20 = i70;
                            i6 = i19;
                            i21 = 0;
                        }
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                    if ((iCharAt10 & 4096) != 0) {
                        i60 = 1;
                        iObjectFieldOffset2 = 1048575;
                        i20 = i70;
                        i6 = i19;
                        i21 = 0;
                    } else {
                        i60 = 1;
                        iObjectFieldOffset2 = 1048575;
                        i20 = i70;
                        i6 = i19;
                        i21 = 0;
                    }
                }
                i19 = i81;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                if ((iCharAt10 & 4096) != 0) {
                    i60 = 1;
                    iObjectFieldOffset2 = 1048575;
                    i20 = i70;
                    i6 = i19;
                    i21 = 0;
                } else {
                    i60 = 1;
                    iObjectFieldOffset2 = 1048575;
                    i20 = i70;
                    i6 = i19;
                    i21 = 0;
                }
            }
            int i90 = i64 + 1;
            iArr4[i64] = i74;
            int i91 = i64 + 2;
            iArr4[i90] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | ((iCharAt10 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | iObjectFieldOffset;
            i64 += 3;
            iArr4[i91] = (i21 << 20) | iObjectFieldOffset2;
            objArr = objArr3;
            length = i16;
            i7 = i18;
            iArr3 = iArr4;
            str = str;
            i33 = i20;
            i31 = 55296;
        }
        return new vs2(iArr3, objArr2, i3, i5, bt2Var.a, iArr, i8, i61, r41Var);
    }

    public static int z(Object obj, long j2) {
        return ((Integer) nt2.m(obj, j2)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0110 A[RETURN] */
    public final boolean A(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & nt2.c.j(obj, j2)) != 0) {
                return true;
            }
            return false;
        }
        int iY = y(i);
        long j3 = iY & 1048575;
        switch ((iY & 267386880) >>> 20) {
            case 0:
                if (Double.doubleToRawLongBits(nt2.c.a(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(nt2.c.h(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (nt2.c.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (nt2.c.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (nt2.c.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return nt2.c.i(obj, j3);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Object objM = nt2.m(obj, j3);
                if (objM instanceof String) {
                    if (((String) objM).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objM instanceof jr2)) {
                    sm0.a();
                    return false;
                }
                if (jr2.b.equals(objM)) {
                    return false;
                }
                return true;
            case 9:
                if (nt2.m(obj, j3) != null) {
                    return true;
                }
                return false;
            case 10:
                if (jr2.b.equals(nt2.m(obj, j3))) {
                    return false;
                }
                return true;
            case 11:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (nt2.c.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (nt2.c.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (nt2.c.k(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (nt2.m(obj, j3) != null) {
                    return true;
                }
                return false;
            default:
                sm0.a();
                return false;
        }
    }

    public final boolean B(Object obj, int i, int i2) {
        return nt2.c.j(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean C(cs2 cs2Var, cs2 cs2Var2, int i) {
        return A(i, cs2Var) == A(i, cs2Var2);
    }

    public final void E(int i) {
        if (this.b[((i / 3) << 1) + 1] == null) {
            return;
        }
        ur.a();
    }

    public final ct2 F(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.b;
        ct2 ct2Var = (ct2) objArr[i2];
        if (ct2Var != null) {
            return ct2Var;
        }
        ct2 ct2VarA = at2.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = ct2VarA;
        return ct2VarA;
    }

    public final Object G(int i) {
        return this.b[(i / 3) << 1];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    @Override // defpackage.ct2
    public final boolean a(cs2 cs2Var, cs2 cs2Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iY = y(i);
                int i2 = (267386880 & iY) >>> 20;
                if (i2 <= 50 || i2 >= 69) {
                    long j2 = iY & 1048575;
                    switch (i2) {
                        case 0:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var = nt2.c;
                                if (Double.doubleToLongBits(mt2Var.a(cs2Var, j2)) != Double.doubleToLongBits(mt2Var.a(cs2Var2, j2))) {
                                    zX = false;
                                }
                            }
                            break;
                        case 1:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var2 = nt2.c;
                                if (Float.floatToIntBits(mt2Var2.h(cs2Var, j2)) != Float.floatToIntBits(mt2Var2.h(cs2Var2, j2))) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var3 = nt2.c;
                                if (mt2Var3.k(cs2Var, j2) != mt2Var3.k(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var4 = nt2.c;
                                if (mt2Var4.k(cs2Var, j2) != mt2Var4.k(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var5 = nt2.c;
                                if (mt2Var5.j(cs2Var, j2) != mt2Var5.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var6 = nt2.c;
                                if (mt2Var6.k(cs2Var, j2) != mt2Var6.k(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var7 = nt2.c;
                                if (mt2Var7.j(cs2Var, j2) != mt2Var7.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var8 = nt2.c;
                                if (mt2Var8.i(cs2Var, j2) != mt2Var8.i(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            if (!C(cs2Var, cs2Var2, i) || !x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2))) {
                                zX = false;
                            }
                            break;
                        case 9:
                            if (!C(cs2Var, cs2Var2, i) || !x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2))) {
                                zX = false;
                            }
                            break;
                        case 10:
                            if (!C(cs2Var, cs2Var2, i) || !x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2))) {
                                zX = false;
                            }
                            break;
                        case 11:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var9 = nt2.c;
                                if (mt2Var9.j(cs2Var, j2) != mt2Var9.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 12:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var10 = nt2.c;
                                if (mt2Var10.j(cs2Var, j2) != mt2Var10.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 13:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var11 = nt2.c;
                                if (mt2Var11.j(cs2Var, j2) != mt2Var11.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 14:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var12 = nt2.c;
                                if (mt2Var12.k(cs2Var, j2) != mt2Var12.k(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 15:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var13 = nt2.c;
                                if (mt2Var13.j(cs2Var, j2) != mt2Var13.j(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 16:
                            if (!C(cs2Var, cs2Var2, i)) {
                                zX = false;
                            } else {
                                mt2 mt2Var14 = nt2.c;
                                if (mt2Var14.k(cs2Var, j2) != mt2Var14.k(cs2Var2, j2)) {
                                    zX = false;
                                }
                            }
                            break;
                        case 17:
                            if (!C(cs2Var, cs2Var2, i) || !x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2))) {
                                zX = false;
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            zX = x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2));
                            break;
                        case 50:
                            zX = x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j3 = 1048575 & iArr[i + 2];
                            mt2 mt2Var15 = nt2.c;
                            if (mt2Var15.j(cs2Var, j3) != mt2Var15.j(cs2Var2, j3) || !x91.X(nt2.m(cs2Var, j2), nt2.m(cs2Var2, j2))) {
                                zX = false;
                            }
                            break;
                    }
                    if (!zX) {
                    }
                }
                i += 3;
            } else {
                int i3 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        mt2 mt2Var16 = nt2.c;
                        if (mt2Var16.j(cs2Var, j4) != mt2Var16.j(cs2Var2, j4)) {
                            return false;
                        }
                        if (!B(cs2Var, 0, i4)) {
                            long jY = y(i4) & 1048575;
                            if (!x91.X(nt2.m(cs2Var, jY), nt2.m(cs2Var2, jY))) {
                            }
                        }
                        i3++;
                    } else if (cs2Var.zzb.equals(cs2Var2.zzb)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ct2
    public final boolean b(Object obj) {
        int i;
        int i2;
        vs2 vs2Var;
        Object obj2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int iY = this.y(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = k.getInt(obj, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & iY) != 0) {
                vs2Var = this;
                obj2 = obj;
                if (!vs2Var.t(obj2, i6, i, i2, i9)) {
                }
                return false;
            }
            vs2Var = this;
            obj2 = obj;
            int i10 = (267386880 & iY) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (vs2Var.t(obj2, i6, i, i2, i9) && !vs2Var.F(i6).b(nt2.m(obj2, iY & 1048575))) {
                    return false;
                }
                i4++;
                this = vs2Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            } else {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (vs2Var.B(obj2, iArr[i6], i6) && !vs2Var.F(i6).b(nt2.m(obj2, iY & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !((qs2) nt2.m(obj2, iY & 1048575)).isEmpty()) {
                            if (vs2Var.G(i6) == null) {
                                throw new NoSuchMethodError();
                            }
                            ur.a();
                            return false;
                        }
                    }
                    i4++;
                    this = vs2Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                }
                List list = (List) nt2.m(obj2, iY & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ct2 ct2VarF = vs2Var.F(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!ct2VarF.b(list.get(i11))) {
                            return false;
                        }
                    }
                }
                i4++;
                this = vs2Var;
                obj = obj2;
                i3 = i;
                i5 = i2;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x05d0 A[LOOP:5: B:134:0x05ce->B:135:0x05d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x05da  */
    @Override // defpackage.ct2
    public final void c(Object obj, we weVar, wr2 wr2Var) {
        int[] iArr = this.g;
        int i = this.i;
        int i2 = this.h;
        byte[] bArr = ds2.a;
        wr2Var.getClass();
        H(obj);
        jt2 jt2VarQ = null;
        while (true) {
            try {
                int iK0 = weVar.k0();
                int iJ = (iK0 < this.c || iK0 > this.d) ? -1 : j(iK0, 0);
                if (iJ >= 0) {
                    int iY = y(iJ);
                    boolean z = true;
                    switch ((267386880 & iY) >>> 20) {
                        case 0:
                            weVar.h0(1);
                            nt2.c.c(obj, iY & 1048575, ((sn) weVar.d).z());
                            v(iJ, obj);
                            continue;
                        case 1:
                            weVar.h0(5);
                            nt2.c.d(obj, iY & 1048575, ((sn) weVar.d).G());
                            v(iJ, obj);
                            continue;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            weVar.h0(0);
                            nt2.c(obj, iY & 1048575, ((sn) weVar.d).U());
                            v(iJ, obj);
                            continue;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            weVar.h0(0);
                            nt2.c(obj, iY & 1048575, ((sn) weVar.d).X());
                            v(iJ, obj);
                            continue;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            weVar.h0(0);
                            nt2.b(obj, iY & 1048575, ((sn) weVar.d).O());
                            v(iJ, obj);
                            continue;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            weVar.h0(1);
                            nt2.c(obj, iY & 1048575, ((sn) weVar.d).T());
                            v(iJ, obj);
                            continue;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            weVar.h0(5);
                            nt2.b(obj, iY & 1048575, ((sn) weVar.d).N());
                            v(iJ, obj);
                            continue;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            weVar.h0(0);
                            nt2.c.g(obj, iY & 1048575, ((sn) weVar.d).c0());
                            v(iJ, obj);
                            continue;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            p(iY, weVar, obj);
                            v(iJ, obj);
                            continue;
                        case 9:
                            Object obj2 = (yq2) l(iJ, obj);
                            ct2 ct2VarF = F(iJ);
                            weVar.h0(2);
                            weVar.p0(obj2, ct2VarF, wr2Var);
                            u(iJ, obj, obj2);
                            continue;
                        case 10:
                            nt2.d(obj, iY & 1048575, weVar.C0());
                            v(iJ, obj);
                            continue;
                        case 11:
                            weVar.h0(0);
                            nt2.b(obj, iY & 1048575, ((sn) weVar.d).S());
                            v(iJ, obj);
                            continue;
                        case 12:
                            weVar.h0(0);
                            int iL = ((sn) weVar.d).L();
                            E(iJ);
                            nt2.b(obj, iY & 1048575, iL);
                            v(iJ, obj);
                            continue;
                        case 13:
                            weVar.h0(5);
                            nt2.b(obj, iY & 1048575, ((sn) weVar.d).P());
                            v(iJ, obj);
                            continue;
                        case 14:
                            weVar.h0(1);
                            nt2.c(obj, iY & 1048575, ((sn) weVar.d).V());
                            v(iJ, obj);
                            continue;
                        case 15:
                            weVar.h0(0);
                            nt2.b(obj, iY & 1048575, ((sn) weVar.d).Q());
                            v(iJ, obj);
                            continue;
                        case 16:
                            weVar.h0(0);
                            nt2.c(obj, iY & 1048575, ((sn) weVar.d).W());
                            v(iJ, obj);
                            continue;
                        case 17:
                            Object obj3 = (yq2) l(iJ, obj);
                            ct2 ct2VarF2 = F(iJ);
                            weVar.h0(3);
                            weVar.m0(obj3, ct2VarF2, wr2Var);
                            u(iJ, obj, obj3);
                            continue;
                        case 18:
                            weVar.n0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 19:
                            weVar.t0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 20:
                            weVar.v0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 21:
                            weVar.F0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 22:
                            weVar.u0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 23:
                            weVar.s0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 24:
                            weVar.r0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 25:
                            weVar.d0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 26:
                            if ((536870912 & iY) == 0) {
                                z = false;
                            }
                            if (!z) {
                                weVar.A0(yv2.Y(obj, iY & 1048575));
                                continue;
                            } else {
                                weVar.B0(yv2.Y(obj, iY & 1048575));
                            }
                            break;
                        case 27:
                            weVar.j0(yv2.Y(obj, iY & 1048575), F(iJ), wr2Var);
                            continue;
                        case 28:
                            weVar.i0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 29:
                            weVar.D0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 30:
                            weVar.q0(yv2.Y(obj, iY & 1048575));
                            E(iJ);
                            continue;
                        case 31:
                            weVar.w0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 32:
                            weVar.x0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 33:
                            weVar.y0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 34:
                            weVar.z0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 35:
                            weVar.n0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 36:
                            weVar.t0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 37:
                            weVar.v0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 38:
                            weVar.F0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 39:
                            weVar.u0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 40:
                            weVar.s0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 41:
                            weVar.r0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 42:
                            weVar.d0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 43:
                            weVar.D0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 44:
                            weVar.q0(yv2.Y(obj, iY & 1048575));
                            E(iJ);
                            continue;
                        case 45:
                            weVar.w0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 46:
                            weVar.x0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 47:
                            weVar.y0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 48:
                            weVar.z0(yv2.Y(obj, iY & 1048575));
                            continue;
                        case 49:
                            weVar.e0(yv2.Y(obj, iY & 1048575), F(iJ), wr2Var);
                            continue;
                        case 50:
                            Object objG = G(iJ);
                            long jY = y(iJ) & 1048575;
                            Object objM = nt2.m(obj, jY);
                            if (objM == null) {
                                objM = qs2.b.d();
                                nt2.d(obj, jY, objM);
                            } else if (!((qs2) objM).a) {
                                qs2 qs2VarD = qs2.b.d();
                                g93.K(qs2VarD, objM);
                                nt2.d(obj, jY, qs2VarD);
                                objM = qs2VarD;
                            }
                            g93.R(objM);
                            if (objG != null) {
                                throw new ClassCastException();
                            }
                            throw new NoSuchMethodError();
                        case 51:
                            weVar.h0(1);
                            nt2.d(obj, iY & 1048575, Double.valueOf(((sn) weVar.d).z()));
                            x(obj, iK0, iJ);
                            continue;
                        case 52:
                            weVar.h0(5);
                            nt2.d(obj, iY & 1048575, Float.valueOf(((sn) weVar.d).G()));
                            x(obj, iK0, iJ);
                            continue;
                        case 53:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Long.valueOf(((sn) weVar.d).U()));
                            x(obj, iK0, iJ);
                            continue;
                        case 54:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Long.valueOf(((sn) weVar.d).X()));
                            x(obj, iK0, iJ);
                            continue;
                        case 55:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(((sn) weVar.d).O()));
                            x(obj, iK0, iJ);
                            continue;
                        case 56:
                            weVar.h0(1);
                            nt2.d(obj, iY & 1048575, Long.valueOf(((sn) weVar.d).T()));
                            x(obj, iK0, iJ);
                            continue;
                        case 57:
                            weVar.h0(5);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(((sn) weVar.d).N()));
                            x(obj, iK0, iJ);
                            continue;
                        case 58:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Boolean.valueOf(((sn) weVar.d).c0()));
                            x(obj, iK0, iJ);
                            continue;
                        case 59:
                            p(iY, weVar, obj);
                            x(obj, iK0, iJ);
                            continue;
                        case 60:
                            Object obj4 = (yq2) m(obj, iK0, iJ);
                            ct2 ct2VarF3 = F(iJ);
                            weVar.h0(2);
                            weVar.p0(obj4, ct2VarF3, wr2Var);
                            q(obj, iK0, iJ, obj4);
                            continue;
                        case 61:
                            nt2.d(obj, iY & 1048575, weVar.C0());
                            x(obj, iK0, iJ);
                            continue;
                        case 62:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(((sn) weVar.d).S()));
                            x(obj, iK0, iJ);
                            continue;
                        case 63:
                            weVar.h0(0);
                            int iL2 = ((sn) weVar.d).L();
                            E(iJ);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(iL2));
                            x(obj, iK0, iJ);
                            continue;
                        case 64:
                            weVar.h0(5);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(((sn) weVar.d).P()));
                            x(obj, iK0, iJ);
                            continue;
                        case 65:
                            weVar.h0(1);
                            nt2.d(obj, iY & 1048575, Long.valueOf(((sn) weVar.d).V()));
                            x(obj, iK0, iJ);
                            continue;
                        case 66:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Integer.valueOf(((sn) weVar.d).Q()));
                            x(obj, iK0, iJ);
                            continue;
                        case 67:
                            weVar.h0(0);
                            nt2.d(obj, iY & 1048575, Long.valueOf(((sn) weVar.d).W()));
                            x(obj, iK0, iJ);
                            continue;
                        case 68:
                            Object obj5 = (yq2) m(obj, iK0, iJ);
                            ct2 ct2VarF4 = F(iJ);
                            weVar.h0(3);
                            weVar.m0(obj5, ct2VarF4, wr2Var);
                            q(obj, iK0, iJ, obj5);
                            continue;
                        default:
                            if (jt2VarQ == null) {
                                try {
                                    jt2VarQ = mo1.q(obj);
                                } catch (ms2 unused) {
                                    if (jt2VarQ == null) {
                                        jt2VarQ = mo1.q(obj);
                                    }
                                    if (!mo1.p(0, weVar, jt2VarQ)) {
                                        while (i2 < i) {
                                            r(obj, iArr[i2], jt2VarQ);
                                            i2++;
                                        }
                                        if (jt2VarQ != null) {
                                            ((cs2) obj).zzb = jt2VarQ;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!mo1.p(0, weVar, jt2VarQ)) {
                                while (i2 < i) {
                                    r(obj, iArr[i2], jt2VarQ);
                                    i2++;
                                }
                                if (jt2VarQ != null) {
                                    ((cs2) obj).zzb = jt2VarQ;
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                    while (i2 < i) {
                        r(obj, iArr[i2], jt2VarQ);
                        i2++;
                    }
                    if (jt2VarQ != null) {
                        ((cs2) obj).zzb = jt2VarQ;
                    }
                    throw th;
                }
                if (iK0 == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        r(obj, iArr[i2], jt2VarQ);
                        i2++;
                    }
                    if (jt2VarQ != null) {
                        ((cs2) obj).zzb = jt2VarQ;
                        return;
                    }
                    return;
                }
                if (jt2VarQ == null) {
                    jt2VarQ = mo1.q(obj);
                }
                if (!mo1.p(0, weVar, jt2VarQ)) {
                    while (i2 < i) {
                        r(obj, iArr[i2], jt2VarQ);
                        i2++;
                    }
                    if (jt2VarQ != null) {
                        ((cs2) obj).zzb = jt2VarQ;
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                while (i2 < i) {
                    r(obj, iArr[i2], jt2VarQ);
                    i2++;
                }
                if (jt2VarQ != null) {
                    ((cs2) obj).zzb = jt2VarQ;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct2
    public final void d(Object obj, pv2 pv2Var) {
        char c;
        int i;
        boolean z;
        vs2 vs2Var = this;
        tr2 tr2Var = (tr2) pv2Var.a;
        int[] iArr = vs2Var.a;
        int length = iArr.length;
        Unsafe unsafe = k;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iY = vs2Var.y(i4);
            int i6 = iArr[i4];
            int i7 = (267386880 & iY) >>> 20;
            if (i7 <= 17) {
                int i8 = iArr[i4 + 2];
                c = 1;
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            long j2 = iY & i2;
            switch (i7) {
                case 0:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        double dA = nt2.c.a(obj, j2);
                        tr2Var.getClass();
                        tr2Var.d(i6, Double.doubleToRawLongBits(dA));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 1:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        float fH = nt2.c.h(obj, j2);
                        tr2Var.getClass();
                        tr2Var.c(i6, Float.floatToRawIntBits(fH));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.l(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.l(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.k(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.d(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.c(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.g(i6, nt2.c.i(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            tr2Var.e(i6, (String) object);
                        } else {
                            tr2Var.f(i6, (jr2) object);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 9:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        pv2Var.x(i6, unsafe.getObject(obj, j2), vs2Var.F(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 10:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.f(i6, (jr2) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 11:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.q(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 12:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.k(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 13:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.c(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 14:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        tr2Var.d(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 15:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j2);
                        tr2Var.q(i6, (i10 >> 31) ^ (i10 << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 16:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        tr2Var.l(i6, (j3 >> 63) ^ (j3 << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 17:
                    if (vs2Var.t(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        tr2Var.p(i6, 3);
                        vs2Var.F(i4).d((yq2) object2, pv2Var);
                        tr2Var.p(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 18:
                    x91.a0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 19:
                    x91.h0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 20:
                    x91.l0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 21:
                    x91.t0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 22:
                    x91.j0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 23:
                    x91.f0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 24:
                    x91.d0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 25:
                    x91.V(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 26:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof ns2) {
                            ns2 ns2Var = (ns2) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objZza = ns2Var.zza();
                                if (objZza instanceof String) {
                                    tr2Var.e(i11, (String) objZza);
                                } else {
                                    tr2Var.f(i11, (jr2) objZza);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                tr2Var.e(i11, (String) list.get(i13));
                            }
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 27:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    ct2 ct2VarF = vs2Var.F(i4);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            pv2Var.x(i14, list2.get(i15), ct2VarF);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 28:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            tr2Var.f(i16, (jr2) list3.get(i17));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 29:
                    z = false;
                    x91.s0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 30:
                    z = false;
                    x91.c0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 31:
                    z = false;
                    x91.n0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 32:
                    z = false;
                    x91.p0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 33:
                    z = false;
                    x91.q0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 34:
                    z = false;
                    x91.r0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 35:
                    x91.a0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 36:
                    x91.h0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 37:
                    x91.l0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 38:
                    x91.t0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 39:
                    x91.j0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 40:
                    x91.f0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 41:
                    x91.d0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 42:
                    x91.V(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 43:
                    x91.s0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 44:
                    x91.c0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 45:
                    x91.n0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 46:
                    x91.p0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 47:
                    x91.q0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 48:
                    x91.r0(iArr[i4], (List) unsafe.getObject(obj, j2), pv2Var, c);
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 49:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    ct2 ct2VarF2 = vs2Var.F(i4);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            yq2 yq2Var = (yq2) list4.get(i19);
                            tr2Var.p(i18, 3);
                            ct2VarF2.d(yq2Var, pv2Var);
                            tr2Var.p(i18, 4);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        if (vs2Var.G(i4) == null) {
                            throw new NoSuchMethodError();
                        }
                        ur.a();
                        return;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 51:
                    if (vs2Var.B(obj, i6, i4)) {
                        double dDoubleValue = ((Double) nt2.m(obj, j2)).doubleValue();
                        tr2Var.getClass();
                        tr2Var.d(i6, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 52:
                    if (vs2Var.B(obj, i6, i4)) {
                        float fFloatValue = ((Float) nt2.m(obj, j2)).floatValue();
                        tr2Var.getClass();
                        tr2Var.c(i6, Float.floatToRawIntBits(fFloatValue));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 53:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.l(i6, D(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 54:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.l(i6, D(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 55:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.k(i6, z(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 56:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.d(i6, D(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 57:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.c(i6, z(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 58:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.g(i6, ((Boolean) nt2.m(obj, j2)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 59:
                    if (vs2Var.B(obj, i6, i4)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            tr2Var.e(i6, (String) object3);
                        } else {
                            tr2Var.f(i6, (jr2) object3);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 60:
                    if (vs2Var.B(obj, i6, i4)) {
                        pv2Var.x(i6, unsafe.getObject(obj, j2), vs2Var.F(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 61:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.f(i6, (jr2) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 62:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.q(i6, z(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 63:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.k(i6, z(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 64:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.c(i6, z(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 65:
                    if (vs2Var.B(obj, i6, i4)) {
                        tr2Var.d(i6, D(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 66:
                    if (vs2Var.B(obj, i6, i4)) {
                        int iZ = z(obj, j2);
                        tr2Var.q(i6, (iZ >> 31) ^ (iZ << 1));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 67:
                    if (vs2Var.B(obj, i6, i4)) {
                        long jD = D(obj, j2);
                        tr2Var.l(i6, (jD >> 63) ^ (jD << c));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                case 68:
                    if (vs2Var.B(obj, i6, i4)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        tr2Var.p(i6, 3);
                        vs2Var.F(i4).d((yq2) object4, pv2Var);
                        tr2Var.p(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    vs2Var = this;
                    break;
            }
        }
        ((cs2) obj).zzb.d(pv2Var);
    }

    @Override // defpackage.ct2
    public final int e(cs2 cs2Var) {
        int i;
        int iB;
        int length = this.a.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iY = y(i2);
            int i3 = (267386880 & iY) >>> 20;
            if (i3 <= 50 || i3 >= 69) {
                long j2 = 1048575 & iY;
                int iHashCode2 = 37;
                switch (i3) {
                    case 0:
                        i = iHashCode * 53;
                        iB = ds2.b(Double.doubleToLongBits(nt2.c.a(cs2Var, j2)));
                        iHashCode = i + iB;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iB = Float.floatToIntBits(nt2.c.h(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        i = iHashCode * 53;
                        iB = ds2.b(nt2.c.k(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        i = iHashCode * 53;
                        iB = ds2.b(nt2.c.k(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        i = iHashCode * 53;
                        iB = ds2.b(nt2.c.k(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        int i4 = iHashCode * 53;
                        boolean zI = nt2.c.i(cs2Var, j2);
                        byte[] bArr = ds2.a;
                        iHashCode = i4 + (zI ? 1231 : 1237);
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i = iHashCode * 53;
                        iB = ((String) nt2.m(cs2Var, j2)).hashCode();
                        iHashCode = i + iB;
                        break;
                    case 9:
                        Object objM = nt2.m(cs2Var, j2);
                        if (objM != null) {
                            iHashCode2 = objM.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iB = nt2.m(cs2Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        iB = ds2.b(nt2.c.k(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iB = nt2.c.j(cs2Var, j2);
                        iHashCode = i + iB;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        iB = ds2.b(nt2.c.k(cs2Var, j2));
                        iHashCode = i + iB;
                        break;
                    case 17:
                        Object objM2 = nt2.m(cs2Var, j2);
                        if (objM2 != null) {
                            iHashCode2 = objM2.hashCode();
                        }
                        iHashCode = (iHashCode * 53) + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = iHashCode * 53;
                        iB = nt2.m(cs2Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iB = nt2.m(cs2Var, j2).hashCode();
                        iHashCode = i + iB;
                        break;
                }
            }
        }
        int i5 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i5 >= iArr.length) {
                return cs2Var.zzb.hashCode() + (iHashCode * 53);
            }
            int i6 = iArr[i5];
            if (!B(cs2Var, 0, i6)) {
                iHashCode = nt2.m(cs2Var, y(i6) & 1048575).hashCode() + (iHashCode * 53);
            }
            i5++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088 A[SYNTHETIC] */
    @Override // defpackage.ct2
    public final void f(Object obj) {
        if (I(obj)) {
            if (obj instanceof cs2) {
                cs2 cs2Var = (cs2) obj;
                cs2Var.m(Integer.MAX_VALUE);
                cs2Var.zza = 0;
                cs2Var.r();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iY = y(i);
                long j2 = 1048575 & iY;
                int i2 = (iY & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (A(i, obj)) {
                                    F(i).f(k.getObject(obj, j2));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                zq2 zq2Var = (zq2) ((js2) nt2.m(obj, j2));
                                if (zq2Var.a) {
                                    zq2Var.a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = k;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((qs2) object).a = false;
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (B(obj, iArr[i], i)) {
                        F(i).f(k.getObject(obj, j2));
                    }
                } else if (A(i, obj)) {
                    F(i).f(k.getObject(obj, j2));
                }
            }
            jt2 jt2Var = ((cs2) obj).zzb;
            if (jt2Var.e) {
                jt2Var.e = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // defpackage.ct2
    public final void g(Object obj, Object obj2) {
        Object obj3;
        H(obj);
        byte[] bArr = ds2.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                x91.W(obj, obj2);
                return;
            }
            int iY = y(i);
            long j2 = 1048575 & iY;
            int i2 = iArr[i];
            switch ((iY & 267386880) >>> 20) {
                case 0:
                    if (!A(i, obj2)) {
                        obj3 = obj;
                    } else {
                        mt2 mt2Var = nt2.c;
                        obj3 = obj;
                        mt2Var.c(obj3, j2, mt2Var.a(obj2, j2));
                        v(i, obj3);
                    }
                    break;
                case 1:
                    if (A(i, obj2)) {
                        mt2 mt2Var2 = nt2.c;
                        mt2Var2.d(obj, j2, mt2Var2.h(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (A(i, obj2)) {
                        nt2.c(obj, j2, nt2.c.k(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (A(i, obj2)) {
                        nt2.c(obj, j2, nt2.c.k(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (A(i, obj2)) {
                        nt2.c(obj, j2, nt2.c.k(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (A(i, obj2)) {
                        mt2 mt2Var3 = nt2.c;
                        mt2Var3.g(obj, j2, mt2Var3.i(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (A(i, obj2)) {
                        nt2.d(obj, j2, nt2.m(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 10:
                    if (A(i, obj2)) {
                        nt2.d(obj, j2, nt2.m(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (A(i, obj2)) {
                        nt2.c(obj, j2, nt2.c.k(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (A(i, obj2)) {
                        nt2.b(obj, j2, nt2.c.j(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (A(i, obj2)) {
                        nt2.c(obj, j2, nt2.c.k(obj2, j2));
                        v(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(obj, obj2, i);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    js2 js2VarB = (js2) nt2.m(obj, j2);
                    js2 js2Var = (js2) nt2.m(obj2, j2);
                    int size = js2VarB.size();
                    int size2 = js2Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((zq2) js2VarB).a) {
                            js2VarB = ((zs2) js2VarB).b(size2 + size);
                        }
                        js2VarB.addAll(js2Var);
                    }
                    if (size > 0) {
                        js2Var = js2VarB;
                    }
                    nt2.d(obj, j2, js2Var);
                    obj3 = obj;
                    break;
                case 50:
                    nt2.d(obj, j2, g93.K(nt2.m(obj, j2), nt2.m(obj2, j2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (B(obj2, i2, i)) {
                        nt2.d(obj, j2, nt2.m(obj2, j2));
                        x(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (B(obj2, i2, i)) {
                        nt2.d(obj, j2, nt2.m(obj2, j2));
                        x(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0366  */
    /* JADX WARN: Code duplicated, block: B:159:0x0398  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:256:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:260:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    @Override // defpackage.ct2
    public final int h(cs2 cs2Var) {
        int i;
        int iT;
        int iR;
        int iT2;
        int iR2;
        int iT3;
        int iT4;
        int iN;
        int iS;
        int iA;
        int iT5;
        int i2;
        int iT6;
        int iN2;
        int iS2;
        int iA2;
        int size;
        int iT7;
        int size2;
        int iT8;
        int iS3;
        int size3;
        int iO0;
        int iS4;
        int iS5;
        int iT9;
        int i3;
        int size4;
        int iS6;
        int iT10;
        int iA3;
        int iT11;
        int iR3;
        int iZ;
        cs2 cs2Var2 = cs2Var;
        Unsafe unsafe = k;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iW = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                return cs2Var2.zzb.a() + iW;
            }
            int iY = y(i6);
            int i8 = (267386880 & iY) >>> 20;
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (i8 <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(cs2Var2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iY & i4;
            if (i8 >= yr2.b.a) {
                int i12 = yr2.c.a;
            }
            int iT12 = 4;
            switch (i8) {
                case 0:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 1:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 4, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(cs2Var2, j2);
                        iT = tr2.t(i9 << 3);
                        iR = tr2.r(j3);
                        iN2 = iR + iT;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(cs2Var2, j2);
                        iT = tr2.t(i9 << 3);
                        iR = tr2.r(j4);
                        iN2 = iR + iT;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(cs2Var2, j2);
                        iT2 = tr2.t(i9 << 3);
                        iR2 = tr2.r(i13);
                        iN = iR2 + iT2;
                        iW += iN;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 4, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 1, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(cs2Var2, j2);
                        if (object instanceof jr2) {
                            iN = tr2.n(i9, (jr2) object);
                            iW += iN;
                        } else {
                            iT3 = tr2.t(i9 << 3);
                            int iF = z32.F((String) object);
                            iT4 = tr2.t(iF) + iF;
                            i3 = iT4 + iT3;
                            iW += i3;
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 9:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(cs2Var2, j2);
                        ct2 ct2VarF = F(i6);
                        iS = tr2.s(i9);
                        iA = ((yq2) object2).a(ct2VarF);
                        iT5 = tr2.t(iA);
                        i3 = iT5 + iA + iS;
                        iW += i3;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 10:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iN = tr2.n(i9, (jr2) unsafe.getObject(cs2Var2, j2));
                        iW += iN;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 11:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(cs2Var2, j2);
                        iT6 = tr2.t(i9 << 3);
                        iW = ck1.w(i2, iT6, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 12:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(cs2Var2, j2);
                        iT2 = tr2.t(i9 << 3);
                        iR2 = tr2.r(i14);
                        iN = iR2 + iT2;
                        iW += iN;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 13:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 4, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 14:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    cs2Var2 = cs2Var;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 15:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        int i15 = unsafe.getInt(cs2Var2, j2);
                        iT6 = tr2.t(i9 << 3);
                        i2 = (i15 >> 31) ^ (i15 << 1);
                        iW = ck1.w(i2, iT6, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 16:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        long j5 = unsafe.getLong(cs2Var2, j2);
                        iT = tr2.t(i9 << 3);
                        iR = tr2.r((j5 >> 63) ^ (j5 << 1));
                        iN2 = iR + iT;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 17:
                    if (t(cs2Var2, i6, i5, i7, i)) {
                        yq2 yq2Var = (yq2) unsafe.getObject(cs2Var2, j2);
                        ct2 ct2VarF2 = F(i6);
                        iS2 = tr2.s(i9) << 1;
                        iA2 = yq2Var.a(ct2VarF2);
                        iN2 = iA2 + iS2;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 18:
                    size = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size == 0) {
                        i3 = 0;
                    } else {
                        iT7 = tr2.t(i9 << 3);
                        i3 = (iT7 + 8) * size;
                    }
                    iW += i3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 19:
                    size2 = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size2 == 0) {
                        iT9 = 0;
                    } else {
                        iT8 = tr2.t(i9 << 3);
                        iT9 = (iT8 + 4) * size2;
                    }
                    iW += iT9;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(cs2Var2, j2);
                    if (list.size() == 0) {
                        iS3 = 0;
                    } else {
                        iS3 = (tr2.s(i9) * list.size()) + x91.g0(list);
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list2.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.o0(list2);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list3.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.e0(list3);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 23:
                    size = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size == 0) {
                        i3 = 0;
                    } else {
                        iT7 = tr2.t(i9 << 3);
                        i3 = (iT7 + 8) * size;
                    }
                    iW += i3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 24:
                    size2 = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size2 == 0) {
                        iT9 = 0;
                    } else {
                        iT8 = tr2.t(i9 << 3);
                        iT9 = (iT8 + 4) * size2;
                    }
                    iW += iT9;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 25:
                    int size5 = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    iW += size5 == 0 ? 0 : (tr2.t(i9 << 3) + 1) * size5;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 26:
                    List list4 = (List) unsafe.getObject(cs2Var2, j2);
                    int size6 = list4.size();
                    if (size6 == 0) {
                        iS3 = 0;
                    } else {
                        iS3 = tr2.s(i9) * size6;
                        if (list4 instanceof ns2) {
                            ns2 ns2Var = (ns2) list4;
                            for (int i16 = 0; i16 < size6; i16++) {
                                Object objZza = ns2Var.zza();
                                int iB = objZza instanceof jr2 ? ((jr2) objZza).b() : z32.F((String) objZza);
                                iS3 = ck1.w(iB, iB, iS3);
                            }
                        } else {
                            for (int i17 = 0; i17 < size6; i17++) {
                                Object obj = list4.get(i17);
                                int iB2 = obj instanceof jr2 ? ((jr2) obj).b() : z32.F((String) obj);
                                iS3 = ck1.w(iB2, iB2, iS3);
                            }
                        }
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 27:
                    List list5 = (List) unsafe.getObject(cs2Var2, j2);
                    ct2 ct2VarF3 = F(i6);
                    int size7 = list5.size();
                    if (size7 == 0) {
                        iS5 = 0;
                    } else {
                        iS5 = tr2.s(i9) * size7;
                        for (int i18 = 0; i18 < size7; i18++) {
                            int iA4 = ((yq2) list5.get(i18)).a(ct2VarF3);
                            iS5 = ck1.w(iA4, iA4, iS5);
                        }
                    }
                    iW += iS5;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(cs2Var2, j2);
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iS3 = 0;
                    } else {
                        iS3 = tr2.s(i9) * size8;
                        for (int i19 = 0; i19 < list6.size(); i19++) {
                            int iB3 = ((jr2) list6.get(i19)).b();
                            iS3 = ck1.w(iB3, iB3, iS3);
                        }
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list7.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.m0(list7);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 30:
                    List list8 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list8.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.Y(list8);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 31:
                    size2 = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size2 == 0) {
                        iT9 = 0;
                    } else {
                        iT8 = tr2.t(i9 << 3);
                        iT9 = (iT8 + 4) * size2;
                    }
                    iW += iT9;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 32:
                    size = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size == 0) {
                        i3 = 0;
                    } else {
                        iT7 = tr2.t(i9 << 3);
                        i3 = (iT7 + 8) * size;
                    }
                    iW += i3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list9.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.i0(list9);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 34:
                    List list10 = (List) unsafe.getObject(cs2Var2, j2);
                    size3 = list10.size();
                    if (size3 == 0) {
                        iS3 = 0;
                    } else {
                        iO0 = x91.k0(list10);
                        iS4 = tr2.s(i9);
                        iS3 = (iS4 * size3) + iO0;
                    }
                    iW += iS3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 35:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 3;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 36:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 2;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 37:
                    size4 = x91.g0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 38:
                    size4 = x91.o0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 39:
                    size4 = x91.e0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 40:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 3;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 41:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 2;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 42:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size();
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 43:
                    size4 = x91.m0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 44:
                    size4 = x91.Y((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 45:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 2;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 46:
                    size4 = ((List) unsafe.getObject(cs2Var2, j2)).size() << 3;
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 47:
                    size4 = x91.i0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 48:
                    size4 = x91.k0((List) unsafe.getObject(cs2Var2, j2));
                    if (size4 > 0) {
                        iS6 = tr2.s(i9);
                        iT10 = tr2.t(size4);
                        iT9 = iT10 + iS6 + size4;
                        iW += iT9;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 49:
                    List list11 = (List) unsafe.getObject(cs2Var2, j2);
                    ct2 ct2VarF4 = F(i6);
                    int size9 = list11.size();
                    if (size9 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i20 = 0; i20 < size9; i20++) {
                            iA3 += ((yq2) list11.get(i20)).a(ct2VarF4) + (tr2.s(i9) << 1);
                        }
                    }
                    iW += iA3;
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 50:
                    qs2 qs2Var = (qs2) unsafe.getObject(cs2Var2, j2);
                    if (G(i6) != null) {
                        ur.a();
                        return 0;
                    }
                    if (qs2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = qs2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw new NoSuchMethodError();
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 51:
                    if (B(cs2Var2, i9, i6)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 52:
                    if (B(cs2Var2, i9, i6)) {
                        iZ = i9 << 3;
                        iW = ck1.w(iZ, iT12, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 53:
                    if (B(cs2Var2, i9, i6)) {
                        long jD = D(cs2Var2, j2);
                        iT3 = tr2.t(i9 << 3);
                        iT4 = tr2.r(jD);
                        i3 = iT4 + iT3;
                        iW += i3;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 54:
                    if (B(cs2Var2, i9, i6)) {
                        long jD2 = D(cs2Var2, j2);
                        iT3 = tr2.t(i9 << 3);
                        iT4 = tr2.r(jD2);
                        i3 = iT4 + iT3;
                        iW += i3;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 55:
                    if (B(cs2Var2, i9, i6)) {
                        int iZ2 = z(cs2Var2, j2);
                        iT11 = tr2.t(i9 << 3);
                        iR3 = tr2.r(iZ2);
                        iN2 = iR3 + iT11;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 56:
                    if (B(cs2Var2, i9, i6)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 57:
                    if (B(cs2Var2, i9, i6)) {
                        iZ = i9 << 3;
                        iW = ck1.w(iZ, iT12, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 58:
                    if (B(cs2Var2, i9, i6)) {
                        iW = ck1.w(i9 << 3, 1, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 59:
                    if (B(cs2Var2, i9, i6)) {
                        Object object3 = unsafe.getObject(cs2Var2, j2);
                        if (object3 instanceof jr2) {
                            iN2 = tr2.n(i9, (jr2) object3);
                            iW += iN2;
                        } else {
                            int iT13 = tr2.t(i9 << 3);
                            int iF2 = z32.F((String) object3);
                            iT9 = tr2.t(iF2) + iF2 + iT13;
                            iW += iT9;
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 60:
                    if (B(cs2Var2, i9, i6)) {
                        Object object4 = unsafe.getObject(cs2Var2, j2);
                        ct2 ct2VarF5 = F(i6);
                        iS = tr2.s(i9);
                        iA = ((yq2) object4).a(ct2VarF5);
                        iT5 = tr2.t(iA);
                        i3 = iT5 + iA + iS;
                        iW += i3;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 61:
                    if (B(cs2Var2, i9, i6)) {
                        iN2 = tr2.n(i9, (jr2) unsafe.getObject(cs2Var2, j2));
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 62:
                    if (B(cs2Var2, i9, i6)) {
                        iZ = z(cs2Var2, j2);
                        iT12 = tr2.t(i9 << 3);
                        iW = ck1.w(iZ, iT12, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 63:
                    if (B(cs2Var2, i9, i6)) {
                        int iZ3 = z(cs2Var2, j2);
                        iT11 = tr2.t(i9 << 3);
                        iR3 = tr2.r(iZ3);
                        iN2 = iR3 + iT11;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 64:
                    if (B(cs2Var2, i9, i6)) {
                        iZ = i9 << 3;
                        iW = ck1.w(iZ, iT12, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 65:
                    if (B(cs2Var2, i9, i6)) {
                        iW = ck1.w(i9 << 3, 8, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 66:
                    if (B(cs2Var2, i9, i6)) {
                        int iZ4 = z(cs2Var2, j2);
                        iT12 = tr2.t(i9 << 3);
                        iZ = (iZ4 >> 31) ^ (iZ4 << 1);
                        iW = ck1.w(iZ, iT12, iW);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 67:
                    if (B(cs2Var2, i9, i6)) {
                        long jD3 = D(cs2Var2, j2);
                        iT3 = tr2.t(i9 << 3);
                        iT4 = tr2.r((jD3 >> 63) ^ (jD3 << 1));
                        i3 = iT4 + iT3;
                        iW += i3;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                case 68:
                    if (B(cs2Var2, i9, i6)) {
                        yq2 yq2Var2 = (yq2) unsafe.getObject(cs2Var2, j2);
                        ct2 ct2VarF6 = F(i6);
                        iS2 = tr2.s(i9) << 1;
                        iA2 = yq2Var2.a(ct2VarF6);
                        iN2 = iA2 + iS2;
                        iW += iN2;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    break;
                default:
                    i6 += 3;
                    i4 = 1048575;
                    break;
            }
        }
    }

    @Override // defpackage.ct2
    public final void i(Object obj, byte[] bArr, int i, int i2, zk2 zk2Var) {
        k(obj, bArr, i, i2, 0, zk2Var);
    }

    public final int j(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        */
    public final int k(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, defpackage.zk2 r37) {
        /*
            Method dump skipped, instruction units count: 2800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.k(java.lang.Object, byte[], int, int, int, zk2):int");
    }

    public final Object l(int i, Object obj) {
        ct2 ct2VarF = F(i);
        long jY = y(i) & 1048575;
        if (!A(i, obj)) {
            return ct2VarF.zza();
        }
        Object object = k.getObject(obj, jY);
        if (I(object)) {
            return object;
        }
        cs2 cs2VarZza = ct2VarF.zza();
        if (object != null) {
            ct2VarF.g(cs2VarZza, object);
        }
        return cs2VarZza;
    }

    public final Object m(Object obj, int i, int i2) {
        ct2 ct2VarF = F(i2);
        if (!B(obj, i, i2)) {
            return ct2VarF.zza();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (I(object)) {
            return object;
        }
        cs2 cs2VarZza = ct2VarF.zza();
        if (object != null) {
            ct2VarF.g(cs2VarZza, object);
        }
        return cs2VarZza;
    }

    public final void p(int i, we weVar, Object obj) {
        if ((536870912 & i) != 0) {
            weVar.h0(2);
            nt2.d(obj, i & 1048575, ((sn) weVar.d).a0());
        } else if (!this.f) {
            nt2.d(obj, i & 1048575, weVar.C0());
        } else {
            weVar.h0(2);
            nt2.d(obj, i & 1048575, ((sn) weVar.d).Z());
        }
    }

    public final void q(Object obj, int i, int i2, Object obj2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        x(obj, i, i2);
    }

    public final void r(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (nt2.m(obj, y(i) & 1048575) == null) {
            return;
        }
        E(i);
    }

    public final void s(Object obj, Object obj2, int i) {
        if (A(i, obj2)) {
            long jY = y(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(obj2));
            }
            ct2 ct2VarF = F(i);
            if (!A(i, obj)) {
                if (I(object)) {
                    cs2 cs2VarZza = ct2VarF.zza();
                    ct2VarF.g(cs2VarZza, object);
                    unsafe.putObject(obj, jY, cs2VarZza);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                v(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!I(object2)) {
                cs2 cs2VarZza2 = ct2VarF.zza();
                ct2VarF.g(cs2VarZza2, object2);
                unsafe.putObject(obj, jY, cs2VarZza2);
                object2 = cs2VarZza2;
            }
            ct2VarF.g(object2, object);
        }
    }

    public final boolean t(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final void u(int i, Object obj, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        v(i, obj);
    }

    public final void v(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        nt2.b(obj, j2, (1 << (i2 >>> 20)) | nt2.c.j(obj, j2));
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (B(obj2, i2, i)) {
            long jY = y(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + String.valueOf(obj2));
            }
            ct2 ct2VarF = F(i);
            if (!B(obj, i2, i)) {
                if (I(object)) {
                    cs2 cs2VarZza = ct2VarF.zza();
                    ct2VarF.g(cs2VarZza, object);
                    unsafe.putObject(obj, jY, cs2VarZza);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                x(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!I(object2)) {
                cs2 cs2VarZza2 = ct2VarF.zza();
                ct2VarF.g(cs2VarZza2, object2);
                unsafe.putObject(obj, jY, cs2VarZza2);
                object2 = cs2VarZza2;
            }
            ct2VarF.g(object2, object);
        }
    }

    public final void x(Object obj, int i, int i2) {
        nt2.b(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.ct2
    public final cs2 zza() {
        return ((cs2) this.e).p();
    }
}
