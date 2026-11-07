package defpackage;

import com.fm.openinstall.listener.AppInstallListener;
import com.fm.openinstall.model.AppData;
import com.fm.openinstall.model.Error;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class he2 extends ge2 {
    public final boolean b;
    public final AppInstallListener c;
    public int d;

    public he2(qp0 qp0Var, boolean z, AppInstallListener appInstallListener) {
        super(qp0Var);
        this.b = z;
        this.c = appInstallListener;
    }

    @Override // defpackage.ge2
    public final void G() {
        boolean z = this.b;
        hc2 hc2VarL = l();
        if (z) {
            hc2VarL.c("install");
        } else {
            hc2VarL.a("install");
        }
    }

    @Override // defpackage.ge2
    public final de2 H() {
        return de2.b(((pv2) ((qp0) this.a).c).b("FM_init_data"));
    }

    @Override // defpackage.ge2
    public final int I() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        return 10;
    }

    @Override // defpackage.lo2
    public final void i(de2 de2Var) {
        Error error = de2Var.b;
        String str = de2Var.a;
        AppInstallListener appInstallListener = this.c;
        if (error != null) {
            if (g93.i) {
                g93.j("decodeInstall fail : %s", error);
            }
            if (appInstallListener != null) {
                appInstallListener.onInstallFinish(null, de2Var.b);
                return;
            }
            return;
        }
        if (g93.i) {
            g93.b("decodeInstall success : %s", str);
        }
        try {
            AppData appDataF = ge2.F(str);
            if (appInstallListener != null) {
                appInstallListener.onInstallFinish(appDataF, null);
            }
        } catch (JSONException e) {
            if (g93.i) {
                g93.j("decodeInstall error : %s", e.toString());
            }
            if (appInstallListener != null) {
                appInstallListener.onInstallFinish(null, null);
            }
        }
    }

    @Override // defpackage.lo2
    public final String m() {
        return "install";
    }
}
