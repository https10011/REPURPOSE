package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pd3 {
    public long a;
    public long b;
    public final jd3 c;
    public final /* synthetic */ td3 d;

    public pd3(td3 td3Var) {
        this.d = td3Var;
        y53 y53Var = (y53) td3Var.a;
        this.c = new jd3(this, y53Var, 0);
        y53Var.X.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    public final boolean a(boolean z, boolean z2, long j) {
        td3 td3Var = this.d;
        td3Var.D();
        td3Var.F();
        y53 y53Var = (y53) td3Var.a;
        boolean zA = y53Var.a();
        c33 c33Var = y53Var.f;
        if (zA) {
            h43 h43Var = y53Var.e;
            y53.j(h43Var);
            b43 b43Var = h43Var.c0;
            y53Var.X.getClass();
            b43Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            y53.l(c33Var);
            c33Var.a0.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        y53.l(c33Var);
        c33Var.a0.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !y53Var.d.T();
        ua3 ua3Var = y53Var.Y;
        y53.k(ua3Var);
        qf3.A0(ua3Var.I(z3), bundle, true);
        if (!z2) {
            w93 w93Var = y53Var.Z;
            y53.k(w93Var);
            w93Var.L("auto", "_e", bundle);
        }
        this.a = j;
        jd3 jd3Var = this.c;
        jd3Var.c();
        jd3Var.b(((Long) h13.p0.a(null)).longValue());
        return true;
    }
}
