package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class o81 {
    public static OkHttpClient.Builder a() {
        TrustManager[] trustManagerArr = {new n81()};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.a(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
            m81 m81Var = new m81(0);
            Intrinsics.areEqual(m81Var, builder.t);
            builder.t = m81Var;
            return builder;
        } catch (KeyManagementException | NoSuchAlgorithmException unused) {
            return new OkHttpClient.Builder();
        }
    }
}
