package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ kf0(lf0 lf0Var, int i) {
        this.a = i;
        this.b = lf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lf0 lf0Var = this.b;
        switch (i) {
            case 0:
                ViewParent parent = lf0Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                lf0Var.a();
                View view = lf0Var.d;
                if (view.isEnabled() && !view.isLongClickable() && lf0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    lf0Var.i = true;
                    break;
                }
                break;
        }
    }
}
