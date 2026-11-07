package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;

    public /* synthetic */ k4(ActivityHandler activityHandler, int i) {
        this.a = i;
        this.b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.B(activityHandler);
                break;
            case 1:
                ActivityHandler.i(activityHandler);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ActivityHandler.y(activityHandler);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ActivityHandler.P(activityHandler);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ActivityHandler.j(activityHandler);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ActivityHandler.C(activityHandler);
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ActivityHandler.u(activityHandler);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                ActivityHandler.a(activityHandler);
                break;
            default:
                ActivityHandler.Q(activityHandler);
                break;
        }
    }
}
