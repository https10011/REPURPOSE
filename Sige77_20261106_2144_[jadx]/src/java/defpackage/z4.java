package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ z4(ActivityHandler activityHandler, String str, String str2, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ActivityHandler.W(str2, str, activityHandler);
                break;
            default:
                ActivityHandler.G(str2, str, activityHandler);
                break;
        }
    }
}
