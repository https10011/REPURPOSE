package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ge1 implements e51 {
    public final Context a;
    public final e51 b;
    public final e51 c;
    public final Class d;

    public ge1(Context context, e51 e51Var, e51 e51Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = e51Var;
        this.c = e51Var2;
        this.d = cls;
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && aj0.w((Uri) obj);
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        Uri uri = (Uri) obj;
        return new d51(new y71(uri), new fe1(this.a, this.b, this.c, uri, i, i2, da1Var, this.d));
    }
}
