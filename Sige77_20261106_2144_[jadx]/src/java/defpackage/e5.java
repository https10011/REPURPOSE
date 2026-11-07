package defpackage;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class e5 {
    public static final String a;
    public static final ScheduledExecutorService b;
    public static final ScheduledExecutorService c;
    public static volatile ScheduledFuture d;
    public static final Object e;
    public static final AtomicInteger f;
    public static volatile wf3 g;
    public static final AtomicBoolean h;
    public static String i;
    public static long j;
    public static int k;
    public static WeakReference l;
    public static String m;

    static {
        String canonicalName = e5.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        a = canonicalName;
        b = Executors.newSingleThreadScheduledExecutor();
        c = Executors.newSingleThreadScheduledExecutor();
        e = new Object();
        f = new AtomicInteger(0);
        h = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (e) {
            try {
                if (d != null && (scheduledFuture = d) != null) {
                    scheduledFuture.cancel(false);
                }
                d = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        wf3 wf3Var;
        if (g == null || (wf3Var = g) == null) {
            return null;
        }
        return (UUID) wf3Var.e;
    }

    public static final void c(Application application, String str) {
        application.getClass();
        int i2 = 0;
        int i3 = 1;
        if (h.compareAndSet(false, true)) {
            fa0.a(new e(i3), da0.CodelessEvents);
            i = str;
            application.registerActivityLifecycleCallbacks(new d5(i2));
        }
    }
}
