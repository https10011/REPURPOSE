package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i90 {
    public static final i90 a = new i90();
    public static final HashSet b = lp1.a(j01.b);
    public static Executor c;
    public static volatile String d;
    public static volatile String e;
    public static String f;
    public static String g;
    public static volatile String h;
    public static volatile Boolean i;
    public static Context j;
    public static int k;
    public static final ReentrantLock l;
    public static final String m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static final AtomicBoolean q;
    public static volatile String r;
    public static volatile String s;
    public static final ur t;
    public static boolean u;

    static {
        new AtomicLong(65536L);
        k = 64206;
        l = new ReentrantLock();
        m = "v16.0";
        q = new AtomicBoolean(false);
        r = "instagram.com";
        s = "facebook.com";
        t = new ur(9);
    }

    public static final Context a() {
        dw0.y();
        Context context = j;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    public static final String b() {
        dw0.y();
        String str = d;
        if (str != null) {
            return str;
        }
        throw new d90("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            Executor executor = c;
            if (executor != null) {
                return executor;
            }
            uq1.q("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = m;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = AccessToken.Y;
        AccessToken accessTokenT = aj0.t();
        String str = accessTokenT != null ? accessTokenT.X : null;
        String str2 = s;
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return d.g(str2, "facebook.com", "fb.gg");
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return d.g(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    public static final boolean f(Context context) {
        context.getClass();
        dw0.y();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        return u;
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (d.j(lowerCase, "fb", false)) {
                        d = str.substring(2);
                    } else {
                        d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new d90("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (h == null) {
                h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (k == 64206) {
                k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (i == null) {
                i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void i(Context context) {
        context.getClass();
        j(context);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4 A[Catch: all -> 0x0016, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x0010, B:12:0x0019, B:14:0x0026, B:15:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0049, B:22:0x004f, B:24:0x0053, B:26:0x0059, B:35:0x007f, B:36:0x0081, B:38:0x0085, B:39:0x008b, B:41:0x008f, B:43:0x0095, B:45:0x0099, B:46:0x009f, B:48:0x00aa, B:50:0x00b3, B:52:0x00b7, B:53:0x00bd, B:59:0x00d5, B:60:0x00d8, B:62:0x00e4, B:64:0x00eb, B:47:0x00a7, B:33:0x007a, B:67:0x0160, B:68:0x0167, B:69:0x0168, B:70:0x016f, B:56:0x00c8, B:30:0x006d), top: B:78:0x0003, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final synchronized void j(Context context) {
        Context context2;
        wa waVarB;
        int i2;
        Context context3;
        Context context4;
        Application application;
        context.getClass();
        if (q.get()) {
            return;
        }
        try {
            int i3 = FacebookActivity.n0;
            dw0.k(context);
        } catch (ClassNotFoundException unused) {
        }
        int i4 = dw0.i;
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            Log.w("dw0", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        j = applicationContext;
        yv2.w(context);
        Context context5 = j;
        Context context6 = null;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context5 = null;
        }
        h(context5);
        String str = d;
        if (str == null || str.length() == 0) {
            throw new d90("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = h;
        if (str2 == null || str2.length() == 0) {
            throw new d90("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        int i5 = 1;
        q.set(true);
        x32 x32Var = x32.a;
        boolean zA = false;
        if (!mt.a.contains(x32.class)) {
            try {
                x32.a.e();
                zA = x32.d.a();
            } catch (Throwable th) {
                mt.a(x32.class, th);
            }
            if (zA) {
                u = true;
            }
            context2 = j;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context2 = null;
            }
            if (context2 instanceof Application) {
                op0.z();
            } else {
                op0.z();
            }
            waVarB = wa.c.b();
            i2 = 2;
            if (waVarB != null) {
                context4 = j;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    context4 = null;
                }
                application = (Application) context4;
                if (!mt.a.contains(waVarB)) {
                    application.getClass();
                    application.registerActivityLifecycleCallbacks(new d5(i2));
                }
            }
            ma0.d();
            l61.l();
            xh xhVar = xh.c;
            context3 = j;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            } else {
                context6 = context3;
            }
            jw.l(context6);
            zj zjVar = new zj(i5);
            hd2 hd2Var = new hd2(5);
            hd2Var.c = new CountDownLatch(1);
            c().execute(new FutureTask(new y90(i5, hd2Var, zjVar)));
            fa0.a(new ur(10), da0.Instrument);
            fa0.a(new ur(11), da0.AppEvents);
            fa0.a(new ur(12), da0.ChromeCustomTabsPrefetching);
            fa0.a(new ur(13), da0.IgnoreAppSwitchToLoggedOut);
            fa0.a(new ur(14), da0.BypassAppSwitch);
            c().execute(new FutureTask(new zj(i2)));
            return;
        }
        if (zA) {
            u = true;
        }
        context2 = j;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context2 = null;
        }
        if ((context2 instanceof Application) || !x32.c()) {
            op0.z();
        } else {
            Context context7 = j;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context7 = null;
            }
            e5.c((Application) context7, d);
        }
        waVarB = wa.c.b();
        i2 = 2;
        if (waVarB != null) {
            context4 = j;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context4 = null;
            }
            application = (Application) context4;
            if (!mt.a.contains(waVarB)) {
                try {
                    application.getClass();
                    application.registerActivityLifecycleCallbacks(new d5(i2));
                } catch (Throwable th2) {
                    mt.a(waVarB, th2);
                }
            }
        }
        ma0.d();
        l61.l();
        xh xhVar2 = xh.c;
        context3 = j;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context6 = context3;
        }
        jw.l(context6);
        zj zjVar2 = new zj(i5);
        hd2 hd2Var2 = new hd2(5);
        hd2Var2.c = new CountDownLatch(1);
        c().execute(new FutureTask(new y90(i5, hd2Var2, zjVar2)));
        fa0.a(new ur(10), da0.Instrument);
        fa0.a(new ur(11), da0.AppEvents);
        fa0.a(new ur(12), da0.ChromeCustomTabsPrefetching);
        fa0.a(new ur(13), da0.IgnoreAppSwitchToLoggedOut);
        fa0.a(new ur(14), da0.BypassAppSwitch);
        c().execute(new FutureTask(new zj(i2)));
        return;
        throw th;
    }
}
