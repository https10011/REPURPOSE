package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class u4 implements IRunActivityHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ u4(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final void run(ActivityHandler activityHandler) {
        switch (this.a) {
            case 0:
                ActivityHandler.z(this.b, this.c, activityHandler);
                break;
            default:
                ActivityHandler.t(this.b, this.c, activityHandler);
                break;
        }
    }
}
