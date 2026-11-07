package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ch3 {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final cv1 b;
    public final cv1 c;
    public final cv1 d;
    public final cv1 e;
    public final cv1 f;
    public final Uri g;
    public volatile ic3 h;
    public final Uri i;

    public ch3(Context context, cv1 cv1Var, cv1 cv1Var2, cv1 cv1Var3) {
        this.a = context;
        this.c = cv1Var;
        this.b = cv1Var3;
        this.d = cv1Var2;
        Pattern pattern = sh3.a;
        qp0 qp0Var = new qp0(context);
        qp0Var.v("phenotype_storage_info");
        qp0Var.y("storage-info.pb");
        this.g = qp0Var.z();
        qp0 qp0Var2 = new qp0(context);
        qp0Var2.v("phenotype_storage_info");
        qp0Var2.y("device-encrypted-storage-info.pb");
        Set set = sh3.d;
        sp0.M(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        qp0Var2.b = "directboot-files";
        this.i = qp0Var2.z();
        this.e = ia.j(new bf3(this));
        this.f = ia.j(new u93(cv1Var, 2));
    }

    public final void a() {
        if (!g93.S(this.a) || c().x() + 86400000 >= System.currentTimeMillis()) {
            un0 un0Var = un0.b;
            return;
        }
        q51 q51Var = (q51) this.c.get();
        q51Var.getClass();
        ListenableFuture listenableFutureE = dh0.e((ListenableFuture) this.f.get());
        int i = wd0.v;
        dh0.g(listenableFutureE instanceof wd0 ? (wd0) listenableFutureE : new jf0(listenableFutureE), new me3(this, 2), q51Var);
    }

    public final og3 b() {
        ic3 ic3VarC = c();
        return new og3(ic3VarC.v(), ro0.k(ic3VarC.A()), ic3VarC.u(), ic3VarC.w(), (ic3VarC.B() && ic3VarC.C().u() == ((long) Build.VERSION.SDK_INT)) ? ic3VarC.C().t() : BuildConfig.FLAVOR, ro0.k(ic3VarC.y()), ro0.k(ic3VarC.z()), ic3VarC.t(), ic3VarC.E(), ic3VarC.D(), ic3VarC.F());
    }

    public final ic3 c() {
        ic3 ic3VarH;
        ic3 ic3Var = this.h;
        if (ic3Var != null) {
            return ic3Var;
        }
        synchronized (j) {
            ic3VarH = this.h;
            if (ic3VarH == null) {
                ic3VarH = ic3.H();
                if (g93.S(this.a)) {
                    rn2 rn2Var = (rn2) ic3VarH.s(7);
                    vl2 vl2Var = vl2.b;
                    int i = yk2.a;
                    vl2 vl2Var2 = vl2.c;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamH = rq0.H(((nh3) this.d.get()).b(this.g));
                        try {
                            dm2 dm2VarA = ((cm2) rn2Var).a(inputStreamH, vl2Var2);
                            if (inputStreamH != null) {
                                inputStreamH.close();
                            }
                            ic3 ic3Var2 = (ic3) dm2VarA;
                            StrictMode.setThreadPolicy(threadPolicy);
                            ic3VarH = ic3Var2;
                        } catch (Throwable th) {
                            if (inputStreamH != null) {
                                try {
                                    inputStreamH.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                    this.h = ic3VarH;
                }
            }
        }
        return ic3VarH;
    }
}
