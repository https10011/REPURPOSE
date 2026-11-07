package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class fh3 {
    public static final dh3 a;

    static {
        dh3 dh3Var;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new dh3[0]).iterator();
                if (it.hasNext()) {
                    dh3Var = (dh3) it.next();
                    yv2.o("Expected at most one FlagsService", !it.hasNext());
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    dh3Var = new dh3();
                }
                a = dh3Var;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
