package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l32 implements Runnable {
    public final /* synthetic */ ue2 a;
    public final /* synthetic */ ge b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ l32(ue2 ue2Var, ge geVar, int i, Runnable runnable) {
        this.a = ue2Var;
        this.b = geVar;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ge geVar = this.b;
        final int i = this.c;
        Runnable runnable = this.d;
        final ue2 ue2Var = this.a;
        bl1 bl1Var = (bl1) ue2Var.f;
        try {
            bl1 bl1Var2 = (bl1) ue2Var.c;
            Objects.requireNonNull(bl1Var2);
            bl1Var.l(new m32(bl1Var2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ue2Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                bl1Var.l(new tv1() { // from class: n32
                    @Override // defpackage.tv1
                    public final Object a() {
                        ((ac2) ue2Var.d).N(geVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                ue2Var.b(geVar, i);
            }
        } catch (sv1 unused) {
            ((ac2) ue2Var.d).N(geVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
