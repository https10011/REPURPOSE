package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jw1 {
    public static final ks0 c = new ks0(13);
    public static final ks0 d;
    public static final ks0 e;
    public final Uri a;
    public final vl b;

    static {
        new ks0(5);
        new ks0(4);
        new ks0(6);
        new ks0(8);
        d = new ks0(9);
        e = new ks0(10);
        new ks0(12);
        new ks0(7);
        new ks0(11);
    }

    public jw1(Context context, Uri uri) {
        vl vlVar = new vl(context);
        this.a = uri;
        this.b = vlVar;
    }

    public static LinkedHashMap a(er0 er0Var) {
        return g93.h("Authorization", "Bearer " + er0Var.a);
    }
}
