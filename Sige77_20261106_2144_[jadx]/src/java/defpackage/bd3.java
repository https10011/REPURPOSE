package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ td3 c;

    public bd3(td3 td3Var, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                Objects.requireNonNull(td3Var);
                this.c = td3Var;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(td3Var);
                this.c = td3Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        td3 td3Var = this.c;
        switch (i) {
            case 0:
                pd3 pd3Var = td3Var.f;
                td3Var.D();
                td3Var.I();
                y53 y53Var = (y53) td3Var.a;
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                z23 z23Var = c33Var.a0;
                long j = this.b;
                z23Var.b(Long.valueOf(j), "Activity resumed, time");
                is2 is2Var = y53Var.d;
                if (is2Var.P(null, h13.S0)) {
                    if (is2Var.T() || td3Var.d) {
                        pd3Var.d.D();
                        pd3Var.c.c();
                        pd3Var.a = j;
                        pd3Var.b = j;
                    }
                } else if (is2Var.T()) {
                    pd3Var.d.D();
                    pd3Var.c.c();
                    pd3Var.a = j;
                    pd3Var.b = j;
                } else {
                    h43 h43Var = y53Var.e;
                    y53.j(h43Var);
                    if (h43Var.f0.a()) {
                        pd3Var.d.D();
                        pd3Var.c.c();
                        pd3Var.a = j;
                        pd3Var.b = j;
                    }
                }
                md2 md2Var = td3Var.i;
                td3 td3Var2 = (td3) md2Var.b;
                td3Var2.D();
                gd3 gd3Var = (gd3) md2Var.a;
                if (gd3Var != null) {
                    td3Var2.c.removeCallbacks(gd3Var);
                }
                h43 h43Var2 = ((y53) td3Var2.a).e;
                y53.j(h43Var2);
                h43Var2.f0.b(false);
                td3Var2.D();
                td3Var2.d = false;
                ri2 ri2Var = td3Var.e;
                td3 td3Var3 = (td3) ri2Var.a;
                td3Var3.D();
                y53 y53Var2 = (y53) td3Var3.a;
                boolean zA = y53Var2.a();
                r41 r41Var = y53Var2.X;
                if (zA) {
                    r41Var.getClass();
                    ri2Var.z(System.currentTimeMillis(), y53Var2.d.P(null, h13.e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                td3Var.D();
                td3Var.I();
                y53 y53Var3 = (y53) td3Var.a;
                c33 c33Var2 = y53Var3.f;
                y53.l(c33Var2);
                z23 z23Var2 = c33Var2.a0;
                long j2 = this.b;
                z23Var2.b(Long.valueOf(j2), "Activity paused, time");
                md2 md2Var2 = td3Var.i;
                td3 td3Var4 = (td3) md2Var2.b;
                ((y53) td3Var4.a).X.getClass();
                gd3 gd3Var2 = new gd3(md2Var2, System.currentTimeMillis(), j2);
                md2Var2.a = gd3Var2;
                td3Var4.c.postDelayed(gd3Var2, 2000L);
                if (y53Var3.d.T()) {
                    td3Var.f.c.c();
                }
                break;
        }
    }
}
