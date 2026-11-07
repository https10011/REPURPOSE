package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStoreSubscription;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustPlayStoreSubscription c;

    public /* synthetic */ r4(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.E(activityHandler, adjustPlayStoreSubscription);
                break;
            default:
                ActivityHandler.w(activityHandler, adjustPlayStoreSubscription);
                break;
        }
    }
}
