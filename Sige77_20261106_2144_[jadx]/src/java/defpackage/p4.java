package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class p4 implements IRunActivityHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ p4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final void run(ActivityHandler activityHandler) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                ActivityHandler.V(str, activityHandler);
                break;
            default:
                ActivityHandler.O(str, activityHandler);
                break;
        }
    }
}
