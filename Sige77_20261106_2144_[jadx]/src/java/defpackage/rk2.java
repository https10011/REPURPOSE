package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public enum rk2 implements hm2 {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);

    public final int a;

    rk2(int i) {
        this.a = i;
    }

    public static rk2 a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return CONTENT_PROVIDER;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return TIKTOK;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return DEVICE_CONFIG;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return FILE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // defpackage.hm2
    public final int zza() {
        return this.a;
    }
}
