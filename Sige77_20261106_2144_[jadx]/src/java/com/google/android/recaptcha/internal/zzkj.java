package com.google.android.recaptcha.internal;

import defpackage.e;
import defpackage.oc1;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzkj {
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(false);
                return i3;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return i3;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int zzb(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            e.g("x (0) must be > 0");
            return 0;
        }
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(((i + (-1)) & i) == 0);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
