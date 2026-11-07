package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class rf2 {
    public static final bd2 a;

    static {
        bd2 bd2Var = new bd2(1);
        bd2Var.b = HttpsURLConnection.getDefaultHostnameVerifier();
        a = bd2Var;
    }

    public static SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            try {
                sSLContext.init(null, new TrustManager[]{new dd2(1)}, new SecureRandom());
                return sSLContext;
            } catch (Exception unused) {
                return sSLContext;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
