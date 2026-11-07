package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ OnIsEnabledListener c;

    public /* synthetic */ s4(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OnIsEnabledListener onIsEnabledListener = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.J(activityHandler, onIsEnabledListener);
                break;
            case 1:
                ActivityHandler.b(activityHandler, onIsEnabledListener);
                break;
            default:
                ActivityHandler.f(activityHandler, onIsEnabledListener);
                break;
        }
    }
}
