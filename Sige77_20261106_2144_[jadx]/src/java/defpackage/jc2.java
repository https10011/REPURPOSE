package defpackage;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jc2 extends kb2 {
    public final /* synthetic */ hc2 a;

    public jc2(hc2 hc2Var) {
        this.a = hc2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        hc2 hc2Var = this.a;
        decorView.postDelayed(hc2Var.f, 300L);
        WeakReference weakReference = new WeakReference(activity);
        if (hc2Var.a) {
            hc2Var.b.d = weakReference;
        }
    }
}
