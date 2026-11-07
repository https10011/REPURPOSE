package defpackage;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.c;
import com.facebook.FacebookRequestError;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import prod.apptest.com.webview.WebViewCacheInterceptorInst;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lg extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                super.onPageFinished(webView, str);
                d82 d82Var = (d82) this.b;
                if (!d82Var.W && (progressDialog = d82Var.e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = d82Var.i;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                c82 c82Var = d82Var.d;
                if (c82Var != null) {
                    c82Var.setVisibility(0);
                }
                ImageView imageView = d82Var.f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                d82Var.X = true;
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                i90 i90Var = i90.a;
                super.onPageStarted(webView, str, bitmap);
                d82 d82Var = (d82) this.b;
                if (!d82Var.W && (progressDialog = d82Var.e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                str2.getClass();
                super.onReceivedError(webView, i, str, str2);
                ((d82) this.b).e(new a90(str, i, str2));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 0:
                sslErrorHandler.proceed();
                break;
            default:
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((d82) this.b).e(new a90(null, -11, null));
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                WebViewCacheInterceptorInst webViewCacheInterceptorInst = WebViewCacheInterceptorInst.getInstance();
                e82 e82Var = new e82();
                e82Var.a = webResourceRequest;
                return f82.a(webViewCacheInterceptorInst.interceptRequest(e82Var));
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        switch (this.a) {
            case 1:
                d82 d82Var = (d82) this.b;
                webView.getClass();
                str.getClass();
                i90 i90Var = i90.a;
                Uri uri = Uri.parse(str);
                boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (!d.j(str, d82Var.b, false)) {
                    if (d.j(str, "fbconnect://cancel", false)) {
                        d82Var.cancel();
                        return true;
                    }
                    if (!z && !StringsKt.t(str, "touch")) {
                        try {
                            d82Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                    return false;
                }
                Bundle bundleC = d82Var.c(str);
                String string = bundleC.getString("error");
                if (string == null) {
                    string = bundleC.getString("error_type");
                }
                String string2 = bundleC.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleC.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleC.getString("error_description");
                }
                String string3 = bundleC.getString("error_code");
                if (string3 != null && !h42.x(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused2) {
                        i = -1;
                    }
                    break;
                } else {
                    i = -1;
                }
                if (h42.x(string) && h42.x(string2) && i == -1) {
                    y72 y72Var = d82Var.c;
                    if (y72Var == null || d82Var.w) {
                        return true;
                    }
                    d82Var.w = true;
                    y72Var.a(bundleC, null);
                    d82Var.dismiss();
                    return true;
                }
                if (string != null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                    d82Var.cancel();
                    return true;
                }
                if (i == 4201) {
                    d82Var.cancel();
                    return true;
                }
                d82Var.e(new j90(new FacebookRequestError(i, string, string2), string2));
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.a) {
            case 0:
                return f82.a(WebViewCacheInterceptorInst.getInstance().interceptRequest(str));
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                c cVar = ((mg) this.b).a;
                Uri url = webResourceRequest.getUrl();
                int i = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                try {
                    Intent uri = Intent.parseUri(url.toString(), 1);
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    cVar.startActivity(uri);
                    break;
                } catch (Exception e) {
                    kv.o("openSystemBrowser failure", e);
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
