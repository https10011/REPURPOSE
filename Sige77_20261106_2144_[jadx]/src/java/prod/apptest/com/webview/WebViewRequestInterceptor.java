package prod.apptest.com.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface WebViewRequestInterceptor {
    void clearCache();

    void enableForce(boolean z);

    InputStream getCacheFile(String str);

    File getCachePath();

    void initAssetsData();

    WebResourceResponse interceptRequest(WebResourceRequest webResourceRequest);

    WebResourceResponse interceptRequest(String str);

    void loadUrl(WebView webView, String str);

    void loadUrl(WebView webView, String str, Map<String, String> map);

    void loadUrl(String str, String str2);

    void loadUrl(String str, Map<String, String> map, String str2);
}
