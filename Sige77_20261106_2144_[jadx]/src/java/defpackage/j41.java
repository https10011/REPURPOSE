package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j41 implements zl1 {
    public static final int[] n = new int[0];
    public static final Unsafe o = i32.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final d1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final z61 j;
    public final ly0 k;
    public final u22 l;
    public final s11 m;

    public j41(int[] iArr, Object[] objArr, int i, int i2, d1 d1Var, int[] iArr2, int i3, int i4, z61 z61Var, ly0 ly0Var, u22 u22Var, x80 x80Var, s11 s11Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = d1Var instanceof sh0;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = z61Var;
        this.k = ly0Var;
        this.l = u22Var;
        this.e = d1Var;
        this.m = s11Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = ts.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof sh0) {
            return ((sh0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    public static j41 w(if1 if1Var, z61 z61Var, ly0 ly0Var, u22 u22Var, x80 x80Var, s11 s11Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldF;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldF2;
        int i27;
        Object obj2;
        Field fieldF3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = if1Var.b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i61;
            i7 = iCharAt9;
        }
        Unsafe unsafe = o;
        Object[] objArr = if1Var.c;
        Class<?> cls = if1Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= i32) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i16;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i30;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i72 = i29;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int iCharAt12 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i25 = i6 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i80 == 12 && (ts.b(if1Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr3[i26] = fieldF2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr3[i27] = fieldF3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                    int i82 = i4;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i23 = iObjectFieldOffset3;
                    i18 = i82;
                    i22 = i6;
                    i20 = i81;
                    i21 = 0;
                    cls = cls;
                }
                i6 = i25;
                i26 = iCharAt12 * 2;
                obj = objArr3[i26];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr3[i26] = fieldF2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldF2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr3[i27] = fieldF3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldF3);
                int i83 = i4;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i23 = iObjectFieldOffset5;
                i18 = i83;
                i22 = i6;
                i20 = i81;
                i21 = 0;
                cls = cls;
            } else {
                int i84 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (if1Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            int i85 = i72 + 1;
                            int iCharAt13 = str.charAt(i72);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i20 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr3[i88] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i21 = iCharAt13 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            iArr[i64] = iObjectFieldOffset;
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i67;
                            int i90 = (i67 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr2[i90] = objArr3[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                                i18 = i4;
                                i65 = i89;
                            } else {
                                i19 = i91;
                                i65 = i89;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        }
                        if (i75 >= 18) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        }
                    }
                    i19 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                } else {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
            }
            int i92 = i67 + 1;
            iArr4[i67] = i76;
            int i93 = i67 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
            i67 += 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i34 = i20;
            i32 = 55296;
            i6 = i22;
            iArr3 = iArr4;
        }
        return new j41(iArr3, objArr2, i2, i5, if1Var.a, iArr, i7, i63, z61Var, ly0Var, u22Var, x80Var, s11Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) i32.c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) i32.c.h(obj, j)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, we weVar, zl1 zl1Var, w80 w80Var) throws tr0 {
        int iU;
        this.k.getClass();
        cr0 cr0VarA = ly0.a(obj, j);
        sn snVar = (sn) weVar.d;
        int i = weVar.a;
        if ((i & 7) != 3) {
            throw ur0.b();
        }
        do {
            sh0 sh0VarI = zl1Var.i();
            weVar.g(sh0VarI, zl1Var, w80Var);
            zl1Var.d(sh0VarI);
            cr0VarA.add(sh0VarI);
            if (snVar.c() || weVar.c != 0) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == i);
        weVar.c = iU;
    }

    public final void C(Object obj, int i, we weVar, zl1 zl1Var, w80 w80Var) throws ur0 {
        int iU;
        this.k.getClass();
        cr0 cr0VarA = ly0.a(obj, i & 1048575);
        sn snVar = (sn) weVar.d;
        int i2 = weVar.a;
        if ((i2 & 7) != 2) {
            throw ur0.b();
        }
        do {
            sh0 sh0VarI = zl1Var.i();
            weVar.h(sh0VarI, zl1Var, w80Var);
            zl1Var.d(sh0VarI);
            cr0VarA.add(sh0VarI);
            if (snVar.c() || weVar.c != 0) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == i2);
        weVar.c = iU;
    }

    public final void D(int i, we weVar, Object obj) throws tr0 {
        sn snVar = (sn) weVar.d;
        if ((536870912 & i) != 0) {
            weVar.B(2);
            i32.o(obj, i & 1048575, snVar.t());
        } else if (!this.f) {
            i32.o(obj, i & 1048575, weVar.j());
        } else {
            weVar.B(2);
            i32.o(obj, i & 1048575, snVar.s());
        }
    }

    public final void E(int i, we weVar, Object obj) throws tr0 {
        boolean z = (536870912 & i) != 0;
        ly0 ly0Var = this.k;
        if (z) {
            ly0Var.getClass();
            weVar.x(ly0.a(obj, i & 1048575), true);
        } else {
            ly0Var.getClass();
            weVar.x(ly0.a(obj, i & 1048575), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        i32.m(obj, j, (1 << (i2 >>> 20)) | i32.c.f(obj, j));
    }

    public final void H(Object obj, int i, int i2) {
        i32.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void I(Object obj, int i, d1 d1Var) {
        o.putObject(obj, L(i) & 1048575, d1Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, d1 d1Var) {
        o.putObject(obj, L(i2) & 1048575, d1Var);
        H(obj, i, i2);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, wa waVar) throws IOException {
        int i;
        int i2;
        boolean z;
        j41 j41Var = this;
        int[] iArr = j41Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iL = j41Var.L(i5);
            int i7 = iArr[i5];
            int iK = K(iL);
            if (iK <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & i3;
            switch (iK) {
                case 0:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        double d = i32.c.d(obj, j);
                        un unVar = (un) waVar.b;
                        unVar.getClass();
                        unVar.t(i7, Double.doubleToRawLongBits(d));
                    }
                    break;
                case 1:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        float fE = i32.c.e(obj, j);
                        un unVar2 = (un) waVar.b;
                        unVar2.getClass();
                        unVar2.r(i7, Float.floatToRawIntBits(fE));
                    }
                    j41Var = this;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).E(i7, unsafe.getLong(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).E(i7, unsafe.getLong(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).v(i7, unsafe.getInt(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).t(i7, unsafe.getLong(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).r(i7, unsafe.getInt(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).o(i7, i32.c.c(obj, j));
                    }
                    j41Var = this;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((un) waVar.b).z(i7, (String) object);
                        } else {
                            ((un) waVar.b).p(i7, (qj) object);
                        }
                    }
                    j41Var = this;
                    break;
                case 9:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).y(i7, (d1) unsafe.getObject(obj, j), j41Var.m(i5));
                    }
                    break;
                case 10:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).p(i7, (qj) unsafe.getObject(obj, j));
                    }
                    j41Var = this;
                    break;
                case 11:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).C(i7, unsafe.getInt(obj, j));
                    }
                    j41Var = this;
                    break;
                case 12:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).v(i7, unsafe.getInt(obj, j));
                    }
                    j41Var = this;
                    break;
                case 13:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).r(i7, unsafe.getInt(obj, j));
                    }
                    j41Var = this;
                    break;
                case 14:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        ((un) waVar.b).t(i7, unsafe.getLong(obj, j));
                    }
                    j41Var = this;
                    break;
                case 15:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((un) waVar.b).C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    j41Var = this;
                    break;
                case 16:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((un) waVar.b).E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    j41Var = this;
                    break;
                case 17:
                    if (j41Var.o(obj, i5, i4, i6, i)) {
                        waVar.p(i7, unsafe.getObject(obj, j), j41Var.m(i5));
                    }
                    break;
                case 18:
                    i4 = i4;
                    cm1.n(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 19:
                    i4 = i4;
                    cm1.r(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    cm1.t(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    cm1.z(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    cm1.s(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 23:
                    i4 = i4;
                    cm1.q(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 24:
                    i4 = i4;
                    cm1.p(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    cm1.m(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 26:
                    i2 = i4;
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = cm1.a;
                    if (list != null && !list.isEmpty()) {
                        un unVar3 = (un) waVar.b;
                        if (list instanceof cw0) {
                            cw0 cw0Var = (cw0) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objJ = cw0Var.j();
                                if (objJ instanceof String) {
                                    unVar3.z(i11, (String) objJ);
                                } else {
                                    unVar3.p(i11, (qj) objJ);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                unVar3.z(i11, (String) list.get(i13));
                            }
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zl1 zl1VarM = j41Var.m(i5);
                    Class cls2 = cm1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        waVar.getClass();
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((un) waVar.b).y(i14, (d1) list2.get(i15), zl1VarM);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = cm1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        waVar.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            ((un) waVar.b).p(i16, (qj) list3.get(i17));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    z = false;
                    cm1.y(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 30:
                    z = false;
                    cm1.o(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 31:
                    z = false;
                    cm1.u(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 32:
                    z = false;
                    cm1.v(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 33:
                    z = false;
                    cm1.w(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 34:
                    z = false;
                    cm1.x(iArr[i5], (List) unsafe.getObject(obj, j), waVar, false);
                    i4 = i4;
                    break;
                case 35:
                    i2 = i4;
                    cm1.n(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    cm1.r(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    cm1.t(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    cm1.z(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    cm1.s(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    cm1.q(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    cm1.p(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    cm1.m(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    cm1.y(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    cm1.o(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    cm1.u(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    cm1.v(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    cm1.w(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    cm1.x(iArr[i5], (List) unsafe.getObject(obj, j), waVar, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zl1 zl1VarM2 = j41Var.m(i5);
                    Class cls4 = cm1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        waVar.getClass();
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            waVar.p(i18, list4.get(i19), zl1VarM2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i20 = 2;
                        Object obj2 = j41Var.b[(i5 / 3) * 2];
                        j41Var.m.getClass();
                        p11 p11Var = ((q11) obj2).a;
                        un unVar4 = (un) waVar.b;
                        unVar4.getClass();
                        for (Map.Entry entry : ((r11) object2).entrySet()) {
                            unVar4.B(i7, i20);
                            unVar4.D(q11.a(p11Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            qa0.b(unVar4, (da2) p11Var.b, 1, key);
                            i20 = 2;
                            qa0.b(unVar4, (da2) p11Var.c, 2, value);
                            i4 = i4;
                        }
                    }
                    i2 = i4;
                    i4 = i2;
                    break;
                case 51:
                    if (j41Var.q(obj, i7, i5)) {
                        double dDoubleValue = ((Double) i32.c.h(obj, j)).doubleValue();
                        un unVar5 = (un) waVar.b;
                        unVar5.getClass();
                        unVar5.t(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (j41Var.q(obj, i7, i5)) {
                        float fFloatValue = ((Float) i32.c.h(obj, j)).floatValue();
                        un unVar6 = (un) waVar.b;
                        unVar6.getClass();
                        unVar6.r(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).E(i7, z(obj, j));
                    }
                    break;
                case 54:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).E(i7, z(obj, j));
                    }
                    break;
                case 55:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).v(i7, y(obj, j));
                    }
                    break;
                case 56:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).t(i7, z(obj, j));
                    }
                    break;
                case 57:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).r(i7, y(obj, j));
                    }
                    break;
                case 58:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).o(i7, ((Boolean) i32.c.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (j41Var.q(obj, i7, i5)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((un) waVar.b).z(i7, (String) object3);
                        } else {
                            ((un) waVar.b).p(i7, (qj) object3);
                        }
                    }
                    break;
                case 60:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).y(i7, (d1) unsafe.getObject(obj, j), j41Var.m(i5));
                    }
                    break;
                case 61:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).p(i7, (qj) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).C(i7, y(obj, j));
                    }
                    break;
                case 63:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).v(i7, y(obj, j));
                    }
                    break;
                case 64:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).r(i7, y(obj, j));
                    }
                    break;
                case 65:
                    if (j41Var.q(obj, i7, i5)) {
                        ((un) waVar.b).t(i7, z(obj, j));
                    }
                    break;
                case 66:
                    if (j41Var.q(obj, i7, i5)) {
                        int iY = y(obj, j);
                        ((un) waVar.b).C(i7, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (j41Var.q(obj, i7, i5)) {
                        long jZ = z(obj, j);
                        ((un) waVar.b).E(i7, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (j41Var.q(obj, i7, i5)) {
                        waVar.p(i7, unsafe.getObject(obj, j), j41Var.m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        j41Var.l.getClass();
        ((sh0) obj).unknownFields.d(waVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zl1
    public final int a(sh0 sh0Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iL = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iL;
            int i6 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i = i3 * 53;
                    iB = dr0.b(Double.doubleToLongBits(i32.c.d(sh0Var, j)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(i32.c.e(sh0Var, j));
                    i3 = iB + i;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    i = i3 * 53;
                    iB = dr0.b(i32.c.g(sh0Var, j));
                    i3 = iB + i;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i3 * 53;
                    iB = dr0.b(i32.c.g(sh0Var, j));
                    i3 = iB + i;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    iB = dr0.b(i32.c.g(sh0Var, j));
                    i3 = iB + i;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean zC = i32.c.c(sh0Var, j);
                    Charset charset = dr0.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    iB = ((String) i32.c.h(sh0Var, j)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = i32.c.h(sh0Var, j);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = i32.c.h(sh0Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = dr0.b(i32.c.g(sh0Var, j));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = i32.c.f(sh0Var, j);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = dr0.b(i32.c.g(sh0Var, j));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = i32.c.h(sh0Var, j);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iB = i32.c.h(sh0Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = i32.c.h(sh0Var, j).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(Double.doubleToLongBits(((Double) i32.c.h(sh0Var, j)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) i32.c.h(sh0Var, j)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(z(sh0Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(z(sh0Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(z(sh0Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(sh0Var, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) i32.c.h(sh0Var, j)).booleanValue();
                        Charset charset2 = dr0.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = ((String) i32.c.h(sh0Var, j)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = i32.c.h(sh0Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = i32.c.h(sh0Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(z(sh0Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = y(sh0Var, j);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = dr0.b(z(sh0Var, j));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(sh0Var, i5, i4)) {
                        i = i3 * 53;
                        iB = i32.c.h(sh0Var, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        this.l.getClass();
        return sh0Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.zl1
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            ur.g(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                cm1.k(this.l, obj, obj2);
                return;
            }
            int iL = L(i);
            long j = 1048575 & iL;
            int i2 = iArr[i];
            switch (K(iL)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        h32 h32Var = i32.c;
                        obj3 = obj;
                        h32Var.l(obj3, j, h32Var.d(obj2, j));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        h32 h32Var2 = i32.c;
                        h32Var2.m(obj, j, h32Var2.e(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (n(i, obj2)) {
                        i32.n(obj, j, i32.c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n(i, obj2)) {
                        i32.n(obj, j, i32.c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i, obj2)) {
                        i32.n(obj, j, i32.c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        h32 h32Var3 = i32.c;
                        h32Var3.j(obj, j, h32Var3.c(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i, obj2)) {
                        i32.o(obj, j, i32.c.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        i32.o(obj, j, i32.c.h(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        i32.n(obj, j, i32.c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        i32.m(obj, j, i32.c.f(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        i32.n(obj, j, i32.c.g(obj2, j));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                    this.k.getClass();
                    h32 h32Var4 = i32.c;
                    cr0 cr0VarC = (cr0) h32Var4.h(obj, j);
                    cr0 cr0Var = (cr0) h32Var4.h(obj2, j);
                    int size = cr0VarC.size();
                    int size2 = cr0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((i1) cr0VarC).a) {
                            cr0VarC = ((ud1) cr0VarC).c(size2 + size);
                        }
                        cr0VarC.addAll(cr0Var);
                    }
                    if (size > 0) {
                        cr0Var = cr0VarC;
                    }
                    i32.o(obj, j, cr0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = cm1.a;
                    h32 h32Var5 = i32.c;
                    Object objH = h32Var5.h(obj, j);
                    Object objH2 = h32Var5.h(obj2, j);
                    this.m.getClass();
                    i32.o(obj, j, s11.a(objH, objH2));
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
                    if (q(obj2, i2, i)) {
                        i32.o(obj, j, i32.c.h(obj2, j));
                        H(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i2, i)) {
                        i32.o(obj, j, i32.c.h(obj2, j));
                        H(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
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

    @Override // defpackage.zl1
    public final void c(Object obj, wa waVar) throws IOException {
        waVar.getClass();
        M(obj, waVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // defpackage.zl1
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof sh0) {
                sh0 sh0Var = (sh0) obj;
                sh0Var.k(Integer.MAX_VALUE);
                sh0Var.memoizedHashCode = 0;
                sh0Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iL = L(i);
                long j = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).d(o.getObject(obj, j));
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
                                this.k.getClass();
                                i1 i1Var = (i1) ((cr0) i32.c.h(obj, j));
                                if (i1Var.a) {
                                    i1Var.a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((r11) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(obj, iArr[i], i)) {
                        m(i).d(o.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).d(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            t22 t22Var = ((sh0) obj).unknownFields;
            if (t22Var.e) {
                t22Var.e = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // defpackage.zl1
    public final int e(sh0 sh0Var) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iF;
        int iH7;
        int iA;
        int iC;
        int iH8;
        int size;
        int i2;
        int iH9;
        int iH10;
        int size2;
        int iH11;
        int i3;
        int iJ3;
        int iA2;
        int iH12;
        int i4;
        j41 j41Var = this;
        sh0 sh0Var2 = sh0Var;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iF2 = 0;
        while (true) {
            int[] iArr = j41Var.a;
            if (i6 >= iArr.length) {
                j41Var.l.getClass();
                return sh0Var2.unknownFields.b() + iF2;
            }
            int iL = j41Var.L(i6);
            int iK = K(iL);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & 1048575;
            if (iK <= 17) {
                if (i10 != i5) {
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(sh0Var2, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & 1048575;
            if (iK >= ra0.b.a) {
                int i11 = ra0.c.a;
            }
            switch (iK) {
                case 0:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH = un.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 1:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH2 = un.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(sh0Var2, j);
                        iH3 = un.h(i8);
                        iJ = un.j(j2);
                        iF2 += iJ + iH3;
                    }
                    j41Var = this;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(sh0Var2, j);
                        iH3 = un.h(i8);
                        iJ = un.j(j3);
                        iF2 += iJ + iH3;
                    }
                    j41Var = this;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        int i12 = unsafe.getInt(sh0Var2, j);
                        iH4 = un.h(i8);
                        iJ2 = un.j(i12);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    j41Var = this;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH5 = un.h(i8);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH2 = un.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH6 = un.h(i8) + 1;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(sh0Var2, j);
                        iF2 = (object instanceof qj ? un.f(i8, (qj) object) : un.g((String) object) + un.h(i8)) + iF2;
                    }
                    j41Var = this;
                    break;
                case 9:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(sh0Var2, j);
                        zl1 zl1VarM = j41Var.m(i6);
                        Class cls = cm1.a;
                        int iH13 = un.h(i8);
                        int iA3 = ((d1) object2).a(zl1VarM);
                        iF2 += un.i(iA3) + iA3 + iH13;
                    }
                    break;
                case 10:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iF = un.f(i8, (qj) unsafe.getObject(sh0Var2, j));
                        iF2 += iF;
                    }
                    j41Var = this;
                    break;
                case 11:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(sh0Var2, j);
                        iH4 = un.h(i8);
                        iJ2 = un.i(i13);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    j41Var = this;
                    break;
                case 12:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(sh0Var2, j);
                        iH4 = un.h(i8);
                        iJ2 = un.j(i14);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    j41Var = this;
                    break;
                case 13:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH2 = un.h(i8);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case 14:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        iH5 = un.h(i8);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    j41Var = this;
                    sh0Var2 = sh0Var;
                    break;
                case 15:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        int i15 = unsafe.getInt(sh0Var2, j);
                        iH4 = un.h(i8);
                        iJ2 = un.i((i15 >> 31) ^ (i15 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    j41Var = this;
                    break;
                case 16:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(sh0Var2, j);
                        iH3 = un.h(i8);
                        iJ = un.j((j4 << 1) ^ (j4 >> 63));
                        iF2 += iJ + iH3;
                    }
                    j41Var = this;
                    break;
                case 17:
                    if (j41Var.o(sh0Var2, i6, i5, i7, i)) {
                        d1 d1Var = (d1) unsafe.getObject(sh0Var2, j);
                        zl1 zl1VarM2 = j41Var.m(i6);
                        iH7 = un.h(i8) * 2;
                        iA = d1Var.a(zl1VarM2);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 18:
                    iC = cm1.c(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 19:
                    iC = cm1.b(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(sh0Var2, j);
                    Class cls2 = cm1.a;
                    if (list.size() == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = (un.h(i8) * list.size()) + cm1.e(list);
                    }
                    iF2 += iH8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls3 = cm1.a;
                    size = list2.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.i(list2);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls4 = cm1.a;
                    size = list3.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.d(list3);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 23:
                    iC = cm1.c(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 24:
                    iC = cm1.b(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls5 = cm1.a;
                    int size3 = list4.size();
                    iF2 += size3 == 0 ? 0 : (un.h(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls6 = cm1.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = un.h(i8) * size4;
                        if (list5 instanceof cw0) {
                            cw0 cw0Var = (cw0) list5;
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object objJ = cw0Var.j();
                                if (objJ instanceof qj) {
                                    int size5 = ((qj) objJ).size();
                                    iH8 = un.i(size5) + size5 + iH8;
                                } else {
                                    iH8 = un.g((String) objJ) + iH8;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size4; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof qj) {
                                    int size6 = ((qj) obj).size();
                                    iH8 = un.i(size6) + size6 + iH8;
                                } else {
                                    iH8 = un.g((String) obj) + iH8;
                                }
                            }
                        }
                    }
                    iF2 += iH8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(sh0Var2, j);
                    zl1 zl1VarM3 = j41Var.m(i6);
                    Class cls7 = cm1.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iH10 = 0;
                    } else {
                        iH10 = un.h(i8) * size7;
                        for (int i18 = 0; i18 < size7; i18++) {
                            int iA4 = ((d1) list6.get(i18)).a(zl1VarM3);
                            iH10 += un.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls8 = cm1.a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iH8 = 0;
                    } else {
                        iH8 = un.h(i8) * size8;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int size9 = ((qj) list7.get(i19)).size();
                            iH8 += un.i(size9) + size9;
                        }
                    }
                    iF2 += iH8;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls9 = cm1.a;
                    size = list8.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.h(list8);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls10 = cm1.a;
                    size = list9.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.a(list9);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 31:
                    iC = cm1.b(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 32:
                    iC = cm1.c(i8, (List) unsafe.getObject(sh0Var2, j));
                    iF2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls11 = cm1.a;
                    size = list10.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.f(list10);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls12 = cm1.a;
                    size = list11.size();
                    if (size == 0) {
                        iH8 = 0;
                    } else {
                        i2 = cm1.g(list11);
                        iH9 = un.h(i8);
                        iH8 = (iH9 * size) + i2;
                    }
                    iF2 += iH8;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls13 = cm1.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls14 = cm1.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 37:
                    size2 = cm1.e((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 38:
                    size2 = cm1.i((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 39:
                    size2 = cm1.d((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls15 = cm1.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls16 = cm1.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls17 = cm1.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 43:
                    size2 = cm1.h((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 44:
                    size2 = cm1.a((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls18 = cm1.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(sh0Var2, j);
                    Class cls19 = cm1.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 47:
                    size2 = cm1.f((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 48:
                    size2 = cm1.g((List) unsafe.getObject(sh0Var2, j));
                    if (size2 > 0) {
                        iH11 = un.h(i8);
                        i3 = un.i(size2);
                        iJ3 = i3 + iH11;
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(sh0Var2, j);
                    zl1 zl1VarM4 = j41Var.m(i6);
                    Class cls20 = cm1.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i20 = 0; i20 < size10; i20++) {
                            iA2 += ((d1) list19.get(i20)).a(zl1VarM4) + (un.h(i8) * 2);
                        }
                    }
                    iF2 += iA2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(sh0Var2, j);
                    Object obj2 = j41Var.b[(i6 / 3) * 2];
                    j41Var.m.getClass();
                    r11 r11Var = (r11) object3;
                    q11 q11Var = (q11) obj2;
                    if (r11Var.isEmpty()) {
                        iH10 = 0;
                    } else {
                        iH10 = 0;
                        for (Map.Entry entry : r11Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            q11Var.getClass();
                            int iH14 = un.h(i8);
                            int iA5 = q11.a(q11Var.a, key, value);
                            iH10 += un.i(iA5) + iA5 + iH14;
                        }
                    }
                    iF2 += iH10;
                    break;
                case 51:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH = un.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 52:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH12 = un.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case 53:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        long jZ = z(sh0Var2, j);
                        size2 = un.h(i8);
                        iJ3 = un.j(jZ);
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 54:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        long jZ2 = z(sh0Var2, j);
                        size2 = un.h(i8);
                        iJ3 = un.j(jZ2);
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 55:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        int iY = y(sh0Var2, j);
                        iH7 = un.h(i8);
                        iA = un.j(iY);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 56:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH = un.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 57:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH12 = un.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case 58:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iC = un.h(i8) + 1;
                        iF2 += iC;
                    }
                    break;
                case 59:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        Object object4 = unsafe.getObject(sh0Var2, j);
                        iF2 = (object4 instanceof qj ? un.f(i8, (qj) object4) : un.g((String) object4) + un.h(i8)) + iF2;
                    }
                    break;
                case 60:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        Object object5 = unsafe.getObject(sh0Var2, j);
                        zl1 zl1VarM5 = j41Var.m(i6);
                        Class cls21 = cm1.a;
                        int iH15 = un.h(i8);
                        int iA6 = ((d1) object5).a(zl1VarM5);
                        i4 = un.i(iA6) + iA6 + iH15;
                        iF2 += i4;
                    }
                    break;
                case 61:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iC = un.f(i8, (qj) unsafe.getObject(sh0Var2, j));
                        iF2 += iC;
                    }
                    break;
                case 62:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        int iY2 = y(sh0Var2, j);
                        iH7 = un.h(i8);
                        iA = un.i(iY2);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 63:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        int iY3 = y(sh0Var2, j);
                        iH7 = un.h(i8);
                        iA = un.j(iY3);
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 64:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH12 = un.h(i8);
                        iC = iH12 + 4;
                        iF2 += iC;
                    }
                    break;
                case 65:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iH = un.h(i8);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 66:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        int iY4 = y(sh0Var2, j);
                        iH7 = un.h(i8);
                        iA = un.i((iY4 >> 31) ^ (iY4 << 1));
                        iC = iA + iH7;
                        iF2 += iC;
                    }
                    break;
                case 67:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        long jZ3 = z(sh0Var2, j);
                        size2 = un.h(i8);
                        iJ3 = un.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i4 = iJ3 + size2;
                        iF2 += i4;
                    }
                    break;
                case 68:
                    if (j41Var.q(sh0Var2, i8, i6)) {
                        iC = ((d1) unsafe.getObject(sh0Var2, j)).a(j41Var.m(i6)) + (un.h(i8) * 2);
                        iF2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        */
    @Override // defpackage.zl1
    public final void f(java.lang.Object r19, defpackage.we r20, defpackage.w80 r21) {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j41.f(java.lang.Object, we, w80):void");
    }

    @Override // defpackage.zl1
    public final boolean g(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iL = L(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iL) == 0 || o(obj, i6, i, i2, i10)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i6, i, i2, i10)) {
                        if (!m(i6).g(i32.c.h(obj, iL & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(obj, i7, i6)) {
                                if (!m(i6).g(i32.c.h(obj, iL & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = i32.c.h(obj, iL & 1048575);
                                this.m.getClass();
                                r11 r11Var = (r11) objH;
                                if (r11Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((da2) ((q11) this.b[(i6 / 3) * 2]).a.c).a != ea2.w) {
                                        continue;
                                    } else {
                                        zl1 zl1VarA = null;
                                        for (Object obj2 : r11Var.values()) {
                                            if (zl1VarA == null) {
                                                zl1VarA = td1.c.a(obj2.getClass());
                                            }
                                            if (!zl1VarA.g(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) i32.c.h(obj, iL & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        zl1 zl1VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (zl1VarM.g(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.zl1
    public final boolean h(sh0 sh0Var, sh0 sh0Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iL = L(i);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var = i32.c;
                            if (Double.doubleToLongBits(h32Var.d(sh0Var, j)) != Double.doubleToLongBits(h32Var.d(sh0Var2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var2 = i32.c;
                            if (Float.floatToIntBits(h32Var2.e(sh0Var, j)) != Float.floatToIntBits(h32Var2.e(sh0Var2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var3 = i32.c;
                            if (h32Var3.g(sh0Var, j) != h32Var3.g(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var4 = i32.c;
                            if (h32Var4.g(sh0Var, j) != h32Var4.g(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var5 = i32.c;
                            if (h32Var5.f(sh0Var, j) != h32Var5.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var6 = i32.c;
                            if (h32Var6.g(sh0Var, j) != h32Var6.g(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var7 = i32.c;
                            if (h32Var7.f(sh0Var, j) != h32Var7.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var8 = i32.c;
                            if (h32Var8.c(sh0Var, j) != h32Var8.c(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var9 = i32.c;
                            if (!cm1.l(h32Var9.h(sh0Var, j), h32Var9.h(sh0Var2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var10 = i32.c;
                            if (!cm1.l(h32Var10.h(sh0Var, j), h32Var10.h(sh0Var2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var11 = i32.c;
                            if (!cm1.l(h32Var11.h(sh0Var, j), h32Var11.h(sh0Var2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var12 = i32.c;
                            if (h32Var12.f(sh0Var, j) != h32Var12.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var13 = i32.c;
                            if (h32Var13.f(sh0Var, j) != h32Var13.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var14 = i32.c;
                            if (h32Var14.f(sh0Var, j) != h32Var14.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var15 = i32.c;
                            if (h32Var15.g(sh0Var, j) != h32Var15.g(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var16 = i32.c;
                            if (h32Var16.f(sh0Var, j) != h32Var16.f(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var17 = i32.c;
                            if (h32Var17.g(sh0Var, j) != h32Var17.g(sh0Var2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(sh0Var, sh0Var2, i)) {
                            zL = false;
                        } else {
                            h32 h32Var18 = i32.c;
                            if (!cm1.l(h32Var18.h(sh0Var, j), h32Var18.h(sh0Var2, j))) {
                                zL = false;
                            }
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
                        h32 h32Var19 = i32.c;
                        zL = cm1.l(h32Var19.h(sh0Var, j), h32Var19.h(sh0Var2, j));
                        break;
                    case 50:
                        h32 h32Var20 = i32.c;
                        zL = cm1.l(h32Var20.h(sh0Var, j), h32Var20.h(sh0Var2, j));
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
                        h32 h32Var21 = i32.c;
                        if (h32Var21.f(sh0Var, j2) != h32Var21.f(sh0Var2, j2) || !cm1.l(h32Var21.h(sh0Var, j), h32Var21.h(sh0Var2, j))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (sh0Var.unknownFields.equals(sh0Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zl1
    public final sh0 i() {
        this.j.getClass();
        return ((sh0) this.e).i();
    }

    public final boolean j(sh0 sh0Var, sh0 sh0Var2, int i) {
        return n(i, sh0Var) == n(i, sh0Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (i32.c.h(obj, L(i) & 1048575) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        ur.a();
    }

    public final zl1 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        zl1 zl1Var = (zl1) objArr[i2];
        if (zl1Var != null) {
            return zl1Var;
        }
        zl1 zl1VarA = td1.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = zl1VarA;
        return zl1VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & i32.c.f(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iL = L(i);
        long j2 = iL & 1048575;
        switch (K(iL)) {
            case 0:
                if (Double.doubleToRawLongBits(i32.c.d(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(i32.c.e(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (i32.c.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (i32.c.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (i32.c.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return i32.c.c(obj, j2);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Object objH = i32.c.h(obj, j2);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof qj) {
                    return !qj.c.equals(objH);
                }
                sm0.a();
                return false;
            case 9:
                if (i32.c.h(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !qj.c.equals(i32.c.h(obj, j2));
            case 11:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (i32.c.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (i32.c.f(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (i32.c.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (i32.c.h(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                sm0.a();
                return false;
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(Object obj, int i, int i2) {
        return i32.c.f(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void r(Object obj, int i, Object obj2, w80 w80Var, we weVar) throws tr0 {
        long jL = L(i) & 1048575;
        Object objH = i32.c.h(obj, jL);
        s11 s11Var = this.m;
        if (objH == null) {
            s11Var.getClass();
            objH = r11.b.d();
            i32.o(obj, jL, objH);
        } else {
            s11Var.getClass();
            if (!((r11) objH).a) {
                r11 r11VarD = r11.b.d();
                s11.a(r11VarD, objH);
                i32.o(obj, jL, r11VarD);
                objH = r11VarD;
            }
        }
        s11Var.getClass();
        r11 r11Var = (r11) objH;
        p11 p11Var = ((q11) obj2).a;
        weVar.B(2);
        sn snVar = (sn) weVar.d;
        int iE = snVar.e(snVar.v());
        Object obj3 = p11Var.d;
        Object objN = BuildConfig.FLAVOR;
        Object objN2 = obj3;
        while (true) {
            try {
                int iE2 = weVar.e();
                if (iE2 == Integer.MAX_VALUE || snVar.c()) {
                    break;
                }
                if (iE2 == 1) {
                    objN = weVar.n((da2) p11Var.b, null, null);
                } else if (iE2 != 2) {
                    try {
                        if (!weVar.C()) {
                            throw new ur0("Unable to parse map entry.");
                        }
                    } catch (tr0 unused) {
                        if (!weVar.C()) {
                            throw new ur0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objN2 = weVar.n((da2) p11Var.c, obj3.getClass(), w80Var);
                }
            } catch (Throwable th) {
                snVar.d(iE);
                throw th;
            }
        }
        r11Var.put(objN, objN2);
        snVar.d(iE);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            zl1 zl1VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    sh0 sh0VarI = zl1VarM.i();
                    zl1VarM.b(sh0VarI, object);
                    unsafe.putObject(obj, jL, sh0VarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                sh0 sh0VarI2 = zl1VarM.i();
                zl1VarM.b(sh0VarI2, object2);
                unsafe.putObject(obj, jL, sh0VarI2);
                object2 = sh0VarI2;
            }
            zl1VarM.b(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(obj2, i2, i)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            zl1 zl1VarM = m(i);
            if (!q(obj, i2, i)) {
                if (p(object)) {
                    sh0 sh0VarI = zl1VarM.i();
                    zl1VarM.b(sh0VarI, object);
                    unsafe.putObject(obj, jL, sh0VarI);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                sh0 sh0VarI2 = zl1VarM.i();
                zl1VarM.b(sh0VarI2, object2);
                unsafe.putObject(obj, jL, sh0VarI2);
                object2 = sh0VarI2;
            }
            zl1VarM.b(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        zl1 zl1VarM = m(i);
        long jL = L(i) & 1048575;
        if (!n(i, obj)) {
            return zl1VarM.i();
        }
        Object object = o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        sh0 sh0VarI = zl1VarM.i();
        if (object != null) {
            zl1VarM.b(sh0VarI, object);
        }
        return sh0VarI;
    }

    public final Object v(Object obj, int i, int i2) {
        zl1 zl1VarM = m(i2);
        if (!q(obj, i, i2)) {
            return zl1VarM.i();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        sh0 sh0VarI = zl1VarM.i();
        if (object != null) {
            zl1VarM.b(sh0VarI, object);
        }
        return sh0VarI;
    }
}
