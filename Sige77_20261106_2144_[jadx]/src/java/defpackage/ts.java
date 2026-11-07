package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract /* synthetic */ class ts {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

    public static /* synthetic */ int[] A(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static final int a(int i) {
        i90 i90Var = i90.a;
        dw0.y();
        return v(i) + i90.k;
    }

    public static /* synthetic */ boolean b(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "value";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "event_time";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "event_name";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "content_ids";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "contents";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "content_type";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "description";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "level";
            case 9:
                return "max_rating_value";
            case 10:
                return "num_items";
            case 11:
                return "payment_info_available";
            case 12:
                return "registration_method";
            case 13:
                return "search_string";
            case 14:
                return "success";
            case 15:
                return "order_id";
            case 16:
                return "ad_type";
            case 17:
                return "currency";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "anon_id";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "fb_login_id";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "madid";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "page_id";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "page_scoped_user_id";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "ud";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "advertiser_tracking_enabled";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "application_tracking_enabled";
            case 9:
                return "consider_views";
            case 10:
                return "device_token";
            case 11:
                return "extInfo";
            case 12:
                return "include_dwell_data";
            case 13:
                return "include_video_data";
            case 14:
                return "install_referrer";
            case 15:
                return "installer_package";
            case 16:
                return "receipt_data";
            case 17:
                return "url_schemes";
            default:
                throw null;
        }
    }

    public static int f(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String i(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap o(Class cls, fc fcVar) {
        HashMap map = new HashMap();
        map.put(cls, fcVar);
        return map;
    }

    public static Map p(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "S256";
        }
        if (i == 2) {
            return "PLAIN";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    public static /* synthetic */ int v(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "AZTEC";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "CODABAR";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "CODE_39";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "CODE_93";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "CODE_128";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "DATA_MATRIX";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "EAN_8";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "USER_DATA";
        }
        if (i == 2) {
            return "APP_DATA";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CUSTOM_EVENTS";
        }
        return "CUSTOM_DATA";
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "RESOURCE_CACHE";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "DATA_CACHE";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "SOURCE";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "ENCODE";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
