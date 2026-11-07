package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l90 extends d82 {
    public static final /* synthetic */ int b0 = 0;
    public boolean a0;

    public static void g(l90 l90Var) {
        super.cancel();
    }

    @Override // defpackage.d82
    public final Bundle c(String str) {
        Bundle bundleC = h42.C(Uri.parse(str).getQuery());
        String string = bundleC.getString("bridge_args");
        bundleC.remove("bridge_args");
        if (!h42.x(string)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", zi.a(new JSONObject(string)));
            } catch (JSONException unused) {
                i90 i90Var = i90.a;
            }
        }
        String string2 = bundleC.getString("method_results");
        bundleC.remove("method_results");
        if (!h42.x(string2)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.RESULT_ARGS", zi.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                i90 i90Var2 = i90.a;
            }
        }
        bundleC.remove("version");
        bundleC.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", l61.h());
        return bundleC;
    }

    @Override // defpackage.d82, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        c82 c82Var = this.d;
        if (!this.X || this.w || c82Var == null || !c82Var.isShown()) {
            super.cancel();
        } else {
            if (this.a0) {
                return;
            }
            this.a0 = true;
            c82Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new y1(this, 16), 1500L);
        }
    }
}
