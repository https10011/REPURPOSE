package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b03 {
    public static volatile b03 g;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public int c;
    public boolean d;
    public volatile bx2 e;
    public volatile long f;

    public b03(Context context, Bundle bundle) {
        b00 b00Var = new b00(this);
        int i = 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b00Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        new ArrayList();
        int i2 = 0;
        try {
            if (ia.w(context, r93.n0(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, b03.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new zy2(this, context, bundle, i2));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new aa0(this, i));
        }
    }

    public static b03 c(Context context, Bundle bundle) {
        gu2.o(context);
        if (g == null) {
            synchronized (b03.class) {
                try {
                    if (g == null) {
                        g = new b03(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final void a(uz2 uz2Var) {
        this.a.execute(uz2Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.d |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new zy2(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        xw2 xw2Var = new xw2();
        a(new ez2(this, xw2Var, 2));
        Long l = (Long) xw2.D(xw2Var.e(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.c + 1;
        this.c = i;
        return jNextLong + ((long) i);
    }
}
