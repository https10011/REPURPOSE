package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lg3 extends BroadcastReceiver {
    public static volatile u93 b;
    public final /* synthetic */ int a;

    public /* synthetic */ lg3(int i) {
        this.a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                if (stringExtra != null) {
                    if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                        StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
                        sb.append("Got an invalid config package for P/H that includes '..': ");
                        sb.append(stringExtra);
                        sb.append(". Exiting.");
                        Log.w("PhUpdateBroadcastRecv", sb.toString());
                    } else {
                        u93 u93Var = b;
                        if (u93Var != null) {
                            je3 je3Var = (je3) ((ConcurrentHashMap) ((m83) u93Var.b).a).get(stringExtra);
                            if (je3Var != null) {
                                je3Var.a.b();
                            }
                        } else {
                            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                        }
                    }
                    break;
                }
                break;
            default:
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    try {
                        ka2 ka2Var = kv.i;
                        if (ka2Var != null) {
                            ka2Var.c();
                            ka2Var.a();
                        }
                    } catch (Exception e) {
                        j42.a.b(Log.getStackTraceString(e));
                    }
                }
                break;
        }
    }
}
