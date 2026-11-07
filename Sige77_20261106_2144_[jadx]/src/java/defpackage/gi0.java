package defpackage;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gi0 {
    public final Bundle a;
    public final Bundle b;
    public final Set c;
    public final String d;

    public gi0(String str) {
        Bundle bundleU = gu2.U(str);
        Bundle bundleU2 = gu2.U(str);
        a60 a60Var = a60.a;
        a60Var.getClass();
        a60Var.getClass();
        this.a = bundleU;
        this.b = bundleU2;
        this.c = a60Var;
        bundleU.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundleU2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundleU.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        bundleU2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        this.d = str;
        if (str.length() > 0) {
            return;
        }
        e.g("serverClientId should not be empty");
        throw null;
    }
}
