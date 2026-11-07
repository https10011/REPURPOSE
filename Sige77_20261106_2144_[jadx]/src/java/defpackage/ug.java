package defpackage;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ug {
    public final /* synthetic */ yg a;

    public ug(yg ygVar) {
        this.a = ygVar;
    }

    @JavascriptInterface
    public void Open() {
        try {
            this.a.o0.post(new y1(this, 6));
        } catch (Exception e) {
            kv.n("error= " + e);
        }
    }
}
