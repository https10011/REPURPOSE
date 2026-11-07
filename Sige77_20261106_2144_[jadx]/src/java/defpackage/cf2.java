package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cf2 implements LocationListener {
    public final /* synthetic */ ff2 a;

    public cf2(ff2 ff2Var) {
        this.a = ff2Var;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        ff2 ff2Var = this.a;
        Handler handler = (Handler) ff2Var.b;
        if (handler != null) {
            handler.removeCallbacks(ff2Var.m);
        }
        try {
            ff2Var.x(location);
            LocationManager locationManager = (LocationManager) ((Context) ff2Var.a).getApplicationContext().getSystemService("location");
            if (locationManager != null) {
                locationManager.removeUpdates(ff2Var.n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
