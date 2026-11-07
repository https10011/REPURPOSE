package defpackage;

import android.app.Activity;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zq1 extends kf {
    public static final ExecutorService d = Executors.newCachedThreadPool();
    public static final ll0 e = new ll0(Looper.getMainLooper());
    public final String a = AppTestApp.Z;
    public final WeakReference b;
    public final CountDownLatch c;

    public zq1(X5_Activity x5_Activity, CountDownLatch countDownLatch) {
        this.b = new WeakReference(x5_Activity);
        this.c = countDownLatch;
    }

    @Override // defpackage.kf
    public final Activity a() {
        Activity activity = (Activity) this.b.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    public final sx0 c() throws InterruptedException {
        String strA;
        this.c.await();
        String str = this.a;
        if (str.contains("apptesting")) {
            strA = ak1.a(str, true);
            AppTestApp.w.getClass();
            strA.getClass();
        } else {
            strA = ak1.a(str, false);
            if (ea.q(strA)) {
                kv.F("Fast domain: {}", strA);
                AppTestApp.w.getClass();
                strA.getClass();
            } else {
                strA = null;
            }
        }
        return b(strA);
    }
}
