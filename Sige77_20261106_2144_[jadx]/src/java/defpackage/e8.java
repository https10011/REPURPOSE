package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class e8 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, k8 k8Var) {
        Objects.requireNonNull(k8Var);
        d8 d8Var = new d8(k8Var, 0);
        q2.i(obj).registerOnBackInvokedCallback(1000000, d8Var);
        return d8Var;
    }

    public static void c(Object obj, Object obj2) {
        q2.i(obj).unregisterOnBackInvokedCallback(q2.f(obj2));
    }
}
