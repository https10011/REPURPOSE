package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zc1 extends v50 {
    final /* synthetic */ ad1 this$0;

    public static final class a extends v50 {
        final /* synthetic */ ad1 this$0;

        public a(ad1 ad1Var) {
            this.this$0 = ad1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ad1 ad1Var = this.this$0;
            int i = ad1Var.a + 1;
            ad1Var.a = i;
            if (i == 1 && ad1Var.d) {
                ad1Var.f.e(kw0.ON_START);
                ad1Var.d = false;
            }
        }
    }

    public zc1(ad1 ad1Var) {
        this.this$0 = ad1Var;
    }

    @Override // defpackage.v50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = wh1.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((wh1) fragmentFindFragmentByTag).a = this.this$0.v;
        }
    }

    @Override // defpackage.v50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ad1 ad1Var = this.this$0;
        int i = ad1Var.b - 1;
        ad1Var.b = i;
        if (i == 0) {
            Handler handler = ad1Var.e;
            handler.getClass();
            handler.postDelayed(ad1Var.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        yc1.a(activity, new a(this.this$0));
    }

    @Override // defpackage.v50, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ad1 ad1Var = this.this$0;
        int i = ad1Var.a - 1;
        ad1Var.a = i;
        if (i == 0 && ad1Var.c) {
            ad1Var.f.e(kw0.ON_STOP);
            ad1Var.d = true;
        }
    }
}
