package defpackage;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.hjq.toast.ToastUtils;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qg {
    public final /* synthetic */ yg a;

    public qg(yg ygVar) {
        this.a = ygVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, p7, yg] */
    @JavascriptInterface
    public void clearCache(final String str) {
        ?? r1 = this.a;
        try {
            r1.o0.post(new ng(this, 3));
        } catch (Exception e) {
            e.toString();
        }
        try {
            r1.o0.post(new ng(this, 4));
        } catch (Exception e2) {
            e2.toString();
        }
        try {
            r1.o0.post(new ng(this, 5));
        } catch (Exception e3) {
            e3.toString();
        }
        try {
            r1.getCacheDir().delete();
        } catch (Exception e4) {
            e4.toString();
        }
        ToastUtils.show((CharSequence) r1.getResources().getString(2131886142));
        try {
            CookieSyncManager.createInstance(r1.C0);
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception e5) {
            e5.toString();
        }
        try {
            int i = r1.B0;
            WebView webView = r1.o0;
            if (i < 18) {
                final int i2 = 0;
                webView.post(new Runnable(this) { // from class: og
                    public final /* synthetic */ qg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        String str2 = str;
                        qg qgVar = this.b;
                        switch (i3) {
                            case 0:
                                qgVar.a.o0.loadUrl("javascript:" + str2);
                                break;
                            default:
                                qgVar.a.o0.evaluateJavascript(ts.j("javascript:", str2), new pg());
                                break;
                        }
                    }
                });
            } else {
                final int i3 = 1;
                webView.post(new Runnable(this) { // from class: og
                    public final /* synthetic */ qg b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        String str2 = str;
                        qg qgVar = this.b;
                        switch (i4) {
                            case 0:
                                qgVar.a.o0.loadUrl("javascript:" + str2);
                                break;
                            default:
                                qgVar.a.o0.evaluateJavascript(ts.j("javascript:", str2), new pg());
                                break;
                        }
                    }
                });
            }
            Log.e("X5_Activitys ", "callJS= " + str);
        } catch (Exception e6) {
            Log.e("X5_Activitys ", "callJS error= " + e6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, p7, yg] */
    @JavascriptInterface
    public void clearCache() {
        ?? r0 = this.a;
        try {
            r0.o0.post(new ng(this, 0));
        } catch (Exception e) {
            e.toString();
        }
        try {
            r0.o0.post(new ng(this, 1));
        } catch (Exception e2) {
            e2.toString();
        }
        try {
            r0.o0.post(new ng(this, 2));
        } catch (Exception e3) {
            e3.toString();
        }
        try {
            r0.getCacheDir().delete();
        } catch (Exception e4) {
            e4.toString();
        }
        ToastUtils.show((CharSequence) r0.getResources().getString(2131886142));
        try {
            CookieSyncManager.createInstance(r0.C0);
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception e5) {
            e5.toString();
        }
    }
}
