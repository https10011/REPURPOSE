package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStorePurchase;
import com.adjust.sdk.OnPurchaseVerificationFinishedListener;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustPlayStorePurchase c;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener d;

    public /* synthetic */ t4(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustPlayStorePurchase;
        this.d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.d;
        AdjustPlayStorePurchase adjustPlayStorePurchase = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.F(activityHandler, adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
            default:
                ActivityHandler.D(activityHandler, adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
                break;
        }
    }
}
