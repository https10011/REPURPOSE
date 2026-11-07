package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustAdRevenue c;

    public /* synthetic */ n4(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustAdRevenue adjustAdRevenue = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.r(activityHandler, adjustAdRevenue);
                break;
            default:
                ActivityHandler.q(activityHandler, adjustAdRevenue);
                break;
        }
    }
}
