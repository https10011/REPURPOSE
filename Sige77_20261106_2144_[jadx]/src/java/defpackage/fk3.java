package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class fk3 implements bc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk3 b;

    public /* synthetic */ fk3(rk3 rk3Var, int i) {
        this.a = i;
        this.b = rk3Var;
    }

    @Override // defpackage.bc
    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        int i = this.a;
        rk3 rk3Var = this.b;
        switch (i) {
            case 0:
                synchronized (rk3Var.h) {
                    listenableFuture = rk3Var.j;
                    break;
                }
                return listenableFuture;
            case 1:
                return dh0.d(rk3Var.b((Uri) dh0.b(rk3Var.b)));
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                rk3Var.c((Uri) dh0.b(rk3Var.b), obj);
                return un0.b;
            default:
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    nh3 nh3Var = rk3Var.e;
                    ep1 ep1VarB = nh3Var.b(uriBuild);
                    if (((xi3) ep1VarB.b).b((Uri) ep1VarB.e)) {
                        ep1 ep1VarB2 = nh3Var.b(uriBuild);
                        ep1 ep1VarB3 = nh3Var.b(uri);
                        xi3 xi3Var = (xi3) ep1VarB2.b;
                        if (xi3Var != ((xi3) ep1VarB3.b)) {
                            throw new tn("Cannot rename file across backends");
                        }
                        xi3Var.e((Uri) ep1VarB2.e, (Uri) ep1VarB3.e);
                    }
                    return un0.b;
                } catch (IOException e) {
                    return dh0.c(e);
                }
        }
    }
}
