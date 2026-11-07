package prod.apptest.com.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class WebViewCacheInterceptorInst implements WebViewRequestInterceptor {
    private static volatile WebViewCacheInterceptorInst webViewCacheInterceptorInst;
    private WebViewRequestInterceptor mInterceptor;

    public static WebViewCacheInterceptorInst getInstance() {
        if (webViewCacheInterceptorInst == null) {
            synchronized (WebViewCacheInterceptorInst.class) {
                try {
                    if (webViewCacheInterceptorInst == null) {
                        webViewCacheInterceptorInst = new WebViewCacheInterceptorInst();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return webViewCacheInterceptorInst;
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void clearCache() {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.clearCache();
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void enableForce(boolean z) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.enableForce(z);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public InputStream getCacheFile(String str) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return null;
        }
        return webViewRequestInterceptor.getCacheFile(str);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public File getCachePath() {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return null;
        }
        return webViewRequestInterceptor.getCachePath();
    }

    public void init(WebViewCacheInterceptor.Builder builder) {
        if (builder != null) {
            this.mInterceptor = builder.build();
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void initAssetsData() {
        AssetsLoader.getInstance().initData();
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public WebResourceResponse interceptRequest(WebResourceRequest webResourceRequest) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return null;
        }
        return webViewRequestInterceptor.interceptRequest(webResourceRequest);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(WebView webView, String str) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.loadUrl(webView, str);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(String str, String str2) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.loadUrl(str, str2);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public WebResourceResponse interceptRequest(String str) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return null;
        }
        return webViewRequestInterceptor.interceptRequest(str);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(String str, Map<String, String> map, String str2) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.loadUrl(str, map, str2);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(WebView webView, String str, Map<String, String> map) {
        WebViewRequestInterceptor webViewRequestInterceptor = this.mInterceptor;
        if (webViewRequestInterceptor == null) {
            return;
        }
        webViewRequestInterceptor.loadUrl(webView, str, map);
    }
}
