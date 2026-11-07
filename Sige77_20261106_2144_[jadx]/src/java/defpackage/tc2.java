package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Message;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tc2 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public boolean b;

    public tc2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = true;
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        nf2 nf2Var;
        Thread thread;
        switch (this.a) {
            case 0:
                String action = intent.getAction();
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    if ("android.location.PROVIDERS_CHANGED".equals(action)) {
                        if (sc2.e(context, "android.permission.ACCESS_FINE_LOCATION") || sc2.e(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                            try {
                                LocationManager locationManager = (LocationManager) context.getApplicationContext().getSystemService("location");
                                if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network")) {
                                    hc hcVarG = hc.g(9999L);
                                    hcVarG.getClass();
                                    if (hc.e() && hc.f == 0 && hcVarG.d() != null) {
                                        Message message = new Message();
                                        message.what = 502;
                                        hcVarG.d().c(message, 3000L);
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                    break;
                } else if (this.b) {
                    this.b = false;
                    break;
                } else {
                    try {
                        if (bj0.d(context) && rq0.p(context)) {
                            if (hc.e != null) {
                                hc hcVar = hc.e;
                                hcVar.getClass();
                                if (hc.e() && hc.f == 0 && hcVar.d() != null) {
                                    hcVar.d().j();
                                }
                            }
                            if (hc.e() && hc.f == 0) {
                                for (nc2 nc2Var : (ArrayDeque) hd2.a().b) {
                                    if ((nc2Var instanceof nf2) && (thread = (nf2Var = (nf2) nc2Var).b) != null && !thread.isInterrupted()) {
                                        nf2Var.b.interrupt();
                                    }
                                }
                            }
                            break;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                break;
            default:
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (this.b) {
                        this.b = false;
                    } else {
                        try {
                            if (am2.r(context)) {
                                xe2.a(context).i();
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                break;
        }
    }
}
