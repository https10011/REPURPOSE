package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dg2 extends kb2 {
    public i4 a = null;
    public final Handler b = new Handler(Looper.getMainLooper());
    public volatile boolean c = true;
    public volatile boolean d = false;
    public long e = SystemClock.uptimeMillis();
    public final /* synthetic */ p11 f;

    public dg2(p11 p11Var) {
        this.f = p11Var;
    }

    @Override // defpackage.kb2, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.d = true;
        i4 i4Var = this.a;
        if (i4Var != null) {
            this.b.removeCallbacks(i4Var);
        }
        i4 i4Var2 = new i4(this, 25);
        this.a = i4Var2;
        this.b.postDelayed(i4Var2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z = this.c;
        this.c = true;
        this.d = false;
        i4 i4Var = this.a;
        if (i4Var != null) {
            this.b.removeCallbacks(i4Var);
            this.a = null;
        }
        if (z) {
            return;
        }
        this.e = SystemClock.uptimeMillis();
    }
}
