package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tj3 {
    public final String a;
    public final r1 b;
    public final rk3 c;
    public final md2 d;
    public final qp0 e;
    public final qp0 f = new qp0(new md2(this));
    public final Object g;
    public final r41 h;
    public List i;

    public tj3(rk3 rk3Var, r1 r1Var) {
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = rk3Var;
        this.b = r1Var;
        this.a = rk3Var.a;
        this.e = new qp0(new k93(rk3Var));
        this.d = new md2(3);
        this.h = new r41(23);
        me3 me3Var = new me3(this, 4);
        synchronized (obj) {
            this.i.add(me3Var);
        }
    }

    public final s1 a(ve3 ve3Var, q51 q51Var) {
        int i = 3;
        me3 me3Var = new me3(ve3Var, i);
        int i2 = to3.a;
        bg3 bg3Var = new bg3(4, vm3.a(), me3Var);
        bj0 bj0Var = bp3.a;
        yv2.l(bj0Var, "ticker");
        bj0Var.q();
        String strConcat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        mn3 mn3VarS = r41.s(strConcat);
        try {
            ListenableFuture listenableFutureN = this.f.n();
            md2 md2Var = this.d;
            u93 u93Var = new u93(listenableFutureN, i);
            t10 t10Var = t10.a;
            md2Var.j(u93Var, t10Var);
            ListenableFuture listenableFutureJ = md2Var.j(to3.a(new ep1(18, this, listenableFutureN, bg3Var, q51Var)), t10Var);
            dh0.propagateCancellation(listenableFutureJ, listenableFutureN);
            dh0.e(this.b);
            s1 s1VarF = dh0.f(listenableFutureJ, new zg0(), t10Var);
            mn3VarS.a(s1VarF);
            mn3VarS.close();
            return s1VarF;
        } catch (Throwable th) {
            try {
                mn3VarS.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
