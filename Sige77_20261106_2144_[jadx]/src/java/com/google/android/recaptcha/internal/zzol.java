package com.google.android.recaptcha.internal;

import com.appsflyer.internal.d;
import defpackage.ck1;
import defpackage.e;
import defpackage.oc1;
import defpackage.sm0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzowVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzowVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
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
            throw new RuntimeException(sbB.toString());
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        e.g("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzov zzovVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return ((1 << (iZzr >>> 20)) & zzps.zzc(obj, j)) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j2)) != 0;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return zzps.zzd(obj, j2) != 0;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return zzps.zzd(obj, j2) != 0;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzps.zzc(obj, j2) != 0;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return zzps.zzd(obj, j2) != 0;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return zzps.zzc(obj, j2) != 0;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return zzps.zzw(obj, j2);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                Object objZzf = zzps.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                sm0.a();
                return false;
            case 9:
                return zzps.zzf(obj, j2) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j2));
            case 11:
                return zzps.zzc(obj, j2) != 0;
            case 12:
                return zzps.zzc(obj, j2) != 0;
            case 13:
                return zzps.zzc(obj, j2) != 0;
            case 14:
                return zzps.zzd(obj, j2) != 0;
            case 15:
                return zzps.zzc(obj, j2) != 0;
            case 16:
                return zzps.zzd(obj, j2) != 0;
            case 17:
                return zzps.zzf(obj, j2) != null;
            default:
                sm0.a();
                return false;
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzps.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
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
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzC2;
        int i27;
        Object obj2;
        Field fieldZzC3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String strZzd = zzouVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strZzd.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strZzd.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i76 = iCharAt11 & 255;
            zzou zzouVar2 = zzouVar;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i67 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (zzouVar2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i67 / 3;
                        objArr[i85 + i85 + 1] = objArrZze[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i26] = fieldZzC2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    strZzd = strZzd;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i26] = fieldZzC2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = fieldZzC4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zzouVar2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i67 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i67;
                            int i95 = i67 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = (iCharAt13 / 32) + i18 + i18;
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzC;
                            }
                            i19 = iCharAt13 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i101 = i67 / 3;
                    objArr[i101 + i101 + i22] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i102 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i103 = i67 + 2;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i103] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strZzd = strZzd;
            c2 = c;
            zzouVar = zzouVar2;
            length = length;
            i7 = i18;
        }
        return new zzol(iArr3, objArr, i2, i4, zzouVar.zza(), false, iArr, i5, i62, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:206:0x0522  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int iZzA4;
        int size;
        int iZzl;
        int iZzA5;
        int iZzd2;
        boolean z;
        int iZzb;
        int iZzz;
        int iZzA6;
        int iZzA7;
        int size2;
        int iZzk;
        int iZzA8;
        int size3;
        int iZzi;
        int iZzA9;
        int i2;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        zzol<T> zzolVar = this;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iX = 0;
        while (i5 < zzolVar.zzc.length) {
            int iZzu = zzolVar.zzu(i5);
            int iZzt = zzt(iZzu);
            int[] iArr = zzolVar.zzc;
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iZzt <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iZzu & i3;
            if (iZzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j = i10;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j2);
                        iX += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j3);
                        iX += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j4);
                        iX += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 1, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzle) {
                            iZzA2 = zzln.zzA(i11);
                            iZzd = ((zzle) object).zzd();
                            iZzA3 = zzln.zzA(iZzd);
                            iX += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzln.zzA(i11);
                            iZzB = zzln.zzz((String) object);
                            iX += iZzB + iZzA;
                        }
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iZzh = zzoy.zzh(i7, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                        iX += iZzh;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj, j);
                        iZzA2 = zzln.zzA(i7 << 3);
                        iZzd = zzleVar.zzd();
                        iZzA3 = zzln.zzA(iZzd);
                        iX += iZzA3 + iZzd + iZzA2;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(unsafe.getInt(obj, j), zzln.zzA(i7 << 3), iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j5);
                        iX += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iX = ck1.x((i12 >> 31) ^ (i12 + i12), zzln.zzA(i7 << 3), iX);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB((j6 >> 63) ^ (j6 + j6));
                        iX += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (zzolVar.zzO(obj, i5, i4, i6, i)) {
                        iX += zzln.zzw(i7, (zzoi) unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iZzh = zzoy.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzh;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iZzh = zzoy.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzh;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzoy.zza;
                    if (list.size() == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzln.zzA(i7 << 3) * list.size()) + zzoy.zzg(list);
                    }
                    iX += iZzA4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zzoy.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzoy.zzl(list2);
                        iZzA5 = zzln.zzA(i7 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iX += iZzA4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzoy.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzoy.zzf(list3);
                        iZzA5 = zzln.zzA(i7 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iX += iZzA4;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iZzd2 = zzoy.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzd2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    z = false;
                    iZzb = zzoy.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzb;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zzoy.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzd2 = size4 * (zzln.zzA(i7 << 3) + 1);
                    }
                    iX += iZzd2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i17 = zzoy.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzln.zzA(i7 << 3) * size5;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            iZzz = iZzA13;
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object objZzc = zznuVar.zzc();
                                if (objZzc instanceof zzle) {
                                    int iZzd3 = ((zzle) objZzc).zzd();
                                    iZzz = ck1.x(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) objZzc) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i19 = 0; i19 < size5; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof zzle) {
                                    int iZzd4 = ((zzle) obj2).zzd();
                                    iZzz = ck1.x(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) obj2) + iZzz;
                                }
                            }
                        }
                    }
                    iX += iZzz;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzow zzowVarZzx = zzolVar.zzx(i5);
                    int i20 = zzoy.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzln.zzA(i7 << 3) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            Object obj3 = list6.get(i21);
                            if (obj3 instanceof zznt) {
                                int iZza = ((zznt) obj3).zza();
                                iZzA6 = ck1.x(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzln.zzy((zzoi) obj3, zzowVarZzx) + iZzA6;
                            }
                        }
                    }
                    iX += iZzA6;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zzoy.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzln.zzA(i7 << 3) * size7;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd5 = ((zzle) list7.get(i23)).zzd();
                            iZzA7 = ck1.x(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iX += iZzA7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzoy.zzk(list8);
                        iZzA8 = zzln.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iX += iZzd2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzoy.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzoy.zza(list9);
                        iZzA8 = zzln.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iX += iZzd2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iZzd2 = zzoy.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzd2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    z = false;
                    iZzb = zzoy.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iX += iZzb;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i26 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i2 = 0;
                    } else {
                        iZzi = zzoy.zzi(list10);
                        iZzA9 = zzln.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                    }
                    iX += i2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i27 = zzoy.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i2 = 0;
                    } else {
                        iZzi = zzoy.zzj(list11);
                        iZzA9 = zzln.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                    }
                    iX += i2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iZze = zzoy.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iZze = zzoy.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iZze = zzoy.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i28 = zzoy.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iZze = zzoy.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iZze = zzoy.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iZze = zzoy.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iZze = zzoy.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzow zzowVarZzx2 = zzolVar.zzx(i5);
                    int i29 = zzoy.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i2 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i30 = 0; i30 < size8; i30++) {
                            iZzw += zzln.zzw(i7, (zzoi) list13.get(i30), zzowVarZzx2);
                        }
                        i2 = iZzw;
                    }
                    iX += i2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj, j);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        long jZzv = zzv(obj, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzv);
                        iX += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        long jZzv2 = zzv(obj, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzv2);
                        iX += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        long jZzp = zzp(obj, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzp);
                        iX += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 1, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        int i31 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzle) {
                            iZze = zzln.zzA(i31);
                            iZzA10 = ((zzle) object2).zzd();
                            iZzA11 = zzln.zzA(iZzA10);
                            iX += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzln.zzA(i31);
                            iZzB2 = zzln.zzz((String) object2);
                            iX += iZzB2 + iZzA12;
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iZzd2 = zzoy.zzh(i7, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                        iX += iZzd2;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj, j);
                        iZze = zzln.zzA(i7 << 3);
                        iZzA10 = zzleVar2.zzd();
                        iZzA11 = zzln.zzA(iZzA10);
                        iX += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(zzp(obj, j), zzln.zzA(i7 << 3), iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        long jZzp2 = zzp(obj, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzp2);
                        iX += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 4, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX = ck1.x(i7 << 3, 8, iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        int iZzp = zzp(obj, j);
                        iX = ck1.x((iZzp >> 31) ^ (iZzp + iZzp), zzln.zzA(i7 << 3), iX);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        long jZzv3 = zzv(obj, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iX += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i7, i5)) {
                        iX += zzln.zzw(i7, (zzoi) unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i5 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        int iZza2 = 0;
        int iZza3 = ((zznd) obj).zzc.zza() + iX;
        if (!zzolVar.zzh) {
            return iZza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int iZzc = zzmtVar.zza.zzc();
        int i32 = 0;
        while (true) {
            zzpe zzpeVar = zzmtVar.zza;
            if (i32 >= iZzc) {
                for (Map.Entry entry2 : zzpeVar.zzd()) {
                    iZza2 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
                }
                return iZza3 + iZza2;
            }
            Map.Entry entryZzg = zzpeVar.zzg(i32);
            iZza2 += zzmt.zza((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
            i32++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i4 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzps.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 12:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 13:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 15:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzps.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
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
                    i2 = i4 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j));
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zznd) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzkt r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
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
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j, zznkVar);
                    break;
                case 50:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:229:0x0833 A[LOOP:2: B:227:0x082f->B:229:0x0833, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0842  */
    /* JADX WARN: Code duplicated, block: B:239:0x0853 A[LOOP:3: B:237:0x084f->B:239:0x0853, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0864  */
    /* JADX WARN: Code duplicated, block: B:244:0x0820 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x082d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[Catch: all -> 0x005d, TryCatch #11 {all -> 0x005d, blocks: (B:20:0x0054, B:24:0x0064, B:26:0x006c, B:27:0x0070, B:60:0x0166, B:68:0x0191, B:65:0x0177, B:67:0x017f, B:29:0x0076, B:30:0x0080, B:31:0x008a, B:32:0x0094, B:33:0x009e, B:34:0x00a5, B:35:0x00a6, B:36:0x00b0, B:37:0x00b6, B:39:0x00c0, B:41:0x00d5, B:42:0x00e2, B:43:0x00e7, B:44:0x00e8, B:46:0x00f2, B:48:0x0107, B:49:0x0114, B:50:0x0119, B:51:0x011a, B:52:0x011f, B:53:0x0128, B:54:0x0131, B:55:0x013a, B:56:0x0143, B:57:0x014c, B:58:0x0155, B:59:0x015e, B:70:0x019a, B:71:0x019d, B:73:0x01a0), top: B:254:0x0054 }] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws Throwable {
        Object obj2;
        zzol<T> zzolVar;
        Object obj3;
        int i;
        zzpl zzplVar;
        Object obj4;
        zzpl zzplVar2;
        Object obj5;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        int i2;
        Object obj6;
        zzol<T> zzolVar2 = this;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar3 = zzolVar2.zzm;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzolVar2.zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzplVar2 = zzplVar3;
                    obj4 = objZza;
                    try {
                        int iZzu = zzolVar2.zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzo(obj5, iZzu & 1048575, zzovVar.zza());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 1:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzp(obj5, iZzu & 1048575, zzovVar.zzb());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzl());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzo());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.LONG_FIELD_NUMBER /* 4 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzg());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.STRING_FIELD_NUMBER /* 5 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzk());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzf());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzm(obj5, iZzu & 1048575, zzovVar.zzN());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzolVar.zzG(obj5, iZzu, zzovVar);
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 9:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzoi zzoiVar = (zzoi) zzolVar.zzA(obj5, iZzq);
                                    zzovVar.zzu(zzoiVar, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzJ(obj5, iZzq, zzoiVar);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 10:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzs(obj5, iZzu & 1048575, zzovVar.zzp());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 11:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzj());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 12:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    int iZze = zzovVar.zze();
                                    zznh zznhVarZzw = zzolVar.zzw(iZzq);
                                    if (zznhVarZzw == null || zznhVarZzw.zza(iZze)) {
                                        zzps.zzq(obj5, iZzu & 1048575, iZze);
                                        zzolVar.zzH(obj5, iZzq);
                                        objZza = obj3;
                                    } else {
                                        objZza = zzoy.zzo(obj5, iZzc, iZze, obj3, zzplVar3);
                                    }
                                    zzolVar2 = zzolVar;
                                    break;
                                case 13:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzh());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 14:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzm());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 15:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzq(obj5, iZzu & 1048575, zzovVar.zzi());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 16:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzps.zzr(obj5, iZzu & 1048575, zzovVar.zzn());
                                    zzolVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 17:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzoi zzoiVar2 = (zzoi) zzolVar.zzA(obj5, iZzq);
                                    zzovVar.zzt(zzoiVar2, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzJ(obj5, iZzq, zzoiVar2);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 18:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzx(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 19:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzB(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 20:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzE(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 21:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzM(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 22:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzD(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 23:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzA(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 24:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzz(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 25:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzv(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 26:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    if (zzM(iZzu)) {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj5, iZzu & 1048575), true);
                                    } else {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj5, iZzu & 1048575), false);
                                    }
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 27:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzF(zznv.zza(obj5, iZzu & 1048575), zzolVar.zzx(iZzq), zzmoVar);
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 28:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzw(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 29:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzL(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 30:
                                    zzolVar = zzolVar2;
                                    List listZza = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza);
                                    objZza = zzoy.zzn(obj5, iZzc, listZza, zzolVar.zzw(iZzq), obj4, zzplVar2);
                                    zzplVar3 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 31:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzG(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 32:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzH(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 33:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzI(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 34:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzJ(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 35:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzx(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 36:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzB(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 37:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzE(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 38:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzM(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 39:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzD(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 40:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzA(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 41:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzz(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 42:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    zzovVar.zzv(zznv.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 43:
                                    zzolVar = zzolVar2;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar2;
                                    obj2 = obj5;
                                    try {
                                        zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                        objZza = obj3;
                                    } catch (zznm unused) {
                                        objZza = obj3;
                                        if (objZza == null) {
                                            try {
                                                objZza = zzplVar3.zza(obj2);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                        if (!zzplVar3.zzk(objZza, zzovVar, 0)) {
                                            for (i2 = zzolVar.zzk; i2 < zzolVar.zzl; i2++) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i2], objZza, zzplVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objZza = obj3;
                                        i = zzolVar.zzk;
                                        while (i < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i], objZza, zzplVar3, obj);
                                            i++;
                                            zzolVar = this;
                                        }
                                        if (objZza != null) {
                                            zzplVar3.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zzolVar2 = zzolVar;
                                    break;
                                case 44:
                                    zzolVar = zzolVar2;
                                    List listZza2 = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza2);
                                    objZza = zzoy.zzn(obj5, iZzc, listZza2, zzolVar.zzw(iZzq), obj4, zzplVar2);
                                    zzplVar3 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 45:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzovVar.zzG(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 46:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzovVar.zzH(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 47:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzovVar.zzI(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 48:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzovVar.zzJ(zznv.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 49:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzovVar.zzC(zznv.zza(obj6, iZzu & 1048575), zzolVar.zzx(iZzq), zzmoVar);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 50:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    Object objZzz = zzolVar.zzz(iZzq);
                                    long jZzu = zzolVar.zzu(iZzq) & 1048575;
                                    Object objZzf = zzps.zzf(obj6, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zzoc.zza().zzb();
                                        zzps.zzs(obj6, jZzu, objZzf);
                                    } else if (zzod.zza(objZzf)) {
                                        Object objZzb = zzoc.zza().zzb();
                                        zzod.zzb(objZzb, objZzf);
                                        zzps.zzs(obj6, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 52:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 53:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 54:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 55:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 56:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 57:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 58:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 59:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzolVar.zzG(obj6, iZzu, zzovVar);
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 60:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzoi zzoiVar3 = (zzoi) zzolVar.zzB(obj6, iZzc, iZzq);
                                    zzovVar.zzu(zzoiVar3, zzolVar.zzx(iZzq), zzmoVar);
                                    zzolVar.zzK(obj6, iZzc, iZzq, zzoiVar3);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 61:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, zzovVar.zzp());
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 62:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 63:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    int iZze2 = zzovVar.zze();
                                    zznh zznhVarZzw2 = zzolVar.zzw(iZzq);
                                    if (zznhVarZzw2 != null && !zznhVarZzw2.zza(iZze2)) {
                                        objZza = zzoy.zzo(obj6, iZzc, iZze2, obj4, zzplVar);
                                        zzplVar3 = zzplVar;
                                        zzolVar2 = zzolVar;
                                    }
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 64:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 65:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 66:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 67:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    zzps.zzs(obj6, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                    zzolVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    zzolVar2 = zzolVar;
                                    break;
                                case 68:
                                    zzolVar = zzolVar2;
                                    obj6 = obj5;
                                    zzplVar = zzplVar2;
                                    try {
                                        zzoi zzoiVar4 = (zzoi) zzolVar.zzB(obj6, iZzc, iZzq);
                                        zzovVar.zzt(zzoiVar4, zzolVar.zzx(iZzq), zzmoVar);
                                        zzolVar.zzK(obj6, iZzc, iZzq, zzoiVar4);
                                        obj3 = obj4;
                                        zzplVar3 = zzplVar;
                                        objZza = obj3;
                                    } catch (zznm unused2) {
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzplVar3 = zzplVar;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzplVar3.zza(obj2);
                                        }
                                        if (!zzplVar3.zzk(objZza, zzovVar, 0)) {
                                            while (i2 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i2], objZza, zzplVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzplVar3 = zzplVar;
                                        objZza = obj3;
                                        i = zzolVar.zzk;
                                        while (i < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i], objZza, zzplVar3, obj);
                                            i++;
                                            zzolVar = this;
                                        }
                                        if (objZza != null) {
                                            zzplVar3.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zzolVar2 = zzolVar;
                                    break;
                                default:
                                    objZza = obj4 == null ? zzplVar2.zza(obj5) : obj4;
                                    try {
                                        if (zzplVar2.zzk(objZza, zzovVar, 0)) {
                                            zzolVar = zzolVar2;
                                            zzplVar = zzplVar2;
                                            zzplVar3 = zzplVar;
                                            zzolVar2 = zzolVar;
                                        } else {
                                            int i3 = zzolVar2.zzk;
                                            while (i3 < zzolVar2.zzl) {
                                                zzpl zzplVar4 = zzplVar2;
                                                zzolVar2.zzy(obj, zzolVar2.zzj[i3], objZza, zzplVar4, obj);
                                                i3++;
                                                obj5 = obj;
                                                zzolVar2 = zzolVar2;
                                                zzplVar2 = zzplVar4;
                                            }
                                            obj2 = obj5;
                                            zzplVar3 = zzplVar2;
                                        }
                                    } catch (zznm unused3) {
                                        zzolVar = zzolVar2;
                                        obj2 = obj5;
                                        zzplVar3 = zzplVar2;
                                        if (objZza == null) {
                                            objZza = zzplVar3.zza(obj2);
                                        }
                                        if (!zzplVar3.zzk(objZza, zzovVar, 0)) {
                                            while (i2 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i2], objZza, zzplVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzplVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzolVar = zzolVar2;
                                        obj2 = obj5;
                                        zzplVar3 = zzplVar2;
                                    }
                                    break;
                            }
                        } catch (zznm unused4) {
                            zzolVar = zzolVar2;
                            obj3 = obj4;
                            zzplVar3 = zzplVar2;
                            obj2 = obj5;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzpl zzplVar5 = zzplVar2;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar3 = zzplVar5;
                        obj2 = obj5;
                        objZza = obj3;
                        i = zzolVar.zzk;
                        while (i < zzolVar.zzl) {
                            zzolVar.zzy(obj2, zzolVar.zzj[i], objZza, zzplVar3, obj);
                            i++;
                            zzolVar = this;
                        }
                        if (objZza != null) {
                            zzplVar3.zzj(obj2, objZza);
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i4 = zzolVar2.zzk;
                    while (i4 < zzolVar2.zzl) {
                        zzolVar2.zzy(obj, zzolVar2.zzj[i4], objZza, zzplVar3, obj);
                        i4++;
                        zzplVar3 = zzplVar3;
                    }
                    obj2 = obj;
                    zzplVar3 = zzplVar3;
                } else {
                    Object obj7 = obj;
                    zzplVar = zzplVar3;
                    obj4 = objZza;
                    try {
                        zznc zzncVarZza = !zzolVar2.zzh ? null : zzmoVar.zza(zzolVar2.zzg, iZzc);
                        if (zzncVarZza != null) {
                            if (zzmtVarZzi == null) {
                                try {
                                    zzmtVarZzi = ((zzna) obj7).zzi();
                                } catch (Throwable th6) {
                                    th = th6;
                                    zzolVar = zzolVar2;
                                    obj2 = obj7;
                                    obj3 = obj4;
                                    zzplVar3 = zzplVar;
                                    objZza = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                        zzolVar.zzy(obj2, zzolVar.zzj[i], objZza, zzplVar3, obj);
                                        i++;
                                        zzolVar = this;
                                    }
                                    if (objZza != null) {
                                        zzplVar3.zzj(obj2, objZza);
                                    }
                                    throw th;
                                }
                            }
                            zznb zznbVar = zzncVarZza.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzovVar.zza());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVarZza.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzovVar.zzb());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr3 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                    objValueOf = Long.valueOf(zzovVar.zzl());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr4 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr5 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                    objValueOf = Long.valueOf(zzovVar.zzo());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr6 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr7 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.LONG_FIELD_NUMBER /* 4 */:
                                    objValueOf = Integer.valueOf(zzovVar.zzg());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr8 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr9 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.STRING_FIELD_NUMBER /* 5 */:
                                    objValueOf = Long.valueOf(zzovVar.zzk());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr10 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr11 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                    objValueOf = Integer.valueOf(zzovVar.zzf());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr12 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr13 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                    objValueOf = Boolean.valueOf(zzovVar.zzN());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr14 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr15 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                    objValueOf = zzovVar.zzr();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr16 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr17 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 9:
                                    Object objZze2 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze2 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                    if (!((zznd) objZze2).zzL()) {
                                        Object objZze3 = zzowVarZzb.zze();
                                        zzowVarZzb.zzg(objZze3, objZze2);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                    break;
                                case 10:
                                    Object objZze4 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                    if (!((zznd) objZze4).zzL()) {
                                        Object objZze5 = zzowVarZzb2.zze();
                                        zzowVarZzb2.zzg(objZze5, objZze4);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                    break;
                                case 11:
                                    objValueOf = zzovVar.zzp();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr18 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr19 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzovVar.zzj());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzovVar.zzh());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr112 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr113 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzovVar.zzm());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr114 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr115 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzovVar.zzi());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr116 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr117 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzovVar.zzn());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr118 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr119 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                                default:
                                    objValueOf = null;
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr1111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar3 = zzplVar;
                                    break;
                            }
                        } else {
                            objZza = obj4 == null ? zzplVar.zza(obj7) : obj4;
                            try {
                                if (zzplVar.zzk(objZza, zzovVar, 0)) {
                                    zzplVar3 = zzplVar;
                                } else {
                                    int i5 = zzolVar2.zzk;
                                    while (i5 < zzolVar2.zzl) {
                                        zzpl zzplVar6 = zzplVar;
                                        Object obj8 = obj7;
                                        zzolVar2.zzy(obj8, zzolVar2.zzj[i5], objZza, zzplVar6, obj);
                                        i5++;
                                        obj7 = obj8;
                                        zzplVar = zzplVar6;
                                    }
                                    zzplVar2 = zzplVar;
                                    obj2 = obj7;
                                    zzplVar3 = zzplVar2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj7;
                                zzplVar3 = zzplVar;
                                zzolVar = zzolVar2;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzplVar2 = zzplVar;
                        obj5 = obj7;
                        zzpl zzplVar7 = zzplVar2;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar3 = zzplVar7;
                        obj2 = obj5;
                        objZza = obj3;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                obj2 = obj;
                zzolVar = zzolVar2;
                obj3 = objZza;
            }
            i = zzolVar.zzk;
            while (i < zzolVar.zzl) {
                zzolVar.zzy(obj2, zzolVar.zzj[i], objZza, zzplVar3, obj);
                i++;
                zzolVar = this;
            }
            if (objZza != null) {
                zzplVar3.zzj(obj2, objZza);
            }
            throw th;
        }
        if (objZza != null) {
            zzplVar3.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (zzmtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzmtVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzolVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < iArr.length) {
            int iZzu = zzolVar.zzu(i5);
            int[] iArr2 = zzolVar.zzc;
            int iZzt = zzt(iZzu);
            int i8 = iArr2[i5];
            if (iZzt <= 17) {
                int i9 = iArr2[i5 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i6) {
                    i = 1;
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                } else {
                    i = 1;
                }
                i2 = i6;
                i3 = i7;
                i4 = i << (i9 >>> 20);
            } else {
                i = 1;
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            while (entry != null && ((zznb) entry.getKey()).zza <= i8) {
                zzolVar.zzn.zzb(zzpyVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzf(i8, zzps.zza(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 1:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzo(i8, zzps.zzb(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzK(i8, unsafe.getLong(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzb(i8, zzps.zzw(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 9:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 10:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 11:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzI(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 12:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 13:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzx(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 14:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzz(i8, unsafe.getLong(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 15:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzB(i8, unsafe.getInt(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 16:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzD(i8, unsafe.getLong(obj, j));
                    }
                    zzolVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 17:
                    if (zzolVar.zzO(obj, i5, i2, i3, i4)) {
                        zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 18:
                    zzoy.zzs(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 19:
                    zzoy.zzw(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 20:
                    zzoy.zzy(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 21:
                    zzoy.zzE(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 22:
                    zzoy.zzx(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 23:
                    zzoy.zzv(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 24:
                    zzoy.zzu(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 25:
                    zzoy.zzr(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 26:
                    int i11 = zzolVar.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzoy.zza;
                    if (list != null && !list.isEmpty()) {
                        zzpyVar.zzH(i11, list);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 27:
                    int i13 = zzolVar.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzow zzowVarZzx = zzolVar.zzx(i5);
                    int i14 = zzoy.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzlo) zzpyVar).zzv(i13, list2.get(i15), zzowVarZzx);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 28:
                    int i16 = zzolVar.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzoy.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzpyVar.zze(i16, list3);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 29:
                    zzoy.zzD(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 30:
                    zzoy.zzt(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 31:
                    zzoy.zzz(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 32:
                    zzoy.zzA(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 33:
                    zzoy.zzB(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 34:
                    zzoy.zzC(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 35:
                    zzoy.zzs(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 36:
                    zzoy.zzw(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 37:
                    zzoy.zzy(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 38:
                    zzoy.zzE(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 39:
                    zzoy.zzx(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 40:
                    zzoy.zzv(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 41:
                    zzoy.zzu(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 42:
                    zzoy.zzr(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 43:
                    zzoy.zzD(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 44:
                    zzoy.zzt(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 45:
                    zzoy.zzz(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 46:
                    zzoy.zzA(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 47:
                    zzoy.zzB(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 48:
                    zzoy.zzC(zzolVar.zzc[i5], (List) unsafe.getObject(obj, j), zzpyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 49:
                    int i18 = zzolVar.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzow zzowVarZzx2 = zzolVar.zzx(i5);
                    int i19 = zzoy.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzlo) zzpyVar).zzq(i18, list4.get(i20), zzowVarZzx2);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzf(i8, zzn(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzo(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzt(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzK(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzr(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzm(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzk(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzb(i8, zzS(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzI(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzi(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzx(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzz(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzB(i8, zzp(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzD(i8, zzv(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i8, i5)) {
                        zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                default:
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzolVar.zzn.zzb(zzpyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzps.zza(obj, j)) != Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzps.zzb(obj, j)) != Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!zzL(obj, obj2, i) || zzps.zzw(obj, j) != zzps.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzow zzowVarZzx;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzu = this.zzu(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            zzol<T> zzolVar = this;
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzolVar.zzO(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzolVar.zzO(obj2, i7, i, i2, i11) && !zzP(obj2, iZzu, zzolVar.zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzowVarZzx = zzolVar.zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzowVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzolVar.zzR(obj2, i8, i7) && !zzP(obj2, iZzu, zzolVar.zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzowVarZzx = zzolVar.zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzowVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzoc) zzps.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            this = zzolVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
