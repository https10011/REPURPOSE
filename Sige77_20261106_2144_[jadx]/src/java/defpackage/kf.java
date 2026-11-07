package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Objects;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class kf {
    public abstract Activity a();

    public final sx0 b(String str) {
        sx0 sx0Var = new sx0();
        if (ea.o(str)) {
            str = "NA";
        }
        sx0Var.a = str;
        try {
            if (qj0.e.c(a(), rj0.a) == 0) {
                AppTestApp appTestApp = AppTestApp.w;
                appTestApp.getClass();
                if (ea.o(appTestApp.b())) {
                    Activity activityA = a();
                    Objects.requireNonNull(activityA);
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(activityA);
                    advertisingIdInfo.getClass();
                    String id = ea.q(advertisingIdInfo.getId()) ? advertisingIdInfo.getId() : "0";
                    sx0Var.b = id;
                    AppTestApp appTestApp2 = AppTestApp.w;
                    appTestApp2.getClass();
                    SharedPreferences sharedPreferences = appTestApp2.b;
                    sharedPreferences.getClass();
                    sharedPreferences.edit().putString("gaid_" + AppTestApp.X, id).apply();
                    return sx0Var;
                }
                AppTestApp appTestApp3 = AppTestApp.w;
                appTestApp3.getClass();
                sx0Var.b = appTestApp3.b();
            }
        } catch (Exception unused) {
        }
        return sx0Var;
    }
}
