package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.adjust.sdk.Adjust;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mg extends WebChromeClient {
    public final /* synthetic */ yg a;

    public mg(yg ygVar) {
        this.a = ygVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(this.a);
        webView2.setWebViewClient(new lg(this, 0));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Activity, yg] */
    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        ?? r0 = this.a;
        r0.o0.setVisibility(0);
        if (r0.O0 == null) {
            return;
        }
        r0.p0.setVisibility(8);
        r0.p0.removeView(r0.O0);
        r0.P0.onCustomViewHidden();
        r0.O0 = null;
        super.onHideCustomView();
        r0.setRequestedOrientation(1);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        f6 f6Var = new f6((Context) this.a);
        b6 b6Var = (b6) f6Var.c;
        b6Var.g = str2;
        vf vfVar = new vf(1);
        b6Var.h = b6Var.a.getText(2131886341);
        b6Var.i = vfVar;
        f6Var.a().show();
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.grant(permissionRequest.getResources());
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [android.content.Context, yg] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        kv.n("webview onProgressChanged: " + i);
        if (i >= 100) {
            ?? r6 = this.a;
            r6.x0.setBlockNetworkImage(false);
            if (!r6.x0.getLoadsImagesAutomatically()) {
                r6.x0.setLoadsImagesAutomatically(true);
            }
            r6.o0.setLayerType(2, null);
            int i2 = r6.l() ? 500 : 10000;
            r6.p(!r6.n0);
            if (!r6.n0) {
                new Handler().postDelayed(new y1(this, 5), i2);
            }
            if ("0".equals(AppTestApp.f0)) {
                return;
            }
            Adjust.getGoogleAdId((Context) r6, new ab(this, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, yg] */
    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        ?? r5 = this.a;
        if (r5.o0.getUrl().matches(".*/m/lotto.*?-h5/.*") || !r5.m()) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        r5.setRequestedOrientation(0);
        r5.getWindow().setFlags(1024, 1024);
        if (r5.O0 != null) {
            r5.P0.onCustomViewHidden();
            return;
        }
        r5.O0 = view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        r5.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        r5.p0.addView(r5.O0, new ViewGroup.LayoutParams(displayMetrics.widthPixels, displayMetrics.heightPixels));
        r5.P0 = customViewCallback;
        r5.o0.setVisibility(8);
        r5.p0.setVisibility(0);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Log.i("test", "openFileChooser 4:" + valueCallback.toString());
        yg ygVar = this.a;
        ygVar.r0 = valueCallback;
        ygVar.uploadPicture();
        return true;
    }
}
