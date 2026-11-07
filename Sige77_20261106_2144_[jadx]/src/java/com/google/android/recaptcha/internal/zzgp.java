package com.google.android.recaptcha.internal;

import defpackage.tv2;
import defpackage.wb;
import java.util.Collection;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strS;
        String str;
        if (zzueVarArr.length != 1) {
            tv2.c(4, 3, null);
            return;
        }
        int i2 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            tv2.c(4, 5, null);
            return;
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i4));
                i2++;
            }
            sb.append((CharSequence) "]");
            strS = sb.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, Charsets.UTF_8);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i5 = 0;
                while (i2 < length2) {
                    long j = jArr[i2];
                    i5++;
                    if (i5 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j));
                    i2++;
                }
                sb2.append((CharSequence) "]");
                strS = sb2.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i6 = 0;
                while (i2 < length3) {
                    short s = sArr[i2];
                    i6++;
                    if (i6 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s));
                    i2++;
                }
                sb3.append((CharSequence) "]");
                strS = sb3.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i7 = 0;
                while (i2 < length4) {
                    float f = fArr[i2];
                    i7++;
                    if (i7 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f));
                    i2++;
                }
                sb4.append((CharSequence) "]");
                strS = sb4.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i8 = 0;
                while (i2 < length5) {
                    double d = dArr[i2];
                    i8++;
                    if (i8 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d));
                    i2++;
                }
                sb5.append((CharSequence) "]");
                strS = sb5.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strS = wb.l(",", 56, (Object[]) objZza);
            } else {
                if (!(objZza instanceof Collection)) {
                    tv2.c(4, 5, null);
                    return;
                }
                strS = CollectionsKt.s((Iterable) objZza, ",", "[", "]", (Function1) null, 56);
            }
            strS = str;
        }
        zzgdVar.zzc().zze(i, strS);
    }
}
