package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ak1 {
    public static String a;
    public static final ConnectionPool b = new ConnectionPool(10, 15, TimeUnit.SECONDS);
    public static OkHttpClient c;

    public static String a(String str, boolean z) {
        String str2 = str.contains("https") ? "https" : str.contains("http") ? "http" : "https";
        String strReplaceAll = str.replaceAll("(https|http):", BuildConfig.FLAVOR);
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("(//|/.*|\\s)", BuildConfig.FLAVOR);
        }
        return (str2 + "://" + strReplaceAll).replaceAll("////", "//");
    }

    public static yj1 b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append(a(str, true));
        sb.append("/");
        String string = sb.toString();
        vk0 vk0Var = new vk0();
        vk0Var.m = 1;
        uk0 uk0Var = new uk0(vk0Var);
        xj1 xj1Var = new xj1();
        xj1Var.a(string);
        xj1Var.c.add(new wk0(uk0Var));
        if (c == null) {
            OkHttpClient.Builder builderA = o81.a();
            builderA.c.add(new zj1(i));
            ConnectionPool connectionPool = b;
            connectionPool.getClass();
            builderA.b = connectionPool;
            c = new OkHttpClient(builderA);
        }
        OkHttpClient okHttpClient = c;
        Objects.requireNonNull(okHttpClient, "client == null");
        xj1Var.a = okHttpClient;
        return xj1Var.b();
    }
}
