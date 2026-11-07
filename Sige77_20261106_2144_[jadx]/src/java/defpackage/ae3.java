package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ae3 {
    public static final gh1 a;

    static {
        no0 no0Var = ro0.b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        ga.e(24, objArr);
        a = ro0.h(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.FLAVOR);
        } catch (ClassCastException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final boolean b(ok2 ok2Var, lh1 lh1Var, lh1 lh1Var2, jr1 jr1Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        yd3 yd3Var;
        char c;
        int iC = c(ok2Var);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(ok2Var, lh1Var2) == pk2.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (ok2Var == ok2.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && jr1Var.d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (lh1Var.containsKey(ok2Var) && (yd3Var = (yd3) lh1Var.get(ok2Var)) != null) {
                int iOrdinal = yd3Var.ordinal();
                pk2 pk2Var = pk2.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    pk2 pk2Var2 = pk2.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(ok2Var, lh1Var2) == pk2Var ? f(ok2Var, cArr, str3, z2) : e(ok2Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(ok2Var, lh1Var2) == pk2Var2 ? e(ok2Var, cArr, str2, z) : f(ok2Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(ok2Var, lh1Var2) != pk2Var2) {
                        return f(ok2Var, cArr, str3, z2);
                    }
                } else if (g(ok2Var, lh1Var2) != pk2Var) {
                    return e(ok2Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(ok2 ok2Var) {
        if (ok2Var == ok2.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (ok2Var == ok2.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (ok2Var == ok2.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return ok2Var == ok2.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(ok2 ok2Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < ok2Var.zza()) ? "0" : String.valueOf(str.charAt(ok2Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= ok2Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(ok2Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(ok2 ok2Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(ok2Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= ok2Var.zza()) {
                char cCharAt = str.charAt(ok2Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(ok2 ok2Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(ok2Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= ok2Var.zza()) {
                char cCharAt = str.charAt(ok2Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final pk2 g(ok2 ok2Var, lh1 lh1Var) {
        Object obj = lh1Var.get(ok2Var);
        if (obj == null) {
            obj = pk2.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (pk2) obj;
    }
}
