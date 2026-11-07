package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class ve3 implements vg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vg0
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((hf3) this.b).c)), (Throwable) obj);
                return null;
            case 1:
                cd3 cd3Var = (cd3) obj;
                pl3 pl3Var = uf3.a;
                String str = (String) this.b;
                tc3 tc3Var = (tc3) cd3Var.t(str, uc3.u()).k();
                if (!Collections.unmodifiableList(((uc3) tc3Var.b).t()).contains(BuildConfig.FLAVOR)) {
                    tc3Var.d();
                    ((uc3) tc3Var.b).v(BuildConfig.FLAVOR);
                }
                zc3 zc3Var = (zc3) cd3Var.k();
                tc3Var.d();
                ((uc3) tc3Var.b).w(BuildConfig.FLAVOR);
                uc3 uc3Var = (uc3) tc3Var.g();
                zc3Var.d();
                ((cd3) zc3Var.b).v().put(str, uc3Var);
                return (cd3) zc3Var.g();
            default:
                ch3 ch3Var = (ch3) this.b;
                rc3 rc3Var = (rc3) obj;
                dc2 dc2Var = new dc2();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (ch3.j) {
                            nh3 nh3Var = (nh3) ch3Var.d.get();
                            Uri uri = ch3Var.g;
                            hd2 hd2Var = new hd2(rc3Var.t());
                            hd2Var.c = new dc2[]{dc2Var};
                            nh3Var.a(uri, hd2Var);
                            ch3Var.h = rc3Var.t();
                            break;
                        }
                        synchronized (ch3.k) {
                            nh3 nh3Var2 = (nh3) ch3Var.d.get();
                            Uri uri2 = ch3Var.i;
                            hd2 hd2Var2 = new hd2(rc3Var.u());
                            hd2Var2.c = new dc2[]{dc2Var};
                            nh3Var2.a(uri2, hd2Var2);
                            rc3Var.u();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
