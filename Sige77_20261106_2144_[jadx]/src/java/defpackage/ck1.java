package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.google.android.recaptcha.internal.zzln;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class ck1 {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static final de2 a(int i) {
        return new de2(k(i), l(i));
    }

    public static final de2 b(int i, String str) {
        return new de2(k(i), l(i) + "：" + str);
    }

    public static final void c(View view, int i) {
        view.getClass();
        int iV = ts.v(i);
        if (iV == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (e.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iV == 1) {
            if (e.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iV == 2) {
            if (e.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iV != 3) {
            return;
        }
        if (e.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static Number d(int i, au0 au0Var) {
        if (i == 1) {
            return Double.valueOf(au0Var.w());
        }
        if (i == 2) {
            return new uv0(au0Var.M());
        }
        if (i == 3) {
            String strM = au0Var.M();
            if (strM.indexOf(46) >= 0) {
                return e(strM, au0Var);
            }
            try {
                return Long.valueOf(Long.parseLong(strM));
            } catch (NumberFormatException unused) {
                return e(strM, au0Var);
            }
        }
        String strM2 = au0Var.M();
        try {
            return ea.t(strM2);
        } catch (NumberFormatException e) {
            StringBuilder sbN = ts.n("Cannot parse ", strM2, "; at path ");
            sbN.append(au0Var.n(true));
            throw new xp(4, sbN.toString(), e);
        }
    }

    public static Double e(String str, au0 au0Var) throws f11 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (au0Var.b0 != 1) {
                    throw new f11("JSON forbids NaN and infinities: " + dValueOf + "; at path " + au0Var.n(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbN = ts.n("Cannot parse ", str, "; at path ");
            sbN.append(au0Var.n(true));
            throw new xp(4, sbN.toString(), e);
        }
    }

    public static /* synthetic */ int f(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        e.b("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static final boolean g(int i) {
        Boolean bool;
        if (!f73.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f73.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static final int h(int i) {
        if (i == 5) {
            ds2.c();
            throw null;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return -1;
        }
        throw null;
    }

    public static final boolean i(int i) {
        return !f73.a();
    }

    public static int j(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int k(int i) {
        switch (i) {
            case 1:
                return -8;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return -12;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return -1;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return -2;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return -4;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return -7;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "未调用初始化";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "初始化时错误";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "请求失败";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "请求异常";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "请求错误";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "超时返回，请重试";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "data 不匹配";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "uri 不匹配";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int m(int i) {
        switch (i) {
            case 1:
                return 0;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return 1;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return 2;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return 3;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return 4;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return 5;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int n(int i, int i2, int i3) {
        return tl2.a(i) + i2 + i3;
    }

    public static int o(int i, int i2, int i3, int i4) {
        return tl2.a(i) + i2 + i3 + i4;
    }

    public static int p(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static long q(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static String r(int i, String str) {
        return str + i;
    }

    public static String s(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String t(String str, long j) {
        return str + j;
    }

    public static StringBuilder u(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static um2 v(um2 um2Var) {
        int size = um2Var.size();
        return um2Var.zzg(size + size);
    }

    public static int w(int i, int i2, int i3) {
        return tr2.t(i) + i2 + i3;
    }

    public static int x(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "ANDROID_TOO_OLD";
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return "NON_PLAY_MODE";
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return "SDK_TOO_OLD";
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return "MISSING_JOB_SCHEDULER";
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }
}
