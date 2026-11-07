package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class on2 implements yn2 {
    public static final int[] k = new int[0];
    public static final Unsafe l = no2.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final wk2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final qh1 j;

    public on2(int[] iArr, Object[] objArr, int i, int i2, wk2 wk2Var, int[] iArr2, int i3, int i4, qh1 qh1Var, vl0 vl0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = wk2Var instanceof dm2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = qh1Var;
        this.e = wk2Var;
    }

    public static int j(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof dm2) {
            return ((dm2) obj).g();
        }
        return true;
    }

    public static void l(Object obj) {
        if (k(obj)) {
            return;
        }
        e.g("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int m(Object obj, long j) {
        return ((Integer) no2.i(obj, j)).intValue();
    }

    public static long n(Object obj, long j) {
        return ((Long) no2.i(obj, j)).longValue();
    }

    public static final int v(byte[] bArr, int i, int i2, ro2 ro2Var, Class cls, zk2 zk2Var) throws xm2 {
        ro2 ro2Var2 = ro2.c;
        switch (ro2Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                zk2Var.c = Double.valueOf(Double.longBitsToDouble(yi0.z(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zk2Var.c = Float.valueOf(Float.intBitsToFloat(yi0.x(bArr, i)));
                return i4;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int iW = yi0.w(bArr, i, zk2Var);
                zk2Var.c = Long.valueOf(zk2Var.b);
                return iW;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case 12:
            case 13:
                int iR = yi0.r(bArr, i, zk2Var);
                zk2Var.c = Integer.valueOf(zk2Var.a);
                return iR;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i5 = i + 8;
                zk2Var.c = Long.valueOf(yi0.z(bArr, i));
                return i5;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i6 = i + 4;
                zk2Var.c = Integer.valueOf(yi0.x(bArr, i));
                return i6;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int iW2 = yi0.w(bArr, i, zk2Var);
                zk2Var.c = Boolean.valueOf(zk2Var.b != 0);
                return iW2;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return yi0.B(bArr, i, zk2Var);
            case 9:
            default:
                uq1.m("unsupported field type.");
                return 0;
            case 10:
                yn2 yn2VarA = un2.c.a(cls);
                dm2 dm2VarZza = yn2VarA.zza();
                int iD = yi0.D(dm2VarZza, yn2VarA, bArr, i, i2, zk2Var);
                yn2VarA.f(dm2VarZza);
                zk2Var.c = dm2VarZza;
                return iD;
            case 11:
                return yi0.C(bArr, i, zk2Var);
            case 16:
                int iR2 = yi0.r(bArr, i, zk2Var);
                zk2Var.c = Integer.valueOf(ll2.j(zk2Var.a));
                return iR2;
            case 17:
                int iW3 = yi0.w(bArr, i, zk2Var);
                zk2Var.c = Long.valueOf(ll2.k(zk2Var.b));
                return iW3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x0354  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    public static on2 x(wn2 wn2Var, qh1 qh1Var, vl0 vl0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
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
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldY;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldY2;
        int i28;
        Object obj2;
        Field fieldY3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(wn2Var instanceof wn2)) {
            ur.a();
            return null;
        }
        String str = wn2Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = k;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = l;
        Object[] objArr2 = wn2Var.c;
        Class<?> cls = wn2Var.a.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & 2048;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (wn2Var.a() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldY2 = (Field) obj;
                    } else {
                        fieldY2 = y(cls, (String) obj);
                        objArr4[i27] = fieldY2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldY2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldY3 = (Field) obj2;
                    } else {
                        fieldY3 = y(cls, (String) obj2);
                        objArr4[i28] = fieldY3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldY2 = (Field) obj;
                } else {
                    fieldY2 = y(cls, (String) obj);
                    objArr4[i27] = fieldY2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldY2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldY3 = (Field) obj2;
                } else {
                    fieldY3 = y(cls, (String) obj2);
                    objArr4[i28] = fieldY3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldY4 = y(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldY4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (wn2Var.a() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldY = (Field) obj3;
                            } else {
                                fieldY = y(cls, (String) obj3);
                                objArr4[i98] = fieldY;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldY);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldY4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new on2(iArr3, objArr3, i2, i5, wn2Var.a, iArr, i7, i62, qh1Var, vl0Var);
    }

    public static Field y(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            ts.r(sb, "Field ", str, " for ", name);
            sm0.m(ts.l(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(obj2, i2, i)) {
            int i3 = i(i) & 1048575;
            Unsafe unsafe = l;
            long j = i3;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i4 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i4);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            yn2 yn2VarB = B(i);
            if (!s(obj, i2, i)) {
                if (k(object)) {
                    dm2 dm2VarZza = yn2VarB.zza();
                    yn2VarB.b(dm2VarZza, object);
                    unsafe.putObject(obj, j, dm2VarZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!k(object2)) {
                dm2 dm2VarZza2 = yn2VarB.zza();
                yn2VarB.b(dm2VarZza2, object2);
                unsafe.putObject(obj, j, dm2VarZza2);
                object2 = dm2VarZza2;
            }
            yn2VarB.b(object2, object);
        }
    }

    public final yn2 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        yn2 yn2Var = (yn2) objArr[i3];
        if (yn2Var != null) {
            return yn2Var;
        }
        yn2 yn2VarA = un2.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = yn2VarA;
        return yn2VarA;
    }

    public final Object C(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final qk2 D(int i) {
        int i2 = i / 3;
        return (qk2) this.b[i2 + i2 + 1];
    }

    public final Object E(int i, Object obj) {
        yn2 yn2VarB = B(i);
        int i2 = i(i) & 1048575;
        if (!q(i, obj)) {
            return yn2VarB.zza();
        }
        Object object = l.getObject(obj, i2);
        if (k(object)) {
            return object;
        }
        dm2 dm2VarZza = yn2VarB.zza();
        if (object != null) {
            yn2VarB.b(dm2VarZza, object);
        }
        return dm2VarZza;
    }

    public final void F(int i, Object obj, Object obj2) {
        l.putObject(obj, i(i) & 1048575, obj2);
        r(i, obj);
    }

    public final Object G(Object obj, int i, int i2) {
        yn2 yn2VarB = B(i2);
        if (!s(obj, i, i2)) {
            return yn2VarB.zza();
        }
        Object object = l.getObject(obj, i(i2) & 1048575);
        if (k(object)) {
            return object;
        }
        dm2 dm2VarZza = yn2VarB.zza();
        if (object != null) {
            yn2VarB.b(dm2VarZza, object);
        }
        return dm2VarZza;
    }

    public final void H(Object obj, int i, int i2, Object obj2) {
        l.putObject(obj, i(i2) & 1048575, obj2);
        t(obj, i, i2);
    }

    public final Object I(Object obj, int i, Object obj2, qh1 qh1Var, Object obj3) {
        qk2 qk2VarD;
        int i2 = this.a[i];
        Object objI = no2.i(obj, i(i) & 1048575);
        if (objI == null || (qk2VarD = D(i)) == null) {
            return obj2;
        }
        p11 p11Var = ((fn2) C(i)).a;
        Iterator it = ((gn2) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!qk2VarD.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    qh1Var.getClass();
                    obj2 = qh1.v(obj3);
                }
                int iB = fn2.b(p11Var, entry.getKey(), entry.getValue());
                gl2 gl2Var = hl2.b;
                byte[] bArr = new byte[iB];
                boolean z = tl2.b;
                nl2 nl2Var = new nl2(bArr, iB);
                try {
                    fn2.a(nl2Var, p11Var, entry.getKey(), entry.getValue());
                    if (nl2Var.x() > 0) {
                        uq1.q("Did not write as much data as expected.");
                        return null;
                    }
                    if (nl2Var.x() < 0) {
                        uq1.q("Wrote more data than expected.");
                        return null;
                    }
                    gl2 gl2Var2 = new gl2(bArr);
                    qh1Var.getClass();
                    ((ho2) obj2).d((i2 << 3) | 2, gl2Var2);
                    it.remove();
                } catch (IOException e) {
                    sm0.n(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void J(int i, we weVar, Object obj) {
        ll2 ll2Var = (ll2) weVar.d;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            weVar.V(2);
            no2.j(obj, j, ll2Var.x());
        } else if (!this.f) {
            no2.j(obj, j, weVar.E0());
        } else {
            weVar.V(2);
            no2.j(obj, j, ll2Var.w());
        }
    }

    @Override // defpackage.yn2
    public final void a(Object obj, wa waVar) {
        int i;
        tl2 tl2Var = (tl2) waVar.b;
        Unsafe unsafe = l;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((dm2) obj).zzc.b(waVar);
                return;
            }
            int i6 = i(i4);
            int iJ = j(i6);
            int i7 = iArr[i4];
            if (iJ <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = i6 & i2;
            switch (iJ) {
                case 0:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.i(i7, Double.doubleToRawLongBits(no2.c.C(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.g(i7, Float.floatToRawIntBits(no2.c.z(obj, j)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.h(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.h(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.e(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.i(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.g(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.j(i7, no2.c.v(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (p(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            tl2Var.k(i7, (String) object);
                        } else {
                            tl2Var.l(i7, (hl2) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (p(obj, i4, i3, i5, i)) {
                        waVar.s(i7, unsafe.getObject(obj, j), B(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.l(i7, (hl2) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.f(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.e(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.g(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (p(obj, i4, i3, i5, i)) {
                        tl2Var.i(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (p(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        tl2Var.f(i7, (i10 >> 31) ^ (i10 + i10));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (p(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        tl2Var.h(i7, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (p(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        tl2Var.d(i7, 3);
                        B(i4).a((wk2) object2, waVar);
                        tl2Var.d(i7, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    zn2.d(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    zn2.e(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    zn2.f(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    zn2.g(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    zn2.k(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    zn2.i(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    zn2.n(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    zn2.q(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    qh1 qh1Var = zn2.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof bn2) {
                            bn2 bn2Var = (bn2) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objZzc = bn2Var.zzc();
                                if (objZzc instanceof String) {
                                    tl2Var.k(i11, (String) objZzc);
                                } else {
                                    tl2Var.l(i11, (hl2) objZzc);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                tl2Var.k(i11, (String) list.get(i13));
                            }
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    yn2 yn2VarB = B(i4);
                    qh1 qh1Var2 = zn2.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            waVar.s(i14, list2.get(i15), yn2VarB);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    qh1 qh1Var3 = zn2.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            tl2Var.l(i16, (hl2) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    zn2.l(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    zn2.p(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    zn2.o(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    zn2.j(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    zn2.m(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    zn2.h(iArr[i4], (List) unsafe.getObject(obj, j), waVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    zn2.d(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 36:
                    zn2.e(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 37:
                    zn2.f(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 38:
                    zn2.g(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 39:
                    zn2.k(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 40:
                    zn2.i(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 41:
                    zn2.n(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 42:
                    zn2.q(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 43:
                    zn2.l(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 44:
                    zn2.p(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 45:
                    zn2.o(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 46:
                    zn2.j(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 47:
                    zn2.m(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 48:
                    zn2.h(iArr[i4], (List) unsafe.getObject(obj, j), waVar, true);
                    break;
                case 49:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    yn2 yn2VarB2 = B(i4);
                    qh1 qh1Var4 = zn2.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            wk2 wk2Var = (wk2) list4.get(i19);
                            tl2Var.d(i18, 3);
                            yn2VarB2.a(wk2Var, waVar);
                            tl2Var.d(i18, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        p11 p11Var = ((fn2) C(i4)).a;
                        for (Map.Entry entry : ((gn2) object3).entrySet()) {
                            tl2Var.d(i7, 2);
                            tl2Var.r(fn2.b(p11Var, entry.getKey(), entry.getValue()));
                            fn2.a(tl2Var, p11Var, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (s(obj, i7, i4)) {
                        tl2Var.i(i7, Double.doubleToRawLongBits(((Double) no2.i(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (s(obj, i7, i4)) {
                        tl2Var.g(i7, Float.floatToRawIntBits(((Float) no2.i(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (s(obj, i7, i4)) {
                        tl2Var.h(i7, n(obj, j));
                    }
                    break;
                case 54:
                    if (s(obj, i7, i4)) {
                        tl2Var.h(i7, n(obj, j));
                    }
                    break;
                case 55:
                    if (s(obj, i7, i4)) {
                        tl2Var.e(i7, m(obj, j));
                    }
                    break;
                case 56:
                    if (s(obj, i7, i4)) {
                        tl2Var.i(i7, n(obj, j));
                    }
                    break;
                case 57:
                    if (s(obj, i7, i4)) {
                        tl2Var.g(i7, m(obj, j));
                    }
                    break;
                case 58:
                    if (s(obj, i7, i4)) {
                        tl2Var.j(i7, ((Boolean) no2.i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(obj, i7, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            tl2Var.k(i7, (String) object4);
                        } else {
                            tl2Var.l(i7, (hl2) object4);
                        }
                    }
                    break;
                case 60:
                    if (s(obj, i7, i4)) {
                        waVar.s(i7, unsafe.getObject(obj, j), B(i4));
                    }
                    break;
                case 61:
                    if (s(obj, i7, i4)) {
                        tl2Var.l(i7, (hl2) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (s(obj, i7, i4)) {
                        tl2Var.f(i7, m(obj, j));
                    }
                    break;
                case 63:
                    if (s(obj, i7, i4)) {
                        tl2Var.e(i7, m(obj, j));
                    }
                    break;
                case 64:
                    if (s(obj, i7, i4)) {
                        tl2Var.g(i7, m(obj, j));
                    }
                    break;
                case 65:
                    if (s(obj, i7, i4)) {
                        tl2Var.i(i7, n(obj, j));
                    }
                    break;
                case 66:
                    if (s(obj, i7, i4)) {
                        int iM = m(obj, j);
                        tl2Var.f(i7, (iM >> 31) ^ (iM + iM));
                    }
                    break;
                case 67:
                    if (s(obj, i7, i4)) {
                        long jN = n(obj, j);
                        tl2Var.h(i7, (jN >> 63) ^ (jN + jN));
                    }
                    break;
                case 68:
                    if (s(obj, i7, i4)) {
                        Object object5 = unsafe.getObject(obj, j);
                        tl2Var.d(i7, 3);
                        B(i4).a((wk2) object5, waVar);
                        tl2Var.d(i7, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.yn2
    public final void b(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                zn2.b(obj, obj2);
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int iJ = j(i2);
            int i4 = iArr[i];
            long j = i3;
            switch (iJ) {
                case 0:
                    if (!q(i, obj2)) {
                        obj3 = obj;
                    } else {
                        lo2 lo2Var = no2.c;
                        obj3 = obj;
                        lo2Var.E(obj3, j, lo2Var.C(obj2, j));
                        r(i, obj3);
                    }
                    break;
                case 1:
                    if (q(i, obj2)) {
                        lo2 lo2Var2 = no2.c;
                        lo2Var2.B(obj, j, lo2Var2.z(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (q(i, obj2)) {
                        no2.h(obj, j, no2.g(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (q(i, obj2)) {
                        no2.h(obj, j, no2.g(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (q(i, obj2)) {
                        no2.h(obj, j, no2.g(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i, obj2)) {
                        lo2 lo2Var3 = no2.c;
                        lo2Var3.x(obj, j, lo2Var3.v(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (q(i, obj2)) {
                        no2.j(obj, j, no2.i(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    z(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        no2.j(obj, j, no2.i(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        no2.h(obj, j, no2.g(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        no2.f(obj, j, no2.e(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        no2.h(obj, j, no2.g(obj2, j));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    z(i, obj, obj2);
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
                    um2 um2VarZzg = (um2) no2.i(obj, j);
                    um2 um2Var = (um2) no2.i(obj2, j);
                    int size = um2VarZzg.size();
                    int size2 = um2Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((xk2) um2VarZzg).a) {
                            um2VarZzg = um2VarZzg.zzg(size2 + size);
                        }
                        um2VarZzg.addAll(um2Var);
                    }
                    if (size > 0) {
                        um2Var = um2VarZzg;
                    }
                    no2.j(obj, j, um2Var);
                    obj3 = obj;
                    break;
                case 50:
                    qh1 qh1Var = zn2.a;
                    no2.j(obj, j, ba0.A(no2.i(obj, j), no2.i(obj2, j)));
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
                    if (s(obj2, i4, i)) {
                        no2.j(obj, j, no2.i(obj2, j));
                        t(obj, i4, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(obj2, i4, i)) {
                        no2.j(obj, j, no2.i(obj2, j));
                        t(obj, i4, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    A(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:197:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    @Override // defpackage.yn2
    public final int c(wk2 wk2Var) {
        int i;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int iA3;
        int iC;
        int i2;
        int iA4;
        int iZ;
        int i3;
        int iC2;
        int iA5;
        int size;
        int iS;
        int iA6;
        int iA7;
        int iA8;
        int size2;
        int iA9;
        int iC3;
        int iA10;
        int iB3;
        int iA11;
        int iB4;
        int iM;
        int iA12;
        Unsafe unsafe = l;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iN = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                return ((dm2) wk2Var).zzc.c() + iN;
            }
            int i8 = i(i6);
            int iJ = j(i8);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (iJ <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(wk2Var, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = i8 & i4;
            if (iJ >= yl2.b.a) {
                yl2.c.getClass();
            }
            long j = i12;
            switch (iJ) {
                case 0:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case 1:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(wk2Var, j);
                        iA = tl2.a(i9 << 3);
                        iB = tl2.b(j2);
                        iZ = iB + iA;
                        iN += iZ;
                    }
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(wk2Var, j);
                        iA = tl2.a(i9 << 3);
                        iB = tl2.b(j3);
                        iZ = iB + iA;
                        iN += iZ;
                    }
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(wk2Var, j);
                        iA = tl2.a(i9 << 3);
                        iB = tl2.b(j4);
                        iZ = iB + iA;
                        iN += iZ;
                    }
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 1, iN);
                    }
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(wk2Var, j);
                        if (object instanceof hl2) {
                            iA2 = tl2.a(i13);
                            iB2 = ((hl2) object).b();
                        } else {
                            iA2 = tl2.a(i13);
                            iB2 = qo2.b((String) object);
                        }
                        iN = ck1.o(iB2, iB2, iA2, iN);
                    }
                    break;
                case 9:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(wk2Var, j);
                        yn2 yn2VarB = B(i6);
                        qh1 qh1Var = zn2.a;
                        iA3 = tl2.a(i9 << 3);
                        iC = ((wk2) object2).c(yn2VarB);
                        iN = ck1.o(iC, iC, iA3, iN);
                    }
                    break;
                case 10:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        hl2 hl2Var = (hl2) unsafe.getObject(wk2Var, j);
                        iA2 = tl2.a(i9 << 3);
                        iB2 = hl2Var.b();
                        iN = ck1.o(iB2, iB2, iA2, iN);
                    }
                    break;
                case 11:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(wk2Var, j);
                        iA4 = tl2.a(i9 << 3);
                        iN = ck1.n(i2, iA4, iN);
                    }
                    break;
                case 12:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(wk2Var, j);
                        iA = tl2.a(i9 << 3);
                        iB = tl2.b(j5);
                        iZ = iB + iA;
                        iN += iZ;
                    }
                    break;
                case 13:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case 14:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case 15:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(wk2Var, j);
                        iA4 = tl2.a(i9 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iN = ck1.n(i2, iA4, iN);
                    }
                    break;
                case 16:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(wk2Var, j);
                        iA = tl2.a(i9 << 3);
                        iB = tl2.b((j6 >> 63) ^ (j6 + j6));
                        iZ = iB + iA;
                        iN += iZ;
                    }
                    break;
                case 17:
                    if (p(wk2Var, i6, i5, i7, i)) {
                        wk2 wk2Var2 = (wk2) unsafe.getObject(wk2Var, j);
                        yn2 yn2VarB2 = B(i6);
                        qh1 qh1Var2 = zn2.a;
                        int iA13 = tl2.a(i9 << 3);
                        i3 = iA13 + iA13;
                        iC2 = wk2Var2.c(yn2VarB2);
                        iZ = iC2 + i3;
                        iN += iZ;
                    }
                    break;
                case 18:
                    iZ = zn2.z(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 19:
                    iZ = zn2.y(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var3 = zn2.a;
                    if (list.size() == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (tl2.a(i9 << 3) * list.size()) + zn2.r(list);
                    }
                    iN += iA5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var4 = zn2.a;
                    size = list2.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.s(list2);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var5 = zn2.a;
                    size = list3.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.v(list3);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 23:
                    iZ = zn2.z(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 24:
                    iZ = zn2.y(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var6 = zn2.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (tl2.a(i9 << 3) + 1) * size3;
                    }
                    iN += iA5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var7 = zn2.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = tl2.a(i9 << 3) * size4;
                        if (list5 instanceof bn2) {
                            bn2 bn2Var = (bn2) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object objZzc = bn2Var.zzc();
                                int iB5 = objZzc instanceof hl2 ? ((hl2) objZzc).b() : qo2.b((String) objZzc);
                                iA7 = ck1.n(iB5, iB5, iA7);
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                int iB6 = obj instanceof hl2 ? ((hl2) obj).b() : qo2.b((String) obj);
                                iA7 = ck1.n(iB6, iB6, iA7);
                            }
                        }
                    }
                    iN += iA7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(wk2Var, j);
                    yn2 yn2VarB3 = B(i6);
                    qh1 qh1Var8 = zn2.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = tl2.a(i9 << 3) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            int iC4 = ((wk2) list6.get(i17)).c(yn2VarB3);
                            iA8 = ck1.n(iC4, iC4, iA8);
                        }
                    }
                    iN += iA8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var9 = zn2.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = tl2.a(i9 << 3) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iB7 = ((hl2) list7.get(i18)).b();
                            iA7 = ck1.n(iB7, iB7, iA7);
                        }
                    }
                    iN += iA7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var10 = zn2.a;
                    size = list8.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.w(list8);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var11 = zn2.a;
                    size = list9.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.u(list9);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 31:
                    iZ = zn2.y(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 32:
                    iZ = zn2.z(i9, (List) unsafe.getObject(wk2Var, j));
                    iN += iZ;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var12 = zn2.a;
                    size = list10.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.x(list10);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var13 = zn2.a;
                    size = list11.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = zn2.t(list11);
                        iA6 = tl2.a(i9 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iN += iA7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var14 = zn2.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var15 = zn2.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 37:
                    size2 = zn2.r((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 38:
                    size2 = zn2.s((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 39:
                    size2 = zn2.v((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var16 = zn2.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var17 = zn2.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var18 = zn2.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 43:
                    size2 = zn2.w((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 44:
                    size2 = zn2.u((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var19 = zn2.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(wk2Var, j);
                    qh1 qh1Var20 = zn2.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 47:
                    size2 = zn2.x((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 48:
                    size2 = zn2.t((List) unsafe.getObject(wk2Var, j));
                    if (size2 > 0) {
                        iA9 = tl2.a(i9 << 3);
                        iN = ck1.o(size2, iA9, size2, iN);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(wk2Var, j);
                    yn2 yn2VarB4 = B(i6);
                    qh1 qh1Var21 = zn2.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC3 = 0;
                    } else {
                        iC3 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            wk2 wk2Var3 = (wk2) list19.get(i19);
                            int iA14 = tl2.a(i9 << 3);
                            iC3 += wk2Var3.c(yn2VarB4) + iA14 + iA14;
                        }
                    }
                    iN += iC3;
                    break;
                case 50:
                    gn2 gn2Var = (gn2) unsafe.getObject(wk2Var, j);
                    fn2 fn2Var = (fn2) C(i6);
                    if (gn2Var.isEmpty()) {
                        iA7 = 0;
                    } else {
                        iA7 = 0;
                        for (Map.Entry entry : gn2Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            p11 p11Var = fn2Var.a;
                            int iA15 = tl2.a(i9 << 3);
                            int iB8 = fn2.b(p11Var, key, value);
                            iA7 = ck1.o(iB8, iB8, iA15, iA7);
                        }
                    }
                    iN += iA7;
                    break;
                case 51:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case 52:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case 53:
                    if (s(wk2Var, i9, i6)) {
                        long jN = n(wk2Var, j);
                        iA10 = tl2.a(i9 << 3);
                        iB3 = tl2.b(jN);
                        iN += iB3 + iA10;
                    }
                    break;
                case 54:
                    if (s(wk2Var, i9, i6)) {
                        long jN2 = n(wk2Var, j);
                        iA10 = tl2.a(i9 << 3);
                        iB3 = tl2.b(jN2);
                        iN += iB3 + iA10;
                    }
                    break;
                case 55:
                    if (s(wk2Var, i9, i6)) {
                        long jM = m(wk2Var, j);
                        iA10 = tl2.a(i9 << 3);
                        iB3 = tl2.b(jM);
                        iN += iB3 + iA10;
                    }
                    break;
                case 56:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case 57:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case 58:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 1, iN);
                    }
                    break;
                case 59:
                    if (s(wk2Var, i9, i6)) {
                        int i20 = i9 << 3;
                        Object object3 = unsafe.getObject(wk2Var, j);
                        if (object3 instanceof hl2) {
                            iA11 = tl2.a(i20);
                            iB4 = ((hl2) object3).b();
                        } else {
                            iA11 = tl2.a(i20);
                            iB4 = qo2.b((String) object3);
                        }
                        iN = ck1.o(iB4, iB4, iA11, iN);
                    }
                    break;
                case 60:
                    if (s(wk2Var, i9, i6)) {
                        Object object4 = unsafe.getObject(wk2Var, j);
                        yn2 yn2VarB5 = B(i6);
                        qh1 qh1Var22 = zn2.a;
                        iA3 = tl2.a(i9 << 3);
                        iC = ((wk2) object4).c(yn2VarB5);
                        iN = ck1.o(iC, iC, iA3, iN);
                    }
                    break;
                case 61:
                    if (s(wk2Var, i9, i6)) {
                        hl2 hl2Var2 = (hl2) unsafe.getObject(wk2Var, j);
                        iA11 = tl2.a(i9 << 3);
                        iB4 = hl2Var2.b();
                        iN = ck1.o(iB4, iB4, iA11, iN);
                    }
                    break;
                case 62:
                    if (s(wk2Var, i9, i6)) {
                        iM = m(wk2Var, j);
                        iA12 = tl2.a(i9 << 3);
                        iN = ck1.n(iM, iA12, iN);
                    }
                    break;
                case 63:
                    if (s(wk2Var, i9, i6)) {
                        long jM2 = m(wk2Var, j);
                        iA10 = tl2.a(i9 << 3);
                        iB3 = tl2.b(jM2);
                        iN += iB3 + iA10;
                    }
                    break;
                case 64:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 4, iN);
                    }
                    break;
                case 65:
                    if (s(wk2Var, i9, i6)) {
                        iN = ck1.n(i9 << 3, 8, iN);
                    }
                    break;
                case 66:
                    if (s(wk2Var, i9, i6)) {
                        int iM2 = m(wk2Var, j);
                        iA12 = tl2.a(i9 << 3);
                        iM = (iM2 >> 31) ^ (iM2 + iM2);
                        iN = ck1.n(iM, iA12, iN);
                    }
                    break;
                case 67:
                    if (s(wk2Var, i9, i6)) {
                        long jN3 = n(wk2Var, j);
                        iA10 = tl2.a(i9 << 3);
                        iB3 = tl2.b((jN3 >> 63) ^ (jN3 + jN3));
                        iN += iB3 + iA10;
                    }
                    break;
                case 68:
                    if (s(wk2Var, i9, i6)) {
                        wk2 wk2Var4 = (wk2) unsafe.getObject(wk2Var, j);
                        yn2 yn2VarB6 = B(i6);
                        qh1 qh1Var23 = zn2.a;
                        int iA16 = tl2.a(i9 << 3);
                        i3 = iA16 + iA16;
                        iC2 = wk2Var4.c(yn2VarB6);
                        iZ = iC2 + i3;
                        iN += iZ;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.yn2
    public final boolean d(dm2 dm2Var, dm2 dm2Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = i(i);
                int iJ = j(i2);
                if (iJ <= 50 || iJ >= 69) {
                    long j = i2 & 1048575;
                    switch (iJ) {
                        case 0:
                            if (o(dm2Var, dm2Var2, i)) {
                                lo2 lo2Var = no2.c;
                                if (Double.doubleToLongBits(lo2Var.C(dm2Var, j)) != Double.doubleToLongBits(lo2Var.C(dm2Var2, j))) {
                                }
                            }
                            break;
                        case 1:
                            if (o(dm2Var, dm2Var2, i)) {
                                lo2 lo2Var2 = no2.c;
                                if (Float.floatToIntBits(lo2Var2.z(dm2Var, j)) != Float.floatToIntBits(lo2Var2.z(dm2Var2, j))) {
                                }
                            }
                            break;
                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                            if (!o(dm2Var, dm2Var2, i) || no2.g(dm2Var, j) != no2.g(dm2Var2, j)) {
                            }
                            break;
                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                            if (!o(dm2Var, dm2Var2, i) || no2.g(dm2Var, j) != no2.g(dm2Var2, j)) {
                            }
                            break;
                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                            if (!o(dm2Var, dm2Var2, i) || no2.g(dm2Var, j) != no2.g(dm2Var2, j)) {
                            }
                            break;
                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (o(dm2Var, dm2Var2, i)) {
                                lo2 lo2Var3 = no2.c;
                                if (lo2Var3.v(dm2Var, j) != lo2Var3.v(dm2Var2, j)) {
                                }
                            }
                            break;
                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            if (!o(dm2Var, dm2Var2, i) || !zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j))) {
                            }
                            break;
                        case 9:
                            if (!o(dm2Var, dm2Var2, i) || !zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j))) {
                            }
                            break;
                        case 10:
                            if (!o(dm2Var, dm2Var2, i) || !zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j))) {
                            }
                            break;
                        case 11:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case 12:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case 13:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case 14:
                            if (!o(dm2Var, dm2Var2, i) || no2.g(dm2Var, j) != no2.g(dm2Var2, j)) {
                            }
                            break;
                        case 15:
                            if (!o(dm2Var, dm2Var2, i) || no2.e(dm2Var, j) != no2.e(dm2Var2, j)) {
                            }
                            break;
                        case 16:
                            if (!o(dm2Var, dm2Var2, i) || no2.g(dm2Var, j) != no2.g(dm2Var2, j)) {
                            }
                            break;
                        case 17:
                            if (!o(dm2Var, dm2Var2, i) || !zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j))) {
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
                            zA = zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j));
                            if (zA) {
                            }
                            break;
                        case 50:
                            zA = zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j));
                            if (zA) {
                            }
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
                            long j2 = iArr[i + 2] & 1048575;
                            if (no2.e(dm2Var, j2) == no2.e(dm2Var2, j2) && zn2.a(no2.i(dm2Var, j), no2.i(dm2Var2, j))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i3 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j3 = iArr[i4 + 2] & 1048575;
                        if (no2.e(dm2Var, j3) != no2.e(dm2Var2, j3)) {
                            return false;
                        }
                        if (!s(dm2Var, 0, i4)) {
                            long jI = i(i4) & 1048575;
                            if (!zn2.a(no2.i(dm2Var, jI), no2.i(dm2Var2, jI))) {
                            }
                        }
                        i3++;
                    } else if (dm2Var.zzc.equals(dm2Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:226:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yn2
    public final void e(Object obj, we weVar, vl2 vl2Var) throws Throwable {
        Object obj2;
        Object objI;
        Object objI2;
        on2 on2Var;
        qh1 qh1Var;
        Object obj3;
        on2 on2Var2;
        Object objV;
        Object obj4;
        on2 on2Var3 = this;
        ll2 ll2Var = (ll2) weVar.d;
        int[] iArr = on2Var3.g;
        int i = on2Var3.i;
        int i2 = on2Var3.h;
        vl2Var.getClass();
        l(obj);
        qh1 qh1Var2 = on2Var3.j;
        Object objV2 = null;
        while (true) {
            try {
                int iG0 = weVar.g0();
                int iU = (iG0 < on2Var3.c || iG0 > on2Var3.d) ? -1 : on2Var3.u(iG0, 0);
                if (iU >= 0) {
                    int i3 = on2Var3.i(iU);
                    try {
                        try {
                            switch (j(i3)) {
                                case 0:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2 on2Var4 = on2Var3;
                                    int i4 = i3 & 1048575;
                                    try {
                                        weVar.V(1);
                                        on2Var = on2Var4;
                                        no2.c.E(obj, i4, ll2Var.o());
                                        on2Var.r(iU, obj);
                                        on2Var3 = on2Var;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                        objI = objV2;
                                        while (i2 < i) {
                                            objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                            i2++;
                                        }
                                        if (objI != null) {
                                            qh1Var2.getClass();
                                            ((dm2) obj).zzc = (ho2) objI;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(5);
                                    no2.c.B(obj, i3 & 1048575, ll2Var.p());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.h(obj, i3 & 1048575, ll2Var.r());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.h(obj, i3 & 1048575, ll2Var.q());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.LONG_FIELD_NUMBER /* 4 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.f(obj, i3 & 1048575, ll2Var.s());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.STRING_FIELD_NUMBER /* 5 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(1);
                                    no2.h(obj, i3 & 1048575, ll2Var.t());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(5);
                                    no2.f(obj, i3 & 1048575, ll2Var.u());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.c.x(obj, i3 & 1048575, ll2Var.v());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    on2Var2.J(i3, weVar, obj);
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    wk2 wk2Var = (wk2) on2Var2.E(iU, obj);
                                    yn2 yn2VarB = on2Var2.B(iU);
                                    weVar.V(2);
                                    weVar.W(wk2Var, yn2VarB, vl2Var);
                                    on2Var2.F(iU, obj, wk2Var);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    no2.j(obj, i3 & 1048575, weVar.E0());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.f(obj, i3 & 1048575, ll2Var.A());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    int iB = ll2Var.B();
                                    qk2 qk2VarD = on2Var2.D(iU);
                                    if (qk2VarD != null && !qk2VarD.a(iB)) {
                                        qh1 qh1Var3 = zn2.a;
                                        if (obj2 == null) {
                                            qh1Var.getClass();
                                            objV = qh1.v(obj);
                                        } else {
                                            objV = obj2;
                                        }
                                        qh1Var.getClass();
                                        ((ho2) objV).d(iG0 << 3, Long.valueOf(iB));
                                        on2Var3 = on2Var2;
                                        objV2 = objV;
                                        qh1Var2 = qh1Var;
                                    }
                                    no2.f(obj, i3 & 1048575, iB);
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(5);
                                    no2.f(obj, i3 & 1048575, ll2Var.C());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(1);
                                    no2.h(obj, i3 & 1048575, ll2Var.D());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.f(obj, i3 & 1048575, ll2Var.E());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    weVar.V(0);
                                    no2.h(obj, i3 & 1048575, ll2Var.F());
                                    on2Var2.r(iU, obj);
                                    on2Var = on2Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var2 = on2Var3;
                                    obj3 = obj;
                                    try {
                                        wk2 wk2Var2 = (wk2) on2Var2.E(iU, obj3);
                                        yn2 yn2VarB2 = on2Var2.B(iU);
                                        weVar.V(3);
                                        weVar.X(wk2Var2, yn2VarB2, vl2Var);
                                        on2Var2.F(iU, obj3, wk2Var2);
                                        on2Var = on2Var2;
                                        on2Var3 = on2Var;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                    } catch (vm2 unused) {
                                        on2Var = on2Var2;
                                        objV2 = obj2;
                                        if (objV2 == null) {
                                            try {
                                                qh1Var.getClass();
                                                objV2 = qh1.v(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                qh1Var2 = qh1Var;
                                                objI = objV2;
                                                while (i2 < i) {
                                                    objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                                    i2++;
                                                }
                                                if (objI != null) {
                                                    qh1Var2.getClass();
                                                    ((dm2) obj).zzc = (ho2) objI;
                                                }
                                                throw th;
                                            }
                                        }
                                        qh1Var.getClass();
                                        if (!qh1.w(0, weVar, objV2)) {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                i2++;
                                                on2Var = this;
                                                obj3 = obj;
                                            }
                                            qh1Var2 = qh1Var;
                                            if (objI2 != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI2;
                                            }
                                        }
                                        on2Var3 = this;
                                        qh1Var2 = qh1Var;
                                    }
                                    break;
                                case 18:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.G0(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 19:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.H0(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 20:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.F(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 21:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.I0(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 22:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.G(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 23:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.H(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 24:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.I(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 25:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.J(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 26:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    if ((536870912 & i3) != 0) {
                                        weVar.K(vi.h(obj, i3 & 1048575), true);
                                    } else {
                                        weVar.K(vi.h(obj, i3 & 1048575), false);
                                    }
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 27:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.L(vi.h(obj, i3 & 1048575), on2Var.B(iU), vl2Var);
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 28:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    weVar.N(vi.h(obj, i3 & 1048575));
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 29:
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            weVar.O(vi.h(obj3, i3 & 1048575));
                                            on2Var3 = on2Var;
                                            qh1Var2 = qh1Var;
                                            objV2 = obj2;
                                        } catch (vm2 unused2) {
                                            objV2 = obj2;
                                            if (objV2 == null) {
                                                qh1Var.getClass();
                                                objV2 = qh1.v(obj3);
                                            }
                                            qh1Var.getClass();
                                            if (!qh1.w(0, weVar, objV2)) {
                                                objI2 = objV2;
                                                while (i2 < i) {
                                                    objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                    i2++;
                                                    on2Var = this;
                                                    obj3 = obj;
                                                }
                                                qh1Var2 = qh1Var;
                                                if (objI2 != null) {
                                                    qh1Var2.getClass();
                                                    ((dm2) obj).zzc = (ho2) objI2;
                                                }
                                            }
                                            on2Var3 = this;
                                            qh1Var2 = qh1Var;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                        objI = objV2;
                                        while (i2 < i) {
                                            objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                            i2++;
                                        }
                                        if (objI != null) {
                                            qh1Var2.getClass();
                                            ((dm2) obj).zzc = (ho2) objI;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    on2Var = on2Var3;
                                    qh1Var = qh1Var2;
                                    obj3 = obj;
                                    Object obj5 = objV2;
                                    try {
                                        um2 um2VarH = vi.h(obj3, i3 & 1048575);
                                        weVar.P(um2VarH);
                                        try {
                                            objV2 = zn2.c(obj3, iG0, um2VarH, on2Var.D(iU), obj5, qh1Var);
                                            qh1Var = qh1Var;
                                            on2Var3 = on2Var;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            qh1Var = qh1Var;
                                            qh1Var2 = qh1Var;
                                            objV2 = obj2;
                                            objI = objV2;
                                            while (i2 < i) {
                                                objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                                i2++;
                                            }
                                            if (objI != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI;
                                            }
                                            throw th;
                                        }
                                    } catch (vm2 unused3) {
                                        obj2 = obj5;
                                        objV2 = obj2;
                                        if (objV2 == null) {
                                            qh1Var.getClass();
                                            objV2 = qh1.v(obj3);
                                        }
                                        qh1Var.getClass();
                                        if (!qh1.w(0, weVar, objV2)) {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                i2++;
                                                on2Var = this;
                                                obj3 = obj;
                                            }
                                            qh1Var2 = qh1Var;
                                            if (objI2 != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI2;
                                            }
                                        }
                                        on2Var3 = this;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    qh1Var2 = qh1Var;
                                    break;
                                case 31:
                                    on2Var = on2Var3;
                                    weVar.Q(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 32:
                                    on2Var = on2Var3;
                                    weVar.R(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 33:
                                    on2Var = on2Var3;
                                    weVar.S(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 34:
                                    on2Var = on2Var3;
                                    weVar.T(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 35:
                                    on2Var = on2Var3;
                                    weVar.G0(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 36:
                                    on2Var = on2Var3;
                                    weVar.H0(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 37:
                                    on2Var = on2Var3;
                                    weVar.F(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 38:
                                    on2Var = on2Var3;
                                    weVar.I0(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 39:
                                    on2Var = on2Var3;
                                    weVar.G(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 40:
                                    on2Var = on2Var3;
                                    weVar.H(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 41:
                                    on2Var = on2Var3;
                                    weVar.I(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 42:
                                    on2Var = on2Var3;
                                    weVar.J(vi.h(obj, i3 & 1048575));
                                    obj2 = objV2;
                                    qh1Var = qh1Var2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 43:
                                    on2Var = on2Var3;
                                    obj3 = obj;
                                    try {
                                        weVar.O(vi.h(obj3, i3 & 1048575));
                                        obj2 = objV2;
                                        qh1Var = qh1Var2;
                                        on2Var3 = on2Var;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                    } catch (vm2 unused4) {
                                        obj2 = objV2;
                                        qh1Var = qh1Var2;
                                        objV2 = obj2;
                                        if (objV2 == null) {
                                            qh1Var.getClass();
                                            objV2 = qh1.v(obj3);
                                        }
                                        qh1Var.getClass();
                                        if (!qh1.w(0, weVar, objV2)) {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                i2++;
                                                on2Var = this;
                                                obj3 = obj;
                                            }
                                            qh1Var2 = qh1Var;
                                            if (objI2 != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI2;
                                            }
                                        }
                                        on2Var3 = this;
                                        qh1Var2 = qh1Var;
                                    }
                                    break;
                                case 44:
                                    qh1Var = qh1Var2;
                                    try {
                                        um2 um2VarH2 = vi.h(obj, i3 & 1048575);
                                        weVar.P(um2VarH2);
                                        qk2 qk2VarD2 = on2Var3.D(iU);
                                        on2Var = on2Var3;
                                        obj3 = obj;
                                        Object obj6 = objV2;
                                        try {
                                            try {
                                                objV2 = zn2.c(obj3, iG0, um2VarH2, qk2VarD2, obj6, qh1Var);
                                                qh1Var2 = qh1Var;
                                                on2Var3 = on2Var;
                                            } catch (vm2 unused5) {
                                                obj2 = obj6;
                                                qh1Var = qh1Var;
                                                objV2 = obj2;
                                                if (objV2 == null) {
                                                    qh1Var.getClass();
                                                    objV2 = qh1.v(obj3);
                                                }
                                                qh1Var.getClass();
                                                if (!qh1.w(0, weVar, objV2)) {
                                                    objI2 = objV2;
                                                    while (i2 < i) {
                                                        objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                        i2++;
                                                        on2Var = this;
                                                        obj3 = obj;
                                                    }
                                                    qh1Var2 = qh1Var;
                                                    if (objI2 != null) {
                                                        qh1Var2.getClass();
                                                        ((dm2) obj).zzc = (ho2) objI2;
                                                    }
                                                }
                                                on2Var3 = this;
                                                qh1Var2 = qh1Var;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            objV2 = obj6;
                                            qh1Var2 = qh1Var;
                                            obj2 = objV2;
                                            objV2 = obj2;
                                            objI = objV2;
                                            while (i2 < i) {
                                                objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                                i2++;
                                            }
                                            if (objI != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI;
                                            }
                                            throw th;
                                        }
                                    } catch (vm2 unused6) {
                                        on2Var = on2Var3;
                                        obj3 = obj;
                                        obj2 = objV2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        qh1Var2 = qh1Var;
                                    }
                                    break;
                                case 45:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.Q(vi.h(obj4, i3 & 1048575));
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 46:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.R(vi.h(obj4, i3 & 1048575));
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 47:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.S(vi.h(obj4, i3 & 1048575));
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 48:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.T(vi.h(obj4, i3 & 1048575));
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 49:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.M(vi.h(obj4, i3 & 1048575), on2Var3.B(iU), vl2Var);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 50:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    Object objC = on2Var3.C(iU);
                                    long jI = on2Var3.i(iU) & 1048575;
                                    Object objI3 = no2.i(obj4, jI);
                                    if (objI3 == null) {
                                        objI3 = gn2.b.c();
                                        no2.j(obj4, jI, objI3);
                                    } else if (!((gn2) objI3).a) {
                                        Object objC2 = gn2.b.c();
                                        ba0.A(objC2, objI3);
                                        no2.j(obj4, jI, objC2);
                                        objI3 = objC2;
                                    }
                                    weVar.U((gn2) objI3, ((fn2) objC).c(), vl2Var);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 51:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(1);
                                    no2.j(obj4, i3 & 1048575, Double.valueOf(ll2Var.o()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 52:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(5);
                                    no2.j(obj4, i3 & 1048575, Float.valueOf(ll2Var.p()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 53:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Long.valueOf(ll2Var.r()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 54:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Long.valueOf(ll2Var.q()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 55:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(ll2Var.s()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 56:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(1);
                                    no2.j(obj4, i3 & 1048575, Long.valueOf(ll2Var.t()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 57:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(5);
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(ll2Var.u()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 58:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Boolean.valueOf(ll2Var.v()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 59:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    on2Var3.J(i3, weVar, obj4);
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 60:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    wk2 wk2Var3 = (wk2) on2Var3.G(obj4, iG0, iU);
                                    yn2 yn2VarB3 = on2Var3.B(iU);
                                    weVar.V(2);
                                    weVar.W(wk2Var3, yn2VarB3, vl2Var);
                                    on2Var3.H(obj4, iG0, iU, wk2Var3);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 61:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    no2.j(obj4, i3 & 1048575, weVar.E0());
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 62:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(ll2Var.A()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 63:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    int iB2 = ll2Var.B();
                                    qk2 qk2VarD3 = on2Var3.D(iU);
                                    if (qk2VarD3 != null && !qk2VarD3.a(iB2)) {
                                        qh1 qh1Var4 = zn2.a;
                                        if (objV2 == null) {
                                            qh1Var.getClass();
                                            objV = qh1.v(obj4);
                                        } else {
                                            objV = objV2;
                                        }
                                        qh1Var.getClass();
                                        ((ho2) objV).d(iG0 << 3, Long.valueOf(iB2));
                                        objV2 = objV;
                                        qh1Var2 = qh1Var;
                                    }
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(iB2));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 64:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(5);
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(ll2Var.C()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 65:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(1);
                                    no2.j(obj4, i3 & 1048575, Long.valueOf(ll2Var.D()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 66:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Integer.valueOf(ll2Var.E()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 67:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    weVar.V(0);
                                    no2.j(obj4, i3 & 1048575, Long.valueOf(ll2Var.F()));
                                    on2Var3.t(obj4, iG0, iU);
                                    on2Var = on2Var3;
                                    obj2 = objV2;
                                    on2Var3 = on2Var;
                                    qh1Var2 = qh1Var;
                                    objV2 = obj2;
                                    break;
                                case 68:
                                    qh1Var = qh1Var2;
                                    obj4 = obj;
                                    try {
                                        wk2 wk2Var4 = (wk2) on2Var3.G(obj4, iG0, iU);
                                        yn2 yn2VarB4 = on2Var3.B(iU);
                                        weVar.V(3);
                                        weVar.X(wk2Var4, yn2VarB4, vl2Var);
                                        on2Var3.H(obj4, iG0, iU, wk2Var4);
                                        on2Var = on2Var3;
                                        obj2 = objV2;
                                        on2Var3 = on2Var;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                    } catch (vm2 unused7) {
                                        on2Var = on2Var3;
                                        obj2 = objV2;
                                        obj3 = obj4;
                                        objV2 = obj2;
                                        if (objV2 == null) {
                                            qh1Var.getClass();
                                            objV2 = qh1.v(obj3);
                                        }
                                        qh1Var.getClass();
                                        if (!qh1.w(0, weVar, objV2)) {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                i2++;
                                                on2Var = this;
                                                obj3 = obj;
                                            }
                                            qh1Var2 = qh1Var;
                                            if (objI2 != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI2;
                                            }
                                        }
                                        on2Var3 = this;
                                        qh1Var2 = qh1Var;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objV2;
                                        qh1Var2 = qh1Var;
                                        objV2 = obj2;
                                        objI = objV2;
                                        while (i2 < i) {
                                            objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                            i2++;
                                        }
                                        if (objI != null) {
                                            qh1Var2.getClass();
                                            ((dm2) obj).zzc = (ho2) objI;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objV2 == null) {
                                        qh1Var2.getClass();
                                        objV2 = qh1.v(obj);
                                    }
                                    try {
                                        qh1Var2.getClass();
                                        if (qh1.w(0, weVar, objV2)) {
                                            qh1Var = qh1Var2;
                                            qh1Var2 = qh1Var;
                                        } else {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var3.I(obj, iArr[i2], objI2, qh1Var2, obj);
                                                i2++;
                                                qh1Var2 = qh1Var2;
                                            }
                                            qh1Var = qh1Var2;
                                            qh1Var2 = qh1Var;
                                        }
                                    } catch (vm2 unused8) {
                                        qh1Var = qh1Var2;
                                        on2Var = on2Var3;
                                        obj3 = obj;
                                        if (objV2 == null) {
                                            qh1Var.getClass();
                                            objV2 = qh1.v(obj3);
                                        }
                                        qh1Var.getClass();
                                        if (!qh1.w(0, weVar, objV2)) {
                                            objI2 = objV2;
                                            while (i2 < i) {
                                                objI2 = on2Var.I(obj3, iArr[i2], objI2, qh1Var, obj);
                                                i2++;
                                                on2Var = this;
                                                obj3 = obj;
                                            }
                                            qh1Var2 = qh1Var;
                                            if (objI2 != null) {
                                                qh1Var2.getClass();
                                                ((dm2) obj).zzc = (ho2) objI2;
                                            }
                                        }
                                        on2Var3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        qh1Var = qh1Var2;
                                        qh1Var2 = qh1Var;
                                        objI = objV2;
                                        while (i2 < i) {
                                            objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                                            i2++;
                                        }
                                        if (objI != null) {
                                            qh1Var2.getClass();
                                            ((dm2) obj).zzc = (ho2) objI;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj2 = objV2;
                        }
                    } catch (vm2 unused9) {
                        on2Var = on2Var3;
                        obj2 = objV2;
                        qh1Var = qh1Var2;
                        obj3 = obj;
                    }
                } else if (iG0 == Integer.MAX_VALUE) {
                    objI2 = objV2;
                    while (i2 < i) {
                        objI2 = on2Var3.I(obj, iArr[i2], objI2, qh1Var2, obj);
                        i2++;
                        on2Var3 = this;
                    }
                } else {
                    if (objV2 == null) {
                        qh1Var2.getClass();
                        objV2 = qh1.v(obj);
                    }
                    try {
                        qh1Var2.getClass();
                        if (qh1.w(0, weVar, objV2)) {
                            on2Var3 = this;
                        } else {
                            objI2 = objV2;
                            while (i2 < i) {
                                objI2 = I(obj, iArr[i2], objI2, qh1Var2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objI = objV2;
                        while (i2 < i) {
                            objI = I(obj, iArr[i2], objI, qh1Var2, obj);
                            i2++;
                        }
                        if (objI != null) {
                            qh1Var2.getClass();
                            ((dm2) obj).zzc = (ho2) objI;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objI2 != null) {
            qh1Var2.getClass();
            ((dm2) obj).zzc = (ho2) objI2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // defpackage.yn2
    public final void f(Object obj) {
        if (!k(obj)) {
            return;
        }
        if (obj instanceof dm2) {
            dm2 dm2Var = (dm2) obj;
            dm2Var.l();
            dm2Var.zza = 0;
            dm2Var.h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                ho2 ho2Var = ((dm2) obj).zzc;
                if (ho2Var.e) {
                    ho2Var.e = false;
                    return;
                }
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int iJ = j(i2);
            long j = i3;
            if (iJ != 9) {
                if (iJ != 60 && iJ != 68) {
                    switch (iJ) {
                        case 17:
                            if (q(i, obj)) {
                                B(i).f(l.getObject(obj, j));
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
                            xk2 xk2Var = (xk2) ((um2) no2.i(obj, j));
                            if (xk2Var.a) {
                                xk2Var.a = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = l;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((gn2) object).a = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (s(obj, iArr[i], i)) {
                    B(i).f(l.getObject(obj, j));
                }
            } else if (q(i, obj)) {
                B(i).f(l.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.yn2
    public final int g(dm2 dm2Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int i6 = i(i5);
            int iJ = j(i6);
            if (iJ <= 50 || iJ >= 69) {
                long j = i6 & 1048575;
                int iHashCode2 = 37;
                switch (iJ) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(no2.c.C(dm2Var, j));
                        byte[] bArr = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(no2.c.z(dm2Var, j));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = no2.g(dm2Var, j);
                        byte[] bArr2 = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = no2.g(dm2Var, j);
                        byte[] bArr3 = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = no2.g(dm2Var, j);
                        byte[] bArr4 = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = iHashCode * 53;
                        boolean zV = no2.c.v(dm2Var, j);
                        byte[] bArr5 = sm2.a;
                        i3 = zV ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) no2.i(dm2Var, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objI = no2.i(dm2Var, j);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.i(dm2Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = no2.g(dm2Var, j);
                        byte[] bArr6 = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.e(dm2Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = no2.g(dm2Var, j);
                        byte[] bArr7 = sm2.a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objI2 = no2.i(dm2Var, j);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.i(dm2Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = no2.i(dm2Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i7 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i7 >= iArr.length) {
                return dm2Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i8 = iArr[i7];
            if (!s(dm2Var, 0, i8)) {
                iHashCode = no2.i(dm2Var, i(i8) & 1048575).hashCode() + (iHashCode * 53);
            }
            i7++;
        }
    }

    @Override // defpackage.yn2
    public final void h(Object obj, byte[] bArr, int i, int i2, zk2 zk2Var) {
        w(obj, bArr, i, i2, 0, zk2Var);
    }

    public final int i(int i) {
        return this.a[i + 1];
    }

    public final boolean o(dm2 dm2Var, dm2 dm2Var2, int i) {
        return q(i, dm2Var) == q(i, dm2Var2);
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return q(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & no2.e(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int i3 = i(i);
        long j2 = i3 & 1048575;
        switch (j(i3)) {
            case 0:
                if (Double.doubleToRawLongBits(no2.c.C(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(no2.c.z(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (no2.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (no2.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (no2.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return no2.c.v(obj, j2);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Object objI = no2.i(obj, j2);
                if (objI instanceof String) {
                    if (((String) objI).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objI instanceof hl2)) {
                    sm0.a();
                    return false;
                }
                if (hl2.b.equals(objI)) {
                    return false;
                }
                return true;
            case 9:
                if (no2.i(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (hl2.b.equals(no2.i(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (no2.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (no2.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (no2.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (no2.i(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                sm0.a();
                return false;
        }
    }

    public final void r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        no2.f(obj, j, (1 << (i2 >>> 20)) | no2.e(obj, j));
    }

    public final boolean s(Object obj, int i, int i2) {
        return no2.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void t(Object obj, int i, int i2) {
        no2.f(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int u(int i, int i2) {
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
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        */
    public final int w(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, defpackage.zk2 r40) {
        /*
            Method dump skipped, instruction units count: 3612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on2.w(java.lang.Object, byte[], int, int, int, zk2):int");
    }

    public final void z(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            int i2 = i(i) & 1048575;
            Unsafe unsafe = l;
            long j = i2;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            yn2 yn2VarB = B(i);
            if (!q(i, obj)) {
                if (k(object)) {
                    dm2 dm2VarZza = yn2VarB.zza();
                    yn2VarB.b(dm2VarZza, object);
                    unsafe.putObject(obj, j, dm2VarZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!k(object2)) {
                dm2 dm2VarZza2 = yn2VarB.zza();
                yn2VarB.b(dm2VarZza2, object2);
                unsafe.putObject(obj, j, dm2VarZza2);
                object2 = dm2VarZza2;
            }
            yn2VarB.b(object2, object);
        }
    }

    @Override // defpackage.yn2
    public final dm2 zza() {
        return ((dm2) this.e).i();
    }

    @Override // defpackage.yn2
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.h) {
            int i6 = this.g[i3];
            int i7 = this.i(i6);
            int[] iArr = this.a;
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = l.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            on2 on2Var = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || on2Var.p(obj2, i6, i, i2, i10)) {
                int iJ = j(i7);
                if (iJ != 9 && iJ != 17) {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (!on2Var.s(obj2, iArr[i6], i6) || on2Var.B(i6).zzl(no2.i(obj2, i7 & 1048575))) {
                                i3++;
                                this = on2Var;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                gn2 gn2Var = (gn2) no2.i(obj2, i7 & 1048575);
                                if (!gn2Var.isEmpty() && ((ro2) ((fn2) on2Var.C(i6)).a.c).a == so2.w) {
                                    yn2 yn2VarA = null;
                                    for (Object obj3 : gn2Var.values()) {
                                        if (yn2VarA == null) {
                                            yn2VarA = un2.c.a(obj3.getClass());
                                        }
                                        if (!yn2VarA.zzl(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = on2Var;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) no2.i(obj2, i7 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        yn2 yn2VarB = on2Var.B(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (yn2VarB.zzl(list.get(i11))) {
                            }
                        }
                    }
                    i3++;
                    this = on2Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!on2Var.p(obj2, i6, i, i2, i10) || on2Var.B(i6).zzl(no2.i(obj2, i7 & 1048575))) {
                    i3++;
                    this = on2Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }
}
