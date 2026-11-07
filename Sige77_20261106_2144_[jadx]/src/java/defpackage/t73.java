package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t73 {
    public final y53 a;

    public t73(y53 y53Var) {
        this.a = y53Var;
    }

    public boolean a() {
        c33 c33Var = this.a.f;
        y53.l(c33Var);
        return Log.isLoggable(c33Var.O(), 3);
    }

    public void b(String str, Bundle bundle) {
        String string;
        y53 y53Var = this.a;
        t53 t53Var = y53Var.i;
        h43 h43Var = y53Var.e;
        y53.l(t53Var);
        t53Var.D();
        if (y53Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        y53.j(h43Var);
        h43Var.j0.k(string);
        b43 b43Var = h43Var.k0;
        y53Var.X.getClass();
        b43Var.b(System.currentTimeMillis());
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        y53 y53Var = this.a;
        y53Var.X.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        h43 h43Var = y53Var.e;
        y53.j(h43Var);
        return jCurrentTimeMillis - h43Var.k0.a() > y53Var.d.M(null, h13.i0);
    }

    public boolean d() {
        h43 h43Var = this.a.e;
        y53.j(h43Var);
        return h43Var.k0.a() > 0;
    }

    public t73(u73 u73Var, y53 y53Var) {
        this.a = y53Var;
    }
}
