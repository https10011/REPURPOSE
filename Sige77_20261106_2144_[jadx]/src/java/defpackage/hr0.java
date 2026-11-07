package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hr0 extends gb2 {
    public final /* synthetic */ int X;

    @Override // defpackage.gb2
    public nj0 f(Context context, Looper looper, uy1 uy1Var, Object obj, sj0 sj0Var, tj0 tj0Var) {
        switch (this.X) {
            case 1:
                uy1Var.getClass();
                Integer num = (Integer) uy1Var.i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new rq1(context, looper, uy1Var, bundle, sj0Var, tj0Var);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                obj.getClass();
                throw new ClassCastException();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return super.f(context, looper, uy1Var, obj, sj0Var, tj0Var);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new ji2(context, looper, uy1Var, (ki2) obj, (rg2) sj0Var, (rg2) tj0Var);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new li2(context, looper, uy1Var, (GoogleSignInOptions) obj, (rg2) sj0Var, (rg2) tj0Var);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return new b93(context, looper, 51, uy1Var, sj0Var, tj0Var, 0);
        }
    }

    @Override // defpackage.gb2
    public nj0 g(Context context, Looper looper, uy1 uy1Var, Object obj, rg2 rg2Var, rg2 rg2Var2) {
        switch (this.X) {
            case 0:
                context.getClass();
                looper.getClass();
                ((e7) obj).getClass();
                return new nn0(context, looper, 352, uy1Var, rg2Var, rg2Var2, 0);
            case 1:
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            default:
                return super.g(context, looper, uy1Var, obj, rg2Var, rg2Var2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ng2(context, looper, 449, uy1Var, rg2Var, rg2Var2, 0);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new vh2(context, looper, uy1Var, (sw1) obj, rg2Var, rg2Var2);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zh2(context, looper, uy1Var, rg2Var, rg2Var2);
        }
    }
}
