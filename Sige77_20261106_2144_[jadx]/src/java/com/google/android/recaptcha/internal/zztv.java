package com.google.android.recaptcha.internal;

import defpackage.e;
import defpackage.oc1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public enum zztv implements zznf {
    JS_CODE_UNSPECIFIED(0),
    JS_CODE_SUCCESS(1),
    JS_NETWORK_ERROR(2),
    JS_INTERNAL_ERROR(3),
    JS_INVALID_SITE_KEY(4),
    JS_INVALID_SITE_KEY_TYPE(5),
    JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED(6),
    JS_INVALID_ACTION(7),
    JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED(8),
    JS_PROGRAM_ERROR(9),
    UNRECOGNIZED(-1);

    private final int zzm;

    zztv(int i) {
        this.zzm = i;
    }

    public static zztv zzb(int i) {
        switch (i) {
            case 0:
                return JS_CODE_UNSPECIFIED;
            case 1:
                return JS_CODE_SUCCESS;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return JS_NETWORK_ERROR;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return JS_INTERNAL_ERROR;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return JS_INVALID_SITE_KEY;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return JS_INVALID_SITE_KEY_TYPE;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return JS_INVALID_ACTION;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED;
            case 9:
                return JS_PROGRAM_ERROR;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzm;
        }
        e.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
