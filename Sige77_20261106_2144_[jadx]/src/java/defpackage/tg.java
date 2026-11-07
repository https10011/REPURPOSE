package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tg {
    public final /* synthetic */ yg a;

    public tg(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void Close(int i) {
        try {
            Thread.sleep(i);
            this.a.o0.post(new sg(this, 1));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }

    @JavascriptInterface
    public void Close() {
        try {
            this.a.o0.postDelayed(new sg(this, 0), 500L);
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
