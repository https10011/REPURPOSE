package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustEvent c;

    public /* synthetic */ o4(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustEvent adjustEvent = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.v(activityHandler, adjustEvent);
                break;
            default:
                ActivityHandler.N(activityHandler, adjustEvent);
                break;
        }
    }
}
