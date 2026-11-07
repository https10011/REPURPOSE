package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lv extends nv {
    public final /* synthetic */ Context b;

    public lv(Context context) {
        this.b = context;
    }

    @Override // defpackage.nv
    public final void a(ComponentName componentName, yd2 yd2Var) {
        try {
            ((vm0) ((xm0) yd2Var.b)).e();
        } catch (RemoteException unused) {
        }
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
