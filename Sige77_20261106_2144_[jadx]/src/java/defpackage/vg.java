package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vg {
    public final /* synthetic */ yg a;

    public vg(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void Close() {
        try {
            this.a.o0.post(new g(this, 11));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
