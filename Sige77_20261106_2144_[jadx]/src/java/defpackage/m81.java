package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import prod.apptest.com.webview.WebViewCacheInterceptor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class m81 implements HostnameVerifier {
    public final /* synthetic */ int a;

    public /* synthetic */ m81(int i) {
        this.a = i;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return WebViewCacheInterceptor.lambda$initHttpClient$0(str, sSLSession);
        }
    }
}
