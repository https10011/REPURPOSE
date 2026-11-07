package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xg {
    public final /* synthetic */ yg a;

    public xg(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void setText(String str) {
        try {
            this.a.o0.post(new g(this, str));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
