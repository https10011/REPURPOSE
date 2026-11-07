package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ String c;

    public /* synthetic */ q4(ActivityHandler activityHandler, String str, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.o(str, activityHandler);
                break;
            case 1:
                ActivityHandler.d(str, activityHandler);
                break;
            default:
                ActivityHandler.h(str, activityHandler);
                break;
        }
    }
}
