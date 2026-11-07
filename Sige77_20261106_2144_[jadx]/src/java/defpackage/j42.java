package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class j42 {
    public static final b81 a;

    static {
        kk0 kk0Var = new kk0();
        kk0Var.b("GSLB_SDK");
        kk0Var.c = false;
        a = new b81(kk0Var);
    }

    public static String a(String str) {
        String host;
        if (str == null || !str.startsWith("http")) {
            host = str;
        } else {
            try {
                host = new URL(str).getHost();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                host = BuildConfig.FLAVOR;
            }
        }
        if (TextUtils.isEmpty(host)) {
            a.b("the url is illegal->" + str);
        }
        return host;
    }

    public static boolean b(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(3);
            }
        } catch (Exception e) {
            a.b(Log.getStackTraceString(e));
        }
        return false;
    }
}
