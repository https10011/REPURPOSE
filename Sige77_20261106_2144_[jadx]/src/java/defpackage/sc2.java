package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sc2 {
    public static volatile String a;
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static boolean c = true;
    public static long d = 0;

    public static int a(long j) {
        if (j > 999) {
            return Integer.parseInt(String.valueOf(j).substring(0, 4));
        }
        return 0;
    }

    public static String b(int i) {
        return ck1.r(i, i > 10 ? BuildConfig.FLAVOR : "0");
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(a)) {
            try {
                a = nj2.c(context).b;
                if (!TextUtils.isEmpty(a)) {
                    dc2 dc2VarA = dc2.a(context);
                    if (!TextUtils.equals(a, dc2VarA.n("athena_id"))) {
                        dc2VarA.l("athena_id", a);
                    }
                }
            } catch (Exception e) {
                cc2.c(e.getMessage());
            }
            if (TextUtils.isEmpty(a)) {
                a = dc2.a(context).n("athena_id");
            }
        }
        return a;
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("Athena", "------------------------------------------------------------");
        Log.e("Athena", BuildConfig.FLAVOR);
        Log.e("Athena", str);
        Log.e("Athena", BuildConfig.FLAVOR);
        Log.e("Athena", "------------------------------------------------------------");
    }

    public static boolean e(Context context, String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                String[] strArr = packageInfo.requestedPermissions;
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && applicationInfo.uid == 1000 && strArr != null) {
                    for (String str2 : strArr) {
                        if (TextUtils.equals(str2, str)) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (Exception e) {
                cc2.c(e.getMessage());
            }
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
            return false;
        }
    }

    public static String f(Context context, String str) {
        rd2 rd2Var;
        ConcurrentHashMap concurrentHashMap = b;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = d;
            if (j != 0 && jElapsedRealtime - j < 600000) {
                return BuildConfig.FLAVOR;
            }
            synchronized (rd2.class) {
                try {
                    if (rd2.d == null) {
                        rd2.d = new rd2(context, 0);
                    }
                    rd2Var = rd2.d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            String strB = rd2Var.b(str);
            if (TextUtils.isEmpty(strB)) {
                d = jElapsedRealtime;
                return BuildConfig.FLAVOR;
            }
            concurrentHashMap.put(str, strB);
            d = 0L;
            return strB;
        } catch (Exception e) {
            cc2.c(e.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public static boolean g(Context context) {
        try {
            if (c) {
                if (TextUtils.isEmpty(dc2.a(context).n("first_launch"))) {
                    if (new File(context.getFilesDir() + File.separator + ze2.i, "global.cfg").exists()) {
                        c = false;
                    }
                } else {
                    c = false;
                }
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
        return c;
    }

    public static boolean h(Context context) {
        try {
            ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo("com.hoffnung", 8).providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if ("com.transsion.dataservice.provider".equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
        return false;
    }
}
