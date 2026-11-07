package com.google.android.recaptcha.internal;

import defpackage.hf1;
import defpackage.ko;
import defpackage.tv2;
import defpackage.wq0;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) throws ArithmeticException, zzce {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z5 = obj instanceof Float;
        if (z5 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z6 = obj instanceof Double;
        if (z6 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] % ((Number) obj2).intValue())));
                    i++;
                }
                return new String(CollectionsKt.z(arrayList), Charsets.UTF_8);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] % ((Number) obj2).intValue()));
                    i++;
                }
                return CollectionsKt.A(arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Integer.valueOf(b % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Integer.valueOf(s % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList5.add(Integer.valueOf(i2 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList7.add(Float.valueOf(f % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z6 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d : dArr) {
                arrayList8.add(Double.valueOf(d % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z7 = obj instanceof byte[];
        if (z7 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList9.add(Integer.valueOf(b2 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof short[];
        if (z8 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList10.add(Integer.valueOf(s2 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z9 = obj instanceof int[];
        if (z9 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i] % ((Number) obj2).intValue()));
                i++;
            }
            return CollectionsKt.A(arrayList11);
        }
        boolean z10 = obj instanceof long[];
        if (z10 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList12.add(Long.valueOf(j2 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z11 = obj instanceof float[];
        if (z11 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f2 : fArr2) {
                arrayList13.add(Float.valueOf(f2 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z12 = obj instanceof double[];
        if (z12 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d2 : dArr2) {
                arrayList14.add(Double.valueOf(d2 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z7 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            IntRange intRangeB = hf1.b(0, length4);
            ArrayList arrayList15 = new ArrayList(ko.h(intRangeB));
            Iterator it = intRangeB.iterator();
            while (((zq0) it).c) {
                int iNextInt = ((wq0) it).nextInt();
                arrayList15.add(Integer.valueOf(bArr3[iNextInt] % bArr4[iNextInt]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z8 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            IntRange intRangeB2 = hf1.b(0, length5);
            ArrayList arrayList16 = new ArrayList(ko.h(intRangeB2));
            Iterator it2 = intRangeB2.iterator();
            while (((zq0) it2).c) {
                int iNextInt2 = ((wq0) it2).nextInt();
                arrayList16.add(Integer.valueOf(sArr3[iNextInt2] % sArr4[iNextInt2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            IntRange intRangeB3 = hf1.b(0, length6);
            ArrayList arrayList17 = new ArrayList(ko.h(intRangeB3));
            Iterator it3 = intRangeB3.iterator();
            while (((zq0) it3).c) {
                int iNextInt3 = ((wq0) it3).nextInt();
                arrayList17.add(Integer.valueOf(iArr3[iNextInt3] % iArr4[iNextInt3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            IntRange intRangeB4 = hf1.b(0, length7);
            ArrayList arrayList18 = new ArrayList(ko.h(intRangeB4));
            Iterator it4 = intRangeB4.iterator();
            while (((zq0) it4).c) {
                int iNextInt4 = ((wq0) it4).nextInt();
                arrayList18.add(Long.valueOf(jArr3[iNextInt4] % jArr4[iNextInt4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z11 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            IntRange intRangeB5 = hf1.b(0, length8);
            ArrayList arrayList19 = new ArrayList(ko.h(intRangeB5));
            Iterator it5 = intRangeB5.iterator();
            while (((zq0) it5).c) {
                int iNextInt5 = ((wq0) it5).nextInt();
                arrayList19.add(Float.valueOf(fArr3[iNextInt5] % fArr4[iNextInt5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z12 || !(obj2 instanceof double[])) {
            tv2.c(4, 5, null);
            return null;
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        IntRange intRangeB6 = hf1.b(0, length9);
        ArrayList arrayList20 = new ArrayList(ko.h(intRangeB6));
        Iterator it6 = intRangeB6.iterator();
        while (((zq0) it6).c) {
            int iNextInt6 = ((wq0) it6).nextInt();
            arrayList20.add(Double.valueOf(dArr3[iNextInt6] % dArr4[iNextInt6]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            tv2.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            tv2.c(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            tv2.c(4, 5, null);
            return;
        }
        try {
            zzgdVar.zzc().zze(i, zzb(objZza, objZza2));
        } catch (ArithmeticException e) {
            tv2.c(4, 6, e);
        }
    }
}
