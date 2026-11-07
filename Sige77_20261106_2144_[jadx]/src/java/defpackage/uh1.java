package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class uh1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, kw0 kw0Var) {
        activity.getClass();
        kw0Var.getClass();
        if (activity instanceof ww0) {
            a lifecycle = ((ww0) activity).getLifecycle();
            if (lifecycle instanceof a) {
                lifecycle.e(kw0Var);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            wh1.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new wh1.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new wh1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
