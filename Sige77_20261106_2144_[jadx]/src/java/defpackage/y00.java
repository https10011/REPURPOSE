package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract /* synthetic */ class y00 {
    public static String a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String b(int i) {
        int iV = ts.v(i);
        if (iV == 0) {
            return "integrity_detect";
        }
        if (iV == 1) {
            return "app_event_pred";
        }
        throw new e71();
    }

    public static final String c(int i) {
        int iV = ts.v(i);
        if (iV == 0) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (iV == 1) {
            return "MTML_APP_EVENT_PRED";
        }
        throw new e71();
    }

    public static String d(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ boolean e(int i) {
        switch (i) {
            case 1:
                return true;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return true;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean f(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "facebook";
        }
        if (i == 2) {
            return "instagram";
        }
        throw null;
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static r93 m(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return r93Var.X().d(r93Var2).d(r93Var3);
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj == null) {
            return;
        }
        ur.a();
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "NATIVE_ONLY";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "KATANA_ONLY";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "WEB_ONLY";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "DIALOG_ONLY";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "END_ARRAY";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "END_OBJECT";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
