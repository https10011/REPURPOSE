package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mb2 extends fg2 {
    public final /* synthetic */ IBinder i;
    public final /* synthetic */ wb2 v;

    public mb2(wb2 wb2Var, IBinder iBinder) {
        this.v = wb2Var;
        this.i = iBinder;
    }

    @Override // defpackage.fg2
    public final void b() {
        yb2 yb2Var = (yb2) this.v.b;
        yb2Var.n = (IInterface) yb2Var.i.a(this.i);
        eg2 eg2Var = yb2Var.b;
        int i = 0;
        eg2Var.b("linkToDeath", new Object[0]);
        try {
            yb2Var.n.asBinder().linkToDeath(yb2Var.k, 0);
        } catch (RemoteException e) {
            eg2Var.a(e, "linkToDeath failed", new Object[0]);
        }
        yb2Var.g = false;
        ArrayList arrayList = yb2Var.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        yb2Var.d.clear();
    }
}
