package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class v4 implements IRunActivityHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdjustThirdPartySharing b;

    public /* synthetic */ v4(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.a = i;
        this.b = adjustThirdPartySharing;
    }

    public final void run(ActivityHandler activityHandler) {
        int i = this.a;
        AdjustThirdPartySharing adjustThirdPartySharing = this.b;
        switch (i) {
            case 0:
                ActivityHandler.H(adjustThirdPartySharing, activityHandler);
                break;
            default:
                AdjustInstance.b(adjustThirdPartySharing, activityHandler);
                break;
        }
    }
}
