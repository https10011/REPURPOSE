package defpackage;

import android.util.Log;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ig extends gs0 {
    public final /* synthetic */ yg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ig(yg ygVar, yg ygVar2) {
        super(ygVar2);
        this.c = ygVar;
    }

    @JavascriptInterface
    public void googleLogin(String str) {
        Log.d("window.Android", "call: window.Android.googleLogin('" + str + "')");
        try {
            yg.g(this.c, str);
        } catch (Exception e) {
            Log.e("window.Android", "window.Android.googleLogin failure", e);
        }
    }
}
