package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class v73 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w93 b;

    public /* synthetic */ v73(w93 w93Var, int i) {
        this.a = i;
        this.b = w93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w93 w93Var = this.b;
        switch (i) {
            case 0:
                w93Var.b0();
                break;
            case 1:
                t73 t73Var = w93Var.d0;
                y53 y53Var = t73Var.a;
                t53 t53Var = y53Var.i;
                w93 w93Var2 = y53Var.Z;
                h43 h43Var = y53Var.e;
                y53.l(t53Var);
                t53Var.D();
                if (t73Var.d()) {
                    if (t73Var.c()) {
                        y53.j(h43Var);
                        h43Var.j0.k(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        y53.k(w93Var2);
                        w93Var2.L("auto", "_cmpx", bundle);
                    } else {
                        y53.j(h43Var);
                        hc hcVar = h43Var.j0;
                        String strJ = hcVar.j();
                        if (TextUtils.isEmpty(strJ)) {
                            c33 c33Var = y53Var.f;
                            y53.l(c33Var);
                            c33Var.i.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jA = h43Var.k0.a() / 3600000;
                            Uri uri = Uri.parse(strJ);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            y53.k(w93Var2);
                            w93Var2.L(str2, "_cmp", (Bundle) pair.second);
                        }
                        hcVar.k(null);
                    }
                    y53.j(h43Var);
                    h43Var.k0.b(0L);
                    break;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                w93Var.D();
                y53 y53Var2 = (y53) w93Var.a;
                h43 h43Var2 = y53Var2.e;
                c33 c33Var2 = y53Var2.f;
                y53.j(h43Var2);
                v33 v33Var = h43Var2.g0;
                if (v33Var.a()) {
                    y53.l(c33Var2);
                    c33Var2.Z.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    b43 b43Var = h43Var2.h0;
                    long jA2 = b43Var.a();
                    b43Var.b(1 + jA2);
                    if (jA2 >= 5) {
                        y53.l(c33Var2);
                        c33Var2.w.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        v33Var.b(true);
                    } else {
                        if (w93Var.f0 == null) {
                            w93Var.f0 = new x73(w93Var, y53Var2, 3);
                        }
                        w93Var.f0.b(0L);
                    }
                }
                break;
            default:
                w93Var.b0();
                break;
        }
    }
}
