package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class y4 implements IRunActivityHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y4(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void run(ActivityHandler activityHandler) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ActivityHandler.L(activityHandler, z);
                break;
            default:
                AdjustInstance.a(activityHandler, z);
                break;
        }
    }
}
