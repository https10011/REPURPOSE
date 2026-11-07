package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class vm3 {
    public static final AtomicReference a;
    public static final j10 b;
    public static final WeakHashMap c;
    public static final xv1 d;

    static {
        wo0.i(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(mh1.W);
        b = new j10(22);
        c = new WeakHashMap();
        d = new xv1(9);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static bo3 a() {
        zn3 zn3VarC = c();
        bo3 bo3Var = zn3VarC.b;
        if (bo3Var != null && bo3Var != kn3.i) {
            return bo3Var;
        }
        nc0 nc0Var = fn3.i;
        UUID uuidB = wm3.c.b();
        String strA = gm3.a(uuidB);
        wo0 wo0Var = (wo0) a.get();
        if (!wo0Var.isEmpty()) {
            wo0Var.forEach(new cn3(0));
        }
        return new fn3(uuidB, strA, fn3.i, zn3VarC);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    public static bo3 b(zn3 zn3Var, bo3 bo3Var) {
        boolean zEquals;
        zn3Var.getClass();
        bo3 bo3Var2 = zn3Var.b;
        if (bo3Var2 != bo3Var) {
            if (bo3Var2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    fh3.a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) gh3.a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                zn3Var.a = zEquals;
            }
            if (zn3Var.a) {
                if (bo3Var2 != null) {
                    if (bo3Var != null) {
                        if (((gm3) bo3Var2).a == bo3Var && !ye1.G(bo3Var2)) {
                            Trace.endSection();
                        } else if (bo3Var2 == ((gm3) bo3Var).a && !ye1.G(bo3Var)) {
                            ye1.H(bo3Var);
                        }
                    }
                    ye1.F(bo3Var2);
                    if (bo3Var != null) {
                        ye1.E(bo3Var);
                    }
                } else if (bo3Var != null) {
                    ye1.E(bo3Var);
                }
            }
            if (bo3Var2 != bo3Var) {
                zn3Var.b = bo3Var;
                return bo3Var2;
            }
        }
        return bo3Var;
    }

    public static zn3 c() {
        return (zn3) d.get();
    }
}
