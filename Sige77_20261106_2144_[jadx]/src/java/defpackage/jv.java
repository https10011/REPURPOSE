package defpackage;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jv extends nv {
    public static yd2 b;
    public static ac2 c;
    public static final ReentrantLock d = new ReentrantLock();

    @Override // defpackage.nv
    public final void a(ComponentName componentName, yd2 yd2Var) {
        componentName.getClass();
        try {
            ((vm0) ((xm0) yd2Var.b)).e();
        } catch (RemoteException unused) {
        }
        b = yd2Var;
        aj0.B();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
