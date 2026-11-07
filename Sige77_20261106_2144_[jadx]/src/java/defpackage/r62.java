package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r62 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d = new HashMap();
    public final WeakReference a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    public r62(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public final void a() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            y1 y1Var = new y1(this, 26);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                y1Var.run();
            } else {
                this.b.post(y1Var);
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
