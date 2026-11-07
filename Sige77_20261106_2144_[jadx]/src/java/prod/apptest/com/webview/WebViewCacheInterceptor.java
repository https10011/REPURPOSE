package prod.apptest.com.webview;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.hjq.toast.BuildConfig;
import defpackage.ea;
import defpackage.kv;
import defpackage.m81;
import defpackage.o81;
import defpackage.ts;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import prod.apptest.com.webview.config.CacheExtensionConfig;
import prod.apptest.com.webview.utils.FileUtil;
import prod.apptest.com.webview.utils.MimeTypeMapUtils;
import prod.apptest.com.webview.utils.NetUtils;
import prod.apptest.com.webview.utils.OKHttpFile;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class WebViewCacheInterceptor implements WebViewRequestInterceptor {
    public static final String KEY_CACHE = "WebResourceInterceptor-Key-Cache";
    private String mAssetsDir;
    private CacheExtensionConfig mCacheExtensionConfig;
    private File mCacheFile;
    private long mCacheSize;
    private CacheType mCacheType;
    private long mConnectTimeout;
    private Context mContext;
    private boolean mDebug;
    private Dns mDns;
    private boolean mIsSuffixMod;
    private long mReadTimeout;
    private ResourceInterceptor mResourceInterceptor;
    private SSLSocketFactory mSSLSocketFactory;
    private boolean mTrustAllHostname;
    private X509TrustManager mX509TrustManager;
    private OkHttpClient mHttpClient = null;
    private String mOrigin = BuildConfig.FLAVOR;
    private String mReferer = BuildConfig.FLAVOR;
    private String mUserAgent = BuildConfig.FLAVOR;

    public static class Builder {
        private File mCacheFile;
        private Context mContext;
        private ResourceInterceptor mResourceInterceptor;
        private long mCacheSize = 104857600;
        private long mConnectTimeout = 20;
        private long mReadTimeout = 20;
        private boolean mDebug = true;
        private CacheType mCacheType = CacheType.FORCE;
        private boolean mTrustAllHostname = false;
        private SSLSocketFactory mSSLSocketFactory = null;
        private X509TrustManager mX509TrustManager = null;
        private String mAssetsDir = null;
        private boolean mIsSuffixMod = false;
        private Dns mDns = null;
        private CacheExtensionConfig mCacheExtensionConfig = new CacheExtensionConfig();

        public Builder(Context context) {
            this.mContext = context;
            this.mCacheFile = new File(context.getCacheDir().toString(), "CacheWebViewCache");
        }

        public WebViewRequestInterceptor build() {
            return new WebViewCacheInterceptor(this);
        }

        public Builder isAssetsSuffixMod(boolean z) {
            this.mIsSuffixMod = z;
            return this;
        }

        public Builder setAssetsDir(String str) {
            if (str != null) {
                this.mAssetsDir = str;
            }
            return this;
        }

        public Builder setCacheExtensionConfig(CacheExtensionConfig cacheExtensionConfig) {
            if (cacheExtensionConfig != null) {
                this.mCacheExtensionConfig = cacheExtensionConfig;
            }
            return this;
        }

        public Builder setCachePath(File file) {
            if (file != null) {
                this.mCacheFile = file;
            }
            return this;
        }

        public Builder setCacheSize(long j) {
            if (j > 1024) {
                this.mCacheSize = j;
            }
            return this;
        }

        public Builder setCacheType(CacheType cacheType) {
            this.mCacheType = cacheType;
            return this;
        }

        public Builder setConnectTimeoutSecond(long j) {
            if (j >= 0) {
                this.mConnectTimeout = j;
            }
            return this;
        }

        public Builder setDebug(boolean z) {
            this.mDebug = z;
            return this;
        }

        public void setDns(Dns dns) {
            this.mDns = dns;
        }

        public Builder setReadTimeoutSecond(long j) {
            if (j >= 0) {
                this.mReadTimeout = j;
            }
            return this;
        }

        public void setResourceInterceptor(ResourceInterceptor resourceInterceptor) {
            this.mResourceInterceptor = resourceInterceptor;
        }

        public Builder setSSLSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory != null && x509TrustManager != null) {
                this.mSSLSocketFactory = sSLSocketFactory;
                this.mX509TrustManager = x509TrustManager;
            }
            return this;
        }

        public Builder setTrustAllHostname() {
            this.mTrustAllHostname = true;
            return this;
        }
    }

    public WebViewCacheInterceptor(Builder builder) {
        this.mAssetsDir = null;
        this.mTrustAllHostname = false;
        this.mSSLSocketFactory = null;
        this.mX509TrustManager = null;
        this.mDns = null;
        this.mIsSuffixMod = false;
        this.mCacheExtensionConfig = builder.mCacheExtensionConfig;
        this.mCacheFile = builder.mCacheFile;
        this.mCacheSize = builder.mCacheSize;
        this.mCacheType = builder.mCacheType;
        this.mConnectTimeout = builder.mConnectTimeout;
        this.mReadTimeout = builder.mReadTimeout;
        this.mContext = builder.mContext;
        this.mDebug = builder.mDebug;
        this.mAssetsDir = builder.mAssetsDir;
        this.mX509TrustManager = builder.mX509TrustManager;
        this.mSSLSocketFactory = builder.mSSLSocketFactory;
        this.mTrustAllHostname = builder.mTrustAllHostname;
        this.mResourceInterceptor = builder.mResourceInterceptor;
        this.mIsSuffixMod = builder.mIsSuffixMod;
        this.mDns = builder.mDns;
        initHttpClient();
        if (isEnableAssets()) {
            initAssetsLoader();
        }
    }

    private Map<String, String> buildHeaders() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.mOrigin)) {
            map.put("Origin", this.mOrigin);
        }
        if (!TextUtils.isEmpty(this.mReferer)) {
            map.put("Referer", this.mReferer);
        }
        if (!TextUtils.isEmpty(this.mUserAgent)) {
            map.put("User-Agent", this.mUserAgent);
        }
        return map;
    }

    private boolean checkUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            return false;
        }
        ResourceInterceptor resourceInterceptor = this.mResourceInterceptor;
        if (resourceInterceptor != null && !resourceInterceptor.interceptor(str)) {
            return false;
        }
        String fileExtensionFromUrl = MimeTypeMapUtils.getFileExtensionFromUrl(str);
        return (TextUtils.isEmpty(fileExtensionFromUrl) || this.mCacheExtensionConfig.isMedia(fileExtensionFromUrl) || !this.mCacheExtensionConfig.canCache(fileExtensionFromUrl)) ? false : true;
    }

    private void initAssetsLoader() {
        AssetsLoader.getInstance().init(this.mContext).setDir(this.mAssetsDir).isAssetsSuffixMod(this.mIsSuffixMod);
    }

    private void initHttpClient() {
        X509TrustManager x509TrustManager;
        Cache cache = new Cache(this.mCacheFile, this.mCacheSize);
        OkHttpClient.Builder builderA = o81.a();
        builderA.l = cache;
        long j = this.mConnectTimeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        builderA.w = _UtilJvmKt.b(j);
        long j2 = this.mReadTimeout;
        timeUnit.getClass();
        builderA.x = _UtilJvmKt.b(j2);
        builderA.d.add(new HttpCacheInterceptor());
        if (this.mTrustAllHostname) {
            m81 m81Var = new m81(1);
            Intrinsics.areEqual(m81Var, builderA.t);
            builderA.t = m81Var;
        }
        SSLSocketFactory sSLSocketFactory = this.mSSLSocketFactory;
        if (sSLSocketFactory != null && (x509TrustManager = this.mX509TrustManager) != null) {
            builderA.a(sSLSocketFactory, x509TrustManager);
        }
        Dns dns = this.mDns;
        if (dns != null) {
            Intrinsics.areEqual(dns, builderA.m);
            builderA.m = dns;
        }
        this.mHttpClient = new OkHttpClient(builderA);
    }

    private WebResourceResponse interceptRequest(String str, Map<String, String> map) {
        InputStream resByUrl;
        if (this.mCacheType != CacheType.NORMAL && checkUrl(str)) {
            if (isEnableAssets() && (resByUrl = AssetsLoader.getInstance().getResByUrl(str)) != null) {
                CacheWebViewLog.i(ts.j("from assets: ", str), this.mDebug);
                return new WebResourceResponse(MimeTypeMapUtils.getMimeTypeFromUrl(str), BuildConfig.FLAVOR, resByUrl);
            }
            try {
                Request.Builder builder = new Request.Builder();
                builder.c(str);
                if (this.mCacheExtensionConfig.isHtml(MimeTypeMapUtils.getFileExtensionFromUrl(str))) {
                    map.put(KEY_CACHE, this.mCacheType.ordinal() + BuildConfig.FLAVOR);
                }
                if (str.contains("index.html")) {
                    map.put("Cache-Control", "no-cache, no-store, must-revalidate");
                }
                String cookie = CookieManager.getInstance().getCookie(str);
                if (ea.q(cookie)) {
                    map.put("cookie", cookie);
                }
                addHeader(builder, map);
                if (!NetUtils.isConnected(this.mContext)) {
                    CacheControl cacheControl = CacheControl.o;
                    cacheControl.getClass();
                    String string = cacheControl.toString();
                    if (string.length() == 0) {
                        builder.c.e("Cache-Control");
                    } else {
                        builder.a("Cache-Control", string);
                    }
                }
                Request request = new Request(builder);
                OkHttpClient okHttpClient = this.mHttpClient;
                okHttpClient.getClass();
                Response responseA = new RealCall(okHttpClient, request).a();
                Response response = responseA.W;
                int i = responseA.d;
                if (response != null) {
                    CacheWebViewLog.i("from cache: ".concat(str), this.mDebug);
                } else {
                    CacheWebViewLog.i("from server: ".concat(str), this.mDebug);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypeMapUtils.getMimeTypeFromUrl(str), BuildConfig.FLAVOR, responseA.i.e().Q());
                if (i != 504 || NetUtils.isConnected(this.mContext)) {
                    String str2 = responseA.c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "OK";
                    }
                    try {
                        webResourceResponse.setStatusCodeAndReasonPhrase(i, str2);
                        webResourceResponse.setResponseHeaders(NetUtils.multimapToSingle(responseA.f.d()));
                        return webResourceResponse;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (IOException e) {
                kv.o("interceptRequest failure", e);
                return null;
            }
        }
        return null;
    }

    private boolean isEnableAssets() {
        return this.mAssetsDir != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$initHttpClient$0(String str, SSLSession sSLSession) {
        return true;
    }

    public void addHeader(Request.Builder builder, Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            builder.getClass();
            key.getClass();
            value.getClass();
            builder.c.a(key, value);
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void clearCache() {
        FileUtil.deleteDirs(this.mCacheFile.getAbsolutePath(), false);
        AssetsLoader.getInstance().clear();
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void enableForce(boolean z) {
        if (z) {
            this.mCacheType = CacheType.FORCE;
        } else {
            this.mCacheType = CacheType.NORMAL;
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public InputStream getCacheFile(String str) {
        return OKHttpFile.getCacheFile(this.mCacheFile, str);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public File getCachePath() {
        return this.mCacheFile;
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void initAssetsData() {
        AssetsLoader.getInstance().initData();
    }

    public boolean isValidUrl(String str) {
        return URLUtil.isValidUrl(str);
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(WebView webView, String str) {
        if (isValidUrl(str)) {
            webView.loadUrl(str);
            String url = webView.getUrl();
            this.mReferer = url;
            this.mOrigin = NetUtils.getOriginUrl(url);
            this.mUserAgent = webView.getSettings().getUserAgentString();
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(String str, String str2) {
        if (isValidUrl(str)) {
            this.mReferer = str;
            this.mOrigin = NetUtils.getOriginUrl(str);
            this.mUserAgent = str2;
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(String str, Map<String, String> map, String str2) {
        if (isValidUrl(str)) {
            this.mReferer = str;
            this.mOrigin = NetUtils.getOriginUrl(str);
            this.mUserAgent = str2;
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public void loadUrl(WebView webView, String str, Map<String, String> map) {
        if (isValidUrl(str)) {
            webView.loadUrl(str, map);
            String url = webView.getUrl();
            this.mReferer = url;
            this.mOrigin = NetUtils.getOriginUrl(url);
            this.mUserAgent = webView.getSettings().getUserAgentString();
        }
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public WebResourceResponse interceptRequest(String str) {
        return interceptRequest(str, buildHeaders());
    }

    @Override // prod.apptest.com.webview.WebViewRequestInterceptor
    public WebResourceResponse interceptRequest(WebResourceRequest webResourceRequest) {
        return interceptRequest(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
