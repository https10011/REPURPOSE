package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j6 implements i6 {
    public static volatile j6 b;
    public final AppMeasurementSdk a;

    public j6(AppMeasurementSdk appMeasurementSdk) {
        gu2.o(appMeasurementSdk);
        this.a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        if (ew2.b.contains("fcm") || ew2.a.contains(str)) {
            return;
        }
        gh1 gh1Var = ew2.c;
        int i = gh1Var.d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) gh1Var.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str)) {
            if (ew2.b.contains("fcm")) {
                return;
            }
            gh1 gh1Var2 = ew2.c;
            int i4 = gh1Var2.d;
            while (i2 < i4) {
                boolean zContainsKey2 = bundle.containsKey((String) gh1Var2.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            bundle.putString("_cis", "fcm_integration");
        }
        this.a.logEvent("fcm", str, bundle);
    }
}
