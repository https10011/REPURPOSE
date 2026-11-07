package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oa3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public oa3(ua3 ua3Var, ja3 ja3Var, long j) {
        this.c = ja3Var;
        this.b = j;
        Objects.requireNonNull(ua3Var);
        this.d = ua3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ua3 ua3Var = (ua3) obj;
                ua3Var.N((ja3) obj2, false, j);
                ua3Var.e = null;
                lc3 lc3VarO = ((y53) ua3Var.a).o();
                lc3VarO.D();
                lc3VarO.F();
                lc3VarO.S(new z83(lc3VarO, null));
                break;
            default:
                ((aj2) obj2).run();
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                h02 h02Var = new h02(Executors.callable(this, null));
                o51 o51Var = new o51(h02Var, q51Var.b.schedule(h02Var, j, TimeUnit.MINUTES));
                o51Var.a(new aj2(o51Var, 9), t10.a);
                break;
        }
    }

    public oa3(ig3 ig3Var, aj2 aj2Var, q51 q51Var, long j) {
        this.c = aj2Var;
        this.d = q51Var;
        this.b = j;
    }
}
