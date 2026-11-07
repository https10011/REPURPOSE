package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class py implements ar {
    public final Context a;
    public final hi1 b;

    public py(Context context, hi1 hi1Var) {
        this.a = context.getApplicationContext();
        this.b = hi1Var;
    }

    @Override // defpackage.uw0
    public final void b() {
        ir1 ir1VarD = ir1.d(this.a);
        hi1 hi1Var = this.b;
        synchronized (ir1VarD) {
            ((HashSet) ir1VarD.d).remove(hi1Var);
            if (ir1VarD.b && ((HashSet) ir1VarD.d).isEmpty()) {
                hc hcVar = (hc) ir1VarD.c;
                ((ConnectivityManager) ((bk0) hcVar.c).get()).unregisterNetworkCallback((hr1) hcVar.d);
                ir1VarD.b = false;
            }
        }
    }

    @Override // defpackage.uw0
    public final void j() {
        ir1 ir1VarD = ir1.d(this.a);
        hi1 hi1Var = this.b;
        synchronized (ir1VarD) {
            ((HashSet) ir1VarD.d).add(hi1Var);
            ir1VarD.e();
        }
    }

    @Override // defpackage.uw0
    public final void k() {
    }
}
