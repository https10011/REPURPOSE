package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mx0 {
    public static final ks0 f;
    public static final ks0 g;
    public static final ks0 h;
    public final Uri a;
    public final vl b;
    public final lx0 c;
    public final ri2 d;
    public final Uri e;

    static {
        new ks0(2);
        f = new ks0(1);
        g = new ks0(3);
        h = new ks0(0);
    }

    public mx0(Context context, Uri uri, Uri uri2) {
        vl vlVar = new vl(context);
        this.c = new lx0(this);
        this.d = new ri2(this);
        this.a = uri2;
        this.b = vlVar;
        this.e = uri;
    }

    public final ix0 a() {
        Uri uriI = g93.i(this.e, new String[0]);
        Map map = Collections.EMPTY_MAP;
        ix0 ix0VarA = this.b.a(uriI, map, map, g);
        if (!ix0VarA.d()) {
            Log.e("LineAuthApiClient", "getOpenIdDiscoveryDocument failed: " + ix0VarA);
        }
        return ix0VarA;
    }
}
