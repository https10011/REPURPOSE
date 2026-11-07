package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n13 b;
    public final /* synthetic */ gc3 c;

    public /* synthetic */ wb3(gc3 gc3Var, n13 n13Var, int i) {
        this.a = i;
        this.b = n13Var;
        this.c = gc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc3 gc3Var = this.c;
                synchronized (gc3Var) {
                    try {
                        gc3Var.a = false;
                        lc3 lc3Var = gc3Var.c;
                        if (!lc3Var.V()) {
                            c33 c33Var = ((y53) lc3Var.a).f;
                            y53.l(c33Var);
                            c33Var.a0.a("Connected to service");
                            n13 n13Var = this.b;
                            lc3Var.D();
                            lc3Var.d = n13Var;
                            lc3Var.R();
                            lc3Var.T();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                gc3 gc3Var2 = this.c;
                synchronized (gc3Var2) {
                    try {
                        gc3Var2.a = false;
                        lc3 lc3Var2 = gc3Var2.c;
                        if (!lc3Var2.V()) {
                            c33 c33Var2 = ((y53) lc3Var2.a).f;
                            y53.l(c33Var2);
                            c33Var2.Z.a("Connected to remote service");
                            n13 n13Var2 = this.b;
                            lc3Var2.D();
                            lc3Var2.d = n13Var2;
                            lc3Var2.R();
                            lc3Var2.T();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                lc3 lc3Var3 = this.c.c;
                ScheduledExecutorService scheduledExecutorService = lc3Var3.i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    lc3Var3.i = null;
                    return;
                }
                return;
        }
    }
}
