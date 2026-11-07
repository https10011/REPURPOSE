package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g8 extends h8 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ k8 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(k8 k8Var, Context context) {
        super(k8Var);
        this.d = k8Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.h8
    public final IntentFilter i() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.h8
    public final int k() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return b8.a((PowerManager) obj) ? 2 : 1;
            default:
                p11 p11Var = (p11) obj;
                su1 su1Var = (su1) p11Var.d;
                LocationManager locationManager = (LocationManager) p11Var.c;
                if (su1Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) p11Var.b;
                    Location lastKnownLocation2 = null;
                    if (gb2.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (gb2.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (j02.d == null) {
                            j02.d = new j02();
                        }
                        j02 j02Var = j02.d;
                        j02Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        j02Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = j02Var.c == 1;
                        long j2 = j02Var.b;
                        long j3 = j02Var.a;
                        j02Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = j02Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        su1Var.a = z;
                        su1Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = su1Var.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.h8
    public final void n() {
        int i = this.c;
        k8 k8Var = this.d;
        switch (i) {
            case 0:
                k8Var.o(true, true);
                break;
            default:
                k8Var.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(k8 k8Var, p11 p11Var) {
        super(k8Var);
        this.d = k8Var;
        this.e = p11Var;
    }
}
