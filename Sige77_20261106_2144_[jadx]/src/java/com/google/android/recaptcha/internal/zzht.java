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
public final class zzht implements zzgx {
    public static final zzht zza = new zzht();

    private zzht() {
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
        if (objZza2 != null) {
            zzgdVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            tv2.c(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() ^ ((Number) obj2).longValue());
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(Charsets.UTF_8);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i] ^ ((Number) obj2).byteValue())));
                    i++;
                }
                return CollectionsKt.z(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i] ^ ((Number) obj2).intValue()));
                    i++;
                }
                return CollectionsKt.A(arrayList2);
            }
        }
        if (z && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z2 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList4.add(Short.valueOf((short) (s ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z3 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList5.add(Integer.valueOf(i2 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z4 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z5 = obj instanceof byte[];
        if (z5 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b2 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b2 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z6 = obj instanceof short[];
        if (z6 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s2 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s2 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z7 = obj instanceof int[];
        if (z7 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i3 : iArr2) {
                arrayList9.add(Integer.valueOf(i3 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z8 = obj instanceof long[];
        if (z8 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j2 : jArr2) {
                arrayList10.add(Long.valueOf(j2 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z5 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length3, bArr4.length);
            IntRange intRangeB = hf1.b(0, length3);
            ArrayList arrayList11 = new ArrayList(ko.h(intRangeB));
            Iterator it = intRangeB.iterator();
            while (((zq0) it).c) {
                int iNextInt = ((wq0) it).nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iNextInt] ^ bArr3[iNextInt])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z6 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length4, sArr4.length);
            IntRange intRangeB2 = hf1.b(0, length4);
            ArrayList arrayList12 = new ArrayList(ko.h(intRangeB2));
            Iterator it2 = intRangeB2.iterator();
            while (((zq0) it2).c) {
                int iNextInt2 = ((wq0) it2).nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[iNextInt2] ^ sArr3[iNextInt2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z7 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length5, iArr4.length);
            IntRange intRangeB3 = hf1.b(0, length5);
            ArrayList arrayList13 = new ArrayList(ko.h(intRangeB3));
            Iterator it3 = intRangeB3.iterator();
            while (((zq0) it3).c) {
                int iNextInt3 = ((wq0) it3).nextInt();
                arrayList13.add(Integer.valueOf(iArr4[iNextInt3] ^ iArr3[iNextInt3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z8 || !(obj2 instanceof long[])) {
            tv2.c(4, 5, null);
            return null;
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzgw.zza(this, length6, jArr4.length);
        IntRange intRangeB4 = hf1.b(0, length6);
        ArrayList arrayList14 = new ArrayList(ko.h(intRangeB4));
        Iterator it4 = intRangeB4.iterator();
        while (((zq0) it4).c) {
            int iNextInt4 = ((wq0) it4).nextInt();
            arrayList14.add(Long.valueOf(jArr3[iNextInt4] ^ jArr4[iNextInt4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
