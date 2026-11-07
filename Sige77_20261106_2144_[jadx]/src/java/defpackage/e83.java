package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e83 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w93 c;

    public e83(w93 w93Var, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = w93Var;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        w93 w93Var = this.c;
        switch (i) {
            case 0:
                y53 y53Var = (y53) w93Var.a;
                h43 h43Var = y53Var.e;
                y53.j(h43Var);
                h43Var.X.b(j);
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.Z.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                w93Var.D();
                w93Var.F();
                y53 y53Var2 = (y53) w93Var.a;
                c33 c33Var2 = y53Var2.f;
                y53.l(c33Var2);
                c33Var2.Z.a("Resetting analytics data (FE)");
                td3 td3Var = y53Var2.v;
                y53.k(td3Var);
                td3Var.D();
                pd3 pd3Var = td3Var.f;
                pd3Var.c.c();
                ((y53) pd3Var.d.a).X.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                pd3Var.a = jElapsedRealtime;
                pd3Var.b = jElapsedRealtime;
                y53Var2.q().J();
                boolean z = !y53Var2.a();
                h43 h43Var2 = y53Var2.e;
                y53.j(h43Var2);
                h43Var2.f.b(j);
                y53 y53Var3 = (y53) h43Var2.a;
                h43 h43Var3 = y53Var3.e;
                y53.j(h43Var3);
                if (!TextUtils.isEmpty(h43Var3.i0.j())) {
                    h43Var2.i0.k(null);
                }
                h43Var2.c0.b(0L);
                h43Var2.d0.b(0L);
                if (!y53Var3.d.S()) {
                    h43Var2.M(z);
                }
                h43Var2.j0.k(null);
                h43Var2.k0.b(0L);
                h43Var2.l0.x(null);
                lc3 lc3VarO = y53Var2.o();
                lc3VarO.D();
                lc3VarO.F();
                zzr zzrVarU = lc3VarO.U(false);
                lc3VarO.Q();
                ((y53) lc3VarO.a).n().I();
                lc3VarO.S(new gb3(lc3VarO, zzrVarU, 0));
                y53.k(td3Var);
                td3Var.e.y();
                w93Var.e0 = z;
                y53Var2.o().I(new AtomicReference());
                break;
        }
    }
}
