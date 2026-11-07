package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Objects;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.webview.WebViewCacheInterceptorInst;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jg extends WebViewClient {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yg b;

    public jg(yg ygVar, boolean z) {
        this.b = ygVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, yg] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r4 = this.b;
        kv.F("onPageFinished url={} ({}ms)", str, Long.valueOf(jCurrentTimeMillis - r4.w0));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptThirdPartyCookies(r4.o0, true);
        cookieManager.getCookie(str);
        r4.setRequestedOrientation(-1);
        webView.evaluateJavascript("(function() {  if (!window.Android) return;  Object.defineProperty(navigator, 'clipboard', {    value: {      writeText: function(text) {        return new Promise(function(resolve, reject) {          try { window.Android.copyToClipboard(text); resolve(); }          catch(e) { reject(e); }        });      },      readText: function() {        return new Promise(function(resolve, reject) {          try { resolve(window.Android.pasteFromClipboard()); }          catch(e) { reject(e); }        });      }    },    writable: true, configurable: true  });})();", null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.b.w0 = System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        String str3 = "onReceivedError: " + str2 + " " + i + " " + str;
        kv.n(str3);
        if (ea.q(str) && str.startsWith("net::")) {
            qt.q(str3);
            this.b.n0 = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String string = webResourceRequest.getUrl().toString();
        StringBuilder sbN = ts.n("onReceivedHttpError: ", string, " ");
        sbN.append(webResourceResponse.getStatusCode());
        String string2 = sbN.toString();
        kv.n(string2);
        int statusCode = webResourceResponse.getStatusCode();
        yg ygVar = this.b;
        if (Objects.equals(string, ygVar.A0)) {
            if (404 == statusCode || 500 == statusCode) {
                qt.q(string2);
                ygVar.n0 = true;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.proceed();
    }

    /* JADX WARN: Code duplicated, block: B:129:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[Catch: IOException -> 0x0122, SYNTHETIC, TRY_LEAVE, TryCatch #10 {IOException -> 0x0122, blocks: (B:57:0x0124, B:68:0x0158, B:82:0x0173, B:81:0x0170, B:78:0x016b, B:58:0x0128, B:67:0x0155, B:76:0x0168, B:75:0x0165), top: B:135:0x0124, inners: #7, #12 }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, yg] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String string;
        String str2;
        if (this.a && !ea.o(str)) {
            ?? r4 = this.b;
            boolean z = ea.q(r4.A0) && ak1.a(r4.A0, true).equals(ak1.a(str, true));
            if ((!ea.q(r4.A0) || z) && !r4.A0.matches(".*(192|127|10).*")) {
                int iLastIndexOf = str.lastIndexOf("/");
                if (r4.n() && iLastIndexOf != -1) {
                    String strSubstring = str.substring(iLastIndexOf + 1);
                    if (yg.Q0.contains(strSubstring)) {
                        if (strSubstring.endsWith(".js")) {
                            str2 = "application/x-javascript";
                        } else {
                            str2 = strSubstring.endsWith(".css") ? "text/css" : "text/html";
                        }
                        String str3 = str2;
                        try {
                            InputStream inputStreamOpen = r4.getAssets().open("offline/".concat(strSubstring));
                            kv.E("Use offline resource for: ".concat(str));
                            return new WebResourceResponse(str3, StandardCharsets.UTF_8.name(), 200, "OK", new eo0("Access-Control-Allow-Origin", "*"), inputStreamOpen);
                        } catch (IOException e) {
                            kv.o("Use offline resource", e);
                        }
                    }
                }
                f82 f82VarA = f82.a(WebViewCacheInterceptorInst.getInstance().interceptRequest(str));
                if (z && !AppTestApp.c0 && str.contains("/m/index.html")) {
                    if (f82VarA == null) {
                        r4.n0 = true;
                        qt.q(MessageFormat.format("addBlackLine: {0} reason: response blank", str));
                        AppTestApp.w.getClass();
                        AppTestApp.a(str);
                        return null;
                    }
                    WebResourceResponse webResourceResponse = f82VarA.a;
                    if (webResourceResponse.getStatusCode() / 100 != 2 && webResourceResponse.getStatusCode() != 304) {
                        r4.n0 = true;
                        qt.q(MessageFormat.format("addBlackLine: {0} reason: http status={1}", str, Integer.valueOf(webResourceResponse.getStatusCode())));
                        AppTestApp.w.getClass();
                        AppTestApp.a(str);
                        return null;
                    }
                    if (webResourceResponse.getData() == null) {
                        byteArrayInputStream = null;
                    } else {
                        try {
                            InputStream data = webResourceResponse.getData();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i = data.read(bArr);
                                        if (i <= -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i);
                                        if (data != null) {
                                            throw th;
                                        }
                                        try {
                                            data.close();
                                            throw th;
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                            throw th;
                                        }
                                    }
                                    byteArrayOutputStream.flush();
                                    f82VarA.b = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                    byteArrayOutputStream.close();
                                    data.close();
                                    byteArrayInputStream = byteArrayInputStream2;
                                } catch (Throwable th2) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                if (data != null) {
                                    throw th4;
                                }
                                data.close();
                                throw th4;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (byteArrayInputStream == null) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                            while (true) {
                                try {
                                    int i2 = bufferedReader.read();
                                    if (i2 == -1) {
                                        break;
                                    }
                                    sb.append((char) i2);
                                } catch (Throwable th5) {
                                    try {
                                        try {
                                            bufferedReader.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                                byteArrayInputStream.close();
                                string = null;
                            }
                            bufferedReader.close();
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused3) {
                            }
                            string = sb.toString();
                        } catch (IOException unused4) {
                            byteArrayInputStream.close();
                            string = null;
                            if (!ea.e(string, "\"root\"")) {
                                r4.n0 = true;
                                qt.q(MessageFormat.format("addBlackLine: {0} reason: html not contain keyword", str));
                                AppTestApp.w.getClass();
                                AppTestApp.a(str);
                                return null;
                            }
                            return f82VarA;
                        } catch (Throwable th7) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused5) {
                            }
                            throw th7;
                        }
                    }
                    if (!ea.e(string, "\"root\"") && !ea.e(string, "ucbet") && !ea.e(string, "\"brand=\"")) {
                        r4.n0 = true;
                        qt.q(MessageFormat.format("addBlackLine: {0} reason: html not contain keyword", str));
                        AppTestApp.w.getClass();
                        AppTestApp.a(str);
                        return null;
                    }
                }
                return f82VarA;
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (string.startsWith("http")) {
            webView.loadUrl(string);
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", webResourceRequest.getUrl());
                intent.addFlags(268435456);
                this.b.startActivity(intent);
            } catch (Exception unused) {
            }
            webView.stopLoading();
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }
}
