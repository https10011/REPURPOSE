package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ig3 implements mg3 {
    public static boolean d;
    public final cv1 a;
    public final int b;
    public final k42 c;

    public ig3(cv1 cv1Var) {
        k42 k42Var = k42.Y;
        this.a = cv1Var;
        this.b = Math.max(5, 10);
        this.c = k42Var;
    }

    @Override // defpackage.mg3
    public final void zza() {
        synchronized (ig3.class) {
            try {
                if (!d) {
                    aj2 aj2Var = new aj2(this, 11);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    q51 q51Var = (q51) this.a.get();
                    oa3 oa3Var = new oa3(this, aj2Var, q51Var, j);
                    q51Var.getClass();
                    h02 h02Var = new h02(Executors.callable(oa3Var, null));
                    o51 o51Var = new o51(h02Var, q51Var.b.schedule(h02Var, j, timeUnit));
                    o51Var.a(new aj2(o51Var, 9), t10.a);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
