package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bc2 {
    public static volatile bc2 f;
    public gd2 a;
    public String b;
    public boolean c;
    public long d;
    public volatile boolean e;

    public static bc2 c() {
        if (f == null) {
            synchronized (bc2.class) {
                try {
                    if (f == null) {
                        bc2 bc2Var = new bc2();
                        bc2Var.d = -1L;
                        f = bc2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void a(dz1 dz1Var) {
        if (!this.c) {
            if (TextUtils.isEmpty(this.b)) {
                return;
            }
            dz1Var.h = this.b;
        } else {
            gd2 gd2Var = this.a;
            long j = (dz1Var.g - gd2Var.b) + gd2Var.a;
            if (j < 1633017600000L) {
                j = dz1Var.f;
            }
            dz1Var.f = j;
        }
    }

    public final boolean b(long j) {
        this.e = false;
        this.d = -1L;
        if (j > 1633017600000L) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a = new gd2(this.b, j, SystemClock.elapsedRealtime());
            if (Math.abs(jCurrentTimeMillis - j) > 600000) {
                this.c = true;
            }
            try {
                if (!TextUtils.isEmpty(this.b)) {
                    dc2 dc2VarA = dc2.a(hc.h);
                    gd2 gd2Var = this.a;
                    gd2Var.getClass();
                    dc2VarA.l("base_time", new JSONObject().put("serverTime", gd2Var.a).put("elapsedRealtime", gd2Var.b).put("bootId", gd2Var.c).toString());
                }
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
            }
        } else {
            this.a = new gd2(this.b, System.currentTimeMillis(), SystemClock.elapsedRealtime());
            this.c = false;
        }
        return this.c;
    }
}
