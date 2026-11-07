package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sj2 extends lo2 {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong i;
    public static final ConcurrentLinkedQueue v;
    public volatile lo2 b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        i = new AtomicLong();
        v = new ConcurrentLinkedQueue();
    }

    public static void F() {
        while (true) {
            rj2 rj2Var = (rj2) v.poll();
            if (rj2Var == null) {
                return;
            }
            i.getAndDecrement();
            sj2 sj2Var = rj2Var.a;
            qp3 qp3Var = rj2Var.b;
            bq3 bq3Var = qp3Var.c;
            if ((bq3Var != null && Boolean.TRUE.equals(bq3Var.Q(aq3.g))) || sj2Var.w(qp3Var.a)) {
                sj2Var.y(qp3Var);
            }
        }
    }

    @Override // defpackage.lo2
    public final void A(RuntimeException runtimeException, qp3 qp3Var) {
        if (this.b != null) {
            this.b.A(runtimeException, qp3Var);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.lo2
    public final boolean w(Level level) {
        return this.b == null || this.b.w(level);
    }

    @Override // defpackage.lo2
    public final void y(qp3 qp3Var) {
        if (this.b != null) {
            this.b.y(qp3Var);
            return;
        }
        if (i.incrementAndGet() > 20) {
            v.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        v.offer(new rj2(this, qp3Var));
        if (this.b != null) {
            F();
        }
    }
}
