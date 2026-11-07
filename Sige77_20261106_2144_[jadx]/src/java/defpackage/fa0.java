package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fa0 {
    public static final fa0 a = new fa0();
    public static final HashMap b = new HashMap();

    public static final void a(ca0 ca0Var, da0 da0Var) {
        da0Var.getClass();
        ha0.d(new ea0(ca0Var, da0Var));
    }

    public static final boolean b(da0 da0Var) {
        da0 da0VarL;
        boolean z;
        da0Var.getClass();
        boolean z2 = false;
        if (da0.Unknown != da0Var) {
            if (da0.Core != da0Var) {
                String string = i90.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + da0Var, null);
                if (string == null || !Intrinsics.areEqual(string, "18.2.3")) {
                    int i = da0Var.a;
                    if ((i & 255) > 0) {
                        da0VarL = zi0.l(i & (-256));
                    } else if ((65280 & i) > 0) {
                        da0VarL = zi0.l(i & (-65536));
                    } else {
                        da0VarL = (16711680 & i) > 0 ? zi0.l(i & (-16777216)) : zi0.l(0);
                    }
                    if (da0VarL == da0Var) {
                        switch (da0Var.ordinal()) {
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z2 = true;
                                break;
                        }
                        return ha0.b("FBSDKFeature" + da0Var, i90.b(), z2);
                    }
                    if (b(da0VarL)) {
                        switch (da0Var.ordinal()) {
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                                z = false;
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            default:
                                z = true;
                                break;
                        }
                        if (ha0.b("FBSDKFeature" + da0Var, i90.b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
