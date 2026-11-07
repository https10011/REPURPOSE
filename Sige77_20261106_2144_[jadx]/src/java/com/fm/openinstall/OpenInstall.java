package com.fm.openinstall;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.fm.openinstall.listener.AppInstallListener;
import com.fm.openinstall.listener.AppInstallRetryAdapter;
import com.fm.openinstall.listener.AppWakeUpListener;
import com.fm.openinstall.listener.ResultCallback;
import com.hjq.toast.BuildConfig;
import defpackage.ag2;
import defpackage.ck1;
import defpackage.dc2;
import defpackage.dg2;
import defpackage.e;
import defpackage.g93;
import defpackage.hg2;
import defpackage.i4;
import defpackage.ke2;
import defpackage.lf2;
import defpackage.me2;
import defpackage.ne2;
import defpackage.p11;
import defpackage.qp0;
import defpackage.r93;
import defpackage.ue2;
import defpackage.uf2;
import defpackage.wd2;
import defpackage.z32;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class OpenInstall {
    private static volatile boolean a;
    private static volatile boolean b;

    private OpenInstall() {
    }

    private static boolean a() {
        if (b) {
            return true;
        }
        if (g93.i) {
            g93.j("请先调用 init(Context) 初始化", new Object[0]);
        }
        return false;
    }

    public static void clipBoardEnabled(boolean z) {
        ue2.j.e = Boolean.valueOf(z);
    }

    public static void getInstall(AppInstallListener appInstallListener, int i) {
        if (!a()) {
            appInstallListener.onInstallFinish(null, ck1.a(1).b);
            return;
        }
        if (g93.i && i < 5) {
            g93.g("getInstall设置超时时间过小，易造成数据获取失败，请增大超时时间或调整调用时机", new Object[0]);
        }
        wd2.a.i(false, i, appInstallListener);
    }

    public static void getInstallCanRetry(AppInstallRetryAdapter appInstallRetryAdapter, int i) {
        if (a()) {
            wd2.a.i(true, i, appInstallRetryAdapter);
        } else {
            appInstallRetryAdapter.onInstallFinish(null, ck1.a(1).b);
        }
    }

    public static String getOpid() {
        if (a()) {
            return ((lf2) ((qp0) wd2.a.a).e).f;
        }
        return null;
    }

    @Deprecated
    public static void getUpdateApk(ResultCallback<File> resultCallback) {
        if (!a()) {
            resultCallback.onResult(null, ck1.a(1).b);
            return;
        }
        dc2 dc2Var = wd2.a;
        dc2Var.getClass();
        if (g93.i) {
            g93.b("getOriginalApk", new Object[0]);
        }
        System.currentTimeMillis();
        new me2((qp0) dc2Var.a, resultCallback).n();
        System.currentTimeMillis();
    }

    public static String getVersion() {
        return "2.8.2";
    }

    public static boolean getWakeUp(Intent intent, AppWakeUpListener appWakeUpListener) {
        if (!a() || !OpenInstallHelper.isSchemeWakeup(intent)) {
            return false;
        }
        dc2 dc2Var = wd2.a;
        dc2Var.getClass();
        dc2Var.f(intent.getData(), appWakeUpListener);
        return true;
    }

    public static void getWakeUpAlwaysCallback(Intent intent, AppWakeUpListener appWakeUpListener) {
        if (!a()) {
            appWakeUpListener.onWakeUpFinish(null, ck1.a(1).b);
        } else {
            if (!OpenInstallHelper.isSchemeWakeup(intent)) {
                appWakeUpListener.onWakeUpFinish(null, ck1.a(7).b);
                return;
            }
            dc2 dc2Var = wd2.a;
            dc2Var.getClass();
            dc2Var.f(intent.getData(), appWakeUpListener);
        }
    }

    public static boolean getWakeUpYYB(Activity activity, Intent intent, AppWakeUpListener appWakeUpListener) {
        if (!a()) {
            return false;
        }
        if (OpenInstallHelper.isSchemeWakeup(intent)) {
            dc2 dc2Var = wd2.a;
            dc2Var.getClass();
            dc2Var.f(intent.getData(), appWakeUpListener);
            return true;
        }
        if (!OpenInstallHelper.isLauncherFromYYB(activity, intent)) {
            return false;
        }
        wd2.a.f(null, appWakeUpListener);
        return true;
    }

    public static void getWakeUpYYBAlwaysCallback(Activity activity, Intent intent, AppWakeUpListener appWakeUpListener) {
        if (!a()) {
            appWakeUpListener.onWakeUpFinish(null, ck1.a(1).b);
            return;
        }
        if (OpenInstallHelper.isSchemeWakeup(intent)) {
            dc2 dc2Var = wd2.a;
            dc2Var.getClass();
            dc2Var.f(intent.getData(), appWakeUpListener);
        } else if (OpenInstallHelper.isLauncherFromYYB(activity, intent)) {
            wd2.a.f(null, appWakeUpListener);
        } else {
            appWakeUpListener.onWakeUpFinish(null, ck1.a(7).b);
        }
    }

    public static void init(Context context, String str, Configuration configuration) {
        System.currentTimeMillis();
        ue2.j.d = configuration;
        WeakReference weakReference = context instanceof Activity ? new WeakReference((Activity) context) : null;
        synchronized (OpenInstall.class) {
            try {
                if (!a) {
                    if (g93.i) {
                        g93.g("未提前调用 preInit，可能导致统计数据不准确。", new Object[0]);
                    }
                    preInit(context, str);
                }
                if (!b) {
                    dc2 dc2Var = wd2.a;
                    new ne2((qp0) dc2Var.a, weakReference).n();
                    p11 p11Var = (p11) dc2Var.b;
                    p11Var.getClass();
                    Thread thread = new Thread(new i4(p11Var, 26));
                    thread.setName("el");
                    thread.start();
                    System.currentTimeMillis();
                    b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static void initWithPermission(Activity activity, Configuration configuration, Runnable runnable) {
        if (g93.i) {
            g93.g("initWithPermission 方法在后续版本中将被移除，请自行进行权限申请", new Object[0]);
        }
        if (z32.a(activity, "android.permission.READ_PHONE_STATE")) {
            a(activity.getApplicationContext(), configuration, runnable);
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_PHONE_STATE"}, 987);
        Context applicationContext = activity.getApplicationContext().getApplicationContext();
        ue2 ue2Var = ue2.j;
        ue2Var.a = applicationContext;
        ue2Var.i = runnable;
        ue2Var.d = configuration;
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ue2 ue2Var = ue2.j;
        Context context = ue2Var.a;
        if (context == null || i != 987) {
            return;
        }
        if (((Configuration) ue2Var.d) == null) {
            ue2Var.d = Configuration.getDefault();
        }
        a(context, (Configuration) ue2Var.d, (Runnable) ue2Var.i);
    }

    public static void preInit(Context context, String str) {
        String str2;
        if (context == null) {
            str2 = "context不能为空";
        } else {
            if (!TextUtils.isEmpty(str)) {
                if (g93.i) {
                    g93.b("SDK Version : " + getVersion(), new Object[0]);
                }
                ue2 ue2Var = ue2.j;
                ue2Var.a = context.getApplicationContext().getApplicationContext();
                ue2Var.b = str;
                synchronized (OpenInstall.class) {
                    try {
                        if (!a) {
                            dc2 dc2Var = wd2.a;
                            p11 p11Var = new p11((qp0) dc2Var.a);
                            dc2Var.b = p11Var;
                            ((Application) p11Var.b).registerActivityLifecycleCallbacks(new dg2(p11Var));
                            a = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            str2 = "请前往OpenInstall控制台的 “Android集成” -> “Android应用配置” 中获取AppKey";
        }
        e.g(str2);
    }

    public static void reportEffectPoint(String str, long j) {
        if (a()) {
            wd2.a.h(str, j, null);
        }
    }

    public static void reportRegister() {
        if (a()) {
            dc2 dc2Var = wd2.a;
            if (g93.i) {
                dc2Var.getClass();
                g93.b("reportRegister", new Object[0]);
            }
            p11 p11Var = (p11) dc2Var.b;
            p11Var.getClass();
            uf2 uf2Var = new uf2(0, "$register", Long.valueOf(System.currentTimeMillis()), 1L, null);
            uf2Var.a = true;
            hg2 hg2Var = (hg2) p11Var.d;
            hg2Var.getClass();
            Message messageObtain = Message.obtain();
            messageObtain.what = 21;
            messageObtain.obj = uf2Var;
            hg2Var.sendMessage(messageObtain);
        }
    }

    public static void reportShare(String str, String str2, ResultCallback<Void> resultCallback) {
        if (!a()) {
            resultCallback.onResult(null, ck1.a(1).b);
            return;
        }
        dc2 dc2Var = wd2.a;
        dc2Var.getClass();
        if (g93.i) {
            g93.b("reportShare", new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            if (g93.i) {
                g93.j("shareCode 为空", new Object[0]);
            }
            resultCallback.onResult(null, ck1.b(5, "shareCode 不能为空").b);
            return;
        }
        if (str.length() > 128 && g93.i) {
            g93.g("shareCode 长度超过128位", new Object[0]);
        }
        System.currentTimeMillis();
        ag2 ag2Var = new ag2();
        ag2Var.a = str;
        ag2Var.b = str2;
        new ke2((qp0) dc2Var.a, ag2Var, resultCallback).n();
        System.currentTimeMillis();
    }

    @Deprecated
    public static void serialEnabled(boolean z) {
        ue2.j.f = Boolean.valueOf(z);
    }

    public static void setChannel(String str) {
        ue2.j.c = str;
    }

    public static void setDebug(boolean z) {
        g93.i = z;
    }

    public static void setTrackData(ClipData clipData) {
        ue2 ue2Var = ue2.j;
        ue2Var.h = clipData;
        ue2Var.e = Boolean.FALSE;
    }

    private static void a(Context context, Configuration configuration, Runnable runnable) {
        init(context, configuration);
        if (runnable != null) {
            runnable.run();
            ue2.j.i = null;
        }
    }

    public static void reportEffectPoint(String str, long j, Map<String, String> map) {
        if (a()) {
            wd2.a.h(str, j, map);
        }
    }

    public static void getInstall(AppInstallListener appInstallListener) {
        getInstall(appInstallListener, 10);
    }

    @Deprecated
    public static void initWithPermission(Activity activity, Configuration configuration) {
        initWithPermission(activity, configuration, null);
    }

    public static void init(Context context, Configuration configuration) {
        String strValueOf;
        Object objA = r93.a(context, "com.openinstall.APP_KEY");
        if (objA != null) {
            try {
                strValueOf = String.valueOf(objA);
            } catch (Exception unused) {
                strValueOf = BuildConfig.FLAVOR;
            }
        } else {
            strValueOf = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(strValueOf)) {
            e.g("请在AndroidManifest.xml中配置OpenInstall提供的AppKey");
        } else {
            init(context, strValueOf, configuration);
        }
    }

    public static void preInit(Context context) {
        String strValueOf;
        Object objA = r93.a(context, "com.openinstall.APP_KEY");
        if (objA != null) {
            try {
                strValueOf = String.valueOf(objA);
            } catch (Exception unused) {
                strValueOf = BuildConfig.FLAVOR;
            }
        } else {
            strValueOf = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(strValueOf)) {
            e.g("请在AndroidManifest.xml中配置OpenInstall提供的AppKey");
        } else {
            preInit(context, strValueOf);
        }
    }

    public static void init(Context context, String str) {
        init(context, str, Configuration.getDefault());
    }

    public static void init(Context context) {
        init(context, Configuration.getDefault());
    }

    public static void reportShare(String str, SharePlatform sharePlatform, ResultCallback<Void> resultCallback) {
        reportShare(str, sharePlatform.name(), resultCallback);
    }
}
