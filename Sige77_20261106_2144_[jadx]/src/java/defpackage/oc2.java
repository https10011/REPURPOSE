package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oc2 extends Exception {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final Bundle b;

    public oc2(String str, Exception exc) {
        super(str, exc);
        this.a = str;
        this.b = null;
    }

    public static void a(String str, Exception exc) {
        gf2.b.a(new oc2(str, exc));
    }

    public oc2(String str, Bundle bundle) {
        super(str, null);
        this.a = str;
        this.b = bundle;
    }
}
