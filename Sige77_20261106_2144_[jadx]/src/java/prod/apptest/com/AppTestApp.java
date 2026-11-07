package prod.apptest.com;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.fm.openinstall.OpenInstall;
import com.hjq.toast.BuildConfig;
import com.hjq.toast.ToastUtils;
import com.transsion.athena.attribution.ReferrerTask;
import defpackage.ab;
import defpackage.ak1;
import defpackage.b81;
import defpackage.cc2;
import defpackage.d42;
import defpackage.d5;
import defpackage.e;
import defpackage.ea;
import defpackage.f91;
import defpackage.gf2;
import defpackage.hc;
import defpackage.id2;
import defpackage.j10;
import defpackage.kv;
import defpackage.mz0;
import defpackage.nj2;
import defpackage.oc1;
import defpackage.qd2;
import defpackage.sc2;
import defpackage.su1;
import defpackage.ts;
import defpackage.uk0;
import defpackage.uq1;
import defpackage.x50;
import defpackage.ze2;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileLock;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import prod.apptest.com.webview.CacheType;
import prod.apptest.com.webview.WebViewCacheInterceptor;
import prod.apptest.com.webview.WebViewCacheInterceptorInst;
import prod.apptest.com.webview.config.CacheExtensionConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lprod/apptest/com/AppTestApp;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {oc1.FLOAT_FIELD_NUMBER, oc1.FLOAT_FIELD_NUMBER, 0}, xi = 48)
public final class AppTestApp extends Application {
    public static String W = null;
    public static String X = null;
    public static String Y = null;
    public static String Z = null;
    public static String a0 = null;
    public static String b0 = null;
    public static boolean c0 = false;
    public static String d0 = null;
    public static String e = null;
    public static String e0 = "0";
    public static String f = null;
    public static String f0 = "0";
    public static String g0 = "0";
    public static String h0 = null;
    public static String i = null;
    public static String i0 = null;
    public static String j0 = null;
    public static String k0 = null;
    public static String l0 = null;
    public static int m0 = 1;
    public static final HashSet n0 = new HashSet();
    public static String v;
    public static AppTestApp w;
    public final su1 a;
    public SharedPreferences b;
    public ApplicationInfo c;
    public WebView d;

    public AppTestApp() {
        su1 su1Var = new su1();
        su1Var.a = true;
        su1Var.b = -1L;
        this.a = su1Var;
    }

    public static void a(String str) {
        String strA = ak1.a(str, true);
        strA.getClass();
        n0.add(strA);
    }

    public static String c(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(strArr[i2]);
            if (i2 != length - 1) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static void g(Context context, String str) {
        File file = new File(context.getDataDir().getAbsolutePath() + "/app_webview" + str + "/webview_data.lock");
        if (file.exists()) {
            try {
                FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
                fileLockTryLock.getClass();
                fileLockTryLock.close();
            } catch (Exception unused) {
                if (file.exists() ? file.delete() : false) {
                    try {
                        if (file.exists()) {
                            return;
                        }
                        file.createNewFile();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String packageName;
        context.getClass();
        super.attachBaseContext(context);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            String str = BuildConfig.FLAVOR;
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) systemService).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    packageName = null;
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == Process.myPid()) {
                    packageName = next.processName;
                    break;
                }
            }
            if (!TextUtils.equals(context.getPackageName(), packageName)) {
                if (TextUtils.isEmpty(packageName)) {
                    packageName = context.getPackageName();
                }
                packageName.getClass();
                WebView.setDataDirectorySuffix(packageName);
                str = "_" + packageName;
            }
            g(context, str);
        } catch (Exception e2) {
            kv.o("webview setDataDirectorySuffix failure", e2);
        }
    }

    public final String b() {
        String string;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("gaid_" + X, BuildConfig.FLAVOR);
        } else {
            string = null;
        }
        return (string == null || ea.o(string)) ? BuildConfig.FLAVOR : string;
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.b;
        sharedPreferences.getClass();
        return sharedPreferences.getString("SPLASH_URL", BuildConfig.FLAVOR);
    }

    public final void e(List list) {
        SharedPreferences sharedPreferences = this.b;
        sharedPreferences.getClass();
        sharedPreferences.edit().putString(e, new uk0().d(list)).apply();
        long time = new Date().getTime();
        SharedPreferences sharedPreferences2 = this.b;
        sharedPreferences2.getClass();
        sharedPreferences2.edit().putLong(f, time).apply();
    }

    public final void f(String str, boolean z) {
        if (z) {
            long time = new Date().getTime();
            SharedPreferences sharedPreferences = this.b;
            sharedPreferences.getClass();
            sharedPreferences.edit().putLong(v, time).apply();
        }
        if (ea.o(str)) {
            SharedPreferences sharedPreferences2 = this.b;
            sharedPreferences2.getClass();
            sharedPreferences2.edit().putLong(v, -1L).apply();
        }
        SharedPreferences sharedPreferences3 = this.b;
        sharedPreferences3.getClass();
        sharedPreferences3.edit().putString(i, str).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public final void onCreate() {
        String property;
        boolean zEquals;
        String str;
        Integer intOrNull;
        w = this;
        super.onCreate();
        System.currentTimeMillis();
        try {
            this.c = getPackageManager().getApplicationInfo(getPackageName(), 128);
            su1 su1Var = this.a;
            int iIntValue = 0;
            su1Var.a = false;
            mz0.n = su1Var;
            this.b = getSharedPreferences(getString(2131886122), 0);
            ApplicationInfo applicationInfo = this.c;
            applicationInfo.getClass();
            applicationInfo.metaData.getString("appName");
            ApplicationInfo applicationInfo2 = this.c;
            applicationInfo2.getClass();
            Y = applicationInfo2.metaData.getString("merchant");
            ApplicationInfo applicationInfo3 = this.c;
            applicationInfo3.getClass();
            Z = applicationInfo3.metaData.getString("merchant_url");
            ApplicationInfo applicationInfo4 = this.c;
            applicationInfo4.getClass();
            a0 = applicationInfo4.metaData.getString("version");
            ApplicationInfo applicationInfo5 = this.c;
            applicationInfo5.getClass();
            b0 = applicationInfo5.metaData.getString("backupDomain");
            ApplicationInfo applicationInfo6 = this.c;
            applicationInfo6.getClass();
            int i2 = 1;
            c0 = 1 == applicationInfo6.metaData.getInt("isSingleLine", 0);
            ApplicationInfo applicationInfo7 = this.c;
            applicationInfo7.getClass();
            String string = applicationInfo7.metaData.getString("affiliateCode", BuildConfig.FLAVOR);
            String strTrim = string == null ? null : string.toLowerCase().trim();
            d0 = strTrim;
            String strH = strTrim != null ? d.h(strTrim) : null;
            d0 = strH;
            if (Intrinsics.areEqual(strH, "0")) {
                d0 = BuildConfig.FLAVOR;
            }
            ApplicationInfo applicationInfo8 = this.c;
            applicationInfo8.getClass();
            String string2 = applicationInfo8.metaData.getString("APPSFLYER_KEY", "0");
            string2.getClass();
            e0 = string2;
            ApplicationInfo applicationInfo9 = this.c;
            applicationInfo9.getClass();
            String string3 = applicationInfo9.metaData.getString("ADJUST_APP_TOKEN", "0");
            string3.getClass();
            f0 = string3;
            ApplicationInfo applicationInfo10 = this.c;
            applicationInfo10.getClass();
            String string4 = applicationInfo10.metaData.getString("com.openinstall.APP_KEY", "0");
            string4.getClass();
            g0 = string4;
            ApplicationInfo applicationInfo11 = this.c;
            applicationInfo11.getClass();
            m0 = applicationInfo11.metaData.getInt("device", 1);
            ApplicationInfo applicationInfo12 = this.c;
            applicationInfo12.getClass();
            h0 = applicationInfo12.metaData.getString("AGENT_NAME");
            ApplicationInfo applicationInfo13 = this.c;
            applicationInfo13.getClass();
            String string5 = applicationInfo13.metaData.getString("FB_PIXEL_ID");
            i0 = string5;
            String strH2 = string5 != null ? d.h(string5) : null;
            String strTrim2 = strH2 == null ? null : strH2.toLowerCase().trim();
            i0 = strTrim2;
            if (Intrinsics.areEqual(strTrim2, "0")) {
                i0 = BuildConfig.FLAVOR;
            }
            ApplicationInfo applicationInfo14 = this.c;
            applicationInfo14.getClass();
            String string6 = applicationInfo14.metaData.getString("TID");
            j0 = string6;
            String strH3 = string6 != null ? d.h(string6) : null;
            String strTrim3 = strH3 == null ? null : strH3.toLowerCase().trim();
            j0 = strTrim3;
            if (Intrinsics.areEqual(strTrim3, "0")) {
                j0 = BuildConfig.FLAVOR;
            }
            ApplicationInfo applicationInfo15 = this.c;
            applicationInfo15.getClass();
            String string7 = applicationInfo15.metaData.getString("ADJUST_DEFAULT_TRACKER");
            l0 = string7;
            String strH4 = string7 != null ? d.h(string7) : null;
            String strTrim4 = strH4 == null ? null : strH4.toLowerCase().trim();
            l0 = strTrim4;
            if (Intrinsics.areEqual(strTrim4, "0")) {
                l0 = BuildConfig.FLAVOR;
            }
            ApplicationInfo applicationInfo16 = this.c;
            applicationInfo16.getClass();
            String string8 = applicationInfo16.metaData.getString("SNOW_BALL_APP_ID");
            k0 = string8;
            String strH5 = string8 != null ? d.h(string8) : null;
            String strTrim5 = strH5 == null ? null : strH5.toLowerCase().trim();
            k0 = strTrim5;
            if (Intrinsics.areEqual(strTrim5, "0")) {
                k0 = BuildConfig.FLAVOR;
            }
            String str2 = Y;
            X = str2;
            W = ts.k("https://", str2, ".www.gfbwff.com/api/app/latest?os=android");
            kv.F("applicationId={}, packageName={}", "prod.app_sige7tlbf5.com", getApplicationContext().getPackageName());
            kv.F("merchantValue={}", Y);
            kv.F("merchant_urlValue={}", Z);
            kv.F("merchant_appnames={}", X);
            kv.F("getupdata={}", W);
            kv.F("backupDomain={}", b0);
            kv.F("affiliateCode={}", d0);
            kv.F("device={}", Integer.valueOf(m0));
            kv.F("fbPixelId={}", i0);
            kv.F("adjustDefaultTracker={}", l0);
            new j10(this);
            String strValueOf = String.valueOf(j10.b);
            kv.F("UUID={}", strValueOf);
            String str3 = a0;
            String str4 = ak1.a;
            try {
                property = WebSettings.getDefaultUserAgent(this);
            } catch (Exception unused) {
                property = System.getProperty("http.agent");
            }
            StringBuilder sb = new StringBuilder();
            int length = property.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = property.charAt(i3);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
            }
            String strReplace = sb.toString().replace("; wv", "; xx-xx");
            String str5 = Build.BRAND;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strReplace);
            sb2.append("/");
            sb2.append(str5);
            sb2.append(" AppShellVer:");
            sb2.append(str3);
            ak1.a = ts.l(sb2, " UUID/", strValueOf);
            ToastUtils.init(this);
            ToastUtils.setGravity(81, 0, getResources().getDimensionPixelSize(2131166231));
            ToastUtils.setView(2131493004);
            String str6 = X;
            str6.getClass();
            e = c("cache", str6, "domainRoute");
            String str7 = X;
            str7.getClass();
            f = c("access", str7, "domainRoute");
            String str8 = X;
            str8.getClass();
            i = c("cache", str8, "lastUrl");
            String str9 = X;
            str9.getClass();
            v = c("access", str9, "lastUrl");
            SharedPreferences sharedPreferences = this.b;
            sharedPreferences.getClass();
            String string9 = sharedPreferences.getString("VERSION", BuildConfig.FLAVOR);
            string9.getClass();
            String str10 = a0;
            if (ea.o(string9) || !Intrinsics.areEqual(str10, string9)) {
                e(x50.a);
                f(BuildConfig.FLAVOR, false);
            }
            SharedPreferences sharedPreferences2 = this.b;
            sharedPreferences2.getClass();
            sharedPreferences2.edit().putString("VERSION", str10).apply();
            CacheExtensionConfig cacheExtensionConfig = new CacheExtensionConfig();
            cacheExtensionConfig.addExtension("json").removeExtension("html").removeExtension("htm").removeExtension("swf");
            WebViewCacheInterceptor.Builder builder = new WebViewCacheInterceptor.Builder(this);
            builder.setCachePath(new File(getCacheDir(), "web_view_cache")).setCacheSize(104857600L).setConnectTimeoutSecond(15L).setReadTimeoutSecond(15L).setCacheExtensionConfig(cacheExtensionConfig).setCacheType(CacheType.FORCE).setDebug(true);
            WebViewCacheInterceptorInst.getInstance().init(builder);
            if (!Intrinsics.areEqual(e0, "0")) {
                AppsFlyerLib.getInstance().init(StringsKt.F(e0).toString(), (AppsFlyerConversionListener) null, this);
                AppsFlyerLib.getInstance().start(this);
            }
            if (!Intrinsics.areEqual(f0, "0")) {
                try {
                    AdjustConfig adjustConfig = new AdjustConfig(this, StringsKt.F(f0).toString(), "production");
                    if (ea.q(l0)) {
                        adjustConfig.setDefaultTracker(l0);
                    }
                    adjustConfig.setLogLevel(LogLevel.WARN);
                    adjustConfig.setOnSessionTrackingSucceededListener(new ab(this, iIntValue));
                    Adjust.initSdk(adjustConfig);
                    registerActivityLifecycleCallbacks(new d5(i2));
                } catch (Exception unused2) {
                }
            }
            if (!StringsKt.w(g0) && !Intrinsics.areEqual(g0, "0")) {
                kv.F("OpenInstall.preInit: {}", g0);
                OpenInstall.preInit(getApplicationContext());
            }
            if (!ea.o(k0)) {
                String str11 = k0;
                if (str11 != null && (intOrNull = StringsKt.toIntOrNull(str11)) != null) {
                    iIntValue = intOrNull.intValue();
                }
                if (iIntValue != 0) {
                    String string10 = getString(2131886121);
                    if (iIntValue < 1000 || iIntValue > 9999) {
                        e.g("The parameter is illegal.");
                        return;
                    }
                    if (hc.h == null) {
                        hc.h = getApplicationContext();
                    }
                    String str12 = ze2.a;
                    if (!TextUtils.isEmpty(string10)) {
                        TextUtils.isEmpty(ze2.p);
                        ze2.p = string10;
                    }
                    if (qd2.a != 0) {
                        cc2.a("The host appId has been set 2 times");
                    }
                    qd2.a = iIntValue;
                    long j = iIntValue;
                    if (hc.h != null) {
                        if (hc.g == 0) {
                            hc.g = j;
                        }
                        id2 id2Var = hc.i;
                        if (id2Var == null) {
                            id2 id2Var2 = new id2();
                            hc.i = id2Var2;
                            id2Var2.X = hc.g;
                            ((Application) hc.h).registerActivityLifecycleCallbacks(hc.i);
                        } else {
                            id2Var.X = hc.g;
                        }
                    }
                    Context context = hc.h;
                    if (gf2.b == null) {
                        synchronized (gf2.class) {
                            try {
                                if (gf2.b == null) {
                                    gf2 gf2Var = new gf2();
                                    gf2Var.a = context;
                                    gf2.b = gf2Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (hc.f == -1) {
                        try {
                            try {
                                str = getApplicationContext().getApplicationInfo().processName;
                            } catch (Exception e2) {
                                b81 b81Var = cc2.a;
                                cc2.c(Log.getStackTraceString(e2));
                                str = BuildConfig.FLAVOR;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                str = null;
                            }
                            zEquals = TextUtils.equals(str, nj2.t(this));
                        } catch (Exception unused3) {
                            zEquals = 1;
                        }
                        hc.f = !zEquals;
                        if (hc.f == 0) {
                            String str13 = ze2.a;
                        }
                    }
                    hc.g(9999L);
                    hc.g(j);
                    try {
                        f91.j(this, iIntValue);
                        d42.n = true;
                    } catch (Exception e3) {
                        cc2.c(Log.getStackTraceString(e3));
                    }
                    String str14 = sc2.a;
                    try {
                        Class.forName("com.tencent.mmkv.MMKV");
                    } catch (ClassNotFoundException unused4) {
                    }
                    if (hc.h == null) {
                        uq1.m("init Athena SDK first!");
                        return;
                    }
                    String str15 = sc2.a;
                    try {
                        hc.g(j).d().e((Runnable) ReferrerTask.class.getConstructor(Context.class, Integer.TYPE).newInstance(hc.h, Integer.valueOf(iIntValue)), 3000L);
                    } catch (Exception e4) {
                        b81 b81Var2 = cc2.a;
                        cc2.c(Log.getStackTraceString(e4));
                    }
                }
            }
            String str16 = Build.MODEL;
            if (!TextUtils.isEmpty(str16)) {
                str16.getClass();
                if (StringsKt.t(str16, "OPPO")) {
                    try {
                        Class<?> cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
                        Class<? super Object> superclass = cls.getSuperclass();
                        superclass.getClass();
                        Method declaredMethod = superclass.getDeclaredMethod("stop", null);
                        declaredMethod.setAccessible(true);
                        Field declaredField = cls.getDeclaredField("INSTANCE");
                        declaredField.setAccessible(true);
                        declaredMethod.invoke(declaredField.get(null), null);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
            System.currentTimeMillis();
        } catch (PackageManager.NameNotFoundException e5) {
            kv.o("Load build args failed", e5);
        }
    }
}
