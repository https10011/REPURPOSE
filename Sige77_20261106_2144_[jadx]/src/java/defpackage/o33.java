package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o33 extends ne3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o33(if3 if3Var, int i) {
        super(if3Var);
        this.d = i;
    }

    @Override // defpackage.ne3
    public final void H() {
        int i = this.d;
    }

    public boolean I() {
        F();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((y53) this.a).a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void L(String str, pe3 pe3Var, w53 w53Var, h33 h33Var) {
        String str2;
        String str3 = pe3Var.a;
        y53 y53Var = (y53) this.a;
        D();
        F();
        try {
            URL url = new URI(str3).toURL();
            this.b.j0();
            byte[] bArrA = w53Var.a();
            t53 t53Var = y53Var.i;
            y53.l(t53Var);
            Map map = pe3Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                t53Var.Q(new m33(this, str2, url, bArrA, map, h33Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.f.c(c33.M(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    private final void J() {
    }

    private final void K() {
    }
}
