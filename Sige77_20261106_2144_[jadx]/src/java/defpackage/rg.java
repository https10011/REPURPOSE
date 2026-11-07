package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rg {
    public final /* synthetic */ yg a;

    public rg(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void setColors(String str) {
        try {
            this.a.o0.post(new x4(11, this, str));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
