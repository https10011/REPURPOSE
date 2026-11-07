package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jr0 extends pj0 {
    public static final yd2 l = new yd2("IdentityCredentials.API", new hr0(0), new c11(3));
    public static final yd2 m = new yd2("ClientNotification.API", new hr0(3), new c11(3));
    public static final yd2 n = new yd2("ClientTelemetry.API", new hr0(4), new c11(3));
    public static int o = 1;

    public Task c(TelemetryData telemetryData) {
        ei eiVarB = ei.b();
        eiVarB.e = new Feature[]{zi0.c};
        eiVarB.c = false;
        eiVarB.d = new pv2(telemetryData);
        return b(2, eiVarB.a());
    }

    public synchronized int d() {
        int i;
        try {
            i = o;
            if (i == 1) {
                Context context = this.a;
                qj0 qj0Var = qj0.e;
                int iC = qj0Var.c(context, 12451000);
                if (iC == 0) {
                    i = 4;
                    o = 4;
                } else if (qj0Var.a(iC, context, null) != null || h40.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    o = 2;
                } else {
                    i = 3;
                    o = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
