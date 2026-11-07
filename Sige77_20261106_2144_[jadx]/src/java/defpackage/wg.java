package defpackage;

import android.util.Log;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wg {
    public final /* synthetic */ yg a;

    public wg(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void Open() {
        Log.e("Web", "LogOpen");
        try {
            this.a.o0.post(new g(this, 12));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
