package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class he3 {
    public final vg0 a;
    public final boolean b;
    public final wo0 c;
    public volatile String d = null;

    public he3(vg0 vg0Var, boolean z, wo0 wo0Var) {
        this.a = vg0Var;
        this.b = z;
        this.c = wo0Var;
    }

    public final String a(Context context) {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.a.apply(context);
        this.d = str2;
        return str2;
    }
}
