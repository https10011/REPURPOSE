package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ik3 implements ac {
    public Object a;

    public /* synthetic */ ik3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        ListenableFuture listenableFutureA;
        rk3 rk3Var = (rk3) this.a;
        wo1 wo1Var = rk3Var.d;
        try {
            return dh0.d(rk3Var.b((Uri) dh0.b(rk3Var.b)));
        } catch (IOException e) {
            sc1 sc1Var = rk3Var.f;
            sc1Var.getClass();
            if ((e instanceof yh3) || (e.getCause() instanceof yh3)) {
                return dh0.c(e);
            }
            pl3 pl3Var = (pl3) sc1Var.a;
            pl3Var.getClass();
            if (e.getCause() instanceof xm2) {
                un0 un0VarD = dh0.d(pl3Var.a);
                fk3 fk3Var = new fk3(rk3Var, 2);
                int i = to3.a;
                listenableFutureA = dh0.a(dh0.g(un0VarD, new bg3(4, vm3.a(), fk3Var), wo1Var), IOException.class, new me3(e, 5), t10.a);
            } else {
                listenableFutureA = dh0.c(e);
            }
            fk3 fk3Var2 = new fk3(rk3Var, 1);
            int i2 = to3.a;
            return dh0.g(listenableFutureA, new bg3(4, vm3.a(), fk3Var2), wo1Var);
        }
    }
}
