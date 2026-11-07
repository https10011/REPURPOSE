package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bf2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff2 b;

    public /* synthetic */ bf2(ff2 ff2Var, int i) {
        this.a = i;
        this.b = ff2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ff2 ff2Var = this.b;
        switch (i) {
            case 0:
                ff2Var.h = bj0.d((Context) ff2Var.a);
                ((Handler) ff2Var.b).postDelayed(this, 3600000L);
                break;
            default:
                try {
                    ff2Var.x(null);
                    LocationManager locationManager = (LocationManager) ((Context) ff2Var.a).getApplicationContext().getSystemService("location");
                    if (locationManager != null) {
                        locationManager.removeUpdates(ff2Var.n);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
